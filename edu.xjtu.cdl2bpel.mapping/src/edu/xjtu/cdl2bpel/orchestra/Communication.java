/**
 * CDL2BPEL_XJTU
 *
 * $Id: Communication.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Communication#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariable <em>Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariablePart <em>Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Communication#getMessage <em>Message</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Communication#getCorrelation <em>Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication()
 * @model abstract="true"
 * @generated
 */
public interface Communication extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Type</em>' reference.
	 * @see #setChannelType(ChannelType)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication_ChannelType()
	 * @model required="true"
	 * @generated
	 */
	ChannelType getChannelType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getChannelType <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' reference.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(ChannelType value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Part</em>' attribute.
	 * @see #setVariablePart(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication_VariablePart()
	 * @model
	 * @generated
	 */
	String getVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariablePart <em>Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Part</em>' attribute.
	 * @see #getVariablePart()
	 * @generated
	 */
	void setVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication_Message()
	 * @model required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation</em>' reference.
	 * @see #setCorrelation(Correlation)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCommunication_Correlation()
	 * @model
	 * @generated
	 */
	Correlation getCorrelation();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getCorrelation <em>Correlation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation</em>' reference.
	 * @see #getCorrelation()
	 * @generated
	 */
	void setCorrelation(Correlation value);

	public String getOperationName();
	
	public String getFaultName();
	
	public String getMessageType();
	public MessageTypeEnumByInteraction getClassification();
	public String getFullyQualifiedFaultName();

} // Communication
