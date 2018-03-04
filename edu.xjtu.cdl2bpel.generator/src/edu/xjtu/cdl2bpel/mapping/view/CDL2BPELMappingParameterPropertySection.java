package edu.xjtu.cdl2bpel.mapping.view;

import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import edu.xjtu.cdl2bpel.mapping.util.DefaultTextPropertySection_lpw;

public class CDL2BPELMappingParameterPropertySection extends AbstractPropertySection {

	public CDL2BPELMappingParameterPropertySection() {
	}
	
    public void aboutToBeShown() {
    	super.aboutToBeShown();
    	threshold.aboutToBeShown();
    }
    
    public void aboutToBeHidden() {
    	super.aboutToBeHidden();
    	threshold.aboutToBeHidden();
    }
    
    public void createControls(Composite parent,
            TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);
	
        Composite composite = getWidgetFactory()
					.createFlatFormComposite(parent);

        threshold.createControls(composite,
        		aTabbedPropertySheetPage);
    }
    
    public void setInput(IWorkbenchPart part, ISelection selection) {
        super.setInput(part, selection);
        threshold.setInput(part, selection);
    }
    
    public void refresh() {    	
    	super.refresh();
    	threshold.refresh();
    }
    
    public void dispose() {    	
    	super.dispose();
    	threshold.dispose();
    }
    
	private DefaultTextPropertySection_lpw threshold=
		new DefaultTextPropertySection_lpw("threshold",
				"threshold", "threshold");
}

