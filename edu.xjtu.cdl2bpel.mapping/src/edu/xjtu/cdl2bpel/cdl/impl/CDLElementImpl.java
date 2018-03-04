/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLElementImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Iterator;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.cdl2orchestra.AbstractCDL2OrchestraProjector;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractCDLInfo2WSDLInfo;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl#getDescription <em>
 * Description</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl#getName <em>Name</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl#getAddition <em>Addition
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class CDLElementImpl extends EObjectImpl implements CDLElement {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddition() <em>Addition</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected String addition = ADDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CDLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.CDL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.CDL_ELEMENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.CDL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddition(String newAddition) {
		String oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.CDL_ELEMENT__ADDITION, oldAddition, addition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDLPackage.CDL_ELEMENT__DESCRIPTION:
			return getDescription();
		case CDLPackage.CDL_ELEMENT__NAME:
			return getName();
		case CDLPackage.CDL_ELEMENT__ADDITION:
			return getAddition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CDLPackage.CDL_ELEMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CDLPackage.CDL_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case CDLPackage.CDL_ELEMENT__ADDITION:
			setAddition((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CDLPackage.CDL_ELEMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CDLPackage.CDL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CDLPackage.CDL_ELEMENT__ADDITION:
			setAddition(ADDITION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CDLPackage.CDL_ELEMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null
					: !DESCRIPTION_EDEFAULT.equals(description);
		case CDLPackage.CDL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case CDLPackage.CDL_ELEMENT__ADDITION:
			return ADDITION_EDEFAULT == null ? addition != null
					: !ADDITION_EDEFAULT.equals(addition);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", addition: ");
		result.append(addition);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {
		CDLElement cdlElement = newSubCDLElementObject(elem);
		if (cdlElement != null) {
			cdlElement.resolveTheCDLElementByElement(elem);
		}
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		return null;
	}

	/**
	 * Get the belonged CDL Package
	 * 
	 * @return the belonged CDL Package
	 */
	public Package getBelongedPackage() {
		Package ret = null;
		if (this instanceof edu.xjtu.cdl2bpel.cdl.Package) {
			ret = (PackageImpl) this;
		} else if (eContainer() instanceof CDLElement) {
			ret = ((CDLElement) eContainer()).getBelongedPackage();
		}
		return (ret);
	}

	/**
	 * Get the cdlElement from the list of the the cdlElement identified by the
	 * name value.
	 * 
	 * @param name
	 *            the name value of CDLElement
	 * @param list
	 *            the cdlElement list
	 * @return the cdlElement which the name value equals to the parameter
	 *         'name'
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
	 * Get the belonged Choreography of the current cdlElement
	 * 
	 * @return the belonged CDL Choreography
	 */
	public Choreography getBelongedChoreography() {
		Choreography choreo = null;
		if (this instanceof Choreography) {
			choreo = (Choreography) this;
		} else if (eContainer() instanceof CDLElement) {
			choreo = ((CDLElement) eContainer()).getBelongedChoreography();
		}
		return choreo;
	}

	public void accept(AbstractCDL2OrchestraProjector projector) {

		if (projector != null) {
			projector.transformCDLElement2OrchestraByRoleRelevance(projector
					.getContext());
		}
	}

	/**
	 * Return the boolean value of whether CDLElement is relevant with the
	 * roleType
	 * 
	 * @param roleType
	 * @return the value of whether CDLElement is relevant with the roleType
	 */
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret = false;
		Iterator iter = eContents().iterator();
		while (ret == false && iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof CDLElement) {
				ret = ((CDLElement) obj).isRelevantWithTheRoleType(roleType);
			}
		}
		return (ret);
	}

	/**
	 * Used for checking whether the CDLElement is relevant with the RoleGroup
	 * Matrix
	 * 
	 * @param roleGroup
	 *            the roleType matrix
	 * @return the boolean value whether CDLElement is relevant with the
	 *         roleGroup
	 */
	public boolean isRelevantWithTheRoleGroup(RoleType[] roleGroup) {
		boolean ret = false;
		for (RoleType roleType : roleGroup) {
			ret = isRelevantWithTheRoleType(roleType);
			if (ret == true) {
				return true;
			}
		}
		return ret;
	}

	/**
	 * Used for initializing attribute values of CDLElement when parsing CDL
	 * document If a cdlElement attribute reference another cdlElement which is
	 * defined in the following XML segment,we must set attribute of the
	 * referenced cdlElement,then after the referenced cdlElement be parsing and
	 * recognized,we set the referenced cdlElement value in real of the
	 * cdlElement.
	 */
	public void doSomething() {
		Iterator iter = eContents().iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof CDLElementImpl) {
				((CDLElementImpl) obj).doSomething();
			}
		}
	}

	/**
	 * Used for get the sub cdlElement which is the child of CDLElement when
	 * parsing CDL XML document
	 * 
	 * @return the sub CDLElement
	 */
	public CDLElement getTheSubCDLElement() {
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public RoleType[] getRoleTypesMatrixFromTheContext() {
		if (eContainer() instanceof CDLElementImpl) {
			return (((CDLElementImpl) eContainer())
					.getRoleTypesMatrixFromTheContext());
		}
		return (new RoleType[0]);
	}

	/**
	 * 
	 */
	public boolean isInterrelatedWithRoleTypeMatrixFromTheContext(
			String roleTypeName) {
		boolean ret = false;

		RoleType[] types = getRoleTypesMatrixFromTheContext();
		for (int i = 0; types != null && roleTypeName != null && ret == false
				&& i < types.length; i++) {

			if (types[i] != null && types[i].getName() != null
					&& types[i].getName().equals(roleTypeName)) {
				ret = true;
			}
		}

		return (ret);
	}

	/**
	 * 
	 */
	public boolean isInterrelatedWithRoleType(RoleType roleType) {
		boolean ret = false;
		if (roleType != null) {
			ret = isInterrelatedWithRoleTypeMatrixFromTheContext(roleType
					.getName());
		}
		return (ret);
	}

	/**
	 * Get the parent CDLElement of current CDLElement
	 * 
	 * @return the parent CDLElement of the current cdlElement
	 */
	public CDLElement getParent() {
		CDLElementImpl ret = null;

		if (eContainer() instanceof CDLElementImpl) {
			ret = (CDLElementImpl) eContainer();
		}

		return (ret);
	}

	/**
	 * This method determines whether the CDL type is a
	 * grouping construct.
	 * 
	 * @return Whether the CDL type is a grouping construct
	 */
	public boolean isGroupingConstruct() {
		return(false);
	}
	
	/**
	 * This method determines whether the CDL type is a
	 * conditional grouping construct.
	 * 
	 * @return Whether the CDL type is a conditional grouping construct
	 */
	public boolean isConditionalGroupingConstruct() {
		return(false);
	}
	
	/**
	 * This method determines whether the CDL type is a
	 * sequential grouping construct.
	 * 
	 * @return Whether the CDL type is a sequential grouping construct
	 */
	public boolean isSequentialGroupingConstruct() {
		return(false);
	}
	
} // CDLElementImpl
