package com.ibm.connectors.websocket;

import com.ibm.connectors.AbstractConnectorFactory;
import com.ibm.connectors.ConnectorException;
import com.ibm.connectors.InputConnector;
import com.ibm.connectors.OutputConnector;
import com.ibm.connectors.RequestConnector;

public class WebSocketConnectorFactory extends AbstractConnectorFactory {

	@Override
	public String getInfo() {
		return "WebSocket Connector";
	}

	@Override
	public InputConnector createInputConnector(String name)
			throws ConnectorException {
		return new WebSocketInputConnector();
	}

	@Override
	public OutputConnector createOutputConnector(String name)
			throws ConnectorException {
		return null;
	}

	@Override
	public RequestConnector createRequestConnector(String name)
			throws ConnectorException {
		return null;
	}

}
