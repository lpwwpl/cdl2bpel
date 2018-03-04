package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.RoleType;

public interface RoleTypeInfo {
	public List getPortTypes();
	public PortTypeBehaviorOfRoleTypeInfo getPortTypeOfCDL2WSDLByBehavior(String behaviorName);
	public RoleType getRoleType() ;
}
