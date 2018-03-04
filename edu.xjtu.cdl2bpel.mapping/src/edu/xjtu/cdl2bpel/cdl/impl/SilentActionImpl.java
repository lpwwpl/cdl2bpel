/**
 * CDL2BPEL_XJTU
 *
 * $Id: SilentActionImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.SilentAction;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Silent Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilentActionImpl extends ActivityImpl implements SilentAction {
	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SilentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.SILENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleType() {
		if (roleType != null && roleType.eIsProxy()) {
			InternalEObject oldRoleType = (InternalEObject)roleType;
			roleType = (RoleType)eResolveProxy(oldRoleType);
			if (roleType != oldRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.SILENT_ACTION__ROLE_TYPE, oldRoleType, roleType));
			}
		}
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleType() {
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(RoleType newRoleType) {
		RoleType oldRoleType = roleType;
		roleType = newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.SILENT_ACTION__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.SILENT_ACTION__ROLE_TYPE:
				if (resolve) return getRoleType();
				return basicGetRoleType();
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
			case CDLPackage.SILENT_ACTION__ROLE_TYPE:
				setRoleType((RoleType)newValue);
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
			case CDLPackage.SILENT_ACTION__ROLE_TYPE:
				setRoleType((RoleType)null);
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
			case CDLPackage.SILENT_ACTION__ROLE_TYPE:
				return roleType != null;
		}
		return super.eIsSet(featureID);
	}

	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.SILENTACTION_ELEM_NAME)) {
			String roleTypeValue = elem.attributeValue("roleType");
			if(roleTypeValue!=null) {
				RoleType roleType = CDLPackageUtil.getRoleType(
						getBelongedPackage(), roleTypeValue);
				setRoleType(roleType);
			}
		}
	}
} //SilentActionImpl
