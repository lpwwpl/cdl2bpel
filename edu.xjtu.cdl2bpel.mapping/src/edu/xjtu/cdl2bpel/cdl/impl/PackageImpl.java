/**
 * CDL2BPEL_XJTU
 *
 * $Id: PackageImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
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

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractCDLInfo2WSDLInfo;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getInformationTypes <em>Information Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getTokenLocators <em>Token Locators</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getRelationshipTypes <em>Relationship Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getParticipantTypes <em>Participant Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getChannelTypes <em>Channel Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl#getChoreographies <em>Choreographies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends CDLElementImpl implements edu.xjtu.cdl2bpel.cdl.Package {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

	/**
	 * The cached value of the '{@link #getInformationTypes() <em>Information Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationType> informationTypes;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

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
	 * The cached value of the '{@link #getRoleTypes() <em>Role Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> roleTypes;

	/**
	 * The cached value of the '{@link #getRelationshipTypes() <em>Relationship Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> relationshipTypes;

	/**
	 * The cached value of the '{@link #getParticipantTypes() <em>Participant Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantType> participantTypes;

	/**
	 * The cached value of the '{@link #getChannelTypes() <em>Channel Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelType> channelTypes;

	/**
	 * The cached value of the '{@link #getChoreographies() <em>Choreographies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographies()
	 * @generated
	 * @ordered
	 */
	protected EList<Choreography> choreographies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PACKAGE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PACKAGE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, CDLPackage.PACKAGE__NAMESPACES);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationType> getInformationTypes() {
		if (informationTypes == null) {
			informationTypes = new EObjectContainmentEList<InformationType>(InformationType.class, this, CDLPackage.PACKAGE__INFORMATION_TYPES);
		}
		return informationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, CDLPackage.PACKAGE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenLocator> getTokenLocators() {
		if (tokenLocators == null) {
			tokenLocators = new EObjectContainmentEList<TokenLocator>(TokenLocator.class, this, CDLPackage.PACKAGE__TOKEN_LOCATORS);
		}
		return tokenLocators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRoleTypes() {
		if (roleTypes == null) {
			roleTypes = new EObjectContainmentEList<RoleType>(RoleType.class, this, CDLPackage.PACKAGE__ROLE_TYPES);
		}
		return roleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipType> getRelationshipTypes() {
		if (relationshipTypes == null) {
			relationshipTypes = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, CDLPackage.PACKAGE__RELATIONSHIP_TYPES);
		}
		return relationshipTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantType> getParticipantTypes() {
		if (participantTypes == null) {
			participantTypes = new EObjectContainmentEList<ParticipantType>(ParticipantType.class, this, CDLPackage.PACKAGE__PARTICIPANT_TYPES);
		}
		return participantTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelType> getChannelTypes() {
		if (channelTypes == null) {
			channelTypes = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, CDLPackage.PACKAGE__CHANNEL_TYPES);
		}
		return channelTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choreography> getChoreographies() {
		if (choreographies == null) {
			choreographies = new EObjectContainmentEList<Choreography>(Choreography.class, this, CDLPackage.PACKAGE__CHOREOGRAPHIES);
		}
		return choreographies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.PACKAGE__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__INFORMATION_TYPES:
				return ((InternalEList<?>)getInformationTypes()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__TOKEN_LOCATORS:
				return ((InternalEList<?>)getTokenLocators()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__ROLE_TYPES:
				return ((InternalEList<?>)getRoleTypes()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__RELATIONSHIP_TYPES:
				return ((InternalEList<?>)getRelationshipTypes()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__PARTICIPANT_TYPES:
				return ((InternalEList<?>)getParticipantTypes()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__CHANNEL_TYPES:
				return ((InternalEList<?>)getChannelTypes()).basicRemove(otherEnd, msgs);
			case CDLPackage.PACKAGE__CHOREOGRAPHIES:
				return ((InternalEList<?>)getChoreographies()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.PACKAGE__AUTHOR:
				return getAuthor();
			case CDLPackage.PACKAGE__VERSION:
				return getVersion();
			case CDLPackage.PACKAGE__TARGET_NAMESPACE:
				return getTargetNamespace();
			case CDLPackage.PACKAGE__NAMESPACES:
				return getNamespaces();
			case CDLPackage.PACKAGE__INFORMATION_TYPES:
				return getInformationTypes();
			case CDLPackage.PACKAGE__TOKENS:
				return getTokens();
			case CDLPackage.PACKAGE__TOKEN_LOCATORS:
				return getTokenLocators();
			case CDLPackage.PACKAGE__ROLE_TYPES:
				return getRoleTypes();
			case CDLPackage.PACKAGE__RELATIONSHIP_TYPES:
				return getRelationshipTypes();
			case CDLPackage.PACKAGE__PARTICIPANT_TYPES:
				return getParticipantTypes();
			case CDLPackage.PACKAGE__CHANNEL_TYPES:
				return getChannelTypes();
			case CDLPackage.PACKAGE__CHOREOGRAPHIES:
				return getChoreographies();
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
			case CDLPackage.PACKAGE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CDLPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case CDLPackage.PACKAGE__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case CDLPackage.PACKAGE__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case CDLPackage.PACKAGE__INFORMATION_TYPES:
				getInformationTypes().clear();
				getInformationTypes().addAll((Collection<? extends InformationType>)newValue);
				return;
			case CDLPackage.PACKAGE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case CDLPackage.PACKAGE__TOKEN_LOCATORS:
				getTokenLocators().clear();
				getTokenLocators().addAll((Collection<? extends TokenLocator>)newValue);
				return;
			case CDLPackage.PACKAGE__ROLE_TYPES:
				getRoleTypes().clear();
				getRoleTypes().addAll((Collection<? extends RoleType>)newValue);
				return;
			case CDLPackage.PACKAGE__RELATIONSHIP_TYPES:
				getRelationshipTypes().clear();
				getRelationshipTypes().addAll((Collection<? extends RelationshipType>)newValue);
				return;
			case CDLPackage.PACKAGE__PARTICIPANT_TYPES:
				getParticipantTypes().clear();
				getParticipantTypes().addAll((Collection<? extends ParticipantType>)newValue);
				return;
			case CDLPackage.PACKAGE__CHANNEL_TYPES:
				getChannelTypes().clear();
				getChannelTypes().addAll((Collection<? extends ChannelType>)newValue);
				return;
			case CDLPackage.PACKAGE__CHOREOGRAPHIES:
				getChoreographies().clear();
				getChoreographies().addAll((Collection<? extends Choreography>)newValue);
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
			case CDLPackage.PACKAGE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CDLPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CDLPackage.PACKAGE__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case CDLPackage.PACKAGE__NAMESPACES:
				getNamespaces().clear();
				return;
			case CDLPackage.PACKAGE__INFORMATION_TYPES:
				getInformationTypes().clear();
				return;
			case CDLPackage.PACKAGE__TOKENS:
				getTokens().clear();
				return;
			case CDLPackage.PACKAGE__TOKEN_LOCATORS:
				getTokenLocators().clear();
				return;
			case CDLPackage.PACKAGE__ROLE_TYPES:
				getRoleTypes().clear();
				return;
			case CDLPackage.PACKAGE__RELATIONSHIP_TYPES:
				getRelationshipTypes().clear();
				return;
			case CDLPackage.PACKAGE__PARTICIPANT_TYPES:
				getParticipantTypes().clear();
				return;
			case CDLPackage.PACKAGE__CHANNEL_TYPES:
				getChannelTypes().clear();
				return;
			case CDLPackage.PACKAGE__CHOREOGRAPHIES:
				getChoreographies().clear();
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
			case CDLPackage.PACKAGE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CDLPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CDLPackage.PACKAGE__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case CDLPackage.PACKAGE__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case CDLPackage.PACKAGE__INFORMATION_TYPES:
				return informationTypes != null && !informationTypes.isEmpty();
			case CDLPackage.PACKAGE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case CDLPackage.PACKAGE__TOKEN_LOCATORS:
				return tokenLocators != null && !tokenLocators.isEmpty();
			case CDLPackage.PACKAGE__ROLE_TYPES:
				return roleTypes != null && !roleTypes.isEmpty();
			case CDLPackage.PACKAGE__RELATIONSHIP_TYPES:
				return relationshipTypes != null && !relationshipTypes.isEmpty();
			case CDLPackage.PACKAGE__PARTICIPANT_TYPES:
				return participantTypes != null && !participantTypes.isEmpty();
			case CDLPackage.PACKAGE__CHANNEL_TYPES:
				return channelTypes != null && !channelTypes.isEmpty();
			case CDLPackage.PACKAGE__CHOREOGRAPHIES:
				return choreographies != null && !choreographies.isEmpty();
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
		result.append(" (author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param elem
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals("package")) {
			setName(elem.attributeValue("name"));
			setAuthor(elem.attributeValue("author"));
			setTargetNamespace(elem.attributeValue("targetNamespace"));
			Iterator attributesIterator = elem.declaredNamespaces().iterator();
			addNamespaceOfThePackage(attributesIterator);
		}
		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
		
		doSomething();
	}

	/**
	 * 
	 * @param namespacesIterator
	 */
	public void addNamespaceOfThePackage(Iterator namespacesIterator) {
		while (namespacesIterator.hasNext()) {
			org.dom4j.Namespace namespace = (org.dom4j.Namespace) namespacesIterator
					.next();
			Namespace ns = CDLFactory.eINSTANCE.createNamespace();
			String prefix = namespace.getPrefix();
			String uri = namespace.getURI();
			ns.setPrefix(prefix);
			ns.setUri(uri);
			getNamespaces().add(ns);
		}
	}

	/**
	 * 
	 * @param elem
	 * @return
	 */
	public CDLElement newSubCDLElementObject(Element elem) {

		CDLElement cdlElement = null;
		String elemName = elem.getName();

		if (elemName.equals(CDLElemNameConstants.INFOMATIONTYPE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createInformationType();
			getInformationTypes().add((InformationType) cdlElement);
		} else if (elemName.equals(CDLElemNameConstants.TOKEN_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createToken();
			getTokens().add((Token) cdlElement);
		} else if (elemName.equals(CDLElemNameConstants.TOKENLOCATOR_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createTokenLocator();
			getTokenLocators().add((TokenLocator) cdlElement);
		} else if (elemName.equals(CDLElemNameConstants.ROLETYPE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createRoleType();
			getRoleTypes().add((RoleType) cdlElement);
		} else if (elemName
				.equals(CDLElemNameConstants.RELATIONSHIPTYPE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createRelationshipType();
			getRelationshipTypes().add((RelationshipType) cdlElement);
		} else if (elemName
				.equals(CDLElemNameConstants.PARTICIPANTTYPE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createParticipantType();
			getParticipantTypes().add((ParticipantType) cdlElement);
		} else if (elemName.equals(CDLElemNameConstants.CHANNELTYPE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createChannelType();
			getChannelTypes().add((ChannelType) cdlElement);
		} else if (elemName.equals(CDLElemNameConstants.CHOREOGRAPHY_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createChoreography();
			getChoreographies().add((Choreography) cdlElement);
		}

		return cdlElement;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Token getToken(String name) {
		Token ret = null;
		ret = (Token) getCDLElementByTheNameAttribute(name, getTokens());
		return (ret);
	}

	public TokenLocator getTokenLocator(String token, InformationType infoType) {
		TokenLocator ret = null;

		if (getTokenLocators() != null) {
			java.util.Iterator iter = getTokenLocators()
					.iterator();

			while (ret == null && iter.hasNext()) {
				ret = (TokenLocator) iter.next();

				if (ret.getToken() == null || ret.getInformationType() == null
						|| ret.getToken().getName().equals(token) == false
						|| ret.getInformationType().equals(infoType) == false) {

					ret = null;
				}
			}
		}

		return (ret);
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public RoleType getRoleType(String name) {
		RoleType ret = null;

		ret = (RoleType) getCDLElementByTheNameAttribute(name, getRoleTypes());

		return (ret);
	}

	public RelationshipType getRelationshipType(String name) {
		RelationshipType ret = null;

		if (getRelationshipTypes() != null) {
			ret = (RelationshipType) getCDLElementByTheNameAttribute(name, getRelationshipTypes());
		}

		return (ret);
	}

	public ParticipantType getParticipantType(String name) {
		ParticipantType ret = null;

		if (getParticipantTypes() != null) {
			ret = (ParticipantType) getCDLElementByTheNameAttribute(name, getParticipantTypes());
		}

		return (ret);
	}

	public ChannelType getChannelType(String name) {
		ChannelType ret = null;

		if (getParticipantTypes() != null) {
			ret = (ChannelType) getCDLElementByTheNameAttribute(name, getParticipantTypes());
		}

		return (ret);
	}

	/**
	 * 
	 * @param name
	 * @param list
	 * @return
	 */
	public CDLElement getCDLElementByTheNameAttribute(String name,
			java.util.List list) {
		CDLElement ret = null;

		String namespace = null;
		String targetNamespace = null;

		if (this.getBelongedPackage() != null) {
			targetNamespace = getBelongedPackage().getTargetNamespace();
		}

		if (targetNamespace == null
				|| (namespace = CDLElementUtil.getNamespace(name, this, true)) != null
				&& namespace.equals(targetNamespace)) {

			java.util.Iterator iter = list.iterator();

			while (ret == null && iter.hasNext()) {
				CDLElement type = (CDLElement) iter.next();

				if (type.getName() != null
						&& type.getName().equals(XMLUtils.getLocalname(name))) {
					ret = type;
				}
			}
		}

		return (ret);
	}
	
	/**
	 * 
	 * @param prefix
	 * @return
	 */
	public String getURIFromPrefix(String prefix) {
		String ret = null;

		if (getNamespaces() != null) {
			Iterator iter = getNamespaces().iterator();
			// ########################################
			while (ret == null && iter.hasNext()) {
				Namespace ns = (Namespace) iter.next();

				if (ns.getPrefix().equals(prefix)) {
					ret = ns.getUri();
				}
			}
		}

		return (ret);
	}

	public String getPrefixFromURI(String namespace) {
		String ret = null;

		if (getNamespaces() != null) {
			Iterator iter = getNamespaces().iterator();
			// ########################################
			while (ret == null && iter.hasNext()) {
				Namespace ns = (Namespace) iter.next();

				if (ns.getUri().equals(namespace)) {
					ret = ns.getPrefix();
				}
			}
		}

		return (ret);
	}
	
	public Choreography getChoreography(String name) {
		Choreography choreo = null;
		if (getChoreographies() != null) {
			//#############################################
			choreo = (Choreography) getCDLElementByTheNameAttribute(name,
					getChoreographies());
		}
		return choreo;
	}
	
	public void extractCDLPackageInfo(ExtractCDLInfo2WSDLInfo visitor) {
		visitor.extractCDLPackage(this);
	}
} //PackageImpl
