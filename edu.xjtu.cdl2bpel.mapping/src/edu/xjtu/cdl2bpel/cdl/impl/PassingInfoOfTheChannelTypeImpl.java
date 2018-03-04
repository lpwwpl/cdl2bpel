/**
 * CDL2BPEL_XJTU
 *
 * $Id: PassingInfoOfTheChannelTypeImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passing Info Of The Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl#getNew <em>New</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl#getEnclosingChannel <em>Enclosing Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassingInfoOfTheChannelTypeImpl extends CDLElementImpl implements PassingInfoOfTheChannelType {
	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected ChannelType channel;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionTypeEnumByChannelType ACTION_EDEFAULT = ActionTypeEnumByChannelType.REQUEST_RESPOND;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionTypeEnumByChannelType action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getNew() <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNew()
	 * @generated
	 * @ordered
	 */
	protected Boolean new_ = NEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnclosingChannel() <em>Enclosing Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingChannel()
	 * @generated
	 * @ordered
	 */
	protected ChannelType enclosingChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassingInfoOfTheChannelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PASSING_INFO_OF_THE_CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (ChannelType)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(ChannelType newChannel) {
		ChannelType oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTypeEnumByChannelType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionTypeEnumByChannelType newAction) {
		ActionTypeEnumByChannelType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNew() {
		return new_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNew(Boolean newNew) {
		Boolean oldNew = new_;
		new_ = newNew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW, oldNew, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType getEnclosingChannel() {
		if (enclosingChannel != null && enclosingChannel.eIsProxy()) {
			InternalEObject oldEnclosingChannel = (InternalEObject)enclosingChannel;
			enclosingChannel = (ChannelType)eResolveProxy(oldEnclosingChannel);
			if (enclosingChannel != oldEnclosingChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL, oldEnclosingChannel, enclosingChannel));
			}
		}
		return enclosingChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType basicGetEnclosingChannel() {
		return enclosingChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingChannel(ChannelType newEnclosingChannel) {
		ChannelType oldEnclosingChannel = enclosingChannel;
		enclosingChannel = newEnclosingChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL, oldEnclosingChannel, enclosingChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION:
				return getAction();
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW:
				return getNew();
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL:
				if (resolve) return getEnclosingChannel();
				return basicGetEnclosingChannel();
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
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL:
				setChannel((ChannelType)newValue);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION:
				setAction((ActionTypeEnumByChannelType)newValue);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW:
				setNew((Boolean)newValue);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL:
				setEnclosingChannel((ChannelType)newValue);
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
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL:
				setChannel((ChannelType)null);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW:
				setNew(NEW_EDEFAULT);
				return;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL:
				setEnclosingChannel((ChannelType)null);
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
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL:
				return channel != null;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION:
				return action != ACTION_EDEFAULT;
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW:
				return NEW_EDEFAULT == null ? new_ != null : !NEW_EDEFAULT.equals(new_);
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL:
				return enclosingChannel != null;
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
		result.append(" (action: ");
		result.append(action);
		result.append(", new: ");
		result.append(new_);
		result.append(')');
		return result.toString();
	}

} //PassingInfoOfTheChannelTypeImpl
