/**
 * CDL2BPEL_XJTU
 *
 * $Id: TokenLocator.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getToken <em>Token</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getQuery <em>Query</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getTokenLocator()
 * @model
 * @generated
 */
public interface TokenLocator extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getTokenLocator_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getTokenLocator_InformationType()
	 * @model required="true"
	 * @generated
	 */
	InformationType getInformationType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getInformationType <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(InformationType value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getTokenLocator_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getTokenLocator_Part()
	 * @model
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

} // TokenLocator
