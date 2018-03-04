/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExceptionBlock.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.ExceptionBlock#getExceptionWorkUnits <em>Exception Work Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExceptionBlock()
 * @model
 * @generated
 */
public interface ExceptionBlock extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Exception Work Units</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Work Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Work Units</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getExceptionBlock_ExceptionWorkUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExceptionWorkUnit> getExceptionWorkUnits();

} // ExceptionBlock
