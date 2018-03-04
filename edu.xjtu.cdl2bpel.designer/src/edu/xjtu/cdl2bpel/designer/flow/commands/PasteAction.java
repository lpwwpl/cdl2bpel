

package edu.xjtu.cdl2bpel.designer.flow.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;



public class PasteAction extends org.eclipse.gef.ui.actions.SelectionAction {

	

	public PasteAction(IWorkbenchPart part) {
		super(part);
	}
	
	

	protected void init() {
		setId(org.eclipse.ui.actions.ActionFactory.PASTE.getId());
		setText("Paste");
	}
	
	

	protected boolean calculateEnabled() {
		boolean ret=false;
		
		if (getSelectedObjects() != null &&
				getSelectedObjects().size() == 1 &&
				getSelectedObjects().get(0) instanceof EditPart &&
				CopyAction.getCurrentTarget() instanceof EObject) {
        	EditPart ep=(EditPart)getSelectedObjects().get(0);
        	
        	
        	
        	if (ModelSupport.isValidTarget(CopyAction.getCurrentTarget(),
        			ep.getModel())) {
        		ret = true;
        	}
		}
		
		return(ret);
	}

    

    public void run() {
    	
        if (getSelectedObjects().size() == 1 &&
        		getSelectedObjects().get(0) instanceof EditPart) {
        	EditPart ep=(EditPart)getSelectedObjects().get(0);
        	Object source=CopyAction.getCurrentTarget();
        	
        	if (source instanceof EObject) {
        		
        		source = EcoreUtil.copy((EObject)source);
        	}
        	
        	
			CreateFlowComponentCommand command=new CreateFlowComponentCommand();
			
			command.setChild(source);
			command.setParent(ep.getModel());
			
			

			
			execute(command);
         }
    }
}

