

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.IFigure;

import edu.xjtu.cdl2bpel.designer.flow.figures.MultiFlowGroupFigure;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class MultiFlowGroupEditPart extends StructuredGroupEditPart {

	

	public MultiFlowGroupEditPart(Object component) {
		super(component, null);
	}
		
    public int getChildX(BaseTypeEditPart child) {
    	int ret=0; 
    	
    	ret = ViewSupport.getFlowChildXPosition(getModel(),
    				child.getModel());
    	
    	return(ret);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=50;
    	
    	
    	
    	int height=ViewSupport.getFlowCalculatedHeight(getModel());
    	int childHeight=ViewSupport.getFlowCalculatedHeight(child.getModel());
    	
    	ret = (height - childHeight) / 2;
    	
    	return(ret);
    }
    
    

	protected void refreshVisuals() {
		((MultiFlowGroupFigure)getFigure()).
				setChildren(getModelChildren());
		((MultiFlowGroupFigure)getFigure()).setParentComponent(getModel());

		super.refreshVisuals();
	}
	
	

	protected IFigure createFigure() {
		IFigure f=new MultiFlowGroupFigure(
					ViewSupport.getImage(getModel()));
		
		f.setLayoutManager(new StructuredGroupLayoutManager(this));
		
		return(f);
	}

	

	


	

	int getAnchorOffset() {
		return 15;
	}
}

