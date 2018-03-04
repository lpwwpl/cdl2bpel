package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

public interface PortTypeBehaviorOfRoleTypeInfo {

	public List getOperationOfCDL2WSDL();
	
	public String getName();
	
	public String getBehaviorName();
	
	public String getNamespace();

	public void setNamespace(String namespace);
	
	public java.util.List getOperations(String name,
			String requestNamespace, String requestType,
			String responseNamespace, String responseType);
}
