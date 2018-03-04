/**
 * CDL2BPEL_XJTU
 *
 * $Id: OnAlarm.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeToComplete <em>Time To Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeoutActivityTypes <em>Timeout Activity Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnAlarm()
 * @model
 * @generated
 */
public interface OnAlarm extends BPOrderingStruturalActivity {
	/**
	 * Returns the value of the '<em><b>Time To Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Complete</em>' attribute.
	 * @see #setTimeToComplete(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnAlarm_TimeToComplete()
	 * @model
	 * @generated
	 */
	String getTimeToComplete();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeToComplete <em>Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Complete</em>' attribute.
	 * @see #getTimeToComplete()
	 * @generated
	 */
	void setTimeToComplete(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Activity Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Activity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Activity Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOnAlarm_TimeoutActivityTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPActivity> getTimeoutActivityTypes();

} // OnAlarm
