/**
 * CDL2BPEL_XJTU
 *
 * $Id: OnAlarmImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.OnAlarm;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl#getTimeToComplete <em>Time To Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl#getTimeoutActivityTypes <em>Timeout Activity Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnAlarmImpl extends BPOrderingStruturalActivityImpl implements OnAlarm {
	/**
	 * The default value of the '{@link #getTimeToComplete() <em>Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_TO_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToComplete() <em>Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToComplete()
	 * @generated
	 * @ordered
	 */
	protected String timeToComplete = TIME_TO_COMPLETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeoutActivityTypes() <em>Timeout Activity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutActivityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BPActivity> timeoutActivityTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.ON_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeToComplete() {
		return timeToComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToComplete(String newTimeToComplete) {
		String oldTimeToComplete = timeToComplete;
		timeToComplete = newTimeToComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.ON_ALARM__TIME_TO_COMPLETE, oldTimeToComplete, timeToComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPActivity> getTimeoutActivityTypes() {
		if (timeoutActivityTypes == null) {
			timeoutActivityTypes = new EObjectContainmentEList<BPActivity>(BPActivity.class, this, OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES);
		}
		return timeoutActivityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES:
				return ((InternalEList<?>)getTimeoutActivityTypes()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.ON_ALARM__TIME_TO_COMPLETE:
				return getTimeToComplete();
			case OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES:
				return getTimeoutActivityTypes();
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
			case OrchestraPackage.ON_ALARM__TIME_TO_COMPLETE:
				setTimeToComplete((String)newValue);
				return;
			case OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES:
				getTimeoutActivityTypes().clear();
				getTimeoutActivityTypes().addAll((Collection<? extends BPActivity>)newValue);
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
			case OrchestraPackage.ON_ALARM__TIME_TO_COMPLETE:
				setTimeToComplete(TIME_TO_COMPLETE_EDEFAULT);
				return;
			case OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES:
				getTimeoutActivityTypes().clear();
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
			case OrchestraPackage.ON_ALARM__TIME_TO_COMPLETE:
				return TIME_TO_COMPLETE_EDEFAULT == null ? timeToComplete != null : !TIME_TO_COMPLETE_EDEFAULT.equals(timeToComplete);
			case OrchestraPackage.ON_ALARM__TIMEOUT_ACTIVITY_TYPES:
				return timeoutActivityTypes != null && !timeoutActivityTypes.isEmpty();
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
		result.append(" (timeToComplete: ");
		result.append(timeToComplete);
		result.append(')');
		return result.toString();
	}

} //OnAlarmImpl
