/**
 * CDL2BPEL_XJTU
 *
 * $Id: ReceiveEndImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiveEndImpl extends CommunicationImpl implements ReceiveEnd {
	/**
	 * The default value of the '{@link #getIsCreatedByPassedChannel() <em>Is Created By Passed Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCreatedByPassedChannel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CREATED_BY_PASSED_CHANNEL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCreatedByPassedChannel() <em>Is Created By Passed Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCreatedByPassedChannel()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCreatedByPassedChannel = IS_CREATED_BY_PASSED_CHANNEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.RECEIVE_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCreatedByPassedChannel() {
		return isCreatedByPassedChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCreatedByPassedChannel(Boolean newIsCreatedByPassedChannel) {
		Boolean oldIsCreatedByPassedChannel = isCreatedByPassedChannel;
		isCreatedByPassedChannel = newIsCreatedByPassedChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL, oldIsCreatedByPassedChannel, isCreatedByPassedChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL:
				return getIsCreatedByPassedChannel();
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
			case OrchestraPackage.RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL:
				setIsCreatedByPassedChannel((Boolean)newValue);
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
			case OrchestraPackage.RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL:
				setIsCreatedByPassedChannel(IS_CREATED_BY_PASSED_CHANNEL_EDEFAULT);
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
			case OrchestraPackage.RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL:
				return IS_CREATED_BY_PASSED_CHANNEL_EDEFAULT == null ? isCreatedByPassedChannel != null : !IS_CREATED_BY_PASSED_CHANNEL_EDEFAULT.equals(isCreatedByPassedChannel);
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
		result.append(" (isCreatedByPassedChannel: ");
		result.append(isCreatedByPassedChannel);
		result.append(')');
		return result.toString();
	}

} //ReceiveEndImpl
