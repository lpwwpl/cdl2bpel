package edu.xjtu.cdl2bpel.pi;

import java.util.List;

public interface PiElement {
	String getDescription();

	void setDescription(String value);

	String getName();

	void setName(String value);
	
	public List<PiElement> getChildren();
	
	public String toString();
	
	public PiElement getParent();
}
