/**
 * CDL2BPEL_XJTU
 *
 * $Id: CaseExceptionImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.CaseException;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.util.BPElementUtil;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl#getExceptionValue <em>Exception Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseExceptionImpl extends BPActivityImpl implements CaseException {
	/**
	 * The default value of the '{@link #getExceptionValue() <em>Exception Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionValue() <em>Exception Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionValue()
	 * @generated
	 * @ordered
	 */
	protected String exceptionValue = EXCEPTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.CASE_EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionValue() {
		return exceptionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionValue(String newExceptionValue) {
		String oldExceptionValue = exceptionValue;
		exceptionValue = newExceptionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.CASE_EXCEPTION__EXCEPTION_VALUE, oldExceptionValue, exceptionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.CASE_EXCEPTION__EXCEPTION_VALUE:
				return getExceptionValue();
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
			case OrchestraPackage.CASE_EXCEPTION__EXCEPTION_VALUE:
				setExceptionValue((String)newValue);
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
			case OrchestraPackage.CASE_EXCEPTION__EXCEPTION_VALUE:
				setExceptionValue(EXCEPTION_VALUE_EDEFAULT);
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
			case OrchestraPackage.CASE_EXCEPTION__EXCEPTION_VALUE:
				return EXCEPTION_VALUE_EDEFAULT == null ? exceptionValue != null : !EXCEPTION_VALUE_EDEFAULT.equals(exceptionValue);
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
		result.append(" (exceptionValue: ");
		result.append(exceptionValue);
		result.append(')');
		return result.toString();
	}

	public String getFullyQualifiedExceptionType() {
		
		if (m_cachedFQExceptionType == null || m_enableFQNCaching == false) {
			
			if (CheckNOthersUtil.isSet(getExceptionValue())) {
				String namespace=BPElementUtil.getNamespace(getExceptionValue(),this);					
				String localpart=XMLUtils.getLocalname(getExceptionValue());				
				m_cachedFQExceptionType = NameSpaceUtil.getFullyQualifiedName(namespace,
								localpart);
			}
		}		
		return(m_cachedFQExceptionType);
	}
	
	private String m_cachedFQExceptionType=null;
    private boolean m_enableFQNCaching=false;

} //CaseExceptionImpl
