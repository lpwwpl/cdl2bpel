package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.Namespace;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;

public class Orchestra2BPELContext {

	private Document document = null;
	private Element currentElement = null;
	private Element variablesElement = null;
	private int m_prefixCounter = 1;
	private Element oldStackElement = null;// 栈操作之前的当前栈元素
	private Vector<Element> stack = new java.util.Vector<Element>();
	private boolean isAdditionalPopNeed = false;// 判断是不是需要额外进行pop操作，用于onMessage出现时，的push和pop不对称工作
	private List<Pair<RoleType[],String>> pairs;
	private Pair<RoleType[],String> pair;
	
	private Element currentFaultHandlers;
	private Stack<Element> faultHandlersStack=new Stack<Element>();
	
	public List<Pair<RoleType[], String>> getPairs() {
		return pairs;
	}

	public Pair<RoleType[],String> getPair() {
		return pair;
	}
	
	private Map namespaces = new java.util.Hashtable();
	private String defaultNamespace = null;// 默认的命名空间，就是xmlns的值

	public void pushFaultHandlers(Element faultHandlers){
		faultHandlersStack.push(faultHandlers);
	}
	public Element popFaultHandler(){
		Element returnElement=null;
		if(faultHandlersStack.size()>0){
			returnElement=faultHandlersStack.pop();
		}
		return returnElement;
	}
	public Element getCurrentFaultHandler(){
		Element returnElement = faultHandlersStack.peek();
		return returnElement;
	}
	public Orchestra2BPELContext(List<Pair<RoleType[],String>> pairs,Pair<RoleType[],String> pair) {
		this.pairs = pairs;
		this.pair = pair;
	}
	
	public void setAdditionalPopNeed(boolean isAdditionalPopNeed) {
		this.isAdditionalPopNeed = isAdditionalPopNeed;
	}

	public Element getVariablesElement() {
		return variablesElement;
	}

	public void setVariablesElement(Element variablesElement) {
		this.variablesElement = variablesElement;
	}

	public org.w3c.dom.Document getDocument() {
		return document;
	}

	public void setDocument(org.w3c.dom.Document document) {
		this.document = document;
	}

	public org.w3c.dom.Element getCurrentElement() {
		return currentElement;
	}

	public void setCurrentElement(org.w3c.dom.Element currentElement) {
		this.currentElement = currentElement;
	}

	public Vector<Element> getStack() {
		return stack;
	}

	public void setStack(Vector<Element> stack) {
		this.stack = stack;
	}

	public Map getNamespaces() {
		return namespaces;
	}

	public void setNamespaces(Map namespaces) {
		this.namespaces = namespaces;
	}

	public void push(Element newCurrentElement) {
		oldStackElement = currentElement;
		if (currentElement != null) {
			stack.add(0, currentElement);
		}

		currentElement = newCurrentElement;
	}

	public Element getOldStackElement() {
		return oldStackElement;
	}

	public void setOldStackElement(Element oldStackElement) {
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

	public Element createElement(String name) {
		return (document.createElementNS(defaultNamespace, name));
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
	 * 判断是不是需要额外进行pop操作，用于onMessage出现时，的push和pop不对称工作
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
