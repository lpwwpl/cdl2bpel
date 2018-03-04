

package edu.xjtu.cdl2bpel.designer.flow.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.designer.flow.commands.SetConstraintCommand;



public class FlowComponentLayoutEditPolicy extends FlowLayoutEditPolicy {

	

	protected Command createAddCommand(EditPart child, EditPart constraint) {
		
		return null;
	}

	protected Command createMoveChildCommand(EditPart child, EditPart constraint) {
		
		return null;
	}

	

	protected Command createChangeConstraintCommand( EditPart child,
													 Object constraint) {
		SetConstraintCommand locationCommand = new SetConstraintCommand();
		locationCommand.setPart((CDLElement)child.getModel());
		locationCommand.setLocation((Rectangle)constraint);
		return locationCommand;
	}

	

	protected Command getCreateCommand(CreateRequest request) {
		Command	createCommand = null;
		
		return createCommand;
	}

	

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	

	protected EditPolicy createChildEditPolicy(EditPart child) {
		
		

			return super.createChildEditPolicy( child );
		
	}
	
	

	protected Dimension getMinimumSizeFor(GraphicalEditPart child) {
		return child.getContentPane().getMinimumSize();
	}
}

