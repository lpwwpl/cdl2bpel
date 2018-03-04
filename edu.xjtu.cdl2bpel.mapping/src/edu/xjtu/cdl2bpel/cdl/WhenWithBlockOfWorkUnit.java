/**
 * CDL2BPEL_XJTU
 *
 * $Id: WhenWithBlockOfWorkUnit.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When With Block Of Work Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getMatchedExpression <em>Matched Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getIsMatched <em>Is Matched</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWhenWithBlockOfWorkUnit()
 * @model
 * @generated
 */
public interface WhenWithBlockOfWorkUnit extends WorkUnit {
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWhenWithBlockOfWorkUnit_MatchedExpression()
	 * @model
	 * @generated
	 */
	String getMatchedExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getMatchedExpression <em>Matched Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matched Expression</em>' attribute.
	 * @see #getMatchedExpression()
	 * @generated
	 */
	void setMatchedExpression(String value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWhenWithBlockOfWorkUnit_IsMatched()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getIsMatched();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getIsMatched <em>Is Matched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Matched</em>' attribute.
	 * @see #getIsMatched()
	 * @generated
	 */
	void setIsMatched(Boolean value);

} // WhenWithBlockOfWorkUnit
