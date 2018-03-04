package edu.xjtu.cdl2bpel.common.schema;

import org.eclipse.emf.common.util.URI;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class XSDSchemaManagerImpl implements SchemaManager {

	public String registerSchema(String url) throws SchemaException {
		String ret = null;
		org.eclipse.xsd.XSDSchema schema = null;

		try {
			org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
			org.eclipse.xsd.util.XSDResourceImpl xsdSchemaResource = (org.eclipse.xsd.util.XSDResourceImpl) resourceSet
					.getResource(URI.createURI(url), true);

			schema = xsdSchemaResource.getSchema();

			if (schema != null) {
				ret = schema.getTargetNamespace();

				m_schemas.put(ret, schema);
			}
		} catch (Throwable t) {
			throw new SchemaException("Failed to register schema '" + url
					+ "': " + t);
		}

		return (ret);
	}

	protected org.eclipse.xsd.XSDSchema getSchema(String namespace) {
		org.eclipse.xsd.XSDSchema ret = (org.eclipse.xsd.XSDSchema) m_schemas
				.get(namespace);

		return (ret);
	}

	public boolean isValidType(String namespace, String localpart) {
		boolean ret = false;
		org.eclipse.xsd.XSDSchema schema = getSchema(namespace);

		if (schema != null) {
			java.util.List types = schema.getTypeDefinitions();

			for (int i = 0; ret == false && i < types.size(); i++) {
				org.eclipse.xsd.XSDTypeDefinition tdef = (org.eclipse.xsd.XSDTypeDefinition) types
						.get(i);

				if (tdef.getName().equals(localpart)) {
					ret = true;
				}
			}
		} else {
			ret = true;
		}

		return (ret);
	}

	public boolean isValidElement(String namespace, String localpart) {
		boolean ret = false;
		org.eclipse.xsd.XSDSchema schema = getSchema(namespace);

		if (schema != null) {
			java.util.List elems = schema.getElementDeclarations();

			for (int i = 0; ret == false && i < elems.size(); i++) {
				org.eclipse.xsd.XSDElementDeclaration edef = (org.eclipse.xsd.XSDElementDeclaration) elems
						.get(i);

				if (edef.getName().equals(localpart)) {
					ret = true;
				}
			}
		} else {
			ret = true;
		}

		return (ret);
	}

	public java.util.List getTypeNameList() {
		java.util.List ret = new java.util.Vector();

		java.util.Enumeration iter = m_schemas.keys();
		while (iter.hasMoreElements()) {
			String namespace = (String) iter.nextElement();
			org.eclipse.xsd.XSDSchema schema = (org.eclipse.xsd.XSDSchema) m_schemas
					.get(namespace);

			java.util.List types = schema.getTypeDefinitions();

			for (int i = 0; i < types.size(); i++) {
				org.eclipse.xsd.XSDTypeDefinition tdef = (org.eclipse.xsd.XSDTypeDefinition) types
						.get(i);

				ret.add(NameSpaceUtil.getFullyQualifiedName(namespace, tdef
						.getName()));
			}
		}

		return (ret);
	}

	public java.util.List getElementNameList() {
		java.util.List ret = new java.util.Vector();

		java.util.Enumeration iter = m_schemas.keys();
		while (iter.hasMoreElements()) {
			String namespace = (String) iter.nextElement();
			org.eclipse.xsd.XSDSchema schema = (org.eclipse.xsd.XSDSchema) m_schemas
					.get(namespace);

			java.util.List elems = schema.getElementDeclarations();

			for (int i = 0; i < elems.size(); i++) {
				org.eclipse.xsd.XSDElementDeclaration edef = (org.eclipse.xsd.XSDElementDeclaration) elems
						.get(i);

				ret.add(NameSpaceUtil.getFullyQualifiedName(namespace, edef
						.getName()));
			}
		}

		return (ret);
	}

	private java.util.Hashtable m_schemas = new java.util.Hashtable();
}
