/**
 * CDL2BPEL_XJTU
 *
 * $Id: While.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.While#getBreakOutExpression <em>Break Out Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends BPOrderingStruturalActivity {
	/**
	 * Returns the value of the '<em><b>Break Out Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Out Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Out Expression</em>' attribute.
	 * @see #setBreakOutExpression(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getWhile_BreakOutExpression()
	 * @model
	 * @generated
	 */
	String getBreakOutExpression();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.While#getBreakOutExpression <em>Break Out Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Out Expression</em>' attribute.
	 * @see #getBreakOutExpression()
	 * @generated
	 */
	void setBreakOutExpression(String value);

} // While
