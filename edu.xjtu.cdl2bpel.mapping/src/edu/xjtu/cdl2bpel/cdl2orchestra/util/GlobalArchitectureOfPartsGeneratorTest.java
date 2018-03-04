//package edu.xjtu.cdl2bpel.cdl2orchestra.util;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerConfigurationException;
//import javax.xml.transform.TransformerException;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;
//
//import org.w3c.dom.Document;
//
//import edu.xjtu.cdl2bpel.cdl.Package;
//import edu.xjtu.cdl2bpel.cdl.RoleType;
//import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
//import edu.xjtu.cdl2bpel.commons.util.XMLUtils;
//import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
//import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;
//import edu.xjtu.cdl2bpel.orchestra2bpel.util.CDL2Orchestra;
//
//public class GlobalArchitectureOfPartsGeneratorTest {
//	public static void main(String[] args) throws Exception {
//		Package cdlpack = CDL2Orchestra.getCDLPackage("cdl/packman_new.cdl");
//		RoleType[] roleTypes = new RoleType[] {
//				 CDLPackageUtil.getRoleType(cdlpack,"Assessor")
//				 ,
//				CDLPackageUtil.getRoleType(cdlpack, "LoanApproval"),
//				CDLPackageUtil.getRoleType(cdlpack, "ApprovalCoordinator") 
//				};
//		GlobalArchitectureOfPartsGenerator lpw = new GlobalArchitectureOfPartsGeneratorImpl(
//				cdlpack, roleTypes);
//		GlobalArchitecture artitecture=lpw.merge();
//		ByteArrayOutputStream baos1 = new java.io.ByteArrayOutputStream();
//		save(artitecture, baos1, "UTF-8");
//		System.out.println(baos1);
//		//GlobalArchitectureImpl globalArchitectureImpl=new GlobalArchitectureImpl();//需要把GlobalArchitectureImpl的构造方法改为protected类型的
//		Document document= XMLUtils.createDocument();
//		Orchestra2BPELContext context=new Orchestra2BPELContext(pairs);
////		context.setCDLPack(cdlpack);
//		context.setDocument(document);
//		artitecture.transtorm(context);
//		//GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();			
//		printDoc(document);
//	}
//	
//	public static void save(GlobalArchitecture desc,
//			java.io.OutputStream os, String encoding) throws Exception {
//
//		desc = (GlobalArchitecture)org.eclipse.emf.ecore.util.EcoreUtil.copy(desc);
//
//		final org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl xmi =
//			new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl();
//		xmi.getContents().add(desc);
//		
//		if (encoding != null) {
//			xmi.setEncoding(encoding);
//		}
//		
//		try {
//			xmi.doSave(os, xmi.getDefaultSaveOptions());
//		} catch(IOException ioe) {
//			ioe.printStackTrace();
//		}
//	}
//	
//	public static String docToString(Document doc) {  
//        // XML转字符串  
//        String xmlStr = "";  
//        try {  
//            TransformerFactory tf = TransformerFactory.newInstance();  
//            Transformer t = tf.newTransformer();  
//            t.setOutputProperty("encoding", "UTF-8");// 解决中文问题，试过用GBK不行  
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();  
//            t.transform(new DOMSource(doc), new StreamResult(bos));  
//            xmlStr = bos.toString();  
//        } catch (TransformerConfigurationException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } catch (TransformerException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        }  
//        return xmlStr;  
//    }  
//
//	public static void printDoc(Document doc) {
//		try {
//			String text = XMLUtils.getText(doc, true);
//			ByteArrayOutputStream xmlstr = new java.io.ByteArrayOutputStream();
//			xmlstr.write(text.getBytes());
//			xmlstr.flush();
//			xmlstr.close();
//			System.out.println(xmlstr);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//}
