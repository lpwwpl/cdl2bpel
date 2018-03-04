/**
 * CDL2BPEL_XJTU
 *
 * $Id: Finalize.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finalize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreographyInstanceId <em>Choreography Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Finalize#getFinalizerBlock <em>Finalizer Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Finalize#getRoleTypeMatrixBindInfo <em>Role Type Matrix Bind Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getFinalize()
 * @model
 * @generated
 */
public interface Finalize extends Activity {
	/**
	 * Returns the value of the '<em><b>Choreography</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography</em>' reference.
	 * @see #setChoreography(Choreography)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getFinalize_Choreography()
	 * @model required="true"
	 * @generated
	 */
	Choreography getChoreography();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreography <em>Choreography</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography</em>' reference.
	 * @see #getChoreography()
	 * @generated
	 */
	void setChoreography(Choreography value);

	/**
	 * Returns the value of the '<em><b>Choreography Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Instance Id</em>' attribute.
	 * @see #setChoreographyInstanceId(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getFinalize_ChoreographyInstanceId()
	 * @model
	 * @generated
	 */
	String getChoreographyInstanceId();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreographyInstanceId <em>Choreography Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Instance Id</em>' attribute.
	 * @see #getChoreographyInstanceId()
	 * @generated
	 */
	void setChoreographyInstanceId(String value);

	/**
	 * Returns the value of the '<em><b>Finalizer Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalizer Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalizer Block</em>' reference.
	 * @see #setFinalizerBlock(FinalizerBlock)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getFinalize_FinalizerBlock()
	 * @model
	 * @generated
	 */
	FinalizerBlock getFinalizerBlock();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getFinalizerBlock <em>Finalizer Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalizer Block</em>' reference.
	 * @see #getFinalizerBlock()
	 * @generated
	 */
	void setFinalizerBlock(FinalizerBlock value);

	/**
	 * Returns the value of the '<em><b>Role Type Matrix Bind Info</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Matrix Bind Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Matrix Bind Info</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getFinalize_RoleTypeMatrixBindInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleTypeMatrixBindInfo> getRoleTypeMatrixBindInfo();

} // Finalize
