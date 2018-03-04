package edu.xjtu.cdl2bpel.pi.impl;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.pi.PiElement;

public class PiElementImpl implements PiElement{

	private String name;
	private String description;
	private List<PiElement> children; 
	private PiElement parent;
	
	public PiElementImpl(String name,PiElement parent) {
		this.name = name;
		children = new ArrayList<PiElement>();
		this.parent = parent;
	}
	
	public PiElementImpl(String name) {
		this.name = name;
		children = new ArrayList<PiElement>();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setDescription(String value) {
		// TODO Auto-generated method stub
		this.description = value;
	}

	@Override
	public void setName(String value) {
		// TODO Auto-generated method stub
		this.name = value;
	}
	
	public List<PiElement> getChildren() {
		return children;
	}

	public void setChildren(List<PiElement> children) {
		this.children = children;
	}
	
//	public String toString() {
//		return null;
//	}

	@Override
	public PiElement getParent() {
		return parent;
	}
	
	public void setParent(PiElement parent) {
		this.parent = parent;
	}
}
