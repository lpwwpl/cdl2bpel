/**
 * CDL2BPEL_XJTU
 *
 * $Id: Correlation.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends BPElement {
	/**
	 * Returns the value of the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate</em>' attribute.
	 * @see #setInitiate(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelation_Initiate()
	 * @model
	 * @generated
	 */
	String getInitiate();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getInitiate <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate</em>' attribute.
	 * @see #getInitiate()
	 * @generated
	 */
	void setInitiate(String value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' reference.
	 * @see #setSet(CorrelationSet)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCorrelation_Set()
	 * @model
	 * @generated
	 */
	CorrelationSet getSet();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getSet <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(CorrelationSet value);

} // Correlation
