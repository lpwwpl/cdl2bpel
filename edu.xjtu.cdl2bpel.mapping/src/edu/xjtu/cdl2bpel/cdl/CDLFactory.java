/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLFactory.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage
 * @generated
 */
public interface CDLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDLFactory eINSTANCE = edu.xjtu.cdl2bpel.cdl.impl.CDLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assign</em>'.
	 * @generated
	 */
	Assign createAssign();

	/**
	 * Returns a new object of class '<em>Behavior Of Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Of Role Type</em>'.
	 * @generated
	 */
	BehaviorOfRoleType createBehaviorOfRoleType();

	/**
	 * Returns a new object of class '<em>Bind Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bind Info</em>'.
	 * @generated
	 */
	BindInfo createBindInfo();

	/**
	 * Returns a new object of class '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Type</em>'.
	 * @generated
	 */
	ChannelType createChannelType();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography</em>'.
	 * @generated
	 */
	Choreography createChoreography();

	/**
	 * Returns a new object of class '<em>Case Conditional Of Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Conditional Of Switch</em>'.
	 * @generated
	 */
	CaseConditionalOfSwitch createCaseConditionalOfSwitch();

	/**
	 * Returns a new object of class '<em>Copy Of Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Of Assign</em>'.
	 * @generated
	 */
	CopyOfAssign createCopyOfAssign();

	/**
	 * Returns a new object of class '<em>Exception Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Block</em>'.
	 * @generated
	 */
	ExceptionBlock createExceptionBlock();

	/**
	 * Returns a new object of class '<em>Exception Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Work Unit</em>'.
	 * @generated
	 */
	ExceptionWorkUnit createExceptionWorkUnit();

	/**
	 * Returns a new object of class '<em>Exchange Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exchange Info</em>'.
	 * @generated
	 */
	ExchangeInfo createExchangeInfo();

	/**
	 * Returns a new object of class '<em>Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalize</em>'.
	 * @generated
	 */
	Finalize createFinalize();

	/**
	 * Returns a new object of class '<em>Finalizer Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalizer Block</em>'.
	 * @generated
	 */
	FinalizerBlock createFinalizerBlock();

	/**
	 * Returns a new object of class '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity</em>'.
	 * @generated
	 */
	Identity createIdentity();

	/**
	 * Returns a new object of class '<em>Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Type</em>'.
	 * @generated
	 */
	InformationType createInformationType();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>No Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Action</em>'.
	 * @generated
	 */
	NoAction createNoAction();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Participant Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Type</em>'.
	 * @generated
	 */
	ParticipantType createParticipantType();

	/**
	 * Returns a new object of class '<em>Passing Info Of The Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passing Info Of The Channel Type</em>'.
	 * @generated
	 */
	PassingInfoOfTheChannelType createPassingInfoOfTheChannelType();

	/**
	 * Returns a new object of class '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform</em>'.
	 * @generated
	 */
	Perform createPerform();

	/**
	 * Returns a new object of class '<em>Record Element Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Element Info</em>'.
	 * @generated
	 */
	RecordElementInfo createRecordElementInfo();

	/**
	 * Returns a new object of class '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Type</em>'.
	 * @generated
	 */
	RelationshipType createRelationshipType();

	/**
	 * Returns a new object of class '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type</em>'.
	 * @generated
	 */
	RoleType createRoleType();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Silent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Silent Action</em>'.
	 * @generated
	 */
	SilentAction createSilentAction();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Token Locator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token Locator</em>'.
	 * @generated
	 */
	TokenLocator createTokenLocator();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>When With Block Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When With Block Of Work Unit</em>'.
	 * @generated
	 */
	WhenWithBlockOfWorkUnit createWhenWithBlockOfWorkUnit();

	/**
	 * Returns a new object of class '<em>While With Repeate Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While With Repeate Of Work Unit</em>'.
	 * @generated
	 */
	WhileWithRepeateOfWorkUnit createWhileWithRepeateOfWorkUnit();

	/**
	 * Returns a new object of class '<em>Role Type Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type Matrix</em>'.
	 * @generated
	 */
	RoleTypeMatrix createRoleTypeMatrix();

	/**
	 * Returns a new object of class '<em>Role Type Matrix Bind Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type Matrix Bind Info</em>'.
	 * @generated
	 */
	RoleTypeMatrixBindInfo createRoleTypeMatrixBindInfo();

	/**
	 * Returns a new object of class '<em>Participate Info By Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participate Info By Interaction</em>'.
	 * @generated
	 */
	ParticipateInfoByInteraction createParticipateInfoByInteraction();

	/**
	 * Returns a new object of class '<em>Interaction Lpw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Lpw</em>'.
	 * @generated
	 */
	InteractionLpw createInteractionLpw();

	/**
	 * Returns a new object of class '<em>Role Type Zlp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type Zlp</em>'.
	 * @generated
	 */
	RoleTypeZlp createRoleTypeZlp();

	/**
	 * Returns a new object of class '<em>Send By Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send By Exchange</em>'.
	 * @generated
	 */
	SendByExchange createSendByExchange();

	/**
	 * Returns a new object of class '<em>Receive By Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive By Exchange</em>'.
	 * @generated
	 */
	ReceiveByExchange createReceiveByExchange();

	/**
	 * Returns a new object of class '<em>Scope With No Attr Of Work Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope With No Attr Of Work Unit</em>'.
	 * @generated
	 */
	ScopeWithNoAttrOfWorkUnit createScopeWithNoAttrOfWorkUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDLPackage getCDLPackage();

} //CDLFactory
