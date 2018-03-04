/**
 * CDL2BPEL_XJTU
 *
 * $Id: Compensation.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getCompletionHandler <em>Completion Handler</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getInstanceId <em>Instance Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCompensation()
 * @model
 * @generated
 */
public interface Compensation extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Completion Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Handler</em>' reference.
	 * @see #setCompletionHandler(CompensateHandler)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCompensation_CompletionHandler()
	 * @model required="true"
	 * @generated
	 */
	CompensateHandler getCompletionHandler();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getCompletionHandler <em>Completion Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Handler</em>' reference.
	 * @see #getCompletionHandler()
	 * @generated
	 */
	void setCompletionHandler(CompensateHandler value);

	/**
	 * Returns the value of the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Id</em>' attribute.
	 * @see #setInstanceId(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCompensation_InstanceId()
	 * @model
	 * @generated
	 */
	String getInstanceId();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getInstanceId <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Id</em>' attribute.
	 * @see #getInstanceId()
	 * @generated
	 */
	void setInstanceId(String value);

} // Compensation
