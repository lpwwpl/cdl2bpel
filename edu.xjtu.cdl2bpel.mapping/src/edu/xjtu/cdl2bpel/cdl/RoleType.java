/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleType.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleType#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleType#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleType#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleType_Behaviors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorOfRoleType> getBehaviors();

	/**
	 * Returns the value of the '<em><b>Stateless</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateless</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateless</em>' attribute.
	 * @see #setStateless(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleType_Stateless()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getStateless();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleType#getStateless <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateless</em>' attribute.
	 * @see #getStateless()
	 * @generated
	 */
	void setStateless(Boolean value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleType_Free()
	 * @model
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleType#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Boolean value);
	
	public BehaviorOfRoleType getBehavior(String name);

} // RoleType
