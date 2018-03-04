

package edu.xjtu.cdl2bpel.designer.flow.commands;

import org.eclipse.gef.commands.Command;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class AddCommand extends Command {

	public AddCommand () {
		super("AddChild");
	}
	
	public boolean canExecute() {
		boolean ret=false;
		
		if (m_newParent != null && m_oldParent != null &&
				m_child != null &&
				m_newParent != m_oldParent) {
			ret = true;
		}
		
		return(ret);
	}

	public void execute() {
		java.util.List list=ViewSupport.getFlowChildren(m_oldParent);
		
		m_oldIndex = list.indexOf(m_child);
		
		ModelSupport.removeChild(m_oldParent, m_child);
		ModelSupport.addChild(m_newParent, m_child, m_index);
	}

	public void redo() {
		execute();
	}

	public void setChild(Object child) {
		m_child = child;
	}

	public void setNewParent(Object parent) { 
		m_newParent = parent;
	}
	
	public Object getNewParent() {
		return(m_newParent);
	}

	public void setOldParent(Object parent) { 
		m_oldParent = parent;
	}
	
	public Object getOldParent() {
		return(m_oldParent);
	}
	
	public void setIndex(int index) {
		m_index = index;
	}

	public void undo() {
		ModelSupport.removeChild(m_newParent, m_child);
		ModelSupport.addChild(m_oldParent, m_child, m_oldIndex);
	}

	private Object m_newParent;
	private Object m_oldParent;
	private Object m_child;
	private int m_index=-1;
	private int m_oldIndex=0;
}

