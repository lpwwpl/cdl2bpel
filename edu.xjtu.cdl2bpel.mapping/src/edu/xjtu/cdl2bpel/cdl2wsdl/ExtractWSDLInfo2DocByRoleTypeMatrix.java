package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.RoleType;

public interface ExtractWSDLInfo2DocByRoleTypeMatrix {
	
	public List<RoleTypeInfo> getRoleTypeInfoMatrix();
	
	public void extractWSDLInfo2Doc();
	
	public Document getDocument();
}
