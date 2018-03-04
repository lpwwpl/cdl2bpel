/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLPackage.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

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
 * @see edu.xjtu.cdl2bpel.cdl.CDLFactory
 * @model kind="package"
 * @generated
 */
public interface CDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu/xjtu/cdl2bpel/cdl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.xjtu.cdl2bpel.cdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDLPackage eINSTANCE = edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCDLElement()
	 * @generated
	 */
	int CDL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDL_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDL_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDL_ELEMENT__ADDITION = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCKED = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.AssignImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Copy Of Assign</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COPY_OF_ASSIGN = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ROLE_TYPE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.BehaviorOfRoleTypeImpl <em>Behavior Of Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.BehaviorOfRoleTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getBehaviorOfRoleType()
	 * @generated
	 */
	int BEHAVIOR_OF_ROLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OF_ROLE_TYPE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OF_ROLE_TYPE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OF_ROLE_TYPE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OF_ROLE_TYPE__INTERFACE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Of Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OF_ROLE_TYPE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl <em>Bind Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getBindInfo()
	 * @generated
	 */
	int BIND_INFO = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>This Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__THIS_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>This Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__THIS_ROLE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Free Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__FREE_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Free Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO__FREE_ROLE = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bind Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIND_INFO_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InfoOrChannelImpl <em>Info Or Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.InfoOrChannelImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInfoOrChannel()
	 * @generated
	 */
	int INFO_OR_CHANNEL = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OR_CHANNEL__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OR_CHANNEL__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OR_CHANNEL__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The number of structural features of the '<em>Info Or Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OR_CHANNEL_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DESCRIPTION = INFO_OR_CHANNEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__NAME = INFO_OR_CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ADDITION = INFO_OR_CHANNEL__ADDITION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__USAGE = INFO_OR_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ACTION = INFO_OR_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Passing Info By Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL = INFO_OR_CHANNEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>The Behavior Of The Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE = INFO_OR_CHANNEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Referenced Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__REFERENCED_TOKEN = INFO_OR_CHANNEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__IDENTITIES = INFO_OR_CHANNEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ROLE_TYPE = INFO_OR_CHANNEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = INFO_OR_CHANNEL_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.OrderingStructuralActivityImpl <em>Ordering Structural Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.OrderingStructuralActivityImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getOrderingStructuralActivity()
	 * @generated
	 */
	int ORDERING_STRUCTURAL_ACTIVITY = 39;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordering Structural Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = ORDERING_STRUCTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = ORDERING_STRUCTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ADDITION = ORDERING_STRUCTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LOCKED = ORDERING_STRUCTURAL_ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__STATE = ORDERING_STRUCTURAL_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__THE_BELONGED_ROLE_TYPE_MATRIX = ORDERING_STRUCTURAL_ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ACTIVITIES = ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__COMPLETE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Isolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ISOLATION = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ROOT = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__COORDINATION = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__RELATIONSHIPS = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enclosed Choreographies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Matrix Playing Role In Choreo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__VARIABLES = CDL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exception Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__EXCEPTION_BLOCK = CDL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Finalizer Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__FINALIZER_BLOCKS = CDL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ACTIVITIES = CDL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enclosing Choreographies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES = CDL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl <em>Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWorkUnit()
	 * @generated
	 */
	int WORK_UNIT = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__DESCRIPTION = ORDERING_STRUCTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__NAME = ORDERING_STRUCTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__ADDITION = ORDERING_STRUCTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__LOCKED = ORDERING_STRUCTURAL_ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__STATE = ORDERING_STRUCTURAL_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX = ORDERING_STRUCTURAL_ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__ACTIVITIES = ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__GUARD_EXPRESSION = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__BLOCK = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT__REPEAT_EXPRESSION = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_UNIT_FEATURE_COUNT = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl <em>Case Conditional Of Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCaseConditionalOfSwitch()
	 * @generated
	 */
	int CASE_CONDITIONAL_OF_SWITCH = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__DESCRIPTION = WORK_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__ADDITION = WORK_UNIT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__LOCKED = WORK_UNIT__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__STATE = WORK_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__THE_BELONGED_ROLE_TYPE_MATRIX = WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__ACTIVITIES = WORK_UNIT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__GUARD_EXPRESSION = WORK_UNIT__GUARD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__BLOCK = WORK_UNIT__BLOCK;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH__REPEAT_EXPRESSION = WORK_UNIT__REPEAT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Case Conditional Of Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONDITIONAL_OF_SWITCH_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl <em>Copy Of Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCopyOfAssign()
	 * @generated
	 */
	int COPY_OF_ASSIGN = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__SOURCE_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__SOURCE_EXPRESSION = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__TARGET_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cause Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__CAUSE_EXCEPTION = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__SOURCE_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN__TARGET_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Copy Of Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_ASSIGN_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl <em>Exception Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExceptionBlock()
	 * @generated
	 */
	int EXCEPTION_BLOCK = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_BLOCK__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_BLOCK__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_BLOCK__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Exception Work Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_BLOCK_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl <em>Exception Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExceptionWorkUnit()
	 * @generated
	 */
	int EXCEPTION_WORK_UNIT = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__DESCRIPTION = WORK_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__ADDITION = WORK_UNIT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__LOCKED = WORK_UNIT__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__STATE = WORK_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX = WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__ACTIVITIES = WORK_UNIT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__GUARD_EXPRESSION = WORK_UNIT__GUARD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__BLOCK = WORK_UNIT__BLOCK;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__REPEAT_EXPRESSION = WORK_UNIT__REPEAT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT__EXCEPTION_TYPE = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_WORK_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl <em>Exchange Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExchangeInfo()
	 * @generated
	 */
	int EXCHANGE_INFO = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__ACTION = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Send Record Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__SEND_RECORD_REFERENCE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receive Record Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__FAULT_NAME = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Send Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__SEND_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Send Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__SEND_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cause Exception Of Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND = CDL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Receive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__RECEIVE_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Receive Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__RECEIVE_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cause Exception Of Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE = CDL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Exchange Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_INFO_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl <em>Finalize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getFinalize()
	 * @generated
	 */
	int FINALIZE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Choreography</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__CHOREOGRAPHY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choreography Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__CHOREOGRAPHY_INSTANCE_ID = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Finalizer Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__FINALIZER_BLOCK = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Type Matrix Bind Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Finalize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl <em>Finalizer Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getFinalizerBlock()
	 * @generated
	 */
	int FINALIZER_BLOCK = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZER_BLOCK__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZER_BLOCK__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZER_BLOCK__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZER_BLOCK__ACTIVITIES = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finalizer Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALIZER_BLOCK_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.IdentityImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__TOKENS = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InformationTypeImpl <em>Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.InformationTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInformationType()
	 * @generated
	 */
	int INFORMATION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__DESCRIPTION = INFO_OR_CHANNEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__NAME = INFO_OR_CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__ADDITION = INFO_OR_CHANNEL__ADDITION;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__TYPE_NAME = INFO_OR_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE__ELEMENT_NAME = INFO_OR_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_TYPE_FEATURE_COUNT = INFO_OR_CHANNEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OPERATION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CHANNEL_VARIABLE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout Of Time To Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ALIGN = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INITIATE = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RELATIONSHIP = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exchange Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EXCHANGE_INFOS = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Record Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RECORD_INFOS = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timeout From Role Type Record Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Timeout To Role Type Record Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>From Role Type Of Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>To Role Type Of Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Participate By Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PARTICIPATE_BY_INTERACTION = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.NamespaceImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PREFIX = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__URI = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SCHEMA_LOCATION = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl <em>No Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getNoAction()
	 * @generated
	 */
	int NO_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION__ROLE_TYPE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_ACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.PackageImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHOR = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TARGET_NAMESPACE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACES = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Information Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__INFORMATION_TYPES = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TOKENS = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token Locators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TOKEN_LOCATORS = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ROLE_TYPES = CDL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RELATIONSHIP_TYPES = CDL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Participant Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARTICIPANT_TYPES = CDL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Channel Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHANNEL_TYPES = CDL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Choreographies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHOREOGRAPHIES = CDL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DESCRIPTION = ORDERING_STRUCTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = ORDERING_STRUCTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ADDITION = ORDERING_STRUCTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__LOCKED = ORDERING_STRUCTURAL_ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STATE = ORDERING_STRUCTURAL_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__THE_BELONGED_ROLE_TYPE_MATRIX = ORDERING_STRUCTURAL_ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ACTIVITIES = ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParticipantType()
	 * @generated
	 */
	int PARTICIPANT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Role Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__ROLE_TYPES = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stateless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__STATELESS = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE__FREE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participant Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_TYPE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl <em>Passing Info Of The Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPassingInfoOfTheChannelType()
	 * @generated
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enclosing Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Passing Info Of The Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSING_INFO_OF_THE_CHANNEL_TYPE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.PerformImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Binds Of Perform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__BINDS_OF_PERFORM = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choreography Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__CHOREOGRAPHY_INSTANCE_ID = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choreography</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__CHOREOGRAPHY = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__WAIT_FOR_COMPLETION = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Matrix Bind Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__BLOCK = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Choreography Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__CHOREOGRAPHY_NAME = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl <em>Record Element Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRecordElementInfo()
	 * @generated
	 */
	int RECORD_ELEMENT_INFO = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__WHEN = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__SOURCE_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__TARGET_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cause Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__CAUSE_EXCEPTION = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__SOURCE_EXPRESSION = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Record Element Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_ELEMENT_INFO_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Role Type Of First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviors Of Role Type First</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Of Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviors Of Role Type Second</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__BEHAVIORS = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stateless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__STATELESS = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__FREE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = ORDERING_STRUCTURAL_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ORDERING_STRUCTURAL_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ADDITION = ORDERING_STRUCTURAL_ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LOCKED = ORDERING_STRUCTURAL_ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STATE = ORDERING_STRUCTURAL_ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__THE_BELONGED_ROLE_TYPE_MATRIX = ORDERING_STRUCTURAL_ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITIES = ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ORDERING_STRUCTURAL_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl <em>Silent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSilentAction()
	 * @generated
	 */
	int SILENT_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__ADDITION = ACTIVITY__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__LOCKED = ACTIVITY__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__STATE = ACTIVITY__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__THE_BELONGED_ROLE_TYPE_MATRIX = ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION__ROLE_TYPE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Silent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILENT_ACTION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.TokenImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__INFORMATION_TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl <em>Token Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getTokenLocator()
	 * @generated
	 */
	int TOKEN_LOCATOR = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__TOKEN = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__INFORMATION_TYPE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__QUERY = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR__PART = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Token Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LOCATOR_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.VariableImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MUTABLE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FREE = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Silent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SILENT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ROLE_TYPES = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl <em>When With Block Of Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhenWithBlockOfWorkUnit()
	 * @generated
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__DESCRIPTION = WORK_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__ADDITION = WORK_UNIT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__LOCKED = WORK_UNIT__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__STATE = WORK_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX = WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__ACTIVITIES = WORK_UNIT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__GUARD_EXPRESSION = WORK_UNIT__GUARD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__BLOCK = WORK_UNIT__BLOCK;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__REPEAT_EXPRESSION = WORK_UNIT__REPEAT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Matched Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Matched</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED = WORK_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When With Block Of Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_WITH_BLOCK_OF_WORK_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl <em>While With Repeate Of Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhileWithRepeateOfWorkUnit()
	 * @generated
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__DESCRIPTION = WORK_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__ADDITION = WORK_UNIT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__LOCKED = WORK_UNIT__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__STATE = WORK_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX = WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__ACTIVITIES = WORK_UNIT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__GUARD_EXPRESSION = WORK_UNIT__GUARD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__BLOCK = WORK_UNIT__BLOCK;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__REPEAT_EXPRESSION = WORK_UNIT__REPEAT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Break Out Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While With Repeate Of Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_WITH_REPEATE_OF_WORK_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl <em>Role Type Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeMatrix()
	 * @generated
	 */
	int ROLE_TYPE_MATRIX = 37;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Role Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX__ROLE_TYPES = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX__FREE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl <em>Role Type Matrix Bind Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeMatrixBindInfo()
	 * @generated
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>This Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type Matrix Bind Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_MATRIX_BIND_INFO_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl <em>Participate Info By Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParticipateInfoByInteraction()
	 * @generated
	 */
	int PARTICIPATE_INFO_BY_INTERACTION = 40;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Role Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Role Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participate Info By Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATE_INFO_BY_INTERACTION_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl <em>Interaction Lpw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInteractionLpw()
	 * @generated
	 */
	int INTERACTION_LPW = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>From Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__FROM_ROLE_TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__TO_ROLE_TYPE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opperation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__OPPERATION = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__TIMEOUT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__ALIGN = CDL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__INTERACTION = CDL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Asyn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW__ASYN = CDL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Interaction Lpw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_LPW_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl <em>Role Type Zlp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeZlp()
	 * @generated
	 */
	int ROLE_TYPE_ZLP = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Participant Belonged By Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP__FREE = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Type Zlp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ZLP_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl <em>Send By Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSendByExchange()
	 * @generated
	 */
	int SEND_BY_EXCHANGE = 43;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Send Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__SEND_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__SEND_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Send Case Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send By Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_BY_EXCHANGE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl <em>Receive By Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getReceiveByExchange()
	 * @generated
	 */
	int RECEIVE_BY_EXCHANGE = 44;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__DESCRIPTION = CDL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__NAME = CDL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__ADDITION = CDL_ELEMENT__ADDITION;

	/**
	 * The feature id for the '<em><b>Receive Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE = CDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receive Variable Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART = CDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receive Case Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION = CDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Receive By Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_BY_EXCHANGE_FEATURE_COUNT = CDL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl <em>Scope With No Attr Of Work Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getScopeWithNoAttrOfWorkUnit()
	 * @generated
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__DESCRIPTION = WORK_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__NAME = WORK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Addition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__ADDITION = WORK_UNIT__ADDITION;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__LOCKED = WORK_UNIT__LOCKED;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__STATE = WORK_UNIT__STATE;

	/**
	 * The feature id for the '<em><b>The Belonged Role Type Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX = WORK_UNIT__THE_BELONGED_ROLE_TYPE_MATRIX;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__ACTIVITIES = WORK_UNIT__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Guard Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__GUARD_EXPRESSION = WORK_UNIT__GUARD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__BLOCK = WORK_UNIT__BLOCK;

	/**
	 * The feature id for the '<em><b>Repeat Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT__REPEAT_EXPRESSION = WORK_UNIT__REPEAT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Scope With No Attr Of Work Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_WITH_NO_ATTR_OF_WORK_UNIT_FEATURE_COUNT = WORK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType <em>Action Type Enum By Channel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActionTypeEnumByChannelType()
	 * @generated
	 */
	int ACTION_TYPE_ENUM_BY_CHANNEL_TYPE = 46;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo <em>Action Type Enum By Exchange Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActionTypeEnumByExchangeInfo()
	 * @generated
	 */
	int ACTION_TYPE_ENUM_BY_EXCHANGE_INFO = 47;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType <em>Usage Type Enum By Channel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getUsageTypeEnumByChannelType()
	 * @generated
	 */
	int USAGE_TYPE_ENUM_BY_CHANNEL_TYPE = 48;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo <em>When Type Enum By Record Info</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhenTypeEnumByRecordInfo()
	 * @generated
	 */
	int WHEN_TYPE_ENUM_BY_RECORD_INFO = 49;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify <em>Key Type Enum By Identify</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getKeyTypeEnumByIdentify()
	 * @generated
	 */
	int KEY_TYPE_ENUM_BY_IDENTIFY = 50;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.ChoreographyState <em>Choreography State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.ChoreographyState
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoreographyState()
	 * @generated
	 */
	int CHOREOGRAPHY_STATE = 51;

	/**
	 * The meta object id for the '{@link edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity <em>Activity State Enum By Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity
	 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActivityStateEnumByActivity()
	 * @generated
	 */
	int ACTIVITY_STATE_ENUM_BY_ACTIVITY = 52;


	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Activity#getLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Activity#getLocked()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Locked();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Activity#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Activity#getState()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_State();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Activity#getTheBelongedRoleTypeMatrix <em>The Belonged Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Belonged Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Activity#getTheBelongedRoleTypeMatrix()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_TheBelongedRoleTypeMatrix();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Assign#getCopyOfAssign <em>Copy Of Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copy Of Assign</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Assign#getCopyOfAssign()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_CopyOfAssign();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Assign#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Assign#getRoleType()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_RoleType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType <em>Behavior Of Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Of Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType
	 * @generated
	 */
	EClass getBehaviorOfRoleType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType#getInterface()
	 * @see #getBehaviorOfRoleType()
	 * @generated
	 */
	EAttribute getBehaviorOfRoleType_Interface();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.BindInfo <em>Bind Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bind Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo
	 * @generated
	 */
	EClass getBindInfo();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisVariable <em>This Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo#getThisVariable()
	 * @see #getBindInfo()
	 * @generated
	 */
	EReference getBindInfo_ThisVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getThisRole <em>This Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Role</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo#getThisRole()
	 * @see #getBindInfo()
	 * @generated
	 */
	EReference getBindInfo_ThisRole();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeVariable <em>Free Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Free Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeVariable()
	 * @see #getBindInfo()
	 * @generated
	 */
	EReference getBindInfo_FreeVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeRole <em>Free Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Free Role</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.BindInfo#getFreeRole()
	 * @see #getBindInfo()
	 * @generated
	 */
	EReference getBindInfo_FreeRole();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.CDLElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLElement
	 * @generated
	 */
	EClass getCDLElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLElement#getDescription()
	 * @see #getCDLElement()
	 * @generated
	 */
	EAttribute getCDLElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLElement#getName()
	 * @see #getCDLElement()
	 * @generated
	 */
	EAttribute getCDLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addition</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLElement#getAddition()
	 * @see #getCDLElement()
	 * @generated
	 */
	EAttribute getCDLElement_Addition();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getUsage()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Usage();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getAction()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getPassingInfoByChannel <em>Passing Info By Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passing Info By Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getPassingInfoByChannel()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_PassingInfoByChannel();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getTheBehaviorOfTheRoleType <em>The Behavior Of The Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Behavior Of The Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getTheBehaviorOfTheRoleType()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_TheBehaviorOfTheRoleType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getReferencedToken <em>Referenced Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Token</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getReferencedToken()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_ReferencedToken();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getIdentities <em>Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identities</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getIdentities()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_Identities();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ChannelType#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChannelType#getRoleType()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_RoleType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getComplete()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Complete();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getIsolation <em>Isolation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolation</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getIsolation()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Isolation();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getRoot()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Root();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getCoordination <em>Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordination</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getCoordination()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Coordination();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationships</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getRelationships()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosedChoreographies <em>Enclosed Choreographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enclosed Choreographies</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosedChoreographies()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_EnclosedChoreographies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getRoleTypeMatrixPlayingRoleInChoreo <em>Role Type Matrix Playing Role In Choreo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Type Matrix Playing Role In Choreo</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getRoleTypeMatrixPlayingRoleInChoreo()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_RoleTypeMatrixPlayingRoleInChoreo();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getVariables()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getExceptionBlock <em>Exception Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getExceptionBlock()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_ExceptionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getFinalizerBlocks <em>Finalizer Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finalizer Blocks</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getFinalizerBlocks()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_FinalizerBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getActivities()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_Activities();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosingChoreographies <em>Enclosing Choreographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enclosing Choreographies</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Choreography#getEnclosingChoreographies()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_EnclosingChoreographies();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch <em>Case Conditional Of Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Conditional Of Switch</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch
	 * @generated
	 */
	EClass getCaseConditionalOfSwitch();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign <em>Copy Of Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Of Assign</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign
	 * @generated
	 */
	EClass getCopyOfAssign();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariable <em>Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariable()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EReference getCopyOfAssign_SourceVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceExpression <em>Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceExpression()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EAttribute getCopyOfAssign_SourceExpression();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariable()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EReference getCopyOfAssign_TargetVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getCauseException <em>Cause Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Exception</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getCauseException()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EAttribute getCopyOfAssign_CauseException();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariablePart <em>Source Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getSourceVariablePart()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EAttribute getCopyOfAssign_SourceVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariablePart <em>Target Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.CopyOfAssign#getTargetVariablePart()
	 * @see #getCopyOfAssign()
	 * @generated
	 */
	EAttribute getCopyOfAssign_TargetVariablePart();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.InfoOrChannel <em>Info Or Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Or Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InfoOrChannel
	 * @generated
	 */
	EClass getInfoOrChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ExceptionBlock <em>Exception Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionBlock
	 * @generated
	 */
	EClass getExceptionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.ExceptionBlock#getExceptionWorkUnits <em>Exception Work Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Work Units</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionBlock#getExceptionWorkUnits()
	 * @see #getExceptionBlock()
	 * @generated
	 */
	EReference getExceptionBlock_ExceptionWorkUnits();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit <em>Exception Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Work Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit
	 * @generated
	 */
	EClass getExceptionWorkUnit();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit#getExceptionType()
	 * @see #getExceptionWorkUnit()
	 * @generated
	 */
	EAttribute getExceptionWorkUnit_ExceptionType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo <em>Exchange Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo
	 * @generated
	 */
	EClass getExchangeInfo();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getType()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EReference getExchangeInfo_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getAction()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_Action();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendRecordReference <em>Send Record Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Send Record Reference</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendRecordReference()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EReference getExchangeInfo_SendRecordReference();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveRecordReference <em>Receive Record Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Record Reference</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveRecordReference()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EReference getExchangeInfo_ReceiveRecordReference();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getFaultName()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_FaultName();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariable <em>Send Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariable()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EReference getExchangeInfo_SendVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariablePart <em>Send Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getSendVariablePart()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_SendVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfSend <em>Cause Exception Of Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Exception Of Send</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfSend()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_CauseExceptionOfSend();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariable <em>Receive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariable()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EReference getExchangeInfo_ReceiveVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariablePart <em>Receive Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getReceiveVariablePart()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_ReceiveVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfReceive <em>Cause Exception Of Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Exception Of Receive</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ExchangeInfo#getCauseExceptionOfReceive()
	 * @see #getExchangeInfo()
	 * @generated
	 */
	EAttribute getExchangeInfo_CauseExceptionOfReceive();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Finalize <em>Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalize</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize
	 * @generated
	 */
	EClass getFinalize();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choreography</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize#getChoreography()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_Choreography();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getChoreographyInstanceId <em>Choreography Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choreography Instance Id</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize#getChoreographyInstanceId()
	 * @see #getFinalize()
	 * @generated
	 */
	EAttribute getFinalize_ChoreographyInstanceId();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getFinalizerBlock <em>Finalizer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finalizer Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize#getFinalizerBlock()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_FinalizerBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Finalize#getRoleTypeMatrixBindInfo <em>Role Type Matrix Bind Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Type Matrix Bind Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Finalize#getRoleTypeMatrixBindInfo()
	 * @see #getFinalize()
	 * @generated
	 */
	EReference getFinalize_RoleTypeMatrixBindInfo();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.FinalizerBlock <em>Finalizer Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finalizer Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.FinalizerBlock
	 * @generated
	 */
	EClass getFinalizerBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.FinalizerBlock#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.FinalizerBlock#getActivities()
	 * @see #getFinalizerBlock()
	 * @generated
	 */
	EReference getFinalizerBlock_Activities();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Identity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Identity#getType()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Type();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Identity#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Identity#getTokens()
	 * @see #getIdentity()
	 * @generated
	 */
	EReference getIdentity_Tokens();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.InformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InformationType
	 * @generated
	 */
	EClass getInformationType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InformationType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InformationType#getTypeName()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InformationType#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InformationType#getElementName()
	 * @see #getInformationType()
	 * @generated
	 */
	EAttribute getInformationType_ElementName();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getOperation()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Operation();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getChannelVariable <em>Channel Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getChannelVariable()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_ChannelVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutOfTimeToComplete <em>Timeout Of Time To Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Of Time To Complete</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutOfTimeToComplete()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_TimeoutOfTimeToComplete();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getAlign()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Align();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getInitiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getInitiate()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Initiate();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getRelationship()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Relationship();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getExchangeInfos <em>Exchange Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Infos</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getExchangeInfos()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_ExchangeInfos();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getRecordInfos <em>Record Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record Infos</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getRecordInfos()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_RecordInfos();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutFromRoleTypeRecordInfo <em>Timeout From Role Type Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeout From Role Type Record Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutFromRoleTypeRecordInfo()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_TimeoutFromRoleTypeRecordInfo();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutToRoleTypeRecordInfo <em>Timeout To Role Type Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeout To Role Type Record Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getTimeoutToRoleTypeRecordInfo()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_TimeoutToRoleTypeRecordInfo();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getFromRoleTypeOfBelongedRoleTypeMatrix <em>From Role Type Of Belonged Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Role Type Of Belonged Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getFromRoleTypeOfBelongedRoleTypeMatrix()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_FromRoleTypeOfBelongedRoleTypeMatrix();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getToRoleTypeOfBelongedRoleTypeMatrix <em>To Role Type Of Belonged Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Role Type Of Belonged Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getToRoleTypeOfBelongedRoleTypeMatrix()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_ToRoleTypeOfBelongedRoleTypeMatrix();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Interaction#getParticipateByInteraction <em>Participate By Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participate By Interaction</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Interaction#getParticipateByInteraction()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_ParticipateByInteraction();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Namespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Namespace#getPrefix()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Namespace#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Namespace#getUri()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Uri();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Namespace#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Namespace#getSchemaLocation()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.NoAction <em>No Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Action</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.NoAction
	 * @generated
	 */
	EClass getNoAction();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.NoAction#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.NoAction#getRoleType()
	 * @see #getNoAction()
	 * @generated
	 */
	EReference getNoAction_RoleType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Package#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getAuthor()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Author();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Package#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getTargetNamespace()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getNamespaces()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Namespaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getInformationTypes <em>Information Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getInformationTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_InformationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getTokens()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getTokenLocators <em>Token Locators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Locators</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getTokenLocators()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_TokenLocators();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getRoleTypes <em>Role Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getRoleTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_RoleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getRelationshipTypes <em>Relationship Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getRelationshipTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_RelationshipTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getParticipantTypes <em>Participant Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getParticipantTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ParticipantTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getChannelTypes <em>Channel Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getChannelTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ChannelTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Package#getChoreographies <em>Choreographies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choreographies</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Package#getChoreographies()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Choreographies();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType <em>Participant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipantType
	 * @generated
	 */
	EClass getParticipantType();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getRoleTypes <em>Role Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipantType#getRoleTypes()
	 * @see #getParticipantType()
	 * @generated
	 */
	EReference getParticipantType_RoleTypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getStateless <em>Stateless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateless</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipantType#getStateless()
	 * @see #getParticipantType()
	 * @generated
	 */
	EAttribute getParticipantType_Stateless();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ParticipantType#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipantType#getFree()
	 * @see #getParticipantType()
	 * @generated
	 */
	EAttribute getParticipantType_Free();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType <em>Passing Info Of The Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passing Info Of The Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType
	 * @generated
	 */
	EClass getPassingInfoOfTheChannelType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getChannel()
	 * @see #getPassingInfoOfTheChannelType()
	 * @generated
	 */
	EReference getPassingInfoOfTheChannelType_Channel();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getAction()
	 * @see #getPassingInfoOfTheChannelType()
	 * @generated
	 */
	EAttribute getPassingInfoOfTheChannelType_Action();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getNew()
	 * @see #getPassingInfoOfTheChannelType()
	 * @generated
	 */
	EAttribute getPassingInfoOfTheChannelType_New();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getEnclosingChannel <em>Enclosing Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enclosing Channel</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType#getEnclosingChannel()
	 * @see #getPassingInfoOfTheChannelType()
	 * @generated
	 */
	EReference getPassingInfoOfTheChannelType_EnclosingChannel();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Perform#getBindsOfPerform <em>Binds Of Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binds Of Perform</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getBindsOfPerform()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_BindsOfPerform();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyInstanceId <em>Choreography Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choreography Instance Id</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyInstanceId()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_ChoreographyInstanceId();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choreography</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getChoreography()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_Choreography();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Perform#getWaitForCompletion <em>Wait For Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Completion</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getWaitForCompletion()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_WaitForCompletion();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.Perform#getRoleTypeMatrixBindInfos <em>Role Type Matrix Bind Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Type Matrix Bind Infos</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getRoleTypeMatrixBindInfos()
	 * @see #getPerform()
	 * @generated
	 */
	EReference getPerform_RoleTypeMatrixBindInfos();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Perform#isBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#isBlock()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_Block();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyName <em>Choreography Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choreography Name</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Perform#getChoreographyName()
	 * @see #getPerform()
	 * @generated
	 */
	EAttribute getPerform_ChoreographyName();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo <em>Record Element Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Element Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo
	 * @generated
	 */
	EClass getRecordElementInfo();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getWhen()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EAttribute getRecordElementInfo_When();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceVariable <em>Source Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceVariable()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EReference getRecordElementInfo_SourceVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getTargetVariable()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EReference getRecordElementInfo_TargetVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getCauseException <em>Cause Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Exception</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getCauseException()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EAttribute getRecordElementInfo_CauseException();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceExpression <em>Source Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceExpression()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EAttribute getRecordElementInfo_SourceExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceVariablePart <em>Source Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getSourceVariablePart()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EAttribute getRecordElementInfo_SourceVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getTargetVariablePart <em>Target Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RecordElementInfo#getTargetVariablePart()
	 * @see #getRecordElementInfo()
	 * @generated
	 */
	EAttribute getRecordElementInfo_TargetVariablePart();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfFirst <em>Role Type Of First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Of First</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfFirst()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_RoleTypeOfFirst();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeFirst <em>Behaviors Of Role Type First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviors Of Role Type First</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeFirst()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_BehaviorsOfRoleTypeFirst();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfSecond <em>Role Type Of Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Of Second</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType#getRoleTypeOfSecond()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_RoleTypeOfSecond();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeSecond <em>Behaviors Of Role Type Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviors Of Role Type Second</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RelationshipType#getBehaviorsOfRoleTypeSecond()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_BehaviorsOfRoleTypeSecond();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.RoleType#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleType#getBehaviors()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_Behaviors();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RoleType#getStateless <em>Stateless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateless</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleType#getStateless()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Stateless();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RoleType#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleType#getFree()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Free();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.SilentAction <em>Silent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silent Action</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SilentAction
	 * @generated
	 */
	EClass getSilentAction();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.SilentAction#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SilentAction#getRoleType()
	 * @see #getSilentAction()
	 * @generated
	 */
	EReference getSilentAction_RoleType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Token#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Token#getInformationType()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_InformationType();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator <em>Token Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Locator</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator
	 * @generated
	 */
	EClass getTokenLocator();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator#getToken()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EReference getTokenLocator_Token();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getInformationType <em>Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Information Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator#getInformationType()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EReference getTokenLocator_InformationType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator#getQuery()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EAttribute getTokenLocator_Query();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.TokenLocator#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.TokenLocator#getPart()
	 * @see #getTokenLocator()
	 * @generated
	 */
	EAttribute getTokenLocator_Part();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Variable#getMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable#getMutable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Variable#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable#getFree()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Free();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.Variable#getSilent <em>Silent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Silent</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable#getSilent()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Silent();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.Variable#getRoleTypes <em>Role Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.Variable#getRoleTypes()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_RoleTypes();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit <em>Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WorkUnit
	 * @generated
	 */
	EClass getWorkUnit();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getGuardExpression <em>Guard Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WorkUnit#getGuardExpression()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EAttribute getWorkUnit_GuardExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WorkUnit#getBlock()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EAttribute getWorkUnit_Block();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WorkUnit#getRepeatExpression <em>Repeat Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WorkUnit#getRepeatExpression()
	 * @see #getWorkUnit()
	 * @generated
	 */
	EAttribute getWorkUnit_RepeatExpression();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit <em>When With Block Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When With Block Of Work Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit
	 * @generated
	 */
	EClass getWhenWithBlockOfWorkUnit();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getMatchedExpression <em>Matched Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matched Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getMatchedExpression()
	 * @see #getWhenWithBlockOfWorkUnit()
	 * @generated
	 */
	EAttribute getWhenWithBlockOfWorkUnit_MatchedExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getIsMatched <em>Is Matched</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Matched</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit#getIsMatched()
	 * @see #getWhenWithBlockOfWorkUnit()
	 * @generated
	 */
	EAttribute getWhenWithBlockOfWorkUnit_IsMatched();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit <em>While With Repeate Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While With Repeate Of Work Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit
	 * @generated
	 */
	EClass getWhileWithRepeateOfWorkUnit();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit#getBreakOutExpression <em>Break Out Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Out Expression</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit#getBreakOutExpression()
	 * @see #getWhileWithRepeateOfWorkUnit()
	 * @generated
	 */
	EAttribute getWhileWithRepeateOfWorkUnit_BreakOutExpression();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix <em>Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix
	 * @generated
	 */
	EClass getRoleTypeMatrix();

	/**
	 * Returns the meta object for the reference list '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getRoleTypes <em>Role Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Types</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getRoleTypes()
	 * @see #getRoleTypeMatrix()
	 * @generated
	 */
	EReference getRoleTypeMatrix_RoleTypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix#getFree()
	 * @see #getRoleTypeMatrix()
	 * @generated
	 */
	EAttribute getRoleTypeMatrix_Free();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo <em>Role Type Matrix Bind Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Matrix Bind Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo
	 * @generated
	 */
	EClass getRoleTypeMatrixBindInfo();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getThisRoleTypeMatrix <em>This Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getThisRoleTypeMatrix()
	 * @see #getRoleTypeMatrixBindInfo()
	 * @generated
	 */
	EReference getRoleTypeMatrixBindInfo_ThisRoleTypeMatrix();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getFreeRoleTypeMatrix <em>Free Role Type Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Free Role Type Matrix</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo#getFreeRoleTypeMatrix()
	 * @see #getRoleTypeMatrixBindInfo()
	 * @generated
	 */
	EReference getRoleTypeMatrixBindInfo_FreeRoleTypeMatrix();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity <em>Ordering Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordering Structural Activity</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity
	 * @generated
	 */
	EClass getOrderingStructuralActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity#getActivities()
	 * @see #getOrderingStructuralActivity()
	 * @generated
	 */
	EReference getOrderingStructuralActivity_Activities();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction <em>Participate Info By Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participate Info By Interaction</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction
	 * @generated
	 */
	EClass getParticipateInfoByInteraction();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getRelationshipType()
	 * @see #getParticipateInfoByInteraction()
	 * @generated
	 */
	EReference getParticipateInfoByInteraction_RelationshipType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getFromRoleTypeRef <em>From Role Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Role Type Ref</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getFromRoleTypeRef()
	 * @see #getParticipateInfoByInteraction()
	 * @generated
	 */
	EReference getParticipateInfoByInteraction_FromRoleTypeRef();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getToRoleTypeRef <em>To Role Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Role Type Ref</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction#getToRoleTypeRef()
	 * @see #getParticipateInfoByInteraction()
	 * @generated
	 */
	EReference getParticipateInfoByInteraction_ToRoleTypeRef();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw <em>Interaction Lpw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Lpw</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw
	 * @generated
	 */
	EClass getInteractionLpw();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getFromRoleType <em>From Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getFromRoleType()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EReference getInteractionLpw_FromRoleType();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getToRoleType <em>To Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getToRoleType()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EReference getInteractionLpw_ToRoleType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getOpperation <em>Opperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opperation</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getOpperation()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EAttribute getInteractionLpw_Opperation();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getTimeout()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EAttribute getInteractionLpw_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAlign()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EAttribute getInteractionLpw_Align();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interaction</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getInteraction()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EReference getInteractionLpw_Interaction();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAsyn <em>Asyn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asyn</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.InteractionLpw#getAsyn()
	 * @see #getInteractionLpw()
	 * @generated
	 */
	EAttribute getInteractionLpw_Asyn();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp <em>Role Type Zlp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Zlp</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeZlp
	 * @generated
	 */
	EClass getRoleTypeZlp();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getParticipantBelongedByRoleType <em>Participant Belonged By Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant Belonged By Role Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getParticipantBelongedByRoleType()
	 * @see #getRoleTypeZlp()
	 * @generated
	 */
	EReference getRoleTypeZlp_ParticipantBelongedByRoleType();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.RoleTypeZlp#getFree()
	 * @see #getRoleTypeZlp()
	 * @generated
	 */
	EAttribute getRoleTypeZlp_Free();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange <em>Send By Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send By Exchange</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SendByExchange
	 * @generated
	 */
	EClass getSendByExchange();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariable <em>Send Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariable()
	 * @see #getSendByExchange()
	 * @generated
	 */
	EReference getSendByExchange_SendVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariablePart <em>Send Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendVariablePart()
	 * @see #getSendByExchange()
	 * @generated
	 */
	EAttribute getSendByExchange_SendVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendCaseException <em>Send Case Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Case Exception</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.SendByExchange#getSendCaseException()
	 * @see #getSendByExchange()
	 * @generated
	 */
	EAttribute getSendByExchange_SendCaseException();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange <em>Receive By Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive By Exchange</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ReceiveByExchange
	 * @generated
	 */
	EClass getReceiveByExchange();

	/**
	 * Returns the meta object for the reference '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariable <em>Receive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Variable</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariable()
	 * @see #getReceiveByExchange()
	 * @generated
	 */
	EReference getReceiveByExchange_ReceiveVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariablePart <em>Receive Variable Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive Variable Part</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveVariablePart()
	 * @see #getReceiveByExchange()
	 * @generated
	 */
	EAttribute getReceiveByExchange_ReceiveVariablePart();

	/**
	 * Returns the meta object for the attribute '{@link edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveCaseException <em>Receive Case Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive Case Exception</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ReceiveByExchange#getReceiveCaseException()
	 * @see #getReceiveByExchange()
	 * @generated
	 */
	EAttribute getReceiveByExchange_ReceiveCaseException();

	/**
	 * Returns the meta object for class '{@link edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit <em>Scope With No Attr Of Work Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope With No Attr Of Work Unit</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit
	 * @generated
	 */
	EClass getScopeWithNoAttrOfWorkUnit();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType <em>Action Type Enum By Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type Enum By Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
	 * @generated
	 */
	EEnum getActionTypeEnumByChannelType();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo <em>Action Type Enum By Exchange Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type Enum By Exchange Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo
	 * @generated
	 */
	EEnum getActionTypeEnumByExchangeInfo();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType <em>Usage Type Enum By Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Type Enum By Channel Type</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType
	 * @generated
	 */
	EEnum getUsageTypeEnumByChannelType();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo <em>When Type Enum By Record Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>When Type Enum By Record Info</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo
	 * @generated
	 */
	EEnum getWhenTypeEnumByRecordInfo();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify <em>Key Type Enum By Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Type Enum By Identify</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify
	 * @generated
	 */
	EEnum getKeyTypeEnumByIdentify();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.ChoreographyState <em>Choreography State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choreography State</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ChoreographyState
	 * @generated
	 */
	EEnum getChoreographyState();

	/**
	 * Returns the meta object for enum '{@link edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity <em>Activity State Enum By Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity State Enum By Activity</em>'.
	 * @see edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity
	 * @generated
	 */
	EEnum getActivityStateEnumByActivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDLFactory getCDLFactory();

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
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ActivityImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__LOCKED = eINSTANCE.getActivity_Locked();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__STATE = eINSTANCE.getActivity_State();

		/**
		 * The meta object literal for the '<em><b>The Belonged Role Type Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__THE_BELONGED_ROLE_TYPE_MATRIX = eINSTANCE.getActivity_TheBelongedRoleTypeMatrix();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.AssignImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Copy Of Assign</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__COPY_OF_ASSIGN = eINSTANCE.getAssign_CopyOfAssign();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__ROLE_TYPE = eINSTANCE.getAssign_RoleType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.BehaviorOfRoleTypeImpl <em>Behavior Of Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.BehaviorOfRoleTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getBehaviorOfRoleType()
		 * @generated
		 */
		EClass BEHAVIOR_OF_ROLE_TYPE = eINSTANCE.getBehaviorOfRoleType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_OF_ROLE_TYPE__INTERFACE = eINSTANCE.getBehaviorOfRoleType_Interface();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl <em>Bind Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.BindInfoImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getBindInfo()
		 * @generated
		 */
		EClass BIND_INFO = eINSTANCE.getBindInfo();

		/**
		 * The meta object literal for the '<em><b>This Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_INFO__THIS_VARIABLE = eINSTANCE.getBindInfo_ThisVariable();

		/**
		 * The meta object literal for the '<em><b>This Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_INFO__THIS_ROLE = eINSTANCE.getBindInfo_ThisRole();

		/**
		 * The meta object literal for the '<em><b>Free Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_INFO__FREE_VARIABLE = eINSTANCE.getBindInfo_FreeVariable();

		/**
		 * The meta object literal for the '<em><b>Free Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIND_INFO__FREE_ROLE = eINSTANCE.getBindInfo_FreeRole();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCDLElement()
		 * @generated
		 */
		EClass CDL_ELEMENT = eINSTANCE.getCDLElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDL_ELEMENT__DESCRIPTION = eINSTANCE.getCDLElement_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDL_ELEMENT__NAME = eINSTANCE.getCDLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Addition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDL_ELEMENT__ADDITION = eINSTANCE.getCDLElement_Addition();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ChannelTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__USAGE = eINSTANCE.getChannelType_Usage();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__ACTION = eINSTANCE.getChannelType_Action();

		/**
		 * The meta object literal for the '<em><b>Passing Info By Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__PASSING_INFO_BY_CHANNEL = eINSTANCE.getChannelType_PassingInfoByChannel();

		/**
		 * The meta object literal for the '<em><b>The Behavior Of The Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__THE_BEHAVIOR_OF_THE_ROLE_TYPE = eINSTANCE.getChannelType_TheBehaviorOfTheRoleType();

		/**
		 * The meta object literal for the '<em><b>Referenced Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__REFERENCED_TOKEN = eINSTANCE.getChannelType_ReferencedToken();

		/**
		 * The meta object literal for the '<em><b>Identities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__IDENTITIES = eINSTANCE.getChannelType_Identities();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__ROLE_TYPE = eINSTANCE.getChannelType_RoleType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__COMPLETE = eINSTANCE.getChoreography_Complete();

		/**
		 * The meta object literal for the '<em><b>Isolation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__ISOLATION = eINSTANCE.getChoreography_Isolation();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__ROOT = eINSTANCE.getChoreography_Root();

		/**
		 * The meta object literal for the '<em><b>Coordination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__COORDINATION = eINSTANCE.getChoreography_Coordination();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__RELATIONSHIPS = eINSTANCE.getChoreography_Relationships();

		/**
		 * The meta object literal for the '<em><b>Enclosed Choreographies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES = eINSTANCE.getChoreography_EnclosedChoreographies();

		/**
		 * The meta object literal for the '<em><b>Role Type Matrix Playing Role In Choreo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO = eINSTANCE.getChoreography_RoleTypeMatrixPlayingRoleInChoreo();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__VARIABLES = eINSTANCE.getChoreography_Variables();

		/**
		 * The meta object literal for the '<em><b>Exception Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__EXCEPTION_BLOCK = eINSTANCE.getChoreography_ExceptionBlock();

		/**
		 * The meta object literal for the '<em><b>Finalizer Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__FINALIZER_BLOCKS = eINSTANCE.getChoreography_FinalizerBlocks();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__ACTIVITIES = eINSTANCE.getChoreography_Activities();

		/**
		 * The meta object literal for the '<em><b>Enclosing Choreographies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES = eINSTANCE.getChoreography_EnclosingChoreographies();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl <em>Case Conditional Of Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CaseConditionalOfSwitchImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCaseConditionalOfSwitch()
		 * @generated
		 */
		EClass CASE_CONDITIONAL_OF_SWITCH = eINSTANCE.getCaseConditionalOfSwitch();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl <em>Copy Of Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CopyOfAssignImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getCopyOfAssign()
		 * @generated
		 */
		EClass COPY_OF_ASSIGN = eINSTANCE.getCopyOfAssign();

		/**
		 * The meta object literal for the '<em><b>Source Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_OF_ASSIGN__SOURCE_VARIABLE = eINSTANCE.getCopyOfAssign_SourceVariable();

		/**
		 * The meta object literal for the '<em><b>Source Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OF_ASSIGN__SOURCE_EXPRESSION = eINSTANCE.getCopyOfAssign_SourceExpression();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_OF_ASSIGN__TARGET_VARIABLE = eINSTANCE.getCopyOfAssign_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Cause Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OF_ASSIGN__CAUSE_EXCEPTION = eINSTANCE.getCopyOfAssign_CauseException();

		/**
		 * The meta object literal for the '<em><b>Source Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OF_ASSIGN__SOURCE_VARIABLE_PART = eINSTANCE.getCopyOfAssign_SourceVariablePart();

		/**
		 * The meta object literal for the '<em><b>Target Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OF_ASSIGN__TARGET_VARIABLE_PART = eINSTANCE.getCopyOfAssign_TargetVariablePart();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InfoOrChannelImpl <em>Info Or Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.InfoOrChannelImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInfoOrChannel()
		 * @generated
		 */
		EClass INFO_OR_CHANNEL = eINSTANCE.getInfoOrChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl <em>Exception Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExceptionBlock()
		 * @generated
		 */
		EClass EXCEPTION_BLOCK = eINSTANCE.getExceptionBlock();

		/**
		 * The meta object literal for the '<em><b>Exception Work Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS = eINSTANCE.getExceptionBlock_ExceptionWorkUnits();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl <em>Exception Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExceptionWorkUnit()
		 * @generated
		 */
		EClass EXCEPTION_WORK_UNIT = eINSTANCE.getExceptionWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_WORK_UNIT__EXCEPTION_TYPE = eINSTANCE.getExceptionWorkUnit_ExceptionType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl <em>Exchange Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ExchangeInfoImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getExchangeInfo()
		 * @generated
		 */
		EClass EXCHANGE_INFO = eINSTANCE.getExchangeInfo();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_INFO__TYPE = eINSTANCE.getExchangeInfo_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__ACTION = eINSTANCE.getExchangeInfo_Action();

		/**
		 * The meta object literal for the '<em><b>Send Record Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_INFO__SEND_RECORD_REFERENCE = eINSTANCE.getExchangeInfo_SendRecordReference();

		/**
		 * The meta object literal for the '<em><b>Receive Record Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_INFO__RECEIVE_RECORD_REFERENCE = eINSTANCE.getExchangeInfo_ReceiveRecordReference();

		/**
		 * The meta object literal for the '<em><b>Fault Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__FAULT_NAME = eINSTANCE.getExchangeInfo_FaultName();

		/**
		 * The meta object literal for the '<em><b>Send Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_INFO__SEND_VARIABLE = eINSTANCE.getExchangeInfo_SendVariable();

		/**
		 * The meta object literal for the '<em><b>Send Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__SEND_VARIABLE_PART = eINSTANCE.getExchangeInfo_SendVariablePart();

		/**
		 * The meta object literal for the '<em><b>Cause Exception Of Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__CAUSE_EXCEPTION_OF_SEND = eINSTANCE.getExchangeInfo_CauseExceptionOfSend();

		/**
		 * The meta object literal for the '<em><b>Receive Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_INFO__RECEIVE_VARIABLE = eINSTANCE.getExchangeInfo_ReceiveVariable();

		/**
		 * The meta object literal for the '<em><b>Receive Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__RECEIVE_VARIABLE_PART = eINSTANCE.getExchangeInfo_ReceiveVariablePart();

		/**
		 * The meta object literal for the '<em><b>Cause Exception Of Receive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_INFO__CAUSE_EXCEPTION_OF_RECEIVE = eINSTANCE.getExchangeInfo_CauseExceptionOfReceive();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl <em>Finalize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getFinalize()
		 * @generated
		 */
		EClass FINALIZE = eINSTANCE.getFinalize();

		/**
		 * The meta object literal for the '<em><b>Choreography</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__CHOREOGRAPHY = eINSTANCE.getFinalize_Choreography();

		/**
		 * The meta object literal for the '<em><b>Choreography Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINALIZE__CHOREOGRAPHY_INSTANCE_ID = eINSTANCE.getFinalize_ChoreographyInstanceId();

		/**
		 * The meta object literal for the '<em><b>Finalizer Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__FINALIZER_BLOCK = eINSTANCE.getFinalize_FinalizerBlock();

		/**
		 * The meta object literal for the '<em><b>Role Type Matrix Bind Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO = eINSTANCE.getFinalize_RoleTypeMatrixBindInfo();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl <em>Finalizer Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getFinalizerBlock()
		 * @generated
		 */
		EClass FINALIZER_BLOCK = eINSTANCE.getFinalizerBlock();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINALIZER_BLOCK__ACTIVITIES = eINSTANCE.getFinalizerBlock_Activities();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.IdentityImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getIdentity()
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
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY__TOKENS = eINSTANCE.getIdentity_Tokens();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InformationTypeImpl <em>Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.InformationTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInformationType()
		 * @generated
		 */
		EClass INFORMATION_TYPE = eINSTANCE.getInformationType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__TYPE_NAME = eINSTANCE.getInformationType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_TYPE__ELEMENT_NAME = eINSTANCE.getInformationType_ElementName();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__OPERATION = eINSTANCE.getInteraction_Operation();

		/**
		 * The meta object literal for the '<em><b>Channel Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__CHANNEL_VARIABLE = eINSTANCE.getInteraction_ChannelVariable();

		/**
		 * The meta object literal for the '<em><b>Timeout Of Time To Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE = eINSTANCE.getInteraction_TimeoutOfTimeToComplete();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__ALIGN = eINSTANCE.getInteraction_Align();

		/**
		 * The meta object literal for the '<em><b>Initiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__INITIATE = eINSTANCE.getInteraction_Initiate();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__RELATIONSHIP = eINSTANCE.getInteraction_Relationship();

		/**
		 * The meta object literal for the '<em><b>Exchange Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__EXCHANGE_INFOS = eINSTANCE.getInteraction_ExchangeInfos();

		/**
		 * The meta object literal for the '<em><b>Record Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__RECORD_INFOS = eINSTANCE.getInteraction_RecordInfos();

		/**
		 * The meta object literal for the '<em><b>Timeout From Role Type Record Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO = eINSTANCE.getInteraction_TimeoutFromRoleTypeRecordInfo();

		/**
		 * The meta object literal for the '<em><b>Timeout To Role Type Record Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO = eINSTANCE.getInteraction_TimeoutToRoleTypeRecordInfo();

		/**
		 * The meta object literal for the '<em><b>From Role Type Of Belonged Role Type Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX = eINSTANCE.getInteraction_FromRoleTypeOfBelongedRoleTypeMatrix();

		/**
		 * The meta object literal for the '<em><b>To Role Type Of Belonged Role Type Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX = eINSTANCE.getInteraction_ToRoleTypeOfBelongedRoleTypeMatrix();

		/**
		 * The meta object literal for the '<em><b>Participate By Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__PARTICIPATE_BY_INTERACTION = eINSTANCE.getInteraction_ParticipateByInteraction();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.NamespaceImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getNamespace()
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
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl <em>No Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getNoAction()
		 * @generated
		 */
		EClass NO_ACTION = eINSTANCE.getNoAction();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_ACTION__ROLE_TYPE = eINSTANCE.getNoAction_RoleType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.PackageImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__AUTHOR = eINSTANCE.getPackage_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__TARGET_NAMESPACE = eINSTANCE.getPackage_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NAMESPACES = eINSTANCE.getPackage_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Information Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__INFORMATION_TYPES = eINSTANCE.getPackage_InformationTypes();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TOKENS = eINSTANCE.getPackage_Tokens();

		/**
		 * The meta object literal for the '<em><b>Token Locators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TOKEN_LOCATORS = eINSTANCE.getPackage_TokenLocators();

		/**
		 * The meta object literal for the '<em><b>Role Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ROLE_TYPES = eINSTANCE.getPackage_RoleTypes();

		/**
		 * The meta object literal for the '<em><b>Relationship Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__RELATIONSHIP_TYPES = eINSTANCE.getPackage_RelationshipTypes();

		/**
		 * The meta object literal for the '<em><b>Participant Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PARTICIPANT_TYPES = eINSTANCE.getPackage_ParticipantTypes();

		/**
		 * The meta object literal for the '<em><b>Channel Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CHANNEL_TYPES = eINSTANCE.getPackage_ChannelTypes();

		/**
		 * The meta object literal for the '<em><b>Choreographies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CHOREOGRAPHIES = eINSTANCE.getPackage_Choreographies();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl <em>Participant Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ParticipantTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParticipantType()
		 * @generated
		 */
		EClass PARTICIPANT_TYPE = eINSTANCE.getParticipantType();

		/**
		 * The meta object literal for the '<em><b>Role Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_TYPE__ROLE_TYPES = eINSTANCE.getParticipantType_RoleTypes();

		/**
		 * The meta object literal for the '<em><b>Stateless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_TYPE__STATELESS = eINSTANCE.getParticipantType_Stateless();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_TYPE__FREE = eINSTANCE.getParticipantType_Free();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl <em>Passing Info Of The Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.PassingInfoOfTheChannelTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPassingInfoOfTheChannelType()
		 * @generated
		 */
		EClass PASSING_INFO_OF_THE_CHANNEL_TYPE = eINSTANCE.getPassingInfoOfTheChannelType();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSING_INFO_OF_THE_CHANNEL_TYPE__CHANNEL = eINSTANCE.getPassingInfoOfTheChannelType_Channel();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSING_INFO_OF_THE_CHANNEL_TYPE__ACTION = eINSTANCE.getPassingInfoOfTheChannelType_Action();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSING_INFO_OF_THE_CHANNEL_TYPE__NEW = eINSTANCE.getPassingInfoOfTheChannelType_New();

		/**
		 * The meta object literal for the '<em><b>Enclosing Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSING_INFO_OF_THE_CHANNEL_TYPE__ENCLOSING_CHANNEL = eINSTANCE.getPassingInfoOfTheChannelType_EnclosingChannel();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.PerformImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '<em><b>Binds Of Perform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__BINDS_OF_PERFORM = eINSTANCE.getPerform_BindsOfPerform();

		/**
		 * The meta object literal for the '<em><b>Choreography Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__CHOREOGRAPHY_INSTANCE_ID = eINSTANCE.getPerform_ChoreographyInstanceId();

		/**
		 * The meta object literal for the '<em><b>Choreography</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__CHOREOGRAPHY = eINSTANCE.getPerform_Choreography();

		/**
		 * The meta object literal for the '<em><b>Wait For Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__WAIT_FOR_COMPLETION = eINSTANCE.getPerform_WaitForCompletion();

		/**
		 * The meta object literal for the '<em><b>Role Type Matrix Bind Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS = eINSTANCE.getPerform_RoleTypeMatrixBindInfos();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__BLOCK = eINSTANCE.getPerform_Block();

		/**
		 * The meta object literal for the '<em><b>Choreography Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM__CHOREOGRAPHY_NAME = eINSTANCE.getPerform_ChoreographyName();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl <em>Record Element Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RecordElementInfoImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRecordElementInfo()
		 * @generated
		 */
		EClass RECORD_ELEMENT_INFO = eINSTANCE.getRecordElementInfo();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ELEMENT_INFO__WHEN = eINSTANCE.getRecordElementInfo_When();

		/**
		 * The meta object literal for the '<em><b>Source Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_ELEMENT_INFO__SOURCE_VARIABLE = eINSTANCE.getRecordElementInfo_SourceVariable();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_ELEMENT_INFO__TARGET_VARIABLE = eINSTANCE.getRecordElementInfo_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Cause Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ELEMENT_INFO__CAUSE_EXCEPTION = eINSTANCE.getRecordElementInfo_CauseException();

		/**
		 * The meta object literal for the '<em><b>Source Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ELEMENT_INFO__SOURCE_EXPRESSION = eINSTANCE.getRecordElementInfo_SourceExpression();

		/**
		 * The meta object literal for the '<em><b>Source Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ELEMENT_INFO__SOURCE_VARIABLE_PART = eINSTANCE.getRecordElementInfo_SourceVariablePart();

		/**
		 * The meta object literal for the '<em><b>Target Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_ELEMENT_INFO__TARGET_VARIABLE_PART = eINSTANCE.getRecordElementInfo_TargetVariablePart();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RelationshipTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Role Type Of First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__ROLE_TYPE_OF_FIRST = eINSTANCE.getRelationshipType_RoleTypeOfFirst();

		/**
		 * The meta object literal for the '<em><b>Behaviors Of Role Type First</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_FIRST = eINSTANCE.getRelationshipType_BehaviorsOfRoleTypeFirst();

		/**
		 * The meta object literal for the '<em><b>Role Type Of Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__ROLE_TYPE_OF_SECOND = eINSTANCE.getRelationshipType_RoleTypeOfSecond();

		/**
		 * The meta object literal for the '<em><b>Behaviors Of Role Type Second</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__BEHAVIORS_OF_ROLE_TYPE_SECOND = eINSTANCE.getRelationshipType_BehaviorsOfRoleTypeSecond();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__BEHAVIORS = eINSTANCE.getRoleType_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Stateless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__STATELESS = eINSTANCE.getRoleType_Stateless();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__FREE = eINSTANCE.getRoleType_Free();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl <em>Silent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSilentAction()
		 * @generated
		 */
		EClass SILENT_ACTION = eINSTANCE.getSilentAction();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SILENT_ACTION__ROLE_TYPE = eINSTANCE.getSilentAction_RoleType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.TokenImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__INFORMATION_TYPE = eINSTANCE.getToken_InformationType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl <em>Token Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.TokenLocatorImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getTokenLocator()
		 * @generated
		 */
		EClass TOKEN_LOCATOR = eINSTANCE.getTokenLocator();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LOCATOR__TOKEN = eINSTANCE.getTokenLocator_Token();

		/**
		 * The meta object literal for the '<em><b>Information Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LOCATOR__INFORMATION_TYPE = eINSTANCE.getTokenLocator_InformationType();

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
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.VariableImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

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
		 * The meta object literal for the '<em><b>Role Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ROLE_TYPES = eINSTANCE.getVariable_RoleTypes();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl <em>Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.WorkUnitImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWorkUnit()
		 * @generated
		 */
		EClass WORK_UNIT = eINSTANCE.getWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Guard Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_UNIT__GUARD_EXPRESSION = eINSTANCE.getWorkUnit_GuardExpression();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_UNIT__BLOCK = eINSTANCE.getWorkUnit_Block();

		/**
		 * The meta object literal for the '<em><b>Repeat Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_UNIT__REPEAT_EXPRESSION = eINSTANCE.getWorkUnit_RepeatExpression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl <em>When With Block Of Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhenWithBlockOfWorkUnit()
		 * @generated
		 */
		EClass WHEN_WITH_BLOCK_OF_WORK_UNIT = eINSTANCE.getWhenWithBlockOfWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Matched Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_WITH_BLOCK_OF_WORK_UNIT__MATCHED_EXPRESSION = eINSTANCE.getWhenWithBlockOfWorkUnit_MatchedExpression();

		/**
		 * The meta object literal for the '<em><b>Is Matched</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_WITH_BLOCK_OF_WORK_UNIT__IS_MATCHED = eINSTANCE.getWhenWithBlockOfWorkUnit_IsMatched();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl <em>While With Repeate Of Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhileWithRepeateOfWorkUnit()
		 * @generated
		 */
		EClass WHILE_WITH_REPEATE_OF_WORK_UNIT = eINSTANCE.getWhileWithRepeateOfWorkUnit();

		/**
		 * The meta object literal for the '<em><b>Break Out Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_WITH_REPEATE_OF_WORK_UNIT__BREAK_OUT_EXPRESSION = eINSTANCE.getWhileWithRepeateOfWorkUnit_BreakOutExpression();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl <em>Role Type Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeMatrix()
		 * @generated
		 */
		EClass ROLE_TYPE_MATRIX = eINSTANCE.getRoleTypeMatrix();

		/**
		 * The meta object literal for the '<em><b>Role Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_MATRIX__ROLE_TYPES = eINSTANCE.getRoleTypeMatrix_RoleTypes();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_MATRIX__FREE = eINSTANCE.getRoleTypeMatrix_Free();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl <em>Role Type Matrix Bind Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeMatrixBindInfoImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeMatrixBindInfo()
		 * @generated
		 */
		EClass ROLE_TYPE_MATRIX_BIND_INFO = eINSTANCE.getRoleTypeMatrixBindInfo();

		/**
		 * The meta object literal for the '<em><b>This Role Type Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_MATRIX_BIND_INFO__THIS_ROLE_TYPE_MATRIX = eINSTANCE.getRoleTypeMatrixBindInfo_ThisRoleTypeMatrix();

		/**
		 * The meta object literal for the '<em><b>Free Role Type Matrix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_MATRIX_BIND_INFO__FREE_ROLE_TYPE_MATRIX = eINSTANCE.getRoleTypeMatrixBindInfo_FreeRoleTypeMatrix();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.OrderingStructuralActivityImpl <em>Ordering Structural Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.OrderingStructuralActivityImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getOrderingStructuralActivity()
		 * @generated
		 */
		EClass ORDERING_STRUCTURAL_ACTIVITY = eINSTANCE.getOrderingStructuralActivity();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERING_STRUCTURAL_ACTIVITY__ACTIVITIES = eINSTANCE.getOrderingStructuralActivity_Activities();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl <em>Participate Info By Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ParticipateInfoByInteractionImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getParticipateInfoByInteraction()
		 * @generated
		 */
		EClass PARTICIPATE_INFO_BY_INTERACTION = eINSTANCE.getParticipateInfoByInteraction();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPATE_INFO_BY_INTERACTION__RELATIONSHIP_TYPE = eINSTANCE.getParticipateInfoByInteraction_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>From Role Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPATE_INFO_BY_INTERACTION__FROM_ROLE_TYPE_REF = eINSTANCE.getParticipateInfoByInteraction_FromRoleTypeRef();

		/**
		 * The meta object literal for the '<em><b>To Role Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPATE_INFO_BY_INTERACTION__TO_ROLE_TYPE_REF = eINSTANCE.getParticipateInfoByInteraction_ToRoleTypeRef();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl <em>Interaction Lpw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.InteractionLpwImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getInteractionLpw()
		 * @generated
		 */
		EClass INTERACTION_LPW = eINSTANCE.getInteractionLpw();

		/**
		 * The meta object literal for the '<em><b>From Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_LPW__FROM_ROLE_TYPE = eINSTANCE.getInteractionLpw_FromRoleType();

		/**
		 * The meta object literal for the '<em><b>To Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_LPW__TO_ROLE_TYPE = eINSTANCE.getInteractionLpw_ToRoleType();

		/**
		 * The meta object literal for the '<em><b>Opperation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_LPW__OPPERATION = eINSTANCE.getInteractionLpw_Opperation();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_LPW__TIMEOUT = eINSTANCE.getInteractionLpw_Timeout();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_LPW__ALIGN = eINSTANCE.getInteractionLpw_Align();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_LPW__INTERACTION = eINSTANCE.getInteractionLpw_Interaction();

		/**
		 * The meta object literal for the '<em><b>Asyn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_LPW__ASYN = eINSTANCE.getInteractionLpw_Asyn();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl <em>Role Type Zlp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.RoleTypeZlpImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getRoleTypeZlp()
		 * @generated
		 */
		EClass ROLE_TYPE_ZLP = eINSTANCE.getRoleTypeZlp();

		/**
		 * The meta object literal for the '<em><b>Participant Belonged By Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_ZLP__PARTICIPANT_BELONGED_BY_ROLE_TYPE = eINSTANCE.getRoleTypeZlp_ParticipantBelongedByRoleType();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_ZLP__FREE = eINSTANCE.getRoleTypeZlp_Free();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl <em>Send By Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.SendByExchangeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getSendByExchange()
		 * @generated
		 */
		EClass SEND_BY_EXCHANGE = eINSTANCE.getSendByExchange();

		/**
		 * The meta object literal for the '<em><b>Send Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_BY_EXCHANGE__SEND_VARIABLE = eINSTANCE.getSendByExchange_SendVariable();

		/**
		 * The meta object literal for the '<em><b>Send Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_BY_EXCHANGE__SEND_VARIABLE_PART = eINSTANCE.getSendByExchange_SendVariablePart();

		/**
		 * The meta object literal for the '<em><b>Send Case Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_BY_EXCHANGE__SEND_CASE_EXCEPTION = eINSTANCE.getSendByExchange_SendCaseException();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl <em>Receive By Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ReceiveByExchangeImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getReceiveByExchange()
		 * @generated
		 */
		EClass RECEIVE_BY_EXCHANGE = eINSTANCE.getReceiveByExchange();

		/**
		 * The meta object literal for the '<em><b>Receive Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE = eINSTANCE.getReceiveByExchange_ReceiveVariable();

		/**
		 * The meta object literal for the '<em><b>Receive Variable Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_BY_EXCHANGE__RECEIVE_VARIABLE_PART = eINSTANCE.getReceiveByExchange_ReceiveVariablePart();

		/**
		 * The meta object literal for the '<em><b>Receive Case Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_BY_EXCHANGE__RECEIVE_CASE_EXCEPTION = eINSTANCE.getReceiveByExchange_ReceiveCaseException();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl <em>Scope With No Attr Of Work Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getScopeWithNoAttrOfWorkUnit()
		 * @generated
		 */
		EClass SCOPE_WITH_NO_ATTR_OF_WORK_UNIT = eINSTANCE.getScopeWithNoAttrOfWorkUnit();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType <em>Action Type Enum By Channel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActionTypeEnumByChannelType()
		 * @generated
		 */
		EEnum ACTION_TYPE_ENUM_BY_CHANNEL_TYPE = eINSTANCE.getActionTypeEnumByChannelType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo <em>Action Type Enum By Exchange Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActionTypeEnumByExchangeInfo()
		 * @generated
		 */
		EEnum ACTION_TYPE_ENUM_BY_EXCHANGE_INFO = eINSTANCE.getActionTypeEnumByExchangeInfo();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType <em>Usage Type Enum By Channel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getUsageTypeEnumByChannelType()
		 * @generated
		 */
		EEnum USAGE_TYPE_ENUM_BY_CHANNEL_TYPE = eINSTANCE.getUsageTypeEnumByChannelType();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo <em>When Type Enum By Record Info</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getWhenTypeEnumByRecordInfo()
		 * @generated
		 */
		EEnum WHEN_TYPE_ENUM_BY_RECORD_INFO = eINSTANCE.getWhenTypeEnumByRecordInfo();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify <em>Key Type Enum By Identify</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.KeyTypeEnumByIdentify
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getKeyTypeEnumByIdentify()
		 * @generated
		 */
		EEnum KEY_TYPE_ENUM_BY_IDENTIFY = eINSTANCE.getKeyTypeEnumByIdentify();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.ChoreographyState <em>Choreography State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.ChoreographyState
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getChoreographyState()
		 * @generated
		 */
		EEnum CHOREOGRAPHY_STATE = eINSTANCE.getChoreographyState();

		/**
		 * The meta object literal for the '{@link edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity <em>Activity State Enum By Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.xjtu.cdl2bpel.cdl.ActivityStateEnumByActivity
		 * @see edu.xjtu.cdl2bpel.cdl.impl.CDLPackageImpl#getActivityStateEnumByActivity()
		 * @generated
		 */
		EEnum ACTIVITY_STATE_ENUM_BY_ACTIVITY = eINSTANCE.getActivityStateEnumByActivity();

	}

} //CDLPackage
