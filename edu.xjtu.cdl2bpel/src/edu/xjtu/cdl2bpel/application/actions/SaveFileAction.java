package edu.xjtu.cdl2bpel.application.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class SaveFileAction extends Action implements IWorkbenchWindowActionDelegate{

	private IWorkbenchWindow fWindow;
	
	public SaveFileAction() {
		this.setEnabled(true);
	}
	
	public SaveFileAction(IWorkbenchWindow fWindow) {
		setId("Save");
		setText("Save");
		this.fWindow = fWindow;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editorPart.doSave(null);
		//		if(editorPart.getClass().getName().equals("ChoreographyEditorPart")) {
//			((ChoreographyEditorPart)editorPart)
//		} else {
//			
//		}
	}

	private boolean m_editorSaving = false;

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		fWindow = null;
	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		fWindow = window;
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		run();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
}
