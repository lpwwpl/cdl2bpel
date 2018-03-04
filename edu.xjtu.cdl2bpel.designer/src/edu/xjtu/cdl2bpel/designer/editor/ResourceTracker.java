package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import edu.xjtu.cdl2bpel.designer.DesignerPlugin;

public class ResourceTracker implements IResourceChangeListener,
		IResourceDeltaVisitor {

	public ResourceTracker(Editor editor) {
		m_editor = editor;
	}

	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta delta = event.getDelta();
		try {
			if (delta != null) {
				delta.accept(this);
			}
		} catch (CoreException exception) {
			DesignerPlugin.getInstance().getLog().log(exception.getStatus());
			exception.printStackTrace();
		}
	}

	public boolean visit(IResourceDelta delta) {
		if (delta == null
				|| !delta.getResource().equals(
						((IFileEditorInput) m_editor.getEditorInput())
								.getFile())) {
			return true;
		}

		if (delta.getKind() == IResourceDelta.REMOVED) {
			if ((IResourceDelta.MOVED_TO & delta.getFlags()) == 0) {
				if (!m_editor.isDirty()) {
					m_editor.closeEditor(false);
				}
			} else {
				final IFile newFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(delta.getMovedToPath());
				Display display = m_editor.getSite().getShell().getDisplay();
				display.asyncExec(new Runnable() {
					public void run() {
						m_editor.setInput(new FileEditorInput(newFile));
					}
				});
			}
		} else if (delta.getKind() == IResourceDelta.CHANGED
				&& (delta.getFlags() & IResourceDelta.CONTENT) > 0) {

			if (!m_editor.isEditorSaving()) {
				final IFile newFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(delta.getFullPath());
				Display display = m_editor.getSite().getShell().getDisplay();
				display.asyncExec(new Runnable() {
					public void run() {
						m_editor.setInput(new FileEditorInput(newFile));
					}
				});
			}
		}
		return (false);
	}

	private Editor m_editor = null;
}
