/**
 * CDL2BPEL_XJTU
 *
 * $Id: DelayImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.Delay;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl#getUntilExpression <em>Until Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelayImpl extends BPElementImpl implements Delay {
	/**
	 * The default value of the '{@link #getForExpression() <em>For Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForExpression()
	 * @generated
	 * @ordered
	 */
	protected String forExpression = FOR_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntilExpression() <em>Until Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntilExpression() <em>Until Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilExpression()
	 * @generated
	 * @ordered
	 */
	protected String untilExpression = UNTIL_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForExpression() {
		return forExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForExpression(String newForExpression) {
		String oldForExpression = forExpression;
		forExpression = newForExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.DELAY__FOR_EXPRESSION, oldForExpression, forExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUntilExpression() {
		return untilExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUntilExpression(String newUntilExpression) {
		String oldUntilExpression = untilExpression;
		untilExpression = newUntilExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.DELAY__UNTIL_EXPRESSION, oldUntilExpression, untilExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.DELAY__FOR_EXPRESSION:
				return getForExpression();
			case OrchestraPackage.DELAY__UNTIL_EXPRESSION:
				return getUntilExpression();
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
			case OrchestraPackage.DELAY__FOR_EXPRESSION:
				setForExpression((String)newValue);
				return;
			case OrchestraPackage.DELAY__UNTIL_EXPRESSION:
				setUntilExpression((String)newValue);
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
			case OrchestraPackage.DELAY__FOR_EXPRESSION:
				setForExpression(FOR_EXPRESSION_EDEFAULT);
				return;
			case OrchestraPackage.DELAY__UNTIL_EXPRESSION:
				setUntilExpression(UNTIL_EXPRESSION_EDEFAULT);
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
			case OrchestraPackage.DELAY__FOR_EXPRESSION:
				return FOR_EXPRESSION_EDEFAULT == null ? forExpression != null : !FOR_EXPRESSION_EDEFAULT.equals(forExpression);
			case OrchestraPackage.DELAY__UNTIL_EXPRESSION:
				return UNTIL_EXPRESSION_EDEFAULT == null ? untilExpression != null : !UNTIL_EXPRESSION_EDEFAULT.equals(untilExpression);
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
		result.append(" (forExpression: ");
		result.append(forExpression);
		result.append(", untilExpression: ");
		result.append(untilExpression);
		result.append(')');
		return result.toString();
	}

} //DelayImpl
