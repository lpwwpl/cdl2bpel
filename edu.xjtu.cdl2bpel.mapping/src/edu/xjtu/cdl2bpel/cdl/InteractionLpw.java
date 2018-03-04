/**
 * CDL2BPEL_XJTU
 *
 * $Id: InteractionLpw.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Lpw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getFromRoleType <em>From Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getToRoleType <em>To Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getOpperation <em>Opperation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAlign <em>Align</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAsyn <em>Asyn</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw()
 * @model
 * @generated
 */
public interface InteractionLpw extends CDLElement {
	/**
	 * Returns the value of the '<em><b>From Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Role Type</em>' reference.
	 * @see #setFromRoleType(RoleTypeZlp)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_FromRoleType()
	 * @model
	 * @generated
	 */
	RoleTypeZlp getFromRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getFromRoleType <em>From Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Role Type</em>' reference.
	 * @see #getFromRoleType()
	 * @generated
	 */
	void setFromRoleType(RoleTypeZlp value);

	/**
	 * Returns the value of the '<em><b>To Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Role Type</em>' reference.
	 * @see #setToRoleType(RoleTypeZlp)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_ToRoleType()
	 * @model
	 * @generated
	 */
	RoleTypeZlp getToRoleType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getToRoleType <em>To Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Role Type</em>' reference.
	 * @see #getToRoleType()
	 * @generated
	 */
	void setToRoleType(RoleTypeZlp value);

	/**
	 * Returns the value of the '<em><b>Opperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opperation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opperation</em>' attribute.
	 * @see #setOpperation(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_Opperation()
	 * @model
	 * @generated
	 */
	String getOpperation();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getOpperation <em>Opperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opperation</em>' attribute.
	 * @see #getOpperation()
	 * @generated
	 */
	void setOpperation(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_Timeout()
	 * @model
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_Align()
	 * @model
	 * @generated
	 */
	Boolean getAlign();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' reference.
	 * @see #setInteraction(Interaction)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_Interaction()
	 * @model
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getInteraction <em>Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Asyn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asyn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asyn</em>' attribute.
	 * @see #setAsyn(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteractionLpw_Asyn()
	 * @model
	 * @generated
	 */
	Boolean getAsyn();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAsyn <em>Asyn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asyn</em>' attribute.
	 * @see #getAsyn()
	 * @generated
	 */
	void setAsyn(Boolean value);

} // InteractionLpw
