



package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.designer.model.VariableContainer;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;


public class FlowEditPartsFactory implements EditPartFactory {

	public FlowEditPartsFactory(FlowSelector selector) {
		m_selector = selector;
	}
	
	

	public EditPart createEditPart(EditPart context, Object model) {
		EditPart ret=null;
		System.out.println(model);
		if (model instanceof Package
				) {
			ret = new TopFlowEditPart(model,
					m_selector);
		
		} else if (model instanceof Choreography 
				) {
			ret = new FlowEditPart(model,
					m_selector);
			
		} else if (model instanceof ExceptionWorkUnit ||
				model instanceof ExceptionBlock) {
			ret = new ExceptionHandlerEditPart(model,
					m_selector);
			
		} else if (model instanceof FinalizerBlock 
				) {
			ret = new FinalizerHandlerEditPart(model,
					m_selector);
			
		}  else if (model instanceof VariableContainer) {
			ret = new VariableDeclarationsEditPart((VariableContainer)model);
		}
		else if (ModelSupport.isGroupingConstruct(model)) {
			
			if (ModelSupport.isAlternateSequenceConstruct(model)) {
				ret = new AlternateSequentialGroupEditPart(model, null);
				
			} else if (ModelSupport.isSequentialGroupingConstruct(model)) {
				ret = new SequentialGroupEditPart(model, null);
				
			} else {
				ret = new MultiFlowGroupEditPart(model);
				
			}
			
		

			
		} else if (ModelSupport.isCompositeComponent(model)) {
			ret = new SimpleGroupEditPart(model);
			
		} 
		else {
			ret = new SimpleActivityEditPart(model);
		}
		
		return(ret);
	}
	
	private FlowSelector m_selector=null;
}

