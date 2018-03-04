package edu.xjtu.cdl2bpel.bpel;

import org.w3c.dom.Document;

public class BPELXML {
	private Document document;

	public BPELXML(Document document) {
		this.document = document;
	}

	public Document getDocument() {
		return document;
	}
}
