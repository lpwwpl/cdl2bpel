/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLPackageImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity;
import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
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
import edu.xjtu.cdl2bpel.cdl.InfoOrChannel;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.InteractionLpw;
import edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify;
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
import edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WorkUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDLPackageImpl extends EPackageImpl implements CDLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorOfRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseConditionalOfSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyOfAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoOrChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionWorkUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalizerBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passingInfoOfTheChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordElementInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass silentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenLocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenWithBlockOfWorkUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileWithRepeateOfWorkUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeMatrixBindInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingStructuralActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participateInfoByInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionLpwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeZlpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendByExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveByExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeWithNoAttrOfWorkUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEnumByChannelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEnumByExchangeInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageTypeEnumByChannelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum whenTypeEnumByRecordInfoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyTypeEnumByIdentifyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum choreographyStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityStateEnumByActivityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CDLPackageImpl() {
		super(eNS_URI, CDLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CDLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CDLPackage init() {
		if (isInited) return (CDLPackage)EPackage.Registry.INSTANCE.getEPackage(CDLPackage.eNS_URI);

		// Obtain or create and register package
		CDLPackageImpl theCDLPackage = (CDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CDLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCDLPackage.createPackageContents();

		// Initialize created meta-data
		theCDLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCDLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CDLPackage.eNS_URI, theCDLPackage);
		return theCDLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Locked() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_State() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_TheBelongedRoleTypeMatrix() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign() {
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign_CopyOfAssign() {
		return (EReference)assignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssign_RoleType() {
		return (EReference)assignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorOfRoleType() {
		return behaviorOfRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorOfRoleType_Interface() {
		return (EAttribute)behaviorOfRoleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindInfo() {
		return bindInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindInfo_ThisVariable() {
		return (EReference)bindInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindInfo_ThisRole() {
		return (EReference)bindInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindInfo_FreeVariable() {
		return (EReference)bindInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindInfo_FreeRole() {
		return (EReference)bindInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDLElement() {
		return cdlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDLElement_Description() {
		return (EAttribute)cdlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDLElement_Name() {
		return (EAttribute)cdlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDLElement_Addition() {
		return (EAttribute)cdlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelType() {
		return channelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Usage() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Action() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_PassingInfoByChannel() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_TheBehaviorOfTheRoleType() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_ReferencedToken() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_Identities() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_RoleType() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreography() {
		return choreographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoreography_Complete() {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoreography_Isolation() {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoreography_Root() {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoreography_Coordination() {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_Relationships() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_EnclosedChoreographies() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_RoleTypeMatrixPlayingRoleInChoreo() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_Variables() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_ExceptionBlock() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_FinalizerBlocks() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_Activities() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_EnclosingChoreographies() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseConditionalOfSwitch() {
		return caseConditionalOfSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyOfAssign() {
		return copyOfAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyOfAssign_SourceVariable() {
		return (EReference)copyOfAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfAssign_SourceExpression() {
		return (EAttribute)copyOfAssignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyOfAssign_TargetVariable() {
		return (EReference)copyOfAssignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfAssign_CauseException() {
		return (EAttribute)copyOfAssignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfAssign_SourceVariablePart() {
		return (EAttribute)copyOfAssignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyOfAssign_TargetVariablePart() {
		return (EAttribute)copyOfAssignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoOrChannel() {
		return infoOrChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionBlock() {
		return exceptionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionBlock_ExceptionWorkUnits() {
		return (EReference)exceptionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionWorkUnit() {
		return exceptionWorkUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionWorkUnit_ExceptionType() {
		return (EAttribute)exceptionWorkUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeInfo() {
		return exchangeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeInfo_Type() {
		return (EReference)exchangeInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_Action() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeInfo_SendRecordReference() {
		return (EReference)exchangeInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeInfo_ReceiveRecordReference() {
		return (EReference)exchangeInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_FaultName() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeInfo_SendVariable() {
		return (EReference)exchangeInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_SendVariablePart() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_CauseExceptionOfSend() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeInfo_ReceiveVariable() {
		return (EReference)exchangeInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_ReceiveVariablePart() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeInfo_CauseExceptionOfReceive() {
		return (EAttribute)exchangeInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalize() {
		return finalizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalize_Choreography() {
		return (EReference)finalizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinalize_ChoreographyInstanceId() {
		return (EAttribute)finalizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalize_FinalizerBlock() {
		return (EReference)finalizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalize_RoleTypeMatrixBindInfo() {
		return (EReference)finalizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalizerBlock() {
		return finalizerBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalizerBlock_Activities() {
		return (EReference)finalizerBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentity_Type() {
		return (EAttribute)identityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentity_Tokens() {
		return (EReference)identityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationType() {
		return informationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationType_TypeName() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationType_ElementName() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Operation() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ChannelVariable() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_TimeoutOfTimeToComplete() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Align() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_Initiate() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Relationship() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ExchangeInfos() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_RecordInfos() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_TimeoutFromRoleTypeRecordInfo() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_TimeoutToRoleTypeRecordInfo() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FromRoleTypeOfBelongedRoleTypeMatrix() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ToRoleTypeOfBelongedRoleTypeMatrix() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ParticipateByInteraction() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Prefix() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_Uri() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespace_SchemaLocation() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoAction() {
		return noActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoAction_RoleType() {
		return (EReference)noActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Author() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_TargetNamespace() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Namespaces() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_InformationTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Tokens() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_TokenLocators() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_RoleTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_RelationshipTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ParticipantTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ChannelTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Choreographies() {
		return (EReference)packageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantType() {
		return participantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantType_RoleTypes() {
		return (EReference)participantTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantType_Stateless() {
		return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantType_Free() {
		return (EAttribute)participantTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassingInfoOfTheChannelType() {
		return passingInfoOfTheChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassingInfoOfTheChannelType_Channel() {
		return (EReference)passingInfoOfTheChannelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassingInfoOfTheChannelType_Action() {
		return (EAttribute)passingInfoOfTheChannelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassingInfoOfTheChannelType_New() {
		return (EAttribute)passingInfoOfTheChannelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassingInfoOfTheChannelType_EnclosingChannel() {
		return (EReference)passingInfoOfTheChannelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerform() {
		return performEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_BindsOfPerform() {
		return (EReference)performEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_ChoreographyInstanceId() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_Choreography() {
		return (EReference)performEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_WaitForCompletion() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerform_RoleTypeMatrixBindInfos() {
		return (EReference)performEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_Block() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_ChoreographyName() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordElementInfo() {
		return recordElementInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordElementInfo_When() {
		return (EAttribute)recordElementInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordElementInfo_SourceVariable() {
		return (EReference)recordElementInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordElementInfo_TargetVariable() {
		return (EReference)recordElementInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordElementInfo_CauseException() {
		return (EAttribute)recordElementInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordElementInfo_SourceExpression() {
		return (EAttribute)recordElementInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordElementInfo_SourceVariablePart() {
		return (EAttribute)recordElementInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordElementInfo_TargetVariablePart() {
		return (EAttribute)recordElementInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_RoleTypeOfFirst() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_BehaviorsOfRoleTypeFirst() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_RoleTypeOfSecond() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_BehaviorsOfRoleTypeSecond() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleType_Behaviors() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Stateless() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Free() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilentAction() {
		return silentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilentAction_RoleType() {
		return (EReference)silentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_InformationType() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenLocator() {
		return tokenLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenLocator_Token() {
		return (EReference)tokenLocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenLocator_InformationType() {
		return (EReference)tokenLocatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenLocator_Query() {
		return (EAttribute)tokenLocatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenLocator_Part() {
		return (EAttribute)tokenLocatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Mutable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Free() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Silent() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_RoleTypes() {
		return (EReference)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkUnit() {
		return workUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkUnit_GuardExpression() {
		return (EAttribute)workUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkUnit_Block() {
		return (EAttribute)workUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkUnit_RepeatExpression() {
		return (EAttribute)workUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhenWithBlockOfWorkUnit() {
		return whenWithBlockOfWorkUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenWithBlockOfWorkUnit_MatchedExpression() {
		return (EAttribute)whenWithBlockOfWorkUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhenWithBlockOfWorkUnit_IsMatched() {
		return (EAttribute)whenWithBlockOfWorkUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileWithRepeateOfWorkUnit() {
		return whileWithRepeateOfWorkUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhileWithRepeateOfWorkUnit_BreakOutExpression() {
		return (EAttribute)whileWithRepeateOfWorkUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTypeMatrix() {
		return roleTypeMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTypeMatrix_RoleTypes() {
		return (EReference)roleTypeMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTypeMatrix_Free() {
		return (EAttribute)roleTypeMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTypeMatrixBindInfo() {
		return roleTypeMatrixBindInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTypeMatrixBindInfo_ThisRoleTypeMatrix() {
		return (EReference)roleTypeMatrixBindInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTypeMatrixBindInfo_FreeRoleTypeMatrix() {
		return (EReference)roleTypeMatrixBindInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingStructuralActivity() {
		return orderingStructuralActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingStructuralActivity_Activities() {
		return (EReference)orderingStructuralActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipateInfoByInteraction() {
		return participateInfoByInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipateInfoByInteraction_RelationshipType() {
		return (EReference)participateInfoByInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipateInfoByInteraction_FromRoleTypeRef() {
		return (EReference)participateInfoByInteractionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipateInfoByInteraction_ToRoleTypeRef() {
		return (EReference)participateInfoByInteractionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionLpw() {
		return interactionLpwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionLpw_FromRoleType() {
		return (EReference)interactionLpwEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionLpw_ToRoleType() {
		return (EReference)interactionLpwEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionLpw_Opperation() {
		return (EAttribute)interactionLpwEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionLpw_Timeout() {
		return (EAttribute)interactionLpwEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionLpw_Align() {
		return (EAttribute)interactionLpwEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionLpw_Interaction() {
		return (EReference)interactionLpwEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionLpw_Asyn() {
		return (EAttribute)interactionLpwEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTypeZlp() {
		return roleTypeZlpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTypeZlp_ParticipantBelongedByRoleType() {
		return (EReference)roleTypeZlpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTypeZlp_Free() {
		return (EAttribute)roleTypeZlpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendByExchange() {
		return sendByExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendByExchange_SendVariable() {
		return (EReference)sendByExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendByExchange_SendVariablePart() {
		return (EAttribute)sendByExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendByExchange_SendCaseException() {
		return (EAttribute)sendByExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveByExchange() {
		return receiveByExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveByExchange_ReceiveVariable() {
		return (EReference)receiveByExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveByExchange_ReceiveVariablePart() {
		return (EAttribute)receiveByExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveByExchange_ReceiveCaseException() {
		return (EAttribute)receiveByExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeWithNoAttrOfWorkUnit() {
		return scopeWithNoAttrOfWorkUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionTypeEnumByChannelType() {
		return actionTypeEnumByChannelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionTypeEnumByExchangeInfo() {
		return actionTypeEnumByExchangeInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageTypeEnumByChannelType() {
		return usageTypeEnumByChannelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWhenTypeEnumByRecordInfo() {
		return whenTypeEnumByRecordInfoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeyTypeEnumByIdentify() {
		return keyTypeEnumByIdentifyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChoreographyState() {
		return choreographyStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityStateEnumByActivity() {
		return activityStateEnumByActivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDLFactory getCDLFactory() {
		return (CDLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__LOCKED);
		createEAttribute(activityEClass, ACTIVITY__STATE);
		createEReference(activityEClass, ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX);

		assignEClass = createEClass(ASSIGN);
		createEReference(assignEClass, ASSIGN__COPY_OF_ASSIGN);
		createEReference(assignEClass, ASSIGN__ROLE_TYPE);

		behaviorOfRoleTypeEClass = createEClass(BEHAVIOR_OF_ROLE_TYPE);
		createEAttribute(behaviorOfRoleTypeEClass, BEHAVIOR_OF_ROLE_TYPE__INTERFACE);

		bindInfoEClass = createEClass(BIND_INFO);
		createEReference(bindInfoEClass, BIND_INFO__THIS_VARIABLE);
		createEReference(bindInfoEClass, BIND_INFO__THIS_ROLE);
		createEReference(bindInfoEClass, BIND_INFO__FREE_VARIABLE);
		createEReference(bindInfoEClass, BIND_INFO__FREE_ROLE);

		cdlElementEClass = createEClass(CDL_ELEMENT);
		createEAttribute(cdlElementEClass, CDL_ELEMENT__DESCRIPTION);
		createEAttribute(cdlElementEClass, CDL_ELEMENT__NAME);
		createEAttribute(cdlElementEClass, CDL_ELEMENT__ADDITION);

		channelTypeEClass = createEClass(CHANNEL_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__USAGE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__ACTION);
		createEReference(channelTypeEClass, CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL);
		createEReference(channelTypeEClass, CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE);
		createEReference(channelTypeEClass, CHANNEL_TYPE__REFERENCED_TOKEN);
		createEReference(channelTypeEClass, CHANNEL_TYPE__IDENTITIES);
		createEReference(channelTypeEClass, CHANNEL_TYPE__ROLE_TYPE);

		choiceEClass = createEClass(CHOICE);

		choreographyEClass = createEClass(CHOREOGRAPHY);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__COMPLETE);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__ISOLATION);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__ROOT);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__COORDINATION);
		createEReference(choreographyEClass, CHOREOGRAPHY__RELATIONSHIPS);
		createEReference(choreographyEClass, CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES);
		createEReference(choreographyEClass, CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO);
		createEReference(choreographyEClass, CHOREOGRAPHY__VARIABLES);
		createEReference(choreographyEClass, CHOREOGRAPHY__EXCEPTION_BLOCK);
		createEReference(choreographyEClass, CHOREOGRAPHY__FINALIZER_BLOCKS);
		createEReference(choreographyEClass, CHOREOGRAPHY__ACTIVITIES);
		createEReference(choreographyEClass, CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES);

		caseConditionalOfSwitchEClass = createEClass(CASE_CONDITIONAL_OF_SWITCH);

		copyOfAssignEClass = createEClass(COPY_OF_ASSIGN);
		createEReference(copyOfAssignEClass, COPY_OF_ASSIGN__SOURCE_VARIABLE);
		createEAttribute(copyOfAssignEClass, COPY_OF_ASSIGN__SOURCE_EXPRESSION);
		createEReference(copyOfAssignEClass, COPY_OF_ASSIGN__TARGET_VARIABLE);
		createEAttribute(copyOfAssignEClass, COPY_OF_ASSIGN__CAUSE_EXCEPTION);
		createEAttribute(copyOfAssignEClass, COPY_OF_ASSIGN__SOURCE_VARIABLE_PART);
		createEAttribute(copyOfAssignEClass, COPY_OF_ASSIGN__TARGET_VARIABLE_PART);

		infoOrChannelEClass = createEClass(INFO_OR_CHANNEL);

		exceptionBlockEClass = createEClass(EXCEPTION_BLOCK);
		createEReference(exceptionBlockEClass, EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS);

		exceptionWorkUnitEClass = createEClass(EXCEPTION_WORK_UNIT);
		createEAttribute(exceptionWorkUnitEClass, EXCEPTION_WORK_UNIT__EXCEPTION_TYPE);

		exchangeInfoEClass = createEClass(EXCHANGE_INFO);
		createEReference(exchangeInfoEClass, EXCHANGE_INFO__TYPE);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__ACTION);
		createEReference(exchangeInfoEClass, EXCHANGE_INFO__SEND_RECORD_REFERENCE);
		createEReference(exchangeInfoEClass, EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__FAULT_NAME);
		createEReference(exchangeInfoEClass, EXCHANGE_INFO__SEND_VARIABLE);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__SEND_VARIABLE_PART);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND);
		createEReference(exchangeInfoEClass, EXCHANGE_INFO__RECEIVE_VARIABLE);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__RECEIVE_VARIABLE_PART);
		createEAttribute(exchangeInfoEClass, EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE);

		finalizeEClass = createEClass(FINALIZE);
		createEReference(finalizeEClass, FINALIZE__CHOREOGRAPHY);
		createEAttribute(finalizeEClass, FINALIZE__CHOREOGRAPHY_INSTANCE_ID);
		createEReference(finalizeEClass, FINALIZE__FINALIZER_BLOCK);
		createEReference(finalizeEClass, FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO);

		finalizerBlockEClass = createEClass(FINALIZER_BLOCK);
		createEReference(finalizerBlockEClass, FINALIZER_BLOCK__ACTIVITIES);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__TYPE);
		createEReference(identityEClass, IDENTITY__TOKENS);

		informationTypeEClass = createEClass(INFORMATION_TYPE);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__TYPE_NAME);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__ELEMENT_NAME);

		interactionEClass = createEClass(INTERACTION);
		createEAttribute(interactionEClass, INTERACTION__OPERATION);
		createEReference(interactionEClass, INTERACTION__CHANNEL_VARIABLE);
		createEAttribute(interactionEClass, INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE);
		createEAttribute(interactionEClass, INTERACTION__ALIGN);
		createEAttribute(interactionEClass, INTERACTION__INITIATE);
		createEReference(interactionEClass, INTERACTION__RELATIONSHIP);
		createEReference(interactionEClass, INTERACTION__EXCHANGE_INFOS);
		createEReference(interactionEClass, INTERACTION__RECORD_INFOS);
		createEReference(interactionEClass, INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO);
		createEReference(interactionEClass, INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO);
		createEReference(interactionEClass, INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX);
		createEReference(interactionEClass, INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX);
		createEReference(interactionEClass, INTERACTION__PARTICIPATE_BY_INTERACTION);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__PREFIX);
		createEAttribute(namespaceEClass, NAMESPACE__URI);
		createEAttribute(namespaceEClass, NAMESPACE__SCHEMA_LOCATION);

		noActionEClass = createEClass(NO_ACTION);
		createEReference(noActionEClass, NO_ACTION__ROLE_TYPE);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__AUTHOR);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEAttribute(packageEClass, PACKAGE__TARGET_NAMESPACE);
		createEReference(packageEClass, PACKAGE__NAMESPACES);
		createEReference(packageEClass, PACKAGE__INFORMATION_TYPES);
		createEReference(packageEClass, PACKAGE__TOKENS);
		createEReference(packageEClass, PACKAGE__TOKEN_LOCATORS);
		createEReference(packageEClass, PACKAGE__ROLE_TYPES);
		createEReference(packageEClass, PACKAGE__RELATIONSHIP_TYPES);
		createEReference(packageEClass, PACKAGE__PARTICIPANT_TYPES);
		createEReference(packageEClass, PACKAGE__CHANNEL_TYPES);
		createEReference(packageEClass, PACKAGE__CHOREOGRAPHIES);

		parallelEClass = createEClass(PARALLEL);

		participantTypeEClass = createEClass(PARTICIPANT_TYPE);
		createEReference(participantTypeEClass, PARTICIPANT_TYPE__ROLE_TYPES);
		createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__STATELESS);
		createEAttribute(participantTypeEClass, PARTICIPANT_TYPE__FREE);

		passingInfoOfTheChannelTypeEClass = createEClass(PASSING_INFO_OF_THE_CHANNEL_TYPE);
		createEReference(passingInfoOfTheChannelTypeEClass, PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL);
		createEAttribute(passingInfoOfTheChannelTypeEClass, PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION);
		createEAttribute(passingInfoOfTheChannelTypeEClass, PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW);
		createEReference(passingInfoOfTheChannelTypeEClass, PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL);

		performEClass = createEClass(PERFORM);
		createEReference(performEClass, PERFORM__BINDS_OF_PERFORM);
		createEAttribute(performEClass, PERFORM__CHOREOGRAPHY_INSTANCE_ID);
		createEReference(performEClass, PERFORM__CHOREOGRAPHY);
		createEAttribute(performEClass, PERFORM__WAIT_FOR_COMPLETION);
		createEReference(performEClass, PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS);
		createEAttribute(performEClass, PERFORM__BLOCK);
		createEAttribute(performEClass, PERFORM__CHOREOGRAPHY_NAME);

		recordElementInfoEClass = createEClass(RECORD_ELEMENT_INFO);
		createEAttribute(recordElementInfoEClass, RECORD_ELEMENT_INFO__WHEN);
		createEReference(recordElementInfoEClass, RECORD_ELEMENT_INFO__SOURCE_VARIABLE);
		createEReference(recordElementInfoEClass, RECORD_ELEMENT_INFO__TARGET_VARIABLE);
		createEAttribute(recordElementInfoEClass, RECORD_ELEMENT_INFO__CAUSE_EXCEPTION);
		createEAttribute(recordElementInfoEClass, RECORD_ELEMENT_INFO__SOURCE_EXPRESSION);
		createEAttribute(recordElementInfoEClass, RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART);
		createEAttribute(recordElementInfoEClass, RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEReference(roleTypeEClass, ROLE_TYPE__BEHAVIORS);
		createEAttribute(roleTypeEClass, ROLE_TYPE__STATELESS);
		createEAttribute(roleTypeEClass, ROLE_TYPE__FREE);

		sequenceEClass = createEClass(SEQUENCE);

		silentActionEClass = createEClass(SILENT_ACTION);
		createEReference(silentActionEClass, SILENT_ACTION__ROLE_TYPE);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__INFORMATION_TYPE);

		tokenLocatorEClass = createEClass(TOKEN_LOCATOR);
		createEReference(tokenLocatorEClass, TOKEN_LOCATOR__TOKEN);
		createEReference(tokenLocatorEClass, TOKEN_LOCATOR__INFORMATION_TYPE);
		createEAttribute(tokenLocatorEClass, TOKEN_LOCATOR__QUERY);
		createEAttribute(tokenLocatorEClass, TOKEN_LOCATOR__PART);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__MUTABLE);
		createEAttribute(variableEClass, VARIABLE__FREE);
		createEAttribute(variableEClass, VARIABLE__SILENT);
		createEReference(variableEClass, VARIABLE__ROLE_TYPES);

		workUnitEClass = createEClass(WORK_UNIT);
		createEAttribute(workUnitEClass, WORK_UNIT__GUARD_EXPRESSION);
		createEAttribute(workUnitEClass, WORK_UNIT__BLOCK);
		createEAttribute(workUnitEClass, WORK_UNIT__REPEAT_EXPRESSION);

		whenWithBlockOfWorkUnitEClass = createEClass(WHEN_WITH_BLOCK_OF_WORK_UNIT);
		createEAttribute(whenWithBlockOfWorkUnitEClass, WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION);
		createEAttribute(whenWithBlockOfWorkUnitEClass, WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED);

		whileWithRepeateOfWorkUnitEClass = createEClass(WHILE_WITH_REPEATE_OF_WORK_UNIT);
		createEAttribute(whileWithRepeateOfWorkUnitEClass, WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION);

		roleTypeMatrixEClass = createEClass(ROLE_TYPE_MATRIX);
		createEReference(roleTypeMatrixEClass, ROLE_TYPE_MATRIX__ROLE_TYPES);
		createEAttribute(roleTypeMatrixEClass, ROLE_TYPE_MATRIX__FREE);

		roleTypeMatrixBindInfoEClass = createEClass(ROLE_TYPE_MATRIX_BIND_INFO);
		createEReference(roleTypeMatrixBindInfoEClass, ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX);
		createEReference(roleTypeMatrixBindInfoEClass, ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX);

		orderingStructuralActivityEClass = createEClass(ORDERING_STRUCTURAL_ACTIVITY);
		createEReference(orderingStructuralActivityEClass, ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES);

		participateInfoByInteractionEClass = createEClass(PARTICIPATE_INFO_BY_INTERACTION);
		createEReference(participateInfoByInteractionEClass, PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE);
		createEReference(participateInfoByInteractionEClass, PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF);
		createEReference(participateInfoByInteractionEClass, PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF);

		interactionLpwEClass = createEClass(INTERACTION_LPW);
		createEReference(interactionLpwEClass, INTERACTION_LPW__FROM_ROLE_TYPE);
		createEReference(interactionLpwEClass, INTERACTION_LPW__TO_ROLE_TYPE);
		createEAttribute(interactionLpwEClass, INTERACTION_LPW__OPPERATION);
		createEAttribute(interactionLpwEClass, INTERACTION_LPW__TIMEOUT);
		createEAttribute(interactionLpwEClass, INTERACTION_LPW__ALIGN);
		createEReference(interactionLpwEClass, INTERACTION_LPW__INTERACTION);
		createEAttribute(interactionLpwEClass, INTERACTION_LPW__ASYN);

		roleTypeZlpEClass = createEClass(ROLE_TYPE_ZLP);
		createEReference(roleTypeZlpEClass, ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE);
		createEAttribute(roleTypeZlpEClass, ROLE_TYPE_ZLP__FREE);

		sendByExchangeEClass = createEClass(SEND_BY_EXCHANGE);
		createEReference(sendByExchangeEClass, SEND_BY_EXCHANGE__SEND_VARIABLE);
		createEAttribute(sendByExchangeEClass, SEND_BY_EXCHANGE__SEND_VARIABLE_PART);
		createEAttribute(sendByExchangeEClass, SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION);

		receiveByExchangeEClass = createEClass(RECEIVE_BY_EXCHANGE);
		createEReference(receiveByExchangeEClass, RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE);
		createEAttribute(receiveByExchangeEClass, RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART);
		createEAttribute(receiveByExchangeEClass, RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION);

		scopeWithNoAttrOfWorkUnitEClass = createEClass(SCOPE_WITH_NO_ATTR_OF_WORK_UNIT);

		// Create enums
		actionTypeEnumByChannelTypeEEnum = createEEnum(ACTION_TYPE_ENUM_BY_CHANNEL_TYPE);
		actionTypeEnumByExchangeInfoEEnum = createEEnum(ACTION_TYPE_ENUM_BY_EXCHANGE_INFO);
		usageTypeEnumByChannelTypeEEnum = createEEnum(USAGE_TYPE_ENUM_BY_CHANNEL_TYPE);
		whenTypeEnumByRecordInfoEEnum = createEEnum(WHEN_TYPE_ENUM_BY_RECORD_INFO);
		keyTypeEnumByIdentifyEEnum = createEEnum(KEY_TYPE_ENUM_BY_IDENTIFY);
		choreographyStateEEnum = createEEnum(CHOREOGRAPHY_STATE);
		activityStateEnumByActivityEEnum = createEEnum(ACTIVITY_STATE_ENUM_BY_ACTIVITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getCDLElement());
		assignEClass.getESuperTypes().add(this.getActivity());
		behaviorOfRoleTypeEClass.getESuperTypes().add(this.getCDLElement());
		bindInfoEClass.getESuperTypes().add(this.getCDLElement());
		channelTypeEClass.getESuperTypes().add(this.getInfoOrChannel());
		choiceEClass.getESuperTypes().add(this.getOrderingStructuralActivity());
		choreographyEClass.getESuperTypes().add(this.getCDLElement());
		caseConditionalOfSwitchEClass.getESuperTypes().add(this.getWorkUnit());
		copyOfAssignEClass.getESuperTypes().add(this.getCDLElement());
		infoOrChannelEClass.getESuperTypes().add(this.getCDLElement());
		exceptionBlockEClass.getESuperTypes().add(this.getCDLElement());
		exceptionWorkUnitEClass.getESuperTypes().add(this.getWorkUnit());
		exchangeInfoEClass.getESuperTypes().add(this.getCDLElement());
		finalizeEClass.getESuperTypes().add(this.getActivity());
		finalizerBlockEClass.getESuperTypes().add(this.getCDLElement());
		identityEClass.getESuperTypes().add(this.getCDLElement());
		informationTypeEClass.getESuperTypes().add(this.getInfoOrChannel());
		interactionEClass.getESuperTypes().add(this.getActivity());
		namespaceEClass.getESuperTypes().add(this.getCDLElement());
		noActionEClass.getESuperTypes().add(this.getActivity());
		packageEClass.getESuperTypes().add(this.getCDLElement());
		parallelEClass.getESuperTypes().add(this.getOrderingStructuralActivity());
		participantTypeEClass.getESuperTypes().add(this.getCDLElement());
		passingInfoOfTheChannelTypeEClass.getESuperTypes().add(this.getCDLElement());
		performEClass.getESuperTypes().add(this.getActivity());
		recordElementInfoEClass.getESuperTypes().add(this.getCDLElement());
		relationshipTypeEClass.getESuperTypes().add(this.getCDLElement());
		roleTypeEClass.getESuperTypes().add(this.getCDLElement());
		sequenceEClass.getESuperTypes().add(this.getOrderingStructuralActivity());
		silentActionEClass.getESuperTypes().add(this.getActivity());
		tokenEClass.getESuperTypes().add(this.getCDLElement());
		tokenLocatorEClass.getESuperTypes().add(this.getCDLElement());
		variableEClass.getESuperTypes().add(this.getCDLElement());
		workUnitEClass.getESuperTypes().add(this.getOrderingStructuralActivity());
		whenWithBlockOfWorkUnitEClass.getESuperTypes().add(this.getWorkUnit());
		whileWithRepeateOfWorkUnitEClass.getESuperTypes().add(this.getWorkUnit());
		roleTypeMatrixEClass.getESuperTypes().add(this.getCDLElement());
		roleTypeMatrixBindInfoEClass.getESuperTypes().add(this.getCDLElement());
		orderingStructuralActivityEClass.getESuperTypes().add(this.getActivity());
		participateInfoByInteractionEClass.getESuperTypes().add(this.getCDLElement());
		interactionLpwEClass.getESuperTypes().add(this.getCDLElement());
		roleTypeZlpEClass.getESuperTypes().add(this.getCDLElement());
		sendByExchangeEClass.getESuperTypes().add(this.getCDLElement());
		receiveByExchangeEClass.getESuperTypes().add(this.getCDLElement());
		scopeWithNoAttrOfWorkUnitEClass.getESuperTypes().add(this.getWorkUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Locked(), ecorePackage.getEBooleanObject(), "locked", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_State(), this.getActivityStateEnumByActivity(), "state", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_TheBelongedRoleTypeMatrix(), this.getRoleTypeMatrix(), null, "theBelongedRoleTypeMatrix", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssign_CopyOfAssign(), this.getCopyOfAssign(), null, "copyOfAssign", null, 1, -1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssign_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorOfRoleTypeEClass, BehaviorOfRoleType.class, "BehaviorOfRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorOfRoleType_Interface(), ecorePackage.getEString(), "interface", null, 0, 1, BehaviorOfRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindInfoEClass, BindInfo.class, "BindInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindInfo_ThisVariable(), this.getVariable(), null, "thisVariable", null, 1, 1, BindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindInfo_ThisRole(), this.getRoleType(), null, "thisRole", null, 1, 1, BindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindInfo_FreeVariable(), this.getVariable(), null, "freeVariable", null, 1, 1, BindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindInfo_FreeRole(), this.getRoleType(), null, "freeRole", null, 1, 1, BindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdlElementEClass, CDLElement.class, "CDLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDLElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CDLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDLElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDLElement_Addition(), ecorePackage.getEString(), "addition", null, 0, 1, CDLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelTypeEClass, ChannelType.class, "ChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelType_Usage(), this.getUsageTypeEnumByChannelType(), "usage", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Action(), this.getActionTypeEnumByChannelType(), "action", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_PassingInfoByChannel(), this.getPassingInfoOfTheChannelType(), null, "passingInfoByChannel", null, 0, -1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_TheBehaviorOfTheRoleType(), this.getBehaviorOfRoleType(), null, "theBehaviorOfTheRoleType", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_ReferencedToken(), this.getToken(), null, "referencedToken", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_Identities(), this.getIdentity(), null, "identities", null, 0, -1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_RoleType(), this.getRoleType(), null, "roleType", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoreography_Complete(), ecorePackage.getEString(), "complete", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreography_Isolation(), ecorePackage.getEBooleanObject(), "isolation", "FALSE", 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreography_Root(), ecorePackage.getEBooleanObject(), "root", "FALSE", 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreography_Coordination(), ecorePackage.getEBooleanObject(), "coordination", "FALSE", 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_Relationships(), this.getRelationshipType(), null, "relationships", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_EnclosedChoreographies(), this.getChoreography(), null, "enclosedChoreographies", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_RoleTypeMatrixPlayingRoleInChoreo(), this.getRoleTypeMatrix(), null, "roleTypeMatrixPlayingRoleInChoreo", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_Variables(), this.getVariable(), null, "variables", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_ExceptionBlock(), this.getExceptionBlock(), null, "exceptionBlock", null, 0, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_FinalizerBlocks(), this.getFinalizerBlock(), null, "finalizerBlocks", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_Activities(), this.getActivity(), null, "activities", null, 1, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoreography_EnclosingChoreographies(), this.getChoreography(), null, "enclosingChoreographies", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseConditionalOfSwitchEClass, CaseConditionalOfSwitch.class, "CaseConditionalOfSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(copyOfAssignEClass, CopyOfAssign.class, "CopyOfAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopyOfAssign_SourceVariable(), this.getVariable(), null, "sourceVariable", null, 0, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfAssign_SourceExpression(), ecorePackage.getEString(), "sourceExpression", null, 0, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopyOfAssign_TargetVariable(), this.getVariable(), null, "targetVariable", null, 1, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfAssign_CauseException(), ecorePackage.getEString(), "causeException", null, 0, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfAssign_SourceVariablePart(), ecorePackage.getEString(), "sourceVariablePart", null, 0, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyOfAssign_TargetVariablePart(), ecorePackage.getEString(), "targetVariablePart", null, 0, 1, CopyOfAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoOrChannelEClass, InfoOrChannel.class, "InfoOrChannel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionBlockEClass, ExceptionBlock.class, "ExceptionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionBlock_ExceptionWorkUnits(), this.getExceptionWorkUnit(), null, "exceptionWorkUnits", null, 1, -1, ExceptionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionWorkUnitEClass, ExceptionWorkUnit.class, "ExceptionWorkUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionWorkUnit_ExceptionType(), ecorePackage.getEString(), "exceptionType", null, 0, 1, ExceptionWorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeInfoEClass, ExchangeInfo.class, "ExchangeInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeInfo_Type(), this.getInfoOrChannel(), null, "type", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_Action(), this.getActionTypeEnumByExchangeInfo(), "action", null, 1, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeInfo_SendRecordReference(), this.getRecordElementInfo(), null, "sendRecordReference", null, 0, -1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeInfo_ReceiveRecordReference(), this.getRecordElementInfo(), null, "receiveRecordReference", null, 0, -1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_FaultName(), ecorePackage.getEString(), "faultName", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeInfo_SendVariable(), this.getVariable(), null, "sendVariable", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_SendVariablePart(), ecorePackage.getEString(), "sendVariablePart", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_CauseExceptionOfSend(), ecorePackage.getEString(), "causeExceptionOfSend", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeInfo_ReceiveVariable(), this.getVariable(), null, "receiveVariable", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_ReceiveVariablePart(), ecorePackage.getEString(), "receiveVariablePart", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeInfo_CauseExceptionOfReceive(), ecorePackage.getEString(), "causeExceptionOfReceive", null, 0, 1, ExchangeInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalizeEClass, Finalize.class, "Finalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalize_Choreography(), this.getChoreography(), null, "choreography", null, 1, 1, Finalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinalize_ChoreographyInstanceId(), ecorePackage.getEString(), "choreographyInstanceId", null, 0, 1, Finalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalize_FinalizerBlock(), this.getFinalizerBlock(), null, "finalizerBlock", null, 0, 1, Finalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalize_RoleTypeMatrixBindInfo(), this.getRoleTypeMatrixBindInfo(), null, "roleTypeMatrixBindInfo", null, 0, -1, Finalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalizerBlockEClass, FinalizerBlock.class, "FinalizerBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalizerBlock_Activities(), this.getActivity(), null, "activities", null, 1, -1, FinalizerBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_Type(), this.getKeyTypeEnumByIdentify(), "type", null, 1, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentity_Tokens(), this.getToken(), null, "tokens", null, 1, -1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTypeEClass, InformationType.class, "InformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationType_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteraction_Operation(), ecorePackage.getEString(), "operation", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_ChannelVariable(), this.getVariable(), null, "channelVariable", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_TimeoutOfTimeToComplete(), ecorePackage.getEString(), "timeoutOfTimeToComplete", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Align(), ecorePackage.getEBooleanObject(), "align", "FALSE", 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_Initiate(), ecorePackage.getEBooleanObject(), "initiate", "false", 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Relationship(), this.getRelationshipType(), null, "relationship", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_ExchangeInfos(), this.getExchangeInfo(), null, "exchangeInfos", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_RecordInfos(), this.getRecordElementInfo(), null, "recordInfos", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_TimeoutFromRoleTypeRecordInfo(), this.getRecordElementInfo(), null, "timeoutFromRoleTypeRecordInfo", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_TimeoutToRoleTypeRecordInfo(), this.getRecordElementInfo(), null, "timeoutToRoleTypeRecordInfo", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_FromRoleTypeOfBelongedRoleTypeMatrix(), this.getRoleTypeMatrix(), null, "fromRoleTypeOfBelongedRoleTypeMatrix", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_ToRoleTypeOfBelongedRoleTypeMatrix(), this.getRoleTypeMatrix(), null, "toRoleTypeOfBelongedRoleTypeMatrix", null, 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_ParticipateByInteraction(), this.getParticipateInfoByInteraction(), null, "participateByInteraction", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_SchemaLocation(), ecorePackage.getEString(), "schemaLocation", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noActionEClass, NoAction.class, "NoAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoAction_RoleType(), this.getRoleType(), null, "roleType", null, 0, 1, NoAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, edu.xjtu.cdl2bpel.cdl.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Author(), ecorePackage.getEString(), "author", null, 0, 1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 1, 1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_TargetNamespace(), ecorePackage.getEString(), "targetNamespace", null, 1, 1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_InformationTypes(), this.getInformationType(), null, "informationTypes", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Tokens(), this.getToken(), null, "tokens", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_TokenLocators(), this.getTokenLocator(), null, "tokenLocators", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_RelationshipTypes(), this.getRelationshipType(), null, "relationshipTypes", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ParticipantTypes(), this.getParticipantType(), null, "participantTypes", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ChannelTypes(), this.getChannelType(), null, "channelTypes", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Choreographies(), this.getChoreography(), null, "choreographies", null, 0, -1, edu.xjtu.cdl2bpel.cdl.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(participantTypeEClass, ParticipantType.class, "ParticipantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantType_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 1, -1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantType_Stateless(), ecorePackage.getEBooleanObject(), "stateless", "FALSE", 0, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantType_Free(), ecorePackage.getEBooleanObject(), "free", null, 0, 1, ParticipantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passingInfoOfTheChannelTypeEClass, PassingInfoOfTheChannelType.class, "PassingInfoOfTheChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassingInfoOfTheChannelType_Channel(), this.getChannelType(), null, "channel", null, 1, 1, PassingInfoOfTheChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassingInfoOfTheChannelType_Action(), this.getActionTypeEnumByChannelType(), "action", null, 0, 1, PassingInfoOfTheChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassingInfoOfTheChannelType_New(), ecorePackage.getEBooleanObject(), "new", "FALSE", 0, 1, PassingInfoOfTheChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassingInfoOfTheChannelType_EnclosingChannel(), this.getChannelType(), null, "enclosingChannel", null, 0, 1, PassingInfoOfTheChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performEClass, Perform.class, "Perform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerform_BindsOfPerform(), this.getBindInfo(), null, "bindsOfPerform", null, 0, -1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_ChoreographyInstanceId(), ecorePackage.getEString(), "choreographyInstanceId", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_Choreography(), this.getChoreography(), null, "choreography", null, 1, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_WaitForCompletion(), ecorePackage.getEBooleanObject(), "waitForCompletion", "TRUE", 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_RoleTypeMatrixBindInfos(), this.getRoleTypeMatrixBindInfo(), null, "roleTypeMatrixBindInfos", null, 0, -1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_Block(), ecorePackage.getEBoolean(), "block", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_ChoreographyName(), ecorePackage.getEString(), "choreographyName", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordElementInfoEClass, RecordElementInfo.class, "RecordElementInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordElementInfo_When(), this.getWhenTypeEnumByRecordInfo(), "when", null, 1, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordElementInfo_SourceVariable(), this.getVariable(), null, "sourceVariable", null, 0, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordElementInfo_TargetVariable(), this.getVariable(), null, "targetVariable", null, 1, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordElementInfo_CauseException(), ecorePackage.getEString(), "causeException", null, 0, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordElementInfo_SourceExpression(), ecorePackage.getEString(), "sourceExpression", null, 0, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordElementInfo_SourceVariablePart(), ecorePackage.getEString(), "sourceVariablePart", null, 0, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordElementInfo_TargetVariablePart(), ecorePackage.getEString(), "targetVariablePart", null, 0, 1, RecordElementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_RoleTypeOfFirst(), this.getRoleType(), null, "roleTypeOfFirst", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_BehaviorsOfRoleTypeFirst(), this.getBehaviorOfRoleType(), null, "behaviorsOfRoleTypeFirst", null, 0, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_RoleTypeOfSecond(), this.getRoleType(), null, "roleTypeOfSecond", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_BehaviorsOfRoleTypeSecond(), this.getBehaviorOfRoleType(), null, "behaviorsOfRoleTypeSecond", null, 0, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleType_Behaviors(), this.getBehaviorOfRoleType(), null, "behaviors", null, 1, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Stateless(), ecorePackage.getEBooleanObject(), "stateless", "FALSE", 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Free(), ecorePackage.getEBooleanObject(), "free", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(silentActionEClass, SilentAction.class, "SilentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSilentAction_RoleType(), this.getRoleType(), null, "roleType", null, 0, 1, SilentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_InformationType(), this.getInformationType(), null, "informationType", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenLocatorEClass, TokenLocator.class, "TokenLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenLocator_Token(), this.getToken(), null, "token", null, 1, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenLocator_InformationType(), this.getInformationType(), null, "informationType", null, 1, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenLocator_Query(), ecorePackage.getEString(), "query", null, 0, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenLocator_Part(), ecorePackage.getEString(), "part", null, 0, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), this.getInfoOrChannel(), null, "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Mutable(), ecorePackage.getEBooleanObject(), "mutable", "TRUE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Free(), ecorePackage.getEBooleanObject(), "free", "FALSE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Silent(), ecorePackage.getEBooleanObject(), "silent", "FALSE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workUnitEClass, WorkUnit.class, "WorkUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkUnit_GuardExpression(), ecorePackage.getEString(), "guardExpression", null, 0, 1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkUnit_Block(), ecorePackage.getEString(), "block", null, 0, 1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkUnit_RepeatExpression(), ecorePackage.getEString(), "repeatExpression", null, 0, 1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenWithBlockOfWorkUnitEClass, WhenWithBlockOfWorkUnit.class, "WhenWithBlockOfWorkUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhenWithBlockOfWorkUnit_MatchedExpression(), ecorePackage.getEString(), "matchedExpression", null, 0, 1, WhenWithBlockOfWorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhenWithBlockOfWorkUnit_IsMatched(), ecorePackage.getEBooleanObject(), "isMatched", "FALSE", 0, 1, WhenWithBlockOfWorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileWithRepeateOfWorkUnitEClass, WhileWithRepeateOfWorkUnit.class, "WhileWithRepeateOfWorkUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhileWithRepeateOfWorkUnit_BreakOutExpression(), ecorePackage.getEString(), "breakOutExpression", "true", 0, 1, WhileWithRepeateOfWorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeMatrixEClass, RoleTypeMatrix.class, "RoleTypeMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleTypeMatrix_RoleTypes(), this.getRoleType(), null, "roleTypes", null, 0, -1, RoleTypeMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleTypeMatrix_Free(), ecorePackage.getEBooleanObject(), "free", "FALSE", 0, 1, RoleTypeMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeMatrixBindInfoEClass, RoleTypeMatrixBindInfo.class, "RoleTypeMatrixBindInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleTypeMatrixBindInfo_ThisRoleTypeMatrix(), this.getRoleTypeMatrix(), null, "thisRoleTypeMatrix", null, 0, 1, RoleTypeMatrixBindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleTypeMatrixBindInfo_FreeRoleTypeMatrix(), this.getRoleTypeMatrix(), null, "freeRoleTypeMatrix", null, 0, 1, RoleTypeMatrixBindInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderingStructuralActivityEClass, OrderingStructuralActivity.class, "OrderingStructuralActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderingStructuralActivity_Activities(), this.getActivity(), null, "activities", null, 1, -1, OrderingStructuralActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participateInfoByInteractionEClass, ParticipateInfoByInteraction.class, "ParticipateInfoByInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipateInfoByInteraction_RelationshipType(), this.getRelationshipType(), null, "relationshipType", null, 0, 1, ParticipateInfoByInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipateInfoByInteraction_FromRoleTypeRef(), this.getRoleType(), null, "fromRoleTypeRef", null, 0, 1, ParticipateInfoByInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipateInfoByInteraction_ToRoleTypeRef(), this.getRoleType(), null, "toRoleTypeRef", null, 0, 1, ParticipateInfoByInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionLpwEClass, InteractionLpw.class, "InteractionLpw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionLpw_FromRoleType(), this.getRoleTypeZlp(), null, "fromRoleType", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionLpw_ToRoleType(), this.getRoleTypeZlp(), null, "toRoleType", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionLpw_Opperation(), ecorePackage.getEString(), "opperation", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionLpw_Timeout(), ecorePackage.getEString(), "timeout", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionLpw_Align(), ecorePackage.getEBooleanObject(), "align", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionLpw_Interaction(), this.getInteraction(), null, "interaction", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionLpw_Asyn(), ecorePackage.getEBooleanObject(), "Asyn", null, 0, 1, InteractionLpw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeZlpEClass, RoleTypeZlp.class, "RoleTypeZlp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleTypeZlp_ParticipantBelongedByRoleType(), this.getParticipantType(), null, "participantBelongedByRoleType", null, 0, 1, RoleTypeZlp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleTypeZlp_Free(), ecorePackage.getEBooleanObject(), "free", null, 0, 1, RoleTypeZlp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendByExchangeEClass, SendByExchange.class, "SendByExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendByExchange_SendVariable(), this.getVariable(), null, "sendVariable", null, 0, 1, SendByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendByExchange_SendVariablePart(), ecorePackage.getEString(), "sendVariablePart", null, 0, 1, SendByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSendByExchange_SendCaseException(), ecorePackage.getEString(), "sendCaseException", null, 0, 1, SendByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveByExchangeEClass, ReceiveByExchange.class, "ReceiveByExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveByExchange_ReceiveVariable(), this.getVariable(), null, "receiveVariable", null, 0, 1, ReceiveByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReceiveByExchange_ReceiveVariablePart(), ecorePackage.getEString(), "receiveVariablePart", null, 0, 1, ReceiveByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReceiveByExchange_ReceiveCaseException(), ecorePackage.getEString(), "receiveCaseException", null, 0, 1, ReceiveByExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeWithNoAttrOfWorkUnitEClass, ScopeWithNoAttrOfWorkUnit.class, "ScopeWithNoAttrOfWorkUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEnumByChannelTypeEEnum, ActionTypeEnumByChannelType.class, "ActionTypeEnumByChannelType");
		addEEnumLiteral(actionTypeEnumByChannelTypeEEnum, ActionTypeEnumByChannelType.REQUEST_RESPOND);
		addEEnumLiteral(actionTypeEnumByChannelTypeEEnum, ActionTypeEnumByChannelType.REQUEST);
		addEEnumLiteral(actionTypeEnumByChannelTypeEEnum, ActionTypeEnumByChannelType.RESPOND);

		initEEnum(actionTypeEnumByExchangeInfoEEnum, ActionTypeEnumByExchangeInfo.class, "ActionTypeEnumByExchangeInfo");
		addEEnumLiteral(actionTypeEnumByExchangeInfoEEnum, ActionTypeEnumByExchangeInfo.REQUEST);
		addEEnumLiteral(actionTypeEnumByExchangeInfoEEnum, ActionTypeEnumByExchangeInfo.RESPOND);
		addEEnumLiteral(actionTypeEnumByExchangeInfoEEnum, ActionTypeEnumByExchangeInfo.NOTIFY);

		initEEnum(usageTypeEnumByChannelTypeEEnum, UsageTypeEnumByChannelType.class, "UsageTypeEnumByChannelType");
		addEEnumLiteral(usageTypeEnumByChannelTypeEEnum, UsageTypeEnumByChannelType.DISTINCT);
		addEEnumLiteral(usageTypeEnumByChannelTypeEEnum, UsageTypeEnumByChannelType.ONCE);
		addEEnumLiteral(usageTypeEnumByChannelTypeEEnum, UsageTypeEnumByChannelType.SHARED);

		initEEnum(whenTypeEnumByRecordInfoEEnum, WhenTypeEnumByRecordInfo.class, "WhenTypeEnumByRecordInfo");
		addEEnumLiteral(whenTypeEnumByRecordInfoEEnum, WhenTypeEnumByRecordInfo.BEFORE);
		addEEnumLiteral(whenTypeEnumByRecordInfoEEnum, WhenTypeEnumByRecordInfo.AFTER);
		addEEnumLiteral(whenTypeEnumByRecordInfoEEnum, WhenTypeEnumByRecordInfo.TIMEOUT);

		initEEnum(keyTypeEnumByIdentifyEEnum, KeyTypeEnumByIdentify.class, "KeyTypeEnumByIdentify");
		addEEnumLiteral(keyTypeEnumByIdentifyEEnum, KeyTypeEnumByIdentify.PRIMARY);
		addEEnumLiteral(keyTypeEnumByIdentifyEEnum, KeyTypeEnumByIdentify.ALTERNATE);
		addEEnumLiteral(keyTypeEnumByIdentifyEEnum, KeyTypeEnumByIdentify.ASSOCIATION);
		addEEnumLiteral(keyTypeEnumByIdentifyEEnum, KeyTypeEnumByIdentify.DERIVED);

		initEEnum(choreographyStateEEnum, ChoreographyState.class, "ChoreographyState");
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.UNSUCCESSFULLY_COMPLETED);
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.CLOSED);
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.SUCCESSFULLY_COMPLETED);
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.ENABLED);
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.ACTIVED);
		addEEnumLiteral(choreographyStateEEnum, ChoreographyState.DISABLED);

		initEEnum(activityStateEnumByActivityEEnum, ActivityStateEnumByActivity.class, "ActivityStateEnumByActivity");
		addEEnumLiteral(activityStateEnumByActivityEEnum, ActivityStateEnumByActivity.ACTIVED);
		addEEnumLiteral(activityStateEnumByActivityEEnum, ActivityStateEnumByActivity.EXCEPTIONED);
		addEEnumLiteral(activityStateEnumByActivityEEnum, ActivityStateEnumByActivity.SUCCESSED);

		// Create resource
		createResource(eNS_URI);
	}

} //CDLPackageImpl
