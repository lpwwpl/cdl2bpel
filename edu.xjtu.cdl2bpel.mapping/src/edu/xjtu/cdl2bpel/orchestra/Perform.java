/**
 * CDL2BPEL_XJTU
 *
 * $Id: Perform.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Perform#getBpOrchestra <em>Bp Orchestra</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Perform#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Perform#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Perform#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Perform#getVariableBindings <em>Variable Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Bp Orchestra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bp Orchestra</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bp Orchestra</em>' reference.
	 * @see #setBpOrchestra(BPOrchestra)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform_BpOrchestra()
	 * @model required="true"
	 * @generated
	 */
	BPOrchestra getBpOrchestra();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getBpOrchestra <em>Bp Orchestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bp Orchestra</em>' reference.
	 * @see #getBpOrchestra()
	 * @generated
	 */
	void setBpOrchestra(BPOrchestra value);

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform_InstanceId()
	 * @model
	 * @generated
	 */
	String getInstanceId();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getInstanceId <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Id</em>' attribute.
	 * @see #getInstanceId()
	 * @generated
	 */
	void setInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Isolated</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated</em>' attribute.
	 * @see #setIsolated(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform_Isolated()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getIsolated();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getIsolated <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolated</em>' attribute.
	 * @see #getIsolated()
	 * @generated
	 */
	void setIsolated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Wait For Completion</b></em>' attribute.
	 * The default value is <code>"TRUE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait For Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For Completion</em>' attribute.
	 * @see #setWaitForCompletion(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform_WaitForCompletion()
	 * @model default="TRUE"
	 * @generated
	 */
	Boolean getWaitForCompletion();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #getWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Variable Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.VariableBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Bindings</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getPerform_VariableBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableBinding> getVariableBindings();

} // Perform
