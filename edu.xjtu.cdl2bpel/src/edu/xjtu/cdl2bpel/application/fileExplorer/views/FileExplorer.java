package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import edu.xjtu.cdl2bpel.application.fileExplorer.actions.DeleteMyTreeNodeAction;
import edu.xjtu.cdl2bpel.application.fileExplorer.actions.DeployOfViewAction;
import edu.xjtu.cdl2bpel.application.fileExplorer.actions.GenerateBPELAndWSDLViewAction;
import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;

public class FileExplorer extends ViewPart implements IAdaptable,ISelectionListener {
	private static FileExplorer instance;
	private static TreeViewer viewer;
	public static TreeViewer getViewer() {
		return viewer;
	}

	private Action doubleClickAction;
	private DeleteMyTreeNodeAction deleteAction;
	private GenerateBPELAndWSDLViewAction generateAction;
	private DeployOfViewAction deployAction;
	private static MyTreeNode root = null;
	private String rootPath = null;
	private static MyTreeNode selectMyTreeNode = null;
	
	public static MyTreeNode getSelectMyTreeNode() {
		if(selectMyTreeNode == null) {
			selectMyTreeNode = root;
		}
		return selectMyTreeNode;
	}

	public static void setSelectMyTreeNode(MyTreeNode selectMyTreeNode) {
		FileExplorer.selectMyTreeNode = selectMyTreeNode;
	}

	public static MyTreeNode getRoot() {
		return root;
	}

	public FileExplorer() {
		super();
		instance = this;
		rootPath = Platform.getInstallLocation().getURL().getPath()+"/myFolder";
		if (root == null)
			root = new MyTreeNode(new File(rootPath));
		selectMyTreeNode = root;
	}

	public FileExplorer(String rootPath) {
		super();
		instance = this;
		this.rootPath = rootPath;
		if (root == null)
			root = new MyTreeNode(new File(rootPath));
		selectMyTreeNode = root;
	}

	public static FileExplorer getInstance() {
		return instance;
	}

	public void buildFileExplorerTree(File file, MyTreeNode node) throws Exception {

		if (file == null) {
			file = new File(Platform.getInstallLocation().getURL().getPath()+"/myFolder");
			if(!file.exists()) {
				file.mkdir();
			}
		}
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files == null) {
				return;
			} else {
				for (int i = 0; i < files.length; ++i) {
					MyTreeNode newnode = new MyTreeNode(files[i]);
					node.add(newnode);
					buildFileExplorerTree(files[i], newnode);
				}
			}
		} 
	}

	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		try {
			buildFileExplorerTree(null, root);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		viewer.setContentProvider(new FileExplorerContentProvider());
		viewer.setLabelProvider(new FileExplorerLabelProvider());
//		MyTreeNode realRoot = new MyTreeNode((File)root.getValue());
//		realRoot.add(root);
		viewer.add(root, root.getChildren());
		viewer.setInput(root);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selectMyTreeNode = (MyTreeNode)((TreeSelection)event.getSelection()).getFirstElement();
			}
		});
		
		createContextMenu(parent);
		makeActions();
		hookDoubleClickAction();
		hookKeybordActions();
	}

	private void makeActions() {
		deleteAction = new DeleteMyTreeNodeAction(this, "É¾³ý");
		deployAction = new DeployOfViewAction(this,"Deploy");
		generateAction = new GenerateBPELAndWSDLViewAction(this,"GenerateByDefault");
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				MyTreeNode node = (MyTreeNode)obj;
				
				File file = (File)(node.getValue());
				MyFileEditorInput input= new MyFileEditorInput(file);
				MyEditorInput inputForm = new MyEditorInput(input);
				try {
					if (((MyFileEditorInput) inputForm.getInputFile())
							.getPath().toString().endsWith(".cdl")) {
						page.openEditor(inputForm,
								"edu.xjtu.cdl2bpel.designer.CDLViewer");
					} else if (((MyFileEditorInput) inputForm.getInputFile())
							.getPath().toString().endsWith(".bpel")
							|| ((MyFileEditorInput) inputForm.getInputFile())
									.getPath().toString().endsWith(".wsdl")) {
						
						page.openEditor(inputForm,
								"edu.xjtu.cdl2bpel.editors.xml");
					} else if(((MyFileEditorInput)inputForm.getInputFile()).getPath().toFile().isFile()) {
						page.openEditor(inputForm,
								"edu.xjtu.cdl2bpel.editors.simpleEditor");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

	}

	public void setFocus() {

	}

	private void hookKeybordActions() {
		viewer.getControl().addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent event) {
				handleKeyReleased(event);
			}
		});
	}
	
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	protected void handleKeyReleased(KeyEvent event) {
		if (event.character == SWT.DEL && event.stateMask == 0) {
			deleteAction.run();
		}
	}
	
	class FileExplorerNameSorter extends ViewerSorter {

	}

	public MyTreeNode[] getSelectedMyTreeNode() {
		IStructuredSelection selection = (IStructuredSelection) viewer
				.getSelection();
		MyTreeNode[] items = new MyTreeNode[selection.size()];
		Iterator iter = selection.iterator();
		int index = 0;
		while (iter.hasNext())
			items[index++] = (MyTreeNode) iter.next();
		return items;
	}
	
	public String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		String result = fileName.substring(pos);
		return result;
	}
	
	private void createContextMenu(Composite parent) {

		MenuManager mgr = new MenuManager();
		mgr.setRemoveAllWhenShown(true);
		mgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				
				fillContextMenu(manager);
			}
		});
		Menu menu = mgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(mgr, viewer);
	}
	
	protected void fillContextMenu(IMenuManager manager) {
		manager.add(generateAction);
		manager.add(deployAction);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		
	}
	
	public static boolean existInRoot(MyTreeNode node) {
		if(root.equals(node)) {
			return true;
		} else {
			for(Iterator it = root.getChildren().iterator();it.hasNext();) {
				MyTreeNode theRoot = (MyTreeNode)it.next();
				if(theRoot.equals(node)) {
					return true;
				} else {
					return existInRoot(theRoot);
				}
			}
		}
		return false;
	}
}
