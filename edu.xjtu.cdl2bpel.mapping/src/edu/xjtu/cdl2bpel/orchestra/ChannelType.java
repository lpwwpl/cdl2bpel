/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChannelType.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getUsage <em>Usage</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getChannelType()
 * @model
 * @generated
 */
public interface ChannelType extends Variable {
	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Type</em>' attribute.
	 * @see #setChannelType(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getChannelType_ChannelType()
	 * @model required="true"
	 * @generated
	 */
	String getChannelType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getChannelType <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' attribute.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(String value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' reference.
	 * @see #setInterfaceType(InterfaceOfGroup)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getChannelType_InterfaceType()
	 * @model required="true"
	 * @generated
	 */
	InterfaceOfGroup getInterfaceType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getInterfaceType <em>Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' reference.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(InterfaceOfGroup value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel
	 * @see #setUsage(UsageEnumByChannel)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getChannelType_Usage()
	 * @model
	 * @generated
	 */
	UsageEnumByChannel getUsage();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageEnumByChannel value);

	/**
	 * Returns the value of the '<em><b>Identities</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identities</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getChannelType_Identities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identity> getIdentities();

} // ChannelType
