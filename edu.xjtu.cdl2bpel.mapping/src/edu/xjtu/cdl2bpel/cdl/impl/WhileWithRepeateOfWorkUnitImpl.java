/**
 * CDL2BPEL_XJTU
 *
 * $Id: WhileWithRepeateOfWorkUnitImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While With Repeate Of Work Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl#getBreakOutExpression <em>Break Out Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileWithRepeateOfWorkUnitImpl extends WorkUnitImpl implements WhileWithRepeateOfWorkUnit {
	/**
	 * The default value of the '{@link #getBreakOutExpression() <em>Break Out Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakOutExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BREAK_OUT_EXPRESSION_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getBreakOutExpression() <em>Break Out Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakOutExpression()
	 * @generated
	 * @ordered
	 */
	protected String breakOutExpression = BREAK_OUT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileWithRepeateOfWorkUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.WHILE_WITH_REPEATE_OF_WORK_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBreakOutExpression() {
		return breakOutExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakOutExpression(String newBreakOutExpression) {
		String oldBreakOutExpression = breakOutExpression;
		breakOutExpression = newBreakOutExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION, oldBreakOutExpression, breakOutExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION:
				return getBreakOutExpression();
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
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION:
				setBreakOutExpression((String)newValue);
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
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION:
				setBreakOutExpression(BREAK_OUT_EXPRESSION_EDEFAULT);
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
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION:
				return BREAK_OUT_EXPRESSION_EDEFAULT == null ? breakOutExpression != null : !BREAK_OUT_EXPRESSION_EDEFAULT.equals(breakOutExpression);
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
		result.append(" (breakOutExpression: ");
		result.append(breakOutExpression);
		result.append(')');
		return result.toString();
	}

	public void resolveTheCDLElementByElement(Element elem) {
		if(elem.getName().equals("workunit")) {
			String repeatValue = elem.attributeValue("repeat");
			String guardValue = elem.attributeValue("guard");
//			if(repeatValue!=null) {
				setBreakOutExpression(guardValue);
				this.setRepeatExpression(repeatValue);
//			}
			
		}
		super.resolveTheCDLElementByElement(elem);
	}
} //WhileWithRepeateOfWorkUnitImpl
