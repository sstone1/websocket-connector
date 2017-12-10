# websocket-connector

This repository contains a WebSocket connector for IBM Integration Bus. You can use this connector to subscribe to messages from a WebSocket server in your IBM Integration Bus message flows. A single message flow node, WebSocketInput, is provided for this purpose.

## Installation

The provided binaries have been built against and tested with IBM Integration Bus 10.0.0.11, and may not work with earlier versions.

### WebSocket connector

Download the WebSocket connector: [WebSocketConnector_1.0.0.201712101615.jar](https://github.com/sstone1/websocket-connector/releases/download/v1.0.0/WebSocketConnector_1.0.0.201712101615.jar)

Create the directory `<MQSI_WORKPATH>/connectors/WebSocket`, where `<MQSI_WORKPATH>` is `${MQSI_WORKPATH}` on Linux & MacOS, and `%MQSI_WORKPATH%` on Windows. For example, `/var/mqsi/connectors/WebSocket` or `~/iibconfig/connectors/WebSocket`.

Unzip the contents of the downloaded file into this directory, and restart all integration nodes.

### WebSocket nodes

Download the WebSocket nodes: [WebSocketNodes_1.0.0.201712101615.jar](https://github.com/sstone1/websocket-connector/releases/download/v1.0.0/WebSocketNodes_1.0.0.201712101615.jar)

Create the directory `<MQSI_BASE_FILEPATH>/tools/dropins`, where `<MQSI_BASE_FILEPATH>` is `${MQSI_BASE_FILEPATH}` on Linux & MacOS, and `%MQSI_BASE_FILEPATH%` on Windows.  For example, `/opt/iib-10.0.0.11/tools/dropins` or `~/iib-10.0.0.11/tools/dropins`.

Copy the downloaded file into this directory, and restart the integration toolkit.

## Configuration

The WebSocketInput node has the following properties. 

### Basic tab

- Server

  **Mandatory**. The URL of the WebSocket server to connect to and subscribe to messages. Must be a valid WebSocket URL, for example: `ws://localhost:3000`.
