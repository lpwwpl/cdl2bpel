/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLSwitch.java,v 1.1 2011/02/21 06:24:14 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.util;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.Identity;
import edu.xjtu.cdl2bpel.cdl.InfoOrChannel;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.InteractionLpw;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction;
import edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.ReceiveByExchange;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo;
import edu.xjtu.cdl2bpel.cdl.RoleTypeZlp;
import edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.SendByExchange;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.SilentAction;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WorkUnit;

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
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage
 * @generated
 */
public class CDLSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLSwitch() {
		if (modelPackage == null) {
			modelPackage = CDLPackage.eINSTANCE;
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
			case CDLPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseCDLElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseActivity(assign);
				if (result == null) result = caseCDLElement(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.BEHAVIOR_OF_ROLE_TYPE: {
				BehaviorOfRoleType behaviorOfRoleType = (BehaviorOfRoleType)theEObject;
				T result = caseBehaviorOfRoleType(behaviorOfRoleType);
				if (result == null) result = caseCDLElement(behaviorOfRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.BIND_INFO: {
				BindInfo bindInfo = (BindInfo)theEObject;
				T result = caseBindInfo(bindInfo);
				if (result == null) result = caseCDLElement(bindInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.CDL_ELEMENT: {
				CDLElement cdlElement = (CDLElement)theEObject;
				T result = caseCDLElement(cdlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				T result = caseChannelType(channelType);
				if (result == null) result = caseInfoOrChannel(channelType);
				if (result == null) result = caseCDLElement(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseOrderingStructuralActivity(choice);
				if (result == null) result = caseActivity(choice);
				if (result == null) result = caseCDLElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.CHOREOGRAPHY: {
				Choreography choreography = (Choreography)theEObject;
				T result = caseChoreography(choreography);
				if (result == null) result = caseCDLElement(choreography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.CASE_CONDITIONAL_OF_SWITCH: {
				CaseConditionalOfSwitch caseConditionalOfSwitch = (CaseConditionalOfSwitch)theEObject;
				T result = caseCaseConditionalOfSwitch(caseConditionalOfSwitch);
				if (result == null) result = caseWorkUnit(caseConditionalOfSwitch);
				if (result == null) result = caseOrderingStructuralActivity(caseConditionalOfSwitch);
				if (result == null) result = caseActivity(caseConditionalOfSwitch);
				if (result == null) result = caseCDLElement(caseConditionalOfSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.COPY_OF_ASSIGN: {
				CopyOfAssign copyOfAssign = (CopyOfAssign)theEObject;
				T result = caseCopyOfAssign(copyOfAssign);
				if (result == null) result = caseCDLElement(copyOfAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.INFO_OR_CHANNEL: {
				InfoOrChannel infoOrChannel = (InfoOrChannel)theEObject;
				T result = caseInfoOrChannel(infoOrChannel);
				if (result == null) result = caseCDLElement(infoOrChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.EXCEPTION_BLOCK: {
				ExceptionBlock exceptionBlock = (ExceptionBlock)theEObject;
				T result = caseExceptionBlock(exceptionBlock);
				if (result == null) result = caseCDLElement(exceptionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.EXCEPTION_WORK_UNIT: {
				ExceptionWorkUnit exceptionWorkUnit = (ExceptionWorkUnit)theEObject;
				T result = caseExceptionWorkUnit(exceptionWorkUnit);
				if (result == null) result = caseWorkUnit(exceptionWorkUnit);
				if (result == null) result = caseOrderingStructuralActivity(exceptionWorkUnit);
				if (result == null) result = caseActivity(exceptionWorkUnit);
				if (result == null) result = caseCDLElement(exceptionWorkUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.EXCHANGE_INFO: {
				ExchangeInfo exchangeInfo = (ExchangeInfo)theEObject;
				T result = caseExchangeInfo(exchangeInfo);
				if (result == null) result = caseCDLElement(exchangeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.FINALIZE: {
				Finalize finalize = (Finalize)theEObject;
				T result = caseFinalize(finalize);
				if (result == null) result = caseActivity(finalize);
				if (result == null) result = caseCDLElement(finalize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.FINALIZER_BLOCK: {
				FinalizerBlock finalizerBlock = (FinalizerBlock)theEObject;
				T result = caseFinalizerBlock(finalizerBlock);
				if (result == null) result = caseCDLElement(finalizerBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				T result = caseIdentity(identity);
				if (result == null) result = caseCDLElement(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.INFORMATION_TYPE: {
				InformationType informationType = (InformationType)theEObject;
				T result = caseInformationType(informationType);
				if (result == null) result = caseInfoOrChannel(informationType);
				if (result == null) result = caseCDLElement(informationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseActivity(interaction);
				if (result == null) result = caseCDLElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseCDLElement(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.NO_ACTION: {
				NoAction noAction = (NoAction)theEObject;
				T result = caseNoAction(noAction);
				if (result == null) result = caseActivity(noAction);
				if (result == null) result = caseCDLElement(noAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PACKAGE: {
				edu.xjtu.cdl2bpel.cdl.Package package_ = (edu.xjtu.cdl2bpel.cdl.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseCDLElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = caseOrderingStructuralActivity(parallel);
				if (result == null) result = caseActivity(parallel);
				if (result == null) result = caseCDLElement(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PARTICIPANT_TYPE: {
				ParticipantType participantType = (ParticipantType)theEObject;
				T result = caseParticipantType(participantType);
				if (result == null) result = caseCDLElement(participantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE: {
				PassingInfoOfTheChannelType passingInfoOfTheChannelType = (PassingInfoOfTheChannelType)theEObject;
				T result = casePassingInfoOfTheChannelType(passingInfoOfTheChannelType);
				if (result == null) result = caseCDLElement(passingInfoOfTheChannelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PERFORM: {
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseActivity(perform);
				if (result == null) result = caseCDLElement(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.RECORD_ELEMENT_INFO: {
				RecordElementInfo recordElementInfo = (RecordElementInfo)theEObject;
				T result = caseRecordElementInfo(recordElementInfo);
				if (result == null) result = caseCDLElement(recordElementInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = caseCDLElement(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = caseCDLElement(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseOrderingStructuralActivity(sequence);
				if (result == null) result = caseActivity(sequence);
				if (result == null) result = caseCDLElement(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.SILENT_ACTION: {
				SilentAction silentAction = (SilentAction)theEObject;
				T result = caseSilentAction(silentAction);
				if (result == null) result = caseActivity(silentAction);
				if (result == null) result = caseCDLElement(silentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = caseCDLElement(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.TOKEN_LOCATOR: {
				TokenLocator tokenLocator = (TokenLocator)theEObject;
				T result = caseTokenLocator(tokenLocator);
				if (result == null) result = caseCDLElement(tokenLocator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseCDLElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.WORK_UNIT: {
				WorkUnit workUnit = (WorkUnit)theEObject;
				T result = caseWorkUnit(workUnit);
				if (result == null) result = caseOrderingStructuralActivity(workUnit);
				if (result == null) result = caseActivity(workUnit);
				if (result == null) result = caseCDLElement(workUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT: {
				WhenWithBlockOfWorkUnit whenWithBlockOfWorkUnit = (WhenWithBlockOfWorkUnit)theEObject;
				T result = caseWhenWithBlockOfWorkUnit(whenWithBlockOfWorkUnit);
				if (result == null) result = caseWorkUnit(whenWithBlockOfWorkUnit);
				if (result == null) result = caseOrderingStructuralActivity(whenWithBlockOfWorkUnit);
				if (result == null) result = caseActivity(whenWithBlockOfWorkUnit);
				if (result == null) result = caseCDLElement(whenWithBlockOfWorkUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT: {
				WhileWithRepeateOfWorkUnit whileWithRepeateOfWorkUnit = (WhileWithRepeateOfWorkUnit)theEObject;
				T result = caseWhileWithRepeateOfWorkUnit(whileWithRepeateOfWorkUnit);
				if (result == null) result = caseWorkUnit(whileWithRepeateOfWorkUnit);
				if (result == null) result = caseOrderingStructuralActivity(whileWithRepeateOfWorkUnit);
				if (result == null) result = caseActivity(whileWithRepeateOfWorkUnit);
				if (result == null) result = caseCDLElement(whileWithRepeateOfWorkUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ROLE_TYPE_MATRIX: {
				RoleTypeMatrix roleTypeMatrix = (RoleTypeMatrix)theEObject;
				T result = caseRoleTypeMatrix(roleTypeMatrix);
				if (result == null) result = caseCDLElement(roleTypeMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO: {
				RoleTypeMatrixBindInfo roleTypeMatrixBindInfo = (RoleTypeMatrixBindInfo)theEObject;
				T result = caseRoleTypeMatrixBindInfo(roleTypeMatrixBindInfo);
				if (result == null) result = caseCDLElement(roleTypeMatrixBindInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ORDERING_STRUCTURAL_ACTIVITY: {
				OrderingStructuralActivity orderingStructuralActivity = (OrderingStructuralActivity)theEObject;
				T result = caseOrderingStructuralActivity(orderingStructuralActivity);
				if (result == null) result = caseActivity(orderingStructuralActivity);
				if (result == null) result = caseCDLElement(orderingStructuralActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION: {
				ParticipateInfoByInteraction participateInfoByInteraction = (ParticipateInfoByInteraction)theEObject;
				T result = caseParticipateInfoByInteraction(participateInfoByInteraction);
				if (result == null) result = caseCDLElement(participateInfoByInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.INTERACTION_LPW: {
				InteractionLpw interactionLpw = (InteractionLpw)theEObject;
				T result = caseInteractionLpw(interactionLpw);
				if (result == null) result = caseCDLElement(interactionLpw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.ROLE_TYPE_ZLP: {
				RoleTypeZlp roleTypeZlp = (RoleTypeZlp)theEObject;
				T result = caseRoleTypeZlp(roleTypeZlp);
				if (result == null) result = caseCDLElement(roleTypeZlp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.SEND_BY_EXCHANGE: {
				SendByExchange sendByExchange = (SendByExchange)theEObject;
				T result = caseSendByExchange(sendByExchange);
				if (result == null) result = caseCDLElement(sendByExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.RECEIVE_BY_EXCHANGE: {
				ReceiveByExchange receiveByExchange = (ReceiveByExchange)theEObject;
				T result = caseReceiveByExchange(receiveByExchange);
				if (result == null) result = caseCDLElement(receiveByExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDLPackage.SCOPE_WITH_NO_ATTR_OF_WORK_UNIT: {
				ScopeWithNoAttrOfWorkUnit scopeWithNoAttrOfWorkUnit = (ScopeWithNoAttrOfWorkUnit)theEObject;
				T result = caseScopeWithNoAttrOfWorkUnit(scopeWithNoAttrOfWorkUnit);
				if (result == null) result = caseWorkUnit(scopeWithNoAttrOfWorkUnit);
				if (result == null) result = caseOrderingStructuralActivity(scopeWithNoAttrOfWorkUnit);
				if (result == null) result = caseActivity(scopeWithNoAttrOfWorkUnit);
				if (result == null) result = caseCDLElement(scopeWithNoAttrOfWorkUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Of Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Of Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorOfRoleType(BehaviorOfRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bind Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bind Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindInfo(BindInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDLElement(CDLElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choreography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoreography(Choreography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Conditional Of Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Conditional Of Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseConditionalOfSwitch(CaseConditionalOfSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Of Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Of Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyOfAssign(CopyOfAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Or Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Or Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoOrChannel(InfoOrChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionBlock(ExceptionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionWorkUnit(ExceptionWorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchangeInfo(ExchangeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalize(Finalize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalizer Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalizer Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalizerBlock(FinalizerBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(edu.xjtu.cdl2bpel.cdl.Package object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantType(ParticipantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passing Info Of The Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passing Info Of The Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassingInfoOfTheChannelType(PassingInfoOfTheChannelType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Record Element Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Element Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordElementInfo(RecordElementInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipType(RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Silent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSilentAction(SilentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkUnit(WorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When With Block Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When With Block Of Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenWithBlockOfWorkUnit(WhenWithBlockOfWorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While With Repeate Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While With Repeate Of Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileWithRepeateOfWorkUnit(WhileWithRepeateOfWorkUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTypeMatrix(RoleTypeMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type Matrix Bind Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type Matrix Bind Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTypeMatrixBindInfo(RoleTypeMatrixBindInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordering Structural Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordering Structural Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderingStructuralActivity(OrderingStructuralActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participate Info By Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participate Info By Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipateInfoByInteraction(ParticipateInfoByInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Lpw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Lpw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionLpw(InteractionLpw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type Zlp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type Zlp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTypeZlp(RoleTypeZlp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send By Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send By Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendByExchange(SendByExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive By Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive By Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveByExchange(ReceiveByExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope With No Attr Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope With No Attr Of Work Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeWithNoAttrOfWorkUnit(ScopeWithNoAttrOfWorkUnit object) {
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

} //CDLSwitch
