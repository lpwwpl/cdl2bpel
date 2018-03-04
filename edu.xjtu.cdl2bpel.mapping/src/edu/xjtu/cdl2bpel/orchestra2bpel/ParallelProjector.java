package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
//import edu.xjtu.cdl2bpel.orchestra.Parallel;

public class ParallelProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		//Parallel parallel=(Parallel)bpelElement;
		Element flowElement=context.createElement("flow");
		context.getCurrentElement().appendChild(flowElement);
		return flowElement;
	}
}
