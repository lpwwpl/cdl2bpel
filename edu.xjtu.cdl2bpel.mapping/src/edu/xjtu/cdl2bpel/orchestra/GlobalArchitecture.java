/**
 * CDL2BPEL_XJTU
 *
 * $Id: GlobalArchitecture.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInformationTypes <em>Information Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getBpOrchestras <em>Bp Orchestras</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture()
 * @model
 * @generated
 */
public interface GlobalArchitecture extends BPElement {
	/**
	 * Returns the value of the '<em><b>Stateless</b></em>' attribute.
	 * The default value is <code>"FALSE"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateless</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateless</em>' attribute.
	 * @see #setStateless(Boolean)
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture_Stateless()
	 * @model default="FALSE"
	 * @generated
	 */
	Boolean getStateless();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getStateless <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateless</em>' attribute.
	 * @see #getStateless()
	 * @generated
	 */
	void setStateless(Boolean value);

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterfaceOfGroup> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Information Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.InformationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture_InformationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationType> getInformationTypes();

	/**
	 * Returns the value of the '<em><b>Bp Orchestras</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bp Orchestras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bp Orchestras</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getGlobalArchitecture_BpOrchestras()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPOrchestra> getBpOrchestras();

	public BPOrchestra getBPOrchestra(String name);
	
	public InformationType getInformationType(String name);
	
	public String getFullyQualifiedName();
	
	public String getNameSpacePrefixForURI(String uri);
	
	public String getNameSpaceURIForPrefix(String prefix);
	
	public InterfaceOfGroup getInterfaceOfGroup(String name);
	
	public String getTargetNamespace();

	public void setTargetNamespace(String targetNamespace) ;

} // GlobalArchitecture
