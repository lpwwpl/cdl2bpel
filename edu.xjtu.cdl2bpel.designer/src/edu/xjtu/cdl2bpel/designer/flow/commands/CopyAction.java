

package edu.xjtu.cdl2bpel.designer.flow.commands;

import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;



public class CopyAction extends org.eclipse.gef.ui.actions.SelectionAction {

	

	public CopyAction(IWorkbenchPart part) {
		super(part);
	}
	
	

	protected void init() {
		setId(org.eclipse.ui.actions.ActionFactory.COPY.getId());
		setText("Copy");
	}
	
	

	protected boolean calculateEnabled() {
		boolean ret=false;
		
		if (getSelectedObjects() != null &&
				getSelectedObjects().size() > 0) {
			ret = true;
		}
		
		return(ret);
	}

    

    public void run() {
         
        if (getSelectedObjects().size() == 1 &&
        		getSelectedObjects().get(0) instanceof EditPart) {
        	EditPart ep=(EditPart)getSelectedObjects().get(0);
        	
            m_currentTarget = ep.getModel();
        }
    }

	public static Object getCurrentTarget() {
		return(m_currentTarget);
	}
	
	private static Object m_currentTarget=null;
}

