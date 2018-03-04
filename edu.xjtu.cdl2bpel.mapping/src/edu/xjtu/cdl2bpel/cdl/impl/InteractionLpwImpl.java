/**
 * CDL2BPEL_XJTU
 *
 * $Id: InteractionLpwImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.InteractionLpw;
import edu.xjtu.cdl2bpel.cdl.RoleTypeZlp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Lpw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getFromRoleType <em>From Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getToRoleType <em>To Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getOpperation <em>Opperation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl#getAsyn <em>Asyn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionLpwImpl extends CDLElementImpl implements InteractionLpw {
	/**
	 * The cached value of the '{@link #getFromRoleType() <em>From Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeZlp fromRoleType;

	/**
	 * The cached value of the '{@link #getToRoleType() <em>To Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeZlp toRoleType;

	/**
	 * The default value of the '{@link #getOpperation() <em>Opperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpperation() <em>Opperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpperation()
	 * @generated
	 * @ordered
	 */
	protected String opperation = OPPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Boolean align = ALIGN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected Interaction interaction;

	/**
	 * The default value of the '{@link #getAsyn() <em>Asyn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASYN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsyn() <em>Asyn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyn()
	 * @generated
	 * @ordered
	 */
	protected Boolean asyn = ASYN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionLpwImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.INTERACTION_LPW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeZlp getFromRoleType() {
		if (fromRoleType != null && fromRoleType.eIsProxy()) {
			InternalEObject oldFromRoleType = (InternalEObject)fromRoleType;
			fromRoleType = (RoleTypeZlp)eResolveProxy(oldFromRoleType);
			if (fromRoleType != oldFromRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE, oldFromRoleType, fromRoleType));
			}
		}
		return fromRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeZlp basicGetFromRoleType() {
		return fromRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRoleType(RoleTypeZlp newFromRoleType) {
		RoleTypeZlp oldFromRoleType = fromRoleType;
		fromRoleType = newFromRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE, oldFromRoleType, fromRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeZlp getToRoleType() {
		if (toRoleType != null && toRoleType.eIsProxy()) {
			InternalEObject oldToRoleType = (InternalEObject)toRoleType;
			toRoleType = (RoleTypeZlp)eResolveProxy(oldToRoleType);
			if (toRoleType != oldToRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE, oldToRoleType, toRoleType));
			}
		}
		return toRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeZlp basicGetToRoleType() {
		return toRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRoleType(RoleTypeZlp newToRoleType) {
		RoleTypeZlp oldToRoleType = toRoleType;
		toRoleType = newToRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE, oldToRoleType, toRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpperation() {
		return opperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpperation(String newOpperation) {
		String oldOpperation = opperation;
		opperation = newOpperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__OPPERATION, oldOpperation, opperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Boolean newAlign) {
		Boolean oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getInteraction() {
		if (interaction != null && interaction.eIsProxy()) {
			InternalEObject oldInteraction = (InternalEObject)interaction;
			interaction = (Interaction)eResolveProxy(oldInteraction);
			if (interaction != oldInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION_LPW__INTERACTION, oldInteraction, interaction));
			}
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(Interaction newInteraction) {
		Interaction oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__INTERACTION, oldInteraction, interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAsyn() {
		return asyn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyn(Boolean newAsyn) {
		Boolean oldAsyn = asyn;
		asyn = newAsyn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION_LPW__ASYN, oldAsyn, asyn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE:
				if (resolve) return getFromRoleType();
				return basicGetFromRoleType();
			case CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE:
				if (resolve) return getToRoleType();
				return basicGetToRoleType();
			case CDLPackage.INTERACTION_LPW__OPPERATION:
				return getOpperation();
			case CDLPackage.INTERACTION_LPW__TIMEOUT:
				return getTimeout();
			case CDLPackage.INTERACTION_LPW__ALIGN:
				return getAlign();
			case CDLPackage.INTERACTION_LPW__INTERACTION:
				if (resolve) return getInteraction();
				return basicGetInteraction();
			case CDLPackage.INTERACTION_LPW__ASYN:
				return getAsyn();
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
			case CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE:
				setFromRoleType((RoleTypeZlp)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE:
				setToRoleType((RoleTypeZlp)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__OPPERATION:
				setOpperation((String)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__ALIGN:
				setAlign((Boolean)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__INTERACTION:
				setInteraction((Interaction)newValue);
				return;
			case CDLPackage.INTERACTION_LPW__ASYN:
				setAsyn((Boolean)newValue);
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
			case CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE:
				setFromRoleType((RoleTypeZlp)null);
				return;
			case CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE:
				setToRoleType((RoleTypeZlp)null);
				return;
			case CDLPackage.INTERACTION_LPW__OPPERATION:
				setOpperation(OPPERATION_EDEFAULT);
				return;
			case CDLPackage.INTERACTION_LPW__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case CDLPackage.INTERACTION_LPW__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case CDLPackage.INTERACTION_LPW__INTERACTION:
				setInteraction((Interaction)null);
				return;
			case CDLPackage.INTERACTION_LPW__ASYN:
				setAsyn(ASYN_EDEFAULT);
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
			case CDLPackage.INTERACTION_LPW__FROM_ROLE_TYPE:
				return fromRoleType != null;
			case CDLPackage.INTERACTION_LPW__TO_ROLE_TYPE:
				return toRoleType != null;
			case CDLPackage.INTERACTION_LPW__OPPERATION:
				return OPPERATION_EDEFAULT == null ? opperation != null : !OPPERATION_EDEFAULT.equals(opperation);
			case CDLPackage.INTERACTION_LPW__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case CDLPackage.INTERACTION_LPW__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case CDLPackage.INTERACTION_LPW__INTERACTION:
				return interaction != null;
			case CDLPackage.INTERACTION_LPW__ASYN:
				return ASYN_EDEFAULT == null ? asyn != null : !ASYN_EDEFAULT.equals(asyn);
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
		result.append(" (opperation: ");
		result.append(opperation);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", align: ");
		result.append(align);
		result.append(", Asyn: ");
		result.append(asyn);
		result.append(')');
		return result.toString();
	}

} //InteractionLpwImpl
