/**
 * CDL2BPEL_XJTU
 *
 * $Id: When.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.When#getIsMatched <em>Is Matched</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.When#getMatchedExpression <em>Matched Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends BPOrderingStruturalActivity {
	/**
	 * Returns the value of the '<em><b>Is Matched</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Matched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Matched</em>' attribute.
	 * @see #setIsMatched(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getWhen_IsMatched()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getIsMatched();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.When#getIsMatched <em>Is Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Matched</em>' attribute.
	 * @see #getIsMatched()
	 * @generated
	 */
	void setIsMatched(Boolean value);

	/**
	 * Returns the value of the '<em><b>Matched Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matched Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Expression</em>' attribute.
	 * @see #setMatchedExpression(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getWhen_MatchedExpression()
	 * @model
	 * @generated
	 */
	String getMatchedExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.When#getMatchedExpression <em>Matched Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matched Expression</em>' attribute.
	 * @see #getMatchedExpression()
	 * @generated
	 */
	void setMatchedExpression(String value);

} // When
