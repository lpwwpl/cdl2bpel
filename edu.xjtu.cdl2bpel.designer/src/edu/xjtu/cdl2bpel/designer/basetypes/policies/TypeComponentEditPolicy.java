
package edu.xjtu.cdl2bpel.designer.basetypes.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import edu.xjtu.cdl2bpel.cdl.Namespace;

import edu.xjtu.cdl2bpel.designer.basetypes.commands.DeleteBaseTypesComponentCommand;
import edu.xjtu.cdl2bpel.designer.basetypes.parts.BaseTypeEditPart;
import edu.xjtu.cdl2bpel.designer.basetypes.parts.CategoryEditPart;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;


public class TypeComponentEditPolicy extends ComponentEditPolicy {


	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		DeleteBaseTypesComponentCommand deleteCmd = new DeleteBaseTypesComponentCommand();
		
		Object child=getHost().getModel();
		
		deleteCmd.setChild(child);
		
		if (getHost().getParent() instanceof BaseTypeEditPart) {
			deleteCmd.setParent(((BaseTypeEditPart)getHost().getParent()).getModel());
			
		} else if (getHost().getParent() instanceof CategoryEditPart) {
			if (child != null &&
					ModelSupport.getParent(child) != null) {
				deleteCmd.setParent(ModelSupport.getParent(child));
			

			} else if (child instanceof Namespace) {
				deleteCmd.setParent(((Namespace)child).eContainer());
			}
		}

		return deleteCmd;
	}
}

