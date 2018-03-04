/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrderingStructuralActivity.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getOrderingStructuralActivity()
 * @model abstract="true"
 * @generated
 */
public interface OrderingStructuralActivity extends Activity {
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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getOrderingStructuralActivity_Activities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // OrderingStructuralActivity
