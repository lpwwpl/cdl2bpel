package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.File;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public class FileExplorerViewerActionNewFolder implements IViewActionDelegate {

	private IWorkbenchPart targetPart;
	@Override
	public void init(IViewPart view) {
		this.targetPart = view;
	}

	public void run(IAction action) {
		InputDialog inputDlg = new InputDialog(targetPart.getSite().getWorkbenchWindow().getShell(), "input a File Folder name", "", "",
				new IInputValidator() {

					@Override
					public String isValid(String newText) {
						if(newText.equals("")||newText==null) {
							return "Input a name of file folder!";
						}
						return null;
					}

				});
		String str = null;
		if(inputDlg.open()==InputDialog.OK){
			str = inputDlg.getValue();
		}
		if (str != null) {
			File myFile = new File(getFolderOfSelectedMyTreeNode(
					((File) FileExplorer.getSelectMyTreeNode().getValue()))
					.getAbsolutePath()
					+ "\\" + str);
			try {
				doJob(myFile);
			} catch (Exception ex) {

			}
		}
	}

	public void doJob(File myFile) throws Exception{
		MyTreeNode childNode = new MyTreeNode(myFile);
	
		if(myFile.exists()) {
			MessageDialog.openInformation(targetPart.getSite().getWorkbenchWindow().getShell(), "Information", "The File Folder exists,renew a Folder name");
		} else {
			myFile.mkdir();
			getParentMyTreeNode(FileExplorer
					.getSelectMyTreeNode()).getChildren().add(childNode);
			childNode.setParent(getParentMyTreeNode(FileExplorer
					.getSelectMyTreeNode()));
			FileExplorer.getViewer().add(childNode.getParent(), childNode);
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	public File getFolderOfSelectedMyTreeNode(File file) {
		if(file.isDirectory()) {
			return file;
		} else {
			return getFolderOfSelectedMyTreeNode( file.getParentFile());
		}
	}
	
	public MyTreeNode getParentMyTreeNode(MyTreeNode node) {
		if(((File)node.getValue()).isDirectory()) {
			return node;
		} else {
			return getParentMyTreeNode(node.getParent());
		}
	}

}
