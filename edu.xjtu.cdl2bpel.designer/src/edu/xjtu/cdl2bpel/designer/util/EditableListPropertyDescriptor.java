

package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.PropertyDescriptor;



public class EditableListPropertyDescriptor extends PropertyDescriptor {

	

    public EditableListPropertyDescriptor(Object id, String displayName,
            					java.util.List values) {
        super(id, displayName);
        
        m_values = values;
    }

    

    public CellEditor createPropertyEditor(Composite parent) {
        CellEditor ret=new EditableListCellEditor(parent,
        				getDisplayName(), m_values);
        
        if (getValidator() != null) {
            ret.setValidator(getValidator());
        }
        
        return(ret);
    }

    private java.util.List m_values=null;
}

