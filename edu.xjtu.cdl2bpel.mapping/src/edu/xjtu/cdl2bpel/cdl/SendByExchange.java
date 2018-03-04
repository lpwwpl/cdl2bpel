/**
 * CDL2BPEL_XJTU
 *
 * $Id: SendByExchange.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send By Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariable <em>Send Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariablePart <em>Send Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendCaseException <em>Send Case Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getSendByExchange()
 * @model
 * @generated
 */
public interface SendByExchange extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Send Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Variable</em>' reference.
	 * @see #setSendVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getSendByExchange_SendVariable()
	 * @model
	 * @generated
	 */
	Variable getSendVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariable <em>Send Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Variable</em>' reference.
	 * @see #getSendVariable()
	 * @generated
	 */
	void setSendVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Send Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Variable Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Variable Part</em>' attribute.
	 * @see #setSendVariablePart(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getSendByExchange_SendVariablePart()
	 * @model
	 * @generated
	 */
	String getSendVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariablePart <em>Send Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Variable Part</em>' attribute.
	 * @see #getSendVariablePart()
	 * @generated
	 */
	void setSendVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Send Case Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Case Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Case Exception</em>' attribute.
	 * @see #setSendCaseException(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getSendByExchange_SendCaseException()
	 * @model
	 * @generated
	 */
	String getSendCaseException();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendCaseException <em>Send Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Case Exception</em>' attribute.
	 * @see #getSendCaseException()
	 * @generated
	 */
	void setSendCaseException(String value);

} // SendByExchange
