

package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.IFigure;

import edu.xjtu.cdl2bpel.designer.flow.figures.SimpleGroupFigure;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class SimpleGroupEditPart extends StructuredGroupEditPart {

	

	public SimpleGroupEditPart(Object component) {
		super(component, null);
	}
		
    public int getChildX(BaseTypeEditPart child) {
    	return(12);
    }

    public int getChildY(BaseTypeEditPart child) {
    	int ret=0; 
    	
    	ret = ViewSupport.getFlowComponentYPosition(getModel(),
    						child.getModel());
    	
    	return(ret);
    }
    
	

	protected IFigure createFigure() {
		IFigure f=new SimpleGroupFigure(
				ViewSupport.getImage(getModel()));
		
		f.setLayoutManager(new StructuredGroupLayoutManager(this));
		
		return(f);
	}

	

	int getAnchorOffset() {
		return 15;
	}
}

