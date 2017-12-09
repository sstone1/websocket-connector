package com.ibm.connector.websocket;

import com.ibm.broker.config.appdev.InputTerminal;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.NodeProperty;
import java.util.Vector;
import com.ibm.broker.config.appdev.NodePropertyRow;
import com.ibm.broker.config.appdev.NodePropertyTable;
import com.ibm.broker.config.appdev.OutputTerminal;

/*** 
 * <p>  <I>WebSocketInputNodeUDN</I> instance</p>
 * <p></p>
 */
public class WebSocketInputNodeUDN extends Node {

	private static final long serialVersionUID = 1L;

	// Node constants
	protected final static String NODE_TYPE_NAME = "com/ibm/connector/websocket/EventInputNode";
	protected final static String NODE_GRAPHIC_16 = "platform:/plugin/WebSocketNodes/icons/full/obj16/com/ibm/connector/websocket/ComIbmEventInput.gif";
	protected final static String NODE_GRAPHIC_32 = "platform:/plugin/WebSocketNodes/icons/full/obj30/com/ibm/connector/websocket/ComIbmEventInput.gif";

	protected final static String PROPERTY_CONNECTORNAME = "connectorName";
	protected final static String PROPERTY_URI = "uri";
	protected final static String PROPERTY_MESSAGEDOMAINPROPERTY = "messageDomainProperty";
	protected final static String PROPERTY_MESSAGESETPROPERTY = "messageSetProperty";
	protected final static String PROPERTY_MESSAGETYPEPROPERTY = "messageTypeProperty";
	protected final static String PROPERTY_MESSAGEFORMATPROPERTY = "messageFormatProperty";
	protected final static String PROPERTY_VALIDATETIMING = "validateTiming";
	protected final static String PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA = "parserXmlnscBuildTreeUsingXMLSchema";
	protected final static String PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN = "parserXmlnscUseForXmlnsDomain";
	protected final static String PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE = "parserXmlnscMixedContentRetainMode";
	protected final static String PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE = "parserXmlnscCommentsRetainMode";
	protected final static String PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE = "parserXmlnscProcessingInstructionsRetainMode";
	protected final static String PROPERTY_VALIDATEMASTER = "validateMaster";
	protected final static String PROPERTY_VALIDATEFAILUREACTION = "validateFailureAction";
	protected final static String PROPERTY_COMPONENTLEVEL = "componentLevel";
	protected final static String PROPERTY_ADDITIONALINSTANCES = "additionalInstances";


	/**
	 * <I>ENUM_WEBSOCKETINPUT_VALIDATEMASTER</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_VALIDATEMASTER.none = None
	 * ENUM_WEBSOCKETINPUT_VALIDATEMASTER.contentAndValue = Content and Value
	 * ENUM_WEBSOCKETINPUT_VALIDATEMASTER.content = Content
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_VALIDATEMASTER {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_VALIDATEMASTER none = new ENUM_WEBSOCKETINPUT_VALIDATEMASTER("none");
		public static final ENUM_WEBSOCKETINPUT_VALIDATEMASTER contentAndValue = new ENUM_WEBSOCKETINPUT_VALIDATEMASTER("contentAndValue");
		public static final ENUM_WEBSOCKETINPUT_VALIDATEMASTER content = new ENUM_WEBSOCKETINPUT_VALIDATEMASTER("content");

		protected ENUM_WEBSOCKETINPUT_VALIDATEMASTER(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_VALIDATEMASTER getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_VALIDATEMASTER enumConst = ENUM_WEBSOCKETINPUT_VALIDATEMASTER.none;
			if (ENUM_WEBSOCKETINPUT_VALIDATEMASTER.contentAndValue.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATEMASTER.contentAndValue;
			if (ENUM_WEBSOCKETINPUT_VALIDATEMASTER.content.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATEMASTER.content;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "contentAndValue", "content" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_COMPONENTLEVEL</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.flow = Use Pool Associated with Message Flow
	 * ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.node = Use Pool Associated with Node
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_COMPONENTLEVEL {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_COMPONENTLEVEL flow = new ENUM_WEBSOCKETINPUT_COMPONENTLEVEL("flow");
		public static final ENUM_WEBSOCKETINPUT_COMPONENTLEVEL node = new ENUM_WEBSOCKETINPUT_COMPONENTLEVEL("node");

		protected ENUM_WEBSOCKETINPUT_COMPONENTLEVEL(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_COMPONENTLEVEL getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_COMPONENTLEVEL enumConst = ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.flow;
			if (ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.node.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.node;
			return enumConst;
		}

		public static String[] values = new String[]{ "flow", "node" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.userTrace = User Trace
	 * ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.localError = Local Error Log
	 * ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exception = Exception
	 * ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exceptionList = Exception List
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION userTrace = new ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION("userTrace");
		public static final ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION localError = new ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION("localError");
		public static final ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION exception = new ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION("exception");
		public static final ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION exceptionList = new ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION("exceptionList");

		protected ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION enumConst = ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.userTrace;
			if (ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.localError.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.localError;
			if (ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exception.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exception;
			if (ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exceptionList.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.exceptionList;
			return enumConst;
		}

		public static String[] values = new String[]{ "userTrace", "localError", "exception", "exceptionList" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.none = None
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all = All
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE none = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE("none");
		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE all = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE("all");

		protected ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.none;
			if (ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.none = None
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all = All
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE none = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE("none");
		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE all = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE("all");

		protected ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.none;
			if (ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.none = None
	 * ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all = All
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE none = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE("none");
		public static final ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE all = new ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE("all");

		protected ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.none;
			if (ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_WEBSOCKETINPUT_VALIDATETIMING</I>
	 * <pre>
	 * ENUM_WEBSOCKETINPUT_VALIDATETIMING.deferred = On Demand
	 * ENUM_WEBSOCKETINPUT_VALIDATETIMING.immediate = Immediate
	 * ENUM_WEBSOCKETINPUT_VALIDATETIMING.complete = Complete
	 * </pre>
	 */
	public static class ENUM_WEBSOCKETINPUT_VALIDATETIMING {
		private String value;

