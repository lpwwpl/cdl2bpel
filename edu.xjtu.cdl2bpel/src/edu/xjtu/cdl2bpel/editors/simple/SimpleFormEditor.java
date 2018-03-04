package edu.xjtu.cdl2bpel.editors.simple;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.editors.xml.XMLEditor;

public class SimpleFormEditor extends FormEditor{
	SimpleEditor simpleEditor = new SimpleEditor();
	@Override
	protected void addPages() {
		// TODO Auto-generated method stub
		try {
			// Editors
			addPage(simpleEditor, ((MyEditorInput) getEditorInput()).getInputFile());
			setPageText(0, ((MyEditorInput) getEditorInput()).getInputFile()
					.getName());

		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		simpleEditor.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site, input);
		setPartName(input.getName());
	}
}
