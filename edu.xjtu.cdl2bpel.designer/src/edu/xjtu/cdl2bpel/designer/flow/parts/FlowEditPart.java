

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.emf.common.notify.Notification;



public class FlowEditPart extends SequentialGroupEditPart {

	

	public FlowEditPart(Object component,
			FlowSelector selector) {
		super(component, selector);
		
		m_flowSelector = selector;
	}
		
    public void notifyChanged(Notification notification) {
        int type = notification.getEventType();
        
        super.notifyChanged(notification);

        if (m_flowSelector != null) {
        	
            if (type == Notification.SET) {
            	m_flowSelector.updateList();
            }
        }
    }
	
	private FlowSelector m_flowSelector=null;
}

