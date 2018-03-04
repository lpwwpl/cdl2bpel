/**
 * CDL2BPEL_XJTU
 *
 * $Id: BindInfo.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisVariable <em>This Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisRole <em>This Role</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeVariable <em>Free Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeRole <em>Free Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getBindInfo()
 * @model
 * @generated
 */
public interface BindInfo extends CDLElement {
	/**
	 * Returns the value of the '<em><b>This Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Variable</em>' reference.
	 * @see #setThisVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getBindInfo_ThisVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getThisVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisVariable <em>This Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Variable</em>' reference.
	 * @see #getThisVariable()
	 * @generated
	 */
	void setThisVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>This Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Role</em>' reference.
	 * @see #setThisRole(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getBindInfo_ThisRole()
	 * @model required="true"
	 * @generated
	 */
	RoleType getThisRole();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisRole <em>This Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Role</em>' reference.
	 * @see #getThisRole()
	 * @generated
	 */
	void setThisRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Free Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Variable</em>' reference.
	 * @see #setFreeVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getBindInfo_FreeVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getFreeVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeVariable <em>Free Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Variable</em>' reference.
	 * @see #getFreeVariable()
	 * @generated
	 */
	void setFreeVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Free Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Role</em>' reference.
	 * @see #setFreeRole(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getBindInfo_FreeRole()
	 * @model required="true"
	 * @generated
	 */
	RoleType getFreeRole();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeRole <em>Free Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Role</em>' reference.
	 * @see #getFreeRole()
	 * @generated
	 */
	void setFreeRole(RoleType value);

} // BindInfo
