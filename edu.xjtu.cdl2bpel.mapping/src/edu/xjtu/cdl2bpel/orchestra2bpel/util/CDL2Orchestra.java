package edu.xjtu.cdl2bpel.orchestra2bpel.util;

import java.io.ByteArrayOutputStream;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;

public class CDL2Orchestra {

	public static Package getCDLPackage(String path) {
		Package cdlpack = CDLResolver.getPackageFromCDLFile(path);
		return cdlpack;
	}

	public static GlobalArchitecture generate(Package cdlpack,
			RoleType[] roleTypes) {

//		RoleType[] roleTypes = new RoleType[] {
//				// CDLPackageUtil.getRoleType(cdlpack,"BuyerRoleType")
//				CDLPackageUtil.getRoleType(cdlpack, "LoanApproval"),
//				CDLPackageUtil.getRoleType(cdlpack, "ApprovalCoordinator") };
		ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
				roleTypes);
		temp.execute(cdlpack);
		GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();
		return globalArchitecture;
	}
}
