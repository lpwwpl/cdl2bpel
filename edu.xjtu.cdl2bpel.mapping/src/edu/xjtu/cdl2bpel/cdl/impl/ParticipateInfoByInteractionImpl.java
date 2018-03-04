/**
 * CDL2BPEL_XJTU
 *
 * $Id: ParticipateInfoByInteractionImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participate Info By Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl#getFromRoleTypeRef <em>From Role Type Ref</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl#getToRoleTypeRef <em>To Role Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipateInfoByInteractionImpl extends CDLElementImpl implements ParticipateInfoByInteraction {
	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType relationshipType;

	/**
	 * The cached value of the '{@link #getFromRoleTypeRef() <em>From Role Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRoleTypeRef()
	 * @generated
	 * @ordered
	 */
	protected RoleType fromRoleTypeRef;

	/**
	 * The cached value of the '{@link #getToRoleTypeRef() <em>To Role Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRoleTypeRef()
	 * @generated
	 * @ordered
	 */
	protected RoleType toRoleTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipateInfoByInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PARTICIPATE_INFO_BY_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getRelationshipType() {
		if (relationshipType != null && relationshipType.eIsProxy()) {
			InternalEObject oldRelationshipType = (InternalEObject)relationshipType;
			relationshipType = (RelationshipType)eResolveProxy(oldRelationshipType);
			if (relationshipType != oldRelationshipType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
			}
		}
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType basicGetRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(RelationshipType newRelationshipType) {
		RelationshipType oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getFromRoleTypeRef() {
		if (fromRoleTypeRef != null && fromRoleTypeRef.eIsProxy()) {
			InternalEObject oldFromRoleTypeRef = (InternalEObject)fromRoleTypeRef;
			fromRoleTypeRef = (RoleType)eResolveProxy(oldFromRoleTypeRef);
			if (fromRoleTypeRef != oldFromRoleTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF, oldFromRoleTypeRef, fromRoleTypeRef));
			}
		}
		return fromRoleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetFromRoleTypeRef() {
		return fromRoleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRoleTypeRef(RoleType newFromRoleTypeRef) {
		RoleType oldFromRoleTypeRef = fromRoleTypeRef;
		fromRoleTypeRef = newFromRoleTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF, oldFromRoleTypeRef, fromRoleTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getToRoleTypeRef() {
		if (toRoleTypeRef != null && toRoleTypeRef.eIsProxy()) {
			InternalEObject oldToRoleTypeRef = (InternalEObject)toRoleTypeRef;
			toRoleTypeRef = (RoleType)eResolveProxy(oldToRoleTypeRef);
			if (toRoleTypeRef != oldToRoleTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF, oldToRoleTypeRef, toRoleTypeRef));
			}
		}
		return toRoleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetToRoleTypeRef() {
		return toRoleTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRoleTypeRef(RoleType newToRoleTypeRef) {
		RoleType oldToRoleTypeRef = toRoleTypeRef;
		toRoleTypeRef = newToRoleTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF, oldToRoleTypeRef, toRoleTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE:
				if (resolve) return getRelationshipType();
				return basicGetRelationshipType();
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF:
				if (resolve) return getFromRoleTypeRef();
				return basicGetFromRoleTypeRef();
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF:
				if (resolve) return getToRoleTypeRef();
				return basicGetToRoleTypeRef();
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
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE:
				setRelationshipType((RelationshipType)newValue);
				return;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF:
				setFromRoleTypeRef((RoleType)newValue);
				return;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF:
				setToRoleTypeRef((RoleType)newValue);
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
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE:
				setRelationshipType((RelationshipType)null);
				return;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF:
				setFromRoleTypeRef((RoleType)null);
				return;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF:
				setToRoleTypeRef((RoleType)null);
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
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE:
				return relationshipType != null;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF:
				return fromRoleTypeRef != null;
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF:
				return toRoleTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipateInfoByInteractionImpl
