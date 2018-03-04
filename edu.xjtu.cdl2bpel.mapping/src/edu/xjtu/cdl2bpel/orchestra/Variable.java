/**
 * CDL2BPEL_XJTU
 *
 * $Id: Variable.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Variable#getMutable <em>Mutable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Variable#getFree <em>Free</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Variable#getSilent <em>Silent</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Variable#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends BPElement {
	/**
	 * Returns the value of the '<em><b>Mutable</b></em>' attribute.
	 * The default value is <code>"TRUE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable</em>' attribute.
	 * @see #setMutable(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariable_Mutable()
	 * @model default="TRUE"
	 * @generated
	 */
	Boolean getMutable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable</em>' attribute.
	 * @see #getMutable()
	 * @generated
	 */
	void setMutable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariable_Free()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Boolean value);

	/**
	 * Returns the value of the '<em><b>Silent</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silent</em>' attribute.
	 * @see #setSilent(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariable_Silent()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getSilent();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getSilent <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silent</em>' attribute.
	 * @see #getSilent()
	 * @generated
	 */
	void setSilent(Boolean value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariable_InformationType()
	 * @model
	 * @generated
	 */
	InformationType getInformationType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getInformationType <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(InformationType value);

} // Variable
