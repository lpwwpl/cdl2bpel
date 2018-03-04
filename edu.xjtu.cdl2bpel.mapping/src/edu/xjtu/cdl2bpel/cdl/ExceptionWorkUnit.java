/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExceptionWorkUnit.java,v 1.1 2011/02/21 06:24:03 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Work Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExceptionWorkUnit()
 * @model
 * @generated
 */
public interface ExceptionWorkUnit extends WorkUnit {
	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' attribute.
	 * @see #setExceptionType(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExceptionWorkUnit_ExceptionType()
	 * @model
	 * @generated
	 */
	String getExceptionType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit#getExceptionType <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' attribute.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(String value);

} // ExceptionWorkUnit
