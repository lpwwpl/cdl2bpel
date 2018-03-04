/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLAdapterFactory.java,v 1.1 2011/02/21 06:24:14 administrator Exp $
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage
 * @generated
 */
public class CDLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CDLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDLSwitch<Adapter> modelSwitch =
		new CDLSwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter caseBehaviorOfRoleType(BehaviorOfRoleType object) {
				return createBehaviorOfRoleTypeAdapter();
			}
			@Override
			public Adapter caseBindInfo(BindInfo object) {
				return createBindInfoAdapter();
			}
			@Override
			public Adapter caseCDLElement(CDLElement object) {
				return createCDLElementAdapter();
			}
			@Override
			public Adapter caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseChoreography(Choreography object) {
				return createChoreographyAdapter();
			}
			@Override
			public Adapter caseCaseConditionalOfSwitch(CaseConditionalOfSwitch object) {
				return createCaseConditionalOfSwitchAdapter();
			}
			@Override
			public Adapter caseCopyOfAssign(CopyOfAssign object) {
				return createCopyOfAssignAdapter();
			}
			@Override
			public Adapter caseInfoOrChannel(InfoOrChannel object) {
				return createInfoOrChannelAdapter();
			}
			@Override
			public Adapter caseExceptionBlock(ExceptionBlock object) {
				return createExceptionBlockAdapter();
			}
			@Override
			public Adapter caseExceptionWorkUnit(ExceptionWorkUnit object) {
				return createExceptionWorkUnitAdapter();
			}
			@Override
			public Adapter caseExchangeInfo(ExchangeInfo object) {
				return createExchangeInfoAdapter();
			}
			@Override
			public Adapter caseFinalize(Finalize object) {
				return createFinalizeAdapter();
			}
			@Override
			public Adapter caseFinalizerBlock(FinalizerBlock object) {
				return createFinalizerBlockAdapter();
			}
			@Override
			public Adapter caseIdentity(Identity object) {
				return createIdentityAdapter();
			}
			@Override
			public Adapter caseInformationType(InformationType object) {
				return createInformationTypeAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseNoAction(NoAction object) {
				return createNoActionAdapter();
			}
			@Override
			public Adapter casePackage(edu.xjtu.cdl2bpel.cdl.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter caseParticipantType(ParticipantType object) {
				return createParticipantTypeAdapter();
			}
			@Override
			public Adapter casePassingInfoOfTheChannelType(PassingInfoOfTheChannelType object) {
				return createPassingInfoOfTheChannelTypeAdapter();
			}
			@Override
			public Adapter casePerform(Perform object) {
				return createPerformAdapter();
			}
			@Override
			public Adapter caseRecordElementInfo(RecordElementInfo object) {
				return createRecordElementInfoAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSilentAction(SilentAction object) {
				return createSilentActionAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTokenLocator(TokenLocator object) {
				return createTokenLocatorAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseWorkUnit(WorkUnit object) {
				return createWorkUnitAdapter();
			}
			@Override
			public Adapter caseWhenWithBlockOfWorkUnit(WhenWithBlockOfWorkUnit object) {
				return createWhenWithBlockOfWorkUnitAdapter();
			}
			@Override
			public Adapter caseWhileWithRepeateOfWorkUnit(WhileWithRepeateOfWorkUnit object) {
				return createWhileWithRepeateOfWorkUnitAdapter();
			}
			@Override
			public Adapter caseRoleTypeMatrix(RoleTypeMatrix object) {
				return createRoleTypeMatrixAdapter();
			}
			@Override
			public Adapter caseRoleTypeMatrixBindInfo(RoleTypeMatrixBindInfo object) {
				return createRoleTypeMatrixBindInfoAdapter();
			}
			@Override
			public Adapter caseOrderingStructuralActivity(OrderingStructuralActivity object) {
				return createOrderingStructuralActivityAdapter();
			}
			@Override
			public Adapter caseParticipateInfoByInteraction(ParticipateInfoByInteraction object) {
				return createParticipateInfoByInteractionAdapter();
			}
			@Override
			public Adapter caseInteractionLpw(InteractionLpw object) {
				return createInteractionLpwAdapter();
			}
			@Override
			public Adapter caseRoleTypeZlp(RoleTypeZlp object) {
				return createRoleTypeZlpAdapter();
			}
			@Override
			public Adapter caseSendByExchange(SendByExchange object) {
				return createSendByExchangeAdapter();
			}
			@Override
			public Adapter caseReceiveByExchange(ReceiveByExchange object) {
				return createReceiveByExchangeAdapter();
			}
			@Override
			public Adapter caseScopeWithNoAttrOfWorkUnit(ScopeWithNoAttrOfWorkUnit object) {
				return createScopeWithNoAttrOfWorkUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType <em>Behavior Of Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType
	 * @generated
	 */
	public Adapter createBehaviorOfRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.BindInfo <em>Bind Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo
	 * @generated
	 */
	public Adapter createBindInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.CDLElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLElement
	 * @generated
	 */
	public Adapter createCDLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography
	 * @generated
	 */
	public Adapter createChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch <em>Case Conditional Of Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch
	 * @generated
	 */
	public Adapter createCaseConditionalOfSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign <em>Copy Of Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign
	 * @generated
	 */
	public Adapter createCopyOfAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.InfoOrChannel <em>Info Or Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.InfoOrChannel
	 * @generated
	 */
	public Adapter createInfoOrChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ExceptionBlock <em>Exception Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionBlock
	 * @generated
	 */
	public Adapter createExceptionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit <em>Exception Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit
	 * @generated
	 */
	public Adapter createExceptionWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo <em>Exchange Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo
	 * @generated
	 */
	public Adapter createExchangeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Finalize <em>Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize
	 * @generated
	 */
	public Adapter createFinalizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.FinalizerBlock <em>Finalizer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.FinalizerBlock
	 * @generated
	 */
	public Adapter createFinalizerBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.NoAction <em>No Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.NoAction
	 * @generated
	 */
	public Adapter createNoActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipantType
	 * @generated
	 */
	public Adapter createParticipantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType <em>Passing Info Of The Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType
	 * @generated
	 */
	public Adapter createPassingInfoOfTheChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform
	 * @generated
	 */
	public Adapter createPerformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo <em>Record Element Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo
	 * @generated
	 */
	public Adapter createRecordElementInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.SilentAction <em>Silent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.SilentAction
	 * @generated
	 */
	public Adapter createSilentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator <em>Token Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator
	 * @generated
	 */
	public Adapter createTokenLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.WorkUnit
	 * @generated
	 */
	public Adapter createWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit <em>When With Block Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit
	 * @generated
	 */
	public Adapter createWhenWithBlockOfWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit <em>While With Repeate Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit
	 * @generated
	 */
	public Adapter createWhileWithRepeateOfWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix <em>Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix
	 * @generated
	 */
	public Adapter createRoleTypeMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo <em>Role Type Matrix Bind Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo
	 * @generated
	 */
	public Adapter createRoleTypeMatrixBindInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity <em>Ordering Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity
	 * @generated
	 */
	public Adapter createOrderingStructuralActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction <em>Participate Info By Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction
	 * @generated
	 */
	public Adapter createParticipateInfoByInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw <em>Interaction Lpw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw
	 * @generated
	 */
	public Adapter createInteractionLpwAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp <em>Role Type Zlp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeZlp
	 * @generated
	 */
	public Adapter createRoleTypeZlpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange <em>Send By Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.SendByExchange
	 * @generated
	 */
	public Adapter createSendByExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange <em>Receive By Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ReceiveByExchange
	 * @generated
	 */
	public Adapter createReceiveByExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit <em>Scope With No Attr Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit
	 * @generated
	 */
	public Adapter createScopeWithNoAttrOfWorkUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CDLAdapterFactory
