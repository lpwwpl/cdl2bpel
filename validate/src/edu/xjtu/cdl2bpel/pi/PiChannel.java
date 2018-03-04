package edu.xjtu.cdl2bpel.pi;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiChannel extends PiElementImpl{

	public PiChannel(String name) {
		super(name);
	}

	public String toString() {
		return getName();
	}
}
