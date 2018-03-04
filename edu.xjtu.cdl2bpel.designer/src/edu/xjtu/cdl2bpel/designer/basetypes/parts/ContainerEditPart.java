
package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;

import edu.xjtu.cdl2bpel.designer.basetypes.policies.TypeComponentEditPolicy;
import edu.xjtu.cdl2bpel.designer.basetypes.policies.TypeContainerEditPolicy;
import edu.xjtu.cdl2bpel.designer.basetypes.policies.TypeTreeContainerEditPolicy;


public class ContainerEditPart extends BaseTypeEditPart {


	public ContainerEditPart(Object element) {
		super(element);
	}


	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONTAINER_ROLE,
				new TypeContainerEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new TypeComponentEditPolicy());
//		installEditPolicy(EditPolicy.TREE_CONTAINER_ROLE, new TypeTreeContainerEditPolicy());
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
	}
}

