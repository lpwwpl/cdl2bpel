package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public class FileExplorerViewerActionNewFile implements IViewActionDelegate{

	private IWorkbenchPart targetPart;
	@Override
	public void init(IViewPart view) {
		this.targetPart = view;		
	}

				
	@Override
	public void run(IAction action) {
		InputDialog inputDlg = new InputDialog(targetPart.getSite().getWorkbenchWindow().getShell(), "input a CDL File name", "", "",
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
						if(newText.equals("")||newText==null) {
							return "Input a CDL File Name ends with '.cdl'";
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
			MessageDialog.openInformation(targetPart.getSite().getWorkbenchWindow().getShell(), "Information", "The File exist,renew a CDL File");
		} else {
			myFile.createNewFile();
			initCDLFile(myFile);
			getParentMyTreeNode(FileExplorer
					.getSelectMyTreeNode()).getChildren().add(childNode);
			childNode.setParent(getParentMyTreeNode(FileExplorer
					.getSelectMyTreeNode()));
			FileExplorer.getViewer().add(childNode.getParent(), childNode);
		}
	}
	
	public void initCDLFile(File file) {
		String initData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
						  "<package xmlns=\"http://www.w3.org/2005/10/cdl\"" +
						  " xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"></package>";
		try{
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			output.write(initData);
			output.close();
		} catch(Exception ex) {
			ex.printStackTrace();
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
