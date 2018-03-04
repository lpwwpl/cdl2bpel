package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

public class MultiRefPropertyDescriptor extends PropertyDescriptor {

	public MultiRefPropertyDescriptor(Object id, String displayName,
			String title, Object component, java.util.List current,
			java.util.List values) {
		super(id, displayName);

		m_component = component;
		m_title = title;
		m_currentValue = current;
		m_values = values;
	}

	public CellEditor createPropertyEditor(Composite parent) {

		CellEditor editor = new MultiRefCellEditor(parent, m_title,
				m_component, m_currentValue, m_values);
		if (getValidator() != null) {
			editor.setValidator(getValidator());
		}
		return (editor);
	}

	private Object m_component = null;
	private String m_title = null;
	private java.util.List m_currentValue = null;
	private java.util.List m_values = null;
}
