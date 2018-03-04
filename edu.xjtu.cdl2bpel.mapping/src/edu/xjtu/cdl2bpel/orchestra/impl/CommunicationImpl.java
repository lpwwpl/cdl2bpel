/**
 * CDL2BPEL_XJTU
 *
 * $Id: CommunicationImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.ChannelType;
import edu.xjtu.cdl2bpel.orchestra.Communication;
import edu.xjtu.cdl2bpel.orchestra.Correlation;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl#getVariablePart <em>Variable Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl#getCorrelation <em>Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommunicationImpl extends BPActivityImpl implements Communication {
	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected ChannelType channelType;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getVariablePart() <em>Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePart()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariablePart() <em>Variable Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablePart()
	 * @generated
	 * @ordered
	 */
	protected String variablePart = VARIABLE_PART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The cached value of the '{@link #getCorrelation() <em>Correlation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelation()
	 * @generated
	 * @ordered
	 */
	protected Correlation correlation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType getChannelType() {
		if (channelType != null && channelType.eIsProxy()) {
			InternalEObject oldChannelType = (InternalEObject)channelType;
			channelType = (ChannelType)eResolveProxy(oldChannelType);
			if (channelType != oldChannelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COMMUNICATION__CHANNEL_TYPE, oldChannelType, channelType));
			}
		}
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType basicGetChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(ChannelType newChannelType) {
		ChannelType oldChannelType = channelType;
		channelType = newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMMUNICATION__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COMMUNICATION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMMUNICATION__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariablePart() {
		return variablePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariablePart(String newVariablePart) {
		String oldVariablePart = variablePart;
		variablePart = newVariablePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMMUNICATION__VARIABLE_PART, oldVariablePart, variablePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COMMUNICATION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMMUNICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation getCorrelation() {
		if (correlation != null && correlation.eIsProxy()) {
			InternalEObject oldCorrelation = (InternalEObject)correlation;
			correlation = (Correlation)eResolveProxy(oldCorrelation);
			if (correlation != oldCorrelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COMMUNICATION__CORRELATION, oldCorrelation, correlation));
			}
		}
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation basicGetCorrelation() {
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelation(Correlation newCorrelation) {
		Correlation oldCorrelation = correlation;
		correlation = newCorrelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COMMUNICATION__CORRELATION, oldCorrelation, correlation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.COMMUNICATION__CHANNEL_TYPE:
				if (resolve) return getChannelType();
				return basicGetChannelType();
			case OrchestraPackage.COMMUNICATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case OrchestraPackage.COMMUNICATION__VARIABLE_PART:
				return getVariablePart();
			case OrchestraPackage.COMMUNICATION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case OrchestraPackage.COMMUNICATION__CORRELATION:
				if (resolve) return getCorrelation();
				return basicGetCorrelation();
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
			case OrchestraPackage.COMMUNICATION__CHANNEL_TYPE:
				setChannelType((ChannelType)newValue);
				return;
			case OrchestraPackage.COMMUNICATION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case OrchestraPackage.COMMUNICATION__VARIABLE_PART:
				setVariablePart((String)newValue);
				return;
			case OrchestraPackage.COMMUNICATION__MESSAGE:
				setMessage((Message)newValue);
				return;
			case OrchestraPackage.COMMUNICATION__CORRELATION:
				setCorrelation((Correlation)newValue);
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
			case OrchestraPackage.COMMUNICATION__CHANNEL_TYPE:
				setChannelType((ChannelType)null);
				return;
			case OrchestraPackage.COMMUNICATION__VARIABLE:
				setVariable((Variable)null);
				return;
			case OrchestraPackage.COMMUNICATION__VARIABLE_PART:
				setVariablePart(VARIABLE_PART_EDEFAULT);
				return;
			case OrchestraPackage.COMMUNICATION__MESSAGE:
				setMessage((Message)null);
				return;
			case OrchestraPackage.COMMUNICATION__CORRELATION:
				setCorrelation((Correlation)null);
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
			case OrchestraPackage.COMMUNICATION__CHANNEL_TYPE:
				return channelType != null;
			case OrchestraPackage.COMMUNICATION__VARIABLE:
				return variable != null;
			case OrchestraPackage.COMMUNICATION__VARIABLE_PART:
				return VARIABLE_PART_EDEFAULT == null ? variablePart != null : !VARIABLE_PART_EDEFAULT.equals(variablePart);
			case OrchestraPackage.COMMUNICATION__MESSAGE:
				return message != null;
			case OrchestraPackage.COMMUNICATION__CORRELATION:
				return correlation != null;
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
		result.append(" (variablePart: ");
		result.append(variablePart);
		result.append(')');
		return result.toString();
	}

	public String getOperationName() {
		String ret=null;

		if (getMessage() != null &&
				getMessage().getOperation() != null) {
			ret = getMessage().getOperation().getName();
		}
		
		return(ret);
	}
	
	public String getFaultName() {
		String ret=null;
		
		if (getMessage() != null) {
			ret = getMessage().getFaultName();
		}
		
		return(ret);
	}
	

	
	public String getMessageType() {
		String ret=null;
		
		if (getMessage() != null &&
				getMessage().getInformationType() != null) {
			ret = getMessage().getInformationType().
								getFullyQualifiedType();
			
			if (CheckNOthersUtil.isSet(ret) == false) {
				ret = getMessage().getInformationType().
								getFullyQualifiedElement();
			}
		}

		return(ret);
	}
	
	/**
	 * This method returns the message direction.
	 * 
	 * @return The message direction
	 */
	public MessageTypeEnumByInteraction getClassification() {
		MessageTypeEnumByInteraction ret=MessageTypeEnumByInteraction.REQUEST;
		
		if (getMessage() != null) {
			ret = getMessage().getClassification();
		}
		
		return(ret);
	}
	
	public String getFullyQualifiedFaultName() {
		String ret=null;
		
		if (getMessage() != null) {
			ret = getMessage().getFullyQualifiedFaultName();
		}
		
		return(ret);
	}

} //CommunicationImpl
