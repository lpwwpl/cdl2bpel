/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPElement.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.ecore.EObject;

import edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getName <em>Name</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPElement()
 * @model abstract="true"
 * @generated
 */
public interface BPElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' attribute.
	 * @see #setAddition(String)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getBPElement_Addition()
	 * @model
	 * @generated
	 */
	String getAddition();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getAddition <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' attribute.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(String value);

	public BPOrchestra getBelongedBPOrchestra();
	
	public BPElement getParent();
	
	public GlobalArchitecture getGlobalArchitecture();
	
	public  GlobalArchitectureImpl getGlobalArchitectureImpl();
	
	public void transtorm(Orchestra2BPELContext context);

} // BPElement
