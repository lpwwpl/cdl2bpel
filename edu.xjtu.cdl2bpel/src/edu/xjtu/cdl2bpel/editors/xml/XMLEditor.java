package edu.xjtu.cdl2bpel.editors.xml;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

import edu.xjtu.cdl2bpel.editors.simple.SimpleEditor;
import edu.xjtu.cdl2bpel.editors.xm.highlighting.ColorManager;

public class XMLEditor extends SimpleEditor implements IEditorPart{

	private ColorManager colorManager;

	protected void internal_init() {
		configureInsertMode(SMART_INSERT, false);
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}

	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	public XMLEditor() {
		internal_init();
	}

	protected void doSetInput(IEditorInput input) throws CoreException {
		System.out.println(input);
		setDocumentProvider(new XMLDocumentProvider());
		super.doSetInput(input);

	}

}
