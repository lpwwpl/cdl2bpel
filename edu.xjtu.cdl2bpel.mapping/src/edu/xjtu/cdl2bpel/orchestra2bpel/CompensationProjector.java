package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Compensation;

public class CompensationProjector extends Orchestra2BPELProjectorImpl {

	
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Compensation compensate=(Compensation)bpelElement;
		Element returnElement=context.getCurrentElement();
		Element compensateElement=context.createElement("compensate");
		context.getCurrentElement().appendChild(compensateElement);
		String scopeName=compensate.getCompletionHandler().getParent().getName();
		compensateElement.setAttribute("scope", scopeName);	
		return returnElement;
	}
}
