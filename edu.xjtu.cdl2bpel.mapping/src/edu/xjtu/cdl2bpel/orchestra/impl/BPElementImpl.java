/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPElementImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELProjector;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELProxy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BPElementImpl extends EObjectImpl implements BPElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected String addition = ADDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.BP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddition(String newAddition) {
		String oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ELEMENT__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.BP_ELEMENT__NAME:
				return getName();
			case OrchestraPackage.BP_ELEMENT__DESCRIPTION:
				return getDescription();
			case OrchestraPackage.BP_ELEMENT__ADDITION:
				return getAddition();
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
			case OrchestraPackage.BP_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case OrchestraPackage.BP_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrchestraPackage.BP_ELEMENT__ADDITION:
				setAddition((String)newValue);
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
			case OrchestraPackage.BP_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrchestraPackage.BP_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrchestraPackage.BP_ELEMENT__ADDITION:
				setAddition(ADDITION_EDEFAULT);
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
			case OrchestraPackage.BP_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrchestraPackage.BP_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrchestraPackage.BP_ELEMENT__ADDITION:
				return ADDITION_EDEFAULT == null ? addition != null : !ADDITION_EDEFAULT.equals(addition);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", addition: ");
		result.append(addition);
		result.append(')');
		return result.toString();
	}

	public BPOrchestra getBelongedBPOrchestra() {
		BPOrchestra ret = null;
		if (this instanceof BPOrchestra) {
			ret = (BPOrchestra) this;
		} else {
			 ret = ((BPElement)eContainer()).getBelongedBPOrchestra();
		}
		return (ret);
	}
	
//	public void accept(OrchestraVisitor visitor) {
//		// Propagate the visitor to any child nodes
//		Iterator iter = eContents().iterator();
//		while (iter.hasNext()) {
//			Object obj = iter.next();
//
//			if (obj instanceof BPElement) {
//				((BPElement) obj).accept(visitor);
//			}
//		}
//	}

	public BPElement getParent() {

		BPElementImpl ret = null;

		if (eContainer() instanceof BPElementImpl) {
			ret = (BPElementImpl) eContainer();
		}

		return (ret);
	}
	
	public GlobalArchitectureImpl getGlobalArchitectureImpl() {
		if (getParent() != null) {
			return (getParent().getGlobalArchitectureImpl());
		} else if (this instanceof GlobalArchitectureImpl){
			return (GlobalArchitectureImpl)this;
		}
		return (null);
	}

	public GlobalArchitecture getGlobalArchitecture() {
		return (getGlobalArchitectureImpl());
	}

	public void transtorm(Orchestra2BPELContext context) {
		// 因为FautlHandlerImpl需要加空操作，所以只有FautlHandlerImpl重写了该方法
		Orchestra2BPELProjector projector = Orchestra2BPELProxy
				.getProjectorByOrchestraName(this.getClass().getName());
		// 根据中间标签的名字得到相应的projector
		if (projector != null) {
			// 命名空间和伙伴链接没有注册，所以它们的projector为null，所以要在GlobalArchitectureImpl中进行处理
			Element elem = projector.transformOrchestra2BPEL(context, this);
			context.push(elem);

			// 遍历子节点
			Iterator childrenIterator = this.eContents().iterator();// 得到子节点
			while (childrenIterator.hasNext()) {
				Object child = childrenIterator.next();
				if (child instanceof BPElement) {
					/*
					 * Orchestra2BPELProjector
					 * childProjector=Orchestra2BPELProxy
					 * .getProjectorByOrchestraName(child.getClass().getName());
					 * if(childProjector!=null){
					 * childProjector.transformOrchestra2BPEL(context,
					 * (BPElement)child); }
					 */
					((BPElement) child).transtorm(context);
				}
			}
			context.pop();
		}
	}

} //BPElementImpl
