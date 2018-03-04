/**
 * CDL2BPEL_XJTU
 *
 * $Id: CopyOfAssignImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Of Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getCauseException <em>Cause Exception</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getSourceVariablePart <em>Source Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl#getTargetVariablePart <em>Target Variable Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyOfAssignImpl extends CDLElementImpl implements CopyOfAssign {
	/**
	 * The cached value of the '{@link #getSourceVariable() <em>Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable sourceVariable;

	/**
	 * The default value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected String sourceExpression = SOURCE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable targetVariable;

	/**
	 * The default value of the '{@link #getCauseException() <em>Cause Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseException()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EXCEPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCauseException() <em>Cause Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseException()
	 * @generated
	 * @ordered
	 */
	protected String causeException = CAUSE_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceVariablePart() <em>Source Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceVariablePart() <em>Source Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String sourceVariablePart = SOURCE_VARIABLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetVariablePart() <em>Target Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetVariablePart() <em>Target Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String targetVariablePart = TARGET_VARIABLE_PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyOfAssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.COPY_OF_ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSourceVariable() {
		if (sourceVariable != null && sourceVariable.eIsProxy()) {
			InternalEObject oldSourceVariable = (InternalEObject)sourceVariable;
			sourceVariable = (Variable)eResolveProxy(oldSourceVariable);
			if (sourceVariable != oldSourceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
			}
		}
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSourceVariable() {
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVariable(Variable newSourceVariable) {
		Variable oldSourceVariable = sourceVariable;
		sourceVariable = newSourceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceExpression() {
		return sourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceExpression(String newSourceExpression) {
		String oldSourceExpression = sourceExpression;
		sourceExpression = newSourceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTargetVariable() {
		if (targetVariable != null && targetVariable.eIsProxy()) {
			InternalEObject oldTargetVariable = (InternalEObject)targetVariable;
			targetVariable = (Variable)eResolveProxy(oldTargetVariable);
			if (targetVariable != oldTargetVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE, oldTargetVariable, targetVariable));
			}
		}
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariable(Variable newTargetVariable) {
		Variable oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE, oldTargetVariable, targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCauseException() {
		return causeException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseException(String newCauseException) {
		String oldCauseException = causeException;
		causeException = newCauseException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__CAUSE_EXCEPTION, oldCauseException, causeException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceVariablePart() {
		return sourceVariablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVariablePart(String newSourceVariablePart) {
		String oldSourceVariablePart = sourceVariablePart;
		sourceVariablePart = newSourceVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE_PART, oldSourceVariablePart, sourceVariablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetVariablePart() {
		return targetVariablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariablePart(String newTargetVariablePart) {
		String oldTargetVariablePart = targetVariablePart;
		targetVariablePart = newTargetVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE_PART, oldTargetVariablePart, targetVariablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE:
				if (resolve) return getSourceVariable();
				return basicGetSourceVariable();
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_EXPRESSION:
				return getSourceExpression();
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE:
				if (resolve) return getTargetVariable();
				return basicGetTargetVariable();
			case CDLPackage.COPY_OF_ASSIGN__CAUSE_EXCEPTION:
				return getCauseException();
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE_PART:
				return getSourceVariablePart();
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE_PART:
				return getTargetVariablePart();
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
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE:
				setSourceVariable((Variable)newValue);
				return;
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
				return;
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE:
				setTargetVariable((Variable)newValue);
				return;
			case CDLPackage.COPY_OF_ASSIGN__CAUSE_EXCEPTION:
				setCauseException((String)newValue);
				return;
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE_PART:
				setSourceVariablePart((String)newValue);
				return;
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE_PART:
				setTargetVariablePart((String)newValue);
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
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE:
				setSourceVariable((Variable)null);
				return;
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
				return;
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE:
				setTargetVariable((Variable)null);
				return;
			case CDLPackage.COPY_OF_ASSIGN__CAUSE_EXCEPTION:
				setCauseException(CAUSE_EXCEPTION_EDEFAULT);
				return;
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE_PART:
				setSourceVariablePart(SOURCE_VARIABLE_PART_EDEFAULT);
				return;
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE_PART:
				setTargetVariablePart(TARGET_VARIABLE_PART_EDEFAULT);
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
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE:
				return sourceVariable != null;
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE:
				return targetVariable != null;
			case CDLPackage.COPY_OF_ASSIGN__CAUSE_EXCEPTION:
				return CAUSE_EXCEPTION_EDEFAULT == null ? causeException != null : !CAUSE_EXCEPTION_EDEFAULT.equals(causeException);
			case CDLPackage.COPY_OF_ASSIGN__SOURCE_VARIABLE_PART:
				return SOURCE_VARIABLE_PART_EDEFAULT == null ? sourceVariablePart != null : !SOURCE_VARIABLE_PART_EDEFAULT.equals(sourceVariablePart);
			case CDLPackage.COPY_OF_ASSIGN__TARGET_VARIABLE_PART:
				return TARGET_VARIABLE_PART_EDEFAULT == null ? targetVariablePart != null : !TARGET_VARIABLE_PART_EDEFAULT.equals(targetVariablePart);
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
		result.append(" (sourceExpression: ");
		result.append(sourceExpression);
		result.append(", causeException: ");
		result.append(causeException);
		result.append(", sourceVariablePart: ");
		result.append(sourceVariablePart);
		result.append(", targetVariablePart: ");
		result.append(targetVariablePart);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals(CDLElemNameConstants.COPY_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			List<Element> sourceElement = elem.elements("source");
			List<Element> targetElement = elem.elements("target");
			setSourceExpression(sourceElement.get(0).attributeValue("expression"));
			String sourceVariable = sourceElement.get(0).attributeValue("variable");
			
			XPathContext xpcontext=
				DefaultXPathContext.createContext(this,
						this.getBelongedChoreography());
			
			if(sourceVariable!=null){
				ValidationResult sourceRes = XPathValidator.validateVariable(
						xpcontext, sourceVariable, getRoleTypesMatrixFromTheContext(),
						false);
				
				if (sourceRes != null && sourceRes.getVariable() != null) {
					setSourceVariable(sourceRes.getVariable());
					if (sourceRes.getPartName() != null) {
						setSourceVariablePart(sourceRes.getPartName());
					}
				}
			}
			
			String targetVariable = targetElement.get(0).attributeValue("variable");
			ValidationResult targetRes=
				XPathValidator.validateVariable(xpcontext,targetVariable,
						getRoleTypesMatrixFromTheContext(), false);
			if (targetRes != null && targetRes.getVariable() != null) {
				setTargetVariable(targetRes.getVariable());
				if (targetRes.getPartName() != null) {
					setTargetVariablePart(targetRes.getPartName());
				}
			}
		}
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		return cdlElement;
	}
} //CopyOfAssignImpl
