package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.gef.EditDomain;

public abstract class AbstractChoreographyEditorPage extends AbstractEditorPage {

	public AbstractChoreographyEditorPage(ChoreographyEditor parent,
			EditDomain domain) {
		super(parent, domain);
	}

	public edu.xjtu.cdl2bpel.cdl.Package getChoreographyDescription() {
		return ((edu.xjtu.cdl2bpel.cdl.Package) getDescription());
	}
}
