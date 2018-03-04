/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChannelTypeImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.ChannelType;
import edu.xjtu.cdl2bpel.orchestra.Identity;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel;

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
 * An implementation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl#getIdentities <em>Identities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelTypeImpl extends VariableImpl implements ChannelType {
	/**
	 * The default value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected String channelType = CHANNEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceOfGroup interfaceType;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageEnumByChannel USAGE_EDEFAULT = UsageEnumByChannel.DISTINCT;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageEnumByChannel usage = USAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentities() <em>Identities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentities()
	 * @generated
	 * @ordered
	 */
	protected EList<Identity> identities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(String newChannelType) {
		String oldChannelType = channelType;
		channelType = newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.CHANNEL_TYPE__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfGroup getInterfaceType() {
		if (interfaceType != null && interfaceType.eIsProxy()) {
			InternalEObject oldInterfaceType = (InternalEObject)interfaceType;
			interfaceType = (InterfaceOfGroup)eResolveProxy(oldInterfaceType);
			if (interfaceType != oldInterfaceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
			}
		}
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfGroup basicGetInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceType(InterfaceOfGroup newInterfaceType) {
		InterfaceOfGroup oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageEnumByChannel getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageEnumByChannel newUsage) {
		UsageEnumByChannel oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.CHANNEL_TYPE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identity> getIdentities() {
		if (identities == null) {
			identities = new EObjectContainmentEList<Identity>(Identity.class, this, OrchestraPackage.CHANNEL_TYPE__IDENTITIES);
		}
		return identities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.CHANNEL_TYPE__IDENTITIES:
				return ((InternalEList<?>)getIdentities()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.CHANNEL_TYPE__CHANNEL_TYPE:
				return getChannelType();
			case OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE:
				if (resolve) return getInterfaceType();
				return basicGetInterfaceType();
			case OrchestraPackage.CHANNEL_TYPE__USAGE:
				return getUsage();
			case OrchestraPackage.CHANNEL_TYPE__IDENTITIES:
				return getIdentities();
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
			case OrchestraPackage.CHANNEL_TYPE__CHANNEL_TYPE:
				setChannelType((String)newValue);
				return;
			case OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE:
				setInterfaceType((InterfaceOfGroup)newValue);
				return;
			case OrchestraPackage.CHANNEL_TYPE__USAGE:
				setUsage((UsageEnumByChannel)newValue);
				return;
			case OrchestraPackage.CHANNEL_TYPE__IDENTITIES:
				getIdentities().clear();
				getIdentities().addAll((Collection<? extends Identity>)newValue);
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
			case OrchestraPackage.CHANNEL_TYPE__CHANNEL_TYPE:
				setChannelType(CHANNEL_TYPE_EDEFAULT);
				return;
			case OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE:
				setInterfaceType((InterfaceOfGroup)null);
				return;
			case OrchestraPackage.CHANNEL_TYPE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case OrchestraPackage.CHANNEL_TYPE__IDENTITIES:
				getIdentities().clear();
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
			case OrchestraPackage.CHANNEL_TYPE__CHANNEL_TYPE:
				return CHANNEL_TYPE_EDEFAULT == null ? channelType != null : !CHANNEL_TYPE_EDEFAULT.equals(channelType);
			case OrchestraPackage.CHANNEL_TYPE__INTERFACE_TYPE:
				return interfaceType != null;
			case OrchestraPackage.CHANNEL_TYPE__USAGE:
				return usage != USAGE_EDEFAULT;
			case OrchestraPackage.CHANNEL_TYPE__IDENTITIES:
				return identities != null && !identities.isEmpty();
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
		result.append(" (channelType: ");
		result.append(channelType);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //ChannelTypeImpl
