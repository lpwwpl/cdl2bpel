/**
 * CDL2BPEL_XJTU
 *
 * $Id: InteractionImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl2wsdl.ExtractCDLInfo2WSDLInfo;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getChannelVariable <em>Channel Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getTimeoutOfTimeToComplete <em>Timeout Of Time To Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getInitiate <em>Initiate</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getExchangeInfos <em>Exchange Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getRecordInfos <em>Record Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getTimeoutFromRoleTypeRecordInfo <em>Timeout From Role Type Record Info</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getTimeoutToRoleTypeRecordInfo <em>Timeout To Role Type Record Info</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getFromRoleTypeOfBelongedRoleTypeMatrix <em>From Role Type Of Belonged Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getToRoleTypeOfBelongedRoleTypeMatrix <em>To Role Type Of Belonged Role Type Matrix</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl#getParticipateByInteraction <em>Participate By Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends ActivityImpl implements Interaction {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannelVariable() <em>Channel Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable channelVariable;

	/**
	 * The default value of the '{@link #getTimeoutOfTimeToComplete() <em>Timeout Of Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutOfTimeToComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_OF_TIME_TO_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutOfTimeToComplete() <em>Timeout Of Time To Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutOfTimeToComplete()
	 * @generated
	 * @ordered
	 */
	protected String timeoutOfTimeToComplete = TIMEOUT_OF_TIME_TO_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALIGN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected Boolean align = ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiate() <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INITIATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInitiate() <em>Initiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiate()
	 * @generated
	 * @ordered
	 */
	protected Boolean initiate = INITIATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType relationship;

	/**
	 * The cached value of the '{@link #getExchangeInfos() <em>Exchange Infos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeInfo> exchangeInfos;

	/**
	 * The cached value of the '{@link #getRecordInfos() <em>Record Infos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordElementInfo> recordInfos;

	/**
	 * The cached value of the '{@link #getTimeoutFromRoleTypeRecordInfo() <em>Timeout From Role Type Record Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutFromRoleTypeRecordInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordElementInfo> timeoutFromRoleTypeRecordInfo;

	/**
	 * The cached value of the '{@link #getTimeoutToRoleTypeRecordInfo() <em>Timeout To Role Type Record Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutToRoleTypeRecordInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordElementInfo> timeoutToRoleTypeRecordInfo;

	/**
	 * The cached value of the '{@link #getFromRoleTypeOfBelongedRoleTypeMatrix() <em>From Role Type Of Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRoleTypeOfBelongedRoleTypeMatrix()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeMatrix fromRoleTypeOfBelongedRoleTypeMatrix;

	/**
	 * The cached value of the '{@link #getToRoleTypeOfBelongedRoleTypeMatrix() <em>To Role Type Of Belonged Role Type Matrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRoleTypeOfBelongedRoleTypeMatrix()
	 * @generated
	 * @ordered
	 */
	protected RoleTypeMatrix toRoleTypeOfBelongedRoleTypeMatrix;

	/**
	 * The cached value of the '{@link #getParticipateByInteraction() <em>Participate By Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipateByInteraction()
	 * @generated
	 * @ordered
	 */
	protected ParticipateInfoByInteraction participateByInteraction;

	private String fromRoleRecordReferences=null;
    private String toRoleRecordReferences=null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getChannelVariable() {
		if (channelVariable != null && channelVariable.eIsProxy()) {
			InternalEObject oldChannelVariable = (InternalEObject)channelVariable;
			channelVariable = (Variable)eResolveProxy(oldChannelVariable);
			if (channelVariable != oldChannelVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION__CHANNEL_VARIABLE, oldChannelVariable, channelVariable));
			}
		}
		return channelVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetChannelVariable() {
		return channelVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelVariable(Variable newChannelVariable) {
		Variable oldChannelVariable = channelVariable;
		channelVariable = newChannelVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__CHANNEL_VARIABLE, oldChannelVariable, channelVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeoutOfTimeToComplete() {
		return timeoutOfTimeToComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutOfTimeToComplete(String newTimeoutOfTimeToComplete) {
		String oldTimeoutOfTimeToComplete = timeoutOfTimeToComplete;
		timeoutOfTimeToComplete = newTimeoutOfTimeToComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE, oldTimeoutOfTimeToComplete, timeoutOfTimeToComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(Boolean newAlign) {
		Boolean oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInitiate() {
		return initiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiate(Boolean newInitiate) {
		Boolean oldInitiate = initiate;
		initiate = newInitiate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__INITIATE, oldInitiate, initiate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (RelationshipType)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(RelationshipType newRelationship) {
		RelationshipType oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeInfo> getExchangeInfos() {
		if (exchangeInfos == null) {
			exchangeInfos = new EObjectContainmentEList<ExchangeInfo>(ExchangeInfo.class, this, CDLPackage.INTERACTION__EXCHANGE_INFOS);
		}
		return exchangeInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordElementInfo> getRecordInfos() {
		if (recordInfos == null) {
			recordInfos = new EObjectContainmentEList<RecordElementInfo>(RecordElementInfo.class, this, CDLPackage.INTERACTION__RECORD_INFOS);
		}
		return recordInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordElementInfo> getTimeoutFromRoleTypeRecordInfo() {
		if (timeoutFromRoleTypeRecordInfo == null) {
			timeoutFromRoleTypeRecordInfo = new EObjectResolvingEList<RecordElementInfo>(RecordElementInfo.class, this, CDLPackage.INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO);
		}
		return timeoutFromRoleTypeRecordInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordElementInfo> getTimeoutToRoleTypeRecordInfo() {
		if (timeoutToRoleTypeRecordInfo == null) {
			timeoutToRoleTypeRecordInfo = new EObjectResolvingEList<RecordElementInfo>(RecordElementInfo.class, this, CDLPackage.INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO);
		}
		return timeoutToRoleTypeRecordInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix getFromRoleTypeOfBelongedRoleTypeMatrix() {
		if (fromRoleTypeOfBelongedRoleTypeMatrix != null && fromRoleTypeOfBelongedRoleTypeMatrix.eIsProxy()) {
			InternalEObject oldFromRoleTypeOfBelongedRoleTypeMatrix = (InternalEObject)fromRoleTypeOfBelongedRoleTypeMatrix;
			fromRoleTypeOfBelongedRoleTypeMatrix = (RoleTypeMatrix)eResolveProxy(oldFromRoleTypeOfBelongedRoleTypeMatrix);
			if (fromRoleTypeOfBelongedRoleTypeMatrix != oldFromRoleTypeOfBelongedRoleTypeMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX, oldFromRoleTypeOfBelongedRoleTypeMatrix, fromRoleTypeOfBelongedRoleTypeMatrix));
			}
		}
		return fromRoleTypeOfBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix basicGetFromRoleTypeOfBelongedRoleTypeMatrix() {
		return fromRoleTypeOfBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix newFromRoleTypeOfBelongedRoleTypeMatrix) {
		RoleTypeMatrix oldFromRoleTypeOfBelongedRoleTypeMatrix = fromRoleTypeOfBelongedRoleTypeMatrix;
		fromRoleTypeOfBelongedRoleTypeMatrix = newFromRoleTypeOfBelongedRoleTypeMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX, oldFromRoleTypeOfBelongedRoleTypeMatrix, fromRoleTypeOfBelongedRoleTypeMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix getToRoleTypeOfBelongedRoleTypeMatrix() {
		if (toRoleTypeOfBelongedRoleTypeMatrix != null && toRoleTypeOfBelongedRoleTypeMatrix.eIsProxy()) {
			InternalEObject oldToRoleTypeOfBelongedRoleTypeMatrix = (InternalEObject)toRoleTypeOfBelongedRoleTypeMatrix;
			toRoleTypeOfBelongedRoleTypeMatrix = (RoleTypeMatrix)eResolveProxy(oldToRoleTypeOfBelongedRoleTypeMatrix);
			if (toRoleTypeOfBelongedRoleTypeMatrix != oldToRoleTypeOfBelongedRoleTypeMatrix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX, oldToRoleTypeOfBelongedRoleTypeMatrix, toRoleTypeOfBelongedRoleTypeMatrix));
			}
		}
		return toRoleTypeOfBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTypeMatrix basicGetToRoleTypeOfBelongedRoleTypeMatrix() {
		return toRoleTypeOfBelongedRoleTypeMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRoleTypeOfBelongedRoleTypeMatrix(RoleTypeMatrix newToRoleTypeOfBelongedRoleTypeMatrix) {
		RoleTypeMatrix oldToRoleTypeOfBelongedRoleTypeMatrix = toRoleTypeOfBelongedRoleTypeMatrix;
		toRoleTypeOfBelongedRoleTypeMatrix = newToRoleTypeOfBelongedRoleTypeMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX, oldToRoleTypeOfBelongedRoleTypeMatrix, toRoleTypeOfBelongedRoleTypeMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipateInfoByInteraction getParticipateByInteraction() {
		if (participateByInteraction != null && participateByInteraction.eIsProxy()) {
			InternalEObject oldParticipateByInteraction = (InternalEObject)participateByInteraction;
			participateByInteraction = (ParticipateInfoByInteraction)eResolveProxy(oldParticipateByInteraction);
			if (participateByInteraction != oldParticipateByInteraction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION, oldParticipateByInteraction, participateByInteraction));
			}
		}
		return participateByInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipateInfoByInteraction basicGetParticipateByInteraction() {
		return participateByInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipateByInteraction(ParticipateInfoByInteraction newParticipateByInteraction) {
		ParticipateInfoByInteraction oldParticipateByInteraction = participateByInteraction;
		participateByInteraction = newParticipateByInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION, oldParticipateByInteraction, participateByInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.INTERACTION__EXCHANGE_INFOS:
				return ((InternalEList<?>)getExchangeInfos()).basicRemove(otherEnd, msgs);
			case CDLPackage.INTERACTION__RECORD_INFOS:
				return ((InternalEList<?>)getRecordInfos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDLPackage.INTERACTION__OPERATION:
				return getOperation();
			case CDLPackage.INTERACTION__CHANNEL_VARIABLE:
				if (resolve) return getChannelVariable();
				return basicGetChannelVariable();
			case CDLPackage.INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE:
				return getTimeoutOfTimeToComplete();
			case CDLPackage.INTERACTION__ALIGN:
				return getAlign();
			case CDLPackage.INTERACTION__INITIATE:
				return getInitiate();
			case CDLPackage.INTERACTION__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case CDLPackage.INTERACTION__EXCHANGE_INFOS:
				return getExchangeInfos();
			case CDLPackage.INTERACTION__RECORD_INFOS:
				return getRecordInfos();
			case CDLPackage.INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO:
				return getTimeoutFromRoleTypeRecordInfo();
			case CDLPackage.INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO:
				return getTimeoutToRoleTypeRecordInfo();
			case CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				if (resolve) return getFromRoleTypeOfBelongedRoleTypeMatrix();
				return basicGetFromRoleTypeOfBelongedRoleTypeMatrix();
			case CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				if (resolve) return getToRoleTypeOfBelongedRoleTypeMatrix();
				return basicGetToRoleTypeOfBelongedRoleTypeMatrix();
			case CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION:
				if (resolve) return getParticipateByInteraction();
				return basicGetParticipateByInteraction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDLPackage.INTERACTION__OPERATION:
				setOperation((String)newValue);
				return;
			case CDLPackage.INTERACTION__CHANNEL_VARIABLE:
				setChannelVariable((Variable)newValue);
				return;
			case CDLPackage.INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE:
				setTimeoutOfTimeToComplete((String)newValue);
				return;
			case CDLPackage.INTERACTION__ALIGN:
				setAlign((Boolean)newValue);
				return;
			case CDLPackage.INTERACTION__INITIATE:
				setInitiate((Boolean)newValue);
				return;
			case CDLPackage.INTERACTION__RELATIONSHIP:
				setRelationship((RelationshipType)newValue);
				return;
			case CDLPackage.INTERACTION__EXCHANGE_INFOS:
				getExchangeInfos().clear();
				getExchangeInfos().addAll((Collection<? extends ExchangeInfo>)newValue);
				return;
			case CDLPackage.INTERACTION__RECORD_INFOS:
				getRecordInfos().clear();
				getRecordInfos().addAll((Collection<? extends RecordElementInfo>)newValue);
				return;
			case CDLPackage.INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO:
				getTimeoutFromRoleTypeRecordInfo().clear();
				getTimeoutFromRoleTypeRecordInfo().addAll((Collection<? extends RecordElementInfo>)newValue);
				return;
			case CDLPackage.INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO:
				getTimeoutToRoleTypeRecordInfo().clear();
				getTimeoutToRoleTypeRecordInfo().addAll((Collection<? extends RecordElementInfo>)newValue);
				return;
			case CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				setFromRoleTypeOfBelongedRoleTypeMatrix((RoleTypeMatrix)newValue);
				return;
			case CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				setToRoleTypeOfBelongedRoleTypeMatrix((RoleTypeMatrix)newValue);
				return;
			case CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION:
				setParticipateByInteraction((ParticipateInfoByInteraction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDLPackage.INTERACTION__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case CDLPackage.INTERACTION__CHANNEL_VARIABLE:
				setChannelVariable((Variable)null);
				return;
			case CDLPackage.INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE:
				setTimeoutOfTimeToComplete(TIMEOUT_OF_TIME_TO_COMPLETE_EDEFAULT);
				return;
			case CDLPackage.INTERACTION__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case CDLPackage.INTERACTION__INITIATE:
				setInitiate(INITIATE_EDEFAULT);
				return;
			case CDLPackage.INTERACTION__RELATIONSHIP:
				setRelationship((RelationshipType)null);
				return;
			case CDLPackage.INTERACTION__EXCHANGE_INFOS:
				getExchangeInfos().clear();
				return;
			case CDLPackage.INTERACTION__RECORD_INFOS:
				getRecordInfos().clear();
				return;
			case CDLPackage.INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO:
				getTimeoutFromRoleTypeRecordInfo().clear();
				return;
			case CDLPackage.INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO:
				getTimeoutToRoleTypeRecordInfo().clear();
				return;
			case CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				setFromRoleTypeOfBelongedRoleTypeMatrix((RoleTypeMatrix)null);
				return;
			case CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				setToRoleTypeOfBelongedRoleTypeMatrix((RoleTypeMatrix)null);
				return;
			case CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION:
				setParticipateByInteraction((ParticipateInfoByInteraction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDLPackage.INTERACTION__OPERATION:
				return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
			case CDLPackage.INTERACTION__CHANNEL_VARIABLE:
				return channelVariable != null;
			case CDLPackage.INTERACTION__TIMEOUT_OF_TIME_TO_COMPLETE:
				return TIMEOUT_OF_TIME_TO_COMPLETE_EDEFAULT == null ? timeoutOfTimeToComplete != null : !TIMEOUT_OF_TIME_TO_COMPLETE_EDEFAULT.equals(timeoutOfTimeToComplete);
			case CDLPackage.INTERACTION__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
			case CDLPackage.INTERACTION__INITIATE:
				return INITIATE_EDEFAULT == null ? initiate != null : !INITIATE_EDEFAULT.equals(initiate);
			case CDLPackage.INTERACTION__RELATIONSHIP:
				return relationship != null;
			case CDLPackage.INTERACTION__EXCHANGE_INFOS:
				return exchangeInfos != null && !exchangeInfos.isEmpty();
			case CDLPackage.INTERACTION__RECORD_INFOS:
				return recordInfos != null && !recordInfos.isEmpty();
			case CDLPackage.INTERACTION__TIMEOUT_FROM_ROLE_TYPE_RECORD_INFO:
				return timeoutFromRoleTypeRecordInfo != null && !timeoutFromRoleTypeRecordInfo.isEmpty();
			case CDLPackage.INTERACTION__TIMEOUT_TO_ROLE_TYPE_RECORD_INFO:
				return timeoutToRoleTypeRecordInfo != null && !timeoutToRoleTypeRecordInfo.isEmpty();
			case CDLPackage.INTERACTION__FROM_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				return fromRoleTypeOfBelongedRoleTypeMatrix != null;
			case CDLPackage.INTERACTION__TO_ROLE_TYPE_OF_BELONGED_ROLE_TYPE_MATRIX:
				return toRoleTypeOfBelongedRoleTypeMatrix != null;
			case CDLPackage.INTERACTION__PARTICIPATE_BY_INTERACTION:
				return participateByInteraction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operation: ");
		result.append(operation);
		result.append(", timeoutOfTimeToComplete: ");
		result.append(timeoutOfTimeToComplete);
		result.append(", align: ");
		result.append(align);
		result.append(", initiate: ");
		result.append(initiate);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param elem
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(CDLElemNameConstants.INTERACTION_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			setOperation(elem.attributeValue("operation"));
			Package thePackage = getBelongedPackage();
			// ChannelType channelType =
			// CDLPackageUtil.getChannelType(thePackage,
			// elem.attributeValue("channelVariable"));
			Variable variable = CDLPackageUtil.getVariable(this, elem
					.attributeValue("channelVariable"));
			setChannelVariable(variable);

			Element participateElement = elem.element("participate");
			String fromRoleTypeValue = participateElement
					.attributeValue("fromRoleTypeRef");
			String toRoleTypeValue = participateElement
					.attributeValue("toRoleTypeRef");
			String relationshipTypeValue = participateElement
					.attributeValue("relationshipType");
			RoleType fromRoleType = CDLPackageUtil.getRoleType(thePackage,
					fromRoleTypeValue);
			RoleType toRoleType = CDLPackageUtil.getRoleType(thePackage,
					toRoleTypeValue);
//			System.out.println(fromRoleType.getName()+"###########");
			RelationshipType relationshipType = CDLPackageUtil.getRelationship(
					thePackage, relationshipTypeValue);
			ParticipateInfoByInteraction participate = CDLFactory.eINSTANCE
					.createParticipateInfoByInteraction();
			participate.setFromRoleTypeRef(fromRoleType);
			participate.setToRoleTypeRef(toRoleType);
			setRelationship(relationshipType);
			// setParticipateByInteraction(participate);
			this.setParticipateByInteraction(participate);
			
			List<Element> timeout=elem.elements("timeout");
			
			if (timeout.size() == 1) {
				importTimeout(timeout.get(0));
			} else if (timeout.size() > 1) {
			}
		}
		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
		super.doSomething();
	}
	
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if (elem.getName().equals(CDLElemNameConstants.EXCHANGE_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createExchangeInfo();
			getExchangeInfos().add((ExchangeInfo) cdlElement);
		} else if (elem.getName().equals(CDLElemNameConstants.RECORD_ELEM_NAME)) {
			cdlElement = CDLFactory.eINSTANCE.createRecordElementInfo();
			getRecordInfos().add((RecordElementInfo) cdlElement);
		}
		return cdlElement;
	}
	
	public RecordElementInfo getRecordElementInfo(String name) {
		return((RecordElementInfo)this.getCDLElementByTheNameAttribute(name, getRecordInfos()));
	}
	
	/**
	 * 
	 * @return
	 */
	public RoleType getTheFromRoleOfInteraction() {
		RoleType ret = null;

		if (getRelationship() != null) {
			ret = getRelationship().getRoleTypeOfFirst();
		}

		return (ret);
	}

	/**
	 * 
	 * @return
	 */
	public RoleType getTheToRoleOfInteraction() {
		RoleType ret = null;
		ret = getRelationship().getRoleTypeOfSecond();
		return (ret);
	}
	
	public ExchangeInfo[] getRequestExchanges() {
		ExchangeInfo[] ret = null;
		Vector v = new Vector();
		Iterator iter = getExchangeInfos().iterator();
		while (ret == null && iter.hasNext()) {
			ExchangeInfo details = (ExchangeInfo) iter.next();

			if (details.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
				v.add(details);
			}
		}

		ret = new ExchangeInfo[v.size()];
		v.copyInto(ret);

		return (ret);
	}

	public ExchangeInfo[] getResponseExchanges() {
		ExchangeInfo[] ret = null;
		Vector v = new Vector();
		Iterator iter = getExchangeInfos().iterator();
		while (ret == null && iter.hasNext()) {
			ExchangeInfo details = (ExchangeInfo) iter.next();

			if (details.getAction() == ActionTypeEnumByExchangeInfo.RESPOND&&details.getFaultName()==null) {
				v.add(details);
			}
		}

		ret = new ExchangeInfo[v.size()];
		v.copyInto(ret);

		return (ret);
	}
	
	public ExchangeInfo[] getFaultExchanges() {
		ExchangeInfo[] ret=null;
		Vector faults=new Vector();
		
		Iterator iter=getExchangeInfos().iterator();
		while (ret == null && iter.hasNext()) {
			ExchangeInfo details = (ExchangeInfo)iter.next();
			
			if (details.getAction() ==
				ActionTypeEnumByExchangeInfo.RESPOND &&
					details.getFaultName()!=null) {
				faults.add(details);
			}
		}
		
		ret = new ExchangeInfo[faults.size()];
		faults.copyInto(ret);
		
		return(ret);
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret=false;
	
		if (this.getTheFromRoleOfInteraction() != null && roleType != null) {
			ret = getTheFromRoleOfInteraction().equals(roleType);
		}
		
		if (ret == false && getTheToRoleOfInteraction() != null && 
						roleType != null) {
			ret = getTheToRoleOfInteraction().equals(roleType);
		}

		return(ret);
	}
	
	public void extractCDLInteractionInfo(ExtractCDLInfo2WSDLInfo visitor) {
		visitor.extractCDLInteraction(this);
	}
	
	protected void importTimeout(Element elem) {

		this.setTimeoutOfTimeToComplete(elem.attributeValue("time-to-complete"));

		fromRoleRecordReferences =
			elem.attributeValue("fromRoleTypeRecordRef");
		toRoleRecordReferences =
			elem.attributeValue("toRoleTypeRecordRef");
    }
	
	public void doSomething() {
		if (fromRoleRecordReferences!=null) {
    		
			resolvetimeout(fromRoleRecordReferences,
    				this.getTimeoutFromRoleTypeRecordInfo());
    	}
    	
    	if (toRoleRecordReferences!=null) {
    		
    		resolvetimeout(toRoleRecordReferences,
    				this.getTimeoutToRoleTypeRecordInfo());
    	}
	}
	
	protected void resolvetimeout(String refs,
			java.util.List list) {

		java.util.StringTokenizer st=
			new java.util.StringTokenizer(refs," ");

		while (st.hasMoreTokens()) {
			String ref=st.nextToken();
			RecordElementInfo rec= this.getRecordElementInfo(ref);
		
			// Find record details reference in this interaction
			if (rec == null) {
			} else {
				list.add(rec);
			}
		}
	}
} //InteractionImpl
