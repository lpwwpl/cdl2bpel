package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.gef.EditDomain;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import edu.xjtu.cdl2bpel.designer.basetypes.parts.BaseTypeEditPart;
import edu.xjtu.cdl2bpel.designer.basetypes.parts.CDLEditPartsFactory;
import edu.xjtu.cdl2bpel.designer.basetypes.parts.PackageTypesEditPart;

public class ChoreographyBaseTypesPage extends AbstractChoreographyEditorPage {

	public ChoreographyBaseTypesPage(ChoreographyEditor parent) {
		super(parent, new EditDomain());
	}

	public String getPageName() {
		return ("Base Types");
	}

	protected void createPageControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());
		composite.setLayout(new GridLayout(2, false));

		createPaletteViewer(composite);
		GridData gd = new GridData(GridData.FILL_VERTICAL);
		gd.widthHint = 125;
		getPaletteViewer().getControl().setLayoutData(gd);

		createGraphicalViewer(composite);
		gd = new GridData(GridData.FILL_BOTH);
		gd.widthHint = 275;
		getViewer().getControl().setLayoutData(gd);
	}

	private void createGraphicalViewer(Composite parent) {
		m_viewer = new TreeViewer();
		m_viewer.createControl(parent);

		m_viewer.getControl().setBackground(parent.getBackground());
		registerEditPartViewer(m_viewer);

		configureEditPartViewer(m_viewer);

		m_viewer
				.setEditPartFactory(new CDLEditPartsFactory());
		m_viewer.setContents(getChoreographyDescription());
	}

	protected org.eclipse.gef.EditPartViewer getViewer() {
		return (m_viewer);
	}

	public String getTitle() {
		return ("Edit the choreography types");
	}

	public void refresh() {

		org.eclipse.gef.EditPart editpart = m_viewer.getContents();
		if (editpart instanceof PackageTypesEditPart) {
			((PackageTypesEditPart) editpart).refreshModel();
		}
	}

	public void focus(Object component) {

		m_viewer.flush();

		org.eclipse.gef.EditPart editpart = m_viewer.getContents();
		if (editpart instanceof BaseTypeEditPart) {

			editpart = findSelectedEditPart((BaseTypeEditPart) editpart,
					component);

			if (editpart != null) {
				m_viewer.select(editpart);

			}
		}
	}

	private TreeViewer m_viewer = null;
}
