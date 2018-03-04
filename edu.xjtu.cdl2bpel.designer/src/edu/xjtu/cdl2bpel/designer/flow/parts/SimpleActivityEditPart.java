

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPolicy;

import edu.xjtu.cdl2bpel.designer.flow.figures.SimpleActivityFigure;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowComponentEditPolicy;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class SimpleActivityEditPart extends BaseTypeEditPart {

	public SimpleActivityEditPart(Object object) {
		super(object);
	}
	
	

	protected IFigure createFigure() {
		Label l = new SimpleActivityFigure();
		l.setLabelAlignment(PositionConstants.LEFT);
		l.setIcon(ViewSupport.getImage(getModel()));

		return l;
	}
	
	

	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new FlowComponentEditPolicy(null));
		
		
		
		
	}
	
	int getAnchorOffset() {
		return 9;
	}

	


	public int getXOffset() {
		
		return(9);
	}
	
	

	protected void refreshVisuals() {
		((Label)getFigure()).setText(ViewSupport.getName(getModel()));
		
		((Label)getFigure()).setIcon(ViewSupport.getImage(getModel()));
		
		super.refreshVisuals();
	}
}

