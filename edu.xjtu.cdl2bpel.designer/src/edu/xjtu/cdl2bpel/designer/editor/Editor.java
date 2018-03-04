package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPartSite;

public interface Editor {

	public boolean isDirty();

	public void setDirty(boolean dirty);

	public boolean isEditorSaving();

	public void closeEditor(final boolean save);

	public IEditorInput getEditorInput();

	public void setInput(IEditorInput input);

	public IWorkbenchPartSite getSite();

	public Object getDescription();

	public void doSave(IProgressMonitor monitor);

	public void doSaveAs();

	public boolean isSaveAsAllowed();

	public PaletteRoot getPaletteRoot();

	public SelectionSynchronizer getSelectionSynchronizer();

	public ActionRegistry getActionRegistry();

	public KeyHandler getSharedKeyHandler();

}
