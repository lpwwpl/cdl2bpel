

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;

import edu.xjtu.cdl2bpel.designer.flow.policies.FlowContainerEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowContainerXYLayoutEditPolicy;



public abstract class FlowContainerEditPart extends BaseTypeEditPart {

	

	public FlowContainerEditPart(Object element) {
		super(element);
	}

	

	protected IFigure createFigure() {
		return(null);
	}

	

	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONTAINER_ROLE,
				new FlowContainerEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new FlowContainerXYLayoutEditPolicy());
	}

	

	public void notifyChanged(Notification notification) {
		int 	type = notification.getEventType();
		
		switch( type ) {
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
				
				refreshChildren();
				break;
				
			case Notification.SET:
				refreshVisuals();
				break;
		}
		
		super.notifyChanged( notification );
	}
}

