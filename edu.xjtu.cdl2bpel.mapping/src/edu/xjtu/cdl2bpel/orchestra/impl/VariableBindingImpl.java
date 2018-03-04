/**
 * CDL2BPEL_XJTU
 *
 * $Id: VariableBindingImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Variable;
import edu.xjtu.cdl2bpel.orchestra.VariableBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl#getParentVariable <em>Parent Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl#getBoundVariable <em>Bound Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableBindingImpl extends BPElementImpl implements VariableBinding {
	/**
	 * The cached value of the '{@link #getParentVariable() <em>Parent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable parentVariable;

	/**
	 * The cached value of the '{@link #getBoundVariable() <em>Bound Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable boundVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.VARIABLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getParentVariable() {
		if (parentVariable != null && parentVariable.eIsProxy()) {
			InternalEObject oldParentVariable = (InternalEObject)parentVariable;
			parentVariable = (Variable)eResolveProxy(oldParentVariable);
			if (parentVariable != oldParentVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE, oldParentVariable, parentVariable));
			}
		}
		return parentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetParentVariable() {
		return parentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVariable(Variable newParentVariable) {
		Variable oldParentVariable = parentVariable;
		parentVariable = newParentVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE, oldParentVariable, parentVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getBoundVariable() {
		if (boundVariable != null && boundVariable.eIsProxy()) {
			InternalEObject oldBoundVariable = (InternalEObject)boundVariable;
			boundVariable = (Variable)eResolveProxy(oldBoundVariable);
			if (boundVariable != oldBoundVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE, oldBoundVariable, boundVariable));
			}
		}
		return boundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetBoundVariable() {
		return boundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundVariable(Variable newBoundVariable) {
		Variable oldBoundVariable = boundVariable;
		boundVariable = newBoundVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE, oldBoundVariable, boundVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE:
				if (resolve) return getParentVariable();
				return basicGetParentVariable();
			case OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE:
				if (resolve) return getBoundVariable();
				return basicGetBoundVariable();
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
			case OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE:
				setParentVariable((Variable)newValue);
				return;
			case OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE:
				setBoundVariable((Variable)newValue);
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
			case OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE:
				setParentVariable((Variable)null);
				return;
			case OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE:
				setBoundVariable((Variable)null);
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
			case OrchestraPackage.VARIABLE_BINDING__PARENT_VARIABLE:
				return parentVariable != null;
			case OrchestraPackage.VARIABLE_BINDING__BOUND_VARIABLE:
				return boundVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableBindingImpl
