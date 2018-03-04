package edu.xjtu.cdl2bpel.cdl2wsdl;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Package;

public interface ExtractCDLInfo2WSDLInfo {

	public void extractCDLInfo2WSDLInfo();
	
	public void extractCDLPackage(Package pack); 
	
	public void extractCDLInteraction(Interaction interaction);
	
	public List<RoleTypeInfo> getRoleTypeInfoMatrix();

	public void setRoleTypeInfoMatrix(List<RoleTypeInfo> roleTypeInfoMatrix) ;
	
	public Hashtable getOutputNSPrefix();
	
	public Vector getReservedPrefixes();
	
	public List<MessageOfOperation> getMessages();
}
