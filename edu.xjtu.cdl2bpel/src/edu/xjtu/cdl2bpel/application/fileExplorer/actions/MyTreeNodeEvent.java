package edu.xjtu.cdl2bpel.application.fileExplorer.actions;

import java.util.EventObject;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public class MyTreeNodeEvent extends EventObject {

	private final MyTreeNode added;

	private final MyTreeNode[] removed;
	
	public MyTreeNodeEvent(MyTreeNode source,MyTreeNode added,MyTreeNode[] removed) {
		super(source);
		this.added = added;
		this.removed = removed;
	}

	
	public MyTreeNode getAdded() {
		return added;
	}

	public MyTreeNode[] getRemoved() {
		return removed;
	}
	
	private static final long serialVersionUID = 1L;

}
