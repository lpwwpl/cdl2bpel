package edu.xjtu.cdl2bpel.cdl2orchestra.util;

import java.io.File;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CDLPackage2XMLFile {
	public static void main(String args[]) {
		try {
			Package cdlpack = CDLResolver.getPackageFromCDLFile(
//					"cdl/workunit-with-repeat.cdl"
//					"cdl/choreo-with-subchoreo.cdl"
					"cdl/packman_new.cdl"
					);
			File f = new File("E:/lpwwpl.cdl");
			java.io.OutputStream os = System.out;
			Document doc = CDLResolver.save(cdlpack, os);	
			XMLUtils.saveDocument(doc, os, true);
//			System.out.println(os);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void save2file(File f) {
		
	}
}
