package edu.xjtu.cdl2bpel.cdl2wsdl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class AbstractWSDLInfo2DocProjectorImpl {

	protected static final String DEFINITIONS = "definitions";
	protected static final String WSDL11_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/";
	protected static final String TARGETNAMESPACE_ATTR = "targetNamespace";
	protected static final String PORTTYPE = "portType";
	protected static final String OPERATION = "operation";
	protected static final String INPUT = "input";
	protected static final String OUTPUT = "output";
	protected static final String FAULT = "fault";
	protected static final String NAME_ATTR = "name";
	protected static final String MESSAGE_ATTR = "message";	
	protected static final String BINDING_NAME_SUFFIX = "Binding";
	protected static final String SERVICE = "service";
	protected static final String BINDING = "binding";
	protected static final String TYPE_ATTR = "type";	
	protected static final String BINDING_ATTR = "binding";
	protected static final String LOCATION_ATTR = "location";
	protected static final String ADDRESS = "address";	
	protected static final String SOAP_ENCODING_STYLE = "http://schemas.xmlsoap.org/soap/encoding/";
	protected static final String ENCODINGSTYLE_ATTR = "encodingStyle";
	protected static final String NAMESPACE_ATTR = "namespace";
	protected static final String USE_VALUE = "encoded";
	protected static final String USE_ATTR = "use";
	protected static final String BODY = "body";
	protected static final String SOAPACTION_ATTR = "soapAction";
	protected static final String SOAP_STYLE = "rpc";
	protected static final String STYLE_ATTR = "style";
	protected static final String TRANSPORT_ATTR = "transport";
	protected static final String SOAP_TRANSPORT = "http://schemas.xmlsoap.org/soap/http";
	protected static final String PORT = "port";
	protected static final String SOAP_NS = "http://schemas.xmlsoap.org/wsdl/soap/";
	protected static final String PORT_SUFFIX = "Port";
	
	protected static final String NAMESPACE_PREFIX = "ns";

	public static final String XMLNS = "xmlns";
	public static final String XMLNS_SEPARATOR = ":";
	public static final String TNS_PREFIX="tns";
	
	protected static final String DOCUMENTATION = "documentation";	
	protected static final String SOAP_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/soap/";
	protected static final String SOAP_PREFIX = "soap";	

	protected Element definition = null;
	protected Document document = null;
	
	public void setWsdlDefinition(Element definition) {
		this.definition = definition;
	}
	
	public void setDocument(Document document) {
		this.document = document;
	}
}
