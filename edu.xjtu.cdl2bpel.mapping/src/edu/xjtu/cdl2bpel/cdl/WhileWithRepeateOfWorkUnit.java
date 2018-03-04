/**
 * CDL2BPEL_XJTU
 *
 * $Id: WhileWithRepeateOfWorkUnit.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While With Repeate Of Work Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit#getBreakOutExpression <em>Break Out Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWhileWithRepeateOfWorkUnit()
 * @model
 * @generated
 */
public interface WhileWithRepeateOfWorkUnit extends WorkUnit {
	/**
	 * Returns the value of the '<em><b>Break Out Expression</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Out Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Out Expression</em>' attribute.
	 * @see #setBreakOutExpression(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getWhileWithRepeateOfWorkUnit_BreakOutExpression()
	 * @model default="true"
	 * @generated
	 */
	String getBreakOutExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit#getBreakOutExpression <em>Break Out Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Out Expression</em>' attribute.
	 * @see #getBreakOutExpression()
	 * @generated
	 */
	void setBreakOutExpression(String value);

} // WhileWithRepeateOfWorkUnit
