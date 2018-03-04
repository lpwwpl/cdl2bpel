/**
 * CDL2BPEL_XJTU
 *
 * $Id: Choreography.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getComplete <em>Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRoot <em>Root</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getCoordination <em>Coordination</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosedChoreographies <em>Enclosed Choreographies</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRoleTypeMatrixPlayingRoleInChoreo <em>Role Type Matrix Playing Role In Choreo</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getExceptionBlock <em>Exception Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getFinalizerBlocks <em>Finalizer Blocks</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getActivities <em>Activities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosingChoreographies <em>Enclosing Choreographies</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Complete()
	 * @model
	 * @generated
	 */
	String getComplete();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(String value);

	/**
	 * Returns the value of the '<em><b>Isolation</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolation</em>' attribute.
	 * @see #setIsolation(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Isolation()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getIsolation();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getIsolation <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolation</em>' attribute.
	 * @see #getIsolation()
	 * @generated
	 */
	void setIsolation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Root()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getRoot();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Coordination</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination</em>' attribute.
	 * @see #setCoordination(Boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Coordination()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getCoordination();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getCoordination <em>Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination</em>' attribute.
	 * @see #getCoordination()
	 * @generated
	 */
	void setCoordination(Boolean value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Relationships()
	 * @model
	 * @generated
	 */
	EList<RelationshipType> getRelationships();

	/**
	 * Returns the value of the '<em><b>Enclosed Choreographies</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Choreography}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosed Choreographies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed Choreographies</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_EnclosedChoreographies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choreography> getEnclosedChoreographies();

	/**
	 * Returns the value of the '<em><b>Role Type Matrix Playing Role In Choreo</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Matrix Playing Role In Choreo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Matrix Playing Role In Choreo</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_RoleTypeMatrixPlayingRoleInChoreo()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleTypeMatrix> getRoleTypeMatrixPlayingRoleInChoreo();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Exception Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Block</em>' containment reference.
	 * @see #setExceptionBlock(ExceptionBlock)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_ExceptionBlock()
	 * @model containment="true"
	 * @generated
	 */
	ExceptionBlock getExceptionBlock();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getExceptionBlock <em>Exception Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Block</em>' containment reference.
	 * @see #getExceptionBlock()
	 * @generated
	 */
	void setExceptionBlock(ExceptionBlock value);

	/**
	 * Returns the value of the '<em><b>Finalizer Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.FinalizerBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalizer Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalizer Blocks</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_FinalizerBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FinalizerBlock> getFinalizerBlocks();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Enclosing Choreographies</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Choreography}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Choreographies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Choreographies</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreography_EnclosingChoreographies()
	 * @model
	 * @generated
	 */
	EList<Choreography> getEnclosingChoreographies();
	
	/**
	 * Return the FinalizerBlock of Choreography by name.
	 * 
	 * @param name the name of the finalizerBlock  
	 * @return the finalizerBlock of Choreography by name
	 */
	public FinalizerBlock getFinalizerBlock(String name);

	/**
	 * Return the EnclosedChoreography of Choreography by name
	 * 
	 * @param name the name of the enclosedChoreography
	 * @return the enclosed choreography of Choreography by name
	 */
	public Choreography getEnclosedChoreography(String name);
	
	/**
	 * Return the variable of Choreography by name
	 * 
	 * @param name the name of the variable
	 * @return the variable of Choreography by name
	 */
	public Variable getVariable(String name);

} // Choreography
