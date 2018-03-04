package edu.xjtu.cdl2bpel.mapping.view;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGenerator;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGeneratorFactory;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGenerator;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGeneratorFactory;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.generator.eclipse.CDL2BPELGeneratePlugin;
import edu.xjtu.cdl2bpel.generator.eclipse.properties.CDL2BPELGeneratePropertyPage;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.mapping.util.EclipseResourceProperties;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleArrayManager;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleItem;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleRelationAlgorithm;

public class CDL2BPELMappingFormPage extends FormPage implements ISelectionListener {
	
	private Table groupsByRoleRelationAlgorithmTable;
	private Tree participantAndRoleTypesTree;
	FormToolkit toolkit = null;
	private RoleRelationAlgorithm rra;
	TableViewer tableViewer;
	List<Pair<RoleType[],String>> roles = new ArrayList();
	
	Label lblParticipantRoletypes = null;
	Button mapping2BPEL = null;

	Label lblGroupsByRolerelationAlgorithm = null;
	Button mapping2WSDL = null;

	private String filePath ;
	private EclipseResourceProperties props;
	private String threshold;
	private Package cdlpack;
	private IResource res;
	
	Label lblThreshold = null;
	Button btRefreshThreshold = null;
	Text thresholdText = null;
	Scale scale = null; 
	
