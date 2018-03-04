/**
 * CDL2BPEL_XJTU
 *
 * $Id: RoleTypeImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends CDLElementImpl implements RoleType {
	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorOfRoleType> behaviors;

	/**
	 * The default value of the '{@link #getStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateless()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STATELESS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getStateless() <em>Stateless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateless()
	 * @generated
	 * @ordered
	 */
	protected Boolean stateless = STATELESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected Boolean free = FREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorOfRoleType> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<BehaviorOfRoleType>(BehaviorOfRoleType.class, this, CDLPackage.ROLE_TYPE__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStateless() {
		return stateless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateless(Boolean newStateless) {
		Boolean oldStateless = stateless;
		stateless = newStateless;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE__STATELESS, oldStateless, stateless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(Boolean newFree) {
		Boolean oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.ROLE_TYPE__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.ROLE_TYPE__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.ROLE_TYPE__BEHAVIORS:
				return getBehaviors();
			case CDLPackage.ROLE_TYPE__STATELESS:
				return getStateless();
			case CDLPackage.ROLE_TYPE__FREE:
				return getFree();
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
			case CDLPackage.ROLE_TYPE__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends BehaviorOfRoleType>)newValue);
				return;
			case CDLPackage.ROLE_TYPE__STATELESS:
				setStateless((Boolean)newValue);
				return;
			case CDLPackage.ROLE_TYPE__FREE:
				setFree((Boolean)newValue);
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
			case CDLPackage.ROLE_TYPE__BEHAVIORS:
				getBehaviors().clear();
				return;
			case CDLPackage.ROLE_TYPE__STATELESS:
				setStateless(STATELESS_EDEFAULT);
				return;
			case CDLPackage.ROLE_TYPE__FREE:
				setFree(FREE_EDEFAULT);
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
			case CDLPackage.ROLE_TYPE__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case CDLPackage.ROLE_TYPE__STATELESS:
				return STATELESS_EDEFAULT == null ? stateless != null : !STATELESS_EDEFAULT.equals(stateless);
			case CDLPackage.ROLE_TYPE__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
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
		result.append(" (stateless: ");
		result.append(stateless);
		result.append(", free: ");
		result.append(free);
		result.append(')');
		return result.toString();
	}

	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.ROLETYPE_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
		}
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if(elem.getName().equals(CDLElemNameConstants.BEHAVIOR_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createBehaviorOfRoleType();
			getBehaviors().add((BehaviorOfRoleType)cdlElement);
		}
		return cdlElement;
	}
	
	public BehaviorOfRoleType getBehavior(String name) {
		BehaviorOfRoleType ret=null;
		
		if (name != null) {
			ret = (BehaviorOfRoleType)this.getCDLElementByTheNameAttribute(name,
		            getBehaviors());
		} else if (getBehaviors().size() == 1) {
			ret = (BehaviorOfRoleType)getBehaviors().get(0);
		}
		
	    return(ret);
	}
} //RoleTypeImpl
