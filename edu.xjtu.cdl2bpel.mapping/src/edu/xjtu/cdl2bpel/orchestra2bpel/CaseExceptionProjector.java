package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.CaseException;

public class CaseExceptionProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		CaseException caseException=(CaseException)bpelElement;
		Element throwElement=context.createElement("throw");
		throwElement.setAttribute("faultName", context.getType(caseException.getFullyQualifiedExceptionType()));
		//System.out.println("throwµÄÊÇ"+caseException.getFullyQualifiedExceptionType());
		context.getCurrentElement().appendChild(throwElement);
		return throwElement;
	}
}
