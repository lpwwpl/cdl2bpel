/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeMatrixImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeMatrixImpl extends CDLElementImpl implements RoleTypeMatrix {
	/**
	 * The cached value of the '{@link #getRoleTypes() <em>Role Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> roleTypes;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FREE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected Boolean free = FREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ROLE_TYPE_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRoleTypes() {
		if (roleTypes == null) {
			roleTypes = new EObjectResolvingEList<RoleType>(RoleType.class, this, CDLPackage.ROLE_TYPE_MATRIX__ROLE_TYPES);
		}
		return roleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(Boolean newFree) {
		Boolean oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE_MATRIX__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.ROLE_TYPE_MATRIX__ROLE_TYPES:
				return getRoleTypes();
			case CDLPackage.ROLE_TYPE_MATRIX__FREE:
				return getFree();
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
			case CDLPackage.ROLE_TYPE_MATRIX__ROLE_TYPES:
				getRoleTypes().clear();
				getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
				return;
			case CDLPackage.ROLE_TYPE_MATRIX__FREE:
				setFree((Boolean)newValue);
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
			case CDLPackage.ROLE_TYPE_MATRIX__ROLE_TYPES:
				getRoleTypes().clear();
				return;
			case CDLPackage.ROLE_TYPE_MATRIX__FREE:
				setFree(FREE_EDEFAULT);
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
			case CDLPackage.ROLE_TYPE_MATRIX__ROLE_TYPES:
				return roleTypes != null && !roleTypes.isEmpty();
			case CDLPackage.ROLE_TYPE_MATRIX__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
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
		result.append(" (free: ");
		result.append(free);
		result.append(')');
		return result.toString();
	}

} //RoleTypeMatrixImpl
