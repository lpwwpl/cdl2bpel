/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChannelTypeImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.Iterator;
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

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Identity;
import edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getPassingInfoByChannel <em>Passing Info By Channel</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getTheBehaviorOfTheRoleType <em>The Behavior Of The Role Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getReferencedToken <em>Referenced Token</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelTypeImpl extends InfoOrChannelImpl implements ChannelType {
	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageTypeEnumByChannelType USAGE_EDEFAULT = UsageTypeEnumByChannelType.DISTINCT;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageTypeEnumByChannelType usage = USAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getPassingInfoByChannel() <em>Passing Info By Channel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingInfoByChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<PassingInfoOfTheChannelType> passingInfoByChannel;

	/**
	 * The cached value of the '{@link #getTheBehaviorOfTheRoleType() <em>The Behavior Of The Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheBehaviorOfTheRoleType()
	 * @generated
	 * @ordered
	 */
	protected BehaviorOfRoleType theBehaviorOfTheRoleType;

	/**
	 * The cached value of the '{@link #getReferencedToken() <em>Referenced Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedToken()
	 * @generated
	 * @ordered
	 */
	protected Token referencedToken;

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
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleType;

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
		return CDLPackage.Literals.CHANNEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeEnumByChannelType getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageTypeEnumByChannelType newUsage) {
		UsageTypeEnumByChannelType oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHANNEL_TYPE__USAGE, oldUsage, usage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHANNEL_TYPE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassingInfoOfTheChannelType> getPassingInfoByChannel() {
		if (passingInfoByChannel == null) {
			passingInfoByChannel = new EObjectContainmentEList<PassingInfoOfTheChannelType>(PassingInfoOfTheChannelType.class, this, CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL);
		}
		return passingInfoByChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorOfRoleType getTheBehaviorOfTheRoleType() {
		if (theBehaviorOfTheRoleType != null && theBehaviorOfTheRoleType.eIsProxy()) {
			InternalEObject oldTheBehaviorOfTheRoleType = (InternalEObject)theBehaviorOfTheRoleType;
			theBehaviorOfTheRoleType = (BehaviorOfRoleType)eResolveProxy(oldTheBehaviorOfTheRoleType);
			if (theBehaviorOfTheRoleType != oldTheBehaviorOfTheRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE, oldTheBehaviorOfTheRoleType, theBehaviorOfTheRoleType));
			}
		}
		return theBehaviorOfTheRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorOfRoleType basicGetTheBehaviorOfTheRoleType() {
		return theBehaviorOfTheRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheBehaviorOfTheRoleType(BehaviorOfRoleType newTheBehaviorOfTheRoleType) {
		BehaviorOfRoleType oldTheBehaviorOfTheRoleType = theBehaviorOfTheRoleType;
		theBehaviorOfTheRoleType = newTheBehaviorOfTheRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE, oldTheBehaviorOfTheRoleType, theBehaviorOfTheRoleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getReferencedToken() {
		if (referencedToken != null && referencedToken.eIsProxy()) {
			InternalEObject oldReferencedToken = (InternalEObject)referencedToken;
			referencedToken = (Token)eResolveProxy(oldReferencedToken);
			if (referencedToken != oldReferencedToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN, oldReferencedToken, referencedToken));
			}
		}
		return referencedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetReferencedToken() {
		return referencedToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedToken(Token newReferencedToken) {
		Token oldReferencedToken = referencedToken;
		referencedToken = newReferencedToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN, oldReferencedToken, referencedToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identity> getIdentities() {
		if (identities == null) {
			identities = new EObjectContainmentEList<Identity>(Identity.class, this, CDLPackage.CHANNEL_TYPE__IDENTITIES);
		}
		return identities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRoleType() {
		if (roleType != null && roleType.eIsProxy()) {
			InternalEObject oldRoleType = (InternalEObject)roleType;
			roleType = (RoleType)eResolveProxy(oldRoleType);
			if (roleType != oldRoleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.CHANNEL_TYPE__ROLE_TYPE, oldRoleType, roleType));
			}
		}
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleType() {
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleType(RoleType newRoleType) {
		RoleType oldRoleType = roleType;
		roleType = newRoleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHANNEL_TYPE__ROLE_TYPE, oldRoleType, roleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL:
				return ((InternalEList<?>)getPassingInfoByChannel()).basicRemove(otherEnd, msgs);
			case CDLPackage.CHANNEL_TYPE__IDENTITIES:
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
			case CDLPackage.CHANNEL_TYPE__USAGE:
				return getUsage();
			case CDLPackage.CHANNEL_TYPE__ACTION:
				return getAction();
			case CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL:
				return getPassingInfoByChannel();
			case CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE:
				if (resolve) return getTheBehaviorOfTheRoleType();
				return basicGetTheBehaviorOfTheRoleType();
			case CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN:
				if (resolve) return getReferencedToken();
				return basicGetReferencedToken();
			case CDLPackage.CHANNEL_TYPE__IDENTITIES:
				return getIdentities();
			case CDLPackage.CHANNEL_TYPE__ROLE_TYPE:
				if (resolve) return getRoleType();
				return basicGetRoleType();
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
			case CDLPackage.CHANNEL_TYPE__USAGE:
				setUsage((UsageTypeEnumByChannelType)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__ACTION:
				setAction((ActionTypeEnumByChannelType)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL:
				getPassingInfoByChannel().clear();
				getPassingInfoByChannel().addAll((Collection<? extends PassingInfoOfTheChannelType>)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE:
				setTheBehaviorOfTheRoleType((BehaviorOfRoleType)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN:
				setReferencedToken((Token)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__IDENTITIES:
				getIdentities().clear();
				getIdentities().addAll((Collection<? extends Identity>)newValue);
				return;
			case CDLPackage.CHANNEL_TYPE__ROLE_TYPE:
				setRoleType((RoleType)newValue);
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
			case CDLPackage.CHANNEL_TYPE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case CDLPackage.CHANNEL_TYPE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL:
				getPassingInfoByChannel().clear();
				return;
			case CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE:
				setTheBehaviorOfTheRoleType((BehaviorOfRoleType)null);
				return;
			case CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN:
				setReferencedToken((Token)null);
				return;
			case CDLPackage.CHANNEL_TYPE__IDENTITIES:
				getIdentities().clear();
				return;
			case CDLPackage.CHANNEL_TYPE__ROLE_TYPE:
				setRoleType((RoleType)null);
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
			case CDLPackage.CHANNEL_TYPE__USAGE:
				return usage != USAGE_EDEFAULT;
			case CDLPackage.CHANNEL_TYPE__ACTION:
				return action != ACTION_EDEFAULT;
			case CDLPackage.CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL:
				return passingInfoByChannel != null && !passingInfoByChannel.isEmpty();
			case CDLPackage.CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE:
				return theBehaviorOfTheRoleType != null;
			case CDLPackage.CHANNEL_TYPE__REFERENCED_TOKEN:
				return referencedToken != null;
			case CDLPackage.CHANNEL_TYPE__IDENTITIES:
				return identities != null && !identities.isEmpty();
			case CDLPackage.CHANNEL_TYPE__ROLE_TYPE:
				return roleType != null;
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
		result.append(" (usage: ");
		result.append(usage);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(CDLElemNameConstants.CHANNELTYPE_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			Package thePackage = getBelongedPackage();
			for (Iterator it = elem.elementIterator(); it.hasNext();) {
				Element nestedByChannelTypeElem = (Element) it.next();
				String nestedByChannelTypeElem_name = nestedByChannelTypeElem
						.getName();
				if (nestedByChannelTypeElem_name
						.equals(CDLElemNameConstants.ROLETYPE_ELEM_NAME)) {
					String roleTypeName = nestedByChannelTypeElem
							.attributeValue("typeRef");
					if(roleTypeName!=null) {
					RoleType roleType = CDLPackageUtil.getRoleType(thePackage,
							roleTypeName);
					setRoleType(roleType);
					
					String behaviorOfRoleType = nestedByChannelTypeElem
							.attributeValue("behavior");
						if (behaviorOfRoleType == null) {
							setTheBehaviorOfTheRoleType(roleType.getBehaviors()
									.get(0));
						} else {
							BehaviorOfRoleTypeImpl behavior = null;
							for (BehaviorOfRoleType theBehavior : roleType
									.getBehaviors()) {
								if (theBehavior.getName().equals(
										behaviorOfRoleType)) {
									setTheBehaviorOfTheRoleType(theBehavior);
								}
							}
						}
					}
				} else if (nestedByChannelTypeElem_name
						.equals(CDLElemNameConstants.REFERENCE_ELEM_NAME)) {
					List<Element> tokens = nestedByChannelTypeElem.elements();
					if (tokens.size() == 1) {
						String tokenName = tokens.get(0).attributeValue("name");
						if(tokenName!=null) {
						Token token = CDLPackageUtil.getToken(thePackage,
								tokenName);
						setReferencedToken(token);
						}
					}
				} else if (nestedByChannelTypeElem_name
						.equals(CDLElemNameConstants.IDENTITY_ELEM_NAME)) {
//					List<Element> identities = nestedByChannelTypeElem
//							.elements();
//					for (Element identityElement : identities) {
						Identity identity = CDLFactory.eINSTANCE
								.createIdentity();
						String usage = nestedByChannelTypeElem.attributeValue("usage");
						List<Element> tokenElements = nestedByChannelTypeElem
								.elements();
						for (Element tokenElement : tokenElements) {
							Token token = CDLPackageUtil.getToken(thePackage,
									tokenElement.attributeValue("name"));
							identity.getTokens().add(token);
						}
						getIdentities().add(identity);
//					}
				} else if (nestedByChannelTypeElem_name
						.equals(CDLElemNameConstants.PASSING_ELEM_NAME)) {
					PassingInfoOfTheChannelType passing = CDLFactory.eINSTANCE
							.createPassingInfoOfTheChannelType();
					String newValue = nestedByChannelTypeElem
							.attributeValue("new");
					String actionValue = nestedByChannelTypeElem
							.attributeValue("action");
					String channelValue = nestedByChannelTypeElem
							.attributeValue("channel");
					ChannelType channelType = CDLPackageUtil.getChannelType(
							thePackage, channelValue);
					passing.setChannel(channelType);
					if (newValue.equals("true")) {
						passing.setNew(true);
					} else {
						passing.setNew(false);
					}
				}
			}
		}

		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		return cdlElement;
	}
} //ChannelTypeImpl
