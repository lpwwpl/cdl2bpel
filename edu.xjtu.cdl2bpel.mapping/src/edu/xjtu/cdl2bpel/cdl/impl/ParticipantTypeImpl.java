/**
 * CDL2BPEL_XJTU
 *
 * $Id: ParticipantTypeImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl#getStateless <em>Stateless</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl#getFree <em>Free</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantTypeImpl extends CDLElementImpl implements ParticipantType {
	/**
	 * The cached value of the '{@link #getRoleTypes() <em>Role Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> roleTypes;

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
	protected ParticipantTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PARTICIPANT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRoleTypes() {
		if (roleTypes == null) {
			roleTypes = new EObjectResolvingEList<RoleType>(RoleType.class, this, CDLPackage.PARTICIPANT_TYPE__ROLE_TYPES);
		}
		return roleTypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PARTICIPANT_TYPE__STATELESS, oldStateless, stateless));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PARTICIPANT_TYPE__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.PARTICIPANT_TYPE__ROLE_TYPES:
				return getRoleTypes();
			case CDLPackage.PARTICIPANT_TYPE__STATELESS:
				return getStateless();
			case CDLPackage.PARTICIPANT_TYPE__FREE:
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
			case CDLPackage.PARTICIPANT_TYPE__ROLE_TYPES:
				getRoleTypes().clear();
				getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
				return;
			case CDLPackage.PARTICIPANT_TYPE__STATELESS:
				setStateless((Boolean)newValue);
				return;
			case CDLPackage.PARTICIPANT_TYPE__FREE:
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
			case CDLPackage.PARTICIPANT_TYPE__ROLE_TYPES:
				getRoleTypes().clear();
				return;
			case CDLPackage.PARTICIPANT_TYPE__STATELESS:
				setStateless(STATELESS_EDEFAULT);
				return;
			case CDLPackage.PARTICIPANT_TYPE__FREE:
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
			case CDLPackage.PARTICIPANT_TYPE__ROLE_TYPES:
				return roleTypes != null && !roleTypes.isEmpty();
			case CDLPackage.PARTICIPANT_TYPE__STATELESS:
				return STATELESS_EDEFAULT == null ? stateless != null : !STATELESS_EDEFAULT.equals(stateless);
			case CDLPackage.PARTICIPANT_TYPE__FREE:
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
	
	/**
	 * 
	 * @param elem
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.PARTICIPANTTYPE_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			Package thePackage = getBelongedPackage();
			for(Iterator it = elem.elementIterator();it.hasNext();) {
				Element nestedRoleType = (Element) it.next();
				String roleTypeName = nestedRoleType.attributeValue("typeRef");
				RoleType roleType = CDLPackageUtil.getRoleType(thePackage, roleTypeName);
				getRoleTypes().add(roleType);
			}
		}
		
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	/**
	 * 
	 * @param elem
	 * @return
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		return cdlElement;
	}

} //ParticipantTypeImpl
