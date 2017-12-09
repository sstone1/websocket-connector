package com.ibm.connector.websocket;

import com.ibm.broker.config.appdev.InputTerminal;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.NodeProperty;
import java.util.Vector;
import com.ibm.broker.config.appdev.NodePropertyRow;
import com.ibm.broker.config.appdev.NodePropertyTable;
import com.ibm.broker.config.appdev.OutputTerminal;

/*** 
 * <p>  <I>ComIbmEventInputNodeUDN</I> instance</p>
 * <p></p>
 */
public class ComIbmEventInputNodeUDN extends Node {

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
	 * <I>ENUM_COMIBMEVENTINPUT_VALIDATEMASTER</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.none = none
	 * ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.contentAndValue = contentAndValue
	 * ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.content = content
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_VALIDATEMASTER {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_VALIDATEMASTER none = new ENUM_COMIBMEVENTINPUT_VALIDATEMASTER("none");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATEMASTER contentAndValue = new ENUM_COMIBMEVENTINPUT_VALIDATEMASTER("contentAndValue");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATEMASTER content = new ENUM_COMIBMEVENTINPUT_VALIDATEMASTER("content");

		protected ENUM_COMIBMEVENTINPUT_VALIDATEMASTER(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_VALIDATEMASTER getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_VALIDATEMASTER enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.none;
			if (ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.contentAndValue.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.contentAndValue;
			if (ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.content.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.content;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "contentAndValue", "content" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.flow = flow
	 * ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.node = node
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL flow = new ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL("flow");
		public static final ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL node = new ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL("node");

		protected ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL enumConst = ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.flow;
			if (ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.node.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.node;
			return enumConst;
		}

		public static String[] values = new String[]{ "flow", "node" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.userTrace = userTrace
	 * ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.localError = localError
	 * ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exception = exception
	 * ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exceptionList = exceptionList
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION userTrace = new ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION("userTrace");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION localError = new ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION("localError");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION exception = new ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION("exception");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION exceptionList = new ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION("exceptionList");

		protected ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.userTrace;
			if (ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.localError.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.localError;
			if (ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exception.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exception;
			if (ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exceptionList.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.exceptionList;
			return enumConst;
		}

		public static String[] values = new String[]{ "userTrace", "localError", "exception", "exceptionList" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.none = none
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all = all
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE none = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE("none");
		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE all = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE("all");

		protected ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.none;
			if (ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.none = none
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all = all
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE none = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE("none");
		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE all = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE("all");

		protected ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.none;
			if (ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.none = none
	 * ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all = all
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE none = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE("none");
		public static final ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE all = new ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE("all");

		protected ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.none;
			if (ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.all;
			return enumConst;
		}

		public static String[] values = new String[]{ "none", "all" };

	}

	/**
	 * <I>ENUM_COMIBMEVENTINPUT_VALIDATETIMING</I>
	 * <pre>
	 * ENUM_COMIBMEVENTINPUT_VALIDATETIMING.deferred = deferred
	 * ENUM_COMIBMEVENTINPUT_VALIDATETIMING.immediate = immediate
	 * ENUM_COMIBMEVENTINPUT_VALIDATETIMING.complete = complete
	 * </pre>
	 */
	public static class ENUM_COMIBMEVENTINPUT_VALIDATETIMING {
		private String value;

		public static final ENUM_COMIBMEVENTINPUT_VALIDATETIMING deferred = new ENUM_COMIBMEVENTINPUT_VALIDATETIMING("deferred");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATETIMING immediate = new ENUM_COMIBMEVENTINPUT_VALIDATETIMING("immediate");
		public static final ENUM_COMIBMEVENTINPUT_VALIDATETIMING complete = new ENUM_COMIBMEVENTINPUT_VALIDATETIMING("complete");

		protected ENUM_COMIBMEVENTINPUT_VALIDATETIMING(String value) {
			this.value = value;
		}
		public String toString() {
			return value;
		}

		protected static ENUM_COMIBMEVENTINPUT_VALIDATETIMING getEnumFromString(String enumValue) {
			ENUM_COMIBMEVENTINPUT_VALIDATETIMING enumConst = ENUM_COMIBMEVENTINPUT_VALIDATETIMING.deferred;
			if (ENUM_COMIBMEVENTINPUT_VALIDATETIMING.immediate.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATETIMING.immediate;
			if (ENUM_COMIBMEVENTINPUT_VALIDATETIMING.complete.value.equals(enumValue)) enumConst = ENUM_COMIBMEVENTINPUT_VALIDATETIMING.complete;
			return enumConst;
		}

		public static String[] values = new String[]{ "deferred", "immediate", "complete" };

	}
	protected NodeProperty[] getNodeProperties() {
		return new NodeProperty[] {
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_CONNECTORNAME,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, "WebSocket","","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_URI,		NodeProperty.Usage.MANDATORY,	true,	NodeProperty.Type.STRING, null,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageDomainPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGESETPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageSetNamePropertyEditorV8",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageTypePropertyEditorV8",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.MRMessageFormatPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATETIMING,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "deferred", ENUM_COMIBMEVENTINPUT_VALIDATETIMING.class,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.BOOLEAN, "false",	"com.ibm.etools.mft.ibmnodes.compilers.BooleanPropertyCompiler",	"com.ibm.etools.mft.ibmnodes.editors.BuildTreePropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.BOOLEAN, "false",	"com.ibm.etools.mft.ibmnodes.compilers.BooleanPropertyCompiler",	"com.ibm.etools.mft.ibmnodes.editors.XmlnsMessageDomainPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "none", ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.class,"",	"com.ibm.etools.mft.ibmnodes.editors.XmlnscPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEMASTER,		NodeProperty.Usage.MANDATORY,	true,	NodeProperty.Type.ENUMERATION, "none", ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.class,"",	"com.ibm.etools.mft.ibmnodes.editors.ValidateMasterForOpaqueParsingPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION,		NodeProperty.Usage.MANDATORY,	false,	NodeProperty.Type.ENUMERATION, "exception", ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.class,"",	"com.ibm.etools.mft.ibmnodes.editors.ValidateMasterListenerPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_COMPONENTLEVEL,		NodeProperty.Usage.OPTIONAL,	true,	NodeProperty.Type.ENUMERATION, "flow", ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.class,"","",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes"),
			new NodeProperty(ComIbmEventInputNodeUDN.PROPERTY_ADDITIONALINSTANCES,		NodeProperty.Usage.OPTIONAL,	true,	NodeProperty.Type.INTEGER, "0","",	"com.ibm.etools.mft.ibmnodes.editors.AdditionalInstancesPropertyEditor",	"com/ibm/connector/websocket/ComIbmEventInput",	"WebSocketNodes")
		};
	}

	/**
	 * <I>ParserXmlnscOpaqueElementsTable</I> instance contains <I>parserXmlnscOpaqueElementsRow</I> rows
	 * <pre>
	 * Table name = parserXmlnscOpaqueElements
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
	 * Table name = parserXmlnscOpaqueElements
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
			new NodeProperty(PROPERTY_ELEMENTS,		NodeProperty.Usage.OPTIONAL,	false,	NodeProperty.Type.STRING, null,"",	"com.ibm.etools.mft.ibmnodes.editors.xpath.XPathOpaqueParsingCellPropertyEditor",	"com/ibm/connector/kafka/ComIbmEventInput",	"WebSocketNodes")
		};
	}


	/**
	 * Set the <I>parserXmlnscOpaqueElementsRow</I> "<I>elements</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>elements</I>"
	 */
	public void setElements(String value) {
		setProperty(PROPERTY_ELEMENTS, value);
	}

	/**
	 * Get the <I>parserXmlnscOpaqueElementsRow</I> "<I>elements</I>" property
	 * 
	 * @return String; the value of the property "<I>elements</I>"
	 */
	public String getElements() {
		return (String)getPropertyValue(PROPERTY_ELEMENTS);
	}
}
	/**
	 * Retrieve the parserXmlnscOpaqueElements table for the node <I>ComIbmEventInputNodeUDN</I
	 * @return ParserXmlnscOpaqueElementsTable instance which contains parserXmlnscOpaqueElementsRow rows

	 */
	public ParserXmlnscOpaqueElementsTable getParserXmlnscOpaqueElementsTable() {
		for (int i = 0; i < nodePropertyTables.size(); i++) {
			if (nodePropertyTables.get(i) instanceof ParserXmlnscOpaqueElementsTable)
				return (ParserXmlnscOpaqueElementsTable)nodePropertyTables.get(i);
			}
		return null;
	}

	public ComIbmEventInputNodeUDN() {
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
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>connectorName</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>connectorName</I>"
	 */
	public ComIbmEventInputNodeUDN setConnectorName(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_CONNECTORNAME, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>connectorName</I>" property
	 * 
	 * @return String; the value of the property "<I>connectorName</I>"
	 */
	public String getConnectorName() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_CONNECTORNAME);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>URI</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>URI</I>"
	 */
	public ComIbmEventInputNodeUDN setUri(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_URI, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>URI</I>" property
	 * 
	 * @return String; the value of the property "<I>URI</I>"
	 */
	public String getUri() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_URI);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>messageDomainProperty</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>messageDomainProperty</I>"
	 */
	public ComIbmEventInputNodeUDN setMessageDomainProperty(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>messageDomainProperty</I>" property
	 * 
	 * @return String; the value of the property "<I>messageDomainProperty</I>"
	 */
	public String getMessageDomainProperty() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEDOMAINPROPERTY);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>messageSetProperty</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>messageSetProperty</I>"
	 */
	public ComIbmEventInputNodeUDN setMessageSetProperty(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGESETPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>messageSetProperty</I>" property
	 * 
	 * @return String; the value of the property "<I>messageSetProperty</I>"
	 */
	public String getMessageSetProperty() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_MESSAGESETPROPERTY);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>messageTypeProperty</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>messageTypeProperty</I>"
	 */
	public ComIbmEventInputNodeUDN setMessageTypeProperty(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>messageTypeProperty</I>" property
	 * 
	 * @return String; the value of the property "<I>messageTypeProperty</I>"
	 */
	public String getMessageTypeProperty() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_MESSAGETYPEPROPERTY);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>messageFormatProperty</I>" property
	 * 
	 * @param value String ; the value to set the property "<I>messageFormatProperty</I>"
	 */
	public ComIbmEventInputNodeUDN setMessageFormatProperty(String value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY, value);
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>messageFormatProperty</I>" property
	 * 
	 * @return String; the value of the property "<I>messageFormatProperty</I>"
	 */
	public String getMessageFormatProperty() {
		return (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_MESSAGEFORMATPROPERTY);
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>validateTiming</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_VALIDATETIMING ; the value to set the property "<I>validateTiming</I>"
	 */
	public ComIbmEventInputNodeUDN setValidateTiming(ENUM_COMIBMEVENTINPUT_VALIDATETIMING value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATETIMING, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>validateTiming</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_VALIDATETIMING; the value of the property "<I>validateTiming</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_VALIDATETIMING getValidateTiming() {
		ENUM_COMIBMEVENTINPUT_VALIDATETIMING value = ENUM_COMIBMEVENTINPUT_VALIDATETIMING.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_VALIDATETIMING));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscBuildTreeUsingXMLSchema</I>" property
	 * 
	 * @param value boolean ; the value to set the property "<I>parserXmlnscBuildTreeUsingXMLSchema</I>"
	 */
	public ComIbmEventInputNodeUDN setParserXmlnscBuildTreeUsingXMLSchema(boolean value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA, String.valueOf(value));
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscBuildTreeUsingXMLSchema</I>" property
	 * 
	 * @return boolean; the value of the property "<I>parserXmlnscBuildTreeUsingXMLSchema</I>"
	 */
	public boolean getParserXmlnscBuildTreeUsingXMLSchema(){
	if (getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCBUILDTREEUSINGXMLSCHEMA).equals("true")){
		return true;
	} else {
		return false;
		}
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscUseForXmlnsDomain</I>" property
	 * 
	 * @param value boolean ; the value to set the property "<I>parserXmlnscUseForXmlnsDomain</I>"
	 */
	public ComIbmEventInputNodeUDN setParserXmlnscUseForXmlnsDomain(boolean value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN, String.valueOf(value));
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscUseForXmlnsDomain</I>" property
	 * 
	 * @return boolean; the value of the property "<I>parserXmlnscUseForXmlnsDomain</I>"
	 */
	public boolean getParserXmlnscUseForXmlnsDomain(){
	if (getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCUSEFORXMLNSDOMAIN).equals("true")){
		return true;
	} else {
		return false;
		}
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscMixedContentRetainMode</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE ; the value to set the property "<I>parserXmlnscMixedContentRetainMode</I>"
	 */
	public ComIbmEventInputNodeUDN setParserXmlnscMixedContentRetainMode(ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscMixedContentRetainMode</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE; the value of the property "<I>parserXmlnscMixedContentRetainMode</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE getParserXmlnscMixedContentRetainMode() {
		ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE value = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCMIXEDCONTENTRETAINMODE.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCMIXEDCONTENTRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscCommentsRetainMode</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE ; the value to set the property "<I>parserXmlnscCommentsRetainMode</I>"
	 */
	public ComIbmEventInputNodeUDN setParserXmlnscCommentsRetainMode(ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscCommentsRetainMode</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE; the value of the property "<I>parserXmlnscCommentsRetainMode</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE getParserXmlnscCommentsRetainMode() {
		ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE value = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCCOMMENTSRETAINMODE.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCCOMMENTSRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscProcessingInstructionsRetainMode</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE ; the value to set the property "<I>parserXmlnscProcessingInstructionsRetainMode</I>"
	 */
	public ComIbmEventInputNodeUDN setParserXmlnscProcessingInstructionsRetainMode(ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>parserXmlnscProcessingInstructionsRetainMode</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE; the value of the property "<I>parserXmlnscProcessingInstructionsRetainMode</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE getParserXmlnscProcessingInstructionsRetainMode() {
		ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE value = ENUM_COMIBMEVENTINPUT_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_PARSERXMLNSCPROCESSINGINSTRUCTIONSRETAINMODE));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>validateMaster</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_VALIDATEMASTER ; the value to set the property "<I>validateMaster</I>"
	 */
	public ComIbmEventInputNodeUDN setValidateMaster(ENUM_COMIBMEVENTINPUT_VALIDATEMASTER value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEMASTER, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>validateMaster</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_VALIDATEMASTER; the value of the property "<I>validateMaster</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_VALIDATEMASTER getValidateMaster() {
		ENUM_COMIBMEVENTINPUT_VALIDATEMASTER value = ENUM_COMIBMEVENTINPUT_VALIDATEMASTER.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEMASTER));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>validateFailureAction</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION ; the value to set the property "<I>validateFailureAction</I>"
	 */
	public ComIbmEventInputNodeUDN setValidateFailureAction(ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>validateFailureAction</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION; the value of the property "<I>validateFailureAction</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION getValidateFailureAction() {
		ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION value = ENUM_COMIBMEVENTINPUT_VALIDATEFAILUREACTION.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_VALIDATEFAILUREACTION));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>componentLevel</I>" property
	 * 
	 * @param value ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL ; the value to set the property "<I>componentLevel</I>"
	 */
	public ComIbmEventInputNodeUDN setComponentLevel(ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_COMPONENTLEVEL, value.toString());
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> "<I>componentLevel</I>" property
	 * 
	 * @return ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL; the value of the property "<I>componentLevel</I>"
	 */
	public ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL getComponentLevel() {
		ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL value = ENUM_COMIBMEVENTINPUT_COMPONENTLEVEL.getEnumFromString((String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_COMPONENTLEVEL));
		return value;
	}

	/**
	 * Set the <I>ComIbmEventInputNodeUDN</I> "<I>additionalInstances</I>" property
	 * 
	 * @param value int ; the value to set the property "<I>additionalInstances</I>"
	 */
	public ComIbmEventInputNodeUDN setAdditionalInstances(int value) {
		setProperty(ComIbmEventInputNodeUDN.PROPERTY_ADDITIONALINSTANCES, Integer.toString(value));
		return this;
	}

	/**
	 * Get the <I>ComIbmEventInputNodeUDN</I> <I>additionalInstances</I> property
	 * 
	 * @return int; the value of the property "<I>additionalInstances</I>"
	 */
	public int getAdditionalInstances() {
		String value = (String)getPropertyValue(ComIbmEventInputNodeUDN.PROPERTY_ADDITIONALINSTANCES);
		return Integer.valueOf(value).intValue();
	}

	public String getNodeName() {
		String retVal = super.getNodeName();
		if ((retVal==null) || retVal.equals(""))
			retVal = "ComIbmEventInput";
		return retVal;
	};
}
