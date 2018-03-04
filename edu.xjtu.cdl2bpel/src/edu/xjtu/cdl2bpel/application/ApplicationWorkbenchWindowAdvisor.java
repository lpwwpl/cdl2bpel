package edu.xjtu.cdl2bpel.application;

import org.eclipse.jface.action.IStatusLineManager;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import edu.xjtu.cdl2bpel.plugin.CDL2BPELPlugin;
import edu.xjtu.cdl2bpel.plugin.PluginImages;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
	private Image statusImage;

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
    	return new ApplicationActionBarAdvisor(configurer);
        
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(true);
        configurer.setShowMenuBar(true);
        configurer.setShowPerspectiveBar(true);
        configurer.setTitle("CDL2BPEL");
        configurer.setShowStatusLine(true);
        configurer.setShowProgressIndicator(true);
    }

	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#postWindowOpen()
	 */
	public void postWindowOpen() {
		// TODO Auto-generated method stub
		initStatusLine();
	}
	private void initStatusLine() {
		statusImage = PluginImages.getImage("link.gif");
		IStatusLineManager statusline = getWindowConfigurer()
				.getActionBarConfigurer().getStatusLineManager();
		statusline.setMessage(statusImage, "XJTU CDL2BPEL");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub
		if(statusImage != null)
			statusImage.dispose();
	}	
}
