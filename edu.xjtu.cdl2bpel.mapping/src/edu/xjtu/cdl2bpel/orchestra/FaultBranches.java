/**
 * CDL2BPEL_XJTU
 *
 * $Id: FaultBranches.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Branches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultVariable <em>Fault Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getActivities <em>Activities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultType <em>Fault Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultBranches()
 * @model
 * @generated
 */
public interface FaultBranches extends BPActivity {
	/**
	 * Returns the value of the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Variable</em>' attribute.
	 * @see #setFaultVariable(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultBranches_FaultVariable()
	 * @model
	 * @generated
	 */
	String getFaultVariable();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultVariable <em>Fault Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Variable</em>' attribute.
	 * @see #getFaultVariable()
	 * @generated
	 */
	void setFaultVariable(String value);

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference.
	 * @see #setActivities(BPActivity)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultBranches_Activities()
	 * @model
	 * @generated
	 */
	BPActivity getActivities();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getActivities <em>Activities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activities</em>' reference.
	 * @see #getActivities()
	 * @generated
	 */
	void setActivities(BPActivity value);

	/**
	 * Returns the value of the '<em><b>Fault Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Type</em>' attribute.
	 * @see #setFaultType(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getFaultBranches_FaultType()
	 * @model
	 * @generated
	 */
	String getFaultType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultType <em>Fault Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Type</em>' attribute.
	 * @see #getFaultType()
	 * @generated
	 */
	void setFaultType(String value);

} // FaultBranches
