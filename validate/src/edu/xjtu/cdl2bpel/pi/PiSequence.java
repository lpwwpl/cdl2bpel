package edu.xjtu.cdl2bpel.pi;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiSequence extends PiElementImpl{
//	private List<PiElement> children;
//	public List<PiElement> getChildren() {
//		return children;
//	}
//
//	public void setChildren(List<PiElement> children) {
//		this.children = children;
//	}
	public PiSequence(String name) {
		super(name);
//		children = new ArrayList<PiElement>();
	}
	
	public String toString() {
		String str = "";
		for(PiElement child:this.getChildren()) {
			if(child instanceof PiNoAction) {
				
			} else {
				str=str+child.toString()+".";
			}
		}
		str=str.substring(0,str.length()-1);
		return str;
	}
}
