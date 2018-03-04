package edu.xjtu.cdl2bpel.application.fileExplorer.model;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.util.Util;

import edu.xjtu.cdl2bpel.application.fileExplorer.actions.MyTreeNodeEvent;
import edu.xjtu.cdl2bpel.application.fileExplorer.actions.MyTreeNodeListener;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;

public class MyTreeNode {

	private Set<MyTreeNode> children;
	private List listeners = new ArrayList();
	private MyTreeNode parent;

	protected Object value;

	public void setValue(Object value) {
		this.value = value;
	}

	public Set<MyTreeNode> getChildren() {
		return children;
	}

	public boolean getObjectEqual(MyTreeNode node) {
		if(((File)this.getValue()).getAbsoluteFile().equals(((File)node.getValue()).getAbsoluteFile())) {
			return true;
		}
		return false;
	}
	
	public MyTreeNode getParent() {
		return parent;
	}

	public Object getValue() {
		return value;
	}

	public void delete(MyTreeNode node) {
		for (Iterator it = getChildren().iterator(); it.hasNext();) {
			MyTreeNode temp = (MyTreeNode) it.next();
			if (temp.equals(node)) {
				remove(node);
				FileExplorer.getViewer().remove(node);
				return;
			} else {
				temp.delete(node);
			}
		}
	}
	
	public boolean hasChildren() {
		return children != null && children.size() > 0;
	}

	public int hashCode() {
		return Util.hashCode(value);
	}

	public void setChildren(final Set<MyTreeNode> children) {
		this.children = children;
	}

	public void setParent(final MyTreeNode parent) {
		this.parent = parent;
	}

	private boolean allowsChildren;

	public MyTreeNode(Object value) {
		this.value = value;
		children = new HashSet();
	}

	public MyTreeNode() {
		children = new HashSet();
	}
	
	public boolean isLeaf() {
		return !(((File) this.value).isDirectory());
	}

	public boolean isAllowsChildren() {
		return allowsChildren;
	}

	public void setAllowsChildren(boolean allowsChildren) {
		this.allowsChildren = allowsChildren;
	}

	public void add(MyTreeNode childNode) {
		if(childNode.getValue() == null) {
			
		}
		this.getChildren().add(childNode);
		childNode.setParent(this);
	}
	
	public void remove(MyTreeNode childNode) {
		this.getChildren().remove(childNode);
	}
	
	public void fireRemoveMyTreeNodeJob(MyTreeNode[] node) {
		fireMyTreeNodeChanged(null,node);
	}
	
	public void fireAddMyTreeNodeEventJob(MyTreeNode node) {
		fireMyTreeNodeChanged(node,null);
	}
	
	public void addMyTreeNodeManagerListener(MyTreeNodeListener listener) {
		listeners.add(listener);
	}

	public void removeMyTreeNodeManagerListener(MyTreeNodeListener listener) {
		listeners.remove(listener);
	}
	
	private void fireMyTreeNodeChanged(MyTreeNode myTreeNodeAdded,MyTreeNode[] myTreeNodeRemoved) {
		MyTreeNodeEvent event = new MyTreeNodeEvent(this,
				myTreeNodeAdded, myTreeNodeRemoved);
		for (Iterator iter = listeners.iterator(); iter.hasNext();) {
			((MyTreeNodeListener) iter.next()).myTreeNodeChanged(event);
		}
	}
}
