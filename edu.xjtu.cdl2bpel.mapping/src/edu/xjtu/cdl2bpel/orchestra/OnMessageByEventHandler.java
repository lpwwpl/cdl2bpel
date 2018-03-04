/**
 * CDL2BPEL_XJTU
 *
 * $Id: OnMessageByEventHandler.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Message By Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPortType <em>Port Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnMessageByEventHandler()
 * @model
 * @generated
 */
public interface OnMessageByEventHandler extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' attribute.
	 * @see #setPartnerLink(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnMessageByEventHandler_PartnerLink()
	 * @model
	 * @generated
	 */
	String getPartnerLink();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPartnerLink <em>Partner Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' attribute.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(String value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see #setPortType(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnMessageByEventHandler_PortType()
	 * @model
	 * @generated
	 */
	String getPortType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPortType <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' attribute.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnMessageByEventHandler_Operation()
	 * @model
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnMessageByEventHandler_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // OnMessageByEventHandler
