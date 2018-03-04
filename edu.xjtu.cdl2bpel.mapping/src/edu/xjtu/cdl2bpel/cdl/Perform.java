/**
 * CDL2BPEL_XJTU
 *
 * $Id: Perform.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getBindsOfPerform <em>Binds Of Perform</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyInstanceId <em>Choreography Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getRoleTypeMatrixBindInfos <em>Role Type Matrix Bind Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#isBlock <em>Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyName <em>Choreography Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform()
 * @model
 * @generated
 */
public interface Perform extends Activity {
	/**
	 * Returns the value of the '<em><b>Binds Of Perform</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.BindInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds Of Perform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds Of Perform</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_BindsOfPerform()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindInfo> getBindsOfPerform();

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_ChoreographyInstanceId()
	 * @model
	 * @generated
	 */
	String getChoreographyInstanceId();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyInstanceId <em>Choreography Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Instance Id</em>' attribute.
	 * @see #getChoreographyInstanceId()
	 * @generated
	 */
	void setChoreographyInstanceId(String value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_Choreography()
	 * @model required="true"
	 * @generated
	 */
	Choreography getChoreography();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreography <em>Choreography</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography</em>' reference.
	 * @see #getChoreography()
	 * @generated
	 */
	void setChoreography(Choreography value);

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
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_WaitForCompletion()
	 * @model default="TRUE"
	 * @generated
	 */
	Boolean getWaitForCompletion();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Perform#getWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #getWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Role Type Matrix Bind Infos</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Matrix Bind Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Matrix Bind Infos</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_RoleTypeMatrixBindInfos()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleTypeMatrixBindInfo> getRoleTypeMatrixBindInfos();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(boolean)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_Block()
	 * @model
	 * @generated
	 */
	boolean isBlock();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Perform#isBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #isBlock()
	 * @generated
	 */
	void setBlock(boolean value);

	/**
	 * Returns the value of the '<em><b>Choreography Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Name</em>' attribute.
	 * @see #setChoreographyName(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPerform_ChoreographyName()
	 * @model
	 * @generated
	 */
	String getChoreographyName();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyName <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Name</em>' attribute.
	 * @see #getChoreographyName()
	 * @generated
	 */
	void setChoreographyName(String value);

} // Perform
