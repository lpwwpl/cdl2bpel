/**
 * CDL2BPEL_XJTU
 *
 * $Id: EventHandlerImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.EventHandler;
import edu.xjtu.cdl2bpel.orchestra.OnAlarm;
import edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl#getOnAlarms <em>On Alarms</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl#getOnMessage <em>On Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventHandlerImpl extends BPActivityImpl implements EventHandler {
	/**
	 * The cached value of the '{@link #getOnAlarms() <em>On Alarms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnAlarms()
	 * @generated
	 * @ordered
	 */
	protected EList<OnAlarm> onAlarms;

	/**
	 * The cached value of the '{@link #getOnMessage() <em>On Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<OnMessageByEventHandler> onMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.EVENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnAlarm> getOnAlarms() {
		if (onAlarms == null) {
			onAlarms = new EObjectResolvingEList<OnAlarm>(OnAlarm.class, this, OrchestraPackage.EVENT_HANDLER__ON_ALARMS);
		}
		return onAlarms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnMessageByEventHandler> getOnMessage() {
		if (onMessage == null) {
			onMessage = new EObjectResolvingEList<OnMessageByEventHandler>(OnMessageByEventHandler.class, this, OrchestraPackage.EVENT_HANDLER__ON_MESSAGE);
		}
		return onMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.EVENT_HANDLER__ON_ALARMS:
				return getOnAlarms();
			case OrchestraPackage.EVENT_HANDLER__ON_MESSAGE:
				return getOnMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.EVENT_HANDLER__ON_ALARMS:
				getOnAlarms().clear();
				getOnAlarms().addAll((Collection<? extends OnAlarm>)newValue);
				return;
			case OrchestraPackage.EVENT_HANDLER__ON_MESSAGE:
				getOnMessage().clear();
				getOnMessage().addAll((Collection<? extends OnMessageByEventHandler>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrchestraPackage.EVENT_HANDLER__ON_ALARMS:
				getOnAlarms().clear();
				return;
			case OrchestraPackage.EVENT_HANDLER__ON_MESSAGE:
				getOnMessage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrchestraPackage.EVENT_HANDLER__ON_ALARMS:
				return onAlarms != null && !onAlarms.isEmpty();
			case OrchestraPackage.EVENT_HANDLER__ON_MESSAGE:
				return onMessage != null && !onMessage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventHandlerImpl
