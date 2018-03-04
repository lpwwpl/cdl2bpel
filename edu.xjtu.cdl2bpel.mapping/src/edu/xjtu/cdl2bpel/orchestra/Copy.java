/**
 * CDL2BPEL_XJTU
 *
 * $Id: Copy.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourcePart <em>Source Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy()
 * @model
 * @generated
 */
public interface Copy extends BPElement {
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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy_TargetVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getTargetVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetVariable <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' reference.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Target Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Part</em>' attribute.
	 * @see #setTargetPart(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy_TargetPart()
	 * @model
	 * @generated
	 */
	String getTargetPart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetPart <em>Target Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Part</em>' attribute.
	 * @see #getTargetPart()
	 * @generated
	 */
	void setTargetPart(String value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy_SourceExpression()
	 * @model
	 * @generated
	 */
	String getSourceExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceExpression <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Expression</em>' attribute.
	 * @see #getSourceExpression()
	 * @generated
	 */
	void setSourceExpression(String value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy_SourceVariable()
	 * @model
	 * @generated
	 */
	Variable getSourceVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceVariable <em>Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variable</em>' reference.
	 * @see #getSourceVariable()
	 * @generated
	 */
	void setSourceVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Source Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Part</em>' attribute.
	 * @see #setSourcePart(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCopy_SourcePart()
	 * @model
	 * @generated
	 */
	String getSourcePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourcePart <em>Source Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Part</em>' attribute.
	 * @see #getSourcePart()
	 * @generated
	 */
	void setSourcePart(String value);

} // Copy
