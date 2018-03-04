package edu.xjtu.cdl2bpel.mapping.util;

import java.util.logging.Logger;

import org.eclipse.core.runtime.QualifiedName;

import edu.xjtu.cdl2bpel.common.ResourceProperties;

public class EclipseResourceProperties implements ResourceProperties {

	public EclipseResourceProperties(
			org.eclipse.core.resources.IResource resource) {
		m_resource = resource;
	}

	public EclipseResourceProperties(
			org.eclipse.core.resources.IResource resource,
			org.eclipse.core.resources.IResource defresource) {
		m_resource = resource;
		m_defaultResource = defresource;
	}

	public String getProperty(String module, String property) {
		String ret = null;

		if (m_resource != null && property != null) {

			if (property.equals(ResourceProperties.RESOURCE_LOCATION_PROPERTY)) {

				ret = m_resource.getLocation().toString();

			} else if (module != null) {
				QualifiedName key = new QualifiedName(module, property);

				try {
					ret = (String) m_resource.getPersistentProperty(key);
				} catch (Exception e) {
					logger.severe("Failed to retrieve persistent property '"
							+ key + "' from resource " + m_resource);
				}

				if (ret == null && m_defaultResource != null) {

					try {
						ret = (String) m_defaultResource
								.getPersistentProperty(key);
					} catch (Exception e) {
						logger
								.severe("Failed to retrieve persistent property '"
										+ key
										+ "' from default resource "
										+ m_defaultResource);
					}
				}
			}
		}

		return (ret);
	}

	public String getProperty(String module, String property,
			String defaultValue) {
		String ret = getProperty(module, property);

		if (ret == null) {
			ret = defaultValue;
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.resource");

	private org.eclipse.core.resources.IResource m_resource = null;
	private org.eclipse.core.resources.IResource m_defaultResource = null;
}
