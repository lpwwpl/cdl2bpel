/**
 * CDL2BPEL_XJTU
 *
 * $Id: SendByExchangeImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.SendByExchange;
import edu.xjtu.cdl2bpel.cdl.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send By Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl#getSendVariable <em>Send Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl#getSendVariablePart <em>Send Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl#getSendCaseException <em>Send Case Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendByExchangeImpl extends CDLElementImpl implements SendByExchange {
	/**
	 * The cached value of the '{@link #getSendVariable() <em>Send Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable sendVariable;

	/**
	 * The default value of the '{@link #getSendVariablePart() <em>Send Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendVariablePart() <em>Send Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String sendVariablePart = SEND_VARIABLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendCaseException() <em>Send Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendCaseException()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_CASE_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendCaseException() <em>Send Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendCaseException()
	 * @generated
	 * @ordered
	 */
	protected String sendCaseException = SEND_CASE_EXCEPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendByExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.SEND_BY_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSendVariable() {
		if (sendVariable != null && sendVariable.eIsProxy()) {
			InternalEObject oldSendVariable = (InternalEObject)sendVariable;
			sendVariable = (Variable)eResolveProxy(oldSendVariable);
			if (sendVariable != oldSendVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE, oldSendVariable, sendVariable));
			}
		}
		return sendVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSendVariable() {
		return sendVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendVariable(Variable newSendVariable) {
		Variable oldSendVariable = sendVariable;
		sendVariable = newSendVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE, oldSendVariable, sendVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendVariablePart() {
		return sendVariablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendVariablePart(String newSendVariablePart) {
		String oldSendVariablePart = sendVariablePart;
		sendVariablePart = newSendVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE_PART, oldSendVariablePart, sendVariablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSendCaseException() {
		return sendCaseException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendCaseException(String newSendCaseException) {
		String oldSendCaseException = sendCaseException;
		sendCaseException = newSendCaseException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION, oldSendCaseException, sendCaseException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE:
				if (resolve) return getSendVariable();
				return basicGetSendVariable();
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE_PART:
				return getSendVariablePart();
			case CDLPackage.SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION:
				return getSendCaseException();
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
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE:
				setSendVariable((Variable)newValue);
				return;
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE_PART:
				setSendVariablePart((String)newValue);
				return;
			case CDLPackage.SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION:
				setSendCaseException((String)newValue);
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
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE:
				setSendVariable((Variable)null);
				return;
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE_PART:
				setSendVariablePart(SEND_VARIABLE_PART_EDEFAULT);
				return;
			case CDLPackage.SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION:
				setSendCaseException(SEND_CASE_EXCEPTION_EDEFAULT);
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
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE:
				return sendVariable != null;
			case CDLPackage.SEND_BY_EXCHANGE__SEND_VARIABLE_PART:
				return SEND_VARIABLE_PART_EDEFAULT == null ? sendVariablePart != null : !SEND_VARIABLE_PART_EDEFAULT.equals(sendVariablePart);
			case CDLPackage.SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION:
				return SEND_CASE_EXCEPTION_EDEFAULT == null ? sendCaseException != null : !SEND_CASE_EXCEPTION_EDEFAULT.equals(sendCaseException);
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
		result.append(" (sendVariablePart: ");
		result.append(sendVariablePart);
		result.append(", sendCaseException: ");
		result.append(sendCaseException);
		result.append(')');
		return result.toString();
	}

} //SendByExchangeImpl
