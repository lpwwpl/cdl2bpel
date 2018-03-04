/**
 * CDL2BPEL_XJTU
 *
 * $Id: RelationshipTypeImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl#getRoleTypeOfFirst <em>Role Type Of First</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl#getBehaviorsOfRoleTypeFirst <em>Behaviors Of Role Type First</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl#getRoleTypeOfSecond <em>Role Type Of Second</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl#getBehaviorsOfRoleTypeSecond <em>Behaviors Of Role Type Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipTypeImpl extends CDLElementImpl implements RelationshipType {
	/**
	 * The cached value of the '{@link #getRoleTypeOfFirst() <em>Role Type Of First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeOfFirst()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeOfFirst;

	/**
	 * The cached value of the '{@link #getBehaviorsOfRoleTypeFirst() <em>Behaviors Of Role Type First</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorsOfRoleTypeFirst()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorOfRoleType> behaviorsOfRoleTypeFirst;

	/**
	 * The cached value of the '{@link #getRoleTypeOfSecond() <em>Role Type Of Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeOfSecond()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeOfSecond;

	/**
	 * The cached value of the '{@link #getBehaviorsOfRoleTypeSecond() <em>Behaviors Of Role Type Second</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorsOfRoleTypeSecond()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorOfRoleType> behaviorsOfRoleTypeSecond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleTypeOfFirst() {
		if (roleTypeOfFirst != null && roleTypeOfFirst.eIsProxy()) {
			InternalEObject oldRoleTypeOfFirst = (InternalEObject)roleTypeOfFirst;
			roleTypeOfFirst = (RoleType)eResolveProxy(oldRoleTypeOfFirst);
			if (roleTypeOfFirst != oldRoleTypeOfFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST, oldRoleTypeOfFirst, roleTypeOfFirst));
			}
		}
		return roleTypeOfFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeOfFirst() {
		return roleTypeOfFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleTypeOfFirst(RoleType newRoleTypeOfFirst) {
		RoleType oldRoleTypeOfFirst = roleTypeOfFirst;
		roleTypeOfFirst = newRoleTypeOfFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST, oldRoleTypeOfFirst, roleTypeOfFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorOfRoleType> getBehaviorsOfRoleTypeFirst() {
		if (behaviorsOfRoleTypeFirst == null) {
			behaviorsOfRoleTypeFirst = new EObjectResolvingEList<BehaviorOfRoleType>(BehaviorOfRoleType.class, this, CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST);
		}
		return behaviorsOfRoleTypeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleTypeOfSecond() {
		if (roleTypeOfSecond != null && roleTypeOfSecond.eIsProxy()) {
			InternalEObject oldRoleTypeOfSecond = (InternalEObject)roleTypeOfSecond;
			roleTypeOfSecond = (RoleType)eResolveProxy(oldRoleTypeOfSecond);
			if (roleTypeOfSecond != oldRoleTypeOfSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND, oldRoleTypeOfSecond, roleTypeOfSecond));
			}
		}
		return roleTypeOfSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeOfSecond() {
		return roleTypeOfSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleTypeOfSecond(RoleType newRoleTypeOfSecond) {
		RoleType oldRoleTypeOfSecond = roleTypeOfSecond;
		roleTypeOfSecond = newRoleTypeOfSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND, oldRoleTypeOfSecond, roleTypeOfSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorOfRoleType> getBehaviorsOfRoleTypeSecond() {
		if (behaviorsOfRoleTypeSecond == null) {
			behaviorsOfRoleTypeSecond = new EObjectResolvingEList<BehaviorOfRoleType>(BehaviorOfRoleType.class, this, CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND);
		}
		return behaviorsOfRoleTypeSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST:
				if (resolve) return getRoleTypeOfFirst();
				return basicGetRoleTypeOfFirst();
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST:
				return getBehaviorsOfRoleTypeFirst();
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND:
				if (resolve) return getRoleTypeOfSecond();
				return basicGetRoleTypeOfSecond();
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND:
				return getBehaviorsOfRoleTypeSecond();
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
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST:
				setRoleTypeOfFirst((RoleType)newValue);
				return;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST:
				getBehaviorsOfRoleTypeFirst().clear();
				getBehaviorsOfRoleTypeFirst().addAll((Collection<? extends BehaviorOfRoleType>)newValue);
				return;
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND:
				setRoleTypeOfSecond((RoleType)newValue);
				return;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND:
				getBehaviorsOfRoleTypeSecond().clear();
				getBehaviorsOfRoleTypeSecond().addAll((Collection<? extends BehaviorOfRoleType>)newValue);
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
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST:
				setRoleTypeOfFirst((RoleType)null);
				return;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST:
				getBehaviorsOfRoleTypeFirst().clear();
				return;
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND:
				setRoleTypeOfSecond((RoleType)null);
				return;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND:
				getBehaviorsOfRoleTypeSecond().clear();
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
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST:
				return roleTypeOfFirst != null;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST:
				return behaviorsOfRoleTypeFirst != null && !behaviorsOfRoleTypeFirst.isEmpty();
			case CDLPackage.RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND:
				return roleTypeOfSecond != null;
			case CDLPackage.RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND:
				return behaviorsOfRoleTypeSecond != null && !behaviorsOfRoleTypeSecond.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(
				CDLElemNameConstants.RELATIONSHIPTYPE_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			List<Element> roleTypeElements = elem.elements();
			// need to modified
			Package thePackage = getBelongedPackage();
			if (roleTypeElements.size() == 2) {
				if (roleTypeElements.get(0).attributeValue("typeRef") != null) {
					RoleType fistRoleType = CDLPackageUtil.getRoleType(
							thePackage, roleTypeElements.get(0).attributeValue(
									"typeRef"));
					setRoleTypeOfFirst(fistRoleType);
				}
				if (roleTypeElements.get(1).attributeValue("typeRef") != null) {
					RoleType secondRoleType = CDLPackageUtil.getRoleType(
							thePackage, roleTypeElements.get(1).attributeValue(
									"typeRef"));
					setRoleTypeOfSecond(secondRoleType);

				}
			}
		}
		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	/**
	 * 
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		return cdlElement;
	}
} //RelationshipTypeImpl
