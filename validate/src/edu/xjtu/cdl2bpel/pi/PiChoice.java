package edu.xjtu.cdl2bpel.pi;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiChoice extends PiElementImpl{

	public PiChoice(String name) {
		super(name);
	}

	public String toString() {
		String str = "(";
		for(PiElement child:this.getChildren()) {
			str=str+child.toString()+"+";
		}
		str=str.substring(0,str.length()-1);
		str=str+")";
		return str;
	}
}
