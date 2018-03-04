package edu.xjtu.cdl2bpel.application.util;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class MyEditorInput implements IEditorInput {

	private IEditorInput inputFile;

	public MyEditorInput(IEditorInput inputFile) {
		this.inputFile = inputFile;
	}

	public boolean equals(Object obj) {
		if (super.equals(obj))
			return true;
		if (!(obj instanceof MyEditorInput))
			return false;
		MyEditorInput other = (MyEditorInput) obj;
		return inputFile.getName().equals(other.getInputFile().getName());
	}

	public IEditorInput getInputFile() {
		return inputFile;
	}

	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return inputFile.getName();
	}

	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "";
	}

	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

}
