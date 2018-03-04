/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExceptionWorkUnitImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;
import edu.xjtu.cdl2bpel.orchestra.Conditional;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Work Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionWorkUnitImpl extends WorkUnitImpl implements ExceptionWorkUnit {
	/**
	 * The default value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected String exceptionType = EXCEPTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionWorkUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.EXCEPTION_WORK_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(String newExceptionType) {
		String oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.EXCEPTION_WORK_UNIT__EXCEPTION_TYPE, oldExceptionType, exceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.EXCEPTION_WORK_UNIT__EXCEPTION_TYPE:
				return getExceptionType();
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
			case CDLPackage.EXCEPTION_WORK_UNIT__EXCEPTION_TYPE:
				setExceptionType((String)newValue);
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
			case CDLPackage.EXCEPTION_WORK_UNIT__EXCEPTION_TYPE:
				setExceptionType(EXCEPTION_TYPE_EDEFAULT);
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
			case CDLPackage.EXCEPTION_WORK_UNIT__EXCEPTION_TYPE:
				return EXCEPTION_TYPE_EDEFAULT == null ? exceptionType != null : !EXCEPTION_TYPE_EDEFAULT.equals(exceptionType);
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
		result.append(" (exceptionType: ");
		result.append(exceptionType);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals("workunit")) {
			setName(elem.attributeValue("name"));
			String repeatValue = elem.attributeValue("repeat");
			String guardValue = elem.attributeValue("guard");
			String blockValue = elem.attributeValue("block");
			this.setRepeatExpression(repeatValue);
			this.setGuardExpression(guardValue);
			this.setBlock(blockValue);
			
			String excTypeName="";
			XPathContext xpcontext=
				DefaultXPathContext.createContext(this,
						getBelongedChoreography());

			ValidationResult result=
				XPathValidator.validateExceptionType(xpcontext,
						getBelongedPackage(), getRoleTypesMatrixFromTheContext(),
						guardValue);
			
			if (result != null) {
				excTypeName = result.getExceptionTypeName();
			}

			if (excTypeName != null) {
				setExceptionType(excTypeName);
			}
		}
	
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			CDLElement cdlElement = newSubCDLElementObject (subElem);
			cdlElement.resolveTheCDLElementByElement(subElem);
		}
		
		if (getActivities().size() == 1 &&
				getActivities().get(0) instanceof SequenceImpl) {
			SequenceImpl seq=(SequenceImpl)getActivities().get(0);
			
			while (seq.getActivities().size() > 0) {
				Activity act=(Activity)seq.getActivities().get(0);
				seq.getActivities().remove(0);
				getActivities().add(act);
			}
			
			// Remove now empty sequence
			getActivities().remove(0);
		}
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		String elemName = elem.getName();
 		if (elemName.equals("sequence")) {
			cdlElement = CDLFactory.eINSTANCE.createSequence();
		} else if (elemName.equals("choice")) {
			cdlElement = CDLFactory.eINSTANCE.createChoice();
		} else if (elemName.equals("parrallel")) {
			cdlElement = CDLFactory.eINSTANCE.createParallel();
		}else if (elemName.equals("perform")) {
			cdlElement = CDLFactory.eINSTANCE.createPerform(); 
        }else if (elemName.equals("workunit")) {
			String repeatValue = elem.attributeValue("repeat");
			String guardValue = elem.attributeValue("guard");
			String blockValue = elem.attributeValue("block");
			if (blockValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createWhenWithBlockOfWorkUnit();
			} else if (repeatValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createWhileWithRepeateOfWorkUnit();
			} else if (guardValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createCaseConditionalOfSwitch();
			} else {
				cdlElement = CDLFactory.eINSTANCE.createScopeWithNoAttrOfWorkUnit();
			}
		} else if (elemName.equals("assign")) {
			cdlElement = CDLFactory.eINSTANCE.createAssign();
		} else if (elemName.equals("interaction")) {
			cdlElement = CDLFactory.eINSTANCE.createInteraction();
		} else if (elemName.equals("noAction")) {
			cdlElement = CDLFactory.eINSTANCE.createNoAction();
		} else if (elemName.equals("silentAction")) {
			cdlElement = CDLFactory.eINSTANCE.createSilentAction();
		}
 		
 		if(this instanceof ExceptionWorkUnitImpl) {
 			Sequence seq = CDLFactory.eINSTANCE.createSequence();
 			seq.getActivities().add((Activity)(cdlElement));
 			getActivities().add(seq);
 		} else if(cdlElement!= null && this instanceof OrderingStructuralActivity) {
 			((OrderingStructuralActivity)this).getActivities().add((Activity)(cdlElement));
 		} 

		return cdlElement;
	}

	public boolean isRelevantWithTheRoleType(RoleType roleType){
		
		boolean ret = false;

		if (checkingIfRelevant == false) {
			checkingIfRelevant = true;

			if (getBelongedChoreography() != null) {
				ret = getBelongedChoreography().isRelevantWithTheRoleType(
						roleType);
			}

			checkingIfRelevant = false;
		}

		return (true);
	}

	private boolean checkingIfRelevant = false;
} //ExceptionWorkUnitImpl
