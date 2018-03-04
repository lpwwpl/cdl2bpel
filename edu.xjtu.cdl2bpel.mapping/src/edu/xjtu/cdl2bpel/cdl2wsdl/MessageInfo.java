package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.List;

public class MessageInfo {

	private String namespace;
	private String ns;
	private List<MessageOfOperation> messages = null;

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public List<MessageOfOperation> getMessages() {
		return messages;
	}

	public void setMessages(List messages) {
		this.messages = messages;
	}

	public MessageInfo(String namespace) {
		messages = new ArrayList();
		this.namespace = namespace;
	}

	public void addMessageOfOperation(MessageOfOperation message) {
		messages.add(message);
	}
}
