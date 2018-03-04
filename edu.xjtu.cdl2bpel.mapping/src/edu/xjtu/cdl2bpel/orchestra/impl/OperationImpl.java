/**
 * CDL2BPEL_XJTU
 *
 * $Id: OperationImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.Operation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.OperationImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BPElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, OrchestraPackage.OPERATION__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.OPERATION__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.OPERATION__MESSAGES:
				return getMessages();
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
			case OrchestraPackage.OPERATION__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
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
			case OrchestraPackage.OPERATION__MESSAGES:
				getMessages().clear();
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
			case OrchestraPackage.OPERATION__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public Message getRequest() {
		Message ret=null;
		
		Iterator iter = getMessages().iterator();
		while (ret == null && iter.hasNext()) {
			Message m=(Message)iter.next();
			if (m.getClassification() ==  MessageTypeEnumByInteraction.REQUEST &&
					isSet(m.getFaultName()) == false) {
				ret = m;
			}
		}
		
		return(ret);
	}		
	
	public Message getResponse() {
		Message ret=null;
		
		Iterator iter=getMessages().iterator();
		while (ret == null && iter.hasNext()) {
			Message m=(Message)iter.next();
			if (m.getClassification() == MessageTypeEnumByInteraction.RESPONSE &&
					isSet(m.getFaultName()) == false) {
				ret = m;
			}
		}
		
		return(ret);
	}
	
	public java.util.List getFaults() {
		java.util.Vector ret=new java.util.Vector();
		
		Iterator iter=getMessages().iterator();
		while (iter.hasNext()) {
			Message m=(Message)iter.next();
			
			if (isSet(m.getFaultName())) {
				ret.add(m);
			}
		}
		
		return(ret);
	}

//	public Message getFault(String faultName) {
//		Message ret=null;
//		
//		Iterator iter=getMessages().iterator();
//		while (ret == null && iter.hasNext()) {
//			Message m=(Message)iter.next();
//			
//			if (m.getFullyQualifiedFaultName() != null &&
//					m.getFullyQualifiedFaultName().equals(faultName)) {
//				ret = m;
//			}
//		}
//		
//		return(ret);
//	}
	
	public InterfaceOfGroup getInterfaceOfGroup() {
		InterfaceOfGroup ret=null;
		
		if (getParent() instanceof InterfaceOfGroup) {
			ret = (InterfaceOfGroup)getParent();
		}
		
		return(ret);
	}
	
	public boolean isSet(String str) {
		if(str == null || str.equals("")) {
			return false;
		}
		return true;
	}
	
	public Message getFault(String faultName) {
		Message ret=null;
		
		Iterator iter=getMessages().iterator();
		while (ret == null && iter.hasNext()) {
			Message m=(Message)iter.next();			
			if (m.getFaultName() != null &&
					m.getFaultName().equals(faultName)) {
				ret = m;
			}
		}
		
		return(ret);
	}

} //OperationImpl
