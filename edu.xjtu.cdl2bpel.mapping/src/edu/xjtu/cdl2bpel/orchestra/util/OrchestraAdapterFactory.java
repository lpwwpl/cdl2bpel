/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrchestraAdapterFactory.java,v 1.1 2011/02/21 06:24:15 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.orchestra.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage
 * @generated
 */
public class OrchestraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OrchestraPackage.eINSTANCE;
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
	protected OrchestraSwitch<Adapter> modelSwitch =
		new OrchestraSwitch<Adapter>() {
			@Override
			public Adapter caseBPActivity(BPActivity object) {
				return createBPActivityAdapter();
			}
			@Override
			public Adapter caseCopy(Copy object) {
				return createCopyAdapter();
			}
			@Override
			public Adapter caseAtomicUnit(AtomicUnit object) {
				return createAtomicUnitAdapter();
			}
			@Override
			public Adapter caseBPOrchestra(BPOrchestra object) {
				return createBPOrchestraAdapter();
			}
			@Override
			public Adapter caseBPElement(BPElement object) {
				return createBPElementAdapter();
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
			public Adapter caseCompensateHandler(CompensateHandler object) {
				return createCompensateHandlerAdapter();
			}
			@Override
			public Adapter caseConditional(Conditional object) {
				return createConditionalAdapter();
			}
			@Override
			public Adapter caseFaultHandler(FaultHandler object) {
				return createFaultHandlerAdapter();
			}
			@Override
			public Adapter caseCompensation(Compensation object) {
				return createCompensationAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParallel(Parallel object) {
				return createParallelAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter casePerform(Perform object) {
				return createPerformAdapter();
			}
			@Override
			public Adapter caseCaseException(CaseException object) {
				return createCaseExceptionAdapter();
			}
			@Override
			public Adapter caseReceiveEnd(ReceiveEnd object) {
				return createReceiveEndAdapter();
			}
			@Override
			public Adapter caseSynReply(SynReply object) {
				return createSynReplyAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseGlobalArchitecture(GlobalArchitecture object) {
				return createGlobalArchitectureAdapter();
			}
			@Override
			public Adapter caseInterfaceOfGroup(InterfaceOfGroup object) {
				return createInterfaceOfGroupAdapter();
			}
			@Override
			public Adapter caseBPOrderingStruturalActivity(BPOrderingStruturalActivity object) {
				return createBPOrderingStruturalActivityAdapter();
			}
			@Override
			public Adapter caseOnAlarm(OnAlarm object) {
				return createOnAlarmAdapter();
			}
			@Override
			public Adapter caseUnobservableBySilenAction(UnobservableBySilenAction object) {
				return createUnobservableBySilenActionAdapter();
			}
			@Override
			public Adapter caseVariableBinding(VariableBinding object) {
				return createVariableBindingAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseWhen(When object) {
				return createWhenAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
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
			public Adapter caseTokenLocator(TokenLocator object) {
				return createTokenLocatorAdapter();
			}
			@Override
			public Adapter caseInfoTypeOfOrchestra(InfoTypeOfOrchestra object) {
				return createInfoTypeOfOrchestraAdapter();
			}
			@Override
			public Adapter caseTokenOfProperty(TokenOfProperty object) {
				return createTokenOfPropertyAdapter();
			}
			@Override
			public Adapter caseInformationTypeZlp(InformationTypeZlp object) {
				return createInformationTypeZlpAdapter();
			}
			@Override
			public Adapter caseFaultBranches(FaultBranches object) {
				return createFaultBranchesAdapter();
			}
			@Override
			public Adapter caseEventHandler(EventHandler object) {
				return createEventHandlerAdapter();
			}
			@Override
			public Adapter caseCorrelation(Correlation object) {
				return createCorrelationAdapter();
			}
			@Override
			public Adapter caseCorrelationSet(CorrelationSet object) {
				return createCorrelationSetAdapter();
			}
			@Override
			public Adapter caseAsynCallBack(AsynCallBack object) {
				return createAsynCallBackAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter caseSendEnd(SendEnd object) {
				return createSendEndAdapter();
			}
			@Override
			public Adapter caseNoAction(NoAction object) {
				return createNoActionAdapter();
			}
			@Override
			public Adapter caseOnMessageByEventHandler(OnMessageByEventHandler object) {
				return createOnMessageByEventHandlerAdapter();
			}
			@Override
			public Adapter caseScopeWithNoAttr(ScopeWithNoAttr object) {
				return createScopeWithNoAttrAdapter();
			}
			@Override
			public Adapter caseDelay(Delay object) {
				return createDelayAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity <em>BP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPActivity
	 * @generated
	 */
	public Adapter createBPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy
	 * @generated
	 */
	public Adapter createCopyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.AtomicUnit <em>Atomic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.AtomicUnit
	 * @generated
	 */
	public Adapter createAtomicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra <em>BP Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra
	 * @generated
	 */
	public Adapter createBPOrchestraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.BPElement <em>BP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPElement
	 * @generated
	 */
	public Adapter createBPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.CompensateHandler <em>Compensate Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.CompensateHandler
	 * @generated
	 */
	public Adapter createCompensateHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.FaultHandler <em>Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultHandler
	 * @generated
	 */
	public Adapter createFaultHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Compensation <em>Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Compensation
	 * @generated
	 */
	public Adapter createCompensationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform
	 * @generated
	 */
	public Adapter createPerformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.CaseException <em>Case Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.CaseException
	 * @generated
	 */
	public Adapter createCaseExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.ReceiveEnd <em>Receive End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.ReceiveEnd
	 * @generated
	 */
	public Adapter createReceiveEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.SynReply <em>Syn Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.SynReply
	 * @generated
	 */
	public Adapter createSynReplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture <em>Global Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture
	 * @generated
	 */
	public Adapter createGlobalArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup <em>Interface Of Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup
	 * @generated
	 */
	public Adapter createInterfaceOfGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity <em>BP Ordering Strutural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity
	 * @generated
	 */
	public Adapter createBPOrderingStruturalActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnAlarm
	 * @generated
	 */
	public Adapter createOnAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction <em>Unobservable By Silen Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction
	 * @generated
	 */
	public Adapter createUnobservableBySilenActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.VariableBinding
	 * @generated
	 */
	public Adapter createVariableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationType
	 * @generated
	 */
	public Adapter createInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator <em>Token Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator
	 * @generated
	 */
	public Adapter createTokenLocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.InfoTypeOfOrchestra <em>Info Type Of Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.InfoTypeOfOrchestra
	 * @generated
	 */
	public Adapter createInfoTypeOfOrchestraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.TokenOfProperty <em>Token Of Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenOfProperty
	 * @generated
	 */
	public Adapter createTokenOfPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp <em>Information Type Zlp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp
	 * @generated
	 */
	public Adapter createInformationTypeZlpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches <em>Fault Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultBranches
	 * @generated
	 */
	public Adapter createFaultBranchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.EventHandler
	 * @generated
	 */
	public Adapter createEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Correlation
	 * @generated
	 */
	public Adapter createCorrelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.CorrelationSet
	 * @generated
	 */
	public Adapter createCorrelationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.AsynCallBack <em>Asyn Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.AsynCallBack
	 * @generated
	 */
	public Adapter createAsynCallBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.SendEnd <em>Send End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.SendEnd
	 * @generated
	 */
	public Adapter createSendEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.NoAction <em>No Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.NoAction
	 * @generated
	 */
	public Adapter createNoActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler <em>On Message By Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler
	 * @generated
	 */
	public Adapter createOnMessageByEventHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr <em>Scope With No Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr
	 * @generated
	 */
	public Adapter createScopeWithNoAttrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.xjtu.cdl2bpel.orchestra.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.xjtu.cdl2bpel.orchestra.Delay
	 * @generated
	 */
	public Adapter createDelayAdapter() {
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

} //OrchestraAdapterFactory
