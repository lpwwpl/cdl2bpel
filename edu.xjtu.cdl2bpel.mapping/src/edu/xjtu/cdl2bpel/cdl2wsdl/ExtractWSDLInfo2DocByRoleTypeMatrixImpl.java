package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2bpel.util.WSBPELKeywords;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;

public class ExtractWSDLInfo2DocByRoleTypeMatrixImpl implements
		ExtractWSDLInfo2DocByRoleTypeMatrix {
	private RoleType[] roleTypeMatrix = null;
	private List<RoleTypeInfo> roleTypeInfoMatrix = null;
	protected Document document = null;
	private Hashtable namespaces=new Hashtable();
	private Hashtable reservedPrefixNS=new Hashtable();
	private Vector reservedPrefixes=new Vector();
	private int prefixNumber=1;
	private String address;
	private List<Pair<RoleType[], String>> pairs = null;
	private GlobalArchitecture sd = null;
	public Document getDocument() {
		return document;
	}

	public ExtractWSDLInfo2DocByRoleTypeMatrixImpl(GlobalArchitecture sd,List<Pair<RoleType[], String>> pairs,Hashtable reservedPrefixNS,RoleType[] roleTypeMatrix,
			List<RoleTypeInfo> allRoleTypeInfoMatrix,String address) {
		this.roleTypeMatrix = roleTypeMatrix;
		this.sd = sd;
		roleTypeInfoMatrix = new ArrayList();
		this.pairs = pairs;
		for (RoleTypeInfo roleTypeInfo : allRoleTypeInfoMatrix) {
			if (isRoleTypeInfoIntersetWithRoleTypeMatrix(roleTypeInfo,
					roleTypeMatrix)) {
				roleTypeInfoMatrix.add(roleTypeInfo);
			}
		}
		this.reservedPrefixNS = reservedPrefixNS;
		document = createDocument();
		this.address = address;
	}

	public Document createDocument() {
		Document ret = null;

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			factory.setNamespaceAware(true);

			DocumentBuilder builder = factory.newDocumentBuilder();
			ret = builder.newDocument();

		} catch (Exception e) {
		}

		return (ret);
	}

	public boolean isRoleTypeInfoIntersetWithRoleTypeMatrix(
			RoleTypeInfo roleTypeInfo, RoleType[] roleTypeMatrix) {
		for (RoleType roleType : roleTypeMatrix) {
			if (roleTypeInfo.getRoleType().equals(roleType)) {
				return true;
			}
		}
		return false;
	}

	public List<RoleTypeInfo> getRoleTypeInfoMatrix() {
		return roleTypeInfoMatrix;
	}

	public void setRoleTypeInfoMatrix(List<RoleTypeInfo> roleTypeInfoMatrix) {
		this.roleTypeInfoMatrix = roleTypeInfoMatrix;
	}

	public RoleType[] getRoleTypeMatrix() {
		return roleTypeMatrix;
	}

	public void setRoleTypeMatrix(RoleType[] roleTypeMatrix) {
		this.roleTypeMatrix = roleTypeMatrix;
	}

	/**
	 * 提取WSDL信息，生成WSDL的Document文档
	 */
	public void extractWSDLInfo2Doc() {

		definitions = document.createElement("definitions");
		definitions.setAttribute(XMLNS, WSDL11_NAMESPACE);
		document.appendChild(definitions);
		definitions.setAttribute(TARGETNAMESPACE_ATTR, address);
		definitions.setAttribute(XMLNS + XMLNS_SEPARATOR + TNS_PREFIX, address);

		Iterator it = roleTypeInfoMatrix.iterator();
		for (; it.hasNext();) {
			WSDLElement wsdlElement = (WSDLElement) it.next();
			if (wsdlElement instanceof RoleTypeInfo) {
				transformRoleTypeInfo((RoleTypeInfo) wsdlElement);
			}
		}
		recordNamespaces(definitions);
		importMessageWSDL(definitions);
		initializePartnerLinkTypes(definitions,sd);
	}

	/**
	 * 
	 * @param roleTypeInfo
	 */
	public void transformRoleTypeInfo(RoleTypeInfo roleTypeInfo) {
		Iterator iter = roleTypeInfo.getPortTypes().iterator();
		while (iter.hasNext()) {
			WSDLElement subWSDLElement = (WSDLElement) iter.next();
			if (subWSDLElement instanceof PortTypeBehaviorOfRoleTypeInfo) {
				transformPortTypeBehavior((PortTypeBehaviorOfRoleTypeInfo) subWSDLElement);
			}
		}
//		configureMessageTypes(definitions);
	}

	/**
	 * 
	 * @param definitions
	 */
	public void importMessageWSDL(org.w3c.dom.Element definitions) {
//		java.util.Enumeration iter = reservedPrefixNS.keys();
//		System.out.println(reservedPrefixNS);
//		while (iter.hasMoreElements()) {
//			String namespace = (String) iter.nextElement();
//
//			org.w3c.dom.Element elem = document.createElement("import");
//			elem.setAttribute("namespace", namespace);
//			//############################################################################################
//			elem.setAttribute("location", "project:/wsdl/"+(String)reservedPrefixNS.get(namespace)+".wsdl");
//			if (definitions.getFirstChild() == null) {
//				definitions.appendChild(elem);
//			} else {
//				definitions.insertBefore(elem, definitions.getFirstChild());
//			}
//		}
	}
	
	/**
	 * 
	 * @param elem
	 */
	protected void recordNamespaces(org.w3c.dom.Element elem) {
		
		namespaces.put("http://www.w3.org/2001/XMLSchema", "xsd");
		
		java.util.Enumeration iter=namespaces.keys();
		while (iter.hasMoreElements()) {
			String namespace=(String)iter.nextElement();
			String prefix=(String)namespaces.get(namespace);
			
			elem.setAttribute(XMLNS+XMLNS_SEPARATOR+prefix, namespace);
		}
		
//		if (getBinding() == WSDLDefinitions.SOAP_RPC_BINDING) {
//			elem.setAttribute(XMLNS+XMLNS_SEPARATOR+SOAP_PREFIX,
//					SOAP_NAMESPACE);
//		}
	}
	
	/**
	 * 
	 * @param portType
	 */
	public void transformPortTypeBehavior(
			PortTypeBehaviorOfRoleTypeInfo portType) {

		portTypeElement = document.createElement("portType");
		String porTypeName = portType.getName();

		if (CheckNOthersUtil.isSet(porTypeName)) {
			portTypeElement.setAttribute(NAME_ATTR, porTypeName);
		} else if (portType.getBehaviorName() != null) {
			porTypeName = portType.getBehaviorName();
			portTypeElement.setAttribute(NAME_ATTR, porTypeName + PORT_SUFFIX);
		}

		// add portType to definitions
		definitions.appendChild(portTypeElement);

		definitions
				.setAttribute(XMLNS + XMLNS_SEPARATOR + SOAP_PREFIX, SOAP_NS);

		bingingElement = document.createElement(BINDING);
		bingingElement.setAttribute(NAME_ATTR, portType.getBehaviorName()
				+ BINDING_NAME_SUFFIX);
		bingingElement.setAttribute(TYPE_ATTR, TNS_PREFIX + XMLNS_SEPARATOR
				+ porTypeName);

		definitions.appendChild(bingingElement);

		org.w3c.dom.Element soapbind = document.createElement(SOAP_PREFIX
				+ XMLNS_SEPARATOR + BINDING);
		soapbind.setAttribute(STYLE_ATTR, SOAP_STYLE);
		soapbind.setAttribute(TRANSPORT_ATTR, SOAP_TRANSPORT);

		bingingElement.appendChild(soapbind);

		serviceElement = document.createElement(SERVICE);
		serviceElement.setAttribute(NAME_ATTR, WSDLDefinitions
				.getWSDLServiceName(portType.getBehaviorName(), portType
						.getNamespace(), portType.getName()));

		org.w3c.dom.Element port = document.createElement(PORT);
		port.setAttribute(NAME_ATTR, WSDLDefinitions
				.getWSDLPortName(portType.getBehaviorName(), portType
						.getNamespace(), portType.getName()));
		port.setAttribute(BINDING_ATTR, TNS_PREFIX + XMLNS_SEPARATOR
				+ portType.getBehaviorName() + BINDING_NAME_SUFFIX);

		serviceElement.appendChild(port);

		org.w3c.dom.Element address = document.createElement(SOAP_PREFIX
				+ XMLNS_SEPARATOR + ADDRESS);
		address.setAttribute(LOCATION_ATTR,
				WSDLDefinitions.USER_DEFINED_DEFINITIONS);
		port.appendChild(address);

		definitions.appendChild(serviceElement);

		Iterator iter = portType.getOperationOfCDL2WSDL().iterator();
		while (iter.hasNext()) {
			WSDLElement subWSDLElement = (WSDLElement) iter.next();
			if (subWSDLElement instanceof OperationOfPortTypeBehavior) {
				transformOperation((OperationOfPortTypeBehavior) subWSDLElement);
			}
		}
	}

	/**
	 * 
	 * @param operation
	 */
	public void transformOperation(OperationOfPortTypeBehavior operation) {

		operationElement = document.createElement(OPERATION);
		operationElement.setAttribute(NAME_ATTR, operation.getName());

		portTypeElement.appendChild(operationElement);

		operationNumber++;

		bindOperation = document.createElement(OPERATION);
		bindOperation.setAttribute(NAME_ATTR, operation.getName());

		org.w3c.dom.Element soapop = document.createElement(SOAP_PREFIX
				+ XMLNS_SEPARATOR + OPERATION);
		// soapop.setAttribute(SOAPACTION_ATTR, getTargetNamespace() + "/"
		// + operation.getName());

		bindOperation.appendChild(soapop);

		bingingElement.appendChild(bindOperation);

		Iterator iter = operation.getMessages().iterator();
		while (iter.hasNext()) {
			WSDLElement subWSDLElement = (WSDLElement) iter.next();
			if (subWSDLElement instanceof MessageOfOperation) {
				doSomething((MessageOfOperation) subWSDLElement);
				// MessageOfOperationProjector projector = new
				// MessageOfOperationProjector(context);
				// subWSDLElement.transformInfoToDoc(projector);
			}
		}

	}

	/**
	 * 
	 * @param message
	 */
	public void doSomething(MessageOfOperation message) {
		switch (message.getClassification()) {
		case MessageOfOperation.INPUT:
			input(message.getName(), message.getTypeNamespace(), message
					.getTypeStringValue());
			break;
		case MessageOfOperation.OUTPUT:
			output(message.getName(), message.getTypeNamespace(), message
					.getTypeStringValue());
			break;
		case MessageOfOperation.INFAULT:
			infault(message.getName(), message.getFaultNamespace(), message
					.getFaultName(), message.getTypeNamespace(), message
					.getTypeStringValue());
			break;
		case MessageOfOperation.OUTFAULT:
			outfault(message.getName(), message.getFaultNamespace(), message
					.getFaultName(), message.getTypeNamespace(), message
					.getTypeStringValue());
			break;
		default:
		}
	}

	/**
	 * 
	 * @param name
	 * @param typeNamespace
	 * @param type
	 */
	protected void input(String name, String typeNamespace, String type) {

		org.w3c.dom.Element elem = document.createElement(INPUT);

		if (name != null) {
			elem.setAttribute(NAME_ATTR, name);
		}

		defineMessageType(typeNamespace, type, elem);

		operationElement.appendChild(elem);

		elem = document.createElement(INPUT);
		bindOperation.appendChild(elem);

		addSOAPMessageBinding(elem);
	}

	/**
	 * 
	 * @param elem
	 */
	protected void addSOAPMessageBinding(org.w3c.dom.Element elem) {

		org.w3c.dom.Element soapbody = document.createElement(SOAP_PREFIX
				+ XMLNS_SEPARATOR + BODY);
		soapbody.setAttribute(USE_ATTR, USE_VALUE);
		// soapbody.setAttribute(NAMESPACE_ATTR, getTargetNamespace());
		soapbody.setAttribute(ENCODINGSTYLE_ATTR, SOAP_ENCODING_STYLE);

		elem.appendChild(soapbody);
	}

	/**
	 * 
	 * @param name
	 * @param typeNamespace
	 * @param type
	 */
	protected void output(String name, String typeNamespace, String type) {
		org.w3c.dom.Element elem = document.createElement(OUTPUT);

		if (name != null) {
			elem.setAttribute(NAME_ATTR, name);
		}

		defineMessageType(typeNamespace, type, elem);

		operationElement.appendChild(elem);

		elem = document.createElement(OUTPUT);
		bindOperation.appendChild(elem);

		addSOAPMessageBinding(elem);
	}

	protected void infault(String name, String faultNamespace,
			String faultName, String typeNamespace, String type) {
	}

	protected void outfault(String name, String faultNamespace,
			String faultName, String typeNamespace, String type) {
		org.w3c.dom.Element elem = document.createElement(FAULT);
		elem.setAttribute(NAME_ATTR, faultName);

		defineMessageType(typeNamespace, type, elem);

		operationElement.appendChild(elem);

		elem = document.createElement(FAULT);
		bindOperation.appendChild(elem);

		org.w3c.dom.Element soapfault = document.createElement(SOAP_PREFIX
				+ XMLNS_SEPARATOR + FAULT);
		// soapfault.setAttribute(NAME_ATTR, name);
		soapfault.setAttribute(NAME_ATTR, faultName);
		soapfault.setAttribute(USE_ATTR, USE_VALUE);
//		soapfault.setAttribute(NAMESPACE_ATTR, getTargetNamespace());
		soapfault.setAttribute(ENCODINGSTYLE_ATTR, SOAP_ENCODING_STYLE);

		elem.appendChild(soapfault);
	}

	protected void defineMessageType(String namespace, String type,
			org.w3c.dom.Element elem) {

		String prefix = null;

		if (namespace == null || namespace.equals(getTargetNamespace())) {
			elem
					.setAttribute(MESSAGE_ATTR, TNS_PREFIX + XMLNS_SEPARATOR
							+ type);
			addMessage(type);
		} else {
			prefix = addNamespace(namespace);
			elem.setAttribute(MESSAGE_ATTR, prefix + XMLNS_SEPARATOR + type);
		}
	}

	protected String addNamespace(String namespace) {
		String ret=null;
		
		if (namespaces.containsKey(namespace)) {
			ret = (String)namespaces.get(namespace);
			
		} else {
			
			// Check if prefix has been reserved for this
			// namespace
			ret = getReservedPrefix(namespace);
			
			if (ret == null) {
				// Create new prefix
				ret = getNextPrefix();
			}
			
			namespaces.put(namespace, ret);
		}
		
		return(ret);
	}
	
	
	protected String getReservedPrefix(String namespace) {
		return((String)reservedPrefixNS.get(namespace));
	}

	protected String getNextPrefix() {
		String ret=null;
		
		do {
			ret = NAMESPACE_PREFIX+prefixNumber++;
			
			// Check prefix has not been reserved
			if (reservedPrefixes.contains(ret)) {
				ret = null;
			}
		} while (ret == null);

		return(ret);
	}
	
	protected void addMessage(String type) {
		if (messages.contains(type) == false) {
			messages.add(type);
		}
	}

