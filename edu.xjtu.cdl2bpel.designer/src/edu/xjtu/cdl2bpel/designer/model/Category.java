package edu.xjtu.cdl2bpel.designer.model;

import java.util.List;

public class Category implements Container {

	public Category(String name, java.util.List list, Class catClass) {
		this.name = name;
		this.list = list;
		this.categoryClass = catClass;
	}

	public String getName() {
		return (name);
	}

	public boolean isCategoryFor(Object obj) {
		boolean ret = false;

		if (categoryClass.isAssignableFrom(obj.getClass())) {
			ret = true;
		}

		return (ret);
	}

	public List getChildren() {
		return (list);
	}

	public List getChildList(Class childClass) {
		List ret = null;

		if (categoryClass.isAssignableFrom(childClass)) {
			ret = list;
		}

		return (ret);
	}

	private String name = null;
	private java.util.List list = null;
	private Class categoryClass = null;
}
