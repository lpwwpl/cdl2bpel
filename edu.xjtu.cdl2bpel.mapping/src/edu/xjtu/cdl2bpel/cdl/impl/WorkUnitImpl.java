/**
 * CDL2BPEL_XJTU
 *
 * $Id: WorkUnitImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.WorkUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl#getRepeatExpression <em>Repeat Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkUnitImpl extends OrderingStructuralActivityImpl implements WorkUnit {
	/**
	 * The default value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected String guardExpression = GUARD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected String block = BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatExpression() <em>Repeat Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatExpression() <em>Repeat Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatExpression()
	 * @generated
	 * @ordered
	 */
	protected String repeatExpression = REPEAT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.WORK_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpression() {
		return guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpression(String newGuardExpression) {
		String oldGuardExpression = guardExpression;
		guardExpression = newGuardExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WORK_UNIT__GUARD_EXPRESSION, oldGuardExpression, guardExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(String newBlock) {
		String oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WORK_UNIT__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatExpression() {
		return repeatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatExpression(String newRepeatExpression) {
		String oldRepeatExpression = repeatExpression;
		repeatExpression = newRepeatExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WORK_UNIT__REPEAT_EXPRESSION, oldRepeatExpression, repeatExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.WORK_UNIT__GUARD_EXPRESSION:
				return getGuardExpression();
			case CDLPackage.WORK_UNIT__BLOCK:
				return getBlock();
			case CDLPackage.WORK_UNIT__REPEAT_EXPRESSION:
				return getRepeatExpression();
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
			case CDLPackage.WORK_UNIT__GUARD_EXPRESSION:
				setGuardExpression((String)newValue);
				return;
			case CDLPackage.WORK_UNIT__BLOCK:
				setBlock((String)newValue);
				return;
			case CDLPackage.WORK_UNIT__REPEAT_EXPRESSION:
				setRepeatExpression((String)newValue);
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
			case CDLPackage.WORK_UNIT__GUARD_EXPRESSION:
				setGuardExpression(GUARD_EXPRESSION_EDEFAULT);
				return;
			case CDLPackage.WORK_UNIT__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case CDLPackage.WORK_UNIT__REPEAT_EXPRESSION:
				setRepeatExpression(REPEAT_EXPRESSION_EDEFAULT);
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
			case CDLPackage.WORK_UNIT__GUARD_EXPRESSION:
				return GUARD_EXPRESSION_EDEFAULT == null ? guardExpression != null : !GUARD_EXPRESSION_EDEFAULT.equals(guardExpression);
			case CDLPackage.WORK_UNIT__BLOCK:
				return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
			case CDLPackage.WORK_UNIT__REPEAT_EXPRESSION:
				return REPEAT_EXPRESSION_EDEFAULT == null ? repeatExpression != null : !REPEAT_EXPRESSION_EDEFAULT.equals(repeatExpression);
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
		result.append(" (guardExpression: ");
		result.append(guardExpression);
		result.append(", block: ");
		result.append(block);
		result.append(", repeatExpression: ");
		result.append(repeatExpression);
		result.append(')');
		return result.toString();
	}

	public boolean isGroupingConstruct() {
		return(true);
	}
	
	public boolean isConditionalGroupingConstruct() {
		return(true);
	}
	
	public boolean isSequentialGroupingConstruct() {
		return(true);
	}

} //WorkUnitImpl
