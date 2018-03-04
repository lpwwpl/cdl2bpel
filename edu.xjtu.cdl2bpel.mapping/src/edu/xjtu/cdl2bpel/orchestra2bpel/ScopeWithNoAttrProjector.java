package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr;

public class ScopeWithNoAttrProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		ScopeWithNoAttr scopeWithNoAttr=(ScopeWithNoAttr)bpelElement;
		Element returnElement=context.getCurrentElement();
		Element scopeElement=context.createElement("scope");
		context.getCurrentElement().appendChild(scopeElement);
		context.getScopeRegistry().registerScope(scopeWithNoAttr.getName(),
				scopeElement);
		returnElement=scopeElement;
		return returnElement;
	}
}
