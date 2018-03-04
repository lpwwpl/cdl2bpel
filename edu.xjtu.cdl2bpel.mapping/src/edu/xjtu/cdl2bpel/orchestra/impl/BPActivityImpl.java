/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPActivityImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.CorrelationSet;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl#getCorrelationset <em>Correlationset</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl#getAdditional <em>Additional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BPActivityImpl extends BPElementImpl implements BPActivity {
	/**
	 * The cached value of the '{@link #getCorrelationset() <em>Correlationset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationset()
	 * @generated
	 * @ordered
	 */
	protected CorrelationSet correlationset;

	/**
	 * The default value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditional() <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditional()
	 * @generated
	 * @ordered
	 */
	protected String additional = ADDITIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.BP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet getCorrelationset() {
		if (correlationset != null && correlationset.eIsProxy()) {
			InternalEObject oldCorrelationset = (InternalEObject)correlationset;
			correlationset = (CorrelationSet)eResolveProxy(oldCorrelationset);
			if (correlationset != oldCorrelationset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.BP_ACTIVITY__CORRELATIONSET, oldCorrelationset, correlationset));
			}
		}
		return correlationset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet basicGetCorrelationset() {
		return correlationset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationset(CorrelationSet newCorrelationset) {
		CorrelationSet oldCorrelationset = correlationset;
		correlationset = newCorrelationset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ACTIVITY__CORRELATIONSET, oldCorrelationset, correlationset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdditional() {
		return additional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditional(String newAdditional) {
		String oldAdditional = additional;
		additional = newAdditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ACTIVITY__ADDITIONAL, oldAdditional, additional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.BP_ACTIVITY__CORRELATIONSET:
				if (resolve) return getCorrelationset();
				return basicGetCorrelationset();
			case OrchestraPackage.BP_ACTIVITY__ADDITIONAL:
				return getAdditional();
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
			case OrchestraPackage.BP_ACTIVITY__CORRELATIONSET:
				setCorrelationset((CorrelationSet)newValue);
				return;
			case OrchestraPackage.BP_ACTIVITY__ADDITIONAL:
				setAdditional((String)newValue);
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
			case OrchestraPackage.BP_ACTIVITY__CORRELATIONSET:
				setCorrelationset((CorrelationSet)null);
				return;
			case OrchestraPackage.BP_ACTIVITY__ADDITIONAL:
				setAdditional(ADDITIONAL_EDEFAULT);
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
			case OrchestraPackage.BP_ACTIVITY__CORRELATIONSET:
				return correlationset != null;
			case OrchestraPackage.BP_ACTIVITY__ADDITIONAL:
				return ADDITIONAL_EDEFAULT == null ? additional != null : !ADDITIONAL_EDEFAULT.equals(additional);
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
		result.append(" (additional: ");
		result.append(additional);
		result.append(')');
		return result.toString();
	}

} //BPActivityImpl
