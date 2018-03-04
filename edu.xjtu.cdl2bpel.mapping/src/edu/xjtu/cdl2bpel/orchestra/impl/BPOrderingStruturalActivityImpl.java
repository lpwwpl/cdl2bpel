/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPOrderingStruturalActivityImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Ordering Strutural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrderingStruturalActivityImpl#getActivityTypes <em>Activity Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BPOrderingStruturalActivityImpl extends BPActivityImpl implements BPOrderingStruturalActivity {
	/**
	 * The cached value of the '{@link #getActivityTypes() <em>Activity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BPActivity> activityTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPOrderingStruturalActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.BP_ORDERING_STRUTURAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPActivity> getActivityTypes() {
		if (activityTypes == null) {
			activityTypes = new EObjectContainmentEList<BPActivity>(BPActivity.class, this, OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES);
		}
		return activityTypes;
	}

	public void setActivityTypes(EList<BPActivity> activities) {
		activityTypes = activities;
//		if (activityTypes == null) {
//			activityTypes = new EObjectContainmentEList<BPActivity>(BPActivity.class, this, OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES);
//		}
//		return activityTypes;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES:
				return ((InternalEList<?>)getActivityTypes()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES:
				return getActivityTypes();
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
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES:
				getActivityTypes().clear();
				getActivityTypes().addAll((Collection<? extends BPActivity>)newValue);
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
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES:
				getActivityTypes().clear();
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
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES:
				return activityTypes != null && !activityTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public boolean isConditionalGroupingConstruct() {//Ö»ÓÐConditionalImpl·µ»Øtrue
		return(false);
	}
	public boolean isSequentialGroupingConstruct() {
		return(true);
	}	public boolean isConditionObservable() {
		return(false);
	}

} //BPOrderingStruturalActivityImpl
