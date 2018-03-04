

package edu.xjtu.cdl2bpel.designer.flow.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import edu.xjtu.cdl2bpel.designer.flow.commands.DeleteFlowComponentCommand;
import edu.xjtu.cdl2bpel.designer.flow.parts.FlowSelector;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class FlowComponentEditPolicy extends ComponentEditPolicy {

	public FlowComponentEditPolicy(FlowSelector selector) {
		m_flowSelector = selector;
	}
	
	

	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		Object parent = (getHost().getParent().getModel());
		DeleteFlowComponentCommand deleteCmd = new DeleteFlowComponentCommand(m_flowSelector);
		
		Object child=(getHost().getModel());
		
		deleteCmd.setChild(child);
		if (child != null) {
			deleteCmd.setParent(ModelSupport.getParent(child));
		}
		
		if (parent != null && child != null) {
			java.util.List list=ViewSupport.getFlowChildren(parent);
			int index=list.indexOf(child);
			
			deleteCmd.setIndex(index);
		}
		
		return(deleteCmd);
	}
	
	private FlowSelector m_flowSelector=null;
}

