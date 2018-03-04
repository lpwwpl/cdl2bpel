/**
 * CDL2BPEL_XJTU
 *
 * $Id: RecordElementInfoImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Element Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getWhen <em>When</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getCauseException <em>Cause Exception</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getSourceVariablePart <em>Source Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl#getTargetVariablePart <em>Target Variable Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordElementInfoImpl extends CDLElementImpl implements RecordElementInfo {
	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final WhenTypeEnumByRecordInfo WHEN_EDEFAULT = WhenTypeEnumByRecordInfo.BEFORE;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected WhenTypeEnumByRecordInfo when = WHEN_EDEFAULT;

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
	protected RecordElementInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.RECORD_ELEMENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenTypeEnumByRecordInfo getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(WhenTypeEnumByRecordInfo newWhen) {
		WhenTypeEnumByRecordInfo oldWhen = when;
		when = newWhen == null ? WHEN_EDEFAULT : newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__WHEN, oldWhen, when));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE, oldTargetVariable, targetVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE, oldTargetVariable, targetVariable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__CAUSE_EXCEPTION, oldCauseException, causeException));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART, oldSourceVariablePart, sourceVariablePart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART, oldTargetVariablePart, targetVariablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.RECORD_ELEMENT_INFO__WHEN:
				return getWhen();
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE:
				if (resolve) return getSourceVariable();
				return basicGetSourceVariable();
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE:
				if (resolve) return getTargetVariable();
				return basicGetTargetVariable();
			case CDLPackage.RECORD_ELEMENT_INFO__CAUSE_EXCEPTION:
				return getCauseException();
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_EXPRESSION:
				return getSourceExpression();
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART:
				return getSourceVariablePart();
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART:
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
			case CDLPackage.RECORD_ELEMENT_INFO__WHEN:
				setWhen((WhenTypeEnumByRecordInfo)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE:
				setSourceVariable((Variable)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE:
				setTargetVariable((Variable)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__CAUSE_EXCEPTION:
				setCauseException((String)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART:
				setSourceVariablePart((String)newValue);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART:
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
			case CDLPackage.RECORD_ELEMENT_INFO__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE:
				setSourceVariable((Variable)null);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE:
				setTargetVariable((Variable)null);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__CAUSE_EXCEPTION:
				setCauseException(CAUSE_EXCEPTION_EDEFAULT);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART:
				setSourceVariablePart(SOURCE_VARIABLE_PART_EDEFAULT);
				return;
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART:
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
			case CDLPackage.RECORD_ELEMENT_INFO__WHEN:
				return when != WHEN_EDEFAULT;
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE:
				return sourceVariable != null;
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE:
				return targetVariable != null;
			case CDLPackage.RECORD_ELEMENT_INFO__CAUSE_EXCEPTION:
				return CAUSE_EXCEPTION_EDEFAULT == null ? causeException != null : !CAUSE_EXCEPTION_EDEFAULT.equals(causeException);
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
			case CDLPackage.RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART:
				return SOURCE_VARIABLE_PART_EDEFAULT == null ? sourceVariablePart != null : !SOURCE_VARIABLE_PART_EDEFAULT.equals(sourceVariablePart);
			case CDLPackage.RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART:
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
		result.append(" (when: ");
		result.append(when);
		result.append(", causeException: ");
		result.append(causeException);
		result.append(", sourceExpression: ");
		result.append(sourceExpression);
		result.append(", sourceVariablePart: ");
		result.append(sourceVariablePart);
		result.append(", targetVariablePart: ");
		result.append(targetVariablePart);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @return
	 */
	public Interaction getBelongedInteraction() {

		Interaction ret = null;

		if (eContainer() instanceof Interaction) {
			ret = (Interaction) eContainer();
		}

		return (ret);
	}
	
	public void resolveTheCDLElementByElement(Element elem) {
		if(elem.getName().equals("record")) {
			setName(elem.attributeValue("name"));
			String whenTypeEnumByRecordInfoStringValue = elem.attributeValue("when");
			WhenTypeEnumByRecordInfo whenTypeEnumByRecordInfo = null;
			if(whenTypeEnumByRecordInfoStringValue.equalsIgnoreCase("after")) {
				whenTypeEnumByRecordInfo = WhenTypeEnumByRecordInfo.AFTER;
			} else if(whenTypeEnumByRecordInfoStringValue.equalsIgnoreCase("before")) {
				whenTypeEnumByRecordInfo = WhenTypeEnumByRecordInfo.BEFORE;
			}
			setWhen(whenTypeEnumByRecordInfo);
			setCauseException(elem.attributeValue("causeException"));
			
			List<Element> sourceElement = elem.elements("source");
			List<Element> targetElement = elem.elements("target");
			setSourceExpression(sourceElement.get(0).attributeValue("expression"));
			String sourceVariable = sourceElement.get(0).attributeValue("variable");
			
			XPathContext xpcontext=
				DefaultXPathContext.createContext(this,
						this.getBelongedChoreography());
			
			if(sourceVariable!=null){
				ValidationResult sourceRes = XPathValidator.validateVariable(
						xpcontext, sourceVariable, this.getRoleTypesMatrixFromTheContext(),
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
	
	protected boolean isRecordReferenced() {
		boolean ret = false;

		if (getParent() instanceof InteractionImpl) {
			InteractionImpl interaction = (InteractionImpl) getParent();

			if (interaction.getTimeoutFromRoleTypeRecordInfo().contains(this)) {
				ret = true;
			} else if (interaction.getTimeoutToRoleTypeRecordInfo().contains(
					this)) {
				ret = true;
			} else {

				java.util.Iterator iter = interaction.getExchangeInfos()
						.iterator();
				while (ret == false && iter.hasNext()) {
					ExchangeInfoImpl ed = (ExchangeInfoImpl) iter.next();

					if (ed.getSendRecordReference().contains(this)) {
						ret = true;
					} else if (ed.getReceiveRecordReference().contains(this)) {
						ret = true;
					}
				}
			}
		}

		return (ret);
	}

	public RoleType[] getRoleTypesMatrixFromTheContext() {
		RoleType[] roleTypes = null;
		java.util.Vector roles = new java.util.Vector();

		if (getParent() instanceof InteractionImpl) {
			InteractionImpl interaction = (InteractionImpl) getParent();

			if (interaction.getTimeoutFromRoleTypeRecordInfo().contains(this)) {
				roles.add(interaction.getTheFromRoleOfInteraction());
			}

			if (interaction.getTimeoutToRoleTypeRecordInfo().contains(this)) {
				roles.add(interaction.getTheToRoleOfInteraction());
			}

			java.util.Iterator iter = interaction.getExchangeInfos().iterator();
			while (iter.hasNext()) {
				ExchangeInfoImpl ed = (ExchangeInfoImpl) iter.next();
				RoleType src = interaction.getTheFromRoleOfInteraction();
				RoleType dest = interaction.getTheToRoleOfInteraction();

				if (ed.getAction() != null
						&& ed.getAction() == ActionTypeEnumByExchangeInfo.RESPOND) {

					src = interaction.getTheToRoleOfInteraction();
					dest = interaction.getTheFromRoleOfInteraction();
				}

				if (ed.getSendRecordReference().contains(this)
						&& roles.contains(src) == false) {
					roles.add(src);
				}

				if (ed.getReceiveRecordReference().contains(this)
						&& roles.contains(dest) == false) {
					roles.add(dest);
				}
			}
		}

		roleTypes = new RoleType[roles.size()];
		roles.copyInto(roleTypes);

		return (roleTypes);
	}
} //RecordElementInfoImpl
