package edu.xjtu.cdl2bpel.designer.model;

import java.util.List;

public interface Container {

	public List getChildren();

	public List getChildList(Class childClass);

}
