/**
 * CDL2BPEL_XJTU
 *
 * $Id: ActivityImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl#getState <em>State</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl#getTheBelongedRoleTypeMatrix <em>The Belonged Role Type Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityImpl extends CDLElementImpl implements Activity {
	/**
	 * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocked()
	 * @generated
	 * @ordered
	 */
	protected Boolean locked = LOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityStateEnumByActivity STATE_EDEFAULT = ActivityStateEnumByActivity.ACTIVED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ActivityStateEnumByActivity state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheBelongedRoleTypeMatrix() <em>The Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheBelongedRoleTypeMatrix()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeMatrix theBelongedRoleTypeMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocked(Boolean newLocked) {
		Boolean oldLocked = locked;
		locked = newLocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ACTIVITY__LOCKED, oldLocked, locked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityStateEnumByActivity getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ActivityStateEnumByActivity newState) {
		ActivityStateEnumByActivity oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ACTIVITY__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix getTheBelongedRoleTypeMatrix() {
		if (theBelongedRoleTypeMatrix != null && theBelongedRoleTypeMatrix.eIsProxy()) {
			InternalEObject oldTheBelongedRoleTypeMatrix = (InternalEObject)theBelongedRoleTypeMatrix;
			theBelongedRoleTypeMatrix = (RoleTypeMatrix)eResolveProxy(oldTheBelongedRoleTypeMatrix);
			if (theBelongedRoleTypeMatrix != oldTheBelongedRoleTypeMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX, oldTheBelongedRoleTypeMatrix, theBelongedRoleTypeMatrix));
			}
		}
		return theBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix basicGetTheBelongedRoleTypeMatrix() {
		return theBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheBelongedRoleTypeMatrix(RoleTypeMatrix newTheBelongedRoleTypeMatrix) {
		RoleTypeMatrix oldTheBelongedRoleTypeMatrix = theBelongedRoleTypeMatrix;
		theBelongedRoleTypeMatrix = newTheBelongedRoleTypeMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX, oldTheBelongedRoleTypeMatrix, theBelongedRoleTypeMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.ACTIVITY__LOCKED:
				return getLocked();
			case CDLPackage.ACTIVITY__STATE:
				return getState();
			case CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX:
				if (resolve) return getTheBelongedRoleTypeMatrix();
				return basicGetTheBelongedRoleTypeMatrix();
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
			case CDLPackage.ACTIVITY__LOCKED:
				setLocked((Boolean)newValue);
				return;
			case CDLPackage.ACTIVITY__STATE:
				setState((ActivityStateEnumByActivity)newValue);
				return;
			case CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX:
				setTheBelongedRoleTypeMatrix((RoleTypeMatrix)newValue);
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
			case CDLPackage.ACTIVITY__LOCKED:
				setLocked(LOCKED_EDEFAULT);
				return;
			case CDLPackage.ACTIVITY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX:
				setTheBelongedRoleTypeMatrix((RoleTypeMatrix)null);
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
			case CDLPackage.ACTIVITY__LOCKED:
				return LOCKED_EDEFAULT == null ? locked != null : !LOCKED_EDEFAULT.equals(locked);
			case CDLPackage.ACTIVITY__STATE:
				return state != STATE_EDEFAULT;
			case CDLPackage.ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX:
				return theBelongedRoleTypeMatrix != null;
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
		result.append(" (locked: ");
		result.append(locked);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		String elemName = elem.getName();
		if (elemName.equals("sequence")) {
			cdlElement = CDLFactory.eINSTANCE.createSequence();
		} else if (elemName.equals("choice")) {
			cdlElement = CDLFactory.eINSTANCE.createChoice();
		} else if (elemName.equals("parallel")) {
			cdlElement = CDLFactory.eINSTANCE.createParallel();
		} if (elemName.equals("perform")) {
			cdlElement = CDLFactory.eINSTANCE.createPerform(); 
        } else if (elemName.equals("workunit")) {
			String repeatValue = elem.attributeValue("repeat");
			String guardValue = elem.attributeValue("guard");
			String blockValue = elem.attributeValue("block");
			if(blockValue!=null) {
				cdlElement = CDLFactory.eINSTANCE.createWhenWithBlockOfWorkUnit();
			} else if(repeatValue!=null) {
				cdlElement = CDLFactory.eINSTANCE.createWhileWithRepeateOfWorkUnit();
			} else if(guardValue != null) {
				cdlElement = CDLFactory.eINSTANCE.createCaseConditionalOfSwitch();
			} else {
				cdlElement = CDLFactory.eINSTANCE.createScopeWithNoAttrOfWorkUnit();
			}
		} else if (elemName.equals("assign")) {
			cdlElement = CDLFactory.eINSTANCE.createAssign();
		} else if (elemName.equals("interaction")) {
			cdlElement = CDLFactory.eINSTANCE.createInteraction();
		} else if (elemName.equals("noAction")) {
			cdlElement = CDLFactory.eINSTANCE.createNoAction();
		} else if (elemName.equals("silentAction")) {
			cdlElement = CDLFactory.eINSTANCE.createSilentAction();
		}if (elem.getName().equals("finalize")) {
			cdlElement = CDLFactory.eINSTANCE.createFinalize();
		}
		if(cdlElement!= null && this instanceof OrderingStructuralActivity) {
			((OrderingStructuralActivity)this).getActivities().add((Activity)(cdlElement));
		}
		return cdlElement;
	}
} //ActivityImpl