	public CDL2BPELMappingFormPage(FormEditor editor) {
		super(editor, "roleRelationAlgorithm", "CDL2BPEL");
		filePath = new File(getIFileOfEditorPart().getLocationURI()).getPath();
		final IFile file = getIFileOfEditorPart();
		IProject project = ((IFile)file).getProject();
		props = new EclipseResourceProperties(file, project);
		rra = new RoleRelationAlgorithm(filePath);
		try{
			res = ((IResource)file);
			threshold = res.getPersistentProperty(new QualifiedName(CDL2BPELGeneratePropertyPage.PLUGIN,
				CDL2BPELGeneratePropertyPage.THRESHOLD_KEY));
			if(threshold == null) {
				res.setPersistentProperty(new QualifiedName(CDL2BPELGeneratePropertyPage.PLUGIN,
						CDL2BPELGeneratePropertyPage.THRESHOLD_KEY),"0.0");
				threshold = res.getPersistentProperty(new QualifiedName(CDL2BPELGeneratePropertyPage.PLUGIN,
						CDL2BPELGeneratePropertyPage.THRESHOLD_KEY));
				rra.setThreshold(Float.valueOf(threshold));
			} else {
				rra.setThreshold(Float.valueOf(threshold));
			}
			cdlpack = CDLResolver.getPackageFromCDLFile(filePath);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		rra.caculate(rra.getFilepath());
	}

	public IFile getIFileOfEditorPart() {
		IEditorPart editor = this.getEditor();
		IEditorInput input = editor.getEditorInput();
		IFile file = null;
		if (input instanceof IFileEditorInput) {
			file = ((IFileEditorInput) input).getFile();
		}
		return file;
	}

	private Section createSection(IManagedForm managedForm, String string) {
		final ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		Section section = toolkit.createSection(form.getBody(),Section.TWISTIE | Section.TITLE_BAR | Section.DESCRIPTION);
		section.setText(string);
		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(false);
			}
		});
		return section;
	}

	public void createParticipantAndRoleTypesTree(Composite composite) {

		lblParticipantRoletypes = toolkit.createLabel(composite, "");
		lblParticipantRoletypes.setText("参与者角色关系树 ");

		final TreeViewer treeViewer = new TreeViewer(composite, SWT.MULTI
				| SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		participantAndRoleTypesTree = treeViewer.getTree();
		participantAndRoleTypesTree.setVisible(true);

		Map<ParticipantType,List<RoleItem>> maps = new HashMap<ParticipantType,List<RoleItem>>();
		RoleItem[] roleItems = RoleArrayManager.getManager(filePath).getRoleItems();
		List<ParticipantType> participants = cdlpack.getParticipantTypes();
		for(ParticipantType participant:participants) {
			List<RoleItem> temp = new ArrayList<RoleItem>();
			for(RoleItem roleItem:roleItems){
				if(roleItem.getParticipant().getName().equals(participant.getName())) {
					temp.add(roleItem);
				}
			}
			maps.put(participant, temp);
		}
		
		treeViewer
				.setLabelProvider(new ParticipantAndRoleTypesTreeLabelProvider());
		treeViewer
				.setContentProvider(new ParticipantAndRoleTypesTreeContentProvider(
						maps));
		treeViewer.setInput(maps);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener(){
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				if(obj instanceof RoleItem) {
				} else {
				}
			}
		});
		getSite().setSelectionProvider(treeViewer);	
		
		FormData formDataOflblParticipantRoletypes = new FormData();
		formDataOflblParticipantRoletypes.top = new FormAttachment(0, 25);
		formDataOflblParticipantRoletypes.left = new FormAttachment(
				groupsByRoleRelationAlgorithmTable, 10, 25);
		formDataOflblParticipantRoletypes.width = 250;
		formDataOflblParticipantRoletypes.height = 25;
		lblParticipantRoletypes
				.setLayoutData(formDataOflblParticipantRoletypes);

		FormData formDataOftreeViewer = new FormData();
		formDataOftreeViewer.top = new FormAttachment(lblParticipantRoletypes,
				0, 25);
		formDataOftreeViewer.left = new FormAttachment(
				groupsByRoleRelationAlgorithmTable, 10, 50);
		formDataOftreeViewer.width = 250;
		formDataOftreeViewer.height = 200;
		participantAndRoleTypesTree.setLayoutData(formDataOftreeViewer);

	}

	public void createGroupsByRolerelationAlgorithmTabel(Composite composite) {
		lblGroupsByRolerelationAlgorithm = toolkit.createLabel(composite,
				"Groups By RoleRelationAlgorithm");
		lblGroupsByRolerelationAlgorithm
				.setText("按角色分组算法分组");

		tableViewer = new TableViewer(composite, SWT.MULTI
				| SWT.BORDER | SWT.FULL_SELECTION);
		groupsByRoleRelationAlgorithmTable = tableViewer.getTable();
		groupsByRoleRelationAlgorithmTable.setHeaderVisible(true);
		groupsByRoleRelationAlgorithmTable.setLinesVisible(true);

		FormData formDataOflblGroupsByRolerelationAlgorithm = new FormData();
		formDataOflblGroupsByRolerelationAlgorithm.top = new FormAttachment(0,
				25);
		formDataOflblGroupsByRolerelationAlgorithm.left = new FormAttachment(0,
				25);
		formDataOflblGroupsByRolerelationAlgorithm.width = 250;
		formDataOflblGroupsByRolerelationAlgorithm.height = 25;
		lblGroupsByRolerelationAlgorithm
				.setLayoutData(formDataOflblGroupsByRolerelationAlgorithm);

		TableLayout layout = new TableLayout();
		groupsByRoleRelationAlgorithmTable.setLayout(layout);

		TableColumn groupNameColumn = new TableColumn(
				groupsByRoleRelationAlgorithmTable, SWT.NONE);
		groupNameColumn.setWidth(80);
		groupNameColumn.setText("分组名");
		TableColumn roleTypesColumn = new TableColumn(
				groupsByRoleRelationAlgorithmTable, SWT.NONE);
		roleTypesColumn.setWidth(200);
		roleTypesColumn.setText("分组所包含的角色");

		tableViewer
				.setContentProvider(new GroupsByRolerelationAlgorithmTabelContentProvider());
		tableViewer
				.setLabelProvider(new GroupsByRolerelationAlgorithmTabelLabelProvider());
		
		tableViewer.setInput(rra.getGroups());
		getSite().setSelectionProvider(tableViewer);
		getSite().getPage().addSelectionListener(this);
		
		FormData formDataOftable = new FormData();
		formDataOftable.top = new FormAttachment(
				lblGroupsByRolerelationAlgorithm, 0, 25);
		formDataOftable.left = new FormAttachment(0, 25);
		formDataOftable.width = 250;
		formDataOftable.height = 200;
		groupsByRoleRelationAlgorithmTable.setLayoutData(formDataOftable);
	}

	public void createInfomationByMappingAction(IManagedForm managedForm) {

	}

	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm scrolledform =managedForm.getForm();
    	scrolledform.setText("角色关联分析");
    	scrolledform.setBackgroundImage(CDL2BPELGeneratePlugin.getDefault().getImage(CDL2BPELGeneratePlugin.IMG_FORM_BG));
        GridLayout layout=new GridLayout();
        layout.numColumns=1;
        scrolledform.getBody().setLayout(layout);
        createThresholdContent(managedForm,"设定分组阈值");
        createCDL2BPELContent(managedForm,"CDL2BPEL映射");

	}
	
	protected void createThresholdContent(IManagedForm managedForm,String title) {
		toolkit = managedForm.getToolkit();
		Section section = createSection(managedForm,title);
		final Composite composite = toolkit.createComposite(section, SWT.FLAT);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 6;
		composite.setLayout(gridLayout);
		
		lblThreshold = toolkit.createLabel(composite,"请选择分组阈值： ");
		
//		##########################
		

		scale = new Scale(composite, 1);
		try {
			
			scale.setSelection((int)( Float.parseFloat(res
					.getPersistentProperty(new QualifiedName(
							CDL2BPELGeneratePropertyPage.PLUGIN,
							CDL2BPELGeneratePropertyPage.THRESHOLD_KEY)))* 100));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		scale.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e){
				Scale scale= (Scale)e.widget;
				thresholdText.setText(String.valueOf((float)(scale.getSelection()-scale.getMinimum())/100.0));
			}
		});

		final GridData gridData = new GridData(SWT.LEFT,SWT.CENTER,false,false,2,1);
