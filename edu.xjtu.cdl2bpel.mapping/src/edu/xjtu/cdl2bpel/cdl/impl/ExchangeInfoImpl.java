/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExchangeInfoImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.InfoOrChannel;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Exchange Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getType <em>Type</em>}
 * </li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getAction <em>Action
 * </em>}</li>
 * <li>
 * {@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getSendRecordReference
 * <em>Send Record Reference</em>}</li>
 * <li>
 * {@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getReceiveRecordReference
 * <em>Receive Record Reference</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getFaultName <em>Fault
 * Name</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getSendVariable <em>
 * Send Variable</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getSendVariablePart
 * <em>Send Variable Part</em>}</li>
 * <li>
 * {@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getCauseExceptionOfSend
 * <em>Cause Exception Of Send</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getReceiveVariable
 * <em>Receive Variable</em>}</li>
 * <li>
 * {@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getReceiveVariablePart
 * <em>Receive Variable Part</em>}</li>
 * <li>
 * {@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl#getCauseExceptionOfReceive
 * <em>Cause Exception Of Receive</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ExchangeInfoImpl extends CDLElementImpl implements ExchangeInfo {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InfoOrChannel type;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionTypeEnumByExchangeInfo ACTION_EDEFAULT = ActionTypeEnumByExchangeInfo.REQUEST;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionTypeEnumByExchangeInfo action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendRecordReference()
	 * <em>Send Record Reference</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSendRecordReference()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordElementInfo> sendRecordReference;

	/**
	 * The cached value of the '{@link #getReceiveRecordReference()
	 * <em>Receive Record Reference</em>}' reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getReceiveRecordReference()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordElementInfo> receiveRecordReference;

	/**
	 * The default value of the '{@link #getFaultName() <em>Fault Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultName() <em>Fault Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected String faultName = FAULT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendVariable()
	 * <em>Send Variable</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSendVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable sendVariable;

	/**
	 * The default value of the '{@link #getSendVariablePart()
	 * <em>Send Variable Part</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSendVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendVariablePart()
	 * <em>Send Variable Part</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSendVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String sendVariablePart = SEND_VARIABLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getCauseExceptionOfSend()
	 * <em>Cause Exception Of Send</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCauseExceptionOfSend()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EXCEPTION_OF_SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCauseExceptionOfSend()
	 * <em>Cause Exception Of Send</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCauseExceptionOfSend()
	 * @generated
	 * @ordered
	 */
	protected String causeExceptionOfSend = CAUSE_EXCEPTION_OF_SEND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceiveVariable()
	 * <em>Receive Variable</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceiveVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable receiveVariable;

	/**
	 * The default value of the '{@link #getReceiveVariablePart()
	 * <em>Receive Variable Part</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceiveVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVE_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveVariablePart()
	 * <em>Receive Variable Part</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceiveVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String receiveVariablePart = RECEIVE_VARIABLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getCauseExceptionOfReceive()
	 * <em>Cause Exception Of Receive</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCauseExceptionOfReceive()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EXCEPTION_OF_RECEIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCauseExceptionOfReceive()
	 * <em>Cause Exception Of Receive</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCauseExceptionOfReceive()
	 * @generated
	 * @ordered
	 */
	protected String causeExceptionOfReceive = CAUSE_EXCEPTION_OF_RECEIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExchangeInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.EXCHANGE_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InfoOrChannel getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (InfoOrChannel) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.EXCHANGE_INFO__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InfoOrChannel basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(InfoOrChannel newType) {
		InfoOrChannel oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionTypeEnumByExchangeInfo getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAction(ActionTypeEnumByExchangeInfo newAction) {
		ActionTypeEnumByExchangeInfo oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RecordElementInfo> getSendRecordReference() {
		if (sendRecordReference == null) {
			sendRecordReference = new EObjectResolvingEList<RecordElementInfo>(
					RecordElementInfo.class, this,
					CDLPackage.EXCHANGE_INFO__SEND_RECORD_REFERENCE);
		}
		return sendRecordReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RecordElementInfo> getReceiveRecordReference() {
		if (receiveRecordReference == null) {
			receiveRecordReference = new EObjectResolvingEList<RecordElementInfo>(
					RecordElementInfo.class, this,
					CDLPackage.EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE);
		}
		return receiveRecordReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFaultName() {
		return faultName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFaultName(String newFaultName) {
		String oldFaultName = faultName;
		faultName = newFaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__FAULT_NAME, oldFaultName,
					faultName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable getSendVariable() {
		if (sendVariable != null && sendVariable.eIsProxy()) {
			InternalEObject oldSendVariable = (InternalEObject) sendVariable;
			sendVariable = (Variable) eResolveProxy(oldSendVariable);
			if (sendVariable != oldSendVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.EXCHANGE_INFO__SEND_VARIABLE,
							oldSendVariable, sendVariable));
			}
		}
		return sendVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable basicGetSendVariable() {
		return sendVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSendVariable(Variable newSendVariable) {
		Variable oldSendVariable = sendVariable;
		sendVariable = newSendVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__SEND_VARIABLE, oldSendVariable,
					sendVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSendVariablePart() {
		return sendVariablePart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSendVariablePart(String newSendVariablePart) {
		String oldSendVariablePart = sendVariablePart;
		sendVariablePart = newSendVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__SEND_VARIABLE_PART,
					oldSendVariablePart, sendVariablePart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCauseExceptionOfSend() {
		return causeExceptionOfSend;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCauseExceptionOfSend(String newCauseExceptionOfSend) {
		String oldCauseExceptionOfSend = causeExceptionOfSend;
		causeExceptionOfSend = newCauseExceptionOfSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND,
					oldCauseExceptionOfSend, causeExceptionOfSend));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable getReceiveVariable() {
		if (receiveVariable != null && receiveVariable.eIsProxy()) {
			InternalEObject oldReceiveVariable = (InternalEObject) receiveVariable;
			receiveVariable = (Variable) eResolveProxy(oldReceiveVariable);
			if (receiveVariable != oldReceiveVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE,
							oldReceiveVariable, receiveVariable));
			}
		}
		return receiveVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable basicGetReceiveVariable() {
		return receiveVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReceiveVariable(Variable newReceiveVariable) {
		Variable oldReceiveVariable = receiveVariable;
		receiveVariable = newReceiveVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE,
					oldReceiveVariable, receiveVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getReceiveVariablePart() {
		return receiveVariablePart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReceiveVariablePart(String newReceiveVariablePart) {
		String oldReceiveVariablePart = receiveVariablePart;
		receiveVariablePart = newReceiveVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE_PART,
					oldReceiveVariablePart, receiveVariablePart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCauseExceptionOfReceive() {
		return causeExceptionOfReceive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCauseExceptionOfReceive(String newCauseExceptionOfReceive) {
		String oldCauseExceptionOfReceive = causeExceptionOfReceive;
		causeExceptionOfReceive = newCauseExceptionOfReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE,
					oldCauseExceptionOfReceive, causeExceptionOfReceive));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDLPackage.EXCHANGE_INFO__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case CDLPackage.EXCHANGE_INFO__ACTION:
			return getAction();
		case CDLPackage.EXCHANGE_INFO__SEND_RECORD_REFERENCE:
			return getSendRecordReference();
		case CDLPackage.EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE:
			return getReceiveRecordReference();
		case CDLPackage.EXCHANGE_INFO__FAULT_NAME:
			return getFaultName();
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE:
			if (resolve)
				return getSendVariable();
			return basicGetSendVariable();
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE_PART:
			return getSendVariablePart();
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND:
			return getCauseExceptionOfSend();
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE:
			if (resolve)
				return getReceiveVariable();
			return basicGetReceiveVariable();
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE_PART:
			return getReceiveVariablePart();
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE:
			return getCauseExceptionOfReceive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CDLPackage.EXCHANGE_INFO__TYPE:
			setType((InfoOrChannel) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__ACTION:
			setAction((ActionTypeEnumByExchangeInfo) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_RECORD_REFERENCE:
			getSendRecordReference().clear();
			getSendRecordReference().addAll(
					(Collection<? extends RecordElementInfo>) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE:
			getReceiveRecordReference().clear();
			getReceiveRecordReference().addAll(
					(Collection<? extends RecordElementInfo>) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__FAULT_NAME:
			setFaultName((String) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE:
			setSendVariable((Variable) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE_PART:
			setSendVariablePart((String) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND:
			setCauseExceptionOfSend((String) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE:
			setReceiveVariable((Variable) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE_PART:
			setReceiveVariablePart((String) newValue);
			return;
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE:
			setCauseExceptionOfReceive((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CDLPackage.EXCHANGE_INFO__TYPE:
			setType((InfoOrChannel) null);
			return;
		case CDLPackage.EXCHANGE_INFO__ACTION:
			setAction(ACTION_EDEFAULT);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_RECORD_REFERENCE:
			getSendRecordReference().clear();
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE:
			getReceiveRecordReference().clear();
			return;
		case CDLPackage.EXCHANGE_INFO__FAULT_NAME:
			setFaultName(FAULT_NAME_EDEFAULT);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE:
			setSendVariable((Variable) null);
			return;
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE_PART:
			setSendVariablePart(SEND_VARIABLE_PART_EDEFAULT);
			return;
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND:
			setCauseExceptionOfSend(CAUSE_EXCEPTION_OF_SEND_EDEFAULT);
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE:
			setReceiveVariable((Variable) null);
			return;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE_PART:
			setReceiveVariablePart(RECEIVE_VARIABLE_PART_EDEFAULT);
			return;
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE:
			setCauseExceptionOfReceive(CAUSE_EXCEPTION_OF_RECEIVE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CDLPackage.EXCHANGE_INFO__TYPE:
			return type != null;
		case CDLPackage.EXCHANGE_INFO__ACTION:
			return action != ACTION_EDEFAULT;
		case CDLPackage.EXCHANGE_INFO__SEND_RECORD_REFERENCE:
			return sendRecordReference != null
					&& !sendRecordReference.isEmpty();
		case CDLPackage.EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE:
			return receiveRecordReference != null
					&& !receiveRecordReference.isEmpty();
		case CDLPackage.EXCHANGE_INFO__FAULT_NAME:
			return FAULT_NAME_EDEFAULT == null ? faultName != null
					: !FAULT_NAME_EDEFAULT.equals(faultName);
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE:
			return sendVariable != null;
		case CDLPackage.EXCHANGE_INFO__SEND_VARIABLE_PART:
			return SEND_VARIABLE_PART_EDEFAULT == null ? sendVariablePart != null
					: !SEND_VARIABLE_PART_EDEFAULT.equals(sendVariablePart);
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND:
			return CAUSE_EXCEPTION_OF_SEND_EDEFAULT == null ? causeExceptionOfSend != null
					: !CAUSE_EXCEPTION_OF_SEND_EDEFAULT
							.equals(causeExceptionOfSend);
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE:
			return receiveVariable != null;
		case CDLPackage.EXCHANGE_INFO__RECEIVE_VARIABLE_PART:
			return RECEIVE_VARIABLE_PART_EDEFAULT == null ? receiveVariablePart != null
					: !RECEIVE_VARIABLE_PART_EDEFAULT
							.equals(receiveVariablePart);
		case CDLPackage.EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE:
			return CAUSE_EXCEPTION_OF_RECEIVE_EDEFAULT == null ? causeExceptionOfReceive != null
					: !CAUSE_EXCEPTION_OF_RECEIVE_EDEFAULT
							.equals(causeExceptionOfReceive);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (action: ");
		result.append(action);
		result.append(", faultName: ");
		result.append(faultName);
		result.append(", sendVariablePart: ");
		result.append(sendVariablePart);
		result.append(", causeExceptionOfSend: ");
		result.append(causeExceptionOfSend);
		result.append(", receiveVariablePart: ");
		result.append(receiveVariablePart);
		result.append(", causeExceptionOfReceive: ");
		result.append(causeExceptionOfReceive);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem
	 *            the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(CDLElemNameConstants.EXCHANGE_ELEM_NAME)) {
			String actionType = elem.attributeValue("action");
			setName(elem.attributeValue("name"));
			setAction(getEnumType(actionType));
			setFaultName(elem.attributeValue("faultName"));
			Package thePackage = getBelongedPackage();
			InfoOrChannel type = null;

			String informationTypeValue = elem
					.attributeValue("informationType");
			String channelTypeValue = elem.attributeValue("channelType");
			if (informationTypeValue != null) {
				type = CDLPackageUtil.getInformationType(thePackage,
						informationTypeValue);
			} else {
				type = CDLPackageUtil.getChannelType(thePackage,
						channelTypeValue);
			}
			setType(type);
		}
		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
		doSomething();
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement
	 * 
	 * @param elem
	 *            the XML segment of CDLElement
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if (elem.getName().equals("send")) {
			this.setCauseExceptionOfSend(elem.attributeValue("causeException"));
			String str = elem.attributeValue("variable");

			XPathContext xpcontext = DefaultXPathContext.createContext(this,
					this.getBelongedChoreography());
			ValidationResult sendRes = XPathValidator.validateVariable(
					xpcontext, str, getRoleTypesMatrixFromTheContext(), false);

			if (sendRes != null && sendRes.getVariable() != null) {
				setSendVariable(sendRes.getVariable());
				if (sendRes.getPartName() != null) {
					setSendVariablePart(sendRes.getPartName());
				}
			}

			sendRecordReferencesName = elem.attributeValue("recordReference");
		} else if (elem.getName().equals("receive")) {
			this.setCauseExceptionOfReceive(elem
					.attributeValue("causeException"));
			String str = elem.attributeValue("variable");
			XPathContext xpcontext = DefaultXPathContext.createContext(this,
					this.getBelongedChoreography());
			ValidationResult receiveRes = XPathValidator.validateVariable(
					xpcontext, str, getRoleTypesMatrixFromTheContext(), false);

			if (receiveRes != null && receiveRes.getVariable() != null) {
				setReceiveVariable(receiveRes.getVariable());
				if (receiveRes.getPartName() != null) {
					setReceiveVariablePart(receiveRes.getPartName());
				}
			}
			
			recvRecordReferencesName = elem.attributeValue("recordReference");
		}

		return cdlElement;
	}

	public ActionTypeEnumByExchangeInfo getEnumType(String str) {
		ActionTypeEnumByExchangeInfo ret = null;
		ActionTypeEnumByExchangeInfo[] values = ActionTypeEnumByExchangeInfo
				.values();
		for (ActionTypeEnumByExchangeInfo theValue : values) {
			if (theValue.getLiteral().equalsIgnoreCase(str)) {
				ret = theValue;
			}
		}
		return ret;
	}

	/**
	 * Return the interaction activity which Current ExchangeInfo belongs to.
	 * 
	 * @return the interaction activity which Current ExchangeInfo belongs to
	 */
	public Interaction getBelongedInteraction() {
		Interaction ret = null;

		if (eContainer() instanceof Interaction) {
			ret = (Interaction) eContainer();
		}

		return (ret);
	}

	/**
	 * Initial RecordReference attribute of ExchangeInfo,new RecordElements by
	 * RecordReference attribute and add them into RecordElements List of
	 * ExchangeInfo.
	 * 
	 * @param refs
	 *            the String value of RecordReference attribute
	 * @param list
	 *            RecordReference Container of ExchangeInfo
	 */
	protected void initRecordRefs(String refs, java.util.List list) {

		java.util.StringTokenizer st = new java.util.StringTokenizer(refs, " ");

		Interaction interaction = this.getBelongedInteraction();

		if (interaction != null) {

			while (st.hasMoreTokens()) {
				String ref = st.nextToken();
				RecordElementInfo rec = interaction.getRecordElementInfo(ref);

				// Find record details reference in this interaction
				if (rec == null) {
				} else {
					list.add(rec);
				}
			}
		}
	}

	/**
	 * Used for initializing attribute values of CDLElement when parsing CDL
	 * document If a cdlElement attribute reference another cdlElement which is
	 * defined in the following XML segment,we must set attribute of the
	 * referenced cdlElement,then after the referenced cdlElement be parsing and
	 * recognized,we set the referenced cdlElement value in real of the
	 * cdlElement.
	 */
	public void doSomething() {
		if (sendRecordReferencesName != null) {

			initRecordRefs(sendRecordReferencesName, this
					.getSendRecordReference());
		}

		if (recvRecordReferencesName != null) {

			initRecordRefs(recvRecordReferencesName,
					getReceiveRecordReference());
		}
	}

	
	private String sendRecordReferencesName = null;
	private String recvRecordReferencesName = null;
} // ExchangeInfoImpl
