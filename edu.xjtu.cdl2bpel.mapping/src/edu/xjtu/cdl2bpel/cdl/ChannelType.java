/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChannelType.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getUsage <em>Usage</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getAction <em>Action</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getPassingInfoByChannel <em>Passing Info By Channel</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getTheBehaviorOfTheRoleType <em>The Behavior Of The Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getReferencedToken <em>Referenced Token</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getIdentities <em>Identities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType()
 * @model
 * @generated
 */
public interface ChannelType extends InfoOrChannel {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType
	 * @see #setUsage(UsageTypeEnumByChannelType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_Usage()
	 * @model
	 * @generated
	 */
	UsageTypeEnumByChannelType getUsage();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageTypeEnumByChannelType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
	 * @see #setAction(ActionTypeEnumByChannelType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_Action()
	 * @model
	 * @generated
	 */
	ActionTypeEnumByChannelType getAction();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionTypeEnumByChannelType value);

	/**
	 * Returns the value of the '<em><b>Passing Info By Channel</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passing Info By Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Info By Channel</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_PassingInfoByChannel()
	 * @model containment="true"
	 * @generated
	 */
	EList<PassingInfoOfTheChannelType> getPassingInfoByChannel();

	/**
	 * Returns the value of the '<em><b>The Behavior Of The Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Behavior Of The Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Behavior Of The Role Type</em>' reference.
	 * @see #setTheBehaviorOfTheRoleType(BehaviorOfRoleType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_TheBehaviorOfTheRoleType()
	 * @model
	 * @generated
	 */
	BehaviorOfRoleType getTheBehaviorOfTheRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getTheBehaviorOfTheRoleType <em>The Behavior Of The Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Behavior Of The Role Type</em>' reference.
	 * @see #getTheBehaviorOfTheRoleType()
	 * @generated
	 */
	void setTheBehaviorOfTheRoleType(BehaviorOfRoleType value);

	/**
	 * Returns the value of the '<em><b>Referenced Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Token</em>' reference.
	 * @see #setReferencedToken(Token)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_ReferencedToken()
	 * @model required="true"
	 * @generated
	 */
	Token getReferencedToken();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getReferencedToken <em>Referenced Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Token</em>' reference.
	 * @see #getReferencedToken()
	 * @generated
	 */
	void setReferencedToken(Token value);

	/**
	 * Returns the value of the '<em><b>Identities</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identities</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_Identities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identity> getIdentities();

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChannelType_RoleType()
	 * @model required="true"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // ChannelType
