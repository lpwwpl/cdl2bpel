/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeZlp.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type Zlp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getParticipantBelongedByRoleType <em>Participant Belonged By Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeZlp()
 * @model
 * @generated
 */
public interface RoleTypeZlp extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Participant Belonged By Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Belonged By Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Belonged By Role Type</em>' reference.
	 * @see #setParticipantBelongedByRoleType(ParticipantType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeZlp_ParticipantBelongedByRoleType()
	 * @model
	 * @generated
	 */
	ParticipantType getParticipantBelongedByRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getParticipantBelongedByRoleType <em>Participant Belonged By Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Belonged By Role Type</em>' reference.
	 * @see #getParticipantBelongedByRoleType()
	 * @generated
	 */
	void setParticipantBelongedByRoleType(ParticipantType value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getRoleTypeZlp_Free()
	 * @model
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Boolean value);

} // RoleTypeZlp
