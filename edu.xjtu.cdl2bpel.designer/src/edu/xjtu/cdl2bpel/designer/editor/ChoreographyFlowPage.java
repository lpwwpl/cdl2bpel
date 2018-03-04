package edu.xjtu.cdl2bpel.designer.editor;

import java.util.Iterator;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.designer.DesignerImages;
import edu.xjtu.cdl2bpel.designer.flow.commands.CreateFlowTopLevelComponentCommand;
import edu.xjtu.cdl2bpel.designer.flow.parts.BaseTypeEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.FlowEditPartsFactory;
import edu.xjtu.cdl2bpel.designer.flow.parts.FlowSelector;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;

public class ChoreographyFlowPage extends AbstractChoreographyEditorPage
		implements FlowSelector {

	public ChoreographyFlowPage(ChoreographyEditor parent) {
		super(parent, new EditDomain());
	}

	public String getPageName() {
		return ("Choreography Flows");
	}

	protected void createBannerControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.FILL);

		GridLayout layout = new GridLayout();
		layout.marginHeight = 2;
		layout.marginWidth = 10;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 5;
		layout.numColumns = 6;

		composite.setLayout(layout);
		composite.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));
		composite.setForeground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_FOREGROUND));

		Label label = new Label(composite, SWT.NONE);
		label.setText("Flow:");
		label.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_LIST_BACKGROUND));

		m_flowList = new Combo(composite, SWT.FILL | SWT.READ_ONLY);
		m_flowList.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				CDLElement choreo = (CDLElement) m_flows.get(m_flowList
						.getSelectionIndex());
				setFlow(choreo);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 400;
		m_flowList.setLayoutData(gd);

		m_addToplevelChoreoButton = new Button(composite, SWT.RIGHT);
		m_addToplevelChoreoButton.setImage(DesignerImages
				.getImage("TopChoreography.gif"));
		m_addToplevelChoreoButton.setToolTipText("Add Toplevel Choreography");

		m_addToplevelChoreoButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				Choreography choreo = CDLFactory.eINSTANCE.createChoreography();

				if (getChoreographyDescription() != null) {

					CreateFlowTopLevelComponentCommand command = new CreateFlowTopLevelComponentCommand(
							ChoreographyFlowPage.this);
					command.setParent(getChoreographyDescription());
					command.setChild(choreo);

					getCommandStack().execute(command);

					updateFlowList();

					focus(choreo);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		m_addEnclosedChoreoButton = new Button(composite, SWT.RIGHT);
		m_addEnclosedChoreoButton.setEnabled(false);

		m_addEnclosedChoreoButton.setImage(DesignerImages
				.getImage("SubChoreography.gif"));
		m_addEnclosedChoreoButton.setToolTipText("Add Enclosed Choreography");

		m_addEnclosedChoreoButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				Choreography choreo = CDLFactory.eINSTANCE.createChoreography();

				if (getCDLFlow() != null
						&& getCDLFlow().getBelongedChoreography() != null) {

					CreateFlowTopLevelComponentCommand command = new CreateFlowTopLevelComponentCommand(
							ChoreographyFlowPage.this);
					command.setParent(getCDLFlow().getBelongedChoreography());
					command.setChild(choreo);

					getCommandStack().execute(command);

					updateFlowList();

					focus(choreo);
				}
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		m_addExceptionHandlerButton = new Button(composite, SWT.RIGHT);
		m_addExceptionHandlerButton.setEnabled(false);

		m_addExceptionHandlerButton.setImage(DesignerImages
				.getImage("ExceptionHandlerButton.gif"));
		m_addExceptionHandlerButton.setToolTipText("Add Exception Handler");

		m_addExceptionHandlerButton
				.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent e) {
						ExceptionWorkUnit ewu = CDLFactory.eINSTANCE
								.createExceptionWorkUnit();

						if (getCDLFlow() != null
								&& getCDLFlow().getBelongedChoreography() != null) {
							Choreography choreo = getCDLFlow()
									.getBelongedChoreography();

							CreateFlowTopLevelComponentCommand command = new CreateFlowTopLevelComponentCommand(
									ChoreographyFlowPage.this);
							command.setParent(choreo);
							command.setChild(ewu);

							getCommandStack().execute(command);

							updateFlowList();

							focus(ewu);
						}
					}

					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		m_addFinalizerHandlerButton = new Button(composite, SWT.RIGHT);
		m_addFinalizerHandlerButton.setEnabled(false);

		m_addFinalizerHandlerButton.setImage(DesignerImages
				.getImage("FinalizerHandlerButton.gif"));
		m_addFinalizerHandlerButton.setToolTipText("Add Finalizer Handler");

		m_addFinalizerHandlerButton
				.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent e) {
						FinalizerBlock finh = CDLFactory.eINSTANCE
								.createFinalizerBlock();

						if (getCDLFlow() != null
								&& getCDLFlow().getBelongedChoreography() != null) {

							CreateFlowTopLevelComponentCommand command = new CreateFlowTopLevelComponentCommand(
									ChoreographyFlowPage.this);
							command.setParent(getCDLFlow()
									.getBelongedChoreography());
							command.setChild(finh);

							getCommandStack().execute(command);

							updateFlowList();

							focus(finh);
						}
					}

					public void widgetDefaultSelected(SelectionEvent e) {
					}
				});

		updateList();
	}

	protected void updateFlowList() {

		m_flowList.removeAll();
		m_flows.clear();

		if (getChoreographyDescription() != null) {
			java.util.Vector list = new java.util.Vector();

			Iterator iter = getChoreographyDescription().getChoreographies()
					.iterator();

			while (iter.hasNext()) {
				Choreography choreo = (Choreography) iter.next();
				updateFlowList(list, choreo);
			}

			for (int i = 0; i < list.size(); i++) {
				Choreography choreo = (Choreography) list.get(i);
				String name = getComponentName(choreo);

				m_flowList.add(name);
				m_flows.add(choreo);

				iter = null;

				if (choreo.getExceptionBlock() != null) {
					iter = choreo.getExceptionBlock().getExceptionWorkUnits()
							.iterator();
				}

				if (iter != null) {
					while (iter.hasNext()) {
						ExceptionWorkUnit ewu = (ExceptionWorkUnit) iter.next();
						String ename = getComponentName(ewu);

						m_flowList.add(ename);
						m_flows.add(ewu);
					}
				}

				iter = choreo.getFinalizerBlocks().iterator();

				while (iter.hasNext()) {
					FinalizerBlock handler = (FinalizerBlock) iter.next();
					String hname = getComponentName(handler);

					m_flowList.add(hname);
					m_flows.add(handler);
				}
			}
		}
	}

	protected void updateFlowList(java.util.List list, Choreography parent) {

		list.add(parent);

		Iterator iter = parent.getEnclosedChoreographies().iterator();

		while (iter.hasNext()) {
			Choreography choreo = (Choreography) iter.next();

			updateFlowList(list, choreo);
		}
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
		m_viewer = new ScrollingGraphicalViewer();
		m_viewer.createControl(parent);

		m_viewer.getControl().setBackground(parent.getBackground());
		m_viewer.setRootEditPart(new ScalableFreeformRootEditPart());
		m_viewer.setKeyHandler(new GraphicalViewerKeyHandler(m_viewer));

		registerEditPartViewer(m_viewer);

		configureEditPartViewer(m_viewer);

		m_viewer.setEditPartFactory(new FlowEditPartsFactory(this));
		m_viewer.setContents(getChoreographyDescription());

		resetCurrentChoreography();
	}

	protected void resetViewer() {
		if (m_viewer != null && getChoreographyDescription() != null) {
			m_viewer.setContents(getChoreographyDescription());
		}
	}

	protected void resetCurrentChoreography() {

		updateFlowList();

		Choreography choreo = ModelSupport
				.getRootChoreography(getChoreographyDescription());

		if (choreo == null && getChoreographyDescription() != null
				&& getChoreographyDescription().getChoreographies().size() > 0) {

			choreo = (Choreography) getChoreographyDescription()
					.getChoreographies().get(0);
		}

		setFlow(choreo);
	}

	protected void setFlow(Object flow) {

		if ((flow instanceof CDLElement) == false) {
			return;
		}

		m_currentFlow = (CDLElement) flow;

		if (m_currentFlow != null && m_flowList != null) {

			int index = m_flows.indexOf(flow);

			if (index != -1) {
				m_flowList.select(index);
			} else {
				m_flowList.select(0);

				m_currentFlow = (Choreography) m_flows.get(0);
			}
		}

		resetViewer();

		m_addEnclosedChoreoButton.setEnabled(flow != null);
		m_addExceptionHandlerButton.setEnabled(flow != null);
		m_addFinalizerHandlerButton.setEnabled(flow != null);
	}

	protected org.eclipse.gef.EditPartViewer getViewer() {
		return (m_viewer);
	}

	public String getTitle() {
		return ("Edit the choreography flow");
	}

	public Object getFlow() {
		return (m_currentFlow);
	}

	protected CDLElement getCDLFlow() {
		return (m_currentFlow);
	}

	public void updateList() {
		updateFlowList();

		if (m_currentFlow == null
				|| (m_currentFlow != null && m_flows.contains(m_currentFlow) == false)) {
			Choreography choreo = ModelSupport
					.getRootChoreography(getChoreographyDescription());

			if (choreo == null
					&& getChoreographyDescription() != null
					&& getChoreographyDescription().getChoreographies().size() > 0) {

				choreo = (Choreography) getChoreographyDescription()
						.getChoreographies().get(0);
			}

			m_currentFlow = choreo;
		}

		setFlow(getFlow());
	}

	protected CDLElement getFocusFlow(CDLElement cdlType) {
		CDLElement ret = cdlType;

		while (ret != null
				&& (ret instanceof Choreography
						|| ret instanceof ExceptionWorkUnit || ret instanceof FinalizerBlock) == false) {

			ret = ret.getParent();
		}

		return (ret);
	}

	public void focus(Object component) {

		if ((component instanceof CDLElement) == false) {
			return;
		}

		CDLElement cdlType = (CDLElement) component;

		setFlow(getFocusFlow(cdlType));

		resetViewer();

		m_viewer.flush();

		org.eclipse.gef.EditPart editpart = m_viewer.getContents();
		if (editpart instanceof BaseTypeEditPart) {

			editpart = findSelectedEditPart((BaseTypeEditPart) editpart,
					cdlType);

			if (editpart != null) {
				m_viewer.select(editpart);

				BaseTypeEditPart cdlep = (BaseTypeEditPart) editpart;
				int x = 0;
				int y = 0;
				int width = cdlep.getWidth();
				int height = cdlep.getHeight();

				while (cdlep != null) {
					Rectangle r = cdlep.getEditPartBounds();

					x += r.x;
					y += r.y;

					if (cdlep.getParent() instanceof BaseTypeEditPart) {
						cdlep = (BaseTypeEditPart) cdlep.getParent();
					} else {
						cdlep = null;
					}
				}

				FigureCanvas canvas = (FigureCanvas) m_viewer.getControl();

				Viewport port = canvas.getViewport();
				Dimension viewportSize = port.getClientArea().getSize();

				x -= (viewportSize.width - width) / 2;
				y -= (viewportSize.height - height) / 2;

				canvas.scrollSmoothTo(x, y);
			}
		}
	}

	public Object getFocusComponent() {
		return (getFlow());
	}

	public void refresh(IEditorInput input) {
		super.refresh(input);

		resetCurrentChoreography();
	}

	public void refresh() {
		updateList();
	}

	protected String getComponentName(CDLElement component) {
		String ret = null;

		Choreography choreo = component.getBelongedChoreography();

		if (choreo != null) {
			ret = getChoreographyName(choreo);

			ret += getComponentSuffix(component);
		}

		return (ret);
	}

	protected String getChoreographyName(Choreography choreo) {
		String ret = null;

		if (CheckNOthersUtil.isSet(choreo.getName()) == false) {
			ret = "<unnamed>";
		} else {
			ret = choreo.getName();
		}

		if (choreo.getParent() instanceof Choreography) {

			ret = getChoreographyName((Choreography) choreo.getParent())
					+ " / " + ret;
		}

		return (ret);
	}

	protected String getComponentSuffix(CDLElement component) {
		String ret = "";

		if (component instanceof Choreography) {
			Choreography choreo = (Choreography) component;

			if ((choreo.getExceptionBlock() != null && choreo
					.getExceptionBlock().getExceptionWorkUnits().size() > 0)
					|| choreo.getFinalizerBlocks().size() > 0) {
				ret = " [normal]";
			}
		} else if (component instanceof ExceptionWorkUnit) {
			ExceptionWorkUnit ewu = (ExceptionWorkUnit) component;

			ret = ewu.getExceptionType();

			if (CheckNOthersUtil.isSet(ret)) {
				ret = " [exception=" + ret + "]";
			} else {
				ret = " [exception=default]";
			}
		} else if (component instanceof FinalizerBlock) {
			FinalizerBlock finh = (FinalizerBlock) component;

			ret = " [finalizer=" + ViewSupport.getNameText(finh.getName())
					+ "]";
		}

		return (ret);
	}

	private GraphicalViewer m_viewer = null;
	private CDLElement m_currentFlow = null;
	private Combo m_flowList = null;
	private Button m_addToplevelChoreoButton = null;
	private Button m_addEnclosedChoreoButton = null;
	private Button m_addExceptionHandlerButton = null;
	private Button m_addFinalizerHandlerButton = null;
	private java.util.Vector m_flows = new java.util.Vector();

	protected ComposedAdapterFactory m_adapterFactory;
}
