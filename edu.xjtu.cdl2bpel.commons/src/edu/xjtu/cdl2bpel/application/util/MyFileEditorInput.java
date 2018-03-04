package edu.xjtu.cdl2bpel.application.util;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.PlatformUI;

public class MyFileEditorInput implements IPathEditorInput {

	private IPath fPath;
	private File file;

	public void setFile(File file) {
		this.file = file;
	}

	public MyFileEditorInput(File file) {
		this.file = file;
		this.fPath = new Path(file.getPath());
	}

	public int hashCode() {
		return file.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MyFileEditorInput))
			return false;
		MyFileEditorInput other = (MyFileEditorInput) obj;
		return file.equals(other.file);
	}

	public boolean exists() {
		return file.exists();
	}

	public ImageDescriptor getImageDescriptor() {
		return PlatformUI.getWorkbench().getEditorRegistry()
				.getImageDescriptor(file.toString());
	}

	public String getName() {
		return file.getName();
	}

	public String getToolTipText() {
		return fPath.makeRelative().toOSString();
	}

	public IPath getPath() {
		return fPath;
	}

	public Object getAdapter(Class adapter) {
		return null;
	}

	public IPersistableElement getPersistable() {
		// no persistence
		return null;
	}

	public File getFile() {
		return file;
	}
}
