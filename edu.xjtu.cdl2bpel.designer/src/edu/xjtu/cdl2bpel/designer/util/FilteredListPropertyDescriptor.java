

package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;



public class FilteredListPropertyDescriptor extends PropertyDescriptor {

	

	public FilteredListPropertyDescriptor(Object id, String displayName,
				String title, Object current,
						Object[] values) {
		super(id, displayName);
		
		m_title = title;
		m_values = values;
		m_current = current;
	}
	
	

	public CellEditor createPropertyEditor(Composite parent) {
		
		CellEditor editor = new FilteredListCellEditor(parent, m_title,
				m_current, m_values);
		if (getValidator() != null) {
			editor.setValidator(getValidator());
		}
		return(editor);
	}
	
	private String m_title=null;
	private Object[] m_values=null;
	private Object m_current=null;
}

