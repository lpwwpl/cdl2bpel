/**
 * CDL2BPEL_XJTU
 *
 * $Id: Activity.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Activity#getLocked <em>Locked</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Activity#getState <em>State</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Activity#getTheBelongedRoleTypeMatrix <em>The Belonged Role Type Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked</em>' attribute.
	 * @see #setLocked(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActivity_Locked()
	 * @model
	 * @generated
	 */
	Boolean getLocked();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Activity#getLocked <em>Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked</em>' attribute.
	 * @see #getLocked()
	 * @generated
	 */
	void setLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity
	 * @see #setState(ActivityStateEnumByActivity)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActivity_State()
	 * @model
	 * @generated
	 */
	ActivityStateEnumByActivity getState();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Activity#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity
	 * @see #getState()
	 * @generated
	 */
	void setState(ActivityStateEnumByActivity value);

	/**
	 * Returns the value of the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Belonged Role Type Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Belonged Role Type Matrix</em>' reference.
	 * @see #setTheBelongedRoleTypeMatrix(RoleTypeMatrix)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActivity_TheBelongedRoleTypeMatrix()
	 * @model
	 * @generated
	 */
	RoleTypeMatrix getTheBelongedRoleTypeMatrix();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Activity#getTheBelongedRoleTypeMatrix <em>The Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Belonged Role Type Matrix</em>' reference.
	 * @see #getTheBelongedRoleTypeMatrix()
	 * @generated
	 */
	void setTheBelongedRoleTypeMatrix(RoleTypeMatrix value);

} // Activity
