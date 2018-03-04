package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

public interface OperationOfPortTypeBehavior {
	
	public String getName();
	
	public List getMessages();
	
	public PortTypeBehaviorOfRoleTypeInfo getBelongedPortTypeOfCDL2WSDL();
	
	public MessageOfOperation getMessage(String faultNamespace,
			String faultName, int mesgType);
}
