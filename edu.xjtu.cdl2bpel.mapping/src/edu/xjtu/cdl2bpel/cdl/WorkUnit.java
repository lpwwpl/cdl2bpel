/**
 * CDL2BPEL_XJTU
 *
 * $Id: WorkUnit.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getBlock <em>Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getRepeatExpression <em>Repeat Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWorkUnit()
 * @model abstract="true"
 * @generated
 */
public interface WorkUnit extends OrderingStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Expression</em>' attribute.
	 * @see #setGuardExpression(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWorkUnit_GuardExpression()
	 * @model
	 * @generated
	 */
	String getGuardExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getGuardExpression <em>Guard Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' attribute.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWorkUnit_Block()
	 * @model
	 * @generated
	 */
	String getBlock();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(String value);

	/**
	 * Returns the value of the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Expression</em>' attribute.
	 * @see #setRepeatExpression(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWorkUnit_RepeatExpression()
	 * @model
	 * @generated
	 */
	String getRepeatExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getRepeatExpression <em>Repeat Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Expression</em>' attribute.
	 * @see #getRepeatExpression()
	 * @generated
	 */
	void setRepeatExpression(String value);

} // WorkUnit
