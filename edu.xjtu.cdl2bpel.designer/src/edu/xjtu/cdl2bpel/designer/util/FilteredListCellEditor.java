

package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.window.Window;



public class FilteredListCellEditor extends DialogCellEditor {

	

	public FilteredListCellEditor(Composite parent, String title,
			Object current, Object[] values) {
		super(parent);
		
		m_title = title;
		m_current = current;
		m_values = values;	
	}
	
	

	protected Object openDialogBox(Control cellEditorWindow) {
		Object ret=null;
		
		m_dirty = false;
		
		org.eclipse.ui.dialogs.ElementListSelectionDialog dialog=
			new org.eclipse.ui.dialogs.ElementListSelectionDialog(
					getControl().getShell(),
					new org.eclipse.jface.viewers.LabelProvider() {
						public String getText(Object elem) {
							return(ViewSupport.getName(elem));
						}
					}) {
			
			protected void createButtonsForButtonBar(Composite parent) {
				super.createButtonsForButtonBar(parent);
				createButton(parent, 99,
						"Clear", false);
				
			}
			protected void buttonPressed(int buttonId) {
				if (buttonId == 99) {
					setSelection(new Object[0]);
				} else {
					super.buttonPressed(buttonId);
				}
			}
		};
		
		dialog.setElements(m_values);
		
		dialog.setTitle(m_title);
		dialog.setAllowDuplicates(false);
		dialog.setMatchEmptyString(true);
		
		if (m_current != null) {
			dialog.setInitialSelections(new Object[]{m_current});
		}
		
		if (dialog.open() == Window.OK) {
			
			if (dialog.getResult().length > 0) {
				ret = dialog.getResult()[0];
			}
			
			if (ret == null) {
				ret = NULL_PLACEHOLDER;
			}
		}
		
		return(ret);
	}
	
	protected Object[] getValues() {
		return(m_values);
	}
	
	

	public boolean isDirty() {
		return(m_dirty);
	}
	
    protected void doSetValue(Object value) {
    	if (value == NULL_PLACEHOLDER) {
    		value = null;
    	}
    	super.doSetValue(value);
    }
    
    protected void updateContents(Object value) {
    	if (value instanceof Integer) {
			int pos=((Integer)value).intValue();
			
			if (pos >= 0 && pos < m_values.length) {
				super.updateContents(ViewSupport.getName(m_values[pos]));
			} else {
				super.updateContents("<unknown>");
			}
    	} else {
        	super.updateContents(value);
    	}
    }
    
	private Object[] m_values=null;
	private Object m_current=null;
	private String m_title=null;
	private boolean m_dirty=false;
	
	private static final String NULL_PLACEHOLDER="##null##";
}

