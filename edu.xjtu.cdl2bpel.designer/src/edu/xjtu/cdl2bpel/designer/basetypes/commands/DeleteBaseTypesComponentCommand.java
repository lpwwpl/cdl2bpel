
package edu.xjtu.cdl2bpel.designer.basetypes.commands;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;


public class DeleteBaseTypesComponentCommand
			extends org.eclipse.gef.commands.Command {
	
	public DeleteBaseTypesComponentCommand() {
	}
	
	public boolean canExecute() {
		boolean ret=false;
		
		if (m_parent != null && m_child != null) {
			ret = true;
		}
		
		return(ret);
	}
	

	public void execute() {
		ModelSupport.removeChild(m_parent, m_child);		
	}
	
	public Object getParent() {
		return(m_parent);
	}
	
	public void redo() {
		ModelSupport.removeChild(m_parent, m_child);
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
	}

	private Object m_child=null;
	private Object m_parent=null;
	private int m_index = -1;
}

