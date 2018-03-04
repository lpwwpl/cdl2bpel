package edu.xjtu.cdl2bpel.designer.editor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import edu.xjtu.cdl2bpel.designer.DesignerDefinitions;
import edu.xjtu.cdl2bpel.designer.dnd.CDTemplateTransferDropTargetListener;

public abstract class AbstractEditorPage extends EditorPart {

	public AbstractEditorPage(Editor parent, EditDomain domain) {
		m_parent = parent;
		m_domain = domain;
	}

	public void refresh(IEditorInput input) {
		super.setInput(input);

		getViewer().setContents(getDescription());

		focus(getDescription());
	}

	public void refresh() {
	}

	public Object getDescription() {
		return (m_parent.getDescription());
	}

	public final void doSave(IProgressMonitor monitor) {
		getEditor().doSave(monitor);
	}

	public final void doSaveAs() {
		getEditor().doSaveAs();
	}

	public void focus(Object component) {
	}

	public Object getFocusComponent() {
		return (null);
	}

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName() + ": " + getPageName());
	}

	public final boolean isDirty() {
		return getEditor().isDirty();
	}

	protected final CommandStack getCommandStack() {
		return getEditDomain().getCommandStack();
	}

	protected PaletteRoot getPaletteRoot() {
		return (getEditor().getPaletteRoot());
	}

	public final boolean isSaveAsAllowed() {
		return (getEditor().isSaveAsAllowed());
	}

	public void setFocus() {
		try {
			getViewer().getControl().setFocus();
		} catch (Exception e) {
			if (logger.isLoggable(Level.FINE)) {
				logger.fine("Failed to set focus: " + e);
			}
		}
	}

	public final void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		layout.numColumns = 1;
		composite.setLayout(layout);
		composite.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));
		composite.setForeground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_FOREGROUND));

		createBannerControl(composite);
		composite = new Composite(composite, SWT.NONE);
		composite.setLayout(new FillLayout());
		composite.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));
		composite.setForeground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_FOREGROUND));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		createPageControl(composite);
	}

	protected abstract String getPageName();

	protected void createBannerControl(Composite parent) {

	}

	protected abstract void createPageControl(Composite parent);

	protected final Editor getEditor() {
		return (m_parent);
	}

	public final EditDomain getEditDomain() {
		return (m_domain);
	}

	protected void registerEditPartViewer(EditPartViewer viewer) {

		getEditDomain().addViewer(viewer);
		getEditor().getSelectionSynchronizer().addViewer(viewer);
		getSite().setSelectionProvider(viewer);
	}

	protected void configureEditPartViewer(EditPartViewer viewer) {

		if (viewer.getKeyHandler() != null) {
			viewer.getKeyHandler().setParent(getEditor().getSharedKeyHandler());
		}

		ContextMenuProvider provider = createContextMenuProvider(viewer);

		viewer.setContextMenu(provider);
//		##################################
		getSite().registerContextMenu(
				DesignerDefinitions.DESIGNER_PLUGIN_ID
						+ ".flow.editor.contextmenu", provider,
				getSite().getSelectionProvider());

		viewer.addDropTargetListener(createTransferDropTargetListener(viewer));
	}

	protected ContextMenuProvider createContextMenuProvider(
			EditPartViewer viewer) {
		return (new EditorContextMenuProvider(viewer, getEditor()
				.getActionRegistry()));
	}

	protected org.eclipse.jface.util.TransferDropTargetListener createTransferDropTargetListener(
			EditPartViewer viewer) {
		return (new CDTemplateTransferDropTargetListener(viewer));
	}

	protected void createPaletteViewer(Composite parent) {

		m_paletteViewer = new PaletteViewer();
		m_paletteViewer.createControl(parent);

		m_paletteViewer.getControl().setBackground(parent.getBackground());
		getEditDomain().setPaletteViewer(m_paletteViewer);

		getEditDomain().setPaletteRoot(getPaletteRoot());

		m_paletteViewer
				.addDragSourceListener(new TemplateTransferDragSourceListener(
						m_paletteViewer));
	}

	protected PaletteViewer getPaletteViewer() {
		return (m_paletteViewer);
	}

	protected abstract EditPartViewer getViewer();

	public Object getAdapter(Class type) {
		if (type == GraphicalViewer.class
				&& getViewer() instanceof GraphicalViewer) {
			return (getViewer());
		}
		return (super.getAdapter(type));
	}

	protected org.eclipse.gef.EditPart findSelectedEditPart(
			org.eclipse.gef.EditPart editpart, Object component) {
		org.eclipse.gef.EditPart ret = null;

		if (component != null && editpart != null) {

			if (editpart.getModel().equals(component)) {
				ret = editpart;
			} else {

				if (editpart instanceof org.eclipse.gef.GraphicalEditPart) {
					java.util.List cons = ((org.eclipse.gef.GraphicalEditPart) editpart)
							.getSourceConnections();

					for (int i = 0; ret == null && i < cons.size(); i++) {
						org.eclipse.gef.EditPart subpart = (org.eclipse.gef.EditPart) cons
								.get(i);

						if (subpart.getModel().equals(component)) {
							ret = subpart;
						}
					}
				}

				java.util.List list = editpart.getChildren();
				java.util.Iterator iter = list.iterator();

				while (ret == null && iter.hasNext()) {
					org.eclipse.gef.EditPart subpart = (org.eclipse.gef.EditPart) iter
							.next();

					ret = findSelectedEditPart(subpart, component);
				}
			}
		}

		return (ret);
	}

	public void dispose() {
		super.dispose();
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.designer.editor");

	private final Editor m_parent;
	private final EditDomain m_domain;
	private PaletteViewer m_paletteViewer = null;
}
