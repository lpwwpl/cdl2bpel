/**
 * CDL2BPEL_XJTU
 *
 * $Id: ReceiveByExchange.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive By Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariable <em>Receive Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariablePart <em>Receive Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveCaseException <em>Receive Case Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getReceiveByExchange()
 * @model
 * @generated
 */
public interface ReceiveByExchange extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Receive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Variable</em>' reference.
	 * @see #setReceiveVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getReceiveByExchange_ReceiveVariable()
	 * @model
	 * @generated
	 */
	Variable getReceiveVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariable <em>Receive Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Variable</em>' reference.
	 * @see #getReceiveVariable()
	 * @generated
	 */
	void setReceiveVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Receive Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Variable Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Variable Part</em>' attribute.
	 * @see #setReceiveVariablePart(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getReceiveByExchange_ReceiveVariablePart()
	 * @model
	 * @generated
	 */
	String getReceiveVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariablePart <em>Receive Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Variable Part</em>' attribute.
	 * @see #getReceiveVariablePart()
	 * @generated
	 */
	void setReceiveVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Receive Case Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Case Exception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Case Exception</em>' attribute.
	 * @see #setReceiveCaseException(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getReceiveByExchange_ReceiveCaseException()
	 * @model
	 * @generated
	 */
	String getReceiveCaseException();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveCaseException <em>Receive Case Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Case Exception</em>' attribute.
	 * @see #getReceiveCaseException()
	 * @generated
	 */
	void setReceiveCaseException(String value);

} // ReceiveByExchange
