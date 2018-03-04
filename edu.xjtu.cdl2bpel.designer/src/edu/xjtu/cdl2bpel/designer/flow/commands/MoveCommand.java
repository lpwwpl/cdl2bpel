

package edu.xjtu.cdl2bpel.designer.flow.commands;

import org.eclipse.gef.commands.Command;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class MoveCommand extends Command {

	

	public MoveCommand() {
		super(MoveCommand_Label);
	}

	

	public boolean canExecute() {
		
		if (m_container == null ||
				m_component == null) {
			return(false);
		}
		
		if (m_container == m_component) {
			return(false);
		}
		
		return true;
	}

	

	public void execute() {
		java.util.List list=ViewSupport.getFlowChildren(m_container);
		
		m_oldIndex = list.indexOf(m_component);

		
		ModelSupport.removeChild(m_container, m_component);
		
		
		int index=m_index;
		
		if (index > m_oldIndex) {
			index--;
		}
		ModelSupport.addChild(m_container, m_component, index);
	}

	

	public String getLabel() {
		return MoveCommand_Description;
	}

	

	public void redo() {
		execute();
	}

	

	public void undo() {
		
		
		ModelSupport.removeChild(m_container, m_component);
		
		
		ModelSupport.addChild(m_container, m_component, m_oldIndex);
	}
	
	public void setContainer(Object container) {
		m_container = container;
	}
	
	public void setComponent(Object component) {
		m_component = component;
	}
	
	public void setIndex(int index) {
		m_index = index;
	}
	
	public Object getContainer() {
		return(m_container);
	}
	
	public Object getComponent() {
		return(m_component);
	}
	
	private Object m_container=null;
	private Object m_component=null;
	private int m_index=-1;
	private int m_oldIndex=-1;

    private static final String MoveCommand_Label = "move";
	private static final String MoveCommand_Description =
		"move command";
}

