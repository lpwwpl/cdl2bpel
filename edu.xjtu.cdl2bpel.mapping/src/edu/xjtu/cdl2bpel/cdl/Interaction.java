/**
 * CDL2BPEL_XJTU
 *
 * $Id: Interaction.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getChannelVariable <em>Channel Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutOfTimeToComplete <em>Timeout Of Time To Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getAlign <em>Align</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getExchangeInfos <em>Exchange Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getRecordInfos <em>Record Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutFromRoleTypeRecordInfo <em>Timeout From Role Type Record Info</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutToRoleTypeRecordInfo <em>Timeout To Role Type Record Info</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getFromRoleTypeOfBelongedRoleTypeMatrix <em>From Role Type Of Belonged Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getToRoleTypeOfBelongedRoleTypeMatrix <em>To Role Type Of Belonged Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Interaction#getParticipateByInteraction <em>Participate By Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Activity {
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_Operation()
	 * @model required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Channel Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Variable</em>' reference.
	 * @see #setChannelVariable(Variable)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_ChannelVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getChannelVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getChannelVariable <em>Channel Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Variable</em>' reference.
	 * @see #getChannelVariable()
	 * @generated
	 */
	void setChannelVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Timeout Of Time To Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Of Time To Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Of Time To Complete</em>' attribute.
	 * @see #setTimeoutOfTimeToComplete(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_TimeoutOfTimeToComplete()
	 * @model
	 * @generated
	 */
	String getTimeoutOfTimeToComplete();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutOfTimeToComplete <em>Timeout Of Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Of Time To Complete</em>' attribute.
	 * @see #getTimeoutOfTimeToComplete()
	 * @generated
	 */
	void setTimeoutOfTimeToComplete(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_Align()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getAlign();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Boolean value);

	/**
	 * Returns the value of the '<em><b>Initiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate</em>' attribute.
	 * @see #setInitiate(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_Initiate()
	 * @model default="false"
	 * @generated
	 */
	Boolean getInitiate();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getInitiate <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate</em>' attribute.
	 * @see #getInitiate()
	 * @generated
	 */
	void setInitiate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(RelationshipType)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_Relationship()
	 * @model required="true"
	 * @generated
	 */
	RelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Exchange Infos</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Infos</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_ExchangeInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExchangeInfo> getExchangeInfos();

	/**
	 * Returns the value of the '<em><b>Record Infos</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Infos</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_RecordInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordElementInfo> getRecordInfos();

	/**
	 * Returns the value of the '<em><b>Timeout From Role Type Record Info</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout From Role Type Record Info</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout From Role Type Record Info</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_TimeoutFromRoleTypeRecordInfo()
	 * @model
	 * @generated
	 */
	EList<RecordElementInfo> getTimeoutFromRoleTypeRecordInfo();

	/**
	 * Returns the value of the '<em><b>Timeout To Role Type Record Info</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout To Role Type Record Info</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout To Role Type Record Info</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_TimeoutToRoleTypeRecordInfo()
	 * @model
	 * @generated
	 */
	EList<RecordElementInfo> getTimeoutToRoleTypeRecordInfo();

	/**
	 * Returns the value of the '<em><b>From Role Type Of Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Role Type Of Belonged Role Type Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Role Type Of Belonged Role Type Matrix</em>' reference.
	 * @see #setFromRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_FromRoleTypeOfBelongedRoleTypeMatrix()
	 * @model
	 * @generated
	 */
	RoleTypeMatrix getFromRoleTypeOfBelongedRoleTypeMatrix();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getFromRoleTypeOfBelongedRoleTypeMatrix <em>From Role Type Of Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Role Type Of Belonged Role Type Matrix</em>' reference.
	 * @see #getFromRoleTypeOfBelongedRoleTypeMatrix()
	 * @generated
	 */
	void setFromRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix value);

	/**
	 * Returns the value of the '<em><b>To Role Type Of Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Role Type Of Belonged Role Type Matrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Role Type Of Belonged Role Type Matrix</em>' reference.
	 * @see #setToRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_ToRoleTypeOfBelongedRoleTypeMatrix()
	 * @model
	 * @generated
	 */
	RoleTypeMatrix getToRoleTypeOfBelongedRoleTypeMatrix();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getToRoleTypeOfBelongedRoleTypeMatrix <em>To Role Type Of Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Role Type Of Belonged Role Type Matrix</em>' reference.
	 * @see #getToRoleTypeOfBelongedRoleTypeMatrix()
	 * @generated
	 */
	void setToRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix value);

	/**
	 * Returns the value of the '<em><b>Participate By Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participate By Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participate By Interaction</em>' reference.
	 * @see #setParticipateByInteraction(ParticipateInfoByInteraction)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getInteraction_ParticipateByInteraction()
	 * @model required="true"
	 * @generated
	 */
	ParticipateInfoByInteraction getParticipateByInteraction();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getParticipateByInteraction <em>Participate By Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participate By Interaction</em>' reference.
	 * @see #getParticipateByInteraction()
	 * @generated
	 */
	void setParticipateByInteraction(ParticipateInfoByInteraction value);

	/**
	 * Get the RecordElementInfo by the param 'name'.
	 * 
	 * @param name the name value of the RecordElementInfo
	 * @return the RecordElementInfo identified by param 'name'
	 */
	public RecordElementInfo getRecordElementInfo(String name);
	
	/**
	 * Get the toRole of the Interaction
	 * 
	 * @return the toRole of the Interaction 
	 */
	public RoleType getTheToRoleOfInteraction();
	
	/**
	 * Get the From Role Of the Interaction
	 * 
	 * @return the fromRole of the Interaction
	 */
	public RoleType getTheFromRoleOfInteraction();
	
	/**
	 * Get The request exchanges of the Interaction
	 * 
	 * @return the request exchanges matrix of the Interaction
	 */
	public ExchangeInfo[] getRequestExchanges();
	
	/**
	 * Get The response exchanges of the Interaction
	 * 
	 * @return the response exchanges matrix of the Interaction
	 */
	public ExchangeInfo[] getResponseExchanges();
	
	/**
	 * Get the fault exchanges of the Interaction
	 * 
	 * @return the fault exchanges matrix of the Interaction
	 */
	public ExchangeInfo[] getFaultExchanges();
} // Interaction
