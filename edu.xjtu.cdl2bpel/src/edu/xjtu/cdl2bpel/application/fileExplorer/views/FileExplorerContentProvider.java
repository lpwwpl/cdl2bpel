package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.File;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import edu.xjtu.cdl2bpel.application.fileExplorer.actions.MyTreeNodeEvent;
import edu.xjtu.cdl2bpel.application.fileExplorer.actions.MyTreeNodeListener;
import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public class FileExplorerContentProvider implements IStructuredContentProvider,ITreeContentProvider,MyTreeNodeListener{

	private TreeViewer viewer;
	private Object data;
	
	public TreeViewer getViewer() {
		return viewer;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(getRoot());
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
		this.viewer = (TreeViewer) viewer;
		if (data != null)
			((MyTreeNode)viewer.getInput()).removeMyTreeNodeManagerListener(this);
		data = (MyTreeNode) newInput;
		if(data!=null) {
			((MyTreeNode) data).addMyTreeNodeManagerListener(this);
		}
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		if (!((MyTreeNode)parentElement).isLeaf())
			return ((MyTreeNode) parentElement).getChildren().toArray();
		else {
//			Object[] obj = new Object[0];
//			obj[0] = ((MyTreeNode)parentElement).getValue();
//			return obj;
			return null;
		}
	}

	@Override
	public Object getParent(Object element) {
		return ((MyTreeNode)element).getParent();
	}

	@Override
	public boolean hasChildren(Object element) {
		if(((MyTreeNode)element).getChildren().size()>0||
				((File)((MyTreeNode)element).getValue()).isDirectory()) {
			return true;
		}
		return false;
	}
	
	public MyTreeNode getRoot() {
		return FileExplorer.getRoot();
	}

	@Override
	public void myTreeNodeChanged(MyTreeNodeEvent event) {
		viewer.getTree().setRedraw(false);
		try{
			if(event.getRemoved()!=null){
	
				
				FileExplorerUtil.removeMyTreeNodeFromRoot(event.getRemoved());
				// FileExplorer.getFileList().remove(event.getRemoved());
				FileExplorerUtil.removeFileFolder(event.getRemoved());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		finally{
			viewer.getTree().setRedraw(true);
		}
	}
}
