

package edu.xjtu.cdl2bpel.designer.flow.parts;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import edu.xjtu.cdl2bpel.designer.model.VariableContainer;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class TopFlowEditPart extends FlowContainerEditPart {

    

    protected TopFlowEditPart(Object component,
    		FlowSelector selector) {
        super(component);
        
        m_flowSelector = selector;
    }

    

    protected IFigure createFigure() {
        FreeformLayer layer = new FreeformLayer();
        layer.setLayoutManager(new FreeformLayout());
        layer.setBorder(new LineBorder(1));
        
        return layer;
    }

    

    protected void createEditPolicies() {
    	super.createEditPolicies();
    	
		installEditPolicy(EditPolicy.NODE_ROLE, null);
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, null);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());    	
    }

    

    protected List getModelChildren() {
    	List allChildren = new LinkedList();
    	
    	if (m_flowSelector != null &&
    			m_flowSelector.getFlow() != null) {
    		
    		m_flow = m_flowSelector.getFlow();
    		
    		if (m_flow != null) {
    			allChildren.add(m_flow);
    			allChildren.add(new VariableContainer(
						m_flow));
    		}
    	}
    		
        return allChildren;
    }

    public int getChildX(BaseTypeEditPart child) {
    	int ret=super.getChildX(child);
    	
    	
    	return(ret);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=20;
		if (child.getModel() instanceof VariableContainer) {

			ret += ViewSupport.getFlowCalculatedHeight(m_flow)
					+ ViewSupport.YPADDING;

		}    	
    	return(ret);
    }

    protected void hookIntoComponent(Object element) {
    	
    	java.util.List list=getModelChildren();
    	if (list.size() == 1) {
    		Object component=list.get(0);
    		
    		if (component instanceof EObject &&
    				((EObject)component).eContainer() != element) {
    			m_flowParent = ((EObject)component).eContainer();
    			((EObject)m_flowParent).eAdapters().add(this);
    		}
    	}

    	super.hookIntoComponent(element);
    }

    

    protected void unhookFromComponent(Object element) {
     		
		if (m_flowParent instanceof EObject) {
			((EObject)m_flowParent).eAdapters().remove(this);
		}
		
    	super.unhookFromComponent(element);
    }

    

	public void notifyChanged(Notification notification) {
		int type = notification.getEventType();
		
		switch( type ) {
			case Notification.ADD:
			case Notification.ADD_MANY:				
			case Notification.REMOVE_MANY:
				break;
			
			case Notification.REMOVE:
				if (m_flowSelector != null) {
					m_flowSelector.updateList();
				}
				
				try {
					refreshChildren();
				} catch(Exception e) {
					
					
					
				}
			
				break;
			
			case Notification.SET:
				refreshVisuals();
				break;
		}
	}
	
	private FlowSelector m_flowSelector=null;
	private Object m_flow=null;
	private Object m_flowParent=null;
}

