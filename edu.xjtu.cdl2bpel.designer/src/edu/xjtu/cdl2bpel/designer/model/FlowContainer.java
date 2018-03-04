package edu.xjtu.cdl2bpel.designer.model;

import java.util.List;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;

public class FlowContainer implements Container {

	private Object parent = null;

	public FlowContainer(Object parent) {
		this.parent = parent;
	}

	public List getChildren() {
		return (ModelSupport.getActivities(parent, true));
	}

	public List getChildList(Class childClass) {
		List ret = null;

		if (childClass != null) {
			ret = getChildren();
		}

		return (ret);
	}
}
