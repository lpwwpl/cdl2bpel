package edu.xjtu.cdl2bpel.pi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import edu.xjtu.cdl2bpel.pi.impl.PiElementImpl;

public class PiAgent extends PiElementImpl{
	public ArrayList freeName = new ArrayList();
	private Vector<PiElement> stack = new java.util.Vector<PiElement>();
	public Vector<PiElement> getStack() {
		return stack;
	}

	public void setStack(Vector<PiElement> stack) {
		this.stack = stack;
	}

	// 限制名
	public ArrayList boundName = new ArrayList();

	// 动作
	String action = "";

	// agent的名称
	String selfAgentName = "";

	// 经过一系列动作后到达的agent
	String toAgentName = "";

	public PiAgent(String name) {
		super(name);
		selfAgentName = name;
	}

	public void setFreeName(String freeName) {
		StringTokenizer stringTokenizer = new StringTokenizer(freeName, "&");
		int tokenCount = stringTokenizer.countTokens();
		for (int i = 0; i < tokenCount; i++) {
			String name = stringTokenizer.nextToken();
			if (!name.equals("") && !this.freeName.contains((String) name))
				this.freeName.add(name);
		}
	}

	public void appendFreeName(String elem) {
		freeName.add(elem);
	} 
	
	public void setFreeName(Set<String> list) {
		for(String str:list) {
			System.out.println(str);
			if (!str.equals("")
					&& !this.freeName.contains((String) str))
				this.freeName.add(str);
		}
	}

	public void setBoundName(String boundName) {
		StringTokenizer stringTokenizer = new StringTokenizer(boundName, "&");
		int tokenCount = stringTokenizer.countTokens();
		for (int i = 0; i < tokenCount; i++) {
			String name = stringTokenizer.nextToken();
			if (!name.equals("") && !this.freeName.contains((String) name))
				this.boundName.add(name);
		}
	}

	public void setBoundName(ArrayList list) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			String tempStr = (String) list.get(i);
			if (!tempStr.equals("")
					&& !this.freeName.contains((String) tempStr))
				this.boundName.add(tempStr);
		}

	}

	public void appendAction(String action) {
		this.action += action;
	}

	public void setSelfAgentName(String selfAgentName) {
		if (!selfAgentName.equals(""))
			this.selfAgentName = selfAgentName;
	}

	public void setToAgentName(String toAgentName) {
		if (!toAgentName.equals(""))
			this.toAgentName = toAgentName;
	}

	public String getFreeName() {
		String freeNameStr = "";
		String tempStr = "";
		int size = this.freeName.size();
		for (int i = 0; i < size; i++) {
			tempStr = (String) this.freeName.get(i);
			if (!tempStr.equals("")) {
				if (i != size - 1)
					freeNameStr += tempStr + ",";
				else
					freeNameStr += tempStr;
			}
		}
		return freeNameStr;
	}

	public String getBoundName() {
		String boundNameStr = "";
		int size = this.boundName.size();
		for (int i = 0; i < size; i++) {
			String tempStr = (String) this.boundName.get(i);
			if (!tempStr.equals("")) {
				if (i != size - 1)
					boundNameStr += tempStr + ",";
				else
					boundNameStr += tempStr;
			}
		}
		return boundNameStr;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public String getSelfAgentName() {
		return this.selfAgentName;
	}

	public String getToAgentName() {
		return this.toAgentName;
	}

	public String toString() {
		String express = "";
		express = "agent " + selfAgentName+ "(" + this.getFreeName() + ") " + "= " 
		 + this.getAction();
		return express;
	}
}
