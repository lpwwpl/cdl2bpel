/**
 * CDL2BPEL_XJTU
 *
 * $Id: ReceiveByExchangeImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ReceiveByExchange;
import edu.xjtu.cdl2bpel.cdl.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive By Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl#getReceiveVariable <em>Receive Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl#getReceiveVariablePart <em>Receive Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl#getReceiveCaseException <em>Receive Case Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveByExchangeImpl extends CDLElementImpl implements ReceiveByExchange {
	/**
	 * The cached value of the '{@link #getReceiveVariable() <em>Receive Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable receiveVariable;

	/**
	 * The default value of the '{@link #getReceiveVariablePart() <em>Receive Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveVariablePart() <em>Receive Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String receiveVariablePart = RECEIVE_VARIABLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveCaseException() <em>Receive Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCaseException()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_CASE_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveCaseException() <em>Receive Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveCaseException()
	 * @generated
	 * @ordered
	 */
	protected String receiveCaseException = RECEIVE_CASE_EXCEPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveByExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.RECEIVE_BY_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReceiveVariable() {
		if (receiveVariable != null && receiveVariable.eIsProxy()) {
			InternalEObject oldReceiveVariable = (InternalEObject)receiveVariable;
			receiveVariable = (Variable)eResolveProxy(oldReceiveVariable);
			if (receiveVariable != oldReceiveVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE, oldReceiveVariable, receiveVariable));
			}
		}
		return receiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReceiveVariable() {
		return receiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveVariable(Variable newReceiveVariable) {
		Variable oldReceiveVariable = receiveVariable;
		receiveVariable = newReceiveVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE, oldReceiveVariable, receiveVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiveVariablePart() {
		return receiveVariablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveVariablePart(String newReceiveVariablePart) {
		String oldReceiveVariablePart = receiveVariablePart;
		receiveVariablePart = newReceiveVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART, oldReceiveVariablePart, receiveVariablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceiveCaseException() {
		return receiveCaseException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveCaseException(String newReceiveCaseException) {
		String oldReceiveCaseException = receiveCaseException;
		receiveCaseException = newReceiveCaseException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION, oldReceiveCaseException, receiveCaseException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE:
				if (resolve) return getReceiveVariable();
				return basicGetReceiveVariable();
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART:
				return getReceiveVariablePart();
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION:
				return getReceiveCaseException();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE:
				setReceiveVariable((Variable)newValue);
				return;
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART:
				setReceiveVariablePart((String)newValue);
				return;
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION:
				setReceiveCaseException((String)newValue);
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
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE:
				setReceiveVariable((Variable)null);
				return;
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART:
				setReceiveVariablePart(RECEIVE_VARIABLE_PART_EDEFAULT);
				return;
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION:
				setReceiveCaseException(RECEIVE_CASE_EXCEPTION_EDEFAULT);
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
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE:
				return receiveVariable != null;
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART:
				return RECEIVE_VARIABLE_PART_EDEFAULT == null ? receiveVariablePart != null : !RECEIVE_VARIABLE_PART_EDEFAULT.equals(receiveVariablePart);
			case CDLPackage.RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION:
				return RECEIVE_CASE_EXCEPTION_EDEFAULT == null ? receiveCaseException != null : !RECEIVE_CASE_EXCEPTION_EDEFAULT.equals(receiveCaseException);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (receiveVariablePart: ");
		result.append(receiveVariablePart);
		result.append(", receiveCaseException: ");
		result.append(receiveCaseException);
		result.append(')');
		return result.toString();
	}

} //ReceiveByExchangeImpl
