/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPOrchestra.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Orchestra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompletionExpression <em>Completion Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosedBPOrchestra <em>Enclosed BP Orchestra</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getExceptionHandlers <em>Exception Handlers</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompensateHandlers <em>Compensate Handlers</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getRoot <em>Root</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getHasCompletionExpression <em>Has Completion Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getParticipants <em>Participants</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosingBPOrchestras <em>Enclosing BP Orchestras</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCoordinated <em>Coordinated</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getIsolate <em>Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra()
 * @model
 * @generated
 */
public interface BPOrchestra extends Sequence {
	/**
	 * Returns the value of the '<em><b>Completion Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Expression</em>' attribute.
	 * @see #setCompletionExpression(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_CompletionExpression()
	 * @model
	 * @generated
	 */
	String getCompletionExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompletionExpression <em>Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Expression</em>' attribute.
	 * @see #getCompletionExpression()
	 * @generated
	 */
	void setCompletionExpression(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Enclosed BP Orchestra</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosed BP Orchestra</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed BP Orchestra</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_EnclosedBPOrchestra()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPOrchestra> getEnclosedBPOrchestra();

	/**
	 * Returns the value of the '<em><b>Exception Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.FaultHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Handlers</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_ExceptionHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<FaultHandler> getExceptionHandlers();

	/**
	 * Returns the value of the '<em><b>Compensate Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.CompensateHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensate Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensate Handlers</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_CompensateHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompensateHandler> getCompensateHandlers();

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_Root()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getRoot();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Completion Expression</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Completion Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Completion Expression</em>' attribute.
	 * @see #setHasCompletionExpression(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_HasCompletionExpression()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getHasCompletionExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getHasCompletionExpression <em>Has Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Completion Expression</em>' attribute.
	 * @see #getHasCompletionExpression()
	 * @generated
	 */
	void setHasCompletionExpression(Boolean value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' attribute list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_Participants()
	 * @model
	 * @generated
	 */
	EList<String> getParticipants();

	/**
	 * Returns the value of the '<em><b>Enclosing BP Orchestras</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing BP Orchestras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing BP Orchestras</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_EnclosingBPOrchestras()
	 * @model
	 * @generated
	 */
	EList<BPOrchestra> getEnclosingBPOrchestras();

	/**
	 * Returns the value of the '<em><b>Coordinated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinated</em>' attribute.
	 * @see #setCoordinated(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_Coordinated()
	 * @model
	 * @generated
	 */
	Boolean getCoordinated();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCoordinated <em>Coordinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinated</em>' attribute.
	 * @see #getCoordinated()
	 * @generated
	 */
	void setCoordinated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolate</em>' attribute.
	 * @see #setIsolate(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrchestra_Isolate()
	 * @model
	 * @generated
	 */
	Boolean getIsolate();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getIsolate <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolate</em>' attribute.
	 * @see #getIsolate()
	 * @generated
	 */
	void setIsolate(Boolean value);

	/**
	 * 
	 * @param str
	 * @return
	 */
	public BPOrchestra getEnclosedBPOrchestraByName(String str);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Variable getVariable(String name);

	
	public CompensateHandler getCompensateHandler(String name);

} // BPOrchestra
