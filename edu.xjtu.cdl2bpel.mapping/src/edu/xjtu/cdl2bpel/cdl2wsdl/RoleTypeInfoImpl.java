package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.RoleType;

public class RoleTypeInfoImpl extends WSDLElement implements RoleTypeInfo {

	private String tns = null;
	private java.util.List porTypes=new ArrayList();
	private RoleType roleType =null;
	
	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	public RoleTypeInfoImpl(String targetNamespace,RoleType roleType) {
		this.tns = targetNamespace;
		this.roleType = roleType;
	}
	
	@Override
	public List getPortTypes() {
		// TODO Auto-generated method stub
		return porTypes;
	}

	/**
	 * Get The PortType of specific behavior Of RoleTypeInfo. The behavior of RoleTypeInfo 
	 * corresponding to the PortTypeBehaviorOfRoleTypeInfo 
	 */
	public PortTypeBehaviorOfRoleTypeInfo getPortTypeOfCDL2WSDLByBehavior(String behaviorName) {
		PortTypeBehaviorOfRoleTypeInfo ret=null;
		
		if (behaviorName == null && getPortTypes().size() == 1) {
			ret = (PortTypeBehaviorOfRoleTypeInfo)getPortTypes().get(0);
			
		} else {
			java.util.Iterator iter=getPortTypes().iterator();
			while (ret == null && iter.hasNext()) {
				ret = (PortTypeBehaviorOfRoleTypeInfoImpl)iter.next();
				
				if (ret.getBehaviorName().equals(behaviorName) == false) {
					ret = null;
				}
			}
		}
		
		return(ret);
	}	
}
