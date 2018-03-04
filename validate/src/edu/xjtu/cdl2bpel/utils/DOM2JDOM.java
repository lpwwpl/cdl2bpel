package edu.xjtu.cdl2bpel.utils;

//Java imports
import java.io.IOException;

import org.jdom.JDOMException;
import org.jdom.input.DOMBuilder;
import org.w3c.dom.Document;

public class DOM2JDOM {
	// DOM tree of input document
	org.w3c.dom.Document domDoc;

	public DOM2JDOM(Document domDoc) throws Exception {
		this.domDoc = domDoc;
	}

	public org.jdom.Document convert() throws JDOMException, IOException {
		// Create new DOMBuilder, using default parser
		DOMBuilder builder = new DOMBuilder();
		org.jdom.Document jdomDoc = builder.build(domDoc);
		return jdomDoc;
	}

}
