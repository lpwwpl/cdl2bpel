/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLFactoryImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity;
import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ChoreographyState;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.Identity;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.InteractionLpw;
import edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.NoAction;
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
import edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;

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
public class CDLFactoryImpl extends EFactoryImpl implements CDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDLFactory init() {
		try {
			CDLFactory theCDLFactory = (CDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://edu/xjtu/cdl2bpel/cdl.ecore"); 
			if (theCDLFactory != null) {
				return theCDLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLFactoryImpl() {
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
			case CDLPackage.ASSIGN: return createAssign();
			case CDLPackage.BEHAVIOR_OF_ROLE_TYPE: return createBehaviorOfRoleType();
			case CDLPackage.BIND_INFO: return createBindInfo();
			case CDLPackage.CHANNEL_TYPE: return createChannelType();
			case CDLPackage.CHOICE: return createChoice();
			case CDLPackage.CHOREOGRAPHY: return createChoreography();
			case CDLPackage.CASE_CONDITIONAL_OF_SWITCH: return createCaseConditionalOfSwitch();
			case CDLPackage.COPY_OF_ASSIGN: return createCopyOfAssign();
			case CDLPackage.EXCEPTION_BLOCK: return createExceptionBlock();
			case CDLPackage.EXCEPTION_WORK_UNIT: return createExceptionWorkUnit();
			case CDLPackage.EXCHANGE_INFO: return createExchangeInfo();
			case CDLPackage.FINALIZE: return createFinalize();
			case CDLPackage.FINALIZER_BLOCK: return createFinalizerBlock();
			case CDLPackage.IDENTITY: return createIdentity();
			case CDLPackage.INFORMATION_TYPE: return createInformationType();
			case CDLPackage.INTERACTION: return createInteraction();
			case CDLPackage.NAMESPACE: return createNamespace();
			case CDLPackage.NO_ACTION: return createNoAction();
			case CDLPackage.PACKAGE: return createPackage();
			case CDLPackage.PARALLEL: return createParallel();
			case CDLPackage.PARTICIPANT_TYPE: return createParticipantType();
			case CDLPackage.PASSING_INFO_OF_THE_CHANNEL_TYPE: return createPassingInfoOfTheChannelType();
			case CDLPackage.PERFORM: return createPerform();
			case CDLPackage.RECORD_ELEMENT_INFO: return createRecordElementInfo();
			case CDLPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case CDLPackage.ROLE_TYPE: return createRoleType();
			case CDLPackage.SEQUENCE: return createSequence();
			case CDLPackage.SILENT_ACTION: return createSilentAction();
			case CDLPackage.TOKEN: return createToken();
			case CDLPackage.TOKEN_LOCATOR: return createTokenLocator();
			case CDLPackage.VARIABLE: return createVariable();
			case CDLPackage.WHEN_WITH_BLOCK_OF_WORK_UNIT: return createWhenWithBlockOfWorkUnit();
			case CDLPackage.WHILE_WITH_REPEATE_OF_WORK_UNIT: return createWhileWithRepeateOfWorkUnit();
			case CDLPackage.ROLE_TYPE_MATRIX: return createRoleTypeMatrix();
			case CDLPackage.ROLE_TYPE_MATRIX_BIND_INFO: return createRoleTypeMatrixBindInfo();
			case CDLPackage.PARTICIPATE_INFO_BY_INTERACTION: return createParticipateInfoByInteraction();
			case CDLPackage.INTERACTION_LPW: return createInteractionLpw();
			case CDLPackage.ROLE_TYPE_ZLP: return createRoleTypeZlp();
			case CDLPackage.SEND_BY_EXCHANGE: return createSendByExchange();
			case CDLPackage.RECEIVE_BY_EXCHANGE: return createReceiveByExchange();
			case CDLPackage.SCOPE_WITH_NO_ATTR_OF_WORK_UNIT: return createScopeWithNoAttrOfWorkUnit();
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
			case CDLPackage.ACTION_TYPE_ENUM_BY_CHANNEL_TYPE:
				return createActionTypeEnumByChannelTypeFromString(eDataType, initialValue);
			case CDLPackage.ACTION_TYPE_ENUM_BY_EXCHANGE_INFO:
				return createActionTypeEnumByExchangeInfoFromString(eDataType, initialValue);
			case CDLPackage.USAGE_TYPE_ENUM_BY_CHANNEL_TYPE:
				return createUsageTypeEnumByChannelTypeFromString(eDataType, initialValue);
			case CDLPackage.WHEN_TYPE_ENUM_BY_RECORD_INFO:
				return createWhenTypeEnumByRecordInfoFromString(eDataType, initialValue);
			case CDLPackage.KEY_TYPE_ENUM_BY_IDENTIFY:
				return createKeyTypeEnumByIdentifyFromString(eDataType, initialValue);
			case CDLPackage.CHOREOGRAPHY_STATE:
				return createChoreographyStateFromString(eDataType, initialValue);
			case CDLPackage.ACTIVITY_STATE_ENUM_BY_ACTIVITY:
				return createActivityStateEnumByActivityFromString(eDataType, initialValue);
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
			case CDLPackage.ACTION_TYPE_ENUM_BY_CHANNEL_TYPE:
				return convertActionTypeEnumByChannelTypeToString(eDataType, instanceValue);
			case CDLPackage.ACTION_TYPE_ENUM_BY_EXCHANGE_INFO:
				return convertActionTypeEnumByExchangeInfoToString(eDataType, instanceValue);
			case CDLPackage.USAGE_TYPE_ENUM_BY_CHANNEL_TYPE:
				return convertUsageTypeEnumByChannelTypeToString(eDataType, instanceValue);
			case CDLPackage.WHEN_TYPE_ENUM_BY_RECORD_INFO:
				return convertWhenTypeEnumByRecordInfoToString(eDataType, instanceValue);
			case CDLPackage.KEY_TYPE_ENUM_BY_IDENTIFY:
				return convertKeyTypeEnumByIdentifyToString(eDataType, instanceValue);
			case CDLPackage.CHOREOGRAPHY_STATE:
				return convertChoreographyStateToString(eDataType, instanceValue);
			case CDLPackage.ACTIVITY_STATE_ENUM_BY_ACTIVITY:
				return convertActivityStateEnumByActivityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public BehaviorOfRoleType createBehaviorOfRoleType() {
		BehaviorOfRoleTypeImpl behaviorOfRoleType = new BehaviorOfRoleTypeImpl();
		return behaviorOfRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindInfo createBindInfo() {
		BindInfoImpl bindInfo = new BindInfoImpl();
		return bindInfo;
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
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseConditionalOfSwitch createCaseConditionalOfSwitch() {
		CaseConditionalOfSwitchImpl caseConditionalOfSwitch = new CaseConditionalOfSwitchImpl();
		return caseConditionalOfSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyOfAssign createCopyOfAssign() {
		CopyOfAssignImpl copyOfAssign = new CopyOfAssignImpl();
		return copyOfAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionBlock createExceptionBlock() {
		ExceptionBlockImpl exceptionBlock = new ExceptionBlockImpl();
		return exceptionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionWorkUnit createExceptionWorkUnit() {
		ExceptionWorkUnitImpl exceptionWorkUnit = new ExceptionWorkUnitImpl();
		return exceptionWorkUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeInfo createExchangeInfo() {
		ExchangeInfoImpl exchangeInfo = new ExchangeInfoImpl();
		return exchangeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Finalize createFinalize() {
		FinalizeImpl finalize = new FinalizeImpl();
		return finalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalizerBlock createFinalizerBlock() {
		FinalizerBlockImpl finalizerBlock = new FinalizerBlockImpl();
		return finalizerBlock;
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
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
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
	public NoAction createNoAction() {
		NoActionImpl noAction = new NoActionImpl();
		return noAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.xjtu.cdl2bpel.cdl.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
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
	public ParticipantType createParticipantType() {
		ParticipantTypeImpl participantType = new ParticipantTypeImpl();
		return participantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassingInfoOfTheChannelType createPassingInfoOfTheChannelType() {
		PassingInfoOfTheChannelTypeImpl passingInfoOfTheChannelType = new PassingInfoOfTheChannelTypeImpl();
		return passingInfoOfTheChannelType;
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
	public RecordElementInfo createRecordElementInfo() {
		RecordElementInfoImpl recordElementInfo = new RecordElementInfoImpl();
		return recordElementInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
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
	public SilentAction createSilentAction() {
		SilentActionImpl silentAction = new SilentActionImpl();
		return silentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenWithBlockOfWorkUnit createWhenWithBlockOfWorkUnit() {
		WhenWithBlockOfWorkUnitImpl whenWithBlockOfWorkUnit = new WhenWithBlockOfWorkUnitImpl();
		return whenWithBlockOfWorkUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileWithRepeateOfWorkUnit createWhileWithRepeateOfWorkUnit() {
		WhileWithRepeateOfWorkUnitImpl whileWithRepeateOfWorkUnit = new WhileWithRepeateOfWorkUnitImpl();
		return whileWithRepeateOfWorkUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix createRoleTypeMatrix() {
		RoleTypeMatrixImpl roleTypeMatrix = new RoleTypeMatrixImpl();
		return roleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrixBindInfo createRoleTypeMatrixBindInfo() {
		RoleTypeMatrixBindInfoImpl roleTypeMatrixBindInfo = new RoleTypeMatrixBindInfoImpl();
		return roleTypeMatrixBindInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipateInfoByInteraction createParticipateInfoByInteraction() {
		ParticipateInfoByInteractionImpl participateInfoByInteraction = new ParticipateInfoByInteractionImpl();
		return participateInfoByInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionLpw createInteractionLpw() {
		InteractionLpwImpl interactionLpw = new InteractionLpwImpl();
		return interactionLpw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeZlp createRoleTypeZlp() {
		RoleTypeZlpImpl roleTypeZlp = new RoleTypeZlpImpl();
		return roleTypeZlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendByExchange createSendByExchange() {
		SendByExchangeImpl sendByExchange = new SendByExchangeImpl();
		return sendByExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveByExchange createReceiveByExchange() {
		ReceiveByExchangeImpl receiveByExchange = new ReceiveByExchangeImpl();
		return receiveByExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeWithNoAttrOfWorkUnit createScopeWithNoAttrOfWorkUnit() {
		ScopeWithNoAttrOfWorkUnitImpl scopeWithNoAttrOfWorkUnit = new ScopeWithNoAttrOfWorkUnitImpl();
		return scopeWithNoAttrOfWorkUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTypeEnumByChannelType createActionTypeEnumByChannelTypeFromString(EDataType eDataType, String initialValue) {
		ActionTypeEnumByChannelType result = ActionTypeEnumByChannelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeEnumByChannelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTypeEnumByExchangeInfo createActionTypeEnumByExchangeInfoFromString(EDataType eDataType, String initialValue) {
		ActionTypeEnumByExchangeInfo result = ActionTypeEnumByExchangeInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeEnumByExchangeInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeEnumByChannelType createUsageTypeEnumByChannelTypeFromString(EDataType eDataType, String initialValue) {
		UsageTypeEnumByChannelType result = UsageTypeEnumByChannelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeEnumByChannelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenTypeEnumByRecordInfo createWhenTypeEnumByRecordInfoFromString(EDataType eDataType, String initialValue) {
		WhenTypeEnumByRecordInfo result = WhenTypeEnumByRecordInfo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhenTypeEnumByRecordInfoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTypeEnumByIdentify createKeyTypeEnumByIdentifyFromString(EDataType eDataType, String initialValue) {
		KeyTypeEnumByIdentify result = KeyTypeEnumByIdentify.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyTypeEnumByIdentifyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyState createChoreographyStateFromString(EDataType eDataType, String initialValue) {
		ChoreographyState result = ChoreographyState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoreographyStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityStateEnumByActivity createActivityStateEnumByActivityFromString(EDataType eDataType, String initialValue) {
		ActivityStateEnumByActivity result = ActivityStateEnumByActivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityStateEnumByActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLPackage getCDLPackage() {
		return (CDLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDLPackage getPackage() {
		return CDLPackage.eINSTANCE;
	}

} //CDLFactoryImpl
