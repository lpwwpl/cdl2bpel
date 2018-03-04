

package edu.xjtu.cdl2bpel.designer.flow.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;

import edu.xjtu.cdl2bpel.designer.flow.figures.GroupFigure;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowComponentEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowContainerXYLayoutEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.StructuredGroupEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.StructuredGroupHighlightEditPolicy;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public abstract class StructuredGroupEditPart extends BaseTypeEditPart {

	public StructuredGroupEditPart(Object component,
			FlowSelector selector) {
		super(component);
		
		m_flowSelector = selector;
	}
	
	

	protected void createEditPolicies() {
		
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
						new FlowComponentEditPolicy(m_flowSelector));
		installEditPolicy(
			EditPolicy.SELECTION_FEEDBACK_ROLE,
			new StructuredGroupHighlightEditPolicy());
	
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new StructuredGroupEditPolicy());
		
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new FlowContainerXYLayoutEditPolicy());
		
	}

	private boolean directEditHitTest(Point requestLoc) {
		IFigure header = ((GroupFigure)getFigure()).getHeader();
		header.translateToRelative(requestLoc);
		if (header.containsPoint(requestLoc))
			return true;
		return false;
	}

	

	public void performRequest(Request request) {
		if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			if (request instanceof DirectEditRequest
				&& !directEditHitTest(((DirectEditRequest) request)
					.getLocation()
					.getCopy()))
				return;
			performDirectEdit();
		}
	}
	
	int getAnchorOffset() {
		return -1;
	}

	public IFigure getContentPane() {
		if (getFigure() instanceof GroupFigure)
			return ((GroupFigure)getFigure()).getContents();
		return getFigure();
	}

	protected List getModelChildren() {
		return(ViewSupport.getFlowChildren(getModel()));
	}

	

	protected void performDirectEdit() {
		

	}
	
    

	protected void refreshVisuals() {
		((Label)((GroupFigure)getFigure()).getHeader()).setText(ViewSupport.getName(getModel()));
		((Label)((GroupFigure)getFigure()).getFooter())
			.setText("/" + ViewSupport.getName(getModel())); 

		super.refreshVisuals();
	}

    public int getHeight() {
    	int ret=ViewSupport.getFlowCalculatedHeight(getModel());
    	
    	return(ret);
    }
    
    public int getWidth() {
    	int ret=ViewSupport.getFlowCalculatedWidth(getModel());
    	
    	return(ret);
    }
    
    private FlowSelector m_flowSelector=null;
}

