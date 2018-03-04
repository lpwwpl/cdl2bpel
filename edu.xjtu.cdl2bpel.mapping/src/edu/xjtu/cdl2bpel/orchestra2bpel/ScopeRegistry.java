package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Hashtable;

public class ScopeRegistry {
	
	private Hashtable m_scopes = new Hashtable();

	public void registerScope(String name, org.w3c.dom.Element scope) {
		m_scopes.put(name, scope);
	}

	public org.w3c.dom.Element getScope(String name) {
		return ((org.w3c.dom.Element) m_scopes.get(name));
	}
}
