/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeMatrix.java,v 1.1 2011/02/21 06:24:03 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrix()
 * @model
 * @generated
 */
public interface RoleTypeMatrix extends CDLElement {
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrix_RoleTypes()
	 * @model
	 * @generated
	 */
	EList<RoleType> getRoleTypes();

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeMatrix_Free()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Boolean value);

} // RoleTypeMatrix
