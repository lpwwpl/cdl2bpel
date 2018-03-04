package edu.xjtu.cdl2bpel.cdl2bpel.util;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.common.ResourceProperties;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CDL2WSBPELGeneratorImpl implements CDL2WSBPELGenerator {

	private List<Pair<RoleType[],String>> pairs;
	private String destination = null;
	private String tns = null;
	private ResourceProperties pros = null;
	private Hashtable localPrefixNS=new Hashtable();
	private Vector localPrefixes=new Vector();
	private int prefixNumber=1;
	private static final String PLNK_PREFIX = "plnk";
	private static final String XMLNS_SEPARATOR = ":";
	private static final String PLNK_NS = "http://schemas.xmlsoap.org/ws/2003/05/partner-link/";
	private static final String LINKTYPE_SUFFIX = "LT";
	private static final String WSDL11_NAMESPACE = "http://schemas.xmlsoap.org/wsdl/";
	
	public CDL2WSBPELGeneratorImpl(List<Pair<RoleType[],String>> pairs,String destination) {
		this.pairs = pairs;
		this.destination = destination;
	}
	
	public CDL2WSBPELGeneratorImpl(List<Pair<RoleType[],String>> pairs,ResourceProperties pros) {
		this.pairs = pairs;
		this.pros = pros;
	}

	public Document generateBPEL2ResourceProperties(Package cdlPackage) {
		String destination = getParentFolder(pros);
		for (Pair<RoleType[],String> theRoleTypeMatrix : pairs) {
			generateBPEL2DestinationFile(cdlPackage, theRoleTypeMatrix, destination);
		}
		return null;
	}

	public Document generateBPEL2DestinationFile(Package cdlPackage) {
		for (Pair<RoleType[],String> theRoleTypeMatrix : pairs) {
			generateBPEL2DestinationFile(cdlPackage, theRoleTypeMatrix, destination);
		}
		return null;
	}

	protected static String getParentFolder(ResourceProperties props) {
		String ret = props.getProperty(null,
				ResourceProperties.RESOURCE_LOCATION_PROPERTY);

		if (ret != null) {
			int index = ret.lastIndexOf("/");
			ret = ret.substring(0, index);
		}

		return (ret);
	}

	public Document generateBPEL2DestinationFile(Package cdlPackage, Pair<RoleType[],String> theRoleTypeMatrix,
			String destination) {

		org.w3c.dom.Document ret = null;
		
		CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
				theRoleTypeMatrix.getFirst());
		temp.execute(cdlPackage);
		GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();			
		
		
		Document document= XMLUtils.createDocument();
		Orchestra2BPELContext context=new Orchestra2BPELContext(pairs,theRoleTypeMatrix);
//		context.setCDLPack(cdlPackage);
		context.setDocument(document);
//		context.setNamespaces(namespaces);
		globalArchitecture.transtorm(context);
		
		ret = context.getDocument();
		org.w3c.dom.Document defns=
			generateDefinitions(globalArchitecture, destination);
		String bpelPath = getBPELFileName(destination, cdlPackage,
				getDocName(theRoleTypeMatrix.getSecond()));
		String wsdlPath = getWSDLFileName(destination, cdlPackage,
				getDocName(theRoleTypeMatrix.getSecond()));
		try {
			saveDocument(bpelPath, ret);
			saveDocument(wsdlPath, defns);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ret;
	}

	public Document generateBPEL2SystemOut(Package cdlPackage, Pair<RoleType[],String> theRoleTypeMatrix) {

		org.w3c.dom.Document ret = null;
		CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
				theRoleTypeMatrix.getFirst());
		temp.execute(cdlPackage);
		GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();			
		
		
		Document document= XMLUtils.createDocument();
		Orchestra2BPELContext context=new Orchestra2BPELContext(pairs,theRoleTypeMatrix);
//		context.setCDLPack(cdlPackage);
		context.setDocument(document);
		globalArchitecture.transtorm(context);
		

		ret = context.getDocument();
		org.w3c.dom.Document defns=
			generateDefinitions(globalArchitecture, destination);
		
		try {
			String text = XMLUtils.getText(ret, true);
			OutputStream fos = System.out;
			fos.write(text.getBytes());
			fos.flush();
			fos.close();
			
			String text1 = XMLUtils.getText(defns, true);
			OutputStream fos1 = System.out;
			fos1.write(text1.getBytes());
			fos1.flush();
			fos1.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ret;
	}

	public void saveDocument(String path, org.w3c.dom.Document doc)
			throws Exception {

		String text = XMLUtils.getText(doc, true);
		OutputStream fos = new java.io.FileOutputStream(path);
		fos.write(text.getBytes());
		fos.flush();
		fos.close();
	}

	public static void save(GlobalArchitecture desc, java.io.OutputStream os,
			String encoding) throws Exception {

		desc = (GlobalArchitecture) org.eclipse.emf.ecore.util.EcoreUtil
				.copy(desc);

		final org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl xmi = new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl();
		xmi.getContents().add(desc);

		if (encoding != null) {
			xmi.setEncoding(encoding);
		}

		try {
			xmi.doSave(os, xmi.getDefaultSaveOptions());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String getDirOfCDLGenerateResult(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack) {
		String subdirname = getBPELComponent(cdlpack);
		String dirname = destination + File.separator+ subdirname;

		File dir = new File(dirname);
		if (dir.exists() == false) {
			dir.mkdirs();
		}

		return (dirname);
	}
	
	protected static String getBPELFileName(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack, String fileName) {
		String subdirname = getBPELComponent(cdlpack);
		String dirname = destination + "/" + subdirname;

		java.io.File f = new java.io.File(dirname);
		if (f.exists() == false) {
			f.mkdirs();
		}

		String ret = dirname + File.separator + fileName + ".bpel";

		return (ret);
	}

	protected static String getWSDLFileName(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack, String fileName) {
		String subdirname = getBPELComponent(cdlpack);
		String dirname = destination + "/" + subdirname;

		java.io.File f = new java.io.File(dirname);
		if (f.exists() == false) {
			f.mkdirs();
		}

		String ret = dirname + "/" + fileName + ".wsdl";

		return (ret);
	}
	
	public static String getBPELComponent(Package cdlpack) {
		return (cdlpack.getName() + "_bpel");
	}

	public String getDocName(String theRoleTypeMatrixSecondStringValue) {
		String ret = "";
		ret = DefaultTNS.getSuffix(theRoleTypeMatrixSecondStringValue);
		return ret;
	}
	
	public String getDocName(RoleType[] roleTypes) {
		String ret = "";
		for (RoleType roleType : roleTypes) {
			ret += roleType.getName() + "_";
		}
		ret = ret.substring(0, ret.length() - 1);
		return ret;
	}
	
	protected org.w3c.dom.Document generateDefinitions(GlobalArchitecture sd,			
			String destination){
		org.w3c.dom.Document ret=XMLUtils.createDocument();
		
		// TODO: Check WSDL version to determine correct root nodename
		Element defns=ret.createElement("definitions");
		ret.appendChild(defns);

		//###################################################################
		defns.setAttribute(WSBPELKeywords.TARGETNAMESPACE_ATTR, "");
		
		defns.setAttribute(WSBPELKeywords.XMLNS_ATTR,
				WSDL11_NAMESPACE);

		// Add partner link type prefix/uri
		defns.setAttribute(WSBPELKeywords.XMLNS_ATTR+
				XMLNS_SEPARATOR+PLNK_PREFIX, PLNK_NS);
		
		
//		initializeProperties(defns, sd);
		localPrefixNS.put("http://www.w3.org/2001/XMLSchema", "xsd");
		initializePartnerLinkTypes(defns, sd);
		initializeNamespaces(defns, sd, localPrefixNS);
		return(ret);
	}
	
	protected void initializeNamespaces(Element description,
			GlobalArchitecture sd, java.util.Map namespaces) {
		
		java.util.Iterator iter=
					namespaces.keySet().iterator();
		while (iter.hasNext()) {
			String ns=(String)iter.next();
			String prefix=(String)namespaces.get(ns);
			
			description.setAttribute(WSBPELKeywords.XMLNS_ATTR+
					XMLNS_SEPARATOR+prefix, ns);
		}
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
	}	
	
	protected String getPrefixByNamespace(String namespace) {
		String ret=null;
		
		if (localPrefixNS.containsKey(namespace)) {
			ret = (String)localPrefixNS.get(namespace);
			
		} else {
			
				// Create new prefix
			ret = getNextPrefix();
			localPrefixNS.put(namespace, ret);
		}
		
		return(ret);
	}
	
	protected String getReservedPrefix(String namespace) {
		return((String)localPrefixNS.get(namespace));
	}

	protected String getNextPrefix() {
		String ret=null;
		
		ret = "ns"+prefixNumber++;
//		while(true) {
//			if(localPrefixes.contains(ret)) {
//				ret = null;
//				break;
//			} else {
////				ret = "ns"+prefixNumber++;
//				localPrefixes.add(ret);
//			}
//		}

		return(ret);
	}
}