/**
 * CDL2BPEL_XJTU
 *
 * $Id: WhenImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.When;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl#getIsMatched <em>Is Matched</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl#getMatchedExpression <em>Matched Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenImpl extends BPOrderingStruturalActivityImpl implements When {
	/**
	 * The default value of the '{@link #getIsMatched() <em>Is Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMatched()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_MATCHED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsMatched() <em>Is Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMatched()
	 * @generated
	 * @ordered
	 */
	protected Boolean isMatched = IS_MATCHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchedExpression() <em>Matched Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchedExpression() <em>Matched Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedExpression()
	 * @generated
	 * @ordered
	 */
	protected String matchedExpression = MATCHED_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.WHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsMatched() {
		return isMatched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMatched(Boolean newIsMatched) {
		Boolean oldIsMatched = isMatched;
		isMatched = newIsMatched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.WHEN__IS_MATCHED, oldIsMatched, isMatched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchedExpression() {
		return matchedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchedExpression(String newMatchedExpression) {
		String oldMatchedExpression = matchedExpression;
		matchedExpression = newMatchedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.WHEN__MATCHED_EXPRESSION, oldMatchedExpression, matchedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.WHEN__IS_MATCHED:
				return getIsMatched();
			case OrchestraPackage.WHEN__MATCHED_EXPRESSION:
				return getMatchedExpression();
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
			case OrchestraPackage.WHEN__IS_MATCHED:
				setIsMatched((Boolean)newValue);
				return;
			case OrchestraPackage.WHEN__MATCHED_EXPRESSION:
				setMatchedExpression((String)newValue);
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
			case OrchestraPackage.WHEN__IS_MATCHED:
				setIsMatched(IS_MATCHED_EDEFAULT);
				return;
			case OrchestraPackage.WHEN__MATCHED_EXPRESSION:
				setMatchedExpression(MATCHED_EXPRESSION_EDEFAULT);
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
			case OrchestraPackage.WHEN__IS_MATCHED:
				return IS_MATCHED_EDEFAULT == null ? isMatched != null : !IS_MATCHED_EDEFAULT.equals(isMatched);
			case OrchestraPackage.WHEN__MATCHED_EXPRESSION:
				return MATCHED_EXPRESSION_EDEFAULT == null ? matchedExpression != null : !MATCHED_EXPRESSION_EDEFAULT.equals(matchedExpression);
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
		result.append(" (isMatched: ");
		result.append(isMatched);
		result.append(", matchedExpression: ");
		result.append(matchedExpression);
		result.append(')');
		return result.toString();
	}

} //WhenImpl
