

package edu.xjtu.cdl2bpel.designer.editor.properties;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;



public class AllPropertySheetSection
	extends org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection {

	public AllPropertySheetSection() {
	}
	
    public void createControls(Composite parent,
            TabbedPropertySheetPage aTabbedPropertySheetPage) {
    	super.createControls(parent, aTabbedPropertySheetPage);

        if (aTabbedPropertySheetPage instanceof DesignerTabbedPropertySheetPage) {
        	m_commandStack = ((DesignerTabbedPropertySheetPage)aTabbedPropertySheetPage).getCommandStack();
        }

        page.setRootEntry(new org.eclipse.gef.ui.properties.UndoablePropertySheetEntry(
                m_commandStack));
    }
    
	private CommandStack m_commandStack=null;
}