		public static final ENUM_WEBSOCKETINPUT_VALIDATETIMING deferred = new ENUM_WEBSOCKETINPUT_VALIDATETIMING("deferred");
		public static final ENUM_WEBSOCKETINPUT_VALIDATETIMING immediate = new ENUM_WEBSOCKETINPUT_VALIDATETIMING("immediate");
		public static final ENUM_WEBSOCKETINPUT_VALIDATETIMING complete = new ENUM_WEBSOCKETINPUT_VALIDATETIMING("complete");

		protected ENUM_WEBSOCKETINPUT_VALIDATETIMING(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_WEBSOCKETINPUT_VALIDATETIMING getEnumFromString(String enumValue) {
			ENUM_WEBSOCKETINPUT_VALIDATETIMING enumConst = ENUM_WEBSOCKETINPUT_VALIDATETIMING.deferred;
			if (ENUM_WEBSOCKETINPUT_VALIDATETIMING.immediate.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATETIMING.immediate;
			if (ENUM_WEBSOCKETINPUT_VALIDATETIMING.complete.value.equals(enumValue)) enumConst = ENUM_WEBSOCKETINPUT_VALIDATETIMING.complete;
			return enumConst;
		}

		public static String[] values = new String[]{ "deferred", "immediate", "complete" };

	}
	protected NodeProperty[] getNodeProperties() {
		return new NodeProperty[] {
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_CONNECTORNAME,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, "WebSocket","","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_URI,		NodeProperty.Usage.MANDATORY,	true,	NodeProperty.Type.STRING, null,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageDomainPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGESETPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageSetNamePropertyEditorV8",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageTypePropertyEditorV8",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageFormatPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATETIMING,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "deferred", ENUM_WEBSOCKETINPUT_VALIDATETIMING.class,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.BOOLEAN, "false",	"com.ibm.etools.mft.ibmnodes.compilers.BooleanPropertyCompiler",	"com.ibm.etools.mft.ibmnodes.editors.BuildTreePropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.BOOLEAN, "false",	"com.ibm.etools.mft.ibmnodes.compilers.BooleanPropertyCompiler",	"com.ibm.etools.mft.ibmnodes.editors.XmlnsMessageDomainPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATEMASTER,		NodeProperty.Usage.MANDATORY,	true,	NodeProperty.Type.ENUMERATION, "none", ENUM_WEBSOCKETINPUT_VALIDATEMASTER.class,"",	"com.ibm.etools.mft.ibmnodes.editors.ValidateMasterForOpaqueParsingPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "exception", ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.class,"",	"com.ibm.etools.mft.ibmnodes.editors.ValidateMasterListenerPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_COMPONENTLEVEL,		NodeProperty.Usage.OPTIONAL,	true,	NodeProperty.Type.ENUMERATION, "flow", ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.class,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(WebSocketInputNodeUDN.PROPERTY_ADDITIONALINSTANCES,		NodeProperty.Usage.OPTIONAL,	true,	NodeProperty.Type.INTEGER, "0","",	"com.ibm.etools.mft.ibmnodes.editors.AdditionalInstancesPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes")
		};
	}

	/**
	 * <I>ParserXmlnscOpaqueElementsTable</I> instance contains <I>parserXmlnscOpaqueElementsRow</I> rows
	 * <pre>
	 * Table name = Opaque elements
	 * Row names = parserXmlnscOpaqueElementsRow
	 * </pre>
	 */
	public class ParserXmlnscOpaqueElementsTable extends NodePropertyTable {
		private static final long serialVersionUID = 1L;

		protected static final String TABLE_NAME = "parserXmlnscOpaqueElements";

		private ParserXmlnscOpaqueElementsTable() {
			this.name = TABLE_NAME;
		}
		@SuppressWarnings("unchecked")
		@Override
		public Vector<parserXmlnscOpaqueElementsRow> getRows() {
			return (Vector<parserXmlnscOpaqueElementsRow>) super.getRows();
		}

		public parserXmlnscOpaqueElementsRow createRow() {
			return new parserXmlnscOpaqueElementsRow();
		}

	/**
	 * Adds a parserXmlnscOpaqueElementsRow to the table
	 * @param row parserXmlnscOpaqueElementsRow ; the row to add to the table
	 */ 
		public void addRow(parserXmlnscOpaqueElementsRow row) {
			rows.add(row);
		}
	/**
	 * Remove a parserXmlnscOpaqueElementsRow from the table
	 * @param row parserXmlnscOpaqueElementsRow ; the row to remove from the table
	 */ 
		public void removeRow(parserXmlnscOpaqueElementsRow row) {
			rows.remove(row);
		}
	}

	/**
	 * <I>parserXmlnscOpaqueElementsRow</I> is used by <I>ParserXmlnscOpaqueElementsTable</I> instance
	 * <pre>
	 * Table name = Opaque elements
	 * Row names = parserXmlnscOpaqueElementsRow
	 * </pre>
	 */
	public class parserXmlnscOpaqueElementsRow extends NodePropertyRow {
	private static final long serialVersionUID = 1L;

	protected static final String ROW_NAME = "parserXmlnscOpaqueElementsRow";
	protected final static String PROPERTY_ELEMENTS = "elements";

		private parserXmlnscOpaqueElementsRow() {
			this.name = ROW_NAME;
			this.nodeProperties = getNodeProperties();
		}

	protected NodeProperty[] getNodeProperties() {
		return new NodeProperty[] {
			new NodeProperty(PROPERTY_ELEMENTS,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.xpath.XPathOpaqueParsingCellPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes")
		};
	}


	/**
	 * Set the <I>parserXmlnscOpaqueElementsRow</I> "<I>Elements</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Elements</I>"
	 */
	public void setElements(String value) {
		setProperty(PROPERTY_ELEMENTS, value);
	}

	/**
	 * Get the <I>parserXmlnscOpaqueElementsRow</I> "<I>Elements</I>" property
	 * 
	 * @return String; the value of the property "<I>Elements</I>"
	 */
	public String getElements() {
		return (String)getPropertyValue(PROPERTY_ELEMENTS);
	}
}
	/**
	 * Retrieve the Opaque elements table for the node <I>WebSocketInputNodeUDN</I
	 * @return ParserXmlnscOpaqueElementsTable instance which contains parserXmlnscOpaqueElementsRow rows

	 */
	public ParserXmlnscOpaqueElementsTable getParserXmlnscOpaqueElementsTable() {
		for (int i = 0; i < nodePropertyTables.size(); i++) {
			if (nodePropertyTables.get(i) instanceof ParserXmlnscOpaqueElementsTable)
				return (ParserXmlnscOpaqueElementsTable)nodePropertyTables.get(i);
			}
		return null;
	}

	public WebSocketInputNodeUDN() {
		nodePropertyTables.add(new ParserXmlnscOpaqueElementsTable());
	}

	@Override
	public InputTerminal[] getInputTerminals() {
		return null;
	}

	public final OutputTerminal OUTPUT_TERMINAL_CATCH = new OutputTerminal(this,"OutTerminal.catch");
	public final OutputTerminal OUTPUT_TERMINAL_FAILURE = new OutputTerminal(this,"OutTerminal.failure");
	public final OutputTerminal OUTPUT_TERMINAL_OUT = new OutputTerminal(this,"OutTerminal.out");
	@Override
	public OutputTerminal[] getOutputTerminals() {
		return new OutputTerminal[] {
			OUTPUT_TERMINAL_CATCH,
			OUTPUT_TERMINAL_FAILURE,
			OUTPUT_TERMINAL_OUT
		};
	}

	@Override
	public String getTypeName() {
		return NODE_TYPE_NAME;
	}

	protected String getGraphic16() {
		return NODE_GRAPHIC_16;
	}

	protected String getGraphic32() {
		return NODE_GRAPHIC_32;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>connectorName</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>connectorName</I>"
	 */
	public WebSocketInputNodeUDN setConnectorName(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_CONNECTORNAME, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>connectorName</I>" property
	 * 
	 * @return String; the value of the property "<I>connectorName</I>"
	 */
	public String getConnectorName() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_CONNECTORNAME);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Server</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Server</I>"
	 */
	public WebSocketInputNodeUDN setUri(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_URI, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Server</I>" property
	 * 
	 * @return String; the value of the property "<I>Server</I>"
	 */
	public String getUri() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_URI);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Message domain</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Message domain</I>"
	 */
	public WebSocketInputNodeUDN setMessageDomainProperty(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Message domain</I>" property
	 * 
	 * @return String; the value of the property "<I>Message domain</I>"
	 */
	public String getMessageDomainProperty() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Message model</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Message model</I>"
	 */
	public WebSocketInputNodeUDN setMessageSetProperty(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGESETPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Message model</I>" property
	 * 
	 * @return String; the value of the property "<I>Message model</I>"
	 */
	public String getMessageSetProperty() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_MESSAGESETPROPERTY);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Message</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Message</I>"
	 */
	public WebSocketInputNodeUDN setMessageTypeProperty(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Message</I>" property
	 * 
	 * @return String; the value of the property "<I>Message</I>"
	 */
	public String getMessageTypeProperty() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Physical format</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>Physical format</I>"
	 */
	public WebSocketInputNodeUDN setMessageFormatProperty(String value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Physical format</I>" property
	 * 
	 * @return String; the value of the property "<I>Physical format</I>"
	 */
	public String getMessageFormatProperty() {
		return (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY);
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Parse timing</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_VALIDATETIMING ; the value to set the property "<I>Parse timing</I>"
	 */
	public WebSocketInputNodeUDN setValidateTiming(ENUM_WEBSOCKETINPUT_VALIDATETIMING value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATETIMING, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Parse timing</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_VALIDATETIMING; the value of the property "<I>Parse timing</I>"
	 */
	public ENUM_WEBSOCKETINPUT_VALIDATETIMING getValidateTiming() {
		ENUM_WEBSOCKETINPUT_VALIDATETIMING value = ENUM_WEBSOCKETINPUT_VALIDATETIMING.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_VALIDATETIMING));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Build tree using XML schema data types</I>" property
	 * 
	 * @param value boolean ; the value to set the property "<I>Build tree using XML schema data types</I>"
	 */
	public WebSocketInputNodeUDN setParserXmlnscBuildTreeUsingXMLSchema(boolean value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA, String.valueOf(value));
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Build tree using XML schema data types</I>" property
	 * 
	 * @return boolean; the value of the property "<I>Build tree using XML schema data types</I>"
	 */
	public boolean getParserXmlnscBuildTreeUsingXMLSchema(){
	if (getPropertyValue(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA).equals("true")){
		return true;
	} else {
		return false;
		}
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Use XMLNSC compact parser for XMLNS domain</I>" property
	 * 
	 * @param value boolean ; the value to set the property "<I>Use XMLNSC compact parser for XMLNS domain</I>"
	 */
	public WebSocketInputNodeUDN setParserXmlnscUseForXmlnsDomain(boolean value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN, String.valueOf(value));
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Use XMLNSC compact parser for XMLNS domain</I>" property
	 * 
	 * @return boolean; the value of the property "<I>Use XMLNSC compact parser for XMLNS domain</I>"
	 */
	public boolean getParserXmlnscUseForXmlnsDomain(){
	if (getPropertyValue(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN).equals("true")){
		return true;
	} else {
		return false;
		}
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Retain mixed content</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE ; the value to set the property "<I>Retain mixed content</I>"
	 */
	public WebSocketInputNodeUDN setParserXmlnscMixedContentRetainMode(ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Retain mixed content</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE; the value of the property "<I>Retain mixed content</I>"
	 */
	public ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE getParserXmlnscMixedContentRetainMode() {
		ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE value = ENUM_WEBSOCKETINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Retain comments</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE ; the value to set the property "<I>Retain comments</I>"
	 */
	public WebSocketInputNodeUDN setParserXmlnscCommentsRetainMode(ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Retain comments</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE; the value of the property "<I>Retain comments</I>"
	 */
	public ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE getParserXmlnscCommentsRetainMode() {
		ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE value = ENUM_WEBSOCKETINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Retain processing instructions</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE ; the value to set the property "<I>Retain processing instructions</I>"
	 */
	public WebSocketInputNodeUDN setParserXmlnscProcessingInstructionsRetainMode(ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Retain processing instructions</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE; the value of the property "<I>Retain processing instructions</I>"
	 */
	public ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE getParserXmlnscProcessingInstructionsRetainMode() {
		ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE value = ENUM_WEBSOCKETINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Validate</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_VALIDATEMASTER ; the value to set the property "<I>Validate</I>"
	 */
	public WebSocketInputNodeUDN setValidateMaster(ENUM_WEBSOCKETINPUT_VALIDATEMASTER value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATEMASTER, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Validate</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_VALIDATEMASTER; the value of the property "<I>Validate</I>"
	 */
	public ENUM_WEBSOCKETINPUT_VALIDATEMASTER getValidateMaster() {
		ENUM_WEBSOCKETINPUT_VALIDATEMASTER value = ENUM_WEBSOCKETINPUT_VALIDATEMASTER.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_VALIDATEMASTER));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Failure action</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION ; the value to set the property "<I>Failure action</I>"
	 */
	public WebSocketInputNodeUDN setValidateFailureAction(ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Failure action</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION; the value of the property "<I>Failure action</I>"
	 */
	public ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION getValidateFailureAction() {
		ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION value = ENUM_WEBSOCKETINPUT_VALIDATEFAILUREACTION.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Additional instances pool</I>" property
	 * 
	 * @param value ENUM_WEBSOCKETINPUT_COMPONENTLEVEL ; the value to set the property "<I>Additional instances pool</I>"
	 */
	public WebSocketInputNodeUDN setComponentLevel(ENUM_WEBSOCKETINPUT_COMPONENTLEVEL value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_COMPONENTLEVEL, value.toString());
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> "<I>Additional instances pool</I>" property
	 * 
	 * @return ENUM_WEBSOCKETINPUT_COMPONENTLEVEL; the value of the property "<I>Additional instances pool</I>"
	 */
	public ENUM_WEBSOCKETINPUT_COMPONENTLEVEL getComponentLevel() {
		ENUM_WEBSOCKETINPUT_COMPONENTLEVEL value = ENUM_WEBSOCKETINPUT_COMPONENTLEVEL.getEnumFromString((String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_COMPONENTLEVEL));
		return value;
	}

	/**
	 * Set the <I>WebSocketInputNodeUDN</I> "<I>Additional instances</I>" property
	 * 
	 * @param value int ; the value to set the property "<I>Additional instances</I>"
	 */
	public WebSocketInputNodeUDN setAdditionalInstances(int value) {
		setProperty(WebSocketInputNodeUDN.PROPERTY_ADDITIONALINSTANCES, Integer.toString(value));
		return this;
	}

	/**
	 * Get the <I>WebSocketInputNodeUDN</I> <I>Additional instances</I> property
	 * 
	 * @return int; the value of the property "<I>Additional instances</I>"
	 */
	public int getAdditionalInstances() {
		String value = (String)getPropertyValue(WebSocketInputNodeUDN.PROPERTY_ADDITIONALINSTANCES);
		return Integer.valueOf(value).intValue();
	}

	public String getNodeName() {
		String retVal = super.getNodeName();
		if ((retVal==null) || retVal.equals(""))
			retVal = "WebSocketInput";
		return retVal;
	};
}
