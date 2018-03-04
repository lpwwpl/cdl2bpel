package edu.xjtu.cdl2bpel.cdl2pi.impl;

import java.util.Map;
import java.util.Stack;
import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.lpwcommon.util.ScopeRegistry;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;
import edu.xjtu.cdl2bpel.pi.PiAgent;
import edu.xjtu.cdl2bpel.pi.PiChannel;
import edu.xjtu.cdl2bpel.pi.PiChoice;
import edu.xjtu.cdl2bpel.pi.PiConditional;
import edu.xjtu.cdl2bpel.pi.PiElement;
import edu.xjtu.cdl2bpel.pi.PiNoAction;
import edu.xjtu.cdl2bpel.pi.PiParallel;
import edu.xjtu.cdl2bpel.pi.PiReceive;
import edu.xjtu.cdl2bpel.pi.PiSend;
import edu.xjtu.cdl2bpel.pi.PiSequence;

public class Orchestra2PiContext {

	private PiAgent agent = null;
	private PiElement currentElement = null;
	private PiElement variablesElement = null;
	private int m_prefixCounter = 1;
	private PiElement oldStackElement = null;// ջ����֮ǰ�ĵ�ǰջԪ��
	private Vector<PiElement> stack = new java.util.Vector<PiElement>();
	private boolean isAdditionalPopNeed = false;// �ж��ǲ�����Ҫ�������pop����������onMessage����ʱ����push��pop���Գƹ���
	
	private PiElement currentFaultHandlers;
	private Stack<PiElement> faultHandlersStack=new Stack<PiElement>();
	
	private Map namespaces = new java.util.Hashtable();
	private String defaultNamespace = null;// Ĭ�ϵ������ռ䣬����xmlns��ֵ
	private ParticipantType participantType;
	
	public void pushFaultHandlers(PiElement faultHandlers){
		faultHandlersStack.push(faultHandlers);
	}
	public PiElement popFaultHandler(){
		PiElement returnElement=null;
		if(faultHandlersStack.size()>0){
			returnElement=faultHandlersStack.pop();
		}
		return returnElement;
	}
	public PiElement getCurrentFaultHandler(){
		PiElement returnElement = faultHandlersStack.peek();
		return returnElement;
	}
	public Orchestra2PiContext(ParticipantType participantType,PiAgent agent) {
		this.participantType = participantType;
		this.agent = agent;
	}
	
	public void setAdditionalPopNeed(boolean isAdditionalPopNeed) {
		this.isAdditionalPopNeed = isAdditionalPopNeed;
	}

	public PiElement getVariablesElement() {
		return variablesElement;
	}

	public void setVariablesElement(PiElement variablesElement) {
		this.variablesElement = variablesElement;
	}

	public PiElement getCurrentElement() {
		return currentElement;
	}

	public void setCurrentElement(PiElement currentElement) {
		this.currentElement = currentElement;
	}

	public Vector<PiElement> getStack() {
		return stack;
	}

	public void setStack(Vector<PiElement> stack) {
		this.stack = stack;
	}

	public Map getNamespaces() {
		return namespaces;
	}

	public void setNamespaces(Map namespaces) {
		this.namespaces = namespaces;
	}

	public void push(PiElement newCurrentElement) {
		oldStackElement = currentElement;
		if (currentElement != null) {
			stack.add(0, currentElement);
		}

		currentElement = newCurrentElement;
	}

	public PiElement getOldStackElement() {
		return oldStackElement;
	}

	public void setOldStackElement(PiElement oldStackElement) {
		this.oldStackElement = oldStackElement;
	}

	public void pop() {
		oldStackElement = currentElement;
		if (stack.size() > 0) {
			currentElement = stack.remove(0);
		} else {
			currentElement = null;
		}
	}

	public PiElement createElement(String name) {
		PiElement piElement = null;
		if(name.equals("sequence")) {
			piElement = new PiSequence(name);
		} else if(name.equals("choice")) {
			piElement = new PiChoice(name);
		}else if(name.equals("parallel")) {
			piElement = new PiParallel(name);
		}else if(name.equals("channel")) {
			piElement = new PiChannel(name);
		}else if(name.equals("send")) {
			piElement = new PiSend(name);
		}else if(name.equals("receive")) {
			piElement = new PiReceive(name);
		}else if(name.equals("case")) {
			piElement = new PiConditional(name);
		}else if(name.equals("noAction")) {
			piElement = new PiNoAction(name);
		}
		
		return piElement;
	}

	public String getDefaultNamespace() {
		return defaultNamespace;
	}

	public void setDefaultNamespace(String defaultNamespace) {
		this.defaultNamespace = defaultNamespace;
	}

	public String getType(String behaviorType) {
		String ret = null;
		String namespace = NameSpaceUtil.getNamespace(behaviorType);
		String localpart = NameSpaceUtil.getLocalPart(behaviorType);
		if (namespace != null) {
			String prefix = (String) namespaces.get(namespace);
			ret = prefix + ":" + localpart;
		} else {
			ret = localpart;
		}

		return (ret);
	}

	/** 
	 * �ж��ǲ�����Ҫ�������pop����������onMessage����ʱ����push��pop���Գƹ���
	 * 
	 * @return 
	 */	 
	public boolean isAdditionalPopNeed() {
		return this.isAdditionalPopNeed;
	}
	
	public ScopeRegistry getScopeRegistry() {
		return scopeRegistry;
	}
	
	private ScopeRegistry scopeRegistry=new ScopeRegistry();
}
