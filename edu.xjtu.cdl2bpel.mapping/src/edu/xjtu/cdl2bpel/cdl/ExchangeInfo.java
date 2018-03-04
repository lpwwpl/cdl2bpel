/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExchangeInfo.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getAction <em>Action</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendRecordReference <em>Send Record Reference</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveRecordReference <em>Receive Record Reference</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariable <em>Send Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariablePart <em>Send Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfSend <em>Cause Exception Of Send</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariable <em>Receive Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariablePart <em>Receive Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfReceive <em>Cause Exception Of Receive</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo()
 * @model
 * @generated
 */
public interface ExchangeInfo extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(InfoOrChannel)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_Type()
	 * @model
	 * @generated
	 */
	InfoOrChannel getType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(InfoOrChannel value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo
	 * @see #setAction(ActionTypeEnumByExchangeInfo)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_Action()
	 * @model required="true"
	 * @generated
	 */
	ActionTypeEnumByExchangeInfo getAction();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionTypeEnumByExchangeInfo value);

	/**
	 * Returns the value of the '<em><b>Send Record Reference</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Record Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Record Reference</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_SendRecordReference()
	 * @model
	 * @generated
	 */
	EList<RecordElementInfo> getSendRecordReference();

	/**
	 * Returns the value of the '<em><b>Receive Record Reference</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Record Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Record Reference</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_ReceiveRecordReference()
	 * @model
	 * @generated
	 */
	EList<RecordElementInfo> getReceiveRecordReference();

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_FaultName()
	 * @model
	 * @generated
	 */
	String getFaultName();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getFaultName <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Name</em>' attribute.
	 * @see #getFaultName()
	 * @generated
	 */
	void setFaultName(String value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_SendVariable()
	 * @model
	 * @generated
	 */
	Variable getSendVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariable <em>Send Variable</em>}' reference.
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_SendVariablePart()
	 * @model
	 * @generated
	 */
	String getSendVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariablePart <em>Send Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Variable Part</em>' attribute.
	 * @see #getSendVariablePart()
	 * @generated
	 */
	void setSendVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Cause Exception Of Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Exception Of Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Exception Of Send</em>' attribute.
	 * @see #setCauseExceptionOfSend(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_CauseExceptionOfSend()
	 * @model
	 * @generated
	 */
	String getCauseExceptionOfSend();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfSend <em>Cause Exception Of Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Exception Of Send</em>' attribute.
	 * @see #getCauseExceptionOfSend()
	 * @generated
	 */
	void setCauseExceptionOfSend(String value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_ReceiveVariable()
	 * @model
	 * @generated
	 */
	Variable getReceiveVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariable <em>Receive Variable</em>}' reference.
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_ReceiveVariablePart()
	 * @model
	 * @generated
	 */
	String getReceiveVariablePart();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariablePart <em>Receive Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Variable Part</em>' attribute.
	 * @see #getReceiveVariablePart()
	 * @generated
	 */
	void setReceiveVariablePart(String value);

	/**
	 * Returns the value of the '<em><b>Cause Exception Of Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Exception Of Receive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Exception Of Receive</em>' attribute.
	 * @see #setCauseExceptionOfReceive(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExchangeInfo_CauseExceptionOfReceive()
	 * @model
	 * @generated
	 */
	String getCauseExceptionOfReceive();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfReceive <em>Cause Exception Of Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Exception Of Receive</em>' attribute.
	 * @see #getCauseExceptionOfReceive()
	 * @generated
	 */
	void setCauseExceptionOfReceive(String value);

	/**
	 * Get the interaction which the exchangeInfo belonged to.
	 * 
	 * @return the value of the interaction which the exchangeInfo belonged to
	 */
	public Interaction getBelongedInteraction();
} // ExchangeInfo
