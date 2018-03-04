/**
 * CDL2BPEL_XJTU
 *
 * $Id: MessageImpl.java,v 1.1 2011/02/21 06:24:06 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.InformationType;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.Operation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Part;
import edu.xjtu.cdl2bpel.orchestra.util.BPElementUtil;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl#getFaultName <em>Fault Name</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl#getInformationType <em>Information Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends BPElementImpl implements Message {
	/**
	 * The default value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultName() <em>Fault Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultName()
	 * @generated
	 * @ordered
	 */
	protected String faultName = FAULT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final MessageTypeEnumByInteraction CLASSIFICATION_EDEFAULT = MessageTypeEnumByInteraction.REQUEST;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected MessageTypeEnumByInteraction classification = CLASSIFICATION_EDEFAULT;

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
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaultName() {
		return faultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultName(String newFaultName) {
		String oldFaultName = faultName;
		faultName = newFaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.MESSAGE__FAULT_NAME, oldFaultName, faultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, OrchestraPackage.MESSAGE__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeEnumByInteraction getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(MessageTypeEnumByInteraction newClassification) {
		MessageTypeEnumByInteraction oldClassification = classification;
		classification = newClassification == null ? CLASSIFICATION_EDEFAULT : newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.MESSAGE__CLASSIFICATION, oldClassification, classification));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.MESSAGE__INFORMATION_TYPE, oldInformationType, informationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.MESSAGE__INFORMATION_TYPE, oldInformationType, informationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.MESSAGE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.MESSAGE__FAULT_NAME:
				return getFaultName();
			case OrchestraPackage.MESSAGE__PARTS:
				return getParts();
			case OrchestraPackage.MESSAGE__CLASSIFICATION:
				return getClassification();
			case OrchestraPackage.MESSAGE__INFORMATION_TYPE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.MESSAGE__FAULT_NAME:
				setFaultName((String)newValue);
				return;
			case OrchestraPackage.MESSAGE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends Part>)newValue);
				return;
			case OrchestraPackage.MESSAGE__CLASSIFICATION:
				setClassification((MessageTypeEnumByInteraction)newValue);
				return;
			case OrchestraPackage.MESSAGE__INFORMATION_TYPE:
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
			case OrchestraPackage.MESSAGE__FAULT_NAME:
				setFaultName(FAULT_NAME_EDEFAULT);
				return;
			case OrchestraPackage.MESSAGE__PARTS:
				getParts().clear();
				return;
			case OrchestraPackage.MESSAGE__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case OrchestraPackage.MESSAGE__INFORMATION_TYPE:
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
			case OrchestraPackage.MESSAGE__FAULT_NAME:
				return FAULT_NAME_EDEFAULT == null ? faultName != null : !FAULT_NAME_EDEFAULT.equals(faultName);
			case OrchestraPackage.MESSAGE__PARTS:
				return parts != null && !parts.isEmpty();
			case OrchestraPackage.MESSAGE__CLASSIFICATION:
				return classification != CLASSIFICATION_EDEFAULT;
			case OrchestraPackage.MESSAGE__INFORMATION_TYPE:
				return informationType != null;
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
		result.append(" (faultName: ");
		result.append(faultName);
		result.append(", classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

	public Operation getOperation() {
		return((Operation)getParent());
	}

public String getFullyQualifiedFaultName() {
		
		// Derive fully qualified name if not set, or if caching
		// is not enabled (i.e. while the description is being
		// edited). The caching is enabled when the description
		// is initialized ready for use in the runtime.
		if (m_cachedFQFaultName == null || m_enableFQNCaching == false) {
			
			if (CheckNOthersUtil.isSet(getFaultName())) {
				String namespace=BPElementUtil.getNamespace(getFaultName(),
							this);
				
				if (namespace == null && getOperation() != null &&
						getOperation().getInterfaceOfGroup() != null) {
					namespace = NameSpaceUtil.getNamespace(
							getOperation().getInterfaceOfGroup().
								getFullyQualifiedName());
				}
	
				String localpart=XMLUtils.getLocalname(getFaultName());
				
				m_cachedFQFaultName = NameSpaceUtil.getFullyQualifiedName(namespace,
								localpart);
			}
		}
		
		return(m_cachedFQFaultName);
	}
	
	private String m_cachedFQFaultName=null;
    private boolean m_enableFQNCaching=false;

} //MessageImpl
