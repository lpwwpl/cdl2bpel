package edu.xjtu.cdl2bpel.cdl.test;


import java.io.ByteArrayOutputStream;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl.util.CDLSerAndDeser;

public class CDLResolverTest {

	public static void main(String args[]) {
		try {
			Package cdlpack = CDLResolver.getPackageFromCDLFile(
//					"cdl/workunit-with-repeat.cdl"
//					"cdl/choreo-with-subchoreo.cdl"
					"cdl/VerifCorrect.cdl"
					);
		
			RoleType[] roleTypes = new RoleType[] {
				CDLPackageUtil.getRoleType(cdlpack,"Assessor")
//				CDLPackageUtil.getRoleType(cdlpack,"LoanApproval"),
//				CDLPackageUtil.getRoleType(cdlpack,"ApprovalCoordinator") 
			};
			
			ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			CDLSerAndDeser.outputCDL2XMI(cdlpack, baos);
//			CDLResolver.save(cdlpack,baos);
			System.out.println(baos);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
