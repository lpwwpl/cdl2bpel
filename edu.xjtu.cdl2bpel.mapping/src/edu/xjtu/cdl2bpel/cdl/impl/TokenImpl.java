/**
 * CDL2BPEL_XJTU
 *
 * $Id: TokenImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.Package;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.TokenImpl#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends CDLElementImpl implements Token {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.TOKEN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.TOKEN__INFORMATION_TYPE, oldInformationType, informationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.TOKEN__INFORMATION_TYPE, oldInformationType, informationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.TOKEN__INFORMATION_TYPE:
				if (resolve) return getInformationType();
				return basicGetInformationType();
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
			case CDLPackage.TOKEN__INFORMATION_TYPE:
				setInformationType((InformationType)newValue);
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
			case CDLPackage.TOKEN__INFORMATION_TYPE:
				setInformationType((InformationType)null);
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
			case CDLPackage.TOKEN__INFORMATION_TYPE:
				return informationType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * 
	 * @param elem
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.TOKEN_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			Package cdlPackage = getBelongedPackage();
			InformationType informationType = null;
			if(elem.attributeValue("informationType")!=null) {
			informationType = CDLPackageUtil.getInformationType(cdlPackage,elem.attributeValue("informationType"));
			setInformationType(informationType);
			}
		}
	}
} //TokenImpl
