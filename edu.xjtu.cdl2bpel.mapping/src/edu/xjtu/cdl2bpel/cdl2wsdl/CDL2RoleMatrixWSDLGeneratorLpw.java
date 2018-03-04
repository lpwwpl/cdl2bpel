package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.Hashtable;
import java.util.List;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;

public class CDL2RoleMatrixWSDLGeneratorLpw {

	public Document doc = null;
	private RoleType[] roleTypeMatrix= null;
	private String address = null;
	private List<Pair<RoleType[], String>> pairs = null;
	private GlobalArchitecture sd = null;
	public RoleType[] getRoleTypeMatrix() {
		return roleTypeMatrix;
	}

	public void setRoleTypeMatrix(RoleType[] roleTypeMatrix) {
		this.roleTypeMatrix = roleTypeMatrix;
	}

	public CDL2RoleMatrixWSDLGeneratorLpw(GlobalArchitecture sd,List<Pair<RoleType[], String>> pairs,RoleType[] roleTypeMatrix,String address) {
		this.roleTypeMatrix = roleTypeMatrix;
		this.sd = sd;
		this.address = address;
		this.pairs = pairs;
	}
	
	public Document execute(Package cdlPackage) {
		ExtractCDLInfo2WSDLInfo extractCDLInfo2WSDLInfo = new ExtractCDLInfo2WSDLInfoImpl(cdlPackage);
		extractCDLInfo2WSDLInfo.extractCDLInfo2WSDLInfo();
		List<RoleTypeInfo> roleTypeInfoMatrix = extractCDLInfo2WSDLInfo.getRoleTypeInfoMatrix();
		
		Hashtable nsPrefix = extractCDLInfo2WSDLInfo.getOutputNSPrefix();
		ExtractWSDLInfo2DocByRoleTypeMatrix extractWSDLInfo2Doc = new ExtractWSDLInfo2DocByRoleTypeMatrixImpl(sd,pairs,nsPrefix,roleTypeMatrix,roleTypeInfoMatrix,address);
		extractWSDLInfo2Doc.extractWSDLInfo2Doc();
		
		return extractWSDLInfo2Doc.getDocument();
	}
	
	public Document execute(ExtractCDLInfo2WSDLInfo extractCDLInfo2WSDLInfo) {
//		ExtractCDLInfo2WSDLInfo extractCDLInfo2WSDLInfo = new ExtractCDLInfo2WSDLInfoImpl(cdlPackage);
//		extractCDLInfo2WSDLInfo.extractCDLInfo2WSDLInfo();
		List<RoleTypeInfo> roleTypeInfoMatrix = extractCDLInfo2WSDLInfo.getRoleTypeInfoMatrix();
		
		Hashtable nsPrefix = extractCDLInfo2WSDLInfo.getOutputNSPrefix();
		ExtractWSDLInfo2DocByRoleTypeMatrix extractWSDLInfo2Doc = new ExtractWSDLInfo2DocByRoleTypeMatrixImpl(sd,pairs,nsPrefix,roleTypeMatrix,roleTypeInfoMatrix,address);
		extractWSDLInfo2Doc.extractWSDLInfo2Doc();
		
		return extractWSDLInfo2Doc.getDocument();
	}
}
