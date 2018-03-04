package edu.xjtu.cdl2bpel.mapping.util;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IEditorInput;

public class FilePath {
	
	private FilePath() {
	}

	static FilePath fpath = new FilePath();

	public static FilePath getFilePathInstance() {
		return fpath;
	}

	private String filepath;

	public String getFilePath() {
		if (filepath != null) {
			return filepath;
		} else {
			return "filepath is null";
		}
	}

	public void setFilePath(String fpath) {
		filepath = fpath;
	}
	
	public String loadfilepath(IEditorInput input) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getLocation() + "/" + input.getToolTipText();
		

	}
}

