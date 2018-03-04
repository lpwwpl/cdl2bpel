package edu.xjtu.cdl2bpel.orchestra.xpath;

import java.io.ByteArrayInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.apache.xpath.ExpressionOwner;
import org.apache.xpath.ExtensionsProvider;
import org.apache.xpath.XPath;
import org.apache.xpath.XPathContext;
import org.apache.xpath.functions.FuncExtFunction;
import org.apache.xpath.functions.Function;
import org.apache.xpath.objects.XBoolean;
import org.apache.xpath.objects.XObject;
import org.apache.xpath.objects.XObjectFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class XalanXPathEvaluatorImpl implements XPathEvaluator {

	public XalanXPathEvaluatorImpl() {
	}

	public void registerFunctionResolver(String namespace,
			XPathFunctionResolver resolver) {
		m_functionResolvers.put(namespace, resolver);
	}

	public void unregisterFunctionResolver(String namespace) {
		m_functionResolvers.remove(namespace);
	}

	protected XPathFunctionResolver getFunctionResolver(String namespace) {
		return ((XPathFunctionResolver) m_functionResolvers.get(namespace));
	}

	public Object evaluate(Object context, String xpath, XMLPrefixResolver pres)
			throws XPathException {
		Object ret = null;

		if (logger.isLoggable(Level.FINEST)) {
			logger.finest("Xpath evaluate context=" + context + " xpath=\""
					+ xpath + "\" prefixResolver=" + pres);
		}

		XObject xobj = execute(context, xpath, pres);

		if (xobj != null) {
			boolean valueSet = false;

			if (xobj instanceof org.apache.xpath.objects.XNodeSet) {
				try {
					org.w3c.dom.NodeList nodeList = xobj.nodelist();

					if (logger.isLoggable(Level.FINEST)) {
						logger.finest("Xpath nodelist=" + nodeList + " length="
								+ nodeList.getLength());
					}

					if (nodeList.getLength() > 0) {
						valueSet = true;

						if (logger.isLoggable(Level.FINEST)) {
							logger.finest("Xpath convert first list member: "
									+ nodeList.item(0));
						}

						if (context instanceof org.w3c.dom.Node
								&& nodeList.item(0) instanceof org.w3c.dom.Element) {
							ret = nodeList.item(0);
						} else {
							ret = convertResult(nodeList.item(0));
						}
					}
				} catch (Exception e) {
					logger.log(Level.SEVERE,
							"Failed to transform evaluated node '" + xpath
									+ "' from context " + context, e);
				}
			}

			if (valueSet == false) {

				if (logger.isLoggable(Level.FINEST)) {
					logger.finest("About to convert xobj=" + xobj);
				}

				ret = convertResult(xobj);
			}
		}

		if (logger.isLoggable(Level.FINEST)) {
			logger.finest("Xpath evaluate ret=" + ret);
		}

		return (ret);
	}

	public Object selectNode(Object context, String xpath,
			XMLPrefixResolver pres) throws XPathException {
		Object ret = null;

		XObject xobj = execute(context, xpath, pres);

		if (xobj != null) {
			try {
				org.w3c.dom.NodeList nodeList = xobj.nodelist();
				if (nodeList.getLength() > 0) {
					if (context instanceof org.w3c.dom.Node) {
						ret = nodeList.item(0);
					} else {
						ret = convertResult(nodeList.item(0));
					}
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to transform selected node '"
						+ xpath + "' from context " + context, e);
			}
		}

		return (ret);
	}

	public java.util.List selectNodes(Object context, String xpath,
			XMLPrefixResolver pres) throws XPathException {
		java.util.List ret = null;

		XObject xobj = execute(context, xpath, pres);

		if (xobj != null) {
			try {
				org.w3c.dom.NodeList nodeList = xobj.nodelist();
				ret = new java.util.Vector();

				for (int i = 0; i < nodeList.getLength(); i++) {
					Node n = nodeList.item(i);

					Object res = null;
					;

					if (context instanceof org.w3c.dom.Node) {
						res = n;
					} else {
						res = convertResult(n);
					}

					ret.add(res);
				}
			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to transform selected nodes '"
						+ xpath + "' from context " + context, e);
			}
		}

		return (ret);
	}

	protected XObject execute(Object context, String xpath,
			XMLPrefixResolver pres) throws XPathException {
		XObject ret = null;

		Node node = getNode(context);
		XPathContext xpc = new XPathContext(new ContextOwner(context, pres,
				this));

		try {
			PrefixResolver pr = getPrefixResolver(pres);

			XPath xp = new XPath(xpath, null, pr, XPath.SELECT, null);
			ret = xp.execute(xpc, node, pr);

		} catch (XPathException xpe) {
			throw xpe;

		} catch (javax.xml.transform.TransformerException te) {

			if (te.getCause() instanceof XPathException) {
				throw (XPathException) te.getCause();
			} else {

				logger.log(Level.SEVERE, "Failed to evaluate '" + xpath
						+ "' against context " + context, te);

				throw new XPathException("Failed to evaluate XPath "
						+ "expression: " + te.getMessage());
			}
		}

		return (ret);
	}

	protected Node getNode(Object value) {
		Node ret = null;

		if (value instanceof Node) {
			ret = (Node) value;
		} else if (value instanceof String) {

			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory
						.newInstance();
				factory.setNamespaceAware(true);

				DocumentBuilder builder = factory.newDocumentBuilder();

				Document doc = builder.parse(new ByteArrayInputStream(
						((String) value).getBytes()));
				ret = doc.getDocumentElement();

			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to parse XML value=" + value,
						e);
			}
		} else {
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory
						.newInstance();
				factory.setNamespaceAware(true);

				DocumentBuilder builder = factory.newDocumentBuilder();

				ret = builder.newDocument();

			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to return empty document", e);
			}
		}

		return (ret);
	}

	protected PrefixResolver getPrefixResolver(XMLPrefixResolver res) {
		PrefixResolver ret = null;

		if (res == null) {
			ret = getDefaultPrefixResolver();
		} else {
			ret = new XalanPrefixResolverProxy(res);
		}

		return (ret);
	}

	protected PrefixResolver getDefaultPrefixResolver() {
		return (m_defaultPrefixResolver);
	}

	protected Object convertResult(XObject xobj) {
		Object ret = null;

		if (logger.isLoggable(Level.FINEST)) {
			logger.finest("Convert xobj=" + xobj);
		}

		if (xobj instanceof XBoolean) {
			try {
				if (logger.isLoggable(Level.FINEST)) {
					logger.finest("Converted xobj=" + xobj + " is boolean");
				}

				ret = new Boolean(((XBoolean) xobj).bool());
			} catch (Exception e) {
				logger.severe("Failed to convert boolean: " + e);
			}
		} else if (xobj != null) {

			if (logger.isLoggable(Level.FINEST)) {
				logger.finest("Converted xobj=" + xobj + " not null");
			}

			if (xobj.object() instanceof java.util.Map) {
				if (logger.isLoggable(Level.FINEST)) {
					logger.finest("Converted xobj=" + xobj + " is map");
				}

				ret = xobj.object();
			} else {
				ret = xobj.xstr().toString().trim();

				if (logger.isLoggable(Level.FINEST)) {
					logger.finest("Converted xobj=" + xobj
							+ " using xtr().toString()");
				}
			}
		}

		if (logger.isLoggable(Level.FINEST)) {
			logger.finest("Converted xobj=" + xobj + " into " + ret);
		}

		return (ret);
	}

	protected Object convertResult(Node node) {
		Object ret = null;

		if (node instanceof Attr) {
			ret = ((Attr) node).getNodeValue();

		} else if (node instanceof Text) {
			ret = ((Text) node).getNodeValue();

		} else if (node != null) {
			try {
				java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();

				DOMSource source = new DOMSource();
				source.setNode(node);

				StreamResult destination = new StreamResult(baos);

				Transformer trans = TransformerFactory.newInstance()
						.newTransformer();
				trans.transform(source, destination);

				baos.close();

				ret = baos.toString();

				if (ret != null && ((String) ret).startsWith("<?xml")) {
					int pos = ((String) ret).indexOf('<', 1);

					if (pos != -1) {
						ret = ((String) ret).substring(pos);
					} else {
						pos = ((String) ret).indexOf('>');

						if (pos != -1) {
							pos++;
							int len = ((String) ret).length();

							while (pos < len
									&& Character.isWhitespace(((String) ret)
											.charAt(pos))) {
								pos++;
							}

							if (pos < len) {
								ret = ((String) ret).substring(pos);
							}
						}
					}
				}

			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to convert result", e);
			}
		}

		if (logger.isLoggable(Level.FINEST)) {
			logger.finest("Converted node=" + node + " into " + ret);
		}

		return (ret);
	}

	public void visit(String expression, XPathVisitor visitor,
			XMLPrefixResolver pres) throws XPathException {

		XalanXPathVisitorProxy proxy = new XalanXPathVisitorProxy(visitor);
		PrefixResolver pr = getPrefixResolver(pres);

		org.apache.xpath.XPath xpath = null;

		try {
			xpath = new org.apache.xpath.XPath(expression, null, pr, 0);

		} catch (Exception e) {
			throw new XPathException(e.getLocalizedMessage(), e);
		}

		if (xpath != null) {
			try {
				xpath.callVisitors(null, proxy);
			} catch (XPathException xpe) {
				throw xpe;

			} catch (Exception e) {
				logger.log(Level.SEVERE, "Failed to process XPath expression",
						e);
				throw new XPathException("Failed to visit XPath expression", e);
			}
		}
	}

	public void validate(String xpath, XMLPrefixResolver pres)
			throws XPathException {
		DefaultXPathVisitor visitor = new DefaultXPathVisitor();

		visitor.setValidationEnabled(true);

		visit(xpath, visitor, pres);
	}

	public String asString(Object value) {
		String ret = null;

		if (value instanceof String) {
			ret = (String) value;
		} else if (value instanceof org.w3c.dom.Node) {
			try {
				ret = XMLUtils.getText((org.w3c.dom.Node) value);
			} catch (Exception e) {
				logger.severe("Failed to convert '" + value + "' to string: "
						+ e);
			}
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.xpath.xalan");
	private PrefixResolver m_defaultPrefixResolver = new PrefixResolverDefault(
			null);
	private java.util.Hashtable m_functionResolvers = new java.util.Hashtable();

	public class ContextOwner implements ExtensionsProvider {

		public ContextOwner(Object context, XMLPrefixResolver pres,
				XPathEvaluator evaluator) {
			m_context = context;
			m_prefixResolver = pres;
			m_xpathEvaluator = evaluator;
		}

		public Object getContext() {
			return (m_context);
		}

		public boolean functionAvailable(String ns, String funcName)
				throws TransformerException {
			boolean ret = false;

			XPathFunctionResolver resolver = getFunctionResolver(ns);
			if (resolver != null) {
				ret = (resolver.getFunction(funcName) != null);
			}

			return (ret);
		}

		public boolean elementAvailable(String ns, String elemName)
				throws TransformerException {
			return (false);
		}

		public Object extFunction(String ns, String funcName,
				java.util.Vector argVec, Object methodKey)
				throws TransformerException {
			Object ret = null;

			XPathFunctionResolver resolver = getFunctionResolver(ns);
			if (resolver != null) {
				XPathFunction func = resolver.getFunction(funcName);

				if (func != null) {
					ret = func.invoke(getContext(),
							processFunctionParameters(argVec),
							m_prefixResolver, m_xpathEvaluator);

					ret = processFunctionReturnValue(ret);
				}
			}

			return (ret);
		}

		public Object extFunction(FuncExtFunction extFunction,
				java.util.Vector argVec) throws TransformerException {
			Object ret = extFunction(extFunction.getNamespace(), extFunction
					.getFunctionName(), argVec, null);

			return (ret);
		}

		protected Object[] processFunctionParameters(java.util.Vector args) {
			Object[] ret = null;

			if (args != null) {
				ret = new Object[args.size()];

				for (int i = 0; i < ret.length; i++) {
					ret[i] = processFunctionParameter(args.get(i));
				}
			} else {
				ret = new Object[0];
			}

			return (ret);
		}

		protected Object processFunctionParameter(Object param) {
			Object ret = param;

			if (param instanceof XObject) {
				ret = ((XObject) param).object();
			}

			return (ret);
		}

		protected Object processFunctionReturnValue(Object res) {
			Object ret = res;

			if (res instanceof Number) {
				ret = new org.apache.xpath.objects.XNumber(((Number) res)
						.doubleValue());

			} else if ((res instanceof XObject) == false) {
				ret = XObjectFactory.create(res);
			}

			return (ret);
		}

		private Object m_context = null;
		private XMLPrefixResolver m_prefixResolver = null;
		private XPathEvaluator m_xpathEvaluator = null;
	}

	public class XalanXPathVisitorProxy extends org.apache.xpath.XPathVisitor {

		public XalanXPathVisitorProxy(XPathVisitor visitor) {
			m_visitor = visitor;
		}

		public boolean visitFunction(ExpressionOwner owner, Function function) {

			if (function instanceof FuncExtFunction) {
				FuncExtFunction extfunc = (FuncExtFunction) function;
				XPathFunctionResolver funcResolver = null;

				if (extfunc.getNamespace() == null
						|| (funcResolver = getFunctionResolver(extfunc
								.getNamespace())) == null) {

				}

				XPathFunction func = funcResolver.getFunction(extfunc
						.getFunctionName());

				if (func == null) {
				}

				Object[] parameters = new Object[extfunc.getArgCount()];
				for (int i = 0; i < parameters.length; i++) {
					parameters[i] = extfunc.getArg(i).toString();
				}

				m_visitor.function(extfunc.getNamespace(), func, parameters);
			}

			return (true);
		}

		private XPathVisitor m_visitor = null;
	}
}
