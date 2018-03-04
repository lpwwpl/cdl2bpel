
package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TreeItem;

import edu.xjtu.cdl2bpel.designer.model.Category;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;


public class CategoryEditPart extends AbstractTreeEditPart {


    protected CategoryEditPart(Category category) {
    	super(category);
    }

    protected void createEditPolicies() {
    	super.createEditPolicies();
    	
		installEditPolicy(EditPolicy.NODE_ROLE, null);
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, null);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());    	
    }
    

    public Category getCategory() {
    	return((Category)getModel());
    }
    

    public void update() {
    	refreshChildren();
    }
    

    protected List getModelChildren() {
    	List ret=getCategory().getChildren();
    	
    	return(ret);
    }
    

    protected void refreshVisuals() {
    	super.refreshVisuals();

    	if (getWidget() instanceof TreeItem) {
    		((TreeItem)getWidget()).setBackground(ColorConstants.yellow);
    	}
    }
    

    public String getText() {
    	String ret=getCategory().getName();
    	if (ret == null) {
    		ret = "<undefined>";
    	}
    	return(ret);
    }
    
    protected Image getImage() {
    	return(ViewSupport.getImage(null));
    }
}

