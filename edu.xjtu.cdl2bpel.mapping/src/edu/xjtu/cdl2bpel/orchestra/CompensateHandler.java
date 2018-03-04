/**
 * CDL2BPEL_XJTU
 *
 * $Id: CompensateHandler.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensate Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.CompensateHandler#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCompensateHandler()
 * @model
 * @generated
 */
public interface CompensateHandler extends BPOrderingStruturalActivity {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getCompensateHandler_Activities()
	 * @model changeable="false"
	 * @generated
	 */
	EList<BPActivity> getActivities();

} // CompensateHandler