//		scale.setLayoutData(gridData);
		
		
		thresholdText = toolkit.createText(composite, "tiptext",SWT.BORDER);
		thresholdText.setEditable(false);
		thresholdText.setLayoutData(gridData);
		
		try {
			thresholdText.setText(res.getPersistentProperty(new QualifiedName(
					CDL2BPELGeneratePropertyPage.PLUGIN,
					CDL2BPELGeneratePropertyPage.THRESHOLD_KEY)));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		btRefreshThreshold = toolkit.createButton(composite, "生成分组", SWT.PUSH);
		
		section.setClient(composite);
		section.setExpanded(true);
		

		btRefreshThreshold.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				try {
					res.setPersistentProperty(new QualifiedName(
							CDL2BPELGeneratePropertyPage.PLUGIN,
							CDL2BPELGeneratePropertyPage.THRESHOLD_KEY),
							thresholdText.getText());
					threshold = res.getPersistentProperty(new QualifiedName(
							CDL2BPELGeneratePropertyPage.PLUGIN,
							CDL2BPELGeneratePropertyPage.THRESHOLD_KEY));
					((List) tableViewer.getInput()).clear();
					rra.setThreshold(Float.valueOf(threshold));
					rra.caculate(rra.getFilepath());
					tableViewer.setInput(rra.getGroups());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
	}
	
	protected void createCDL2BPELContent(IManagedForm managedForm,String title) {
		
//		toolkit = managedForm.getToolkit();
		
		final ScrolledForm form = managedForm.getForm();
		toolkit = managedForm.getToolkit();
		
		Section section = createSection(managedForm,title);
		
		Composite composite = toolkit.createComposite(section, SWT.WRAP);
		composite.setLayout(new FormLayout());
		section.setClient(composite);

		createGroupsByRolerelationAlgorithmTabel(composite);
		createParticipantAndRoleTypesTree(composite);

		mapping2BPEL = toolkit.createButton(composite, "", SWT.PUSH);
		mapping2BPEL.setText("映射到BPEL");
		
		mapping2WSDL = toolkit.createButton(composite, "", SWT.PUSH);
		mapping2WSDL.setText("映射到WSDL");

		toolkit.paintBordersFor(composite);

		FormData formDataOfmapping2BPEL = new FormData();
		formDataOfmapping2BPEL.top = new FormAttachment(
				groupsByRoleRelationAlgorithmTable, 0, 25);
		formDataOfmapping2BPEL.left = new FormAttachment(0, 25);
		formDataOfmapping2BPEL.width = 120;
		formDataOfmapping2BPEL.height = 25;
		mapping2BPEL.setLayoutData(formDataOfmapping2BPEL);

		FormData formDataOfmapping2WSDL = new FormData();
		formDataOfmapping2WSDL.top = new FormAttachment(groupsByRoleRelationAlgorithmTable, 0, 25);
		formDataOfmapping2WSDL.left = new FormAttachment(0, 150);
		formDataOfmapping2WSDL.width = 120;
		formDataOfmapping2WSDL.height = 25;
		mapping2WSDL.setLayoutData(formDataOfmapping2WSDL);

		List<Group> groups = rra.getGroups();
		for (Group group : groups) {
			List roleTypesInGroup = group.getRoleType();
			RoleType[] roletypes = (new RoleType[roleTypesInGroup.size()]);
			int i = 0;
			for (Iterator it = roleTypesInGroup.iterator(); it.hasNext();) {
				RoleType roleType = CDLPackageUtil.getRoleType(cdlpack,
						((RoleType) it.next()).getName());
				roletypes[i] = roleType;
				i++;
			}
			i = 0;
			// roleTypesInGroup.toArray(new RoleType[roleTypesInGroup.size()]);
			roles.add(new Pair(roletypes, DefaultTNS.getTNS()));
		}
		
		DefaultTNS.reset();
		
		mapping2BPEL.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					CDL2WSBPELGenerator gen = CDL2WSBPELGeneratorFactory
							.createGenerator(roles, props);
					gen.generateBPEL2ResourceProperties(cdlpack);
					res.getParent().refreshLocal(2, null);
					
				} catch(Throwable ex) {
					ex.printStackTrace();
				}
			}
		});
		
		mapping2WSDL.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				try {
					CDL2WSDLGenerator generator = CDL2WSDLGeneratorFactory
							.createGenerator(cdlpack,props, roles);
					generator.generateWSDL2ResourceProperties();
					res.getParent().refreshLocal(2, null);
					
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	
	public class MySelectionProvider implements ISelectionProvider {

		@Override
		public void addSelectionChangedListener(
				ISelectionChangedListener listener) {
			

		}

		@Override
		public ISelection getSelection() {
			
			return null;
		}

		@Override
		public void removeSelectionChangedListener(
				ISelectionChangedListener listener) {
			

		}

		@Override
		public void setSelection(ISelection selection) {
			

		}
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		
		
	}
}

