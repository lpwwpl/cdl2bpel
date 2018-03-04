/**
 * CDL2BPEL_XJTU
 *
 * $Id: RelationshipType.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfFirst <em>Role Type Of First</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeFirst <em>Behaviors Of Role Type First</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfSecond <em>Role Type Of Second</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeSecond <em>Behaviors Of Role Type Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Role Type Of First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Of First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Of First</em>' reference.
	 * @see #setRoleTypeOfFirst(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRelationshipType_RoleTypeOfFirst()
	 * @model required="true"
	 * @generated
	 */
	RoleType getRoleTypeOfFirst();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfFirst <em>Role Type Of First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Of First</em>' reference.
	 * @see #getRoleTypeOfFirst()
	 * @generated
	 */
	void setRoleTypeOfFirst(RoleType value);

	/**
	 * Returns the value of the '<em><b>Behaviors Of Role Type First</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors Of Role Type First</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors Of Role Type First</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRelationshipType_BehaviorsOfRoleTypeFirst()
	 * @model
	 * @generated
	 */
	EList<BehaviorOfRoleType> getBehaviorsOfRoleTypeFirst();

	/**
	 * Returns the value of the '<em><b>Role Type Of Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Of Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Of Second</em>' reference.
	 * @see #setRoleTypeOfSecond(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRelationshipType_RoleTypeOfSecond()
	 * @model required="true"
	 * @generated
	 */
	RoleType getRoleTypeOfSecond();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfSecond <em>Role Type Of Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Of Second</em>' reference.
	 * @see #getRoleTypeOfSecond()
	 * @generated
	 */
	void setRoleTypeOfSecond(RoleType value);

	/**
	 * Returns the value of the '<em><b>Behaviors Of Role Type Second</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviors Of Role Type Second</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviors Of Role Type Second</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRelationshipType_BehaviorsOfRoleTypeSecond()
	 * @model
	 * @generated
	 */
	EList<BehaviorOfRoleType> getBehaviorsOfRoleTypeSecond();

} // RelationshipType
