/**
 * CDL2BPEL_XJTU
 *
 * $Id: Identity.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Identity#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Identity#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getIdentity()
 * @model
 * @generated
 */
public interface Identity extends BPElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum
	 * @see #setType(IdentityTypeEnum)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getIdentity_Type()
	 * @model
	 * @generated
	 */
	IdentityTypeEnum getType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Identity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(IdentityTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference.
	 * @see #setTokens(TokenOfProperty)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getIdentity_Tokens()
	 * @model
	 * @generated
	 */
	TokenOfProperty getTokens();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Identity#getTokens <em>Tokens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' reference.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(TokenOfProperty value);

} // Identity
