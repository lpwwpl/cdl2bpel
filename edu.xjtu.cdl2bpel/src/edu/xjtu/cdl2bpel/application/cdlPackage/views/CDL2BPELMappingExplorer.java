package edu.xjtu.cdl2bpel.application.cdlPackage.views;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;

public class CDL2BPELMappingExplorer extends ViewPart {	
	private static CDL2BPELMappingExplorer instance;
	private TableViewer viewer;
	private Action doubleClickAction;
	private ArrayList fileList;
	
	public CDL2BPELMappingExplorer() {
		super();
		instance=this;
		fileList = new ArrayList();
	}
	
	public static CDL2BPELMappingExplorer getInstance(){
		return instance;
	}
	
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setLabelProvider(new ViewLabelProvider());
		makeActions();
		hookDoubleClickAction();
		
	}

	private void makeActions() {
		// TODO Auto-generated method stub
		doubleClickAction = new Action() {
			public void run() {
				//PlatformUI.getWorkbench().getp
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				//showMessage("Double-click detected on "+obj.toString());
				IWorkbenchPage page= PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IPath location= new Path(obj.toString());
				
				File file = (File)(((MyTreeNode)obj).getValue());

				MyFileEditorInput inputForm= new MyFileEditorInput(file);
				try {						
					//Ouvrir le Form editor			
					page.openEditor(inputForm, "com.teamsoftsuite.owlve.ui.multipage");
					//ouvrir le XML editor					
					//page.openEditor(inputForm.getInputFile(), "com.teamsoftsuite.owlve.editors.xml.XMLEditor");
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		};
		
	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	public void addFile(String sPath){		
		if((sPath!=null)&&(fileList.indexOf(sPath)==-1)){
			viewer.add(sPath);
			fileList.add(sPath);
		}
			
				
	}
	
	
	//CLASSES INNERS
	class NameSorter extends ViewerSorter {
	}	
	
	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			//return PlatformUI.getWorkbench().
				//	getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
//			return Activator.getDefault().getImage(Activator.IMG_Onto);
			return null;
		}
	}
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		public Object[] getElements(Object parent) {
			return new String[] { "One", "Two", "Three" };
		}
	}
	/**
	 * @return Returns the fileList.
	 */
	public ArrayList getFileList() {
		return fileList;
	}

	/**
	 * @param fileList The fileList to set.
	 */
	public void setFileList(ArrayList fileList) {
		this.fileList = fileList;
	}
}