/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeZlpImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeZlp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type Zlp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl#getParticipantBelongedByRoleType <em>Participant Belonged By Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeZlpImpl extends CDLElementImpl implements RoleTypeZlp {
	/**
	 * The cached value of the '{@link #getParticipantBelongedByRoleType() <em>Participant Belonged By Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantBelongedByRoleType()
	 * @generated
	 * @ordered
	 */
	protected ParticipantType participantBelongedByRoleType;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FREE_EDEFAULT = null;

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
	protected RoleTypeZlpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ROLE_TYPE_ZLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantType getParticipantBelongedByRoleType() {
		if (participantBelongedByRoleType != null && participantBelongedByRoleType.eIsProxy()) {
			InternalEObject oldParticipantBelongedByRoleType = (InternalEObject)participantBelongedByRoleType;
			participantBelongedByRoleType = (ParticipantType)eResolveProxy(oldParticipantBelongedByRoleType);
			if (participantBelongedByRoleType != oldParticipantBelongedByRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE, oldParticipantBelongedByRoleType, participantBelongedByRoleType));
			}
		}
		return participantBelongedByRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantType basicGetParticipantBelongedByRoleType() {
		return participantBelongedByRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantBelongedByRoleType(ParticipantType newParticipantBelongedByRoleType) {
		ParticipantType oldParticipantBelongedByRoleType = participantBelongedByRoleType;
		participantBelongedByRoleType = newParticipantBelongedByRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE, oldParticipantBelongedByRoleType, participantBelongedByRoleType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE_ZLP__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE:
				if (resolve) return getParticipantBelongedByRoleType();
				return basicGetParticipantBelongedByRoleType();
			case CDLPackage.ROLE_TYPE_ZLP__FREE:
				return getFree();
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
			case CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE:
				setParticipantBelongedByRoleType((ParticipantType)newValue);
				return;
			case CDLPackage.ROLE_TYPE_ZLP__FREE:
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
			case CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE:
				setParticipantBelongedByRoleType((ParticipantType)null);
				return;
			case CDLPackage.ROLE_TYPE_ZLP__FREE:
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
			case CDLPackage.ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE:
				return participantBelongedByRoleType != null;
			case CDLPackage.ROLE_TYPE_ZLP__FREE:
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

} //RoleTypeZlpImpl
