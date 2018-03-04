package edu.xjtu.cdl2bpel.designer.editor;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Text;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGenerator;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGeneratorFactory;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGenerator;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGeneratorFactory;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.mapping.view.CDL2BPELViewContent;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleRelationAlgorithm;
public class CDL2BPELMappingPage extends AbstractChoreographyEditorPage {

	private TableViewer tableViewer;
	private float threadHoldValue = 1.0f;// 阈值
	public static String filePath;
	ChoreographyEditor editor;
	RoleRelationAlgorithm rra;
	private String threadHoldString = "阈值：";
	List<Pair<RoleType[], String>> roles = new ArrayList();
	
//	public CDL2BPELMappingPage(ChoreographyEditor parent, EditDomain domain) {
//		super(parent, domain);
//		
//		editor = parent;
//	}

	public CDL2BPELMappingPage(ChoreographyEditor parent) {
		super(parent, new EditDomain());
		MyFileEditorInput myFileEditorInput = (MyFileEditorInput) (((MyEditorInput) (parent
				.getEditorInput())).getInputFile());//
		filePath = myFileEditorInput.getFile().getAbsolutePath();
		editor = parent;
		rra = rra = new RoleRelationAlgorithm(filePath);
	}

	@Override
	protected void createPageControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setBackground(parent.getBackground());

		FillLayout fillLayout = new FillLayout();
		fillLayout.type = SWT.VIRTUAL;

		composite.setLayout(fillLayout);

		createThresholdContent(composite, "alj");

		int lastIndexOfFilePath = filePath.lastIndexOf("\\");
		String destination = filePath.substring(0, lastIndexOfFilePath);
		final List<Pair<RoleType[], String>> roles = new ArrayList();

