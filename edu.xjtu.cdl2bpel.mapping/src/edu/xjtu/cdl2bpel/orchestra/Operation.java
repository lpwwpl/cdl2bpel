/**
 * CDL2BPEL_XJTU
 *
 * $Id: Operation.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.Operation#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BPElement {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getOperation_Messages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Message> getMessages();

public Message getRequest();
	
	public Message getResponse();
	
	public java.util.List getFaults();

//	public Message getFault(String faultName) {
//		Message ret=null;
//		
//		Iterator iter=getMessages().iterator();
//		while (ret == null && iter.hasNext()) {
//			Message m=(Message)iter.next();
//			
//			if (m.getFullyQualifiedFaultName() != null &&
//					m.getFullyQualifiedFaultName().equals(faultName)) {
//				ret = m;
//			}
//		}
//		
//		return(ret);
//	}
	
	public InterfaceOfGroup getInterfaceOfGroup();
	
	public boolean isSet(String str);
	
	public Message getFault(String faultName);

} // Operation
