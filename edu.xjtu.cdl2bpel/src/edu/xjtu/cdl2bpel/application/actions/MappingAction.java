package edu.xjtu.cdl2bpel.application.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class MappingAction extends Action implements IWorkbenchWindowActionDelegate{

	private IWorkbenchWindow fWindow;
	
	public MappingAction() {
		setEnabled(true);
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		fWindow= null;
	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		fWindow= window;
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		InputDialog inputDlg = new InputDialog(fWindow.getShell(), "input a CDL File name", "", "",
				new IInputValidator() {

					@Override
					public String isValid(String newText) {
						try{
							Float.parseFloat(newText);
						} catch(Exception ex) {
							return "Input a File name ends with '.cdl'";
						}
						return null;
					}

				});
		String str = null;
		if(inputDlg.open()==InputDialog.OK){
			str = inputDlg.getValue();
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
