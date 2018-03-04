/**
 * CDL2BPEL_XJTU
 *
 * $Id: PassingInfoOfTheChannelType.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passing Info Of The Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getChannel <em>Channel</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getAction <em>Action</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getNew <em>New</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getEnclosingChannel <em>Enclosing Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPassingInfoOfTheChannelType()
 * @model
 * @generated
 */
public interface PassingInfoOfTheChannelType extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(ChannelType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPassingInfoOfTheChannelType_Channel()
	 * @model required="true"
	 * @generated
	 */
	ChannelType getChannel();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(ChannelType value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPassingInfoOfTheChannelType_Action()
	 * @model
	 * @generated
	 */
	ActionTypeEnumByChannelType getAction();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionTypeEnumByChannelType value);

	/**
	 * Returns the value of the '<em><b>New</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' attribute.
	 * @see #setNew(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPassingInfoOfTheChannelType_New()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getNew();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' attribute.
	 * @see #getNew()
	 * @generated
	 */
	void setNew(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enclosing Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Channel</em>' reference.
	 * @see #setEnclosingChannel(ChannelType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPassingInfoOfTheChannelType_EnclosingChannel()
	 * @model
	 * @generated
	 */
	ChannelType getEnclosingChannel();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getEnclosingChannel <em>Enclosing Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Channel</em>' reference.
	 * @see #getEnclosingChannel()
	 * @generated
	 */
	void setEnclosingChannel(ChannelType value);

} // PassingInfoOfTheChannelType
