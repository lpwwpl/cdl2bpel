

package edu.xjtu.cdl2bpel.designer.flow.commands;


import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.designer.flow.parts.FlowSelector;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;



public class DeleteFlowComponentCommand
			extends org.eclipse.gef.commands.Command {
	
	public DeleteFlowComponentCommand(FlowSelector flowSelector) {
		m_flowSelector = flowSelector;
	}
	
	

	public void execute() {
		ModelSupport.removeChild(m_parent, m_child);		

		if (m_flowSelector != null) {
			m_flowSelector.updateList();
		}
	}
	
	public Object getParent() {
		return(m_parent);
	}
	
	public void redo() {
		execute();
	}
	
	public void setChild(Object newNode) {
		m_child = newNode;
	}
	
	public void setIndex(int index) {
		m_index = index;
	}
	
	public void setParent(Object newParent) {
		m_parent = newParent;
	}
	
	public void undo() {
		ModelSupport.addChild(m_parent, m_child, m_index);
		
		if (m_flowSelector != null &&
				m_child instanceof CDLElement) {
			m_flowSelector.updateList();
			m_flowSelector.focus((CDLElement)m_child);
		}
	}

	private Object m_child=null;
	private Object m_parent=null;
	private int m_index = -1;
	private FlowSelector m_flowSelector=null;
}

