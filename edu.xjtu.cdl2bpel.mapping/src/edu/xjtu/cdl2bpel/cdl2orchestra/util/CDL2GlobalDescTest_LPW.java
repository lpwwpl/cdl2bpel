package edu.xjtu.cdl2bpel.cdl2orchestra.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;

public class CDL2GlobalDescTest_LPW {

	public static void main(String args[]) {
		try {
			Package cdlpack = CDLResolver.getPackageFromCDLFile(
//					"cdl/workunit-with-repeat.cdl"
//					"cdl/choreo-with-subchoreo.cdl"
					"cdl/loanapproval.cdl"
					);
			
			RoleType[] roleTypes = new RoleType[] {
				CDLPackageUtil.getRoleType(cdlpack,"Customer")
//				CDLPackageUtil.getRoleType(cdlpack,"Assessor"),
//				CDLPackageUtil.getRoleType(cdlpack,"LoanApproval"),
//				CDLPackageUtil.getRoleType(cdlpack,"ApprovalCoordinator") 
			};
			
//			ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
//			CDLResolver.save(cdlpack,baos,"UTF-8");
//			System.out.println(baos);
			
			CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(roleTypes);
			temp.execute(cdlpack);
			
//			CDL2OrchesProjector cdl2orchesProjector = new CDL2OrchesProjector(roleTypes);
//			CDL2RoleRelevanceProjector cdl2RoleRelevanceProjector = new CDL2RoleRelevanceProjector(
//					cdl2orchesProjector, roleTypes);
//			cdlpack.visit(cdl2RoleRelevanceProjector);
			GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();			
			ByteArrayOutputStream baos1 = new java.io.ByteArrayOutputStream();
			save(globalArchitecture,baos1,"UTF-8");
			System.out.println(baos1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void save(GlobalArchitecture desc,
			java.io.OutputStream os, String encoding) throws Exception {

		desc = (GlobalArchitecture)org.eclipse.emf.ecore.util.EcoreUtil.copy(desc);

		final org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl xmi =
			new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl();
		xmi.getContents().add(desc);
		
		if (encoding != null) {
			xmi.setEncoding(encoding);
		}
		
		try {
			xmi.doSave(os, xmi.getDefaultSaveOptions());
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
