/**
 * CDL2BPEL_XJTU
 *
 * $Id: Delay.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Delay#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Delay#getUntilExpression <em>Until Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getDelay()
 * @model
 * @generated
 */
public interface Delay extends BPElement {
	/**
	 * Returns the value of the '<em><b>For Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Expression</em>' attribute.
	 * @see #setForExpression(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getDelay_ForExpression()
	 * @model
	 * @generated
	 */
	String getForExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Delay#getForExpression <em>For Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Expression</em>' attribute.
	 * @see #getForExpression()
	 * @generated
	 */
	void setForExpression(String value);

	/**
	 * Returns the value of the '<em><b>Until Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until Expression</em>' attribute.
	 * @see #setUntilExpression(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getDelay_UntilExpression()
	 * @model
	 * @generated
	 */
	String getUntilExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Delay#getUntilExpression <em>Until Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Expression</em>' attribute.
	 * @see #getUntilExpression()
	 * @generated
	 */
	void setUntilExpression(String value);

} // Delay
