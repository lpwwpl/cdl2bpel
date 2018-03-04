/**
 * CDL2BPEL_XJTU
 *
 * $Id: SendEnd.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.SendEnd#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getSendEnd()
 * @model
 * @generated
 */
public interface SendEnd extends Communication {
	/**
	 * Returns the value of the '<em><b>Is Created By Passed Channel</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Created By Passed Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Created By Passed Channel</em>' attribute.
	 * @see #setIsCreatedByPassedChannel(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getSendEnd_IsCreatedByPassedChannel()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getIsCreatedByPassedChannel();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.SendEnd#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Created By Passed Channel</em>' attribute.
	 * @see #getIsCreatedByPassedChannel()
	 * @generated
	 */
	void setIsCreatedByPassedChannel(Boolean value);

} // SendEnd
