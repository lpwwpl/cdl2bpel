

package edu.xjtu.cdl2bpel.designer.flow.commands;

import edu.xjtu.cdl2bpel.designer.flow.parts.FlowSelector;



public class CreateFlowTopLevelComponentCommand
			extends CreateFlowComponentCommand {
	
	public CreateFlowTopLevelComponentCommand(FlowSelector flowSelector) {
		m_flowSelector = flowSelector;
	}
	
	public void redo() {
		super.redo();	
		m_flowSelector.updateList();
		
		
			m_flowSelector.focus(getChild());
		
	}
	
	public void undo() {
		super.undo();	
		m_flowSelector.updateList();
	}

	private FlowSelector m_flowSelector=null;
}

