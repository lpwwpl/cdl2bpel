/**
 * CDL2BPEL_XJTU
 *
 * $Id: NoActionImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>No Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoActionImpl extends ActivityImpl implements NoAction {
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
	protected NoActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.NO_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.NO_ACTION__ROLE_TYPE, oldRoleType, roleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.NO_ACTION__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.NO_ACTION__ROLE_TYPE:
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
			case CDLPackage.NO_ACTION__ROLE_TYPE:
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
			case CDLPackage.NO_ACTION__ROLE_TYPE:
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
			case CDLPackage.NO_ACTION__ROLE_TYPE:
				return roleType != null;
		}
		return super.eIsSet(featureID);
	}

	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.NOACTION_ELEM_NAME)) {
			String roleTypeValue = elem.attributeValue("roleType");
			if(roleTypeValue!=null) {
				RoleType roleType = CDLPackageUtil.getRoleType(
						getBelongedPackage(), roleTypeValue);
				setRoleType(roleType);
			}
		}
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret=false;
		if(getRoleType()==null) {
			ret = true;
		} else 
		if (getRoleType() != null && roleType != null) {
			ret = getRoleType().equals(roleType);
			
		} else if (roleType != null) {
			
			// If no role type defined, then must find out
			// the roles available in the context in which
			// the noAction is being performed
			RoleType[] rts=getRoleTypesMatrixFromTheContext();
			
			for (int i=0; ret == false && rts != null &&
						i < rts.length; i++) {
				ret = rts[i].equals(roleType);
			}
		}

		return(ret);
	}
	
	public RoleType[] getRoleTypesMatrixFromTheContext() {
		RoleType[] ret=null;
		
		// If the role is defined, then it should
		// restrict the associated roles - otherwise
		// the default set of roles apply
		if (getRoleType() != null) {
			ret = new RoleType[1];
			ret[0] = getRoleType();
		} else {
			ret = super.getRoleTypesMatrixFromTheContext();
		}
		
		return(ret);
	}
} //NoActionImpl
