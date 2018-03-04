/**
 * CDL2BPEL_XJTU
 *
 * $Id: InformationTypeZlpImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.TokenLocator;

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
 * An implementation of the model object '<em><b>Information Type Zlp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl#getElement <em>Element</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl#getTokenLocators <em>Token Locators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationTypeZlpImpl extends BPElementImpl implements InformationTypeZlp {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected String element = ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTokenLocators() <em>Token Locators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenLocators()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenLocator> tokenLocators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationTypeZlpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.INFORMATION_TYPE_ZLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.INFORMATION_TYPE_ZLP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(String newElement) {
		String oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.INFORMATION_TYPE_ZLP__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenLocator> getTokenLocators() {
		if (tokenLocators == null) {
			tokenLocators = new EObjectContainmentEList<TokenLocator>(TokenLocator.class, this, OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS);
		}
		return tokenLocators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS:
				return ((InternalEList<?>)getTokenLocators()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TYPE:
				return getType();
			case OrchestraPackage.INFORMATION_TYPE_ZLP__ELEMENT:
				return getElement();
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS:
				return getTokenLocators();
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
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TYPE:
				setType((String)newValue);
				return;
			case OrchestraPackage.INFORMATION_TYPE_ZLP__ELEMENT:
				setElement((String)newValue);
				return;
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS:
				getTokenLocators().clear();
				getTokenLocators().addAll((Collection<? extends TokenLocator>)newValue);
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
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OrchestraPackage.INFORMATION_TYPE_ZLP__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS:
				getTokenLocators().clear();
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
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OrchestraPackage.INFORMATION_TYPE_ZLP__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
			case OrchestraPackage.INFORMATION_TYPE_ZLP__TOKEN_LOCATORS:
				return tokenLocators != null && !tokenLocators.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", element: ");
		result.append(element);
		result.append(')');
		return result.toString();
	}

} //InformationTypeZlpImpl
