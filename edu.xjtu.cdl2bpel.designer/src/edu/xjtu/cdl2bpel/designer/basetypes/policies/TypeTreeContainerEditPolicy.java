
package edu.xjtu.cdl2bpel.designer.basetypes.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.TreeContainerEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;


public class TypeTreeContainerEditPolicy extends TreeContainerEditPolicy {

	protected Command getAddCommand(ChangeBoundsRequest request){
		return(null);
	}

	protected Command getCreateCommand(CreateRequest request){
		return(null);
	}

	protected Command getMoveChildrenCommand(ChangeBoundsRequest request){
		return(null);
	}
}

