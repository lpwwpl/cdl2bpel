/**
 * CDL2BPEL_XJTU
 *
 * $Id: PartImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.InformationType;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Part;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PartImpl#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends BPElementImpl implements Part {
	/**
	 * The cached value of the '{@link #getInformationType() <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationType()
	 * @generated
	 * @ordered
	 */
	protected InformationType informationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationType getInformationType() {
		if (informationType != null && informationType.eIsProxy()) {
			InternalEObject oldInformationType = (InternalEObject)informationType;
			informationType = (InformationType)eResolveProxy(oldInformationType);
			if (informationType != oldInformationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.PART__INFORMATION_TYPE, oldInformationType, informationType));
			}
		}
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationType basicGetInformationType() {
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationType(InformationType newInformationType) {
		InformationType oldInformationType = informationType;
		informationType = newInformationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.PART__INFORMATION_TYPE, oldInformationType, informationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.PART__INFORMATION_TYPE:
				if (resolve) return getInformationType();
				return basicGetInformationType();
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
			case OrchestraPackage.PART__INFORMATION_TYPE:
				setInformationType((InformationType)newValue);
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
			case OrchestraPackage.PART__INFORMATION_TYPE:
				setInformationType((InformationType)null);
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
			case OrchestraPackage.PART__INFORMATION_TYPE:
				return informationType != null;
		}
		return super.eIsSet(featureID);
	}

} //PartImpl
