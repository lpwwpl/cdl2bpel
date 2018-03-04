package edu.xjtu.cdl2bpel.designer.util;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;

public class ModelCreationFactory implements CreationFactory {

	public ModelCreationFactory(Object targetClass) {
		m_targetClass = targetClass;
	}

	public Object getNewObject() {
		Object ret = null;

		if (m_targetClass instanceof EClass) {
			try {
				if (CDLElement.class.isAssignableFrom(((EClass) m_targetClass)
						.getInstanceClass())) {
					ret = CDLFactory.eINSTANCE.create((EClass) m_targetClass);
				}
			} catch (Exception e) {
				logger.severe("Failed to create new EMF object of type '"
						+ m_targetClass + "': " + e);
			}
		} else if (m_targetClass instanceof Class) {
			try {
				ret = ((Class) m_targetClass).newInstance();
			} catch (Exception e) {
				logger.severe("Failed to create new object of type '"
						+ m_targetClass + "': " + e);
			}
		}

		return (ret);
	}

	public Object getObjectType() {
		return (m_targetClass);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.designer.util");

	private Object m_targetClass = null;
}
