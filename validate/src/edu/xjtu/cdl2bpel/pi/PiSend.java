package edu.xjtu.cdl2bpel.pi;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiSend extends PiElementImpl{
	private PiMeg meg;
	public PiMeg getMeg() {
		return meg;
	}

	public void setMeg(PiMeg meg) {
		this.meg = meg;
	}

	public PiChannel getChannel() {
		return channel;
	}

	public void setChannel(PiChannel channel) {
		this.channel = channel;
	}

	private PiChannel channel;
	public PiSend(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "\'"+getChannel()+"<"+getMeg()+">";
	}
}
