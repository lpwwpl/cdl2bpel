package edu.xjtu.cdl2bpel.cdl2bpel.util;

/**
 * This class defines the keywords used for WS-BPEL.
 */
public class WSBPELKeywords {
	
	/**
	 * This method indicates whether the supplied name is a
	 * WS-BPEL activity.
	 * 
	 * @param name The name
	 * @return Whether the name is a WS-BPEL activity
	 */
	public static boolean isActivity(String name) {
		boolean ret=false;
		
		for (int i=0; ret == false && i < m_activities.length; i++) {
			if (m_activities[i].equals(name)) {
				ret = true;
			}
		}
		
		return(ret);
	}
	
	public static final String ASSIGN = "assign";
	public static final String CASE = "case";
	public static final String CATCH = "catch";
	public static final String CATCHALL = "catchAll";
	public static final String COMPENSATE = "compensate";
	public static final String COMPENSATIONHANDLER = "compensationHandler";
	public static final String CONDITION = "condition";
	public static final String COPY = "copy";
	public static final String CORRELATIONSET = "correlationSet";
	public static final String CORRELATIONSETS = "correlationSets";
    public static final String EMPTY = "empty";
	public static final String EXPRESSION = "expression";
    public static final String FAULTHANDLERS = "faultHandlers";
    public static final String FLOW = "flow";
    public static final String FOR = "for";
	public static final String FROM = "from";
	public static final String INVOKE = "invoke";
	public static final String ONMESSAGE = "onMessage";
	public static final String PARTNER = "partner";
	public static final String PARTNERLINKTYPE = "partnerLinkType";
	public static final String PARTNERLINK = "partnerLink";
	public static final String PARTNERLINKS = "partnerLinks";
	public static final String PARTNERS = "partners";
	public static final String PICK = "pick";
	public static final String PORTTYPE = "portType";
	public static final String PROCESS = "process";
	public static final String PROPERTY = "property";
	public static final String PROPERTYALIAS = "propertyAlias";
	public static final String QUERY = "query";
	public static final String RECEIVE = "receive";
	public static final String REPLY = "reply";
	public static final String ROLE = "role";
	public static final String SEQUENCE = "sequence";
	public static final String SCOPE = "scope";
	public static final String SWITCH = "switch";
	public static final String THROW = "throw";
	public static final String TO = "to";
	public static final String VARIABLE = "variable";
	public static final String VARIABLES = "variables";
	public static final String UNTIL = "until";
	public static final String WAIT = "wait";
	public static final String WHILE = "while";
	
	public static final String CONDITION_ATTR = "condition";
	public static final String CREATE_INSTANCE_ATTR = "createInstance";
	public static final String ELEMENT_ATTR = "element";
	public static final String EXPRESSION_ATTR = "expression";
	public static final String FAULTNAME_ATTR = "faultName";
	public static final String FAULTVARIABLE_ATTR = "faultVariable";
	public static final String INPUTVARIABLE_ATTR = "inputVariable";
	public static final String MESSAGETYPE_ATTR = "messageType";
	public static final String MYROLE_ATTR = "myRole";
	public static final String NAME_ATTR = "name";
	public static final String OPERATION_ATTR="operation";
	public static final String OUTPUTVARIABLE_ATTR = "outputVariable";
	public static final String PART_ATTR = "part";
	public static final String PARTNERLINK_ATTR = "partnerLink";
	public static final String PARTNERLINKTYPE_ATTR = "partnerLinkType";
	public static final String PARTNERROLE_ATTR = "partnerRole";
	public static final String PORTTYPE_ATTR = "portType";
	public static final String PROPERTIES_ATTR = "properties";
	public static final String PROPERTYNAME_ATTR = "propertyName";
	public static final String SCOPE_ATTR = "scope";
	public static final String TARGETNAMESPACE_ATTR = "targetNamespace";
	public static final String TYPE_ATTR = "type";
	public static final String VARIABLE_ATTR = "variable";	
	public static final String XMLNS_ATTR = "xmlns";

	//public static final String XSD_ANY = "xsd:any";
	public static final String XSD_STRING = "xsd:string";
	public static final String XSD_PREFIX = "xsd";
	public static final String XMLNS_SEPARATOR=":";
	
	//public static final String DUMMY_VARIABLE="unused";
	
	public static final String ACTIVITY_PLACEHOLDER="pi4soa: Custom activities to be defined";
	public static final String EXPRESSION_PLACEHOLDER="pi4soa: XPath expression to be defined";

	private static String[] m_activities=new String[]{
			ASSIGN, COMPENSATE, EMPTY, FLOW, INVOKE,
			PICK, RECEIVE, REPLY, SEQUENCE, SCOPE, SWITCH,
			THROW, WHILE
	};
}
