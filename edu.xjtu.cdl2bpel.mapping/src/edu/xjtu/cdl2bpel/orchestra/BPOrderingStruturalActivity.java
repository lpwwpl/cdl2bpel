/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPOrderingStruturalActivity.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Ordering Strutural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity#getActivityTypes <em>Activity Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrderingStruturalActivity()
 * @model abstract="true"
 * @generated
 */
public interface BPOrderingStruturalActivity extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Activity Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPOrderingStruturalActivity_ActivityTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BPActivity> getActivityTypes();

	public boolean isConditionalGroupingConstruct();
	public boolean isSequentialGroupingConstruct();
	public boolean isConditionObservable();
	public void setActivityTypes(EList<BPActivity> activities);
} // BPOrderingStruturalActivity
