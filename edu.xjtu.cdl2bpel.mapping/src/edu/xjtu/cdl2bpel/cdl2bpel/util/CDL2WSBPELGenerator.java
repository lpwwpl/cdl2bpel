package edu.xjtu.cdl2bpel.cdl2bpel.util;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.Pair;

public interface CDL2WSBPELGenerator {

	public Document generateBPEL2DestinationFile(Package cdlPackage);
	
	public Document generateBPEL2ResourceProperties(Package cdlPackage);
	public Document generateBPEL2DestinationFile(Package cdlPackage, Pair<RoleType[],String> theRoleTypeMatrix,	String destination);
	public void saveDocument(String path, org.w3c.dom.Document doc)
			throws Exception;
	
	public String getDirOfCDLGenerateResult(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack);
}
