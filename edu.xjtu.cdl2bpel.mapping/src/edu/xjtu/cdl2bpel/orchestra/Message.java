/**
 * CDL2BPEL_XJTU
 *
 * $Id: Message.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Message#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Message#getParts <em>Parts</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Message#getClassification <em>Classification</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Message#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends BPElement {
	/**
	 * Returns the value of the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Name</em>' attribute.
	 * @see #setFaultName(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getMessage_FaultName()
	 * @model
	 * @generated
	 */
	String getFaultName();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Message#getFaultName <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Name</em>' attribute.
	 * @see #getFaultName()
	 * @generated
	 */
	void setFaultName(String value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getMessage_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction
	 * @see #setClassification(MessageTypeEnumByInteraction)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getMessage_Classification()
	 * @model
	 * @generated
	 */
	MessageTypeEnumByInteraction getClassification();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Message#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(MessageTypeEnumByInteraction value);

	/**
	 * Returns the value of the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Type</em>' reference.
	 * @see #setInformationType(InformationType)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getMessage_InformationType()
	 * @model
	 * @generated
	 */
	InformationType getInformationType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Message#getInformationType <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Type</em>' reference.
	 * @see #getInformationType()
	 * @generated
	 */
	void setInformationType(InformationType value);

	public Operation getOperation();
	public String getFullyQualifiedFaultName();

} // Message
