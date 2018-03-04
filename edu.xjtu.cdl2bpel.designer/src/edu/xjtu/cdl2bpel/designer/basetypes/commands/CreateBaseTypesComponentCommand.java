
package edu.xjtu.cdl2bpel.designer.basetypes.commands;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;


public class CreateBaseTypesComponentCommand
			extends org.eclipse.gef.commands.Command {
	
	public CreateBaseTypesComponentCommand() {
	}

	public void execute() {
		ModelSupport.addChild(m_parent, m_child, m_index);		
	}
	
	public Object getParent() {
		return(m_parent);
	}
	
	public void redo() {		
		ModelSupport.addChild(m_parent, m_child, m_index);
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
		ModelSupport.removeChild(m_parent, m_child);
	}

	private Object m_child=null;
	private Object m_parent=null;
	private int m_index = -1;
}

