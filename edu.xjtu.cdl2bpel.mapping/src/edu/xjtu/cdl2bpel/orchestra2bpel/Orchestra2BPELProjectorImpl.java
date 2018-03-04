package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;

public class Orchestra2BPELProjectorImpl implements Orchestra2BPELProjector {

	public Element transformOrchestra2BPEL(Orchestra2BPELContext bpelContext,
			BPElement bpelElement) {
		// 添加将bpelElement转化为bpel的方法
		// Orchestra2BPELProjector
		// orchestra2BPELProjector=Orchestra2BPELProxy.getProjectorByOrchestraName(bpelElement.getName());//根据中间标签的名字得到相应的projector
		return transform(bpelContext, bpelElement);
	}

	// 该方法通过多态来实现
	public Element transform(Orchestra2BPELContext bpelContext,
			BPElement bpelElement) {
		System.out.println("这是Orchestra2BPELProjectorImpl");
		return bpelContext.createElement("");
	}

}
