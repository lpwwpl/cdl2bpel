/**
 * CDL2BPEL_XJTU
 *
 * $Id: FaultHandler.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.FaultHandler#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultHandler()
 * @model
 * @generated
 */
public interface FaultHandler extends BPOrderingStruturalActivity {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.FaultBranches}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultHandler_Activities()
	 * @model
	 * @generated
	 */
	EList<FaultBranches> getActivities();

} // FaultHandler
