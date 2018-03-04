/**
 * CDL2BPEL_XJTU
 *
 * $Id: TokenLocatorImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Locator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl#getToken <em>Token</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl#getInformationType <em>Information Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenLocatorImpl extends CDLElementImpl implements TokenLocator {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected Token token;

	/**
	 * The cached value of the '{@link #getInformationType() <em>Information Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationType()
	 * @generated
	 * @ordered
	 */
	protected InformationType informationType;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected String part = PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenLocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.TOKEN_LOCATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getToken() {
		if (token != null && token.eIsProxy()) {
			InternalEObject oldToken = (InternalEObject)token;
			token = (Token)eResolveProxy(oldToken);
			if (token != oldToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.TOKEN_LOCATOR__TOKEN, oldToken, token));
			}
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token basicGetToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(Token newToken) {
		Token oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.TOKEN_LOCATOR__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationType getInformationType() {
		if (informationType != null && informationType.eIsProxy()) {
			InternalEObject oldInformationType = (InternalEObject)informationType;
			informationType = (InformationType)eResolveProxy(oldInformationType);
			if (informationType != oldInformationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE, oldInformationType, informationType));
			}
		}
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationType basicGetInformationType() {
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationType(InformationType newInformationType) {
		InformationType oldInformationType = informationType;
		informationType = newInformationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE, oldInformationType, informationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.TOKEN_LOCATOR__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPart(String newPart) {
		String oldPart = part;
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.TOKEN_LOCATOR__PART, oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.TOKEN_LOCATOR__TOKEN:
				if (resolve) return getToken();
				return basicGetToken();
			case CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE:
				if (resolve) return getInformationType();
				return basicGetInformationType();
			case CDLPackage.TOKEN_LOCATOR__QUERY:
				return getQuery();
			case CDLPackage.TOKEN_LOCATOR__PART:
				return getPart();
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
			case CDLPackage.TOKEN_LOCATOR__TOKEN:
				setToken((Token)newValue);
				return;
			case CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE:
				setInformationType((InformationType)newValue);
				return;
			case CDLPackage.TOKEN_LOCATOR__QUERY:
				setQuery((String)newValue);
				return;
			case CDLPackage.TOKEN_LOCATOR__PART:
				setPart((String)newValue);
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
			case CDLPackage.TOKEN_LOCATOR__TOKEN:
				setToken((Token)null);
				return;
			case CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE:
				setInformationType((InformationType)null);
				return;
			case CDLPackage.TOKEN_LOCATOR__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case CDLPackage.TOKEN_LOCATOR__PART:
				setPart(PART_EDEFAULT);
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
			case CDLPackage.TOKEN_LOCATOR__TOKEN:
				return token != null;
			case CDLPackage.TOKEN_LOCATOR__INFORMATION_TYPE:
				return informationType != null;
			case CDLPackage.TOKEN_LOCATOR__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case CDLPackage.TOKEN_LOCATOR__PART:
				return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
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
		result.append(" (query: ");
		result.append(query);
		result.append(", part: ");
		result.append(part);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param elem
	 */
	public void resolveCDLElementByElement(Element elem) {
		if (elem != null && elem.getName().equals("tokenLocator")) {

			setName(elem.attributeValue("name"));

			// Initialize the attributes
			String tokenName = elem.attributeValue("tokenName");
			if (tokenName != null) {
				edu.xjtu.cdl2bpel.cdl.Package cdlpack = getBelongedPackage();

				if (cdlpack != null) {
					edu.xjtu.cdl2bpel.cdl.Token token = cdlpack
							.getToken(tokenName);

					if (token != null) {
						setToken(token);
					} else {
					}
				}
			}

			String infoType = elem.attributeValue("informationType");
			if (infoType != null) {
				edu.xjtu.cdl2bpel.cdl.Package cdlpack = getBelongedPackage();

				if (cdlpack != null) {
					// ##################################
					edu.xjtu.cdl2bpel.cdl.InformationType type = CDLPackageUtil
							.getInformationType(cdlpack, infoType);

					if (type != null) {
						setInformationType(type);
					} else {
					}
				}
			}

			if (elem.attributeValue("part") != null) {
				setPart(elem.attributeValue("part"));
			}

			if (elem.attributeValue("query") != null) {
				setQuery(elem.attributeValue("query"));
			}
		}
	}
} //TokenLocatorImpl
