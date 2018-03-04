

package edu.xjtu.cdl2bpel.designer.flow.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;

import edu.xjtu.cdl2bpel.designer.flow.figures.AlternateSequentialGroupFigure;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class AlternateSequentialGroupEditPart extends StructuredGroupEditPart {

	

	public AlternateSequentialGroupEditPart(Object component,
			FlowSelector selector) {
		super(component, selector);
	}
		
    public int getChildX(BaseTypeEditPart child) {
    	int ret=0; 
    	
    	ret = ViewSupport.getFlowChildXPosition(getModel(),
    				child.getModel());
    	
    	return(ret);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=0; 
    	
    	ret = ViewSupport.getFlowChildYPosition(getModel(),
    				child.getModel());
    	
    	return(ret);
    }
    
	protected List getModelChildren() {
		java.util.List ret=ViewSupport.getFlowChildren(getModel());
		java.util.List alternate=
			ViewSupport.getFlowAlternateChildren(getModel());
		
		if (alternate != null && alternate.size() > 0) {
			java.util.Vector combined=new java.util.Vector();
			combined.addAll(ret);
			combined.addAll(alternate);
			ret = combined;
		}
		
		return(ret);
	}

    

	protected void refreshVisuals() {
		((AlternateSequentialGroupFigure)getFigure()).setParentComponent(getModel());

		super.refreshVisuals();
	}
	
	

	protected IFigure createFigure() {
		IFigure f=new AlternateSequentialGroupFigure(
				ViewSupport.getImage(getModel()));
		
		f.setLayoutManager(new StructuredGroupLayoutManager(this));
		
		return(f);
	}

	

	int getAnchorOffset() {
		return 15;
	}
}

