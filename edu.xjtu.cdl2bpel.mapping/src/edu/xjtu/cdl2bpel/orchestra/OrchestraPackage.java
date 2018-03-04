/**
 * CDL2BPEL_XJTU
 *
 * $Id: OrchestraPackage.java,v 1.1 2011/02/21 06:24:10 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.orchestra.OrchestraFactory
 * @model kind="package"
 * @generated
 */
public interface OrchestraPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orchestra";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///lpw.cn/service/orchestra.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.xjtu.cdl2bpel.orchestra";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrchestraPackage eINSTANCE = edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl <em>BP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPElement()
	 * @generated
	 */
	int BP_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ELEMENT__ADDITION = 2;

	/**
	 * The number of structural features of the '<em>BP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl <em>BP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPActivity()
	 * @generated
	 */
	int BP_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY__CORRELATIONSET = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY__ADDITIONAL = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ACTIVITY_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_VARIABLE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TARGET_PART = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_EXPRESSION = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_VARIABLE = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__SOURCE_PART = BP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrderingStruturalActivityImpl <em>BP Ordering Strutural Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPOrderingStruturalActivityImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPOrderingStruturalActivity()
	 * @generated
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BP Ordering Strutural Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AtomicUnitImpl <em>Atomic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.AtomicUnitImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAtomicUnit()
	 * @generated
	 */
	int ATOMIC_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The number of structural features of the '<em>Atomic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.SequenceImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl <em>BP Orchestra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPOrchestra()
	 * @generated
	 */
	int BP_ORCHESTRA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__DESCRIPTION = SEQUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ADDITION = SEQUENCE__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__CORRELATIONSET = SEQUENCE__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ADDITIONAL = SEQUENCE__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ACTIVITY_TYPES = SEQUENCE__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Completion Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__COMPLETION_EXPRESSION = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__VARIABLES = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosed BP Orchestra</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA = SEQUENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exception Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__EXCEPTION_HANDLERS = SEQUENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Compensate Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__COMPENSATE_HANDLERS = SEQUENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ROOT = SEQUENCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Completion Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION = SEQUENCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__PARTICIPANTS = SEQUENCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Enclosing BP Orchestras</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS = SEQUENCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Coordinated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__COORDINATED = SEQUENCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA__ISOLATE = SEQUENCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>BP Orchestra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORCHESTRA_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.VariableImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MUTABLE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FREE = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Silent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SILENT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INFORMATION_TYPE = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DESCRIPTION = VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ADDITION = VARIABLE__ADDITION;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__MUTABLE = VARIABLE__MUTABLE;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__FREE = VARIABLE__FREE;

	/**
	 * The feature id for the '<em><b>Silent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__SILENT = VARIABLE__SILENT;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__INFORMATION_TYPE = VARIABLE__INFORMATION_TYPE;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CHANNEL_TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__INTERFACE_TYPE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__USAGE = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__IDENTITIES = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ChoiceImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensateHandlerImpl <em>Compensate Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CompensateHandlerImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCompensateHandler()
	 * @generated
	 */
	int COMPENSATE_HANDLER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER__ACTIVITIES = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compensate Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_HANDLER_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ConditionalImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__EXPRESSION = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultHandlerImpl <em>Fault Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.FaultHandlerImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getFaultHandler()
	 * @generated
	 */
	int FAULT_HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__ACTIVITIES = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fault Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl <em>Compensation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCompensation()
	 * @generated
	 */
	int COMPENSATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Completion Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__COMPLETION_HANDLER = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION__INSTANCE_ID = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compensation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CHANNEL_TYPE = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__VARIABLE = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__VARIABLE_PART = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__MESSAGE = BP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CORRELATION = BP_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FAULT_NAME = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARTS = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CLASSIFICATION = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INFORMATION_TYPE = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OperationImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MESSAGES = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ParallelImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.PartImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getPart()
	 * @generated
	 */
	int PART = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__INFORMATION_TYPE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Bp Orchestra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__BP_ORCHESTRA = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__INSTANCE_ID = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Isolated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ISOLATED = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__WAIT_FOR_COMPLETION = BP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variable Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__VARIABLE_BINDINGS = BP_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl <em>Case Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCaseException()
	 * @generated
	 */
	int CASE_EXCEPTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Exception Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION__EXCEPTION_VALUE = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXCEPTION_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl <em>Receive End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getReceiveEnd()
	 * @generated
	 */
	int RECEIVE_END = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__NAME = COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__DESCRIPTION = COMMUNICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__ADDITION = COMMUNICATION__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__CORRELATIONSET = COMMUNICATION__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__ADDITIONAL = COMMUNICATION__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__CHANNEL_TYPE = COMMUNICATION__CHANNEL_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__VARIABLE = COMMUNICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__VARIABLE_PART = COMMUNICATION__VARIABLE_PART;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__MESSAGE = COMMUNICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__CORRELATION = COMMUNICATION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Is Created By Passed Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Receive End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_END_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SynReplyImpl <em>Syn Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.SynReplyImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSynReply()
	 * @generated
	 */
	int SYN_REPLY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__NAME = COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__DESCRIPTION = COMMUNICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__ADDITION = COMMUNICATION__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__CORRELATIONSET = COMMUNICATION__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__ADDITIONAL = COMMUNICATION__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__CHANNEL_TYPE = COMMUNICATION__CHANNEL_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__VARIABLE = COMMUNICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__VARIABLE_PART = COMMUNICATION__VARIABLE_PART;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__MESSAGE = COMMUNICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__CORRELATION = COMMUNICATION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Is Created By Passed Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY__IS_CREATED_BY_PASSED_CHANNEL = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Syn Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYN_REPLY_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl <em>Global Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getGlobalArchitecture()
	 * @generated
	 */
	int GLOBAL_ARCHITECTURE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Stateless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__STATELESS = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__NAMESPACES = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__INTERFACES = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__INFORMATION_TYPES = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bp Orchestras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE__BP_ORCHESTRAS = BP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Global Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ARCHITECTURE_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InterfaceOfGroupImpl <em>Interface Of Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.InterfaceOfGroupImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInterfaceOfGroup()
	 * @generated
	 */
	int INTERFACE_OF_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_GROUP__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_GROUP__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_GROUP__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_GROUP__OPERATIONS = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Of Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_GROUP_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl <em>On Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOnAlarm()
	 * @generated
	 */
	int ON_ALARM = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Time To Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__TIME_TO_COMPLETE = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__TIMEOUT_ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.UnobservableBySilenActionImpl <em>Unobservable By Silen Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.UnobservableBySilenActionImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getUnobservableBySilenAction()
	 * @generated
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The number of structural features of the '<em>Unobservable By Silen Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOBSERVABLE_BY_SILEN_ACTION_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getVariableBinding()
	 * @generated
	 */
	int VARIABLE_BINDING = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Parent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__PARENT_VARIABLE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__BOUND_VARIABLE = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Is Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__IS_MATCHED = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matched Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__MATCHED_EXPRESSION = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.WhileImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The feature id for the '<em><b>Break Out Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BREAK_OUT_EXPRESSION = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.NamespaceImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SCHEMA_LOCATION = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.IdentityImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TYPE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TOKENS = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InfoTypeOfOrchestraImpl <em>Info Type Of Orchestra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.InfoTypeOfOrchestraImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInfoTypeOfOrchestra()
	 * @generated
	 */
	int INFO_TYPE_OF_ORCHESTRA = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_OF_ORCHESTRA__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_OF_ORCHESTRA__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_OF_ORCHESTRA__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The number of structural features of the '<em>Info Type Of Orchestra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_OF_ORCHESTRA_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeImpl <em>Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInformationType()
	 * @generated
	 */
	int INFORMATION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__NAME = INFO_TYPE_OF_ORCHESTRA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__DESCRIPTION = INFO_TYPE_OF_ORCHESTRA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__ADDITION = INFO_TYPE_OF_ORCHESTRA__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__TYPE = INFO_TYPE_OF_ORCHESTRA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__ELEMENT = INFO_TYPE_OF_ORCHESTRA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token Locators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__TOKEN_LOCATORS = INFO_TYPE_OF_ORCHESTRA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_FEATURE_COUNT = INFO_TYPE_OF_ORCHESTRA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.TokenLocatorImpl <em>Token Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.TokenLocatorImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getTokenLocator()
	 * @generated
	 */
	int TOKEN_LOCATOR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__QUERY = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__PART = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__INFORMATION_TYPE = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__TOKEN = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Token Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.TokenOfPropertyImpl <em>Token Of Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.TokenOfPropertyImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getTokenOfProperty()
	 * @generated
	 */
	int TOKEN_OF_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY__INFORMATION_TYPE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY__VALUES = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Token Of Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OF_PROPERTY_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl <em>Information Type Zlp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInformationTypeZlp()
	 * @generated
	 */
	int INFORMATION_TYPE_ZLP = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__TYPE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__ELEMENT = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Token Locators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP__TOKEN_LOCATORS = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Information Type Zlp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_ZLP_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl <em>Fault Branches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getFaultBranches()
	 * @generated
	 */
	int FAULT_BRANCHES = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__FAULT_VARIABLE = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__ACTIVITIES = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES__FAULT_TYPE = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fault Branches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_BRANCHES_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>On Alarms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ON_ALARMS = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ON_MESSAGE = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CorrelationImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INITIATE = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SET = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.CorrelationSetImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCorrelationSet()
	 * @generated
	 */
	int CORRELATION_SET = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__PROPERTIES = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__TOKEN = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AsynCallBackImpl <em>Asyn Call Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.AsynCallBackImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAsynCallBack()
	 * @generated
	 */
	int ASYN_CALL_BACK = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__NAME = COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__DESCRIPTION = COMMUNICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__ADDITION = COMMUNICATION__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__CORRELATIONSET = COMMUNICATION__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__ADDITIONAL = COMMUNICATION__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__CHANNEL_TYPE = COMMUNICATION__CHANNEL_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__VARIABLE = COMMUNICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__VARIABLE_PART = COMMUNICATION__VARIABLE_PART;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__MESSAGE = COMMUNICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__CORRELATION = COMMUNICATION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Is Created By Passed Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK__IS_CREATED_BY_PASSED_CHANNEL = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asyn Call Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYN_CALL_BACK_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.AssignImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COPIES = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SendEndImpl <em>Send End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.SendEndImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSendEnd()
	 * @generated
	 */
	int SEND_END = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__NAME = COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__DESCRIPTION = COMMUNICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__ADDITION = COMMUNICATION__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__CORRELATIONSET = COMMUNICATION__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__ADDITIONAL = COMMUNICATION__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__CHANNEL_TYPE = COMMUNICATION__CHANNEL_TYPE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__VARIABLE = COMMUNICATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__VARIABLE_PART = COMMUNICATION__VARIABLE_PART;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__MESSAGE = COMMUNICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__CORRELATION = COMMUNICATION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Is Created By Passed Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END__IS_CREATED_BY_PASSED_CHANNEL = COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Send End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_END_FEATURE_COUNT = COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.NoActionImpl <em>No Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.NoActionImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getNoAction()
	 * @generated
	 */
	int NO_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The number of structural features of the '<em>No Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OnMessageByEventHandlerImpl <em>On Message By Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OnMessageByEventHandlerImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOnMessageByEventHandler()
	 * @generated
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__NAME = BP_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__DESCRIPTION = BP_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__ADDITION = BP_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__CORRELATIONSET = BP_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__ADDITIONAL = BP_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__PARTNER_LINK = BP_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__PORT_TYPE = BP_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__OPERATION = BP_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER__VARIABLE = BP_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>On Message By Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_BY_EVENT_HANDLER_FEATURE_COUNT = BP_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ScopeWithNoAttrImpl <em>Scope With No Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.ScopeWithNoAttrImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getScopeWithNoAttr()
	 * @generated
	 */
	int SCOPE_WITH_NO_ATTR = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__NAME = BP_ORDERING_STRUTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__DESCRIPTION = BP_ORDERING_STRUTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__ADDITION = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Correlationset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__CORRELATIONSET = BP_ORDERING_STRUTURAL_ACTIVITY__CORRELATIONSET;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__ADDITIONAL = BP_ORDERING_STRUTURAL_ACTIVITY__ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR__ACTIVITY_TYPES = BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES;

	/**
	 * The number of structural features of the '<em>Scope With No Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_FEATURE_COUNT = BP_ORDERING_STRUTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = BP_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DESCRIPTION = BP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__ADDITION = BP_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__FOR_EXPRESSION = BP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__UNTIL_EXPRESSION = BP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = BP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel <em>Usage Enum By Channel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getUsageEnumByChannel()
	 * @generated
	 */
	int USAGE_ENUM_BY_CHANNEL = 48;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction <em>Message Type Enum By Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getMessageTypeEnumByInteraction()
	 * @generated
	 */
	int MESSAGE_TYPE_ENUM_BY_INTERACTION = 49;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum <em>Identity Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum
	 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getIdentityTypeEnum()
	 * @generated
	 */
	int IDENTITY_TYPE_ENUM = 50;


	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity <em>BP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Activity</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPActivity
	 * @generated
	 */
	EClass getBPActivity();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getCorrelationset <em>Correlationset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlationset</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPActivity#getCorrelationset()
	 * @see #getBPActivity()
	 * @generated
	 */
	EReference getBPActivity_Correlationset();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPActivity#getAdditional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPActivity#getAdditional()
	 * @see #getBPActivity()
	 * @generated
	 */
	EAttribute getBPActivity_Additional();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy#getTargetVariable()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_TargetVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getTargetPart <em>Target Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Part</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy#getTargetPart()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_TargetPart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceExpression <em>Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy#getSourceExpression()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_SourceExpression();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourceVariable <em>Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy#getSourceVariable()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_SourceVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Copy#getSourcePart <em>Source Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Part</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Copy#getSourcePart()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_SourcePart();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.AtomicUnit <em>Atomic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.AtomicUnit
	 * @generated
	 */
	EClass getAtomicUnit();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra <em>BP Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Orchestra</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra
	 * @generated
	 */
	EClass getBPOrchestra();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompletionExpression <em>Completion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompletionExpression()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_CompletionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getVariables()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EReference getBPOrchestra_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosedBPOrchestra <em>Enclosed BP Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enclosed BP Orchestra</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosedBPOrchestra()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EReference getBPOrchestra_EnclosedBPOrchestra();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getExceptionHandlers <em>Exception Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Handlers</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getExceptionHandlers()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EReference getBPOrchestra_ExceptionHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompensateHandlers <em>Compensate Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compensate Handlers</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCompensateHandlers()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EReference getBPOrchestra_CompensateHandlers();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getRoot()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_Root();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getHasCompletionExpression <em>Has Completion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Completion Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getHasCompletionExpression()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_HasCompletionExpression();

	/**
	 * Returns the meta object for the attribute list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participants</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getParticipants()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_Participants();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosingBPOrchestras <em>Enclosing BP Orchestras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enclosing BP Orchestras</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getEnclosingBPOrchestras()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EReference getBPOrchestra_EnclosingBPOrchestras();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCoordinated <em>Coordinated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinated</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getCoordinated()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_Coordinated();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getIsolate <em>Isolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolate</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrchestra#getIsolate()
	 * @see #getBPOrchestra()
	 * @generated
	 */
	EAttribute getBPOrchestra_Isolate();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.BPElement <em>BP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Element</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPElement
	 * @generated
	 */
	EClass getBPElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPElement#getName()
	 * @see #getBPElement()
	 * @generated
	 */
	EAttribute getBPElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPElement#getDescription()
	 * @see #getBPElement()
	 * @generated
	 */
	EAttribute getBPElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.BPElement#getAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addition</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPElement#getAddition()
	 * @see #getBPElement()
	 * @generated
	 */
	EAttribute getBPElement_Addition();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType#getChannelType()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ChannelType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType#getInterfaceType()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType#getUsage()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.ChannelType#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identities</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ChannelType#getIdentities()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_Identities();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.CompensateHandler <em>Compensate Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Handler</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CompensateHandler
	 * @generated
	 */
	EClass getCompensateHandler();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.CompensateHandler#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CompensateHandler#getActivities()
	 * @see #getCompensateHandler()
	 * @generated
	 */
	EReference getCompensateHandler_Activities();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Conditional#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Conditional#getExpression()
	 * @see #getConditional()
	 * @generated
	 */
	EAttribute getConditional_Expression();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.FaultHandler <em>Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Handler</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultHandler
	 * @generated
	 */
	EClass getFaultHandler();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.FaultHandler#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultHandler#getActivities()
	 * @see #getFaultHandler()
	 * @generated
	 */
	EReference getFaultHandler_Activities();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Compensation <em>Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensation</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Compensation
	 * @generated
	 */
	EClass getCompensation();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getCompletionHandler <em>Completion Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Completion Handler</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Compensation#getCompletionHandler()
	 * @see #getCompensation()
	 * @generated
	 */
	EReference getCompensation_CompletionHandler();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Compensation#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Compensation#getInstanceId()
	 * @see #getCompensation()
	 * @generated
	 */
	EAttribute getCompensation_InstanceId();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication#getChannelType()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_ChannelType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication#getVariable()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Variable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getVariablePart <em>Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication#getVariablePart()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_VariablePart();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication#getMessage()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Message();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Communication#getCorrelation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Communication#getCorrelation()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Correlation();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Message#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message#getFaultName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_FaultName();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.Message#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message#getParts()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Parts();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Message#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message#getClassification()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Classification();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Message#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Message#getInformationType()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_InformationType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.Operation#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Operation#getMessages()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Messages();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Part#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Part#getInformationType()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_InformationType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getBpOrchestra <em>Bp Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bp Orchestra</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform#getBpOrchestra()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_BpOrchestra();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getInstanceId <em>Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Id</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform#getInstanceId()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_InstanceId();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getIsolated <em>Isolated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform#getIsolated()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_Isolated();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getWaitForCompletion <em>Wait For Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Completion</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform#getWaitForCompletion()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_WaitForCompletion();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.Perform#getVariableBindings <em>Variable Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Bindings</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Perform#getVariableBindings()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_VariableBindings();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.CaseException <em>Case Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Exception</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CaseException
	 * @generated
	 */
	EClass getCaseException();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.CaseException#getExceptionValue <em>Exception Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Value</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CaseException#getExceptionValue()
	 * @see #getCaseException()
	 * @generated
	 */
	EAttribute getCaseException_ExceptionValue();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.ReceiveEnd <em>Receive End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive End</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ReceiveEnd
	 * @generated
	 */
	EClass getReceiveEnd();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.ReceiveEnd#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Created By Passed Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ReceiveEnd#getIsCreatedByPassedChannel()
	 * @see #getReceiveEnd()
	 * @generated
	 */
	EAttribute getReceiveEnd_IsCreatedByPassedChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.SynReply <em>Syn Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syn Reply</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.SynReply
	 * @generated
	 */
	EClass getSynReply();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.SynReply#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Created By Passed Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.SynReply#getIsCreatedByPassedChannel()
	 * @see #getSynReply()
	 * @generated
	 */
	EAttribute getSynReply_IsCreatedByPassedChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture <em>Global Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Architecture</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture
	 * @generated
	 */
	EClass getGlobalArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getStateless <em>Stateless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateless</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getStateless()
	 * @see #getGlobalArchitecture()
	 * @generated
	 */
	EAttribute getGlobalArchitecture_Stateless();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getNamespaces()
	 * @see #getGlobalArchitecture()
	 * @generated
	 */
	EReference getGlobalArchitecture_Namespaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInterfaces()
	 * @see #getGlobalArchitecture()
	 * @generated
	 */
	EReference getGlobalArchitecture_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInformationTypes <em>Information Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Types</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getInformationTypes()
	 * @see #getGlobalArchitecture()
	 * @generated
	 */
	EReference getGlobalArchitecture_InformationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getBpOrchestras <em>Bp Orchestras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bp Orchestras</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture#getBpOrchestras()
	 * @see #getGlobalArchitecture()
	 * @generated
	 */
	EReference getGlobalArchitecture_BpOrchestras();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup <em>Interface Of Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Of Group</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup
	 * @generated
	 */
	EClass getInterfaceOfGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup#getOperations()
	 * @see #getInterfaceOfGroup()
	 * @generated
	 */
	EReference getInterfaceOfGroup_Operations();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity <em>BP Ordering Strutural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Ordering Strutural Activity</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity
	 * @generated
	 */
	EClass getBPOrderingStruturalActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity#getActivityTypes <em>Activity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity Types</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity#getActivityTypes()
	 * @see #getBPOrderingStruturalActivity()
	 * @generated
	 */
	EReference getBPOrderingStruturalActivity_ActivityTypes();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Alarm</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnAlarm
	 * @generated
	 */
	EClass getOnAlarm();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeToComplete <em>Time To Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Complete</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeToComplete()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EAttribute getOnAlarm_TimeToComplete();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeoutActivityTypes <em>Timeout Activity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout Activity Types</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnAlarm#getTimeoutActivityTypes()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_TimeoutActivityTypes();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction <em>Unobservable By Silen Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unobservable By Silen Action</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction
	 * @generated
	 */
	EClass getUnobservableBySilenAction();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Binding</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.VariableBinding
	 * @generated
	 */
	EClass getVariableBinding();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getParentVariable <em>Parent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.VariableBinding#getParentVariable()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EReference getVariableBinding_ParentVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.VariableBinding#getBoundVariable <em>Bound Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.VariableBinding#getBoundVariable()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EReference getVariableBinding_BoundVariable();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable#getMutable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable#getFree()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Free();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getSilent <em>Silent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Silent</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable#getSilent()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Silent();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Variable#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Variable#getInformationType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InformationType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.When#getIsMatched <em>Is Matched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Matched</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.When#getIsMatched()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_IsMatched();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.When#getMatchedExpression <em>Matched Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matched Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.When#getMatchedExpression()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_MatchedExpression();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.While#getBreakOutExpression <em>Break Out Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Out Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.While#getBreakOutExpression()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_BreakOutExpression();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Namespace#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Namespace#getUri()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Uri();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Namespace#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Namespace#getSchemaLocation()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Identity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Identity#getType()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Type();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Identity#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tokens</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Identity#getTokens()
	 * @see #getIdentity()
	 * @generated
	 */
	EReference getIdentity_Tokens();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationType
	 * @generated
	 */
	EClass getInformationType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.InformationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationType#getType()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.InformationType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationType#getElement()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.InformationType#getTokenLocators <em>Token Locators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Locators</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationType#getTokenLocators()
	 * @see #getInformationType()
	 * @generated
	 */
	EReference getInformationType_TokenLocators();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator <em>Token Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Locator</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator
	 * @generated
	 */
	EClass getTokenLocator();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator#getQuery()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EAttribute getTokenLocator_Query();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator#getPart()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EAttribute getTokenLocator_Part();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator#getInformationType()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EReference getTokenLocator_InformationType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.TokenLocator#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenLocator#getToken()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EReference getTokenLocator_Token();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.InfoTypeOfOrchestra <em>Info Type Of Orchestra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Type Of Orchestra</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InfoTypeOfOrchestra
	 * @generated
	 */
	EClass getInfoTypeOfOrchestra();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.TokenOfProperty <em>Token Of Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Of Property</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenOfProperty
	 * @generated
	 */
	EClass getTokenOfProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.TokenOfProperty#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenOfProperty#getInformationType()
	 * @see #getTokenOfProperty()
	 * @generated
	 */
	EReference getTokenOfProperty_InformationType();

	/**
	 * Returns the meta object for the attribute list '{@link edu.xjtu.cdl2bpel.orchestra.TokenOfProperty#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.TokenOfProperty#getValues()
	 * @see #getTokenOfProperty()
	 * @generated
	 */
	EAttribute getTokenOfProperty_Values();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp <em>Information Type Zlp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type Zlp</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp
	 * @generated
	 */
	EClass getInformationTypeZlp();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getType()
	 * @see #getInformationTypeZlp()
	 * @generated
	 */
	EAttribute getInformationTypeZlp_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getElement()
	 * @see #getInformationTypeZlp()
	 * @generated
	 */
	EAttribute getInformationTypeZlp_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getTokenLocators <em>Token Locators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Locators</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.InformationTypeZlp#getTokenLocators()
	 * @see #getInformationTypeZlp()
	 * @generated
	 */
	EReference getInformationTypeZlp_TokenLocators();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches <em>Fault Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Branches</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultBranches
	 * @generated
	 */
	EClass getFaultBranches();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultVariable()
	 * @see #getFaultBranches()
	 * @generated
	 */
	EAttribute getFaultBranches_FaultVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultBranches#getActivities()
	 * @see #getFaultBranches()
	 * @generated
	 */
	EReference getFaultBranches_Activities();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultType <em>Fault Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.FaultBranches#getFaultType()
	 * @see #getFaultBranches()
	 * @generated
	 */
	EAttribute getFaultBranches_FaultType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnAlarms <em>On Alarms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Alarms</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnAlarms()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_OnAlarms();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Message</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.EventHandler#getOnMessage()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_OnMessage();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getInitiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Correlation#getInitiate()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Initiate();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.Correlation#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Correlation#getSet()
	 * @see #getCorrelation()
	 * @generated
	 */
	EReference getCorrelation_Set();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Set</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CorrelationSet
	 * @generated
	 */
	EClass getCorrelationSet();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getProperties()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Properties();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.CorrelationSet#getToken()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EReference getCorrelationSet_Token();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.AsynCallBack <em>Asyn Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asyn Call Back</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.AsynCallBack
	 * @generated
	 */
	EClass getAsynCallBack();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.AsynCallBack#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Created By Passed Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.AsynCallBack#getIsCreatedByPassedChannel()
	 * @see #getAsynCallBack()
	 * @generated
	 */
	EAttribute getAsynCallBack_IsCreatedByPassedChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.orchestra.Assign#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Copies</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Assign#getCopies()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Copies();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.SendEnd <em>Send End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send End</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.SendEnd
	 * @generated
	 */
	EClass getSendEnd();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.SendEnd#getIsCreatedByPassedChannel <em>Is Created By Passed Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Created By Passed Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.SendEnd#getIsCreatedByPassedChannel()
	 * @see #getSendEnd()
	 * @generated
	 */
	EAttribute getSendEnd_IsCreatedByPassedChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.NoAction <em>No Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Action</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.NoAction
	 * @generated
	 */
	EClass getNoAction();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler <em>On Message By Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Message By Event Handler</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler
	 * @generated
	 */
	EClass getOnMessageByEventHandler();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner Link</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPartnerLink()
	 * @see #getOnMessageByEventHandler()
	 * @generated
	 */
	EAttribute getOnMessageByEventHandler_PartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getPortType()
	 * @see #getOnMessageByEventHandler()
	 * @generated
	 */
	EAttribute getOnMessageByEventHandler_PortType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getOperation()
	 * @see #getOnMessageByEventHandler()
	 * @generated
	 */
	EAttribute getOnMessageByEventHandler_Operation();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.OnMessageByEventHandler#getVariable()
	 * @see #getOnMessageByEventHandler()
	 * @generated
	 */
	EAttribute getOnMessageByEventHandler_Variable();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr <em>Scope With No Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope With No Attr</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr
	 * @generated
	 */
	EClass getScopeWithNoAttr();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.orchestra.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Delay#getForExpression <em>For Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Delay#getForExpression()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_ForExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.orchestra.Delay#getUntilExpression <em>Until Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Until Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.Delay#getUntilExpression()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_UntilExpression();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel <em>Usage Enum By Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Enum By Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel
	 * @generated
	 */
	EEnum getUsageEnumByChannel();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction <em>Message Type Enum By Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type Enum By Interaction</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction
	 * @generated
	 */
	EEnum getMessageTypeEnumByInteraction();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum <em>Identity Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identity Type Enum</em>'.
	 * @see edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum
	 * @generated
	 */
	EEnum getIdentityTypeEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrchestraFactory getOrchestraFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl <em>BP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPActivityImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPActivity()
		 * @generated
		 */
		EClass BP_ACTIVITY = eINSTANCE.getBPActivity();

		/**
		 * The meta object literal for the '<em><b>Correlationset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ACTIVITY__CORRELATIONSET = eINSTANCE.getBPActivity_Correlationset();

		/**
		 * The meta object literal for the '<em><b>Additional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ACTIVITY__ADDITIONAL = eINSTANCE.getBPActivity_Additional();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__TARGET_VARIABLE = eINSTANCE.getCopy_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Target Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__TARGET_PART = eINSTANCE.getCopy_TargetPart();

		/**
		 * The meta object literal for the '<em><b>Source Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__SOURCE_EXPRESSION = eINSTANCE.getCopy_SourceExpression();

		/**
		 * The meta object literal for the '<em><b>Source Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__SOURCE_VARIABLE = eINSTANCE.getCopy_SourceVariable();

		/**
		 * The meta object literal for the '<em><b>Source Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY__SOURCE_PART = eINSTANCE.getCopy_SourcePart();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AtomicUnitImpl <em>Atomic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.AtomicUnitImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAtomicUnit()
		 * @generated
		 */
		EClass ATOMIC_UNIT = eINSTANCE.getAtomicUnit();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl <em>BP Orchestra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPOrchestra()
		 * @generated
		 */
		EClass BP_ORCHESTRA = eINSTANCE.getBPOrchestra();

		/**
		 * The meta object literal for the '<em><b>Completion Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__COMPLETION_EXPRESSION = eINSTANCE.getBPOrchestra_CompletionExpression();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORCHESTRA__VARIABLES = eINSTANCE.getBPOrchestra_Variables();

		/**
		 * The meta object literal for the '<em><b>Enclosed BP Orchestra</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA = eINSTANCE.getBPOrchestra_EnclosedBPOrchestra();

		/**
		 * The meta object literal for the '<em><b>Exception Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORCHESTRA__EXCEPTION_HANDLERS = eINSTANCE.getBPOrchestra_ExceptionHandlers();

		/**
		 * The meta object literal for the '<em><b>Compensate Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORCHESTRA__COMPENSATE_HANDLERS = eINSTANCE.getBPOrchestra_CompensateHandlers();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__ROOT = eINSTANCE.getBPOrchestra_Root();

		/**
		 * The meta object literal for the '<em><b>Has Completion Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION = eINSTANCE.getBPOrchestra_HasCompletionExpression();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__PARTICIPANTS = eINSTANCE.getBPOrchestra_Participants();

		/**
		 * The meta object literal for the '<em><b>Enclosing BP Orchestras</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS = eINSTANCE.getBPOrchestra_EnclosingBPOrchestras();

		/**
		 * The meta object literal for the '<em><b>Coordinated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__COORDINATED = eINSTANCE.getBPOrchestra_Coordinated();

		/**
		 * The meta object literal for the '<em><b>Isolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ORCHESTRA__ISOLATE = eINSTANCE.getBPOrchestra_Isolate();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl <em>BP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPElementImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPElement()
		 * @generated
		 */
		EClass BP_ELEMENT = eINSTANCE.getBPElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ELEMENT__NAME = eINSTANCE.getBPElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ELEMENT__DESCRIPTION = eINSTANCE.getBPElement_Description();

		/**
		 * The meta object literal for the '<em><b>Addition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BP_ELEMENT__ADDITION = eINSTANCE.getBPElement_Addition();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ChannelTypeImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getChannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__CHANNEL_TYPE = eINSTANCE.getChannelType_ChannelType();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__INTERFACE_TYPE = eINSTANCE.getChannelType_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__USAGE = eINSTANCE.getChannelType_Usage();

		/**
		 * The meta object literal for the '<em><b>Identities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__IDENTITIES = eINSTANCE.getChannelType_Identities();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ChoiceImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensateHandlerImpl <em>Compensate Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CompensateHandlerImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCompensateHandler()
		 * @generated
		 */
		EClass COMPENSATE_HANDLER = eINSTANCE.getCompensateHandler();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPENSATE_HANDLER__ACTIVITIES = eINSTANCE.getCompensateHandler_Activities();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ConditionalImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL__EXPRESSION = eINSTANCE.getConditional_Expression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultHandlerImpl <em>Fault Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.FaultHandlerImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getFaultHandler()
		 * @generated
		 */
		EClass FAULT_HANDLER = eINSTANCE.getFaultHandler();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_HANDLER__ACTIVITIES = eINSTANCE.getFaultHandler_Activities();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl <em>Compensation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CompensationImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCompensation()
		 * @generated
		 */
		EClass COMPENSATION = eINSTANCE.getCompensation();

		/**
		 * The meta object literal for the '<em><b>Completion Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPENSATION__COMPLETION_HANDLER = eINSTANCE.getCompensation_CompletionHandler();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATION__INSTANCE_ID = eINSTANCE.getCompensation_InstanceId();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CommunicationImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__CHANNEL_TYPE = eINSTANCE.getCommunication_ChannelType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__VARIABLE = eINSTANCE.getCommunication_Variable();

		/**
		 * The meta object literal for the '<em><b>Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__VARIABLE_PART = eINSTANCE.getCommunication_VariablePart();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__MESSAGE = eINSTANCE.getCommunication_Message();

		/**
		 * The meta object literal for the '<em><b>Correlation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__CORRELATION = eINSTANCE.getCommunication_Correlation();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.MessageImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FAULT_NAME = eINSTANCE.getMessage_FaultName();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PARTS = eINSTANCE.getMessage_Parts();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CLASSIFICATION = eINSTANCE.getMessage_Classification();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INFORMATION_TYPE = eINSTANCE.getMessage_InformationType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OperationImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__MESSAGES = eINSTANCE.getOperation_Messages();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ParallelImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.PartImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__INFORMATION_TYPE = eINSTANCE.getPart_InformationType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.PerformImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '<em><b>Bp Orchestra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__BP_ORCHESTRA = eINSTANCE.getPerform_BpOrchestra();

		/**
		 * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__INSTANCE_ID = eINSTANCE.getPerform_InstanceId();

		/**
		 * The meta object literal for the '<em><b>Isolated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__ISOLATED = eINSTANCE.getPerform_Isolated();

		/**
		 * The meta object literal for the '<em><b>Wait For Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__WAIT_FOR_COMPLETION = eINSTANCE.getPerform_WaitForCompletion();

		/**
		 * The meta object literal for the '<em><b>Variable Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__VARIABLE_BINDINGS = eINSTANCE.getPerform_VariableBindings();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl <em>Case Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CaseExceptionImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCaseException()
		 * @generated
		 */
		EClass CASE_EXCEPTION = eINSTANCE.getCaseException();

		/**
		 * The meta object literal for the '<em><b>Exception Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_EXCEPTION__EXCEPTION_VALUE = eINSTANCE.getCaseException_ExceptionValue();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl <em>Receive End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ReceiveEndImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getReceiveEnd()
		 * @generated
		 */
		EClass RECEIVE_END = eINSTANCE.getReceiveEnd();

		/**
		 * The meta object literal for the '<em><b>Is Created By Passed Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_END__IS_CREATED_BY_PASSED_CHANNEL = eINSTANCE.getReceiveEnd_IsCreatedByPassedChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SynReplyImpl <em>Syn Reply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.SynReplyImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSynReply()
		 * @generated
		 */
		EClass SYN_REPLY = eINSTANCE.getSynReply();

		/**
		 * The meta object literal for the '<em><b>Is Created By Passed Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYN_REPLY__IS_CREATED_BY_PASSED_CHANNEL = eINSTANCE.getSynReply_IsCreatedByPassedChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.SequenceImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl <em>Global Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.GlobalArchitectureImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getGlobalArchitecture()
		 * @generated
		 */
		EClass GLOBAL_ARCHITECTURE = eINSTANCE.getGlobalArchitecture();

		/**
		 * The meta object literal for the '<em><b>Stateless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_ARCHITECTURE__STATELESS = eINSTANCE.getGlobalArchitecture_Stateless();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ARCHITECTURE__NAMESPACES = eINSTANCE.getGlobalArchitecture_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ARCHITECTURE__INTERFACES = eINSTANCE.getGlobalArchitecture_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Information Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ARCHITECTURE__INFORMATION_TYPES = eINSTANCE.getGlobalArchitecture_InformationTypes();

		/**
		 * The meta object literal for the '<em><b>Bp Orchestras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_ARCHITECTURE__BP_ORCHESTRAS = eINSTANCE.getGlobalArchitecture_BpOrchestras();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InterfaceOfGroupImpl <em>Interface Of Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.InterfaceOfGroupImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInterfaceOfGroup()
		 * @generated
		 */
		EClass INTERFACE_OF_GROUP = eINSTANCE.getInterfaceOfGroup();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_OF_GROUP__OPERATIONS = eINSTANCE.getInterfaceOfGroup_Operations();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrderingStruturalActivityImpl <em>BP Ordering Strutural Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.BPOrderingStruturalActivityImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getBPOrderingStruturalActivity()
		 * @generated
		 */
		EClass BP_ORDERING_STRUTURAL_ACTIVITY = eINSTANCE.getBPOrderingStruturalActivity();

		/**
		 * The meta object literal for the '<em><b>Activity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORDERING_STRUTURAL_ACTIVITY__ACTIVITY_TYPES = eINSTANCE.getBPOrderingStruturalActivity_ActivityTypes();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl <em>On Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OnAlarmImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOnAlarm()
		 * @generated
		 */
		EClass ON_ALARM = eINSTANCE.getOnAlarm();

		/**
		 * The meta object literal for the '<em><b>Time To Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_ALARM__TIME_TO_COMPLETE = eINSTANCE.getOnAlarm_TimeToComplete();

		/**
		 * The meta object literal for the '<em><b>Timeout Activity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_ALARM__TIMEOUT_ACTIVITY_TYPES = eINSTANCE.getOnAlarm_TimeoutActivityTypes();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.UnobservableBySilenActionImpl <em>Unobservable By Silen Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.UnobservableBySilenActionImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getUnobservableBySilenAction()
		 * @generated
		 */
		EClass UNOBSERVABLE_BY_SILEN_ACTION = eINSTANCE.getUnobservableBySilenAction();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.VariableBindingImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getVariableBinding()
		 * @generated
		 */
		EClass VARIABLE_BINDING = eINSTANCE.getVariableBinding();

		/**
		 * The meta object literal for the '<em><b>Parent Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING__PARENT_VARIABLE = eINSTANCE.getVariableBinding_ParentVariable();

		/**
		 * The meta object literal for the '<em><b>Bound Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING__BOUND_VARIABLE = eINSTANCE.getVariableBinding_BoundVariable();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.VariableImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MUTABLE = eINSTANCE.getVariable_Mutable();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__FREE = eINSTANCE.getVariable_Free();

		/**
		 * The meta object literal for the '<em><b>Silent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SILENT = eINSTANCE.getVariable_Silent();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INFORMATION_TYPE = eINSTANCE.getVariable_InformationType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.WhenImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Is Matched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__IS_MATCHED = eINSTANCE.getWhen_IsMatched();

		/**
		 * The meta object literal for the '<em><b>Matched Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__MATCHED_EXPRESSION = eINSTANCE.getWhen_MatchedExpression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.WhileImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Break Out Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__BREAK_OUT_EXPRESSION = eINSTANCE.getWhile_BreakOutExpression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.NamespaceImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__PREFIX = eINSTANCE.getNamespace_Prefix();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__URI = eINSTANCE.getNamespace_Uri();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__SCHEMA_LOCATION = eINSTANCE.getNamespace_SchemaLocation();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.IdentityImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY__TYPE = eINSTANCE.getIdentity_Type();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY__TOKENS = eINSTANCE.getIdentity_Tokens();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeImpl <em>Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInformationType()
		 * @generated
		 */
		EClass INFORMATION_TYPE = eINSTANCE.getInformationType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__TYPE = eINSTANCE.getInformationType_Type();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__ELEMENT = eINSTANCE.getInformationType_Element();

		/**
		 * The meta object literal for the '<em><b>Token Locators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TYPE__TOKEN_LOCATORS = eINSTANCE.getInformationType_TokenLocators();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.TokenLocatorImpl <em>Token Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.TokenLocatorImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getTokenLocator()
		 * @generated
		 */
		EClass TOKEN_LOCATOR = eINSTANCE.getTokenLocator();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_LOCATOR__QUERY = eINSTANCE.getTokenLocator_Query();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_LOCATOR__PART = eINSTANCE.getTokenLocator_Part();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LOCATOR__INFORMATION_TYPE = eINSTANCE.getTokenLocator_InformationType();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LOCATOR__TOKEN = eINSTANCE.getTokenLocator_Token();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InfoTypeOfOrchestraImpl <em>Info Type Of Orchestra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.InfoTypeOfOrchestraImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInfoTypeOfOrchestra()
		 * @generated
		 */
		EClass INFO_TYPE_OF_ORCHESTRA = eINSTANCE.getInfoTypeOfOrchestra();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.TokenOfPropertyImpl <em>Token Of Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.TokenOfPropertyImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getTokenOfProperty()
		 * @generated
		 */
		EClass TOKEN_OF_PROPERTY = eINSTANCE.getTokenOfProperty();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_OF_PROPERTY__INFORMATION_TYPE = eINSTANCE.getTokenOfProperty_InformationType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_OF_PROPERTY__VALUES = eINSTANCE.getTokenOfProperty_Values();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl <em>Information Type Zlp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.InformationTypeZlpImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getInformationTypeZlp()
		 * @generated
		 */
		EClass INFORMATION_TYPE_ZLP = eINSTANCE.getInformationTypeZlp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE_ZLP__TYPE = eINSTANCE.getInformationTypeZlp_Type();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE_ZLP__ELEMENT = eINSTANCE.getInformationTypeZlp_Element();

		/**
		 * The meta object literal for the '<em><b>Token Locators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_TYPE_ZLP__TOKEN_LOCATORS = eINSTANCE.getInformationTypeZlp_TokenLocators();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl <em>Fault Branches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.FaultBranchesImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getFaultBranches()
		 * @generated
		 */
		EClass FAULT_BRANCHES = eINSTANCE.getFaultBranches();

		/**
		 * The meta object literal for the '<em><b>Fault Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_BRANCHES__FAULT_VARIABLE = eINSTANCE.getFaultBranches_FaultVariable();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT_BRANCHES__ACTIVITIES = eINSTANCE.getFaultBranches_Activities();

		/**
		 * The meta object literal for the '<em><b>Fault Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT_BRANCHES__FAULT_TYPE = eINSTANCE.getFaultBranches_FaultType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.EventHandlerImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>On Alarms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__ON_ALARMS = eINSTANCE.getEventHandler_OnAlarms();

		/**
		 * The meta object literal for the '<em><b>On Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__ON_MESSAGE = eINSTANCE.getEventHandler_OnMessage();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CorrelationImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Initiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__INITIATE = eINSTANCE.getCorrelation_Initiate();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION__SET = eINSTANCE.getCorrelation_Set();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.CorrelationSetImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getCorrelationSet()
		 * @generated
		 */
		EClass CORRELATION_SET = eINSTANCE.getCorrelationSet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_SET__PROPERTIES = eINSTANCE.getCorrelationSet_Properties();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_SET__TOKEN = eINSTANCE.getCorrelationSet_Token();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AsynCallBackImpl <em>Asyn Call Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.AsynCallBackImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAsynCallBack()
		 * @generated
		 */
		EClass ASYN_CALL_BACK = eINSTANCE.getAsynCallBack();

		/**
		 * The meta object literal for the '<em><b>Is Created By Passed Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYN_CALL_BACK__IS_CREATED_BY_PASSED_CHANNEL = eINSTANCE.getAsynCallBack_IsCreatedByPassedChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.AssignImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__COPIES = eINSTANCE.getAssign_Copies();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.SendEndImpl <em>Send End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.SendEndImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getSendEnd()
		 * @generated
		 */
		EClass SEND_END = eINSTANCE.getSendEnd();

		/**
		 * The meta object literal for the '<em><b>Is Created By Passed Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_END__IS_CREATED_BY_PASSED_CHANNEL = eINSTANCE.getSendEnd_IsCreatedByPassedChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.NoActionImpl <em>No Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.NoActionImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getNoAction()
		 * @generated
		 */
		EClass NO_ACTION = eINSTANCE.getNoAction();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.OnMessageByEventHandlerImpl <em>On Message By Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OnMessageByEventHandlerImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getOnMessageByEventHandler()
		 * @generated
		 */
		EClass ON_MESSAGE_BY_EVENT_HANDLER = eINSTANCE.getOnMessageByEventHandler();

		/**
		 * The meta object literal for the '<em><b>Partner Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MESSAGE_BY_EVENT_HANDLER__PARTNER_LINK = eINSTANCE.getOnMessageByEventHandler_PartnerLink();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MESSAGE_BY_EVENT_HANDLER__PORT_TYPE = eINSTANCE.getOnMessageByEventHandler_PortType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MESSAGE_BY_EVENT_HANDLER__OPERATION = eINSTANCE.getOnMessageByEventHandler_Operation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_MESSAGE_BY_EVENT_HANDLER__VARIABLE = eINSTANCE.getOnMessageByEventHandler_Variable();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.ScopeWithNoAttrImpl <em>Scope With No Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.ScopeWithNoAttrImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getScopeWithNoAttr()
		 * @generated
		 */
		EClass SCOPE_WITH_NO_ATTR = eINSTANCE.getScopeWithNoAttr();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.DelayImpl
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>For Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__FOR_EXPRESSION = eINSTANCE.getDelay_ForExpression();

		/**
		 * The meta object literal for the '<em><b>Until Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__UNTIL_EXPRESSION = eINSTANCE.getDelay_UntilExpression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel <em>Usage Enum By Channel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getUsageEnumByChannel()
		 * @generated
		 */
		EEnum USAGE_ENUM_BY_CHANNEL = eINSTANCE.getUsageEnumByChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction <em>Message Type Enum By Interaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getMessageTypeEnumByInteraction()
		 * @generated
		 */
		EEnum MESSAGE_TYPE_ENUM_BY_INTERACTION = eINSTANCE.getMessageTypeEnumByInteraction();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum <em>Identity Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum
		 * @see edu.xjtu.cdl2bpel.orchestra.impl.OrchestraPackageImpl#getIdentityTypeEnum()
		 * @generated
		 */
		EEnum IDENTITY_TYPE_ENUM = eINSTANCE.getIdentityTypeEnum();

	}

} //OrchestraPackage
