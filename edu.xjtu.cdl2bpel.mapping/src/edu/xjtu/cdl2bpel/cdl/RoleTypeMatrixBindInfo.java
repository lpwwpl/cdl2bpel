/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeMatrixBindInfo.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type Matrix Bind Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getThisRoleTypeMatrix <em>This Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getFreeRoleTypeMatrix <em>Free Role Type Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrixBindInfo()
 * @model
 * @generated
 */
public interface RoleTypeMatrixBindInfo extends CDLElement {
	/**
	 * Returns the value of the '<em><b>This Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This Role Type Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Role Type Matrix</em>' reference.
	 * @see #setThisRoleTypeMatrix(RoleTypeMatrix)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrixBindInfo_ThisRoleTypeMatrix()
	 * @model
	 * @generated
	 */
	RoleTypeMatrix getThisRoleTypeMatrix();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getThisRoleTypeMatrix <em>This Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Role Type Matrix</em>' reference.
	 * @see #getThisRoleTypeMatrix()
	 * @generated
	 */
	void setThisRoleTypeMatrix(RoleTypeMatrix value);

	/**
	 * Returns the value of the '<em><b>Free Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Role Type Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Role Type Matrix</em>' reference.
	 * @see #setFreeRoleTypeMatrix(RoleTypeMatrix)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrixBindInfo_FreeRoleTypeMatrix()
	 * @model
	 * @generated
	 */
	RoleTypeMatrix getFreeRoleTypeMatrix();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getFreeRoleTypeMatrix <em>Free Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Role Type Matrix</em>' reference.
	 * @see #getFreeRoleTypeMatrix()
	 * @generated
	 */
	void setFreeRoleTypeMatrix(RoleTypeMatrix value);

} // RoleTypeMatrixBindInfo
