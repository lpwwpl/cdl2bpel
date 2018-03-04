

package edu.xjtu.cdl2bpel.designer.editor.properties;

import org.eclipse.ui.views.properties.tabbed.*;
import org.eclipse.gef.commands.*;



public class DesignerTabbedPropertySheetPage extends TabbedPropertySheetPage {

	

	public DesignerTabbedPropertySheetPage(
			ITabbedPropertySheetPageContributor contributor,
			CommandStack commandStack) {
		super(contributor);
		
		m_commandStack = commandStack;
		m_contributor = contributor;
	}
	
	

	public CommandStack getCommandStack() {
		return(m_commandStack);
	}
	
	

	public org.eclipse.core.resources.IResource getResource() {
		org.eclipse.core.resources.IResource ret=null;
		
		if (m_contributor instanceof org.eclipse.ui.part.MultiPageEditorPart) {
			ret = (org.eclipse.core.resources.IResource)
				((org.eclipse.ui.part.MultiPageEditorPart)m_contributor).
						getEditorInput().getAdapter(
						org.eclipse.core.resources.IResource.class);
		}
		
		return(ret);
	}
	
	private CommandStack m_commandStack=null;
	private ITabbedPropertySheetPageContributor m_contributor=null;
}

