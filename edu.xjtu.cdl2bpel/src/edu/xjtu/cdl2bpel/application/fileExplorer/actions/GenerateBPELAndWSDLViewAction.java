package edu.xjtu.cdl2bpel.application.fileExplorer.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGenerator;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGeneratorFactory;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGenerator;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGeneratorFactory;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleRelationAlgorithm;

public class GenerateBPELAndWSDLViewAction extends Action{
	
	private FileExplorer view = null;
	private Package cdlpack = null;

	public GenerateBPELAndWSDLViewAction(FileExplorer view, String text) {
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
				MyTreeNode destFolder = treeNode.getParent();
				String destResourcePath = destResource.getAbsolutePath();
				String destFolderPath = ((File)destFolder.getValue()).getAbsolutePath();
					
				cdlpack = CDLResolver.getPackageFromCDLFile(destResourcePath);
				
				RoleRelationAlgorithm rra  = new RoleRelationAlgorithm(destResourcePath);
				rra.setThreshold(1.0f);
				rra.caculate(destResourcePath);
				List<Pair<RoleType[], String>> roles = new ArrayList();
				List<Group> groups = rra.getGroups();
				for (Group group : groups) {
					List roleTypesInGroup = group.getRoleType();
					RoleType[] roletypes = (new RoleType[roleTypesInGroup.size()]);
					int i = 0;
					for (Iterator it = roleTypesInGroup.iterator(); it.hasNext();) {
						RoleType roleType = CDLPackageUtil.getRoleType(cdlpack,
								((RoleType) it.next()).getName());
						roletypes[i] = roleType;
						i++;
					}
					i = 0;
					// roleTypesInGroup.toArray(new RoleType[roleTypesInGroup.size()]);
					roles.add(new Pair(roletypes, DefaultTNS.getTNS()));
				}

				DefaultTNS.reset();
				
				MyTreeNode f_destinationTreeNode = getTreeNode(FileExplorer
						.getRoot(), destFolderPath);
				CDL2WSDLGenerator generator = CDL2WSDLGeneratorFactory
						.createGenerator(cdlpack, destFolderPath, roles);
				String generateResult = generator.getDirOfCDLGenerateResult(
						destFolderPath, cdlpack);
				File dir = new File(generateResult);
				MyTreeNode dirTreeNode = getTreeNode(FileExplorer.getRoot(),
						generateResult);

				if (dirTreeNode != null) {

					if (dir.exists())
						dir.delete();

					generator.generateWSDL2DestinationFile();

					f_destinationTreeNode.getChildren().remove(dirTreeNode);
					FileExplorer.getViewer().remove(dirTreeNode);
					MyTreeNode newDirTreeNode = new MyTreeNode(dir);
					recusiveDir(newDirTreeNode, dir);
					newDirTreeNode.setParent(f_destinationTreeNode);
					f_destinationTreeNode.getChildren().add(newDirTreeNode);
					FileExplorer.getViewer().add(newDirTreeNode.getParent(),
							newDirTreeNode);
				} else {
					generator.generateWSDL2DestinationFile();

					dirTreeNode = new MyTreeNode(dir);
					recusiveDir(dirTreeNode, dir);
					dirTreeNode.setParent(f_destinationTreeNode);
					f_destinationTreeNode.getChildren().add(dirTreeNode);
					FileExplorer.getViewer().add(dirTreeNode.getParent(),
							dirTreeNode);
				}

				
				MyTreeNode bpel_destinationTreeNode = getTreeNode(FileExplorer
						.getRoot(), destFolderPath);

				CDL2WSBPELGenerator gen = CDL2WSBPELGeneratorFactory
						.createGenerator(roles, destFolderPath);

				String bpelGenerateResult = gen.getDirOfCDLGenerateResult(
						destFolderPath, cdlpack);
				File bpelDir = new File(bpelGenerateResult);
				MyTreeNode bpelDireTreeNode = getTreeNode(FileExplorer.getRoot(),
						bpelGenerateResult);

				if (bpelDireTreeNode != null) {

					if (bpelDir.exists())
						bpelDir.delete();
					gen.generateBPEL2DestinationFile(cdlpack);

					bpel_destinationTreeNode.getChildren().remove(bpelDireTreeNode);
					FileExplorer.getViewer().remove(bpelDireTreeNode);
					MyTreeNode newDirTreeNode = new MyTreeNode(bpelDir);
					recusiveDir(newDirTreeNode, bpelDir);
					newDirTreeNode.setParent(bpel_destinationTreeNode);
					bpel_destinationTreeNode.getChildren().add(newDirTreeNode);
					FileExplorer.getViewer().add(newDirTreeNode.getParent(),
							newDirTreeNode);
				} else {
					gen.generateBPEL2DestinationFile(cdlpack);

					bpelDireTreeNode = new MyTreeNode(bpelDir);
					recusiveDir(bpelDireTreeNode, bpelDir);
					bpelDireTreeNode.setParent(bpel_destinationTreeNode);
					bpel_destinationTreeNode.getChildren().add(bpelDireTreeNode);
					FileExplorer.getViewer().add(bpelDireTreeNode.getParent(),
							bpelDireTreeNode);
				}
			} catch (Exception ex) {
				MessageDialog.openWarning(view.getSite().getWorkbenchWindow().getShell(), "Warning", "There maybe syntax error in CDL!");
			}
		} else {
			MessageDialog.openInformation(view.getSite().getWorkbenchWindow().getShell(), "Information", "Only CDL can be deploy!");
		}
		
	}
	
	public MyTreeNode getTreeNode(MyTreeNode root,String dest) {
		Queue not_yet_explorer = new LinkedList();
		not_yet_explorer.add(root);
		
		while(!not_yet_explorer.isEmpty()) {
			MyTreeNode node = (MyTreeNode)not_yet_explorer.peek();
			not_yet_explorer.remove();
			
			if(((File)node.getValue()).getAbsolutePath().equals(dest)) {
				return node;
			}
			for(Iterator it = node.getChildren().iterator();it.hasNext();) {
				MyTreeNode child = (MyTreeNode)it.next();
				if(!((File)child.getValue()).getAbsolutePath().equals(dest)) {
					not_yet_explorer.add(child);
				} else {
					return child;
				}
			}
		}
		
		return null;
		
	}

	public void recusiveDir(MyTreeNode parent, File dir) {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			if (files == null) {
				return;
			} else {
				for (int i = 0; i < files.length; ++i) {
					MyTreeNode newnode = new MyTreeNode(files[i]);
					parent.getChildren().add(newnode);
					recusiveDir(newnode, files[i]);
				}
			}
		} else {
		}
	}
}
