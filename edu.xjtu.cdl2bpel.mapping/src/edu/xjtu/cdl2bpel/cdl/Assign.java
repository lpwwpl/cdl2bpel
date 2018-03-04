/**
 * CDL2BPEL_XJTU
 *
 * $Id: Assign.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Assign#getCopyOfAssign <em>Copy Of Assign</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Assign#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Activity {
	/**
	 * Returns the value of the '<em><b>Copy Of Assign</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Of Assign</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Of Assign</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getAssign_CopyOfAssign()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CopyOfAssign> getCopyOfAssign();

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getAssign_RoleType()
	 * @model required="true"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Assign#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // Assign
