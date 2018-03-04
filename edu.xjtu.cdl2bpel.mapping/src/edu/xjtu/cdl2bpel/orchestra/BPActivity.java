/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPActivity.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getCorrelationset <em>Correlationset</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getAdditional <em>Additional</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPActivity()
 * @model abstract="true"
 * @generated
 */
public interface BPActivity extends BPElement {
	/**
	 * Returns the value of the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlationset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlationset</em>' reference.
	 * @see #setCorrelationset(CorrelationSet)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPActivity_Correlationset()
	 * @model
	 * @generated
	 */
	CorrelationSet getCorrelationset();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getCorrelationset <em>Correlationset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlationset</em>' reference.
	 * @see #getCorrelationset()
	 * @generated
	 */
	void setCorrelationset(CorrelationSet value);

	/**
	 * Returns the value of the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional</em>' attribute.
	 * @see #setAdditional(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPActivity_Additional()
	 * @model
	 * @generated
	 */
	String getAdditional();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getAdditional <em>Additional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional</em>' attribute.
	 * @see #getAdditional()
	 * @generated
	 */
	void setAdditional(String value);

} // BPActivity
