package edu.xjtu.cdl2bpel.mapping.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class CDl2BPELMapping2WSDLAction implements IWorkbenchWindowActionDelegate  {

	private IWorkbenchWindow window;

	@Override
	public void dispose() {
		
		
	}

	@Override
	public void init(IWorkbenchWindow window) {
		
		this.window = window;
	}

	@Override
	public void run(IAction action) {
		
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		
	}
}

