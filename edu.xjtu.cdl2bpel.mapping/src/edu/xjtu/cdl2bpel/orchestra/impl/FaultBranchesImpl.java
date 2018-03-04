/**
 * CDL2BPEL_XJTU
 *
 * $Id: FaultBranchesImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.FaultBranches;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Branches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl#getFaultVariable <em>Fault Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl#getFaultType <em>Fault Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultBranchesImpl extends BPActivityImpl implements FaultBranches {
	/**
	 * The default value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultVariable() <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultVariable()
	 * @generated
	 * @ordered
	 */
	protected String faultVariable = FAULT_VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected BPActivity activities;

	/**
	 * The default value of the '{@link #getFaultType() <em>Fault Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultType()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultType() <em>Fault Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultType()
	 * @generated
	 * @ordered
	 */
	protected String faultType = FAULT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultBranchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.FAULT_BRANCHES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultVariable() {
		return faultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultVariable(String newFaultVariable) {
		String oldFaultVariable = faultVariable;
		faultVariable = newFaultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.FAULT_BRANCHES__FAULT_VARIABLE, oldFaultVariable, faultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPActivity getActivities() {
		if (activities != null && activities.eIsProxy()) {
			InternalEObject oldActivities = (InternalEObject)activities;
			activities = (BPActivity)eResolveProxy(oldActivities);
			if (activities != oldActivities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.FAULT_BRANCHES__ACTIVITIES, oldActivities, activities));
			}
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPActivity basicGetActivities() {
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivities(BPActivity newActivities) {
		BPActivity oldActivities = activities;
		activities = newActivities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.FAULT_BRANCHES__ACTIVITIES, oldActivities, activities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultType() {
		return faultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultType(String newFaultType) {
		String oldFaultType = faultType;
		faultType = newFaultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.FAULT_BRANCHES__FAULT_TYPE, oldFaultType, faultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.FAULT_BRANCHES__FAULT_VARIABLE:
				return getFaultVariable();
			case OrchestraPackage.FAULT_BRANCHES__ACTIVITIES:
				if (resolve) return getActivities();
				return basicGetActivities();
			case OrchestraPackage.FAULT_BRANCHES__FAULT_TYPE:
				return getFaultType();
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
			case OrchestraPackage.FAULT_BRANCHES__FAULT_VARIABLE:
				setFaultVariable((String)newValue);
				return;
			case OrchestraPackage.FAULT_BRANCHES__ACTIVITIES:
				setActivities((BPActivity)newValue);
				return;
			case OrchestraPackage.FAULT_BRANCHES__FAULT_TYPE:
				setFaultType((String)newValue);
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
			case OrchestraPackage.FAULT_BRANCHES__FAULT_VARIABLE:
				setFaultVariable(FAULT_VARIABLE_EDEFAULT);
				return;
			case OrchestraPackage.FAULT_BRANCHES__ACTIVITIES:
				setActivities((BPActivity)null);
				return;
			case OrchestraPackage.FAULT_BRANCHES__FAULT_TYPE:
				setFaultType(FAULT_TYPE_EDEFAULT);
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
			case OrchestraPackage.FAULT_BRANCHES__FAULT_VARIABLE:
				return FAULT_VARIABLE_EDEFAULT == null ? faultVariable != null : !FAULT_VARIABLE_EDEFAULT.equals(faultVariable);
			case OrchestraPackage.FAULT_BRANCHES__ACTIVITIES:
				return activities != null;
			case OrchestraPackage.FAULT_BRANCHES__FAULT_TYPE:
				return FAULT_TYPE_EDEFAULT == null ? faultType != null : !FAULT_TYPE_EDEFAULT.equals(faultType);
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
		result.append(" (faultVariable: ");
		result.append(faultVariable);
		result.append(", faultType: ");
		result.append(faultType);
		result.append(')');
		return result.toString();
	}

} //FaultBranchesImpl
