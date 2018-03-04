package edu.xjtu.cdl2bpel.application.actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2wsdl.WSDLDefinitions;
import edu.xjtu.cdl2bpel.deploy.BPELAndWSDLDeployment;
import edu.xjtu.cdl2bpel.deploy.BPELAndWSDLDeploymentFactory;
import edu.xjtu.cdl2bpel.deploy.WSBPELDefinitions;

public class DelpoyAction extends Action implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow fWindow;
	public DelpoyAction() {
		setEnabled(true);
	}
	
	public static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		String result = fileName.substring(pos+1);
		return result;
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		fWindow = window;
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

}
