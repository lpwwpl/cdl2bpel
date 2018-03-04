/**
 * CDL2BPEL_XJTU
 *
 * $Id: Variable.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Variable#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Variable#getMutable <em>Mutable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Variable#getFree <em>Free</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Variable#getSilent <em>Silent</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Variable#getRoleTypes <em>Role Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(InfoOrChannel)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	InfoOrChannel getType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(InfoOrChannel value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable_Mutable()
	 * @model default="TRUE"
	 * @generated
	 */
	Boolean getMutable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Variable#getMutable <em>Mutable</em>}' attribute.
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable_Free()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Variable#getFree <em>Free</em>}' attribute.
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable_Silent()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getSilent();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Variable#getSilent <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silent</em>' attribute.
	 * @see #getSilent()
	 * @generated
	 */
	void setSilent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Role Types</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Types</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getVariable_RoleTypes()
	 * @model
	 * @generated
	 */
	EList<RoleType> getRoleTypes();

} // Variable
