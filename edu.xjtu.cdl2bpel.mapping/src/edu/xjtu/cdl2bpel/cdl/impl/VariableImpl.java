/**
 * CDL2BPEL_XJTU
 *
 * $Id: VariableImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.InfoOrChannel;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl#getMutable <em>Mutable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl#getFree <em>Free</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl#getSilent <em>Silent</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl#getRoleTypes <em>Role Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends CDLElementImpl implements Variable {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InfoOrChannel type;

	/**
	 * The default value of the '{@link #getMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUTABLE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutable()
	 * @generated
	 * @ordered
	 */
	protected Boolean mutable = MUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FREE_EDEFAULT = Boolean.FALSE;

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
	 * The default value of the '{@link #getSilent() <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SILENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSilent() <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilent()
	 * @generated
	 * @ordered
	 */
	protected Boolean silent = SILENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoOrChannel getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (InfoOrChannel)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoOrChannel basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InfoOrChannel newType) {
		InfoOrChannel oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMutable() {
		return mutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(Boolean newMutable) {
		Boolean oldMutable = mutable;
		mutable = newMutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.VARIABLE__MUTABLE, oldMutable, mutable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.VARIABLE__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSilent() {
		return silent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilent(Boolean newSilent) {
		Boolean oldSilent = silent;
		silent = newSilent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.VARIABLE__SILENT, oldSilent, silent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRoleTypes() {
		if (roleTypes == null) {
			roleTypes = new EObjectResolvingEList<RoleType>(RoleType.class, this, CDLPackage.VARIABLE__ROLE_TYPES);
		}
		return roleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CDLPackage.VARIABLE__MUTABLE:
				return getMutable();
			case CDLPackage.VARIABLE__FREE:
				return getFree();
			case CDLPackage.VARIABLE__SILENT:
				return getSilent();
			case CDLPackage.VARIABLE__ROLE_TYPES:
				return getRoleTypes();
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
			case CDLPackage.VARIABLE__TYPE:
				setType((InfoOrChannel)newValue);
				return;
			case CDLPackage.VARIABLE__MUTABLE:
				setMutable((Boolean)newValue);
				return;
			case CDLPackage.VARIABLE__FREE:
				setFree((Boolean)newValue);
				return;
			case CDLPackage.VARIABLE__SILENT:
				setSilent((Boolean)newValue);
				return;
			case CDLPackage.VARIABLE__ROLE_TYPES:
				getRoleTypes().clear();
				getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
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
			case CDLPackage.VARIABLE__TYPE:
				setType((InfoOrChannel)null);
				return;
			case CDLPackage.VARIABLE__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case CDLPackage.VARIABLE__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case CDLPackage.VARIABLE__SILENT:
				setSilent(SILENT_EDEFAULT);
				return;
			case CDLPackage.VARIABLE__ROLE_TYPES:
				getRoleTypes().clear();
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
			case CDLPackage.VARIABLE__TYPE:
				return type != null;
			case CDLPackage.VARIABLE__MUTABLE:
				return MUTABLE_EDEFAULT == null ? mutable != null : !MUTABLE_EDEFAULT.equals(mutable);
			case CDLPackage.VARIABLE__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case CDLPackage.VARIABLE__SILENT:
				return SILENT_EDEFAULT == null ? silent != null : !SILENT_EDEFAULT.equals(silent);
			case CDLPackage.VARIABLE__ROLE_TYPES:
				return roleTypes != null && !roleTypes.isEmpty();
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
		result.append(" (mutable: ");
		result.append(mutable);
		result.append(", free: ");
		result.append(free);
		result.append(", silent: ");
		result.append(silent);
		result.append(')');
		return result.toString();
	}

	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.VARIABLE_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			String informationType = elem.attributeValue("informationType");
			String channelType = elem.attributeValue("channelType");
			InfoOrChannel typeOfVariable = null;
			Package thePackage = getBelongedPackage();
			if(informationType!=null){
				typeOfVariable = CDLPackageUtil.getInformationType(thePackage, informationType);
			} else {
				typeOfVariable = CDLPackageUtil.getChannelType(thePackage, channelType);
			}
			setType(typeOfVariable);
		}
	}

	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if (elem.getName().equals("")) {

		}
		return cdlElement;
	}
} //VariableImpl
