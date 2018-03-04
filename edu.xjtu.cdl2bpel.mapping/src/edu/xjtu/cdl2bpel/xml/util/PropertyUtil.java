package edu.xjtu.cdl2bpel.xml.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.util.logging.Logger;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class PropertyUtil {

	protected static synchronized org.w3c.dom.Element loadXML() {
		org.w3c.dom.Element ret = m_xmlConfig;

		if (ret == null && m_xmlConfigLoaded == false) {
			try {

				java.io.InputStream is = null;

				if (PropertyUtil.class.getClassLoader() != null) {
					is = PropertyUtil.class.getClassLoader()
							.getResourceAsStream(CDL2BPEL_XML);
				}

				if (is == null) {

					is = ClassLoader.getSystemResourceAsStream(CDL2BPEL_XML);

					if (is != null
							&& logger.isLoggable(java.util.logging.Level.FINE)) {
						logger.fine("XML config system location: "
								+ ClassLoader.getSystemResource(CDL2BPEL_XML));
					}

				} else {

					if (logger.isLoggable(java.util.logging.Level.FINE)) {
						logger.fine("XML config location: "
								+ PropertyUtil.class.getClassLoader()
										.getResource(CDL2BPEL_XML));
					}
				}

				if (is != null) {

					org.w3c.dom.Document doc = XMLUtils.loadDocument(is);

					if (doc != null
							&& doc.getDocumentElement().getNodeName().equals(
									"cdl2bpel")) {
						ret = doc.getDocumentElement();

						logger.info("Located cdl2bpel XML configuration");
					}
				}

				if (ret == null) {
					logger.info("Unable to locate cdl2bpel XML configuration");
				}

			} catch (Exception e) {
				logger.log(java.util.logging.Level.SEVERE,
						"Failed to load cdl2bpel XML configuration: " + e, e);
			}

			setXMLConfiguration(ret);
		}

		return (ret);
	}

	protected static void setXMLConfiguration(org.w3c.dom.Element xmlConfig) {
		m_xmlConfig = xmlConfig;

		m_xmlConfigLoaded = (xmlConfig != null);
	}

	public static boolean hasProperty(String propName) {
		boolean ret = false;

		if (getProperty(propName) != null) {
			ret = true;
		}

		return (ret);
	}

	public static String getProperty(String propName) {
		return (getProperty(propName, null));
	}

	public static String getProperty(String propName, String defValue) {
		String ret = defValue;
		org.w3c.dom.Element xmlConfig = loadXML();

		if (xmlConfig != null) {

			java.util.StringTokenizer st = new java.util.StringTokenizer(
					propName, ".");

			String token = st.nextToken();

			if (token.equals("cdl2bpel")) {
				org.w3c.dom.Node cur = xmlConfig;
				boolean propFound = false;

				while (st.hasMoreTokens()) {
					token = st.nextToken();

					if (st.hasMoreTokens() == false) {

						if (cur instanceof org.w3c.dom.Element) {

							if (((org.w3c.dom.Element) cur).hasAttribute(token)) {
								ret = ((org.w3c.dom.Element) cur)
										.getAttribute(token);
								propFound = true;
							} else {

								org.w3c.dom.Node tn = XMLUtils.getChild(
										(org.w3c.dom.Element) cur, token);

								if (tn != null
										&& tn.getFirstChild() instanceof org.w3c.dom.Text) {
									String text = tn.getFirstChild()
											.getNodeValue().trim();

									if (CheckNOthersUtil.isSet(text)) {
										ret = text;
										propFound = true;
									}
								}
							}
						}
					} else if (cur instanceof org.w3c.dom.Element) {

						cur = XMLUtils.getChild((org.w3c.dom.Element) cur,
								token);
					}
				}

				if (propFound == false) {
					logger.fine("Failed to find property '" + propName
							+ "' in XML configuration");
				}
			}
		}

		return (ret);
	}

	public static void configureComponent(String propName, Object component) {
		configureComponent(propName, component, null);
	}

	public static void configureComponent(String propName, Object component,
			ClassLoader loader) {
		org.w3c.dom.Node root = loadXML();

		java.util.StringTokenizer st = new java.util.StringTokenizer(propName,
				".");

		String token = st.nextToken();

		if (token.equals("cdl2bpel")) {
			while (st.hasMoreTokens() && root instanceof org.w3c.dom.Element) {
				token = st.nextToken();

				root = XMLUtils.getChild((org.w3c.dom.Element) root, token);
			}

			if (root instanceof org.w3c.dom.Element) {
				configureComponent((org.w3c.dom.Element) root, component,
						loader);
			}
		}
	}

	protected static void configureComponent(org.w3c.dom.Element config,
			Object component, ClassLoader loader) {

		if (logger.isLoggable(java.util.logging.Level.FINER)) {
			logger.finer("Configure component: " + component);
		}

		org.w3c.dom.NamedNodeMap attrs = config.getAttributes();
		for (int i = 0; i < attrs.getLength(); i++) {
			org.w3c.dom.Node attr = attrs.item(i);

			if (attr.getNodeName().equals("class") == false) {
				setAttribute(component, attr.getNodeName(), attr.getNodeValue());
			}
		}

		org.w3c.dom.NodeList nl = config.getChildNodes();

		for (int i = 0; i < nl.getLength(); i++) {
			org.w3c.dom.Node n = nl.item(i);

			if (n instanceof org.w3c.dom.Element) {

				if (((org.w3c.dom.Element) n).hasAttribute("class")) {
					createSubComponent(component, n.getNodeName(),
							(org.w3c.dom.Element) n, loader);

				} else {

					if (n.getFirstChild() instanceof org.w3c.dom.Text) {
						setAttribute(component, n.getNodeName(), n
								.getFirstChild().getNodeValue());
					} else {
						logger.severe("Unable to find attribute value "
								+ "for node '" + n + "' on component '"
								+ component + "' of class '"
								+ component.getClass().getName() + "'");
					}
				}
			}
		}
	}

	protected static void createSubComponent(Object component, String name,
			org.w3c.dom.Element config, ClassLoader loader) {

		if (logger.isLoggable(java.util.logging.Level.FINER)) {
			logger.finer("Create sub component '" + name + "' for parent '"
					+ component + "' with config: " + config);
		}

		if (config != null && config.hasAttribute("class")) {
			Object sub = null;

			try {
				Class cls = null;

				if (loader == null) {
					cls = Class.forName(config.getAttribute("class"));
				} else {
					cls = loader.loadClass(config.getAttribute("class"));
				}

				sub = cls.newInstance();

			} catch (Exception e) {
				logger.severe("Failed to create sub-component '" + config
						+ "': " + e);
				sub = null;
			}

			if (sub != null) {

				configureComponent(config, sub, loader);

				try {

					PropertyDescriptor pd = getPropertyDescriptor(component,
							name);

					if (logger.isLoggable(java.util.logging.Level.FINER)) {
						logger.finer("Property descriptor: " + pd);
					}

					if (pd instanceof java.beans.IndexedPropertyDescriptor) {
						Object val = pd.getReadMethod().invoke(component,
								new Object[] {});
						Object newVal = null;

						if (val == null || Array.getLength(val) == 0) {

							newVal = Array.newInstance(pd.getPropertyType()
									.getComponentType(), 1);
							Array.set(newVal, 0, sub);
						} else {
							int len = Array.getLength(val);

							newVal = Array.newInstance(pd.getPropertyType()
									.getComponentType(), len + 1);

							for (int i = 0; i < len; i++) {
								Array.set(newVal, i, Array.get(val, i));
							}

							Array.set(newVal, len, sub);
						}

						if (pd.getWriteMethod() != null) {
							pd.getWriteMethod().invoke(component,
									new Object[] { newVal });
						} else {
							logger
									.severe("Cannot write containment relationship '"
											+ name
											+ "' on component '"
											+ component
											+ "' of class '"
											+ component.getClass().getName()
											+ "'");
						}

					} else if (pd != null) {

						if (pd.getWriteMethod() != null) {
							pd.getWriteMethod().invoke(component,
									new Object[] { sub });

						} else {
							logger.severe("Property '" + name
									+ "' on component '" + component
									+ "' is not writable");
						}
					} else {
						logger.severe("Property '" + name + "' on component '"
								+ component + "' could not be found");
					}

				} catch (Exception e) {
					logger
							.severe("Failed to establish containment relationship '"
									+ name
									+ "' on component '"
									+ component
									+ "' of class '"
									+ component.getClass().getName()
									+ "': "
									+ e);
				}
			}
		}
	}

	protected static void setAttribute(Object component, String name,
			String value) {

		try {
			PropertyDescriptor pd = getPropertyDescriptor(component, name);

			if (pd == null) {

				logger.severe("Unable to configure attribute '" + name
						+ "' on component '" + component + "' of type '"
						+ component.getClass().getName() + "'");
			} else {
				if (logger.isLoggable(java.util.logging.Level.FINER)) {
					logger.finer("Property Descriptor for attribute '" + name
							+ "' on component '" + component + "' of type '"
							+ component.getClass().getName() + "' is "
							+ pd.getName() + " "
							+ pd.getPropertyType().getName());
				}

				Object val = getPropertyDescriptorValue(pd, value);

				if (logger.isLoggable(java.util.logging.Level.FINER)) {
					String valType = "unknown";

					if (val != null) {
						valType = val.getClass().getName();
					}

					logger.finer("Value for attribute '" + name
							+ "' on component '" + component + "' of type '"
							+ component.getClass().getName() + "' is " + val
							+ " (of type " + valType + ")");
				}

				if (pd.getWriteMethod() != null) {
					pd.getWriteMethod().invoke(component, new Object[] { val });
				} else {
					logger.severe("Cannot write attribute '" + name
							+ "' on component '" + component + "' of type '"
							+ component.getClass().getName() + "'");
				}
			}
		} catch (Exception e) {
			logger.severe("Failed to configure attribute '" + name
					+ "' on component '" + component + "' of type '"
					+ component.getClass().getName() + "': " + e);
		}
	}

	protected static Object getPropertyDescriptorValue(PropertyDescriptor pd,
			String value) {
		Object ret = value;

		if (pd != null && pd.getPropertyType() != String.class) {
			if (pd.getPropertyType() == Boolean.class
					|| pd.getPropertyType() == boolean.class) {
				ret = Boolean.valueOf(value);
			} else if (pd.getPropertyType() == Integer.class
					|| pd.getPropertyType() == int.class) {
				ret = Integer.valueOf(value);
			} else if (pd.getPropertyType() == Short.class
					|| pd.getPropertyType() == short.class) {
				ret = Short.valueOf(value);
			} else if (pd.getPropertyType() == Float.class
					|| pd.getPropertyType() == float.class) {
				ret = Float.valueOf(value);
			} else if (pd.getPropertyType() == Long.class
					|| pd.getPropertyType() == long.class) {
				ret = Long.valueOf(value);
			} else if (pd.getPropertyType() == Double.class
					|| pd.getPropertyType() == double.class) {
				ret = Double.valueOf(value);
			} else if (pd.getPropertyType() == Byte.class
					|| pd.getPropertyType() == byte.class) {
				ret = Byte.valueOf(value);
			}
		}

		return (ret);
	}

	protected static PropertyDescriptor getPropertyDescriptor(Object component,
			String propName) throws IntrospectionException {
		PropertyDescriptor ret = null;

		BeanInfo bi = Introspector.getBeanInfo(component.getClass());
		PropertyDescriptor[] pds = bi.getPropertyDescriptors();

		for (int i = 0; ret == null && i < pds.length; i++) {
			if (pds[i].getName().equalsIgnoreCase(propName)) {
				ret = pds[i];
			}
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.util");

	public static final String CDL2BPEL_PROPERTIES = "cdl2bpel.properties";
	public static final String CDL2BPEL_XML = "cdl2bpel.xml";

	private static org.w3c.dom.Element m_xmlConfig = null;
	private static boolean m_xmlConfigLoaded = false;
}
