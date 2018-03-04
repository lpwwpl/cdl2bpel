

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.IFigure;

import edu.xjtu.cdl2bpel.designer.flow.figures.SequentialGroupFigure;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class SequentialGroupEditPart extends StructuredGroupEditPart {

	

	public SequentialGroupEditPart(Object component,
			FlowSelector selector) {
		super(component, selector);
	}
		
    public int getChildX(BaseTypeEditPart child) {
    	return(50);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=0; 
    	
    	ret = ViewSupport.getFlowChildYPosition(getModel(),
    				child.getModel());
    	
    	return(ret);
    }
    
	

	protected IFigure createFigure() {
		IFigure f=new SequentialGroupFigure(
				ViewSupport.getImage(getModel()));
		
		f.setLayoutManager(new StructuredGroupLayoutManager(this));
		
		return(f);
	}

	

	


	

	int getAnchorOffset() {
		return 15;
	}
}

