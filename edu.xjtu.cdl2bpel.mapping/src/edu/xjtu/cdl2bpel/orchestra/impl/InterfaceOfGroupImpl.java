/**
 * CDL2BPEL_XJTU
 *
 * $Id: InterfaceOfGroupImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.Operation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.util.BPElementUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Of Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.InterfaceOfGroupImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceOfGroupImpl extends BPElementImpl implements InterfaceOfGroup {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceOfGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.INTERFACE_OF_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS:
				getOperations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrchestraPackage.INTERFACE_OF_GROUP__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

public String getFullyQualifiedName() {
		
		if (m_cachedQName == null || m_enableFQNCaching == false) {
			String namespace=BPElementUtil.getNamespace(getName(),
						this);
				
			String localpart=XMLUtils.getLocalname(getName());
			
			m_cachedQName = CommonNamespaceUtil.getFullyQualifiedName(namespace,
							localpart);
		}
		return(m_cachedQName);
	}
	
	protected void initializeElement(){
		
		m_enableFQNCaching = true;
		
		m_messageTypeCache = new java.util.Hashtable();
		
		Iterator iter=getOperations().iterator();
		while (iter.hasNext()) {
			Operation op=(Operation)iter.next();
			
			for (int i=0; i < op.getMessages().size(); i++) {
				Message mdef=(Message)
							op.getMessages().get(i);
					
				if (mdef.getInformationType() != null) {
					String fqtype=mdef.getInformationType().getFullyQualifiedType();
					
					if (CheckNOthersUtil.isSet(fqtype) == false) {
						fqtype = mdef.getInformationType().getFullyQualifiedElement();
					}		
					
					if (fqtype != null) {
						java.util.List list=(java.util.List)
								m_messageTypeCache.get(fqtype);
						
						if (list == null) {
							list = new java.util.Vector();
							m_messageTypeCache.put(fqtype, list);
						}
						
						if (fqtype != null && list.contains(op) == false) {
							list.add(op);
						}
					}
				}
			}
		}
	}
	
	public java.util.List getOperations(String name,
			String requestType, String responseType) {
		java.util.Vector ret=new java.util.Vector();
		
		Iterator iter=null;
		
		initializeElement();
		
		if (m_messageTypeCache != null && ((requestType == null &&
				responseType != null) || (responseType == null &&
						requestType != null))) {
			java.util.List main=null;
			
			if (requestType != null) {
				main = (java.util.List)m_messageTypeCache.get(requestType);
			}
			
			if (responseType != null) {
				main = (java.util.List)m_messageTypeCache.get(responseType);
				
				/*
				java.util.List list=(java.util.List)m_messageTypeCache.get(responseType);
				
				if (main == null) {
					main = list;
				} else if (list != null) {
					java.util.Vector merge=new java.util.Vector();
					merge.addAll(main);
					merge.addAll(list);
					
					main = merge;
				}
				*/
			}

			if (main != null) {
				iter = main.iterator();
			}
		} else {
			iter = getOperations().iterator();
		}
		
		while (iter != null && iter.hasNext()) {
			Operation op=(Operation)iter.next();
			
			if (name == null || op.getName().equals(name)) {
				boolean reqFound=(requestType==null);
				boolean respFound=(responseType==null);
				java.util.Iterator miter=op.getMessages().iterator();
				
				while ((reqFound == false || respFound == false) &&
						miter.hasNext()) {
					Message mdef=(Message)miter.next();
					
					if (mdef.getInformationType() != null) {
						String type=mdef.getInformationType().getFullyQualifiedType();
						
						if (CheckNOthersUtil.isSet(type) == false) {
							type = mdef.getInformationType().getFullyQualifiedElement();
						}		
						
						if (reqFound == false && type != null &&
								mdef.getClassification() == MessageTypeEnumByInteraction.REQUEST &&
								type.equals(requestType)) {
							reqFound = true;
						} else if (respFound == false && type != null &&
								mdef.getClassification() == MessageTypeEnumByInteraction.RESPONSE &&
								type.equals(responseType)) {
							respFound = true;
						}
					}
				}

				if (reqFound && respFound) {
					ret.add(op);
				}
			}
		}
		
		return(ret);
	}	
	
	public boolean isServiceProvider() {
		return(m_serviceProvider);
	}
	
	public void setServiceProvider(boolean provider) {
		m_serviceProvider = provider;
	}
	
	public boolean isServiceClient() {
		return(m_serviceClient);
	}

	public void setServiceClient(boolean client) {
		m_serviceClient = client;
	}
	
//	public java.util.List getNotificationDefinitions(String name, String type) {
//		java.util.Vector ret = new java.util.Vector();
//
//		Iterator iter = null;
//
//		if (m_messageTypeCache != null) {
//			java.util.List list = (java.util.List) m_messageTypeCache.get(type);
//			if (list != null) {
//				iter = list.iterator();
//			}
//		} else {
//			iter = getOperations().iterator();
//		}
//
//		while (iter != null && iter.hasNext()) {
//			OperationOfWSDL op = (OperationOfWSDL) iter.next();
//
//			if (logger.isLoggable(java.util.logging.Level.FINE)) {
//				logger.fine("Check opdef=" + op);
//			}
//
//			if ((name == null || op.getOperationName().equals(name))
//					&& op.getMessages().size() == 1) {
//				Message mdef = (Message) op
//						.getMessages().get(0);
//
////				if (mdef.getClassification() == MessageClassification.NOTIFICATION
////						&& mdef.getInformationType() != null) {
////					String fqtype = mdef.getInformationType()
////							.getFullyQualifiedType();
////
////					if (NamesUtil.isSet(fqtype) == false) {
////						fqtype = mdef.getInformationType()
////								.getFullyQualifiedElement();
////					}
////
////					if (type == null || fqtype.equals(type)) {
////						if (logger.isLoggable(java.util.logging.Level.FINE)) {
////							logger.fine("Notification found");
////						}
////						ret.add(op);
////					}
////				}
//			}
//		}
//
//		return (ret);
//	}
	
	private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.orchestra.impl");	

    private String m_cachedQName=null;
    private boolean m_enableFQNCaching=false;
    private boolean m_serviceProvider=false;
    private boolean m_serviceClient=false;
    private java.util.Map m_messageTypeCache=null;

} //InterfaceOfGroupImpl
