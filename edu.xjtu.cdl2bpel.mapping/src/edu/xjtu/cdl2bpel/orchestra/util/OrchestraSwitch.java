/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrchestraSwitch.java,v 1.1 2011/02/21 06:24:15 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.orchestra.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage
 * @generated
 */
public class OrchestraSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestraSwitch() {
		if (modelPackage == null) {
			modelPackage = OrchestraPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OrchestraPackage.BP_ACTIVITY: {
				BPActivity bpActivity = (BPActivity)theEObject;
				T result = caseBPActivity(bpActivity);
				if (result == null) result = caseBPElement(bpActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.COPY: {
				Copy copy = (Copy)theEObject;
				T result = caseCopy(copy);
				if (result == null) result = caseBPElement(copy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.ATOMIC_UNIT: {
				AtomicUnit atomicUnit = (AtomicUnit)theEObject;
				T result = caseAtomicUnit(atomicUnit);
				if (result == null) result = caseBPOrderingStruturalActivity(atomicUnit);
				if (result == null) result = caseBPActivity(atomicUnit);
				if (result == null) result = caseBPElement(atomicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.BP_ORCHESTRA: {
				BPOrchestra bpOrchestra = (BPOrchestra)theEObject;
				T result = caseBPOrchestra(bpOrchestra);
				if (result == null) result = caseSequence(bpOrchestra);
				if (result == null) result = caseBPOrderingStruturalActivity(bpOrchestra);
				if (result == null) result = caseBPActivity(bpOrchestra);
				if (result == null) result = caseBPElement(bpOrchestra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.BP_ELEMENT: {
				BPElement bpElement = (BPElement)theEObject;
				T result = caseBPElement(bpElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				T result = caseChannelType(channelType);
				if (result == null) result = caseVariable(channelType);
				if (result == null) result = caseBPElement(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseBPOrderingStruturalActivity(choice);
				if (result == null) result = caseBPActivity(choice);
				if (result == null) result = caseBPElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.COMPENSATE_HANDLER: {
				CompensateHandler compensateHandler = (CompensateHandler)theEObject;
				T result = caseCompensateHandler(compensateHandler);
				if (result == null) result = caseBPOrderingStruturalActivity(compensateHandler);
				if (result == null) result = caseBPActivity(compensateHandler);
				if (result == null) result = caseBPElement(compensateHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = caseBPOrderingStruturalActivity(conditional);
				if (result == null) result = caseBPActivity(conditional);
				if (result == null) result = caseBPElement(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.FAULT_HANDLER: {
				FaultHandler faultHandler = (FaultHandler)theEObject;
				T result = caseFaultHandler(faultHandler);
				if (result == null) result = caseBPOrderingStruturalActivity(faultHandler);
				if (result == null) result = caseBPActivity(faultHandler);
				if (result == null) result = caseBPElement(faultHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.COMPENSATION: {
				Compensation compensation = (Compensation)theEObject;
				T result = caseCompensation(compensation);
				if (result == null) result = caseBPActivity(compensation);
				if (result == null) result = caseBPElement(compensation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.COMMUNICATION: {
				Communication communication = (Communication)theEObject;
				T result = caseCommunication(communication);
				if (result == null) result = caseBPActivity(communication);
				if (result == null) result = caseBPElement(communication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseBPElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseBPElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseBPOrderingStruturalActivity(parallel);
				if (result == null) result = caseBPActivity(parallel);
				if (result == null) result = caseBPElement(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = caseBPElement(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.PERFORM: {
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseBPActivity(perform);
				if (result == null) result = caseBPElement(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CASE_EXCEPTION: {
				CaseException caseException = (CaseException)theEObject;
				T result = caseCaseException(caseException);
				if (result == null) result = caseBPActivity(caseException);
				if (result == null) result = caseBPElement(caseException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.RECEIVE_END: {
				ReceiveEnd receiveEnd = (ReceiveEnd)theEObject;
				T result = caseReceiveEnd(receiveEnd);
				if (result == null) result = caseCommunication(receiveEnd);
				if (result == null) result = caseBPActivity(receiveEnd);
				if (result == null) result = caseBPElement(receiveEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.SYN_REPLY: {
				SynReply synReply = (SynReply)theEObject;
				T result = caseSynReply(synReply);
				if (result == null) result = caseCommunication(synReply);
				if (result == null) result = caseBPActivity(synReply);
				if (result == null) result = caseBPElement(synReply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseBPOrderingStruturalActivity(sequence);
				if (result == null) result = caseBPActivity(sequence);
				if (result == null) result = caseBPElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.GLOBAL_ARCHITECTURE: {
				GlobalArchitecture globalArchitecture = (GlobalArchitecture)theEObject;
				T result = caseGlobalArchitecture(globalArchitecture);
				if (result == null) result = caseBPElement(globalArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.INTERFACE_OF_GROUP: {
				InterfaceOfGroup interfaceOfGroup = (InterfaceOfGroup)theEObject;
				T result = caseInterfaceOfGroup(interfaceOfGroup);
				if (result == null) result = caseBPElement(interfaceOfGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.BP_ORDERING_STRUTURAL_ACTIVITY: {
				BPOrderingStruturalActivity bpOrderingStruturalActivity = (BPOrderingStruturalActivity)theEObject;
				T result = caseBPOrderingStruturalActivity(bpOrderingStruturalActivity);
				if (result == null) result = caseBPActivity(bpOrderingStruturalActivity);
				if (result == null) result = caseBPElement(bpOrderingStruturalActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.ON_ALARM: {
				OnAlarm onAlarm = (OnAlarm)theEObject;
				T result = caseOnAlarm(onAlarm);
				if (result == null) result = caseBPOrderingStruturalActivity(onAlarm);
				if (result == null) result = caseBPActivity(onAlarm);
				if (result == null) result = caseBPElement(onAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.UNOBSERVABLE_BY_SILEN_ACTION: {
				UnobservableBySilenAction unobservableBySilenAction = (UnobservableBySilenAction)theEObject;
				T result = caseUnobservableBySilenAction(unobservableBySilenAction);
				if (result == null) result = caseBPActivity(unobservableBySilenAction);
				if (result == null) result = caseBPElement(unobservableBySilenAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.VARIABLE_BINDING: {
				VariableBinding variableBinding = (VariableBinding)theEObject;
				T result = caseVariableBinding(variableBinding);
				if (result == null) result = caseBPElement(variableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseBPElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.WHEN: {
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseBPOrderingStruturalActivity(when);
				if (result == null) result = caseBPActivity(when);
				if (result == null) result = caseBPElement(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.WHILE: {
				While while_ = (While)theEObject;
				T result = caseWhile(while_);
				if (result == null) result = caseBPOrderingStruturalActivity(while_);
				if (result == null) result = caseBPActivity(while_);
				if (result == null) result = caseBPElement(while_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseBPElement(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				T result = caseIdentity(identity);
				if (result == null) result = caseBPElement(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.INFORMATION_TYPE: {
				InformationType informationType = (InformationType)theEObject;
				T result = caseInformationType(informationType);
				if (result == null) result = caseInfoTypeOfOrchestra(informationType);
				if (result == null) result = caseBPElement(informationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.TOKEN_LOCATOR: {
				TokenLocator tokenLocator = (TokenLocator)theEObject;
				T result = caseTokenLocator(tokenLocator);
				if (result == null) result = caseBPElement(tokenLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.INFO_TYPE_OF_ORCHESTRA: {
				InfoTypeOfOrchestra infoTypeOfOrchestra = (InfoTypeOfOrchestra)theEObject;
				T result = caseInfoTypeOfOrchestra(infoTypeOfOrchestra);
				if (result == null) result = caseBPElement(infoTypeOfOrchestra);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.TOKEN_OF_PROPERTY: {
				TokenOfProperty tokenOfProperty = (TokenOfProperty)theEObject;
				T result = caseTokenOfProperty(tokenOfProperty);
				if (result == null) result = caseBPElement(tokenOfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.INFORMATION_TYPE_ZLP: {
				InformationTypeZlp informationTypeZlp = (InformationTypeZlp)theEObject;
				T result = caseInformationTypeZlp(informationTypeZlp);
				if (result == null) result = caseBPElement(informationTypeZlp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.FAULT_BRANCHES: {
				FaultBranches faultBranches = (FaultBranches)theEObject;
				T result = caseFaultBranches(faultBranches);
				if (result == null) result = caseBPActivity(faultBranches);
				if (result == null) result = caseBPElement(faultBranches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.EVENT_HANDLER: {
				EventHandler eventHandler = (EventHandler)theEObject;
				T result = caseEventHandler(eventHandler);
				if (result == null) result = caseBPActivity(eventHandler);
				if (result == null) result = caseBPElement(eventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CORRELATION: {
				Correlation correlation = (Correlation)theEObject;
				T result = caseCorrelation(correlation);
				if (result == null) result = caseBPElement(correlation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.CORRELATION_SET: {
				CorrelationSet correlationSet = (CorrelationSet)theEObject;
				T result = caseCorrelationSet(correlationSet);
				if (result == null) result = caseBPElement(correlationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.ASYN_CALL_BACK: {
				AsynCallBack asynCallBack = (AsynCallBack)theEObject;
				T result = caseAsynCallBack(asynCallBack);
				if (result == null) result = caseCommunication(asynCallBack);
				if (result == null) result = caseBPActivity(asynCallBack);
				if (result == null) result = caseBPElement(asynCallBack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseBPActivity(assign);
				if (result == null) result = caseBPElement(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.SEND_END: {
				SendEnd sendEnd = (SendEnd)theEObject;
				T result = caseSendEnd(sendEnd);
				if (result == null) result = caseCommunication(sendEnd);
				if (result == null) result = caseBPActivity(sendEnd);
				if (result == null) result = caseBPElement(sendEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.NO_ACTION: {
				NoAction noAction = (NoAction)theEObject;
				T result = caseNoAction(noAction);
				if (result == null) result = caseBPActivity(noAction);
				if (result == null) result = caseBPElement(noAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.ON_MESSAGE_BY_EVENT_HANDLER: {
				OnMessageByEventHandler onMessageByEventHandler = (OnMessageByEventHandler)theEObject;
				T result = caseOnMessageByEventHandler(onMessageByEventHandler);
				if (result == null) result = caseBPActivity(onMessageByEventHandler);
				if (result == null) result = caseBPElement(onMessageByEventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.SCOPE_WITH_NO_ATTR: {
				ScopeWithNoAttr scopeWithNoAttr = (ScopeWithNoAttr)theEObject;
				T result = caseScopeWithNoAttr(scopeWithNoAttr);
				if (result == null) result = caseBPOrderingStruturalActivity(scopeWithNoAttr);
				if (result == null) result = caseBPActivity(scopeWithNoAttr);
				if (result == null) result = caseBPElement(scopeWithNoAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestraPackage.DELAY: {
				Delay delay = (Delay)theEObject;
				T result = caseDelay(delay);
				if (result == null) result = caseBPElement(delay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPActivity(BPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopy(Copy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicUnit(AtomicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Orchestra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Orchestra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPOrchestra(BPOrchestra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPElement(BPElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelType(ChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensate Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensate Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensateHandler(CompensateHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultHandler(FaultHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compensation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compensation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompensation(Compensation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunication(Communication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerform(Perform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseException(CaseException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveEnd(ReceiveEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syn Reply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syn Reply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynReply(SynReply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalArchitecture(GlobalArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Of Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Of Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOfGroup(InterfaceOfGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Ordering Strutural Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Ordering Strutural Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPOrderingStruturalActivity(BPOrderingStruturalActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnAlarm(OnAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unobservable By Silen Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unobservable By Silen Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnobservableBySilenAction(UnobservableBySilenAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableBinding(VariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentity(Identity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationType(InformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenLocator(TokenLocator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Type Of Orchestra</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Type Of Orchestra</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoTypeOfOrchestra(InfoTypeOfOrchestra object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Of Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Of Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenOfProperty(TokenOfProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Type Zlp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Type Zlp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationTypeZlp(InformationTypeZlp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Branches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Branches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultBranches(FaultBranches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelation(Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationSet(CorrelationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asyn Call Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asyn Call Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynCallBack(AsynCallBack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendEnd(SendEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoAction(NoAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Message By Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Message By Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnMessageByEventHandler(OnMessageByEventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope With No Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope With No Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeWithNoAttr(ScopeWithNoAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelay(Delay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OrchestraSwitch
