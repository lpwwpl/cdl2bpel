/**
 * CDL2BPEL_XJTU
 *
 * $Id: ParticipateInfoByInteraction.java,v 1.1 2011/02/21 06:24:03 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participate Info By Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getFromRoleTypeRef <em>From Role Type Ref</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getToRoleTypeRef <em>To Role Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipateInfoByInteraction()
 * @model
 * @generated
 */
public interface ParticipateInfoByInteraction extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' reference.
	 * @see #setRelationshipType(RelationshipType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipateInfoByInteraction_RelationshipType()
	 * @model
	 * @generated
	 */
	RelationshipType getRelationshipType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getRelationshipType <em>Relationship Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' reference.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>From Role Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Role Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Role Type Ref</em>' reference.
	 * @see #setFromRoleTypeRef(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipateInfoByInteraction_FromRoleTypeRef()
	 * @model
	 * @generated
	 */
	RoleType getFromRoleTypeRef();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getFromRoleTypeRef <em>From Role Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Role Type Ref</em>' reference.
	 * @see #getFromRoleTypeRef()
	 * @generated
	 */
	void setFromRoleTypeRef(RoleType value);

	/**
	 * Returns the value of the '<em><b>To Role Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Role Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Role Type Ref</em>' reference.
	 * @see #setToRoleTypeRef(RoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipateInfoByInteraction_ToRoleTypeRef()
	 * @model
	 * @generated
	 */
	RoleType getToRoleTypeRef();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getToRoleTypeRef <em>To Role Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Role Type Ref</em>' reference.
	 * @see #getToRoleTypeRef()
	 * @generated
	 */
	void setToRoleTypeRef(RoleType value);

} // ParticipateInfoByInteraction
