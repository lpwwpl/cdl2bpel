/**
 * CDL2BPEL_XJTU
 *
 * $Id: Token.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Token#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Type</em>' reference.
	 * @see #setInformationType(InformationType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getToken_InformationType()
	 * @model required="true"
	 * @generated
	 */
	InformationType getInformationType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Token#getInformationType <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(InformationType value);

} // Token
