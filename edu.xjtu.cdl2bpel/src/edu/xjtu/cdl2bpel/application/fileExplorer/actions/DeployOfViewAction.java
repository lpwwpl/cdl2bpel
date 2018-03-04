package edu.xjtu.cdl2bpel.application.fileExplorer.actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;
import edu.xjtu.cdl2bpel.application.util.Tools;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2wsdl.WSDLDefinitions;
import edu.xjtu.cdl2bpel.deploy.BPELAndWSDLDeployment;
import edu.xjtu.cdl2bpel.deploy.BPELAndWSDLDeploymentFactory;
import edu.xjtu.cdl2bpel.deploy.WSBPELDefinitions;

public class DeployOfViewAction extends Action {
	
	private FileExplorer view = null;
	private Package cdlpack = null;
	public DeployOfViewAction(FileExplorer view, String text) {
		super(text, null);
		this.view = view;
	}
	
	public void setPackage(Package cdlpack) {
		this.cdlpack = cdlpack;
	}
	
	public static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		String result = fileName.substring(pos+1);
		return result;
	}
	
	public void run() {
		MyTreeNode treeNode = view.getSelectMyTreeNode();
		File destResource = (File)treeNode.getValue();
		if (destResource.isFile()&& getExtention(destResource.getName()).equals("cdl")) { 
			try {
				cdlpack = CDLResolver.getPackageFromCDLFile(destResource.getAbsolutePath());
				MyTreeNode destFolder = treeNode.getParent();
				Map wsbpelFiles = getGeneratedBPELFiles(destFolder, cdlpack);
				Map wsdlFiles = getGeneratedWSDLFiles(destFolder, cdlpack);
				BPELAndWSDLDeployment deploy = BPELAndWSDLDeploymentFactory.createBPELAndWSDLDeployment();
				if(getBPELTreeNode(destFolder)!=null) {
					String folder = WSBPELDefinitions.getBPELComponent(cdlpack);
					String subfolder = ((File)destFolder.getValue()).getAbsolutePath()+File.separator+folder;
					deploy.deploy2Destination( wsbpelFiles, wsdlFiles, subfolder);
				} else {
					MessageDialog.openWarning(view.getSite().getWorkbenchWindow().getShell(), "Information", "You shuold First Generate BPEL and WSDL!");
				}
			} catch (Exception ex) {
				MessageDialog.openError(view.getSite().getWorkbenchWindow().getShell(), "Error", "You should First Generate BPEL and WSDL, then Deploy. Or Maybe the deploy has other problems");
			}
		} else {
			MessageDialog.openInformation(view.getSite().getWorkbenchWindow().getShell(), "Information", "Only CDL can be deploy!");
		}
	}
	
	public MyTreeNode getBPELTreeNode(MyTreeNode parent) {
		String folder = WSBPELDefinitions.getBPELComponent(cdlpack);
		String subfolder = ((File)parent.getValue()).getAbsolutePath()+File.separator+folder;
		MyTreeNode ret = null;
		for(Iterator it = parent.getChildren().iterator();it.hasNext();) {
			MyTreeNode temp = (MyTreeNode)it.next();
			if(((File)temp.getValue()).getAbsolutePath().equals(subfolder)) {
				ret = temp;
				break;
			}
		}
		return ret;
	}
	
	public MyTreeNode getWSDLTreeNode(MyTreeNode parent) {
		String folder = WSDLDefinitions.getWSDLComponent(cdlpack);
		String subfolder = ((File)parent.getValue()).getAbsolutePath()+File.separator+folder;
		MyTreeNode ret = null;
		for(Iterator it = parent.getChildren().iterator();it.hasNext();) {
			MyTreeNode temp = (MyTreeNode)it.next();
			if(((File)temp.getValue()).getAbsolutePath().equals(subfolder)) {
				ret = temp;
				break;
			}
		}
		return ret;
	}
	
	protected Map getGeneratedBPELFiles(MyTreeNode parent,
			Package cdlpack) throws Exception {
		Map ret = new java.util.Hashtable();
		File subfolder = (File)getBPELTreeNode(parent).getValue();

		// Iterate through the contents of the sub-folder
		if (subfolder!=null && subfolder.isDirectory()) {
			File[] members = subfolder.listFiles();
			// Load up the WSBPEL and WSDL files into the map
			for (int i = 0; i < members.length; i++) {
				if (members[i].isFile()
						&& getExtention(((File) members[i]).getName())!=null
						&& getExtention(((File) members[i]).getName()).equals(
								WSBPELDefinitions.FILE_EXTENSION)) {
					java.io.InputStream is = new FileInputStream((File) members[i]);

					byte[] contents = new byte[is.available()];
					is.read(contents);

					is.close();

					ret.put(members[i].getName(), new String(contents));
				}
			}
		}

		return (ret);
	}

	/**
	 * This method scans the appropriate sub-folder for the supplied resource,
	 * to read in the available WSDL files.
	 * 
	 * @param destResource
	 *            The resource
	 * @param cdlpack
	 *            The choreography description
	 * @return The WSDL files
	 */
	protected Map getGeneratedWSDLFiles(MyTreeNode parent,
			Package cdlpack) throws Exception {
		Map ret = new java.util.Hashtable();

		File subfolder = (File)getWSDLTreeNode(parent).getValue();
		
		// Iterate through the contents of the sub-folder
		if (subfolder != null && subfolder.isDirectory()) {
			File[] members = subfolder.listFiles();

			for (int i = 0; i < members.length; i++) {
				
				if (members[i].isFile()
						&& getExtention(((File) members[i]).getAbsolutePath())!=null
						&& getExtention(((File) members[i]).getAbsolutePath()).equals(
								WSDLDefinitions.FILE_EXTENSION)) {
					java.io.InputStream is = new FileInputStream((File) members[i]);

					byte[] contents = new byte[is.available()];
					is.read(contents);

					is.close();

					ret.put(members[i].getName(), new String(contents));
				}
			}
		}

		return (ret);
	}

	/**
	 * This method derives the relevant destination folder for the supplied
	 * Choreography Description.
	 * 
	 * @param res
	 *            The resource associated with the Choreography Description
	 * @param cdlpack
	 *            The Choreography Description
	 * @return The destination folder
	 */
	protected IResource getDestinationPath(IResource res,
			Package cdlpack) {
		IResource ret = null;
		String parent = res.getParent().getLocation().toOSString();
		String subdirname = WSBPELDefinitions.getBPELComponent(cdlpack);

		java.io.File f = new java.io.File(parent + File.separator + subdirname);
		if (f.exists() == false) {
			f.mkdirs();
		}

		try {
			res.getParent().refreshLocal(2, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ret = res.getParent().findMember(subdirname);

		return (ret);
	}
}
