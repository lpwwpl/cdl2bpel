package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl;

/**
 * This class implements the NoAction interface, to provide a
 * proxy object for a "no action" activity which represents the
 * fact that no other projected activities were relevant. This
 * means that it does not map onto a real 'noAction' activity
 * within the CDL model.
 */
class InvisibleAction2NoActionImpl extends NoActionImpl implements NoAction {

	/**
	 * This is the constructor for the 'noAction' proxy.
	 * 
	 * @param name The name of the component
	 * @param parent The parent CDL type
	 * @param roleTypes The role types being projected
	 */
	public InvisibleAction2NoActionImpl(String name, CDLElement parent,
						RoleType[] roleTypes) {
		this.name = name;
		this.parent = parent;
		
		noAction = CDLFactory.eINSTANCE.createNoAction();
		if (roleTypes != null && roleTypes.length > 0) {
			noAction.setRoleType(roleTypes[0]);
		}
	}

	public String getDescription() {
		return(name);
	}
	
    public RoleType getRoleType() {
    	return(noAction.getRoleType());
    }
    
	public void setRoleType(RoleType value) {
	}

	public CDLElement getCDLElement() {
		return(noAction);
	}
	
	private NoAction noAction=null;
	private String name=null;
	private CDLElement parent=null;
}