package edu.xjtu.cdl2bpel.designer.util;

import java.text.MessageFormat;

import org.eclipse.jface.util.Assert;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;

public class EditableListCellEditor extends DialogCellEditor {

	public EditableListCellEditor(Composite parent, String title,
			java.util.List values) {
		super(parent);

		m_title = title;
		m_values = values;
	}

	private void checkDeleteable() {
		boolean oldIsDeleteable = isDeleteable;
		isDeleteable = isDeleteEnabled();
		if (oldIsDeleteable != isDeleteable) {
			fireEnablementChanged(DELETE);
		}
	}

	private void checkSelectable() {
		boolean oldIsSelectable = isSelectable;
		isSelectable = isSelectAllEnabled();
		if (oldIsSelectable != isSelectable) {
			fireEnablementChanged(SELECT_ALL);
		}
	}

	private void checkSelection() {
		boolean oldIsSelection = isSelection;
		isSelection = m_textField.getSelectionCount() > 0;
		if (oldIsSelection != isSelection) {
			fireEnablementChanged(COPY);
			fireEnablementChanged(CUT);
		}
	}

	protected Object openDialogBox(Control cellEditorWindow) {
		Object ret = null;

		m_dirty = false;

		org.eclipse.ui.dialogs.ListDialog dialog = new org.eclipse.ui.dialogs.ListDialog(
				getControl().getShell());

		dialog.setContentProvider(new IStructuredContentProvider() {
			public Object[] getElements(Object inputElement) {
				return (getValues());
			}

			public void dispose() {

			}

			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
				m_dirty = true;
			}
		});

		dialog.setLabelProvider(new org.eclipse.jface.viewers.LabelProvider() {
			public String getText(Object elem) {
				return (ViewSupport.getName(elem));
			}
		});

		dialog.setTitle(m_title);

		dialog.setInput(this);

		if (dialog.open() == Window.OK) {

			if (dialog.getResult().length > 0) {
				ret = dialog.getResult()[0];
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

	protected Control createContents(Composite cell) {

		m_textField = new Text(cell, getStyle());
		m_textField.addSelectionListener(new SelectionAdapter() {
			public void widgetDefaultSelected(SelectionEvent e) {
				handleDefaultSelection(e);
			}
		});
		m_textField.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				keyReleaseOccured(e);

				if ((getControl() == null) || getControl().isDisposed())
					return;
				checkSelection();
				checkDeleteable();
				checkSelectable();
			}
		});
		m_textField.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_ESCAPE
						|| e.detail == SWT.TRAVERSE_RETURN) {
					e.doit = false;
				}
			}
		});

		m_textField.addMouseListener(new MouseAdapter() {
			public void mouseUp(MouseEvent e) {
				checkSelection();
				checkDeleteable();
				checkSelectable();
			}
		});
		m_textField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				EditableListCellEditor.this.focusLost();
			}
		});
		m_textField.setFont(cell.getFont());
		m_textField.setBackground(cell.getBackground());
		m_textField.setText("");
		m_textField.addModifyListener(getModifyListener());

		return (m_textField);
	}

	protected void updateContents(Object value) {
		if (m_textField == null) {
			return;
		}

		String text = "";
		if (value != null)
			text = value.toString();

		m_textField.setText(text);

	}

	protected Object doGetValue() {

		return (m_textField.getText());

	}

	protected void doSetFocus() {
		if (m_textField != null) {
			m_textField.selectAll();
			m_textField.setFocus();
			checkSelection();
			checkDeleteable();
			checkSelectable();
		}
	}

	protected void doSetValue(Object value) {
		Assert.isTrue(m_textField != null && (value instanceof String));
		m_textField.removeModifyListener(getModifyListener());
		m_textField.setText((String) value);
		m_textField.addModifyListener(getModifyListener());
	}

	protected void editOccured(ModifyEvent e) {
		String value = m_textField.getText();
		if (value == null) {
			value = "";
		}

		Object typedValue = value;
		boolean oldValidState = isValueValid();
		boolean newValidState = isCorrect(typedValue);

		if (typedValue == null && newValidState) {
			Assert.isTrue(false,
					"Validator isn't limiting the cell editor's type range");
		}

		if (!newValidState) {

			setErrorMessage(MessageFormat.format(getErrorMessage(),
					new Object[] { value }));
		}

		valueChanged(oldValidState, newValidState);
	}

	public LayoutData getLayoutData() {
		return new LayoutData();
	}

	private ModifyListener getModifyListener() {
		if (modifyListener == null) {
			modifyListener = new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					editOccured(e);
				}
			};
		}
		return modifyListener;
	}

	protected void handleDefaultSelection(SelectionEvent event) {

		fireApplyEditorValue();
		deactivate();
	}

	public boolean isCopyEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return m_textField.getSelectionCount() > 0;
	}

	public boolean isCutEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return m_textField.getSelectionCount() > 0;
	}

	public boolean isDeleteEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return m_textField.getSelectionCount() > 0
				|| m_textField.getCaretPosition() < m_textField.getCharCount();
	}

	public boolean isPasteEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return true;
	}

	public boolean isSaveAllEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return true;
	}

	public boolean isSelectAllEnabled() {
		if (m_textField == null || m_textField.isDisposed())
			return false;
		return m_textField.getCharCount() > 0;
	}

	protected void keyReleaseOccured(KeyEvent keyEvent) {
		if (keyEvent.character == '\r') {

			if (m_textField != null && !m_textField.isDisposed()
					&& (m_textField.getStyle() & SWT.MULTI) != 0) {
				if ((keyEvent.stateMask & SWT.CTRL) != 0) {
					super.keyReleaseOccured(keyEvent);
				}
			}
			return;
		}
		super.keyReleaseOccured(keyEvent);
	}

	public void performCopy() {
		m_textField.copy();
	}

	public void performCut() {
		m_textField.cut();
		checkSelection();
		checkDeleteable();
		checkSelectable();
	}

	public void performDelete() {
		if (m_textField.getSelectionCount() > 0)

			m_textField.insert("");
		else {

			int pos = m_textField.getCaretPosition();
			if (pos < m_textField.getCharCount()) {
				m_textField.setSelection(pos, pos + 1);
				m_textField.insert("");
			}
		}
		checkSelection();
		checkDeleteable();
		checkSelectable();
	}

	public void performPaste() {
		m_textField.paste();
		checkSelection();
		checkDeleteable();
		checkSelectable();
	}

	public void performSelectAll() {
		m_textField.selectAll();
		checkSelection();
		checkDeleteable();
	}

	public boolean isDirty() {
		return (m_dirty);
	}

	private java.util.List m_values = null;
	private String m_title = null;
	private boolean m_dirty = false;
	private Text m_textField;
	private ModifyListener modifyListener;
	private boolean isSelection = false;
	private boolean isDeleteable = false;
	private boolean isSelectable = false;
}