		Composite talbePanel = this.createTableComposite(composite,
				destination, filePath);
	}

	@Override
	protected String getPageName() {
		return null;
	}

	@Override
	protected EditPartViewer getViewer() {
		return null;
	}

	public void caculate4Groups(Package cdlpack,TableViewer tableViewer) {
		roles.clear();
		List<Group> groups = (List<Group> )tableViewer.getInput();
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
	}
	
	private Composite createTableComposite(Composite coposite,
			String destination, final String filePath) {
		final String f_destination = destination;
		Composite parent = new Composite(coposite, SWT.BORDER);

		FillLayout fillLayout = new FillLayout();
		fillLayout.type = SWT.VERTICAL;
		parent.setLayout(fillLayout);

		final edu.xjtu.cdl2bpel.cdl.Package cdlpack = CDLResolver
				.getPackageFromCDLFile(filePath);
		
		CDL2BPELViewContent content = new CDL2BPELViewContent(filePath);
		tableViewer = content.createTableViewer(parent, filePath);

		// Table table=tableViewer.getTable();
		
		caculate4Groups(cdlpack,tableViewer);
		
		org.eclipse.swt.widgets.Group groupPanel = new org.eclipse.swt.widgets.Group(
				parent, SWT.NONE);
		RowLayout rowLayout = new RowLayout();
		rowLayout.type = SWT.HORIZONTAL;
		groupPanel.setLayout(rowLayout);
		// groupPanel.setBounds(20, 20, 600, 600);
		/************* 设置按钮 *****************************************************************/
		Button cdl2BpelButton = new Button(groupPanel, SWT.BORDER);
		cdl2BpelButton.setText("CDL2BPEL");
		// cdl2BpelButton.setBounds(30, 500, 44, 22);
		Button cdl2WsdlButton = new Button(groupPanel, SWT.BORDER);
		cdl2WsdlButton.setText("CDL2WSDL");
		// cdl2WsdlButton.setBounds(80, 500, 44, 22);



		/********** 为按钮添加监听器 ********************************************************************/
		cdl2BpelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					caculate4Groups(cdlpack,tableViewer);
					MyTreeNode f_destinationTreeNode = 	getTreeNode(FileExplorer
							.getRoot(), f_destination);
					
					CDL2WSBPELGenerator gen = CDL2WSBPELGeneratorFactory
							.createGenerator(roles, f_destination);
					
					String generateResult = gen.getDirOfCDLGenerateResult(f_destination, cdlpack);
					File dir = new File(generateResult);
					MyTreeNode dirTreeNode = getTreeNode(FileExplorer
							.getRoot(),generateResult);
					
					if (dirTreeNode!=null) {
						
						if(dir.exists())dir.delete();
						gen.generateBPEL2DestinationFile(cdlpack);

						f_destinationTreeNode.getChildren().remove(dirTreeNode);
						FileExplorer.getViewer().remove(dirTreeNode);
						MyTreeNode newDirTreeNode = new MyTreeNode(dir);
						recusiveDir(newDirTreeNode, dir);
						newDirTreeNode.setParent(f_destinationTreeNode);
						f_destinationTreeNode.getChildren().add(newDirTreeNode);
						FileExplorer.getViewer().add(newDirTreeNode.getParent(),
								newDirTreeNode);
					} else {
						gen.generateBPEL2DestinationFile(cdlpack);
						
						dirTreeNode = new MyTreeNode(dir);
						recusiveDir(dirTreeNode, dir);
						dirTreeNode.setParent(f_destinationTreeNode);
						f_destinationTreeNode.getChildren().add(dirTreeNode);
						FileExplorer.getViewer().add(dirTreeNode.getParent(),
								dirTreeNode);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		cdl2WsdlButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				try {
					caculate4Groups(cdlpack,tableViewer);
					MyTreeNode f_destinationTreeNode = 	getTreeNode(FileExplorer
							.getRoot(), f_destination);
					CDL2WSDLGenerator generator = CDL2WSDLGeneratorFactory
					.createGenerator(cdlpack, f_destination, roles);
					String generateResult = generator.getDirOfCDLGenerateResult(f_destination, cdlpack);
					File dir = new File(generateResult);
					MyTreeNode dirTreeNode = getTreeNode(FileExplorer
							.getRoot(),generateResult);
					
					if (dirTreeNode!=null) {
						
						if(dir.exists())dir.delete();
						
						generator.generateWSDL2DestinationFile();
						
						f_destinationTreeNode.getChildren().remove(dirTreeNode);
						FileExplorer.getViewer().remove(dirTreeNode);
						MyTreeNode newDirTreeNode = new MyTreeNode(dir);
						recusiveDir(newDirTreeNode, dir);
						newDirTreeNode.setParent(f_destinationTreeNode);
						f_destinationTreeNode.getChildren().add(newDirTreeNode);
						FileExplorer.getViewer().add(newDirTreeNode.getParent(),
								newDirTreeNode);
					} else {
						generator.generateWSDL2DestinationFile();
						
						dirTreeNode = new MyTreeNode(dir);
						recusiveDir(dirTreeNode, dir);
						dirTreeNode.setParent(f_destinationTreeNode);
						f_destinationTreeNode.getChildren().add(dirTreeNode);
						FileExplorer.getViewer().add(dirTreeNode.getParent(),
								dirTreeNode);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		return parent;
	}

	public MyTreeNode getTreeNode(MyTreeNode root,String dest) {
		Queue not_yet_explorer = new LinkedList();
		not_yet_explorer.add(root);
		
		while(!not_yet_explorer.isEmpty()) {
			MyTreeNode node = (MyTreeNode)not_yet_explorer.peek();
			not_yet_explorer.remove();
			
			if(((File)node.getValue()).getAbsolutePath().equals(dest)) {
				return node;
			}
			for(Iterator it = node.getChildren().iterator();it.hasNext();) {
				MyTreeNode child = (MyTreeNode)it.next();
				if(!((File)child.getValue()).getAbsolutePath().equals(dest)) {
					not_yet_explorer.add(child);
				} else {
					return child;
				}
			}
		}
		
		return null;
		
	}
	
	public void recusiveDir(MyTreeNode parent, File dir) {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			if (files == null) {
				return;
			} else {
				for (int i = 0; i < files.length; ++i) {
					MyTreeNode newnode = new MyTreeNode(files[i]);
					{
						parent.getChildren().add(newnode);
						recusiveDir(newnode, files[i]);
					}
				}
			}
		} else {
		}
	}

	protected Composite createThresholdContent(Composite parent, String title) {

		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 6;
		composite.setLayout(gridLayout);
		final Text thresholdText = new Text(composite, 1);
		Label lblThreshold = new Label(composite, SWT.NONE);

		Scale scale = new Scale(composite, SWT.BORDER);
		try {
			scale.setSelection(100);// 默认是100,100对应的阈值是1
			scale.setIncrement(10);// 10对应的增量是0.1
			scale.setMaximum(100);
			scale.setMinimum(0);
			thresholdText.setText(threadHoldString + String.valueOf(1.0f));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		scale.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Scale scale = (Scale) e.widget;
				thresholdText.setText(threadHoldString
						+ String.valueOf((float) (scale.getSelection() - scale
								.getMinimum()) / 100.0));
				threadHoldValue = (float) ((float) (scale.getSelection() - scale
						.getMinimum()) / 100.0);
			}
		});

		final GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 2, 1);

		// thresholdText = toolkit.createText(composite, "tiptext",SWT.BORDER);
		thresholdText.setEditable(false);
		thresholdText.setLayoutData(gridData);

		Button btRefreshThreshold = new Button(composite, SWT.PUSH);
		btRefreshThreshold.setText("刷新");

		btRefreshThreshold.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				try {
					((List) tableViewer.getInput()).clear();
					rra.setThreshold(Float.valueOf(threadHoldValue));
					rra.caculate(rra.getFilepath());
					tableViewer.setInput(rra.getGroups());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		return composite;
	}
}
