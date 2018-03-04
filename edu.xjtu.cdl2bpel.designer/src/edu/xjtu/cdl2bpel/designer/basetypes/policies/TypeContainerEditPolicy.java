
package edu.xjtu.cdl2bpel.designer.basetypes.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.TreeContainerEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import edu.xjtu.cdl2bpel.designer.basetypes.commands.CreateBaseTypesComponentCommand;
import edu.xjtu.cdl2bpel.designer.basetypes.parts.BaseTypeEditPart;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;


public class TypeContainerEditPolicy extends TreeContainerEditPolicy {


	protected Command getCreateCommand(CreateRequest request) {
		CreateBaseTypesComponentCommand ret=null;
		
		if (getHost() instanceof BaseTypeEditPart &&
				ModelSupport.isValidTarget(request.getNewObject(),
						((BaseTypeEditPart)getHost()).getModel())) {
			BaseTypeEditPart part=(BaseTypeEditPart)getHost();
	
			ret = new CreateBaseTypesComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());
		}
		
		return(ret);
	}
	
	protected Command getAddCommand(ChangeBoundsRequest request) {
		Command ret=null;
		
		return(ret);
	}
	
	protected Command getMoveChildrenCommand(ChangeBoundsRequest request) {
		Command ret=null;
		
		return(ret);
	}
}

