/**
 * CDL2BPEL_XJTU
 *
 * $Id: Assign.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Assign#getCopies <em>Copies</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Copies</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Copy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getAssign_Copies()
	 * @model
	 * @generated
	 */
	EList<Copy> getCopies();

} // Assign
