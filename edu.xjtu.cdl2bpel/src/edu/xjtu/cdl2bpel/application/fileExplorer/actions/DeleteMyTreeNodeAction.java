package edu.xjtu.cdl2bpel.application.fileExplorer.actions;

import org.eclipse.jface.action.Action;

import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;

public class DeleteMyTreeNodeAction extends Action  {
	private FileExplorer view;

	public DeleteMyTreeNodeAction(FileExplorer view, String text) {
		super(text, null);
		this.view = view;
	}

	public void run() {
		view.getRoot().fireRemoveMyTreeNodeJob(view.getSelectedMyTreeNode());
	}
}
