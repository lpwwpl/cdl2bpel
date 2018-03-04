package edu.xjtu.cdl2bpel.cdl2wsdl.util;

import java.io.File;
import java.util.List;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2wsdl.CDL2RoleMatrixWSDLGeneratorLpw;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractCDLInfo2WSDLInfo;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractCDLInfo2WSDLInfoImpl;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractMessageInfo2Doc;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractMessageInfo2DocImpl;
import edu.xjtu.cdl2bpel.cdl2wsdl.WSDLDefinitions;
import edu.xjtu.cdl2bpel.common.ResourceProperties;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CDL2WSDLGeneratorImpl implements CDL2WSDLGenerator {

	//Store All RoleTypeMatrix and corresponding namespace 
	private List<Pair<RoleType[], String>> pairs = null;
	//The path the WSDL result File to be generated
	private String destination = null;
	private ResourceProperties pros = null;
	//The implementation of refine CDL info to WSDL Doc
	private ExtractMessageInfo2Doc extractMessageInfo2Doc = null;
	//The CDL Package reference,the child of CDL2WSDLGeneratorImpl
	private Package cdlpack = null;
	private GlobalArchitecture sd = null;
	
	public CDL2WSDLGeneratorImpl(Package cdlpack, String destination,List<Pair<RoleType[], String>> pairs) {
		this.destination = destination;
		this.pairs = pairs;
		this.cdlpack = cdlpack;
		ExtractCDLInfo2WSDLInfo extractCDLInfo2WSDLInfo = new ExtractCDLInfo2WSDLInfoImpl(
				cdlpack);
		extractCDLInfo2WSDLInfo.extractCDLInfo2WSDLInfo();
		extractMessageInfo2Doc = new ExtractMessageInfo2DocImpl(
				extractCDLInfo2WSDLInfo.getOutputNSPrefix(),
				extractCDLInfo2WSDLInfo.getMessages());
	}

	public CDL2WSDLGeneratorImpl(Package cdlpack, ResourceProperties pros,
			List<Pair<RoleType[], String>> pairs) {
		this.pros = pros;
		this.pairs = pairs;
		this.cdlpack = cdlpack;
		ExtractCDLInfo2WSDLInfo extractCDLInfo2WSDLInfo = new ExtractCDLInfo2WSDLInfoImpl(
				cdlpack);
		extractCDLInfo2WSDLInfo.extractCDLInfo2WSDLInfo();
		extractMessageInfo2Doc = new ExtractMessageInfo2DocImpl(
				extractCDLInfo2WSDLInfo.getOutputNSPrefix(),
				extractCDLInfo2WSDLInfo.getMessages());
	}

	/**
	 * Generate WSDL Doc for each roleTypeMatrix,traverse all RoleType[] matrix.
	 * 
	 */
	public void generateWSDL2DestinationFile()
			throws CDL2WSDLGeneratorException {
		for (Pair<RoleType[], String> theRoleTypeMatrix : pairs) {
			String fileName = DefaultTNS.getSuffix(theRoleTypeMatrix.getSecond());
			String theAddress = theRoleTypeMatrix.getSecond();
			String path = getFileName(destination, cdlpack, fileName);
			CDL2WSDLDocContext4EachPair eachPairContext = new CDL2WSDLDocContext4EachPair(cdlpack,pairs,theRoleTypeMatrix);
			generateWSDL2DestinationFile(eachPairContext,theRoleTypeMatrix.getFirst(), path,
					theAddress);
		}
		List<Pair<String, Document>> messageDocs = extractMessageInfo2Doc
				.getMessageDocs();
		for (Pair<String, Document> pair : messageDocs) {
			String fileName = pair.getE();
			String path = getFileName(destination, cdlpack, fileName);
			saveWSDLDocument(path, pair.getF());
		}
	}

	/**
	 * Generate the WSDL Doc of the Specific roleTypeMatrix.
	 * 
	 * @param eachPairContext
	 * @param theRoleTypeMatrix
	 * @param destination the path where the result WSDL Doc generated
	 * @param theAddress the targetNamespace of The specific roleTypeMatrix
	 * @throws CDL2WSDLGeneratorException
	 */
	public void generateWSDL2DestinationFile(CDL2WSDLDocContext4EachPair eachPairContext,RoleType[] theRoleTypeMatrix,
			String destination, String theAddress)
			throws CDL2WSDLGeneratorException {
		CDL2RoleMatrixWSDLGeneratorLpw temp = new CDL2RoleMatrixWSDLGeneratorLpw(
				eachPairContext.getGlobalArchitecture(),pairs,theRoleTypeMatrix, theAddress);
		Document doc = temp.execute(cdlpack);
		saveWSDLDocument(destination, doc);
	}

	protected static org.w3c.dom.Document loadWSDLDocument(String path)
			throws CDL2WSDLGeneratorException {
		org.w3c.dom.Document ret = null;

		java.io.File f = new java.io.File(path);
		if (f.exists()) {

			try {
				// Transform the text representation to DOM
				java.io.InputStream xmlstr = new java.io.FileInputStream(path);

				ret = XMLUtils.loadDocument(xmlstr);

				xmlstr.close();

			} catch (Exception e) {
				int index = path.lastIndexOf("/");
				String wsdlname = path;

				if (index != -1) {
					wsdlname = path.substring(index + 1);
				}
				throw new CDL2WSDLGeneratorException(
						"Failed to load WSDL definition '" + wsdlname
								+ "' - please check that the "
								+ "contents is well-formed WSDL", e);
			}
		}

		return (ret);
	}

	protected void saveWSDLDocument(String path, org.w3c.dom.Document doc)
			throws CDL2WSDLGeneratorException {

		// Transform the DOM represent to text
		try {
			String text = XMLUtils.getText(doc, true);

			java.io.FileOutputStream xmlstr = new java.io.FileOutputStream(path);
			xmlstr.write(text.getBytes());

			xmlstr.flush();

			xmlstr.close();
		} catch (Exception e) {
			int index = path.lastIndexOf("/");
			String wsdlname = path;

			if (index != -1) {
				wsdlname = path.substring(index + 1);
			}
			throw new CDL2WSDLGeneratorException(
					"Failed to save WSDL definition '" + wsdlname + "'", e);
		}
	}

	protected static String getFileName(String destination, Package cdlpack,
			String fileName) {
		String subdirname = WSDLDefinitions.getWSDLComponent(cdlpack);
		String dirname = destination + "/" + subdirname;

		java.io.File f = new java.io.File(dirname);
		if (f.exists() == false) {
			f.mkdirs();
		}

		String ret = dirname + "/" + fileName
				+ WSDLDefinitions.FILE_EXTENSION_SEPARATOR
				+ WSDLDefinitions.FILE_EXTENSION;

		return (ret);
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

	public String getDirOfCDLGenerateResult(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack) {
		String subdirname = WSDLDefinitions.getWSDLComponent(cdlpack);
		String dirname = destination + File.separator + subdirname;

		File dir = new File(dirname);
		if (dir.exists() == false) {
			dir.mkdirs();
		}

		return (dirname);
	}
	
	@Override
	public void generateWSDL2ResourceProperties()
			throws CDL2WSDLGeneratorException {
		int numOfRoleMatrix = 1;
		for (Pair<RoleType[], String> theRoleTypeMatrix : pairs) {
			String fileName = DefaultTNS.getSuffix(theRoleTypeMatrix.getSecond());
			String theAddress = theRoleTypeMatrix.getSecond();
			String path = getFileName(destination, cdlpack, fileName);
			CDL2WSDLDocContext4EachPair eachPairContext = new CDL2WSDLDocContext4EachPair(cdlpack,pairs,theRoleTypeMatrix);
			generateWSDL2DestinationFile(eachPairContext,theRoleTypeMatrix.getFirst(), path,
					theAddress);
			numOfRoleMatrix++;
		}
		
		List<Pair<String, Document>> messageDocs = extractMessageInfo2Doc
				.getMessageDocs();
		for (Pair<String, Document> pair : messageDocs) {
			String fileName = pair.getE();
			String path = getFileName(destination, cdlpack, fileName);
			saveWSDLDocument(path, pair.getF());
		}
	}
}
