package edu.xjtu.cdl2bpel.designer.editor;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Viewport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DeleteAction;
import org.eclipse.gef.ui.actions.EditorPartAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.PrintAction;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.gef.ui.actions.StackAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.actions.UpdateAction;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.SelectionSynchronizer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.designer.DesignerDefinitions;
import edu.xjtu.cdl2bpel.designer.editor.properties.DesignerTabbedPropertySheetPage;
import edu.xjtu.cdl2bpel.editors.xml.XMLEditor;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class ChoreographyEditor extends MultiPageEditorPart implements
		IAdaptable, IGotoMarker, Editor, ITabbedPropertySheetPageContributor {

	public ChoreographyEditor() {
	}

	public String getContributorId() {
		return getSite().getId();
	}

	protected void createPages() {
		try {

			m_choreographyBaseTypesPageID = addPage(
					new ChoreographyBaseTypesPage(this), getEditorInput());
			setPageText(m_choreographyBaseTypesPageID,
					getChoreographyBaseTypesPage().getPageName());

			m_choreographyFlowPageID = addPage(new ChoreographyFlowPage(this),
					getEditorInput());
			setPageText(m_choreographyFlowPageID, getChoreographyFlowPage()
					.getPageName());
			int mappingPageId = addPage(new CDL2BPELMappingPage(this),
					getEditorInput());
			setPageText(mappingPageId, "×ª»»Ò³Ãæ");

			int xmlPageID = addPage(new XMLEditor(),
					((MyEditorInput) getEditorInput()).getInputFile());
			// Ajouter le texte de la page 0
			setPageText(xmlPageID, ((MyEditorInput) getEditorInput())
					.getInputFile().getName());

			getMultiPageCommandStackListener().addCommandStack(
					getChoreographyBaseTypesPage().getCommandStack());
			getMultiPageCommandStackListener().addCommandStack(
					getChoreographyFlowPage().getCommandStack());

			getDelegatingCommandStack().setCurrentCommandStack(
					getChoreographyBaseTypesPage().getCommandStack());
			getDelegatingCommandStack().setCurrentCommandStack(
					getChoreographyFlowPage().getCommandStack());

			setActivePage(this.m_choreographyBaseTypesPageID);

		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(), "Open Error",
					"An error occured during opening the editor.", e
							.getStatus());
		}
	}

	protected void pageChange(int index) {

		if (m_outlinePage != null) {
			m_outlinePage.prePageChange();
		}

		super.pageChange(index);

		updateAfterPageChange(index);
	}

	protected void updateAfterPageChange(int newPage) {
		ChoreographyPaletteRoot palette = (ChoreographyPaletteRoot) getPaletteRoot();
		if (palette != null) {
			if (newPage == m_choreographyFlowPageID) {
				palette.setFlowPalette();
				m_printAction.setEnabled(true);

			} else {
				palette.setBaseTypesPalette();
				m_printAction.setEnabled(false);
			}
		}

		getDelegatingZoomManager().setCurrentZoomManager(
				getZoomManager(((AbstractEditorPage) getCurrentPage())
						.getViewer()));

		getDelegatingCommandStack().setCurrentCommandStack(
				((AbstractEditorPage) getCurrentPage()).getCommandStack());

		if (m_outlinePage != null) {
			m_outlinePage.pageChange();
		}
	}

	public Package getChoreographyDescription() {
		return (m_choreographyDescription);
	}

	public Object getDescription() {
		return (getChoreographyDescription());
	}

	private ChoreographyBaseTypesPage getChoreographyBaseTypesPage() {
		if (m_choreographyBaseTypesPageID == -1) {
			return (null);
		}
		return ((ChoreographyBaseTypesPage) getEditor(m_choreographyBaseTypesPageID));
	}

	private ChoreographyFlowPage getChoreographyFlowPage() {
		if (m_choreographyFlowPageID == -1) {
			return (null);
		}
		return ((ChoreographyFlowPage) getEditor(m_choreographyFlowPageID));
	}

	protected EditorPart getCurrentPage() {
		if (getActivePage() == -1) {
			return null;
		}

		return ((EditorPart) getEditor(getActivePage()));
	}

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		try {

			if (input instanceof IFileEditorInput) {
				((IFileEditorInput) input).getFile();
			}
			if (input instanceof FileStoreEditorInput) {
				m_choreographyDescription = create(input);
			}
			if (input instanceof MyEditorInput) {
				m_choreographyDescription = create(input);
				CDL2BPELMappingPage.filePath = ((MyFileEditorInput) ((MyEditorInput) input)
						.getInputFile()).getFile().getAbsolutePath();

			}
			if (null == getChoreographyDescription()) {
				throw new PartInitException(
						"The specified input is not a choreography description.");
			}
		} catch (CoreException e) {
			throw new PartInitException(e.getStatus());
		} catch (Exception e) {
			throw new PartInitException(
					"The specified input is not a valid choreography description.",
					e);
		}

		setPartName(input.getName());
		super.init(site, input);
		getDelegatingCommandStack().addCommandStackListener(
				getDelegatingCommandStackListener());
		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(getSelectionListener());
		createActions();
	}

	protected void createActions() {
		addStackAction(new UndoAction(this));
		addStackAction(new RedoAction(this));

		addEditPartAction(new DeleteAction((IWorkbenchPart) this));
		addEditPartAction(new edu.xjtu.cdl2bpel.designer.flow.commands.CopyAction(
				(IWorkbenchPart) this));
		addEditPartAction(new edu.xjtu.cdl2bpel.designer.flow.commands.PasteAction(
				(IWorkbenchPart) this));

		m_printAction = new PrintAction(this);

		addAction(m_printAction);

		IAction zoomIn = new ZoomInAction(getDelegatingZoomManager());
		IAction zoomOut = new ZoomOutAction(getDelegatingZoomManager());
		addAction(zoomIn);
		addAction(zoomOut);
		getSite().getKeyBindingService().registerAction(zoomIn);
		getSite().getKeyBindingService().registerAction(zoomOut);
	}

	public void setInput(IEditorInput input) {
		if (getEditorInput() instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) getEditorInput()).getFile();
			file.getWorkspace().removeResourceChangeListener(
					getResourceTracker());
		}

		super.setInput(input);

		if (getEditorInput() instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) getEditorInput()).getFile();
			file.getWorkspace().addResourceChangeListener(getResourceTracker());
		}

		if (getEditorInput() instanceof IStorageEditorInput) {
			setPartName(getEditorInput().getName());
			if (!isEditorSaving()) {
				try {
					m_choreographyDescription = create(getEditorInput());

					AbstractEditorPage page = getChoreographyBaseTypesPage();

					if (page != null) {
						page.refresh(input);
					}

					page = getChoreographyFlowPage();

					if (page != null) {
						page.refresh(input);
					}

				} catch (Exception e) {

					closeEditor(false);
				}
			}
		}
	}

	protected Package create(IEditorInput input) throws Exception {
		Package ret = null;

		if (input instanceof IFileEditorInput) {
			ret = CDLResolver.getPackageFromCDLFile(((IFileEditorInput) input)
					.getFile().getLocation().toString());
			System.out.println(ret);
		} else if (input instanceof FileStoreEditorInput) {
			ret = CDLResolver
					.getPackageFromCDLFile(((FileStoreEditorInput) input)
							.getURI().getPath().toString());
		} else if (input instanceof MyEditorInput) {
			ret = CDLResolver
					.getPackageFromCDLFile(((MyFileEditorInput) ((MyEditorInput) input)
							.getInputFile()).getFile().getAbsolutePath());
		}

		return (ret);
	}

	private ResourceTracker getResourceTracker() {
		if (m_resourceTracker == null) {
			m_resourceTracker = new ResourceTracker(this);
		}

		return (m_resourceTracker);
	}

	protected void addAction(IAction action) {
		getActionRegistry().registerAction(action);
	}

	protected void addEditorAction(EditorPartAction action) {
		getActionRegistry().registerAction(action);
		m_editorActionIDs.add(action.getId());
	}

	protected void firePropertyChange(int propertyId) {
		super.firePropertyChange(propertyId);
		updateActions(m_editorActionIDs);
	}

	protected void addEditPartAction(SelectionAction action) {
		getActionRegistry().registerAction(action);
		m_editPartActionIDs.add(action.getId());
	}

	protected void addStackAction(StackAction action) {
		getActionRegistry().registerAction(action);
		m_stackActionIDs.add(action.getId());
	}

	public void setDirty(boolean dirty) {
		if (m_isDirty != dirty) {
			m_isDirty = dirty;
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
	}

	public boolean isDirty() {
		return (m_isDirty);
	}

	public boolean isSaveAsAllowed() {
		return (true);
	}

	public void doSave(IProgressMonitor monitor) {
		if (getEditorInput() instanceof IFileEditorInput) {
			try {
				IFile file = ((IFileEditorInput) getEditorInput()).getFile();
				save(file, monitor);
				getMultiPageCommandStackListener().markSaveLocations();
			} catch (CoreException e) {
				ErrorDialog.openError(getSite().getShell(),
						"Error During Save",
						"The Choreography Description could not be saved.", e
								.getStatus());
			}
		} else if (getEditorInput() instanceof MyEditorInput) {
			try {
				File file = ((MyFileEditorInput) ((MyEditorInput) getEditorInput())
						.getInputFile()).getFile();
				save(file, monitor);
				getMultiPageCommandStackListener().markSaveLocations();
			} catch (Exception e) {

			}
		} else {
			doSaveAs();
		}
	}

	public void doSaveAs() {
		SaveAsDialog dialog = new SaveAsDialog(getSite().getShell());
		dialog.setOriginalFile(((IFileEditorInput) getEditorInput()).getFile());
		dialog.open();
		IPath path = dialog.getResult();

		if (path == null)
			return;

		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(
				getSite().getShell());
		IProgressMonitor progressMonitor = null;

		try {
			save(ResourcesPlugin.getWorkspace().getRoot().getFile(path),
					progressMonitor);
			getMultiPageCommandStackListener().markSaveLocations();
		} catch (CoreException e) {
			ErrorDialog.openError(getSite().getShell(), "Error During Save",
					"The Choreography Description could not be saved.", e
							.getStatus());
		}
	}

	private synchronized void save(File file, IProgressMonitor progressMonitor)
			throws Exception {

		if (null == progressMonitor) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Saving " + file, 2);

		m_editorSaving = true;

		try {
			String text = XMLUtils.getText(CDLResolver
					.transformCDLPackage2CDL(m_choreographyDescription),true);
			ByteArrayOutputStream xmlstr = new java.io.ByteArrayOutputStream();
			xmlstr.write(text.getBytes());
			xmlstr.flush();
			xmlstr.close();
			ByteArrayInputStream bais = new ByteArrayInputStream(xmlstr
					.toByteArray());

			if (file.exists() == false) {
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(file));
				byte[] tmp = new byte[1];
				while (bais.read(tmp) != -1)
					bos.write(tmp);
				bais.close();
				bos.flush();
				bos.close();
				// file.create(bais, true, progressMonitor);
			} else {
				String str = file.getAbsolutePath();
				file.delete();
				File theFile = new File(str);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(theFile));
				byte[] tmp = new byte[1];
				while (bais.read(tmp) != -1)
					bos.write(tmp);
				bais.close();
				bos.flush();
				bos.close();
				// file.setContents(bais, true, true, progressMonitor);
			}

			bais.close();

			progressMonitor.worked(1);
			// file.refreshLocal(IResource.DEPTH_ZERO, new SubProgressMonitor(
			// progressMonitor, 1));
			progressMonitor.done();

			AbstractEditorPage page = (AbstractEditorPage) getCurrentPage();

			if (page != null) {

				page.refresh();

			}

		} catch (java.io.FileNotFoundException e) {
			IStatus status = new Status(IStatus.ERROR,
					DesignerDefinitions.DESIGNER_PLUGIN_ID, 0,
					"Error writing file.", e);
			throw new CoreException(status);
		} catch (java.io.IOException e) {
			IStatus status = new Status(IStatus.ERROR,
					DesignerDefinitions.DESIGNER_PLUGIN_ID, 0,
					"Error writing file.", e);
			throw new CoreException(status);
		} finally {
			m_editorSaving = false;
		}

	}

	private synchronized void save(IFile file, IProgressMonitor progressMonitor)
			throws CoreException {

		if (null == progressMonitor) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Saving " + file, 2);

		m_editorSaving = true;

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			CDLResolver.save(m_choreographyDescription, baos);
			baos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos
					.toByteArray());

			if (file.exists() == false) {
				file.create(bais, true, progressMonitor);
			} else {
				file.setContents(bais, true, true, progressMonitor);
			}

			bais.close();

			progressMonitor.worked(1);
			file.refreshLocal(IResource.DEPTH_ZERO, new SubProgressMonitor(
					progressMonitor, 1));
			progressMonitor.done();

			AbstractEditorPage page = (AbstractEditorPage) getCurrentPage();

			if (page != null) {

				page.refresh();

			}

		} catch (java.io.FileNotFoundException e) {
			IStatus status = new Status(IStatus.ERROR,
					DesignerDefinitions.DESIGNER_PLUGIN_ID, 0,
					"Error writing file.", e);
			throw new CoreException(status);
		} catch (java.io.IOException e) {
			IStatus status = new Status(IStatus.ERROR,
					DesignerDefinitions.DESIGNER_PLUGIN_ID, 0,
					"Error writing file.", e);
			throw new CoreException(status);
		} finally {
			m_editorSaving = false;
		}
	}

	public boolean isEditorSaving() {
		return (m_editorSaving);
	}

	public void dispose() {

		if (getEditorInput() != null) {
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			file.getWorkspace().removeResourceChangeListener(
					getResourceTracker());
		}

		getMultiPageCommandStackListener().dispose();

		getDelegatingCommandStack().removeCommandStackListener(
				getDelegatingCommandStackListener());

		getSite().getWorkbenchWindow().getSelectionService()
				.removeSelectionListener(getSelectionListener());

		getActionRegistry().dispose();

		if (m_outlinePage != null) {
			m_outlinePage.dispose();
		}

		super.dispose();
	}

	public void closeEditor(final boolean save) {
		getSite().getShell().getDisplay().syncExec(new Runnable() {
			public void run() {
				getSite().getPage().closeEditor(ChoreographyEditor.this, save);
			}
		});
	}

	protected MultiPageCommandStackListener getMultiPageCommandStackListener() {
		if (null == m_multiPageCommandStackListener) {
			m_multiPageCommandStackListener = new MultiPageCommandStackListener(
					this);
		}
		return (m_multiPageCommandStackListener);
	}

	protected DelegatingCommandStack getDelegatingCommandStack() {
		if (null == m_delegatingCommandStack) {
			m_delegatingCommandStack = new DelegatingCommandStack();
			if (null != getCurrentPage()) {
				m_delegatingCommandStack
						.setCurrentCommandStack(((AbstractEditorPage) getCurrentPage())
								.getCommandStack());
			}
		}

		return (m_delegatingCommandStack);
	}

	protected CommandStackListener getDelegatingCommandStackListener() {
		return (m_delegatingCommandStackListener);
	}

	protected DelegatingZoomManager getDelegatingZoomManager() {
		if (null == m_delegatingZoomManager) {
			m_delegatingZoomManager = new DelegatingZoomManager();
			if (null != getCurrentPage()
					&& null != ((AbstractEditorPage) getCurrentPage())
							.getViewer()) {
				m_delegatingZoomManager
						.setCurrentZoomManager(getZoomManager(((AbstractEditorPage) getCurrentPage())
								.getViewer()));
			}
		}

		return (m_delegatingZoomManager);
	}

	protected IPropertySheetPage getPropertySheetPage() {
		if (null == m_undoablePropertySheetPage) {
			m_undoablePropertySheetPage = new DesignerTabbedPropertySheetPage(
					this, getDelegatingCommandStack());

		}

		return (m_undoablePropertySheetPage);
	}

	private ZoomManager getZoomManager(org.eclipse.gef.EditPartViewer viewer) {

		RootEditPart rootEditPart = viewer.getRootEditPart();
		ZoomManager zoomManager = null;
		if (rootEditPart instanceof ScalableFreeformRootEditPart) {
			zoomManager = ((ScalableFreeformRootEditPart) rootEditPart)
					.getZoomManager();
		} else if (rootEditPart instanceof ScalableRootEditPart) {
			zoomManager = ((ScalableRootEditPart) rootEditPart)
					.getZoomManager();
		}
		return zoomManager;
	}

	public void gotoMarker(IMarker marker) {

		String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE,
				null);
		if (uriAttribute != null) {
			showComponent(uriAttribute);
		} else {
			logger.warning("Could not focus on marker: " + marker);
		}
	}

	public void showComponent(String emfuri) {

		if (emfuri != null) {
			String fragment = emfuri;
			URI uri = null;

			if (fragment == null || fragment.startsWith("//") == false) {
				uri = URI.createURI(emfuri);
				fragment = uri.fragment();
			}

			CDLElement cdlType = (CDLElement) m_choreographyDescription
					.eResource().getEObject(fragment);

			if (cdlType != null) {

				if (uri != null) {
					String path = uri.path();

					if (path.startsWith("/resource/")) {
						path = path.substring(10);
					}

					URI fileURI = URI.createFileURI(path);

					cdlType.eResource().setURI(fileURI);
				}

				if (cdlType.getBelongedChoreography() == null) {

					if (getCurrentPage() != getChoreographyBaseTypesPage()) {
						setActivePage(m_choreographyBaseTypesPageID);
					}
				} else {
					setActivePage(m_choreographyFlowPageID);
				}

				((AbstractEditorPage) getCurrentPage()).focus(cdlType);
			}
		}
	}

	protected void setActivePage(int pageIndex) {
		super.setActivePage(pageIndex);

		updateAfterPageChange(pageIndex);
	}

	public PaletteRoot getPaletteRoot() {
		if (null == m_paletteRoot) {

			m_paletteRoot = new ChoreographyPaletteRoot();
		}
		return (m_paletteRoot);
	}

	public SelectionSynchronizer getSelectionSynchronizer() {
		if (m_synchronizer == null) {
			m_synchronizer = new SelectionSynchronizer();
		}
		return (m_synchronizer);
	}

	private void updateActions(java.util.List actionIds) {
		for (java.util.Iterator ids = actionIds.iterator(); ids.hasNext();) {
			IAction action = getActionRegistry().getAction(ids.next());
			if (null != action && action instanceof UpdateAction) {
				((UpdateAction) action).update();
			}
		}
	}

	public Object getAdapter(Class type) {

		if (type == IPropertySheetPage.class) {
			return getPropertySheetPage();
		} else if (type == CommandStack.class) {
			return getDelegatingCommandStack();
		} else if (type == ActionRegistry.class) {
			return getActionRegistry();
		} else if (type == IContentOutlinePage.class) {
			return getOutlinePage();
		} else if (type == ZoomManager.class) {
			return getDelegatingZoomManager();
		} else {
			Object ret = getCurrentPage().getAdapter(type);

			if (ret != null) {
				return (ret);
			}
		}

		return super.getAdapter(type);
	}

	protected ISelectionListener getSelectionListener() {
		return (m_selectionListener);
	}

	public ActionRegistry getActionRegistry() {
		if (m_actionRegistry == null) {
			m_actionRegistry = new ActionRegistry();
		}

		return (m_actionRegistry);
	}

	public KeyHandler getSharedKeyHandler() {
		if (m_sharedKeyHandler == null) {
			m_sharedKeyHandler = new KeyHandler();
			m_sharedKeyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0),
					getActionRegistry()
							.getAction(
									org.eclipse.ui.actions.ActionFactory.DELETE
											.getId()));
			m_sharedKeyHandler.put(KeyStroke.getPressed(SWT.F2, 0),
					getActionRegistry().getAction(
							GEFActionConstants.DIRECT_EDIT));
		}
		return (m_sharedKeyHandler);
	}

	protected FigureCanvas getEditor() {
		return (FigureCanvas) ((AbstractEditorPage) getCurrentPage())
				.getViewer().getControl();
	}

	protected OutlinePage getOutlinePage() {
		if (m_outlinePage == null) {
			m_outlinePage = new OutlinePage();
		}
		return (m_outlinePage);
	}

	private static Logger logger = Logger.getLogger("edu.xjtu.designer.editor");

	private boolean m_isDirty = false;
	private boolean m_editorSaving = false;
	private MultiPageCommandStackListener m_multiPageCommandStackListener = null;
	private PaletteRoot m_paletteRoot = null;
	private KeyHandler m_sharedKeyHandler = null;
	private SelectionSynchronizer m_synchronizer = null;
	private int m_choreographyBaseTypesPageID = -1;
	private int m_choreographyFlowPageID = -1;
	private DelegatingCommandStack m_delegatingCommandStack = null;
	private DelegatingZoomManager m_delegatingZoomManager = null;
	private Package m_choreographyDescription = null;
	private java.util.List m_stackActionIDs = new java.util.ArrayList();
	private java.util.List m_editPartActionIDs = new java.util.ArrayList();
	private java.util.List m_editorActionIDs = new java.util.ArrayList();
	private ActionRegistry m_actionRegistry = null;
	private IPropertySheetPage m_undoablePropertySheetPage = null;
	private ResourceTracker m_resourceTracker = null;
	private PrintAction m_printAction = null;
	private OutlinePage m_outlinePage = null;

	private CommandStackListener m_delegatingCommandStackListener = new CommandStackListener() {
		public void commandStackChanged(java.util.EventObject event) {
			updateActions(m_stackActionIDs);
		}
	};

	private ISelectionListener m_selectionListener = new ISelectionListener() {
		public void selectionChanged(IWorkbenchPart part, ISelection selection) {
			updateActions(m_editPartActionIDs);
		}
	};

	class OutlinePage extends ContentOutlinePage implements IAdaptable {

		public OutlinePage() {
			super();
		}

		public void init(IPageSite pageSite) {
			super.init(pageSite);
			ActionRegistry registry = getActionRegistry();
			IActionBars bars = pageSite.getActionBars();
			String id = ActionFactory.UNDO.getId();
			bars.setGlobalActionHandler(id, registry.getAction(id));
			id = ActionFactory.REDO.getId();
			bars.setGlobalActionHandler(id, registry.getAction(id));
			id = ActionFactory.DELETE.getId();
			bars.setGlobalActionHandler(id, registry.getAction(id));
			bars.updateActionBars();
		}

		protected void configureOutlineViewer() {
			if (thumbnail == null)
				initializeOverview();
			pageBook.showPage(overview);
			// thumbnail.setVisible(true);
		}

		public void createControl(Composite parent) {
			pageBook = new PageBook(parent, SWT.NONE);
			overview = new Canvas(pageBook, SWT.NONE);
			pageBook.showPage(outline);
			configureOutlineViewer();
		}

		public void dispose() {
			if (thumbnail != null) {
				thumbnail.deactivate();
				thumbnail = null;
			}
			super.dispose();
		}

		public void prePageChange() {
			if (thumbnail != null) {
				thumbnail.deactivate();
				thumbnail = null;
			}
		}

		public void pageChange() {
			initializeOverview();
		}

		public Object getAdapter(Class type) {
			if (type == ZoomManager.class)
				return ((AbstractEditorPage) getCurrentPage()).getViewer()
						.getProperty(ZoomManager.class.toString());
			return null;
		}

		public Control getControl() {
			return pageBook;
		}

		protected void initializeOverview() {
			LightweightSystem lws = new LightweightSystem(overview);
			RootEditPart rep = ((AbstractEditorPage) getCurrentPage())
					.getViewer().getRootEditPart();
			if (rep instanceof ScalableFreeformRootEditPart) {
				ScalableFreeformRootEditPart root = (ScalableFreeformRootEditPart) rep;
				thumbnail = new org.eclipse.draw2d.parts.ScrollableThumbnail(
						(Viewport) root.getFigure());
				thumbnail.setBorder(new MarginBorder(3));
				thumbnail.setSource(root
						.getLayer(LayerConstants.PRINTABLE_LAYERS));
				lws.setContents(thumbnail);
			}
		}

		public void setFocus() {
		}

		public void setContents(Object contents) {

		}

		private PageBook pageBook;
		private Control outline;
		private Canvas overview;
		private org.eclipse.draw2d.parts.Thumbnail thumbnail;
	}
}
