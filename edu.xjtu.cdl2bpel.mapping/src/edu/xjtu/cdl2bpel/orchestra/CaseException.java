/**
 * CDL2BPEL_XJTU
 *
 * $Id: CaseException.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.CaseException#getExceptionValue <em>Exception Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCaseException()
 * @model
 * @generated
 */
public interface CaseException extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Exception Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Value</em>' attribute.
	 * @see #setExceptionValue(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCaseException_ExceptionValue()
	 * @model required="true"
	 * @generated
	 */
	String getExceptionValue();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.CaseException#getExceptionValue <em>Exception Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Value</em>' attribute.
	 * @see #getExceptionValue()
	 * @generated
	 */
	void setExceptionValue(String value);

	public String getFullyQualifiedExceptionType();

} // CaseException
