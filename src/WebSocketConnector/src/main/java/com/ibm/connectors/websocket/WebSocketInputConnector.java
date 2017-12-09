/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.connectors.websocket;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import com.ibm.connectors.AbstractInputConnector;
import com.ibm.connectors.ConnectorException;

public class WebSocketInputConnector extends AbstractInputConnector implements Runnable {

	private final static String className = WebSocketInputConnector.class.getName();

	private final AtomicBoolean started = new AtomicBoolean();
	private Thread thread = null;
	private final Object waiter = new Object();

	private boolean connected = false;
	private WebSocketClient client = null;
	private Session session = null;
	private WebSocketAdapter socket = null;

	@Override
	public boolean isStarted() {
		final String methodName = "isStarted";
		getLogger().entering(className, methodName);
		boolean result = started.get();
		getLogger().exiting(className, methodName, result);
		return result;
	}

	@Override
	public void start() throws ConnectorException {
		final String methodName = "start";
		getLogger().entering(className, methodName);

		// Mark us as started.
		started.set(true);

		// Start the connection monitor thread.
		thread = new Thread(this);
		thread.start();

		getLogger().exiting(className, methodName);
	}

	@Override
	public void stop() throws ConnectorException {
		final String methodName = "stop";
		getLogger().entering(className, methodName);

		// Mark us as stopped.
		started.set(false);

		// Interrupt the connection monitor thread.
		thread.interrupt();

		// Wait for the connection monitor thread to finish.
		try {
			getLogger().fine("Waiting for connection monitor thread");
			thread.join();
			getLogger().fine("Connection monitor thread finished");
		} catch (InterruptedException e) {
			getLogger().fine("Error waiting for connection monitor thread: " + e);
		}

		// Close any remaining connections.
		disconnect();

		getLogger().exiting(className, methodName);
	}

	@Override
	public void run() {
		final String methodName = "run";
		getLogger().entering(className, methodName);

		// Run until we are marked as stopped.
		while (started.get()) {

			// Catch all exceptions.
			try {

				// If not connected, try to connect.
				if (!connected) {
					connect();
				}

				// Wait for 5 seconds before continuing, or we are interrupted.
				synchronized (waiter) {
					getLogger().fine("Waiting for 5 seconds");
					waiter.wait(5000);
					getLogger().fine("Waited for 5 seconds");
				}

			} catch (InterruptedException e) {
				getLogger().fine("Interrupted");
			} catch (Exception e) {
				getLogger().severe("Unhandled exception: " + e);
			}
		}

		getLogger().exiting(className, methodName);
	}

	private void connect() {
		final String methodName = "connect";
		getLogger().entering(className, methodName);

		// Get the URI.
		final String uriProp = getProperty("uri");
		URI uri = URI.create(uriProp);
		getLogger().fine("URI: " + uri);

		// Create and start a new WebSocket client.
		client = new WebSocketClient();
		try {
			client.start();
		} catch (Exception e) {
			getLogger().severe("Failed to start WebSocket client: " + e);
			return;
		}

		// Create a new WebSocket adapter to handle the connection.
		socket = new WebSocketAdapter() {

			@Override
			public void onWebSocketConnect(Session sess) {
				super.onWebSocketConnect(sess);
				getLogger().info("Established WebSocket connection (" + uriProp + ")");
			}

			@Override
			public void onWebSocketClose(int statusCode, String reason) {
				super.onWebSocketClose(statusCode, reason);
				getLogger().warning("WebSocket connection (" + uriProp + ") closed: " + statusCode + " " + reason);
				disconnect();
				synchronized (waiter) {
					waiter.notify();
				}
			}

			@Override
			public void onWebSocketError(Throwable cause) {
				super.onWebSocketError(cause);
				getLogger().severe("WebSocket connection (" + uriProp + ") error: " + cause);
				disconnect();
				synchronized (waiter) {
					waiter.notify();
				}
			}

			@Override
			public void onWebSocketBinary(byte[] payload, int offset, int len) {
				super.onWebSocketBinary(payload, offset, len);
				byte[] data = new byte[len];
				System.arraycopy(payload, offset, data, 0, len);
				getLogger().fine("Received binary message: " + data);
				getCallback().processInboundData(data, new Properties());
			}

			@Override
			public void onWebSocketText(String message) {
				super.onWebSocketText(message);
				getLogger().fine("Received text message: " + message);
				byte[] data = message.getBytes(StandardCharsets.UTF_8);
				getCallback().processInboundData(data, new Properties());
			}

		};

		// Attempt to connect to the specified URI.
		try {
			Future<Session> future = client.connect(socket, uri);
			session = future.get();
			connected = true;
		} catch (InterruptedException e) {
			getLogger().fine("Interrupted");
		} catch (ExecutionException | IOException e) {
			getLogger().severe("Failed to establish WebSocket connection (" + uriProp + "): " + e);
		}

		getLogger().exiting(className, methodName);
	}

	private void disconnect() {
		final String methodName = "disconnect";
		getLogger().entering(className, methodName);

		// Clean up the socket.
		if (socket != null) {
			getLogger().fine("Cleaning up socket");
			socket = null;
		}

		// Clean up the session.
		if (session != null) {
			try {
				getLogger().fine("Closing session");
				session.close();
				getLogger().fine("Closed session");
			} catch (IOException e) {
				getLogger().fine("Error closing session: " + e);
			}
			session = null;
		}

		// Clean up the client.
		if (client != null) {
			try {
				getLogger().fine("Stopping client");
				client.stop();
				getLogger().fine("Stopped client");
			} catch (Exception e) {
				getLogger().fine("Error stopping client: " + e);
			}
			client = null;
		}

		// Mark the connection as closed.
		connected = false;

		getLogger().exiting(className, methodName);
	}

}
