/**
 * CDL2BPEL_XJTU
 *
 * $Id: Identity.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Identity#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Identity#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getIdentity()
 * @model
 * @generated
 */
public interface Identity extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify
	 * @see #setType(KeyTypeEnumByIdentify)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getIdentity_Type()
	 * @model required="true"
	 * @generated
	 */
	KeyTypeEnumByIdentify getType();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Identity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify
	 * @see #getType()
	 * @generated
	 */
	void setType(KeyTypeEnumByIdentify value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getIdentity_Tokens()
	 * @model required="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // Identity
