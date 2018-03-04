package edu.xjtu.cdl2bpel.application.actions;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;


public class NewFileAction extends Action implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow fWindow;

	public NewFileAction() {
		this.setEnabled(true);
	}
	
	public NewFileAction(IWorkbenchWindow window) {
		setId("New CDL");
		setText("New CDL");
		this.fWindow = window;
	}

//	@Override
//	public void dispose() {
//		fWindow = null;
//	}
//	public void run(IAction action) {
//		run();
//	}
//	@Override
//	public void init(IWorkbenchWindow window) {
//		fWindow = window;
//	}

	public MyTreeNode getParentMyTreeNode(MyTreeNode node) {
		if (((File) node.getValue()).isDirectory()) {
			return node;
		} else {
			return getParentMyTreeNode(node.getParent());
		}
	}

	public File getFolderOfSelectedMyTreeNode(File file) {
		if (file.isDirectory()) {
			return file;
		} else {
			return getFolderOfSelectedMyTreeNode(file.getParentFile());
		}
	}

	public void run() {
		try {
			InputDialog inputDlg = new InputDialog(fWindow.getShell(), "input a CDL File name", "", "",
					new IInputValidator() {

						@Override
						public String isValid(String newText) {
							if (!newText.endsWith(".cdl")) {
								return "Input a File name ends with '.cdl'";
							}
							if (newText.substring(0, newText.lastIndexOf(".")) == null
									|| newText.substring(0,
											newText.lastIndexOf(".")).equals("")
											) {
								return "Input a valid File name";
							}
							return null;
						}

					});
			String str = null;
			if(inputDlg.open()==InputDialog.OK){
				str = inputDlg.getValue();
			}
			if(str==null){return;}
			File myFile = new File(getFolderOfSelectedMyTreeNode(
					((File) FileExplorer.getSelectMyTreeNode().getValue()))
					.getAbsolutePath()
					+ "\\" + str);
			MyTreeNode childNode = new MyTreeNode(myFile);
			childNode.setParent(getParentMyTreeNode(FileExplorer
					.getSelectMyTreeNode()));

			FileExplorer.getSelectMyTreeNode().add(childNode);
			FileExplorer.getInstance().getViewer().getTree().redraw();

			IEditorInput input = createEditorInput(myFile);//				
			IWorkbenchPage page = fWindow.getActivePage();
			MyEditorInput inputForm = new MyEditorInput(input);
			if (((MyFileEditorInput) inputForm.getInputFile()).getPath()
					.toString().endsWith(".cdl")) {

				page.openEditor(inputForm,
						"edu.xjtu.cdl2bpel.designer.CDLViewer");
			} else if (((MyFileEditorInput) inputForm.getInputFile()).getPath()
					.toString().endsWith(".bpel")
					|| ((MyFileEditorInput) inputForm.getInputFile()).getPath()
							.toString().endsWith(".wsdl")) {
				page.openEditor(inputForm, "edu.xjtu.cdl2bpel.editors.xml");
			} else if (((MyFileEditorInput) inputForm.getInputFile()).getPath()
					.toFile().isFile()) {
				page.openEditor(inputForm,
						"edu.xjtu.cdl2bpel.editors.simpleEditor");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private IEditorInput createEditorInput(File file) {
		// TODO Auto-generated method stub
		IPath location = new Path(file.getAbsolutePath());
		MyFileEditorInput input = null;
//			new MyFileEditorInput(location);
		return input;
	}

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

//	@Override
//	public void selectionChanged(IAction action, ISelection selection) {
//
//	}
}
