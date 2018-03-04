/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeMatrixBindInfoImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type Matrix Bind Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl#getThisRoleTypeMatrix <em>This Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl#getFreeRoleTypeMatrix <em>Free Role Type Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeMatrixBindInfoImpl extends CDLElementImpl implements RoleTypeMatrixBindInfo {
	/**
	 * The cached value of the '{@link #getThisRoleTypeMatrix() <em>This Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThisRoleTypeMatrix()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeMatrix thisRoleTypeMatrix;

	/**
	 * The cached value of the '{@link #getFreeRoleTypeMatrix() <em>Free Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeRoleTypeMatrix()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeMatrix freeRoleTypeMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeMatrixBindInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ROLE_TYPE_MATRIX_BIND_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix getThisRoleTypeMatrix() {
		if (thisRoleTypeMatrix != null && thisRoleTypeMatrix.eIsProxy()) {
			InternalEObject oldThisRoleTypeMatrix = (InternalEObject)thisRoleTypeMatrix;
			thisRoleTypeMatrix = (RoleTypeMatrix)eResolveProxy(oldThisRoleTypeMatrix);
			if (thisRoleTypeMatrix != oldThisRoleTypeMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX, oldThisRoleTypeMatrix, thisRoleTypeMatrix));
			}
		}
		return thisRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix basicGetThisRoleTypeMatrix() {
		return thisRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThisRoleTypeMatrix(RoleTypeMatrix newThisRoleTypeMatrix) {
		RoleTypeMatrix oldThisRoleTypeMatrix = thisRoleTypeMatrix;
		thisRoleTypeMatrix = newThisRoleTypeMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX, oldThisRoleTypeMatrix, thisRoleTypeMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix getFreeRoleTypeMatrix() {
		if (freeRoleTypeMatrix != null && freeRoleTypeMatrix.eIsProxy()) {
			InternalEObject oldFreeRoleTypeMatrix = (InternalEObject)freeRoleTypeMatrix;
			freeRoleTypeMatrix = (RoleTypeMatrix)eResolveProxy(oldFreeRoleTypeMatrix);
			if (freeRoleTypeMatrix != oldFreeRoleTypeMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX, oldFreeRoleTypeMatrix, freeRoleTypeMatrix));
			}
		}
		return freeRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix basicGetFreeRoleTypeMatrix() {
		return freeRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeRoleTypeMatrix(RoleTypeMatrix newFreeRoleTypeMatrix) {
		RoleTypeMatrix oldFreeRoleTypeMatrix = freeRoleTypeMatrix;
		freeRoleTypeMatrix = newFreeRoleTypeMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX, oldFreeRoleTypeMatrix, freeRoleTypeMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX:
				if (resolve) return getThisRoleTypeMatrix();
				return basicGetThisRoleTypeMatrix();
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX:
				if (resolve) return getFreeRoleTypeMatrix();
				return basicGetFreeRoleTypeMatrix();
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
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX:
				setThisRoleTypeMatrix((RoleTypeMatrix)newValue);
				return;
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX:
				setFreeRoleTypeMatrix((RoleTypeMatrix)newValue);
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
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX:
				setThisRoleTypeMatrix((RoleTypeMatrix)null);
				return;
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX:
				setFreeRoleTypeMatrix((RoleTypeMatrix)null);
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
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX:
				return thisRoleTypeMatrix != null;
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX:
				return freeRoleTypeMatrix != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleTypeMatrixBindInfoImpl
