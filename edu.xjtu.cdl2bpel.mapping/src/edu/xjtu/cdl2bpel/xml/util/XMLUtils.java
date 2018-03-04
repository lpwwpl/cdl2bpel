package edu.xjtu.cdl2bpel.xml.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;

import edu.xjtu.cdl2bpel.cdl.xpathResolver.XMLPrefixResolver;


public class XMLUtils {
	public static String getText(Node node, boolean pretty) throws XMLException {
		String ret = getText(node);

		if (pretty) {
			ret = reformat(ret);
		}

		return (ret);
	}

	public static String reformat(String xmltext) {
		String ret = xmltext;
		int pos = 0;
		int prevpos = 0;
		StringBuffer buf = new StringBuffer();
		int level = 0;

		while ((pos = ret.indexOf('<', prevpos)) != -1) {

			if (prevpos < pos
					&& ret.substring(prevpos, pos).trim().length() > 0
					&& ret.charAt(prevpos - 1) != '?') {

				if (ret.charAt(prevpos) == '\r'
						&& ret.charAt(prevpos + 1) == '\n') {
					prevpos += 2;
				}
				for (int i = 0; i < level; i++) {
					buf.append("    ");
				}

				buf.append(ret.substring(prevpos, pos).trim());
				buf.append("\r\n");
			}

			int endpos = ret.indexOf('>', pos);

			if (endpos > 0) {
				boolean noreturn = false;

				if (pos > 0 && ret.charAt(pos + 1) == '/') {
					level--;
				}

				for (int i = 0; i < level; i++) {
					buf.append("    ");
				}
				buf.append(ret.substring(pos, endpos + 1));

				if (ret.charAt(endpos - 1) == '?') {

				} else if (ret.charAt(endpos - 1) == '/') {

				} else if (pos > 0 && ret.charAt(pos + 1) == '/') {

				} else if (pos > 0 && ret.charAt(pos + 1) == '!') {

				} else {
					level++;
				}

				if (noreturn == false) {
					buf.append("\r\n");
				}

				pos = endpos + 1;
			}

			prevpos = pos;
		}

		if (prevpos != -1 && ret.substring(prevpos).trim().length() > 0) {
			buf.append(ret.substring(prevpos));
		}

		ret = buf.toString();

		return (ret);
	}

	public static String getText(Node node) throws XMLException {
		String ret = null;

		try {

			java.io.ByteArrayOutputStream xmlstr = new java.io.ByteArrayOutputStream();

			DOMSource source = new DOMSource();
			source.setNode(node);

			StreamResult result = new StreamResult(xmlstr);

			Transformer trans = TransformerFactory.newInstance()
					.newTransformer();
			trans.transform(source, result);

			xmlstr.close();

			ret = new String(xmlstr.toByteArray());

			if ((node instanceof org.w3c.dom.Document) == false) {

				int index = ret.indexOf("<?xml");
				if (index != -1) {
					index = ret.indexOf("<", 1);

					if (index != -1) {
						ret = ret.substring(index);
					} else {
						index = ret.indexOf("?>");

						if (index != -1) {
							index += 2;

							while (index < ret.length()
									&& Character
											.isWhitespace(ret.charAt(index))) {
								index++;
							}

							ret = ret.substring(index);
						}
					}
				}
			}

		} catch (Exception e) {
			throw new XMLException("Failed to transform "
					+ "DOM representation into text", e);
		}

		return (ret);
	}

	public static Node getNode(String text) throws XMLException {
		Node ret = null;

		try {

			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			fact.setNamespaceAware(true);

			java.io.InputStream xmlstr = new java.io.ByteArrayInputStream(text
					.getBytes());

			DocumentBuilder builder = fact.newDocumentBuilder();
			org.w3c.dom.Document doc = builder.parse(xmlstr);

			ret = doc.getDocumentElement();

		} catch (Exception e) {
			throw new XMLException("Failed to transform text "
					+ "into DOM representation", e);
		}

		return (ret);
	}

	public static org.w3c.dom.Node getChild(org.w3c.dom.Element elem,
			String childName) {
		org.w3c.dom.Node ret = elem.getFirstChild();

		while (ret != null && ret.getNodeName().equals(childName) == false) {
			ret = ret.getNextSibling();
		}

		return (ret);
	}

	public static org.w3c.dom.Node getChild(org.w3c.dom.Element elem,
			String namespace, String localname) {
		org.w3c.dom.Node cur = elem.getFirstChild();
		org.w3c.dom.Node ret = null;

		while (ret == null && cur != null) {
			if (cur.getLocalName() != null
					&& cur.getLocalName().equals(localname)
					&& (namespace == null || (cur.getNamespaceURI() != null && cur
							.getNamespaceURI().equals(namespace)))) {
				ret = cur;
			} else {
				cur = cur.getNextSibling();
			}
		}

		return (ret);
	}

	public static org.w3c.dom.Document createDocument() {
		org.w3c.dom.Document ret = null;

		try {
			ret = javax.xml.parsers.DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().newDocument();
		} catch (Exception e) {
			logger.severe("Failed to create initial empty document: " + e);
		}

		return (ret);
	}

