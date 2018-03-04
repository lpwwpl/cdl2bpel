/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrchestraFactoryImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestraFactoryImpl extends EFactoryImpl implements OrchestraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrchestraFactory init() {
		try {
			OrchestraFactory theOrchestraFactory = (OrchestraFactory)EPackage.Registry.INSTANCE.getEFactory("http:///lpw.cn/service/orchestra.ecore"); 
			if (theOrchestraFactory != null) {
				return theOrchestraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrchestraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrchestraPackage.COPY: return createCopy();
			case OrchestraPackage.ATOMIC_UNIT: return createAtomicUnit();
			case OrchestraPackage.BP_ORCHESTRA: return createBPOrchestra();
			case OrchestraPackage.CHANNEL_TYPE: return createChannelType();
			case OrchestraPackage.CHOICE: return createChoice();
			case OrchestraPackage.COMPENSATE_HANDLER: return createCompensateHandler();
			case OrchestraPackage.CONDITIONAL: return createConditional();
			case OrchestraPackage.FAULT_HANDLER: return createFaultHandler();
			case OrchestraPackage.COMPENSATION: return createCompensation();
			case OrchestraPackage.MESSAGE: return createMessage();
			case OrchestraPackage.OPERATION: return createOperation();
			case OrchestraPackage.PARALLEL: return createParallel();
			case OrchestraPackage.PART: return createPart();
			case OrchestraPackage.PERFORM: return createPerform();
			case OrchestraPackage.CASE_EXCEPTION: return createCaseException();
			case OrchestraPackage.RECEIVE_END: return createReceiveEnd();
			case OrchestraPackage.SYN_REPLY: return createSynReply();
			case OrchestraPackage.SEQUENCE: return createSequence();
			case OrchestraPackage.GLOBAL_ARCHITECTURE: return createGlobalArchitecture();
			case OrchestraPackage.INTERFACE_OF_GROUP: return createInterfaceOfGroup();
			case OrchestraPackage.ON_ALARM: return createOnAlarm();
			case OrchestraPackage.UNOBSERVABLE_BY_SILEN_ACTION: return createUnobservableBySilenAction();
			case OrchestraPackage.VARIABLE_BINDING: return createVariableBinding();
			case OrchestraPackage.VARIABLE: return createVariable();
			case OrchestraPackage.WHEN: return createWhen();
			case OrchestraPackage.WHILE: return createWhile();
			case OrchestraPackage.NAMESPACE: return createNamespace();
			case OrchestraPackage.IDENTITY: return createIdentity();
			case OrchestraPackage.INFORMATION_TYPE: return createInformationType();
			case OrchestraPackage.TOKEN_LOCATOR: return createTokenLocator();
			case OrchestraPackage.INFO_TYPE_OF_ORCHESTRA: return createInfoTypeOfOrchestra();
			case OrchestraPackage.TOKEN_OF_PROPERTY: return createTokenOfProperty();
			case OrchestraPackage.INFORMATION_TYPE_ZLP: return createInformationTypeZlp();
			case OrchestraPackage.FAULT_BRANCHES: return createFaultBranches();
			case OrchestraPackage.EVENT_HANDLER: return createEventHandler();
			case OrchestraPackage.CORRELATION: return createCorrelation();
			case OrchestraPackage.CORRELATION_SET: return createCorrelationSet();
			case OrchestraPackage.ASYN_CALL_BACK: return createAsynCallBack();
			case OrchestraPackage.ASSIGN: return createAssign();
			case OrchestraPackage.SEND_END: return createSendEnd();
			case OrchestraPackage.NO_ACTION: return createNoAction();
			case OrchestraPackage.ON_MESSAGE_BY_EVENT_HANDLER: return createOnMessageByEventHandler();
			case OrchestraPackage.SCOPE_WITH_NO_ATTR: return createScopeWithNoAttr();
			case OrchestraPackage.DELAY: return createDelay();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OrchestraPackage.USAGE_ENUM_BY_CHANNEL:
				return createUsageEnumByChannelFromString(eDataType, initialValue);
			case OrchestraPackage.MESSAGE_TYPE_ENUM_BY_INTERACTION:
				return createMessageTypeEnumByInteractionFromString(eDataType, initialValue);
			case OrchestraPackage.IDENTITY_TYPE_ENUM:
				return createIdentityTypeEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OrchestraPackage.USAGE_ENUM_BY_CHANNEL:
				return convertUsageEnumByChannelToString(eDataType, instanceValue);
			case OrchestraPackage.MESSAGE_TYPE_ENUM_BY_INTERACTION:
				return convertMessageTypeEnumByInteractionToString(eDataType, instanceValue);
			case OrchestraPackage.IDENTITY_TYPE_ENUM:
				return convertIdentityTypeEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copy createCopy() {
		CopyImpl copy = new CopyImpl();
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicUnit createAtomicUnit() {
		AtomicUnitImpl atomicUnit = new AtomicUnitImpl();
		return atomicUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPOrchestra createBPOrchestra() {
		BPOrchestraImpl bpOrchestra = new BPOrchestraImpl();
		return bpOrchestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateHandler createCompensateHandler() {
		CompensateHandlerImpl compensateHandler = new CompensateHandlerImpl();
		return compensateHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultHandler createFaultHandler() {
		FaultHandlerImpl faultHandler = new FaultHandlerImpl();
		return faultHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compensation createCompensation() {
		CompensationImpl compensation = new CompensationImpl();
		return compensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perform createPerform() {
		PerformImpl perform = new PerformImpl();
		return perform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseException createCaseException() {
		CaseExceptionImpl caseException = new CaseExceptionImpl();
		return caseException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveEnd createReceiveEnd() {
		ReceiveEndImpl receiveEnd = new ReceiveEndImpl();
		return receiveEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynReply createSynReply() {
		SynReplyImpl synReply = new SynReplyImpl();
		return synReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalArchitecture createGlobalArchitecture() {
		GlobalArchitectureImpl globalArchitecture = new GlobalArchitectureImpl();
		return globalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfGroup createInterfaceOfGroup() {
		InterfaceOfGroupImpl interfaceOfGroup = new InterfaceOfGroupImpl();
		return interfaceOfGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnAlarm createOnAlarm() {
		OnAlarmImpl onAlarm = new OnAlarmImpl();
		return onAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnobservableBySilenAction createUnobservableBySilenAction() {
		UnobservableBySilenActionImpl unobservableBySilenAction = new UnobservableBySilenActionImpl();
		return unobservableBySilenAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableBinding createVariableBinding() {
		VariableBindingImpl variableBinding = new VariableBindingImpl();
		return variableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationType createInformationType() {
		InformationTypeImpl informationType = new InformationTypeImpl();
		return informationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenLocator createTokenLocator() {
		TokenLocatorImpl tokenLocator = new TokenLocatorImpl();
		return tokenLocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoTypeOfOrchestra createInfoTypeOfOrchestra() {
		InfoTypeOfOrchestraImpl infoTypeOfOrchestra = new InfoTypeOfOrchestraImpl();
		return infoTypeOfOrchestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenOfProperty createTokenOfProperty() {
		TokenOfPropertyImpl tokenOfProperty = new TokenOfPropertyImpl();
		return tokenOfProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationTypeZlp createInformationTypeZlp() {
		InformationTypeZlpImpl informationTypeZlp = new InformationTypeZlpImpl();
		return informationTypeZlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultBranches createFaultBranches() {
		FaultBranchesImpl faultBranches = new FaultBranchesImpl();
		return faultBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSet createCorrelationSet() {
		CorrelationSetImpl correlationSet = new CorrelationSetImpl();
		return correlationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynCallBack createAsynCallBack() {
		AsynCallBackImpl asynCallBack = new AsynCallBackImpl();
		return asynCallBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendEnd createSendEnd() {
		SendEndImpl sendEnd = new SendEndImpl();
		return sendEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoAction createNoAction() {
		NoActionImpl noAction = new NoActionImpl();
		return noAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMessageByEventHandler createOnMessageByEventHandler() {
		OnMessageByEventHandlerImpl onMessageByEventHandler = new OnMessageByEventHandlerImpl();
		return onMessageByEventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeWithNoAttr createScopeWithNoAttr() {
		ScopeWithNoAttrImpl scopeWithNoAttr = new ScopeWithNoAttrImpl();
		return scopeWithNoAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delay createDelay() {
		DelayImpl delay = new DelayImpl();
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageEnumByChannel createUsageEnumByChannelFromString(EDataType eDataType, String initialValue) {
		UsageEnumByChannel result = UsageEnumByChannel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageEnumByChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageTypeEnumByInteraction createMessageTypeEnumByInteractionFromString(EDataType eDataType, String initialValue) {
		MessageTypeEnumByInteraction result = MessageTypeEnumByInteraction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeEnumByInteractionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityTypeEnum createIdentityTypeEnumFromString(EDataType eDataType, String initialValue) {
		IdentityTypeEnum result = IdentityTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestraPackage getOrchestraPackage() {
		return (OrchestraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrchestraPackage getPackage() {
		return OrchestraPackage.eINSTANCE;
	}

} //OrchestraFactoryImpl
