package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.Pair;

public class ExtractMessageInfo2DocImpl implements ExtractMessageInfo2Doc{

	private java.util.List messages = null;
	private static final String WSDL11_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/";
	private static final String TARGETNAMESPACE_ATTR = "targetNamespace";
	private static final String NAME_ATTR = "name";
	private static final String MESSAGE_ATTR = "message";
	private static final String TYPE_ATTR = "type";
	public static final String XMLNS = "xmlns";
	public static final String XMLNS_SEPARATOR = ":";
	public static final String TNS_PREFIX = "tns";
	private Hashtable nsPrefix = null;
	private List<MessageInfo> messageInfos = null;
	private List<Pair<String,Document>> nsDocuments = null;
	
	public ExtractMessageInfo2DocImpl(Hashtable nsPrefix,List messages) {
		this.messages = messages;
		this.nsPrefix = nsPrefix;
		this.messageInfos = new ArrayList<MessageInfo>();
		Enumeration keys = nsPrefix.keys();
		while(keys.hasMoreElements()) {
			MessageInfo messageInfo = new MessageInfo((String)keys.nextElement());
			messageInfos.add(messageInfo);
		}
		nsDocuments =  new ArrayList<Pair<String,Document>>();
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
	
	public MessageInfo getTheMessageInfo(String namespace) {
		MessageInfo messageInfo = null;
		for(MessageInfo theMessageInfo:messageInfos) {
			if(theMessageInfo.getNamespace().equals(namespace)) {
				messageInfo = theMessageInfo;
			}
		}
		return messageInfo;
	}
	
	public List<Pair<String,Document>> getMessageDocs() {
		
		Iterator iter = messages.iterator();
		for (;iter.hasNext();) {
			MessageOfOperation message = (MessageOfOperation) iter.next();
			String namespaceOfMessage = null;
			if(message.getElementNamespace()!=null) {
				namespaceOfMessage=message.getElementNamespace();
			} else if(message.getFaultNamespace()!=null) {
				namespaceOfMessage=message.getFaultNamespace();
			} else if(message.getTypeNamespace()!=null) {
				namespaceOfMessage = message.getTypeNamespace();
			}
			if(getTheMessageInfo(namespaceOfMessage)!=null) {
				getTheMessageInfo(namespaceOfMessage).addMessageOfOperation(message);
			}
		}
		
		for(MessageInfo messageInfo:messageInfos) {
			System.out.println(messageInfo.getNamespace()+messageInfo.getMessages());
			for(MessageOfOperation messageLpw:messageInfo.getMessages()) {
				System.out.println(messageLpw.getName());
			}
		}
		
		Iterator messageInfo_iter = messageInfos.iterator();
		for (;messageInfo_iter.hasNext();) {
			Pair<String,Document> pair = new Pair();
			Document document = createDocument();
			Element defn = document.createElement("definitions");
			MessageInfo messageInfo = (MessageInfo) messageInfo_iter.next();
			defn.setAttribute(XMLNS, WSDL11_NAMESPACE);
			document.appendChild(defn);
			defn.setAttribute(TARGETNAMESPACE_ATTR, messageInfo.getNamespace());
			defn.setAttribute(XMLNS + XMLNS_SEPARATOR + TNS_PREFIX,  messageInfo.getNamespace());
			
			pair.setE((String)nsPrefix.get(messageInfo.getNamespace()));
			pair.setF(document);
			for(MessageOfOperation message:messageInfo.getMessages()){
				org.w3c.dom.Element elem = document.createElement(MESSAGE_ATTR);
				String type = message.getTypeStringValue();
				elem.setAttribute(NAME_ATTR, type);

				if (defn.getFirstChild() == null) {
					defn.appendChild(elem);
				} else {
					defn.insertBefore(elem, defn.getFirstChild());
				}
			}
			nsDocuments.add(pair);
		}
		
		return nsDocuments;
	}
}
