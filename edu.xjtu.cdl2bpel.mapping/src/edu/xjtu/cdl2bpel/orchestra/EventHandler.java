/**
 * CDL2BPEL_XJTU
 *
 * $Id: EventHandler.java,v 1.1 2011/02/21 06:24:11 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnAlarms <em>On Alarms</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnMessage <em>On Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends BPActivity {
	/**
	 * Returns the value of the '<em><b>On Alarms</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.OnAlarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Alarms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Alarms</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getEventHandler_OnAlarms()
	 * @model
	 * @generated
	 */
	EList<OnAlarm> getOnAlarms();

	/**
	 * Returns the value of the '<em><b>On Message</b></em>' reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Message</em>' reference list.
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#getEventHandler_OnMessage()
	 * @model
	 * @generated
	 */
	EList<OnMessageByEventHandler> getOnMessage();

} // EventHandler
