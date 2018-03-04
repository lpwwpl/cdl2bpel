/**
 * CDL2BPEL_XJTU
 *
 * $Id: InterfaceOfGroup.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Of Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getInterfaceOfGroup()
 * @model
 * @generated
 */
public interface InterfaceOfGroup extends BPElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getInterfaceOfGroup_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * 
	 * @return
	 */
	public String getFullyQualifiedName();
	
	public java.util.List getOperations(String name,
			String requestType, String responseType);
	
	public boolean isServiceProvider();
	
	public void setServiceProvider(boolean provider);
	
	public boolean isServiceClient();
	
	public void setServiceClient(boolean client);

} // InterfaceOfGroup
