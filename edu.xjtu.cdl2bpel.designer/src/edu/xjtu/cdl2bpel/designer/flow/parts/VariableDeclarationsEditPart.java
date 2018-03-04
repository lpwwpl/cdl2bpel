package edu.xjtu.cdl2bpel.designer.flow.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.DirectEditRequest;

import edu.xjtu.cdl2bpel.designer.flow.figures.GroupFigure;
import edu.xjtu.cdl2bpel.designer.flow.figures.VariableDeclarationsFigure;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowComponentEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.FlowContainerXYLayoutEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.StructuredGroupEditPolicy;
import edu.xjtu.cdl2bpel.designer.flow.policies.StructuredGroupHighlightEditPolicy;
import edu.xjtu.cdl2bpel.designer.model.VariableContainer;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;

/**
 * This class represents a sequentially order grouping construct's
 * edit part.
 */
public class VariableDeclarationsEditPart extends BaseTypeEditPart {

	/**
	 * This is the constructor.
	 * 
	 * @param cdlType
	 */
	public VariableDeclarationsEditPart(VariableContainer vars) {
		super(null);
		
		setModel(vars);
	}
		
    /**
     * Returns the model as CDL type.
     * @return
     */
/*	
    public Object getCDLType() {
    	return(getVariableDeclarations().getChoreography());
    }
  */  
    public int getChildX(BaseTypeEditPart child) {
    	int ret=0;
    	
    	return(ret);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=ViewSupport.INITIAL_YPADDING;
    	
    	if (getModel() instanceof VariableContainer &&
    			((VariableContainer)getModel()).getFlow() 
    			instanceof BPOrchestra) {
    		ret = ViewSupport.getFlowChildYPosition(getModel(),
    					child.getModel(), 10);
    	} else {
    		int index=getModelChildren().indexOf(child.getModel());
    		if (index != -1) {
    			ret += index*ViewSupport.BASE_ACTIVITY_HEIGHT;
    		}
    	}
    	
    	return(ret);
    }
    
	/**
	 * @see org.eclipse.gef.examples.flow.parts.StructuredActivityPart#createFigure()
	 */
	protected IFigure createFigure() {
		IFigure f=new VariableDeclarationsFigure();
		
		return(f);
	}

	/**
	 * @see org.eclipse.gef.examples.flow.parts.StructuredActivityPart#getAnchorOffset()
	 */
	int getAnchorOffset() {
		return 15;
	}

	/**
	 * @see org.eclipse.gef.examples.flow.parts.ActivityPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		//installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ActivityNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new FlowComponentEditPolicy(null));
		installEditPolicy(
			EditPolicy.SELECTION_FEEDBACK_ROLE,
			new StructuredGroupHighlightEditPolicy());
	
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new StructuredGroupEditPolicy());
		//installEditPolicy(EditPolicy.LAYOUT_ROLE, new CDLFlowLayoutEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new FlowContainerXYLayoutEditPolicy());
		//installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new StructuredActivityDirectEditPolicy());
	}

	private boolean directEditHitTest(Point requestLoc) {
		IFigure header = ((GroupFigure)getFigure()).getHeader();
		header.translateToRelative(requestLoc);
		if (header.containsPoint(requestLoc))
			return true;
		return false;
	}

	/**
	 * @see org.eclipse.gef.EditPart#performRequest(org.eclipse.gef.Request)
	 */
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
	
	public IFigure getContentPane() {
		if (getFigure() instanceof VariableDeclarationsFigure)
			return ((VariableDeclarationsFigure)getFigure()).getContents();
		return getFigure();
	}
	
	public VariableContainer getVariableDeclarations() {
		return((VariableContainer)getModel());
	}

	protected List getModelChildren() {
		return(getVariableDeclarations().getVariables());
	}

	/**
	 * @see org.eclipse.gef.examples.flow.parts.ActivityPart#performDirectEdit()
	 */
	protected void performDirectEdit() {
	}
	
    /**
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	protected void refreshVisuals() {
		
		getFigure().setBounds(getBounds());
		
//		ViewSupport.setTooltip(getFigure(), getModel());
		
		super.refreshVisuals();
	}

    public int getHeight() {
    	int ret=ViewSupport.INITIAL_YPADDING+
						ViewSupport.YPADDING/2;
    	
    	if (getModel() instanceof VariableContainer &&
    			((VariableContainer)getModel()).getFlow() 
    			instanceof BPOrchestra) {
    		ret += ViewSupport.getFlowCalculatedHeight(getModel(), 10);
    	} else {  	
    		ret += getModelChildren().size() *
    				ViewSupport.BASE_ACTIVITY_HEIGHT;
    	}
    	
    	if (ret < 100) {
    		ret = 100;
    	}
    	
    	return(ret);
    }
    
    public int getWidth() {
    	int ret=ViewSupport.BASE_ACTIVITY_WIDTH*3;
    	
    	// TODO: Could possibly do dynamic resizing of the
    	// choreography state box based on the size of the
    	// children - but will need to register this edit
    	// part against the choreography. This could be
    	// done by getting the choreo from the VariableDeclarations
    	// object and directly registering the adapter (and
    	// unregister) when activate/deactivate - then
    	// check for notifications based on the variables
    	// - but change of name notification may not be
    	// reflected in choreo, so would need to listen to
    	// each variable???
    	
    	// Check if preferred size of contained editparts is
    	// wider
    	/*
    	java.util.Iterator iter=getChildren().iterator();
    	while (iter.hasNext()) {
    		CDLTypeEditPart ep=(CDLTypeEditPart)iter.next();
    	
    		int width=ep.getFigure().getPreferredSize().width;
    		
    		if (width > ret) {
    			ret = width;
    		}
    	}
    	*/
    	
    	return(ret);
    }
    
    /**
     * Registers this edit part as a listener for change notifications
     * to the specified workflow element.
     * 
     * @param element the workflow element that should be observed
     * for change notifications
     */
    protected void hookIntoComponent(Object element) {
    	
    	if (element instanceof VariableContainer) {
    		m_flowParent = ModelSupport.getEnclosingDescription(
    				((VariableContainer)element).getFlow());
    		
    		// Check if flow is description
    		if (m_flowParent == 
    			((VariableContainer)element).getFlow()) {
    			m_flowParent = null;
    			
    		// Not description, so need to list for changes
    		} else if (m_flowParent instanceof EObject) {
    			((EObject)m_flowParent).eAdapters().add(this);
    		}
    	}

    	super.hookIntoComponent(element);
    }

    /**
     * Removes this edit part from the specified workflow element.
     * Thus, it will no longe receive change notifications.
     * 
     * @param element the worklfow element that should not be observed
     * any more
     */
    protected void unhookFromComponent(Object element) {
     	
		if (m_flowParent instanceof EObject) {
			((EObject)m_flowParent).eAdapters().remove(this);
		}
		
    	super.unhookFromComponent(element);
    }

    /* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		int type = notification.getEventType();
		
		switch( type ) {
			case Notification.ADD:
			case Notification.ADD_MANY:				
			case Notification.REMOVE_MANY:
			case Notification.REMOVE:
				try {
					refreshChildren();
					refreshVisuals();
				} catch(Exception e) {
					// Ignore exception - not sure why
					// null pointer being thrown when
					// only remaining choreo is deleted
				}
			
				break;
			
			case Notification.SET:
				refreshVisuals();
				break;
		}
	}
	
	private Object m_flowParent=null;
}
