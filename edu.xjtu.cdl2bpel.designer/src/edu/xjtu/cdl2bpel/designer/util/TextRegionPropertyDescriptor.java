package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class TextRegionPropertyDescriptor extends PropertyDescriptor {

	public TextRegionPropertyDescriptor(Object id, String displayName) {
		super(id, displayName);
	}

	public CellEditor createPropertyEditor(Composite parent) {
		CellEditor ret = new TextRegionCellEditor(parent, getDisplayName());

		if (getValidator() != null) {
			ret.setValidator(getValidator());
		}

		return (ret);
	}
}
