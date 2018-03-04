/**
 * CDL2BPEL_XJTU
 *
 * $Id: VariableBinding.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getParentVariable <em>Parent Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getBoundVariable <em>Bound Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariableBinding()
 * @model
 * @generated
 */
public interface VariableBinding extends BPElement {
	/**
	 * Returns the value of the '<em><b>Parent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Variable</em>' reference.
	 * @see #setParentVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariableBinding_ParentVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getParentVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getParentVariable <em>Parent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Variable</em>' reference.
	 * @see #getParentVariable()
	 * @generated
	 */
	void setParentVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Bound Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Variable</em>' reference.
	 * @see #setBoundVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getVariableBinding_BoundVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getBoundVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getBoundVariable <em>Bound Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Variable</em>' reference.
	 * @see #getBoundVariable()
	 * @generated
	 */
	void setBoundVariable(Variable value);

} // VariableBinding