	public static org.w3c.dom.Document loadDocument(java.io.InputStream is)
			throws XMLException {
		org.w3c.dom.Document ret = null;

		try {

			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
			fact.setNamespaceAware(true);

			DocumentBuilder builder = fact.newDocumentBuilder();
			ret = builder.parse(is);

		} catch (Exception e) {
			throw new XMLException("Failed to load XML document", e);
		}

		return (ret);
	}

	public static void saveDocument(org.w3c.dom.Document doc,
			java.io.OutputStream os) throws XMLException {
		saveDocument(doc, os, false);
	}

	public static void saveDocument(org.w3c.dom.Document doc,
			java.io.OutputStream os, boolean pretty) throws XMLException {

		try {
			java.io.OutputStream stream = os;
			java.io.ByteArrayOutputStream baos = null;

			if (pretty) {
				baos = new java.io.ByteArrayOutputStream();
				stream = baos;
			}

			DOMSource source = new DOMSource();
			source.setNode(doc);

			StreamResult result = new StreamResult(stream);

			Transformer trans = TransformerFactory.newInstance()
					.newTransformer();
			trans.transform(source, result);

			if (baos != null) {
				String str = baos.toString();
				str = reformat(str);

				os.write(str.getBytes());
			}

		} catch (Exception e) {
			throw new XMLException("Failed to transform "
					+ "DOM representation into textual output stream", e);
		}
	}

	public static boolean checkDocumentValidity(org.w3c.dom.Document doc,
			PrintStream out) {
		boolean ret = false;
		ByteArrayOutputStream baos = null;

		if (out == null) {
			baos = new ByteArrayOutputStream();
			out = new java.io.PrintStream(baos);
		}

		ret = checkNullAttributes(doc.getDocumentElement(), out);

		if (baos != null && ret == false) {
			logger.severe("Document not valid: "
					+ new String(baos.toByteArray()));
		}

		return (ret);
	}

	protected static boolean checkNullAttributes(org.w3c.dom.Element elem,
			PrintStream out) {
		boolean ret = true;

		org.w3c.dom.NamedNodeMap map = elem.getAttributes();

		for (int i = 0; i < map.getLength(); i++) {
			org.w3c.dom.Attr attr = (org.w3c.dom.Attr) map.item(i);

			if (attr.getValue() == null) {
				out.println("Element '" + elem.getNodeName() + "' attribute '"
						+ attr.getName() + "' has NULL value");

				ret = false;
			}
		}

		org.w3c.dom.NodeList nl = elem.getChildNodes();

		for (int i = 0; i < nl.getLength(); i++) {
			if (nl.item(i) instanceof org.w3c.dom.Element) {
				boolean valid = checkNullAttributes((org.w3c.dom.Element) nl
						.item(i), out);

				if (!valid) {
					ret = false;
				}
			}
		}

		return (ret);
	}

	public static String getNamespace(String qname, XMLPrefixNamespaceWithDefaultTNSDeriver resolver) {
		String ret = resolver.getDefaultCDLTargetNamespace();
		String prefix = getPrefix(qname);

		if (prefix != null && resolver != null) {
			ret = resolver.getNamespace(prefix);
		} 
		return (ret);
	}

	public static String getNamespace(String qname, XMLPrefixNamespaceWithDefaultTNSDeriver resolver,String tns) {
		String ret = tns;
		String prefix = getPrefix(qname);

		if (prefix != null && resolver != null) {
			ret = resolver.getNamespace(prefix);
		} 
		return (ret);
	}
	
	public static String getNamespace(String qname, 
			XMLPrefixResolver resolver, String targetNamespace) {
		String ret=targetNamespace;
		String prefix=getPrefix(qname);
		if (prefix != null && resolver != null) {
			ret = resolver.getNamespace(prefix);
		}
		return(ret);
	}
	
	public static String getPrefix(String qname) {
		String ret = null;
		int pos = 0;

		if (qname != null && ((pos = qname.indexOf(':')) != -1)) {
			ret = qname.substring(0, pos);
		}

		return (ret);
	}

	public static String getLocalname(String qname) {
		String ret = qname;
		int pos = 0;

		if (qname != null && ((pos = qname.indexOf(':')) != -1)) {
			ret = qname.substring(pos + 1);
		}

		return (ret);
	}

	public static String decodeXMLString(String details) {
		String ret = details.replaceAll("&lt;", "<");
		ret = ret.replaceAll("&gt;", ">");
		ret = ret.replaceAll("&quot;", "\"");
		return (ret);
	}

	/**
	 * Convert the supplied XML document into a form that is appropriate for
	 * passing in a string. This transforms quotes and < > characters into
	 * &quot;, &lt; and &gt;.
	 * 
	 * @param details
	 *            The original XML document
	 * @return The encoded XML document
	 */
	public static String encodeXMLString(String details) {
		String ret = details.replaceAll("<", "&lt;");
		ret = ret.replaceAll(">", "&gt;");
		ret = ret.replaceAll("\"", "&quot;");
		return (ret);
	}

	public static String encodeQName(String details) {
		StringBuffer ret = new StringBuffer();

		for (int i = 0; i < details.length(); i++) {
			char ch = details.charAt(i);

			if (Character.isLetterOrDigit(ch)) {
				ret.append(ch);
			} else if (ch == '>') {
				ret.append("GT");
			} else if (ch == '<') {
				ret.append("LT");
			} else if (ch == '=') {
				ret.append("EQ");
			}
		}

		return (ret.toString());
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.xml");
}
