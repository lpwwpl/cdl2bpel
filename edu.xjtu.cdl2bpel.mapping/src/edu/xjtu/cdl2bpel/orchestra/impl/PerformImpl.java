/**
 * CDL2BPEL_XJTU
 *
 * $Id: PerformImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Perform;
import edu.xjtu.cdl2bpel.orchestra.VariableBinding;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl#getBpOrchestra <em>Bp Orchestra</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl#getVariableBindings <em>Variable Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformImpl extends BPActivityImpl implements Perform {
	/**
	 * The cached value of the '{@link #getBpOrchestra() <em>Bp Orchestra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpOrchestra()
	 * @generated
	 * @ordered
	 */
	protected BPOrchestra bpOrchestra;

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
	 * The default value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISOLATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsolated() <em>Isolated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isolated = ISOLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WAIT_FOR_COMPLETION_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected Boolean waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableBindings() <em>Variable Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableBinding> variableBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.PERFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPOrchestra getBpOrchestra() {
		if (bpOrchestra != null && bpOrchestra.eIsProxy()) {
			InternalEObject oldBpOrchestra = (InternalEObject)bpOrchestra;
			bpOrchestra = (BPOrchestra)eResolveProxy(oldBpOrchestra);
			if (bpOrchestra != oldBpOrchestra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.PERFORM__BP_ORCHESTRA, oldBpOrchestra, bpOrchestra));
			}
		}
		return bpOrchestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPOrchestra basicGetBpOrchestra() {
		return bpOrchestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpOrchestra(BPOrchestra newBpOrchestra) {
		BPOrchestra oldBpOrchestra = bpOrchestra;
		bpOrchestra = newBpOrchestra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.PERFORM__BP_ORCHESTRA, oldBpOrchestra, bpOrchestra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.PERFORM__INSTANCE_ID, oldInstanceId, instanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsolated() {
		return isolated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated(Boolean newIsolated) {
		Boolean oldIsolated = isolated;
		isolated = newIsolated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.PERFORM__ISOLATED, oldIsolated, isolated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWaitForCompletion() {
		return waitForCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForCompletion(Boolean newWaitForCompletion) {
		Boolean oldWaitForCompletion = waitForCompletion;
		waitForCompletion = newWaitForCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.PERFORM__WAIT_FOR_COMPLETION, oldWaitForCompletion, waitForCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableBinding> getVariableBindings() {
		if (variableBindings == null) {
			variableBindings = new EObjectContainmentEList<VariableBinding>(VariableBinding.class, this, OrchestraPackage.PERFORM__VARIABLE_BINDINGS);
		}
		return variableBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.PERFORM__VARIABLE_BINDINGS:
				return ((InternalEList<?>)getVariableBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.PERFORM__BP_ORCHESTRA:
				if (resolve) return getBpOrchestra();
				return basicGetBpOrchestra();
			case OrchestraPackage.PERFORM__INSTANCE_ID:
				return getInstanceId();
			case OrchestraPackage.PERFORM__ISOLATED:
				return getIsolated();
			case OrchestraPackage.PERFORM__WAIT_FOR_COMPLETION:
				return getWaitForCompletion();
			case OrchestraPackage.PERFORM__VARIABLE_BINDINGS:
				return getVariableBindings();
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
			case OrchestraPackage.PERFORM__BP_ORCHESTRA:
				setBpOrchestra((BPOrchestra)newValue);
				return;
			case OrchestraPackage.PERFORM__INSTANCE_ID:
				setInstanceId((String)newValue);
				return;
			case OrchestraPackage.PERFORM__ISOLATED:
				setIsolated((Boolean)newValue);
				return;
			case OrchestraPackage.PERFORM__WAIT_FOR_COMPLETION:
				setWaitForCompletion((Boolean)newValue);
				return;
			case OrchestraPackage.PERFORM__VARIABLE_BINDINGS:
				getVariableBindings().clear();
				getVariableBindings().addAll((Collection<? extends VariableBinding>)newValue);
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
			case OrchestraPackage.PERFORM__BP_ORCHESTRA:
				setBpOrchestra((BPOrchestra)null);
				return;
			case OrchestraPackage.PERFORM__INSTANCE_ID:
				setInstanceId(INSTANCE_ID_EDEFAULT);
				return;
			case OrchestraPackage.PERFORM__ISOLATED:
				setIsolated(ISOLATED_EDEFAULT);
				return;
			case OrchestraPackage.PERFORM__WAIT_FOR_COMPLETION:
				setWaitForCompletion(WAIT_FOR_COMPLETION_EDEFAULT);
				return;
			case OrchestraPackage.PERFORM__VARIABLE_BINDINGS:
				getVariableBindings().clear();
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
			case OrchestraPackage.PERFORM__BP_ORCHESTRA:
				return bpOrchestra != null;
			case OrchestraPackage.PERFORM__INSTANCE_ID:
				return INSTANCE_ID_EDEFAULT == null ? instanceId != null : !INSTANCE_ID_EDEFAULT.equals(instanceId);
			case OrchestraPackage.PERFORM__ISOLATED:
				return ISOLATED_EDEFAULT == null ? isolated != null : !ISOLATED_EDEFAULT.equals(isolated);
			case OrchestraPackage.PERFORM__WAIT_FOR_COMPLETION:
				return WAIT_FOR_COMPLETION_EDEFAULT == null ? waitForCompletion != null : !WAIT_FOR_COMPLETION_EDEFAULT.equals(waitForCompletion);
			case OrchestraPackage.PERFORM__VARIABLE_BINDINGS:
				return variableBindings != null && !variableBindings.isEmpty();
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
		result.append(", isolated: ");
		result.append(isolated);
		result.append(", waitForCompletion: ");
		result.append(waitForCompletion);
		result.append(')');
		return result.toString();
	}

} //PerformImpl
