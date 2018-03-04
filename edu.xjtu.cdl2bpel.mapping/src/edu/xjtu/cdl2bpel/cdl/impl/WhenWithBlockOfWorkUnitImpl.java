/**
 * CDL2BPEL_XJTU
 *
 * $Id: WhenWithBlockOfWorkUnitImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When With Block Of Work Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl#getMatchedExpression <em>Matched Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl#getIsMatched <em>Is Matched</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenWithBlockOfWorkUnitImpl extends WorkUnitImpl implements WhenWithBlockOfWorkUnit {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenWithBlockOfWorkUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.WHEN_WITH_BLOCK_OF_WORK_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION, oldMatchedExpression, matchedExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED, oldIsMatched, isMatched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION:
				return getMatchedExpression();
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED:
				return getIsMatched();
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
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION:
				setMatchedExpression((String)newValue);
				return;
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED:
				setIsMatched((Boolean)newValue);
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
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION:
				setMatchedExpression(MATCHED_EXPRESSION_EDEFAULT);
				return;
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED:
				setIsMatched(IS_MATCHED_EDEFAULT);
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
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION:
				return MATCHED_EXPRESSION_EDEFAULT == null ? matchedExpression != null : !MATCHED_EXPRESSION_EDEFAULT.equals(matchedExpression);
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED:
				return IS_MATCHED_EDEFAULT == null ? isMatched != null : !IS_MATCHED_EDEFAULT.equals(isMatched);
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
		result.append(" (matchedExpression: ");
		result.append(matchedExpression);
		result.append(", isMatched: ");
		result.append(isMatched);
		result.append(')');
		return result.toString();
	}

	public void resolveTheCDLElementByElement(Element elem) {
		
		if(elem.getName().equals("workunit")) {
			String blockValue = elem.attributeValue("block");
			String guardValue = elem.attributeValue("guard");			
			if(blockValue.equals("true")) {
				setIsMatched(true);
			} else {
				setIsMatched(false);
			}
			setGuardExpression(guardValue);
			setMatchedExpression(guardValue);
		}
		super.resolveTheCDLElementByElement(elem);
	}
} //WhenWithBlockOfWorkUnitImpl
