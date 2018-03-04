/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrchestraPackageImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.Assign;
import edu.xjtu.cdl2bpel.orchestra.AsynCallBack;
import edu.xjtu.cdl2bpel.orchestra.AtomicUnit;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.CaseException;
import edu.xjtu.cdl2bpel.orchestra.ChannelType;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.Communication;
import edu.xjtu.cdl2bpel.orchestra.CompensateHandler;
import edu.xjtu.cdl2bpel.orchestra.Compensation;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.Copy;
import edu.xjtu.cdl2bpel.orchestra.Correlation;
import edu.xjtu.cdl2bpel.orchestra.CorrelationSet;
import edu.xjtu.cdl2bpel.orchestra.Delay;
import edu.xjtu.cdl2bpel.orchestra.EventHandler;
import edu.xjtu.cdl2bpel.orchestra.FaultBranches;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.Identity;
import edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum;
import edu.xjtu.cdl2bpel.orchestra.InfoTypeOfOrchestra;
import edu.xjtu.cdl2bpel.orchestra.InformationType;
import edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.Namespace;
import edu.xjtu.cdl2bpel.orchestra.NoAction;
import edu.xjtu.cdl2bpel.orchestra.OnAlarm;
import edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler;
import edu.xjtu.cdl2bpel.orchestra.Operation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Parallel;
import edu.xjtu.cdl2bpel.orchestra.Part;
import edu.xjtu.cdl2bpel.orchestra.Perform;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra.Sequence;
import edu.xjtu.cdl2bpel.orchestra.SynReply;
import edu.xjtu.cdl2bpel.orchestra.TokenLocator;
import edu.xjtu.cdl2bpel.orchestra.TokenOfProperty;
import edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction;
import edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel;
import edu.xjtu.cdl2bpel.orchestra.Variable;
import edu.xjtu.cdl2bpel.orchestra.VariableBinding;
import edu.xjtu.cdl2bpel.orchestra.When;
import edu.xjtu.cdl2bpel.orchestra.While;

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
public class OrchestraPackageImpl extends EPackageImpl implements OrchestraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpOrchestraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpElementEClass = null;

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
	private EClass compensateHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compensationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

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
	private EClass partEClass = null;

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
	private EClass caseExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synReplyEClass = null;

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
	private EClass globalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceOfGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpOrderingStruturalActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unobservableBySilenActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableBindingEClass = null;

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
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

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
	private EClass tokenLocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoTypeOfOrchestraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenOfPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationTypeZlpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultBranchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynCallBackEClass = null;

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
	private EClass sendEndEClass = null;

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
	private EClass onMessageByEventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeWithNoAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageEnumByChannelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEnumByInteractionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityTypeEnumEEnum = null;

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
	 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrchestraPackageImpl() {
		super(eNS_URI, OrchestraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrchestraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrchestraPackage init() {
		if (isInited) return (OrchestraPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestraPackage.eNS_URI);

		// Obtain or create and register package
		OrchestraPackageImpl theOrchestraPackage = (OrchestraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrchestraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrchestraPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOrchestraPackage.createPackageContents();

		// Initialize created meta-data
		theOrchestraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrchestraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrchestraPackage.eNS_URI, theOrchestraPackage);
		return theOrchestraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPActivity() {
		return bpActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPActivity_Correlationset() {
		return (EReference)bpActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPActivity_Additional() {
		return (EAttribute)bpActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopy() {
		return copyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopy_TargetVariable() {
		return (EReference)copyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopy_TargetPart() {
		return (EAttribute)copyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopy_SourceExpression() {
		return (EAttribute)copyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopy_SourceVariable() {
		return (EReference)copyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopy_SourcePart() {
		return (EAttribute)copyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicUnit() {
		return atomicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPOrchestra() {
		return bpOrchestraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_CompletionExpression() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrchestra_Variables() {
		return (EReference)bpOrchestraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrchestra_EnclosedBPOrchestra() {
		return (EReference)bpOrchestraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrchestra_ExceptionHandlers() {
		return (EReference)bpOrchestraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrchestra_CompensateHandlers() {
		return (EReference)bpOrchestraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_Root() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_HasCompletionExpression() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_Participants() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrchestra_EnclosingBPOrchestras() {
		return (EReference)bpOrchestraEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_Coordinated() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPOrchestra_Isolate() {
		return (EAttribute)bpOrchestraEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPElement() {
		return bpElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPElement_Name() {
		return (EAttribute)bpElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPElement_Description() {
		return (EAttribute)bpElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPElement_Addition() {
		return (EAttribute)bpElementEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getChannelType_ChannelType() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_InterfaceType() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Usage() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_Identities() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(3);
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
	public EClass getCompensateHandler() {
		return compensateHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompensateHandler_Activities() {
		return (EReference)compensateHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditional() {
		return conditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditional_Expression() {
		return (EAttribute)conditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultHandler() {
		return faultHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultHandler_Activities() {
		return (EReference)faultHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompensation() {
		return compensationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompensation_CompletionHandler() {
		return (EReference)compensationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensation_InstanceId() {
		return (EAttribute)compensationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_ChannelType() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Variable() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_VariablePart() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Message() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Correlation() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_FaultName() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Parts() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Classification() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_InformationType() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Messages() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
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
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_InformationType() {
		return (EReference)partEClass.getEStructuralFeatures().get(0);
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
	public EReference getPerform_BpOrchestra() {
		return (EReference)performEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_InstanceId() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerform_Isolated() {
		return (EAttribute)performEClass.getEStructuralFeatures().get(2);
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
	public EReference getPerform_VariableBindings() {
		return (EReference)performEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseException() {
		return caseExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaseException_ExceptionValue() {
		return (EAttribute)caseExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveEnd() {
		return receiveEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveEnd_IsCreatedByPassedChannel() {
		return (EAttribute)receiveEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynReply() {
		return synReplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynReply_IsCreatedByPassedChannel() {
		return (EAttribute)synReplyEClass.getEStructuralFeatures().get(0);
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
	public EClass getGlobalArchitecture() {
		return globalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalArchitecture_Stateless() {
		return (EAttribute)globalArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalArchitecture_Namespaces() {
		return (EReference)globalArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalArchitecture_Interfaces() {
		return (EReference)globalArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalArchitecture_InformationTypes() {
		return (EReference)globalArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalArchitecture_BpOrchestras() {
		return (EReference)globalArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceOfGroup() {
		return interfaceOfGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceOfGroup_Operations() {
		return (EReference)interfaceOfGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPOrderingStruturalActivity() {
		return bpOrderingStruturalActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrderingStruturalActivity_ActivityTypes() {
		return (EReference)bpOrderingStruturalActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnAlarm() {
		return onAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnAlarm_TimeToComplete() {
		return (EAttribute)onAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnAlarm_TimeoutActivityTypes() {
		return (EReference)onAlarmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnobservableBySilenAction() {
		return unobservableBySilenActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableBinding() {
		return variableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_ParentVariable() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_BoundVariable() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getVariable_Mutable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Free() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Silent() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InformationType() {
		return (EReference)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_IsMatched() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_MatchedExpression() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_BreakOutExpression() {
		return (EAttribute)whileEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInformationType_Type() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationType_Element() {
		return (EAttribute)informationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationType_TokenLocators() {
		return (EReference)informationTypeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTokenLocator_Query() {
		return (EAttribute)tokenLocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenLocator_Part() {
		return (EAttribute)tokenLocatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenLocator_InformationType() {
		return (EReference)tokenLocatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenLocator_Token() {
		return (EReference)tokenLocatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoTypeOfOrchestra() {
		return infoTypeOfOrchestraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenOfProperty() {
		return tokenOfPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenOfProperty_InformationType() {
		return (EReference)tokenOfPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTokenOfProperty_Values() {
		return (EAttribute)tokenOfPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationTypeZlp() {
		return informationTypeZlpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationTypeZlp_Type() {
		return (EAttribute)informationTypeZlpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationTypeZlp_Element() {
		return (EAttribute)informationTypeZlpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationTypeZlp_TokenLocators() {
		return (EReference)informationTypeZlpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaultBranches() {
		return faultBranchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultBranches_FaultVariable() {
		return (EAttribute)faultBranchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaultBranches_Activities() {
		return (EReference)faultBranchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaultBranches_FaultType() {
		return (EAttribute)faultBranchesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_OnAlarms() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventHandler_OnMessage() {
		return (EReference)eventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelation() {
		return correlationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Initiate() {
		return (EAttribute)correlationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelation_Set() {
		return (EReference)correlationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationSet() {
		return correlationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelationSet_Properties() {
		return (EAttribute)correlationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationSet_Token() {
		return (EReference)correlationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynCallBack() {
		return asynCallBackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynCallBack_IsCreatedByPassedChannel() {
		return (EAttribute)asynCallBackEClass.getEStructuralFeatures().get(0);
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
	public EReference getAssign_Copies() {
		return (EReference)assignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendEnd() {
		return sendEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendEnd_IsCreatedByPassedChannel() {
		return (EAttribute)sendEndEClass.getEStructuralFeatures().get(0);
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
	public EClass getOnMessageByEventHandler() {
		return onMessageByEventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMessageByEventHandler_PartnerLink() {
		return (EAttribute)onMessageByEventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMessageByEventHandler_PortType() {
		return (EAttribute)onMessageByEventHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMessageByEventHandler_Operation() {
		return (EAttribute)onMessageByEventHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnMessageByEventHandler_Variable() {
		return (EAttribute)onMessageByEventHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeWithNoAttr() {
		return scopeWithNoAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelay() {
		return delayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_ForExpression() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelay_UntilExpression() {
		return (EAttribute)delayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageEnumByChannel() {
		return usageEnumByChannelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageTypeEnumByInteraction() {
		return messageTypeEnumByInteractionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentityTypeEnum() {
		return identityTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestraFactory getOrchestraFactory() {
		return (OrchestraFactory)getEFactoryInstance();
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
		bpActivityEClass = createEClass(BP_ACTIVITY);
		createEReference(bpActivityEClass, BP_ACTIVITY__CORRELATIONSET);
		createEAttribute(bpActivityEClass, BP_ACTIVITY__ADDITIONAL);

		copyEClass = createEClass(COPY);
		createEReference(copyEClass, COPY__TARGET_VARIABLE);
		createEAttribute(copyEClass, COPY__TARGET_PART);
		createEAttribute(copyEClass, COPY__SOURCE_EXPRESSION);
		createEReference(copyEClass, COPY__SOURCE_VARIABLE);
		createEAttribute(copyEClass, COPY__SOURCE_PART);

		atomicUnitEClass = createEClass(ATOMIC_UNIT);

		bpOrchestraEClass = createEClass(BP_ORCHESTRA);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__COMPLETION_EXPRESSION);
		createEReference(bpOrchestraEClass, BP_ORCHESTRA__VARIABLES);
		createEReference(bpOrchestraEClass, BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA);
		createEReference(bpOrchestraEClass, BP_ORCHESTRA__EXCEPTION_HANDLERS);
		createEReference(bpOrchestraEClass, BP_ORCHESTRA__COMPENSATE_HANDLERS);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__ROOT);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__PARTICIPANTS);
		createEReference(bpOrchestraEClass, BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__COORDINATED);
		createEAttribute(bpOrchestraEClass, BP_ORCHESTRA__ISOLATE);

		bpElementEClass = createEClass(BP_ELEMENT);
		createEAttribute(bpElementEClass, BP_ELEMENT__NAME);
		createEAttribute(bpElementEClass, BP_ELEMENT__DESCRIPTION);
		createEAttribute(bpElementEClass, BP_ELEMENT__ADDITION);

		channelTypeEClass = createEClass(CHANNEL_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__CHANNEL_TYPE);
		createEReference(channelTypeEClass, CHANNEL_TYPE__INTERFACE_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__USAGE);
		createEReference(channelTypeEClass, CHANNEL_TYPE__IDENTITIES);

		choiceEClass = createEClass(CHOICE);

		compensateHandlerEClass = createEClass(COMPENSATE_HANDLER);
		createEReference(compensateHandlerEClass, COMPENSATE_HANDLER__ACTIVITIES);

		conditionalEClass = createEClass(CONDITIONAL);
		createEAttribute(conditionalEClass, CONDITIONAL__EXPRESSION);

		faultHandlerEClass = createEClass(FAULT_HANDLER);
		createEReference(faultHandlerEClass, FAULT_HANDLER__ACTIVITIES);

		compensationEClass = createEClass(COMPENSATION);
		createEReference(compensationEClass, COMPENSATION__COMPLETION_HANDLER);
		createEAttribute(compensationEClass, COMPENSATION__INSTANCE_ID);

		communicationEClass = createEClass(COMMUNICATION);
		createEReference(communicationEClass, COMMUNICATION__CHANNEL_TYPE);
		createEReference(communicationEClass, COMMUNICATION__VARIABLE);
		createEAttribute(communicationEClass, COMMUNICATION__VARIABLE_PART);
		createEReference(communicationEClass, COMMUNICATION__MESSAGE);
		createEReference(communicationEClass, COMMUNICATION__CORRELATION);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__FAULT_NAME);
		createEReference(messageEClass, MESSAGE__PARTS);
		createEAttribute(messageEClass, MESSAGE__CLASSIFICATION);
		createEReference(messageEClass, MESSAGE__INFORMATION_TYPE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__MESSAGES);

		parallelEClass = createEClass(PARALLEL);

		partEClass = createEClass(PART);
		createEReference(partEClass, PART__INFORMATION_TYPE);

		performEClass = createEClass(PERFORM);
		createEReference(performEClass, PERFORM__BP_ORCHESTRA);
		createEAttribute(performEClass, PERFORM__INSTANCE_ID);
		createEAttribute(performEClass, PERFORM__ISOLATED);
		createEAttribute(performEClass, PERFORM__WAIT_FOR_COMPLETION);
		createEReference(performEClass, PERFORM__VARIABLE_BINDINGS);

		caseExceptionEClass = createEClass(CASE_EXCEPTION);
		createEAttribute(caseExceptionEClass, CASE_EXCEPTION__EXCEPTION_VALUE);

		receiveEndEClass = createEClass(RECEIVE_END);
		createEAttribute(receiveEndEClass, RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL);

		synReplyEClass = createEClass(SYN_REPLY);
		createEAttribute(synReplyEClass, SYN_REPLY__IS_CREATED_BY_PASSED_CHANNEL);

		sequenceEClass = createEClass(SEQUENCE);

		globalArchitectureEClass = createEClass(GLOBAL_ARCHITECTURE);
		createEAttribute(globalArchitectureEClass, GLOBAL_ARCHITECTURE__STATELESS);
		createEReference(globalArchitectureEClass, GLOBAL_ARCHITECTURE__NAMESPACES);
		createEReference(globalArchitectureEClass, GLOBAL_ARCHITECTURE__INTERFACES);
		createEReference(globalArchitectureEClass, GLOBAL_ARCHITECTURE__INFORMATION_TYPES);
		createEReference(globalArchitectureEClass, GLOBAL_ARCHITECTURE__BP_ORCHESTRAS);

		interfaceOfGroupEClass = createEClass(INTERFACE_OF_GROUP);
		createEReference(interfaceOfGroupEClass, INTERFACE_OF_GROUP__OPERATIONS);

		bpOrderingStruturalActivityEClass = createEClass(BP_ORDERING_STRUTURAL_ACTIVITY);
		createEReference(bpOrderingStruturalActivityEClass, BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES);

		onAlarmEClass = createEClass(ON_ALARM);
		createEAttribute(onAlarmEClass, ON_ALARM__TIME_TO_COMPLETE);
		createEReference(onAlarmEClass, ON_ALARM__TIMEOUT_ACTIVITY_TYPES);

		unobservableBySilenActionEClass = createEClass(UNOBSERVABLE_BY_SILEN_ACTION);

		variableBindingEClass = createEClass(VARIABLE_BINDING);
		createEReference(variableBindingEClass, VARIABLE_BINDING__PARENT_VARIABLE);
		createEReference(variableBindingEClass, VARIABLE_BINDING__BOUND_VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__MUTABLE);
		createEAttribute(variableEClass, VARIABLE__FREE);
		createEAttribute(variableEClass, VARIABLE__SILENT);
		createEReference(variableEClass, VARIABLE__INFORMATION_TYPE);

		whenEClass = createEClass(WHEN);
		createEAttribute(whenEClass, WHEN__IS_MATCHED);
		createEAttribute(whenEClass, WHEN__MATCHED_EXPRESSION);

		whileEClass = createEClass(WHILE);
		createEAttribute(whileEClass, WHILE__BREAK_OUT_EXPRESSION);

		namespaceEClass = createEClass(NAMESPACE);
		createEAttribute(namespaceEClass, NAMESPACE__PREFIX);
		createEAttribute(namespaceEClass, NAMESPACE__URI);
		createEAttribute(namespaceEClass, NAMESPACE__SCHEMA_LOCATION);

		identityEClass = createEClass(IDENTITY);
		createEAttribute(identityEClass, IDENTITY__TYPE);
		createEReference(identityEClass, IDENTITY__TOKENS);

		informationTypeEClass = createEClass(INFORMATION_TYPE);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__TYPE);
		createEAttribute(informationTypeEClass, INFORMATION_TYPE__ELEMENT);
		createEReference(informationTypeEClass, INFORMATION_TYPE__TOKEN_LOCATORS);

		tokenLocatorEClass = createEClass(TOKEN_LOCATOR);
		createEAttribute(tokenLocatorEClass, TOKEN_LOCATOR__QUERY);
		createEAttribute(tokenLocatorEClass, TOKEN_LOCATOR__PART);
		createEReference(tokenLocatorEClass, TOKEN_LOCATOR__INFORMATION_TYPE);
		createEReference(tokenLocatorEClass, TOKEN_LOCATOR__TOKEN);

		infoTypeOfOrchestraEClass = createEClass(INFO_TYPE_OF_ORCHESTRA);

		tokenOfPropertyEClass = createEClass(TOKEN_OF_PROPERTY);
		createEReference(tokenOfPropertyEClass, TOKEN_OF_PROPERTY__INFORMATION_TYPE);
		createEAttribute(tokenOfPropertyEClass, TOKEN_OF_PROPERTY__VALUES);

		informationTypeZlpEClass = createEClass(INFORMATION_TYPE_ZLP);
		createEAttribute(informationTypeZlpEClass, INFORMATION_TYPE_ZLP__TYPE);
		createEAttribute(informationTypeZlpEClass, INFORMATION_TYPE_ZLP__ELEMENT);
		createEReference(informationTypeZlpEClass, INFORMATION_TYPE_ZLP__TOKEN_LOCATORS);

		faultBranchesEClass = createEClass(FAULT_BRANCHES);
		createEAttribute(faultBranchesEClass, FAULT_BRANCHES__FAULT_VARIABLE);
		createEReference(faultBranchesEClass, FAULT_BRANCHES__ACTIVITIES);
		createEAttribute(faultBranchesEClass, FAULT_BRANCHES__FAULT_TYPE);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__ON_ALARMS);
		createEReference(eventHandlerEClass, EVENT_HANDLER__ON_MESSAGE);

		correlationEClass = createEClass(CORRELATION);
		createEAttribute(correlationEClass, CORRELATION__INITIATE);
		createEReference(correlationEClass, CORRELATION__SET);

		correlationSetEClass = createEClass(CORRELATION_SET);
		createEAttribute(correlationSetEClass, CORRELATION_SET__PROPERTIES);
		createEReference(correlationSetEClass, CORRELATION_SET__TOKEN);

		asynCallBackEClass = createEClass(ASYN_CALL_BACK);
		createEAttribute(asynCallBackEClass, ASYN_CALL_BACK__IS_CREATED_BY_PASSED_CHANNEL);

		assignEClass = createEClass(ASSIGN);
		createEReference(assignEClass, ASSIGN__COPIES);

		sendEndEClass = createEClass(SEND_END);
		createEAttribute(sendEndEClass, SEND_END__IS_CREATED_BY_PASSED_CHANNEL);

		noActionEClass = createEClass(NO_ACTION);

		onMessageByEventHandlerEClass = createEClass(ON_MESSAGE_BY_EVENT_HANDLER);
		createEAttribute(onMessageByEventHandlerEClass, ON_MESSAGE_BY_EVENT_HANDLER__PARTNER_LINK);
		createEAttribute(onMessageByEventHandlerEClass, ON_MESSAGE_BY_EVENT_HANDLER__PORT_TYPE);
		createEAttribute(onMessageByEventHandlerEClass, ON_MESSAGE_BY_EVENT_HANDLER__OPERATION);
		createEAttribute(onMessageByEventHandlerEClass, ON_MESSAGE_BY_EVENT_HANDLER__VARIABLE);

		scopeWithNoAttrEClass = createEClass(SCOPE_WITH_NO_ATTR);

		delayEClass = createEClass(DELAY);
		createEAttribute(delayEClass, DELAY__FOR_EXPRESSION);
		createEAttribute(delayEClass, DELAY__UNTIL_EXPRESSION);

		// Create enums
		usageEnumByChannelEEnum = createEEnum(USAGE_ENUM_BY_CHANNEL);
		messageTypeEnumByInteractionEEnum = createEEnum(MESSAGE_TYPE_ENUM_BY_INTERACTION);
		identityTypeEnumEEnum = createEEnum(IDENTITY_TYPE_ENUM);
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
		bpActivityEClass.getESuperTypes().add(this.getBPElement());
		copyEClass.getESuperTypes().add(this.getBPElement());
		atomicUnitEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		bpOrchestraEClass.getESuperTypes().add(this.getSequence());
		channelTypeEClass.getESuperTypes().add(this.getVariable());
		choiceEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		compensateHandlerEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		conditionalEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		faultHandlerEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		compensationEClass.getESuperTypes().add(this.getBPActivity());
		communicationEClass.getESuperTypes().add(this.getBPActivity());
		messageEClass.getESuperTypes().add(this.getBPElement());
		operationEClass.getESuperTypes().add(this.getBPElement());
		parallelEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		partEClass.getESuperTypes().add(this.getBPElement());
		performEClass.getESuperTypes().add(this.getBPActivity());
		caseExceptionEClass.getESuperTypes().add(this.getBPActivity());
		receiveEndEClass.getESuperTypes().add(this.getCommunication());
		synReplyEClass.getESuperTypes().add(this.getCommunication());
		sequenceEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		globalArchitectureEClass.getESuperTypes().add(this.getBPElement());
		interfaceOfGroupEClass.getESuperTypes().add(this.getBPElement());
		bpOrderingStruturalActivityEClass.getESuperTypes().add(this.getBPActivity());
		onAlarmEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		unobservableBySilenActionEClass.getESuperTypes().add(this.getBPActivity());
		variableBindingEClass.getESuperTypes().add(this.getBPElement());
		variableEClass.getESuperTypes().add(this.getBPElement());
		whenEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		whileEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		namespaceEClass.getESuperTypes().add(this.getBPElement());
		identityEClass.getESuperTypes().add(this.getBPElement());
		informationTypeEClass.getESuperTypes().add(this.getInfoTypeOfOrchestra());
		tokenLocatorEClass.getESuperTypes().add(this.getBPElement());
		infoTypeOfOrchestraEClass.getESuperTypes().add(this.getBPElement());
		tokenOfPropertyEClass.getESuperTypes().add(this.getBPElement());
		informationTypeZlpEClass.getESuperTypes().add(this.getBPElement());
		faultBranchesEClass.getESuperTypes().add(this.getBPActivity());
		eventHandlerEClass.getESuperTypes().add(this.getBPActivity());
		correlationEClass.getESuperTypes().add(this.getBPElement());
		correlationSetEClass.getESuperTypes().add(this.getBPElement());
		asynCallBackEClass.getESuperTypes().add(this.getCommunication());
		assignEClass.getESuperTypes().add(this.getBPActivity());
		sendEndEClass.getESuperTypes().add(this.getCommunication());
		noActionEClass.getESuperTypes().add(this.getBPActivity());
		onMessageByEventHandlerEClass.getESuperTypes().add(this.getBPActivity());
		scopeWithNoAttrEClass.getESuperTypes().add(this.getBPOrderingStruturalActivity());
		delayEClass.getESuperTypes().add(this.getBPElement());

		// Initialize classes and features; add operations and parameters
		initEClass(bpActivityEClass, BPActivity.class, "BPActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPActivity_Correlationset(), this.getCorrelationSet(), null, "correlationset", null, 0, 1, BPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPActivity_Additional(), ecorePackage.getEString(), "additional", null, 0, 1, BPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyEClass, Copy.class, "Copy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopy_TargetVariable(), this.getVariable(), null, "targetVariable", null, 1, 1, Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopy_TargetPart(), ecorePackage.getEString(), "targetPart", null, 0, 1, Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopy_SourceExpression(), ecorePackage.getEString(), "sourceExpression", null, 0, 1, Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopy_SourceVariable(), this.getVariable(), null, "sourceVariable", null, 0, 1, Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopy_SourcePart(), ecorePackage.getEString(), "sourcePart", null, 0, 1, Copy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicUnitEClass, AtomicUnit.class, "AtomicUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpOrchestraEClass, BPOrchestra.class, "BPOrchestra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPOrchestra_CompletionExpression(), ecorePackage.getEString(), "completionExpression", null, 0, 1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPOrchestra_Variables(), this.getVariable(), null, "variables", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPOrchestra_EnclosedBPOrchestra(), this.getBPOrchestra(), null, "enclosedBPOrchestra", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPOrchestra_ExceptionHandlers(), this.getFaultHandler(), null, "exceptionHandlers", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPOrchestra_CompensateHandlers(), this.getCompensateHandler(), null, "compensateHandlers", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPOrchestra_Root(), ecorePackage.getEBooleanObject(), "root", "FALSE", 0, 1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPOrchestra_HasCompletionExpression(), ecorePackage.getEBooleanObject(), "hasCompletionExpression", "FALSE", 0, 1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPOrchestra_Participants(), ecorePackage.getEString(), "participants", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPOrchestra_EnclosingBPOrchestras(), this.getBPOrchestra(), null, "enclosingBPOrchestras", null, 0, -1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPOrchestra_Coordinated(), ecorePackage.getEBooleanObject(), "coordinated", null, 0, 1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPOrchestra_Isolate(), ecorePackage.getEBooleanObject(), "isolate", null, 0, 1, BPOrchestra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpElementEClass, BPElement.class, "BPElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, BPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, BPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBPElement_Addition(), ecorePackage.getEString(), "addition", null, 0, 1, BPElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelTypeEClass, ChannelType.class, "ChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelType_ChannelType(), ecorePackage.getEString(), "channelType", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_InterfaceType(), this.getInterfaceOfGroup(), null, "interfaceType", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Usage(), this.getUsageEnumByChannel(), "usage", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_Identities(), this.getIdentity(), null, "identities", null, 0, -1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compensateHandlerEClass, CompensateHandler.class, "CompensateHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompensateHandler_Activities(), this.getBPActivity(), null, "activities", null, 0, -1, CompensateHandler.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalEClass, Conditional.class, "Conditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditional_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultHandlerEClass, FaultHandler.class, "FaultHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFaultHandler_Activities(), this.getFaultBranches(), null, "activities", null, 0, -1, FaultHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compensationEClass, Compensation.class, "Compensation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompensation_CompletionHandler(), this.getCompensateHandler(), null, "completionHandler", null, 1, 1, Compensation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompensation_InstanceId(), ecorePackage.getEString(), "instanceId", null, 0, 1, Compensation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEClass, Communication.class, "Communication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunication_ChannelType(), this.getChannelType(), null, "channelType", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Variable(), this.getVariable(), null, "variable", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_VariablePart(), ecorePackage.getEString(), "variablePart", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Message(), this.getMessage(), null, "message", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Correlation(), this.getCorrelation(), null, "correlation", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_FaultName(), ecorePackage.getEString(), "faultName", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Parts(), this.getPart(), null, "parts", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Classification(), this.getMessageTypeEnumByInteraction(), "classification", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_InformationType(), this.getInformationType(), null, "informationType", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Messages(), this.getMessage(), null, "messages", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPart_InformationType(), this.getInformationType(), null, "informationType", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performEClass, Perform.class, "Perform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerform_BpOrchestra(), this.getBPOrchestra(), null, "bpOrchestra", null, 1, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_InstanceId(), ecorePackage.getEString(), "instanceId", null, 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_Isolated(), ecorePackage.getEBooleanObject(), "isolated", "FALSE", 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerform_WaitForCompletion(), ecorePackage.getEBooleanObject(), "waitForCompletion", "TRUE", 0, 1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerform_VariableBindings(), this.getVariableBinding(), null, "variableBindings", null, 0, -1, Perform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseExceptionEClass, CaseException.class, "CaseException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaseException_ExceptionValue(), ecorePackage.getEString(), "exceptionValue", null, 1, 1, CaseException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiveEndEClass, ReceiveEnd.class, "ReceiveEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiveEnd_IsCreatedByPassedChannel(), ecorePackage.getEBooleanObject(), "isCreatedByPassedChannel", "FALSE", 0, 1, ReceiveEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synReplyEClass, SynReply.class, "SynReply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynReply_IsCreatedByPassedChannel(), ecorePackage.getEBooleanObject(), "isCreatedByPassedChannel", "FALSE", 0, 1, SynReply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalArchitectureEClass, GlobalArchitecture.class, "GlobalArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalArchitecture_Stateless(), ecorePackage.getEBooleanObject(), "stateless", "FALSE", 0, 1, GlobalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalArchitecture_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, GlobalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalArchitecture_Interfaces(), this.getInterfaceOfGroup(), null, "interfaces", null, 1, -1, GlobalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalArchitecture_InformationTypes(), this.getInformationType(), null, "informationTypes", null, 0, -1, GlobalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalArchitecture_BpOrchestras(), this.getBPOrchestra(), null, "bpOrchestras", null, 0, -1, GlobalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceOfGroupEClass, InterfaceOfGroup.class, "InterfaceOfGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceOfGroup_Operations(), this.getOperation(), null, "operations", null, 0, -1, InterfaceOfGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpOrderingStruturalActivityEClass, BPOrderingStruturalActivity.class, "BPOrderingStruturalActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPOrderingStruturalActivity_ActivityTypes(), this.getBPActivity(), null, "activityTypes", null, 1, -1, BPOrderingStruturalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onAlarmEClass, OnAlarm.class, "OnAlarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnAlarm_TimeToComplete(), ecorePackage.getEString(), "timeToComplete", null, 0, 1, OnAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnAlarm_TimeoutActivityTypes(), this.getBPActivity(), null, "timeoutActivityTypes", null, 0, -1, OnAlarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unobservableBySilenActionEClass, UnobservableBySilenAction.class, "UnobservableBySilenAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableBindingEClass, VariableBinding.class, "VariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableBinding_ParentVariable(), this.getVariable(), null, "parentVariable", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableBinding_BoundVariable(), this.getVariable(), null, "boundVariable", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Mutable(), ecorePackage.getEBooleanObject(), "mutable", "TRUE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Free(), ecorePackage.getEBooleanObject(), "free", "FALSE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Silent(), ecorePackage.getEBooleanObject(), "silent", "FALSE", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_InformationType(), this.getInformationType(), null, "informationType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_IsMatched(), ecorePackage.getEBooleanObject(), "isMatched", "FALSE", 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhen_MatchedExpression(), ecorePackage.getEString(), "matchedExpression", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhile_BreakOutExpression(), ecorePackage.getEString(), "breakOutExpression", null, 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespace_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamespace_SchemaLocation(), ecorePackage.getEString(), "schemaLocation", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityEClass, Identity.class, "Identity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentity_Type(), this.getIdentityTypeEnum(), "type", null, 0, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentity_Tokens(), this.getTokenOfProperty(), null, "tokens", null, 0, 1, Identity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTypeEClass, InformationType.class, "InformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationType_Type(), ecorePackage.getEString(), "type", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationType_Element(), ecorePackage.getEString(), "element", null, 0, 1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationType_TokenLocators(), this.getTokenLocator(), null, "tokenLocators", null, 0, -1, InformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenLocatorEClass, TokenLocator.class, "TokenLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTokenLocator_Query(), ecorePackage.getEString(), "query", null, 1, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenLocator_Part(), ecorePackage.getEString(), "part", null, 0, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenLocator_InformationType(), this.getInformationType(), null, "informationType", null, 0, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTokenLocator_Token(), this.getTokenOfProperty(), null, "token", null, 0, 1, TokenLocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoTypeOfOrchestraEClass, InfoTypeOfOrchestra.class, "InfoTypeOfOrchestra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tokenOfPropertyEClass, TokenOfProperty.class, "TokenOfProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenOfProperty_InformationType(), this.getInformationType(), null, "informationType", null, 0, 1, TokenOfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTokenOfProperty_Values(), ecorePackage.getEString(), "values", null, 0, -1, TokenOfProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationTypeZlpEClass, InformationTypeZlp.class, "InformationTypeZlp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationTypeZlp_Type(), ecorePackage.getEString(), "type", null, 0, 1, InformationTypeZlp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationTypeZlp_Element(), ecorePackage.getEString(), "element", null, 0, 1, InformationTypeZlp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationTypeZlp_TokenLocators(), this.getTokenLocator(), null, "tokenLocators", null, 0, -1, InformationTypeZlp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faultBranchesEClass, FaultBranches.class, "FaultBranches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaultBranches_FaultVariable(), ecorePackage.getEString(), "faultVariable", null, 0, 1, FaultBranches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaultBranches_Activities(), this.getBPActivity(), null, "activities", null, 0, 1, FaultBranches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaultBranches_FaultType(), ecorePackage.getEString(), "faultType", null, 0, 1, FaultBranches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_OnAlarms(), this.getOnAlarm(), null, "onAlarms", null, 0, -1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventHandler_OnMessage(), this.getOnMessageByEventHandler(), null, "onMessage", null, 0, -1, EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationEClass, Correlation.class, "Correlation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrelation_Initiate(), ecorePackage.getEString(), "initiate", null, 0, 1, Correlation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrelation_Set(), this.getCorrelationSet(), null, "set", null, 0, 1, Correlation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationSetEClass, CorrelationSet.class, "CorrelationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrelationSet_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, CorrelationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrelationSet_Token(), this.getTokenOfProperty(), null, "token", null, 0, 1, CorrelationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynCallBackEClass, AsynCallBack.class, "AsynCallBack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsynCallBack_IsCreatedByPassedChannel(), ecorePackage.getEBooleanObject(), "isCreatedByPassedChannel", "FALSE", 0, 1, AsynCallBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssign_Copies(), this.getCopy(), null, "copies", null, 0, -1, Assign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendEndEClass, SendEnd.class, "SendEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendEnd_IsCreatedByPassedChannel(), ecorePackage.getEBooleanObject(), "isCreatedByPassedChannel", "FALSE", 0, 1, SendEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noActionEClass, NoAction.class, "NoAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onMessageByEventHandlerEClass, OnMessageByEventHandler.class, "OnMessageByEventHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnMessageByEventHandler_PartnerLink(), ecorePackage.getEString(), "partnerLink", null, 0, 1, OnMessageByEventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnMessageByEventHandler_PortType(), ecorePackage.getEString(), "portType", null, 0, 1, OnMessageByEventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnMessageByEventHandler_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, OnMessageByEventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnMessageByEventHandler_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, OnMessageByEventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeWithNoAttrEClass, ScopeWithNoAttr.class, "ScopeWithNoAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayEClass, Delay.class, "Delay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelay_ForExpression(), ecorePackage.getEString(), "forExpression", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelay_UntilExpression(), ecorePackage.getEString(), "untilExpression", null, 0, 1, Delay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(usageEnumByChannelEEnum, UsageEnumByChannel.class, "UsageEnumByChannel");
		addEEnumLiteral(usageEnumByChannelEEnum, UsageEnumByChannel.DISTINCT);
		addEEnumLiteral(usageEnumByChannelEEnum, UsageEnumByChannel.ONCE);
		addEEnumLiteral(usageEnumByChannelEEnum, UsageEnumByChannel.SHARED);

		initEEnum(messageTypeEnumByInteractionEEnum, MessageTypeEnumByInteraction.class, "MessageTypeEnumByInteraction");
		addEEnumLiteral(messageTypeEnumByInteractionEEnum, MessageTypeEnumByInteraction.REQUEST);
		addEEnumLiteral(messageTypeEnumByInteractionEEnum, MessageTypeEnumByInteraction.RESPONSE);
		addEEnumLiteral(messageTypeEnumByInteractionEEnum, MessageTypeEnumByInteraction.NOTIFICATION);

		initEEnum(identityTypeEnumEEnum, IdentityTypeEnum.class, "IdentityTypeEnum");
		addEEnumLiteral(identityTypeEnumEEnum, IdentityTypeEnum.PRIMARY);
		addEEnumLiteral(identityTypeEnumEEnum, IdentityTypeEnum.ALTERNATE);
		addEEnumLiteral(identityTypeEnumEEnum, IdentityTypeEnum.ASSOCIATION);
		addEEnumLiteral(identityTypeEnumEEnum, IdentityTypeEnum.DERIVED);

		// Create resource
		createResource(eNS_URI);
	}

} //OrchestraPackageImpl
