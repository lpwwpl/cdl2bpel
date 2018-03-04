/**
 * CDL2BPEL_XJTU
 *
 * $Id: CompensationImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.CompensateHandler;
import edu.xjtu.cdl2bpel.orchestra.Compensation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compensation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl#getCompletionHandler <em>Completion Handler</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl#getInstanceId <em>Instance Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompensationImpl extends BPActivityImpl implements Compensation {
	/**
	 * The cached value of the '{@link #getCompletionHandler() <em>Completion Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionHandler()
	 * @generated
	 * @ordered
	 */
	protected CompensateHandler completionHandler;

	/**
	 * The default value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String instanceId = INSTANCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompensationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.COMPENSATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateHandler getCompletionHandler() {
		if (completionHandler != null && completionHandler.eIsProxy()) {
			InternalEObject oldCompletionHandler = (InternalEObject)completionHandler;
			completionHandler = (CompensateHandler)eResolveProxy(oldCompletionHandler);
			if (completionHandler != oldCompletionHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COMPENSATION__COMPLETION_HANDLER, oldCompletionHandler, completionHandler));
			}
		}
		return completionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateHandler basicGetCompletionHandler() {
		return completionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionHandler(CompensateHandler newCompletionHandler) {
		CompensateHandler oldCompletionHandler = completionHandler;
		completionHandler = newCompletionHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMPENSATION__COMPLETION_HANDLER, oldCompletionHandler, completionHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceId() {
		return instanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceId(String newInstanceId) {
		String oldInstanceId = instanceId;
		instanceId = newInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMPENSATION__INSTANCE_ID, oldInstanceId, instanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.COMPENSATION__COMPLETION_HANDLER:
				if (resolve) return getCompletionHandler();
				return basicGetCompletionHandler();
			case OrchestraPackage.COMPENSATION__INSTANCE_ID:
				return getInstanceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.COMPENSATION__COMPLETION_HANDLER:
				setCompletionHandler((CompensateHandler)newValue);
				return;
			case OrchestraPackage.COMPENSATION__INSTANCE_ID:
				setInstanceId((String)newValue);
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
			case OrchestraPackage.COMPENSATION__COMPLETION_HANDLER:
				setCompletionHandler((CompensateHandler)null);
				return;
			case OrchestraPackage.COMPENSATION__INSTANCE_ID:
				setInstanceId(INSTANCE_ID_EDEFAULT);
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
			case OrchestraPackage.COMPENSATION__COMPLETION_HANDLER:
				return completionHandler != null;
			case OrchestraPackage.COMPENSATION__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceId != null : !INSTANCE_ID_EDEFAULT.equals(instanceId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instanceId: ");
		result.append(instanceId);
		result.append(')');
		return result.toString();
	}

} //CompensationImpl
