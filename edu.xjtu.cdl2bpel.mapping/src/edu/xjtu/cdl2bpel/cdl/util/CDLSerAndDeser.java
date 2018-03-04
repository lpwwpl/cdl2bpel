package edu.xjtu.cdl2bpel.cdl.util;

import edu.xjtu.cdl2bpel.cdl.Package;

public class CDLSerAndDeser {
	
	public static void main(String args[]) {
		
	}
	
	public static void outputCDL2XMI(Package cdlPackage,
			java.io.OutputStream os) {
		final org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl xmi = new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl();
		xmi.getContents().add(cdlPackage);
		xmi.setEncoding("UTF-8");
		try {
			xmi.doSave(os, xmi.getDefaultLoadOptions());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void outputXMI2cdl(Package cdlPackage,
			java.io.OutputStream os) {
	}
}
