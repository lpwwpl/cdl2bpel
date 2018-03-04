/**
 * CDL2BPEL_XJTU
 *
 * $Id: CopyOfAssign.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Of Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getCauseException <em>Cause Exception</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariablePart <em>Source Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariablePart <em>Target Variable Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign()
 * @model
 * @generated
 */
public interface CopyOfAssign extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Source Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Variable</em>' reference.
	 * @see #setSourceVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_SourceVariable()
	 * @model
	 * @generated
	 */
	Variable getSourceVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariable <em>Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variable</em>' reference.
	 * @see #getSourceVariable()
	 * @generated
	 */
	void setSourceVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Expression</em>' attribute.
	 * @see #setSourceExpression(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_SourceExpression()
	 * @model
	 * @generated
	 */
	String getSourceExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceExpression <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Expression</em>' attribute.
	 * @see #getSourceExpression()
	 * @generated
	 */
	void setSourceExpression(String value);

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' reference.
	 * @see #setTargetVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_TargetVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getTargetVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariable <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' reference.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Cause Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Exception</em>' attribute.
	 * @see #setCauseException(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_CauseException()
	 * @model
	 * @generated
	 */
	String getCauseException();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getCauseException <em>Cause Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Exception</em>' attribute.
	 * @see #getCauseException()
	 * @generated
	 */
	void setCauseException(String value);

	/**
	 * Returns the value of the '<em><b>Source Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Variable Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Variable Part</em>' attribute.
	 * @see #setSourceVariablePart(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_SourceVariablePart()
	 * @model
	 * @generated
	 */
	String getSourceVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariablePart <em>Source Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variable Part</em>' attribute.
	 * @see #getSourceVariablePart()
	 * @generated
	 */
	void setSourceVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Target Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Variable Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable Part</em>' attribute.
	 * @see #setTargetVariablePart(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCopyOfAssign_TargetVariablePart()
	 * @model
	 * @generated
	 */
	String getTargetVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariablePart <em>Target Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable Part</em>' attribute.
	 * @see #getTargetVariablePart()
	 * @generated
	 */
	void setTargetVariablePart(String value);

} // CopyOfAssign
