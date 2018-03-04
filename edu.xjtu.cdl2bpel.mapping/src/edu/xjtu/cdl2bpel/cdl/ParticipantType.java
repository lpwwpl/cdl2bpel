/**
 * CDL2BPEL_XJTU
 *
 * $Id: ParticipantType.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipantType()
 * @model
 * @generated
 */
public interface ParticipantType extends CDLElement {
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipantType_RoleTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<RoleType> getRoleTypes();

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipantType_Stateless()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getStateless();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getStateless <em>Stateless</em>}' attribute.
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getParticipantType_Free()
	 * @model
	 * @generated
	 */
	Boolean getFree();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Boolean value);

} // ParticipantType
