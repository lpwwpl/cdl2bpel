/**
 * CDL2BPEL_XJTU
 *
 * $Id: AssignImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.AssignImpl#getCopyOfAssign <em>Copy Of Assign</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.AssignImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignImpl extends ActivityImpl implements Assign {
	/**
	 * The cached value of the '{@link #getCopyOfAssign() <em>Copy Of Assign</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOfAssign()
	 * @generated
	 * @ordered
	 */
	protected EList<CopyOfAssign> copyOfAssign;

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
	protected AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CopyOfAssign> getCopyOfAssign() {
		if (copyOfAssign == null) {
			copyOfAssign = new EObjectContainmentEList<CopyOfAssign>(CopyOfAssign.class, this, CDLPackage.ASSIGN__COPY_OF_ASSIGN);
		}
		return copyOfAssign;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.ASSIGN__ROLE_TYPE, oldRoleType, roleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ASSIGN__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.ASSIGN__COPY_OF_ASSIGN:
				return ((InternalEList<?>)getCopyOfAssign()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.ASSIGN__COPY_OF_ASSIGN:
				return getCopyOfAssign();
			case CDLPackage.ASSIGN__ROLE_TYPE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDLPackage.ASSIGN__COPY_OF_ASSIGN:
				getCopyOfAssign().clear();
				getCopyOfAssign().addAll((Collection<? extends CopyOfAssign>)newValue);
				return;
			case CDLPackage.ASSIGN__ROLE_TYPE:
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
			case CDLPackage.ASSIGN__COPY_OF_ASSIGN:
				getCopyOfAssign().clear();
				return;
			case CDLPackage.ASSIGN__ROLE_TYPE:
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
			case CDLPackage.ASSIGN__COPY_OF_ASSIGN:
				return copyOfAssign != null && !copyOfAssign.isEmpty();
			case CDLPackage.ASSIGN__ROLE_TYPE:
				return roleType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Parsing The XML Segment of Assign by deep traversal
	 * 
	 * @param elem the XML value of Current Assign CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(CDLElemNameConstants.ASSIGN_ELEM_NAME)) {
			Package thePackage = getBelongedPackage();
			RoleType roleType = CDLPackageUtil.getRoleType(thePackage, elem
					.attributeValue("roleType"));
			setRoleType(roleType);
		}
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	/**
	 * New and Return the sub CDLElement of the current Assign CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if (elem.getName().equals(CDLElemNameConstants.COPY_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createCopyOfAssign();
			this.getCopyOfAssign().add((CopyOfAssign) cdlElement);
		}
		return cdlElement;
	}
	
	/**
	 * Return the boolean value of whether The Assign is relevant with the
	 * roleType
	 * 
	 * @param roleType
	 * @return the value of whether Assign is relevant with the roleType
	 */
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		if (
		// roleType!=null&&
		getRoleType().getName().equals(roleType.getName())) {

			return true;
		}
		return false;
	}
} //AssignImpl
