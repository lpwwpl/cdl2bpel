/**
 * CDL2BPEL_XJTU
 *
 * $Id: BindInfoImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Bind Info</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl#getThisVariable <em>This
 * Variable</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl#getThisRole <em>This Role
 * </em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl#getFreeVariable <em>Free
 * Variable</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl#getFreeRole <em>Free Role
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BindInfoImpl extends CDLElementImpl implements BindInfo {
	/**
	 * The cached value of the '{@link #getThisVariable()
	 * <em>This Variable</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getThisVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable thisVariable;

	/**
	 * The cached value of the '{@link #getThisRole() <em>This Role</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getThisRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType thisRole;

	/**
	 * The cached value of the '{@link #getFreeVariable()
	 * <em>Free Variable</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getFreeVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable freeVariable;

	/**
	 * The cached value of the '{@link #getFreeRole() <em>Free Role</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFreeRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType freeRole;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BindInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.BIND_INFO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable getThisVariable() {
		if (thisVariable != null && thisVariable.eIsProxy()) {
			InternalEObject oldThisVariable = (InternalEObject) thisVariable;
			thisVariable = (Variable) eResolveProxy(oldThisVariable);
			if (thisVariable != oldThisVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.BIND_INFO__THIS_VARIABLE,
							oldThisVariable, thisVariable));
			}
		}
		return thisVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable basicGetThisVariable() {
		return thisVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThisVariable(Variable newThisVariable) {
		Variable oldThisVariable = thisVariable;
		thisVariable = newThisVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.BIND_INFO__THIS_VARIABLE, oldThisVariable,
					thisVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleType getThisRole() {
		if (thisRole != null && thisRole.eIsProxy()) {
			InternalEObject oldThisRole = (InternalEObject) thisRole;
			thisRole = (RoleType) eResolveProxy(oldThisRole);
			if (thisRole != oldThisRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.BIND_INFO__THIS_ROLE, oldThisRole,
							thisRole));
			}
		}
		return thisRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleType basicGetThisRole() {
		return thisRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setThisRole(RoleType newThisRole) {
		RoleType oldThisRole = thisRole;
		thisRole = newThisRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.BIND_INFO__THIS_ROLE, oldThisRole, thisRole));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable getFreeVariable() {
		if (freeVariable != null && freeVariable.eIsProxy()) {
			InternalEObject oldFreeVariable = (InternalEObject) freeVariable;
			freeVariable = (Variable) eResolveProxy(oldFreeVariable);
			if (freeVariable != oldFreeVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.BIND_INFO__FREE_VARIABLE,
							oldFreeVariable, freeVariable));
			}
		}
		return freeVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Variable basicGetFreeVariable() {
		return freeVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFreeVariable(Variable newFreeVariable) {
		Variable oldFreeVariable = freeVariable;
		freeVariable = newFreeVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.BIND_INFO__FREE_VARIABLE, oldFreeVariable,
					freeVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleType getFreeRole() {
		if (freeRole != null && freeRole.eIsProxy()) {
			InternalEObject oldFreeRole = (InternalEObject) freeRole;
			freeRole = (RoleType) eResolveProxy(oldFreeRole);
			if (freeRole != oldFreeRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CDLPackage.BIND_INFO__FREE_ROLE, oldFreeRole,
							freeRole));
			}
		}
		return freeRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleType basicGetFreeRole() {
		return freeRole;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFreeRole(RoleType newFreeRole) {
		RoleType oldFreeRole = freeRole;
		freeRole = newFreeRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CDLPackage.BIND_INFO__FREE_ROLE, oldFreeRole, freeRole));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CDLPackage.BIND_INFO__THIS_VARIABLE:
			if (resolve)
				return getThisVariable();
			return basicGetThisVariable();
		case CDLPackage.BIND_INFO__THIS_ROLE:
			if (resolve)
				return getThisRole();
			return basicGetThisRole();
		case CDLPackage.BIND_INFO__FREE_VARIABLE:
			if (resolve)
				return getFreeVariable();
			return basicGetFreeVariable();
		case CDLPackage.BIND_INFO__FREE_ROLE:
			if (resolve)
				return getFreeRole();
			return basicGetFreeRole();
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
		case CDLPackage.BIND_INFO__THIS_VARIABLE:
			setThisVariable((Variable) newValue);
			return;
		case CDLPackage.BIND_INFO__THIS_ROLE:
			setThisRole((RoleType) newValue);
			return;
		case CDLPackage.BIND_INFO__FREE_VARIABLE:
			setFreeVariable((Variable) newValue);
			return;
		case CDLPackage.BIND_INFO__FREE_ROLE:
			setFreeRole((RoleType) newValue);
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
		case CDLPackage.BIND_INFO__THIS_VARIABLE:
			setThisVariable((Variable) null);
			return;
		case CDLPackage.BIND_INFO__THIS_ROLE:
			setThisRole((RoleType) null);
			return;
		case CDLPackage.BIND_INFO__FREE_VARIABLE:
			setFreeVariable((Variable) null);
			return;
		case CDLPackage.BIND_INFO__FREE_ROLE:
			setFreeRole((RoleType) null);
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
		case CDLPackage.BIND_INFO__THIS_VARIABLE:
			return thisVariable != null;
		case CDLPackage.BIND_INFO__THIS_ROLE:
			return thisRole != null;
		case CDLPackage.BIND_INFO__FREE_VARIABLE:
			return freeVariable != null;
		case CDLPackage.BIND_INFO__FREE_ROLE:
			return freeRole != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Return the boolean value of whether BindInfo is relevant with the
	 * roleType,overwriting the super's method of isRelevantWithTheRoleType
	 * 
	 * @param roleType
	 * @return the value of whether CDLElement is relevant with the roleType
	 */
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret = false;

		if (getThisRole() != null && roleType != null) {
			ret = getThisRole().equals(roleType);
		}

		if (ret == false && getFreeRole() != null && roleType != null) {
			ret = getFreeRole().equals(roleType);
		}

		return (ret);
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem
	 *            the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem != null && elem.getName().equals("bind")) {
			setName(elem.attributeValue("name"));

			edu.xjtu.cdl2bpel.cdl.Package cdlpack = getBelongedPackage();

			List<Element> thisNode = elem.elements("this");
			List<Element> freeNode = elem.elements("free");

			if (thisNode.size() == 1) {
				Element thisElem = (Element) thisNode.get(0);
				thisVariableName = thisElem.attributeValue("variable");

				if (cdlpack != null) {
					String role = thisElem.attributeValue("roleType");
					RoleType roleType = cdlpack.getRoleType(role);

					if (roleType == null) {
					} else {
						setThisRole(roleType);
					}
				}

			} else if (thisNode.size() == 0) {
			} else {
			}

			if (freeNode.size() == 1) {
				Element freeElem = (Element) freeNode.get(0);
				// Variable to be initialized on second pass
				freeVariableName = freeElem.attributeValue("variable");

				if (cdlpack != null) {
					String role = freeElem.attributeValue("roleType");
					RoleType roleType = cdlpack.getRoleType(role);

					if (roleType == null) {
					} else {
						setFreeRole(roleType);
					}
				}
			} else if (freeNode.size() == 0) {
			} else {
			}
		}

		if (isNotNull(thisVariableName) && this.getBelongedChoreography() != null) {
			XPathContext context = DefaultXPathContext.createContext(this, this
					.getBelongedChoreography());

			// TODO: May need to validate expression
			// against associated role
			ValidationResult res = XPathValidator.validateVariable(context,
					thisVariableName, getRoleTypesMatrixFromTheContext(),
					false);

			if (res != null && res.getVariable() != null) {
				setThisVariable(res.getVariable());
			}

			// Check that part and query fields have not bee defined
			if (res != null
					&& (CheckNOthersUtil.isSet(res.getDocumentPath()) || CheckNOthersUtil
							.isSet(res.getPartName()))) {
			}
		} else {
		}

		// Initialize the 'free' variable
		if (isNotNull(freeVariableName) && getParent() instanceof PerformImpl
				&& ((PerformImpl) getParent()).getChoreography() != null) {
			Choreography choreo = ((PerformImpl) getParent()).getChoreography();

			XPathContext context = DefaultXPathContext.createContext(this,
					choreo);

			ValidationResult res = XPathValidator.validateVariable(context,
					freeVariableName, choreo
							.getRoleTypesMatrixFromTheContext(), false);

			if (res != null && res.getVariable() != null) {
				setFreeVariable(res.getVariable());
			}

			// Check that part and query fields have not bee defined
			if (res != null
					&& (CheckNOthersUtil.isSet(res.getDocumentPath()) || CheckNOthersUtil
							.isSet(res.getPartName()))) {
			}
		} else {
		}
	}

	protected boolean isNotNull(String value) {
		boolean ret = false;
		if (value != null && !value.equals("")) {
			ret = true;
		}
		return (ret);
	}

	private String thisVariableName = null;
	private String freeVariableName = null;
} // BindInfoImpl
