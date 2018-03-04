package edu.xjtu.cdl2bpel.pi;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiConditional extends PiElementImpl{

	private PiMeg meg;
	private PiChannel channel;
	private String megValue="";
	
	public String getMegValue() {
		return megValue;
	}

	public void setMegValue(String megValue) {
		this.megValue = megValue;
	}

	public PiConditional(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String str = "[";
		str=str+meg.getName()+"="+megValue;
		str=str+"]";
		for(PiElement child:this.getChildren()) {
			str=str+child.toString();
		}
		if(this.getChildren().size()==1&&this.getChildren().get(0).getChildren().size()!=0) {
			str=str+".0";
		} else {
			str = str+"0";
		}
		return str;
	}
	
	public PiChannel getChannel() {
		return channel;
	}

	public void setChannel(PiChannel channel) {
		this.channel = channel;
	}

	public PiMeg getMeg() {
		return meg;
	}

	public void setMeg(PiMeg meg) {
		this.meg = meg;
	}
}