//	protected void configureMessageTypes(org.w3c.dom.Element defn) {
//
//		// Add message type definitions
//		java.util.Enumeration iter = messages.elements();
//		while (iter.hasMoreElements()) {
//			String type = (String) iter.nextElement();
//
//			org.w3c.dom.Element elem = document.createElement(MESSAGE_ATTR);
//			elem.setAttribute(NAME_ATTR, type);
//
//			addDocumentation(elem);
//
//			if (defn.getFirstChild() == null) {
//				defn.appendChild(elem);
//			} else {
//				defn.insertBefore(elem, defn.getFirstChild());
//			}
//		}
//	}

	private static final String DEFINITIONS = "definitions";
	private static final String WSDL11_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/";
	private static final String TARGETNAMESPACE_ATTR = "targetNamespace";
	private static final String PORTTYPE = "portType";
	private static final String OPERATION = "operation";
	private static final String INPUT = "input";
	private static final String OUTPUT = "output";
	private static final String FAULT = "fault";
	private static final String NAME_ATTR = "name";
	private static final String MESSAGE_ATTR = "message";
	private static final String BINDING_NAME_SUFFIX = "Binding";
	private static final String SERVICE = "service";
	private static final String BINDING = "binding";
	private static final String TYPE_ATTR = "type";
	private static final String BINDING_ATTR = "binding";
	private static final String LOCATION_ATTR = "location";
	private static final String ADDRESS = "address";
	private static final String SOAP_ENCODING_STYLE = "http://schemas.xmlsoap.org/soap/encoding/";
	private static final String ENCODINGSTYLE_ATTR = "encodingStyle";
	private static final String NAMESPACE_ATTR = "namespace";
	private static final String USE_VALUE = "encoded";
	private static final String USE_ATTR = "use";
	private static final String BODY = "body";
	private static final String SOAPACTION_ATTR = "soapAction";
	private static final String SOAP_STYLE = "rpc";
	private static final String STYLE_ATTR = "style";
	private static final String TRANSPORT_ATTR = "transport";
	private static final String SOAP_TRANSPORT = "http://schemas.xmlsoap.org/soap/http";
	private static final String PORT = "port";
	private static final String SOAP_NS = "http://schemas.xmlsoap.org/wsdl/soap/";
	private static final String PORT_SUFFIX = "Port";

	private static final String NAMESPACE_PREFIX = "ns";

	public static final String XMLNS = "xmlns";
	public static final String XMLNS_SEPARATOR = ":";
	public static final String TNS_PREFIX = "tns";

	private static final String DOCUMENTATION = "documentation";
	private static final String SOAP_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/soap/";
	protected static final String SOAP_PREFIX = "soap";

	protected Element portTypeElement = null;
	protected Element bingingElement = null;
	protected Element serviceElement = null;
	protected Element bindOperation = null;

	protected Element definitions = null;
	protected Element operationElement = null;
	private int operationNumber = 0;
	private String targetNamespace = null;
	private java.util.Vector messages = new java.util.Vector();

	public String getTargetNamespace() {
		return targetNamespace;
	}

	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}

	protected void addDocumentation(org.w3c.dom.Element elem) {

		Element desc = document.createElement(DOCUMENTATION);

		org.w3c.dom.Text text = document
				.createTextNode(WSDLDefinitions.USER_DEFINED_DEFINITIONS);
		desc.appendChild(text);

		elem.appendChild(desc);
	}
	
	protected void initializePartnerLinkTypes(org.w3c.dom.Element description,
			GlobalArchitecture sd) {
		
		// Add a partner link for each service type
		java.util.Iterator iter=sd.getInterfaces().iterator();
		
		while (iter.hasNext()) {
			InterfaceOfGroup st=(InterfaceOfGroup)iter.next();
			String namespace = getNamespaceOfPLNKPortType(st);
			// Don't process service types with no operations
			// These are a side effect of variables for channels
			// associated with those service types being projected
			// to too many roles in which they are not relevant
			if (st.getOperations().size() != 0) {
				String name=CommonNamespaceUtil.getLocalPart(st.getFullyQualifiedName());
				
				Element plinktype=
					description.getOwnerDocument().createElement(PLNK_PREFIX+
						XMLNS_SEPARATOR+
						WSBPELKeywords.PARTNERLINKTYPE);
				description.appendChild(plinktype);
				
				plinktype.setAttribute(WSBPELKeywords.NAME_ATTR,
						name+LINKTYPE_SUFFIX);
		
				Element prole=description.getOwnerDocument().createElement(PLNK_PREFIX+
						XMLNS_SEPARATOR+
						WSBPELKeywords.ROLE);
				plinktype.appendChild(prole);
	
				prole.setAttribute(WSBPELKeywords.NAME_ATTR,
						name+"Role");
				
				Element pportType=description.getOwnerDocument().createElement(PLNK_PREFIX+
						XMLNS_SEPARATOR+
						WSBPELKeywords.PORTTYPE);
				prole.appendChild(pportType);
				
				String ns=CommonNamespaceUtil.getNamespace(st.getFullyQualifiedName());
				
				String portType=getPrefixByNamespace(namespace)+XMLNS_SEPARATOR+name;
				
				pportType.setAttribute(WSBPELKeywords.NAME_ATTR,
						portType);
			}
		}
		
		localPrefixNS4PortTye.put(PLNK_NS, this.PLNK_PREFIX);
		java.util.Enumeration localPrefixNS4PortTye_iter=localPrefixNS4PortTye.keys();
		while (localPrefixNS4PortTye_iter.hasMoreElements()) {
			String namespace=(String)localPrefixNS4PortTye_iter.nextElement();
			String prefix=(String)localPrefixNS4PortTye.get(namespace);
			
			definitions.setAttribute(XMLNS+XMLNS_SEPARATOR+prefix, namespace);
		}
		
	}	
	
	protected String getPrefixByNamespace(String namespace) {
		String ret=null;
		
		if (localPrefixNS4PortTye.containsKey(namespace)) {
			ret = (String)localPrefixNS4PortTye.get(namespace);
			
		} else {
			
				// Create new prefix
			ret = getNextPrefix();
			localPrefixNS4PortTye.put(namespace, ret);
		}
		
		return(ret);
	}
	
	public String getNamespaceOfPLNKPortType(InterfaceOfGroup st) {
		String namespace = null;
		for(Pair<RoleType[],String> pair:pairs) {
			for(RoleType roleType:pair.getE()) {
				
				Iterator it = roleType.getBehaviors().iterator();
				for(;it.hasNext();){
					BehaviorOfRoleType behavior = (BehaviorOfRoleType)it.next();
					if(behavior.getInterface().equals(st.getName())) {
						namespace = pair.getF();
					}
				}
			}
		}
		
		return namespace;
	}
	
//	protected String getReservedPrefixOfLocalPrefixNS(String namespace) {
//		return((String)localPrefixNS.get(namespace));
//	}
	
	private Hashtable localPrefixNS4PortTye=new Hashtable();
	private static final String PLNK_PREFIX = "plnk";
	private static final String PLNK_NS = "http://schemas.xmlsoap.org/ws/2003/05/partner-link/";
	private static final String LINKTYPE_SUFFIX = "LT";
}
