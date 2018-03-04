package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;

public class MultiRefCellEditor extends DialogCellEditor {

	public MultiRefCellEditor(Composite parent, String title, Object component,
			java.util.List currentValues, java.util.List values) {
		super(parent);

		m_title = title;
		m_component = component;
		m_currentValues = currentValues;
		m_values = values;
	}

	protected Object openDialogBox(Control cellEditorWindow) {
		Object ret = null;

		m_dirty = false;

		org.eclipse.ui.dialogs.ListSelectionDialog dialog = new org.eclipse.ui.dialogs.ListSelectionDialog(
				getControl().getShell(), m_component,
				new IStructuredContentProvider() {
					public Object[] getElements(Object inputElement) {
						return (getValues());
					}

					public void dispose() {

					}

					public void inputChanged(Viewer viewer, Object oldInput,
							Object newInput) {
						m_dirty = true;
					}
				}, new org.eclipse.jface.viewers.LabelProvider() {
					public String getText(Object elem) {
						return (ViewSupport.getName(elem));
					}
				}, m_title);

		dialog.setInitialElementSelections(m_currentValues);

		if (dialog.open() == Window.OK) {
			ret = new java.util.Vector();

			for (int i = 0; i < dialog.getResult().length; i++) {
				((java.util.Vector) ret).add(dialog.getResult()[i]);
			}
		}

		return (ret);
	}

	protected Object[] getValues() {
		Object[] ret = new Object[m_values.size()];

		for (int i = 0; i < m_values.size(); i++) {
			ret[i] = m_values.get(i);
		}

		return (ret);
	}

	public boolean isDirty() {
		return (m_dirty);
	}

	private java.util.List m_currentValues = null;
	private java.util.List m_values = null;
	private Object m_component = null;
	private String m_title = null;
	private boolean m_dirty = false;
}
