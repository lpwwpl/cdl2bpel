/**
 * CDL2BPEL_XJTU
 *
 * $Id: TokenLocator.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getQuery <em>Query</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getPart <em>Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getTokenLocator()
 * @model
 * @generated
 */
public interface TokenLocator extends BPElement {
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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getTokenLocator_Query()
	 * @model required="true"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getQuery <em>Query</em>}' attribute.
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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getTokenLocator_Part()
	 * @model
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getTokenLocator_InformationType()
	 * @model
	 * @generated
	 */
	InformationType getInformationType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getInformationType <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(InformationType value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(TokenOfProperty)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getTokenLocator_Token()
	 * @model
	 * @generated
	 */
	TokenOfProperty getToken();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenOfProperty value);

} // TokenLocator
