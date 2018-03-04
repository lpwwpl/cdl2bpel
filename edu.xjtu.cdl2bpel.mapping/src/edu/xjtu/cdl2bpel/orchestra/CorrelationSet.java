/**
 * CDL2BPEL_XJTU
 *
 * $Id: CorrelationSet.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelationSet()
 * @model
 * @generated
 */
public interface CorrelationSet extends BPElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelationSet_Properties()
	 * @model
	 * @generated
	 */
	String getProperties();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(String value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelationSet_Token()
	 * @model
	 * @generated
	 */
	TokenOfProperty getToken();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(TokenOfProperty value);

} // CorrelationSet
