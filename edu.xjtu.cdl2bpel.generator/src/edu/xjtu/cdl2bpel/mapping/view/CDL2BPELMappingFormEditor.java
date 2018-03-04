package edu.xjtu.cdl2bpel.mapping.view;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

public class CDL2BPELMappingFormEditor extends FormEditor {

	@Override
	protected void addPages() {
		try {
			addPage(new CDL2BPELMappingIntroPage(this));
			addPage(new CDL2BPELMappingFormPage(this));
		} catch (PartInitException e) {
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
}

