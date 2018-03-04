package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;

public interface Orchestra2BPELProjector {

	//Orchestra2BPELProjector getProxy();
	Element transformOrchestra2BPEL(Orchestra2BPELContext bpelContext,BPElement bpelElement);
	Element transform(Orchestra2BPELContext bpelContext,BPElement bpelElement);
	//Element endTransform(Orchestra2BPELContext bpelContext,BPElement bpelElement);
//	void transformOrchestra2BPELByRoleRelevance(BPElement bpelElement);
}
