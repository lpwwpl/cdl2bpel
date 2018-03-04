/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChoreographyImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElemNameConstants;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getComplete <em>Complete</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getCoordination <em>Coordination</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getEnclosedChoreographies <em>Enclosed Choreographies</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getRoleTypeMatrixPlayingRoleInChoreo <em>Role Type Matrix Playing Role In Choreo</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getExceptionBlock <em>Exception Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getFinalizerBlocks <em>Finalizer Blocks</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl#getEnclosingChoreographies <em>Enclosing Choreographies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoreographyImpl extends CDLElementImpl implements Choreography {
	/**
	 * The default value of the '{@link #getComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplete()
	 * @generated
	 * @ordered
	 */
	protected String complete = COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISOLATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolation()
	 * @generated
	 * @ordered
	 */
	protected Boolean isolation = ISOLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ROOT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Boolean root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordination() <em>Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordination()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COORDINATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCoordination() <em>Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordination()
	 * @generated
	 * @ordered
	 */
	protected Boolean coordination = COORDINATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> relationships;

	/**
	 * The cached value of the '{@link #getEnclosedChoreographies() <em>Enclosed Choreographies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedChoreographies()
	 * @generated
	 * @ordered
	 */
	protected EList<Choreography> enclosedChoreographies;

	/**
	 * The cached value of the '{@link #getRoleTypeMatrixPlayingRoleInChoreo() <em>Role Type Matrix Playing Role In Choreo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeMatrixPlayingRoleInChoreo()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleTypeMatrix> roleTypeMatrixPlayingRoleInChoreo;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getExceptionBlock() <em>Exception Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionBlock()
	 * @generated
	 * @ordered
	 */
	protected ExceptionBlock exceptionBlock;

	/**
	 * The cached value of the '{@link #getFinalizerBlocks() <em>Finalizer Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizerBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalizerBlock> finalizerBlocks;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached value of the '{@link #getEnclosingChoreographies() <em>Enclosing Choreographies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingChoreographies()
	 * @generated
	 * @ordered
	 */
	protected EList<Choreography> enclosingChoreographies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.CHOREOGRAPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(String newComplete) {
		String oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsolation() {
		return isolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolation(Boolean newIsolation) {
		Boolean oldIsolation = isolation;
		isolation = newIsolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__ISOLATION, oldIsolation, isolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Boolean newRoot) {
		Boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCoordination() {
		return coordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordination(Boolean newCoordination) {
		Boolean oldCoordination = coordination;
		coordination = newCoordination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__COORDINATION, oldCoordination, coordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipType> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectResolvingEList<RelationshipType>(RelationshipType.class, this, CDLPackage.CHOREOGRAPHY__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choreography> getEnclosedChoreographies() {
		if (enclosedChoreographies == null) {
			enclosedChoreographies = new EObjectContainmentEList<Choreography>(Choreography.class, this, CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES);
		}
		return enclosedChoreographies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleTypeMatrix> getRoleTypeMatrixPlayingRoleInChoreo() {
		if (roleTypeMatrixPlayingRoleInChoreo == null) {
			roleTypeMatrixPlayingRoleInChoreo = new EObjectContainmentEList<RoleTypeMatrix>(RoleTypeMatrix.class, this, CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO);
		}
		return roleTypeMatrixPlayingRoleInChoreo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, CDLPackage.CHOREOGRAPHY__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionBlock getExceptionBlock() {
		return exceptionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionBlock(ExceptionBlock newExceptionBlock, NotificationChain msgs) {
		ExceptionBlock oldExceptionBlock = exceptionBlock;
		exceptionBlock = newExceptionBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK, oldExceptionBlock, newExceptionBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionBlock(ExceptionBlock newExceptionBlock) {
		if (newExceptionBlock != exceptionBlock) {
			NotificationChain msgs = null;
			if (exceptionBlock != null)
				msgs = ((InternalEObject)exceptionBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK, null, msgs);
			if (newExceptionBlock != null)
				msgs = ((InternalEObject)newExceptionBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK, null, msgs);
			msgs = basicSetExceptionBlock(newExceptionBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK, newExceptionBlock, newExceptionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalizerBlock> getFinalizerBlocks() {
		if (finalizerBlocks == null) {
			finalizerBlocks = new EObjectContainmentEList<FinalizerBlock>(FinalizerBlock.class, this, CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS);
		}
		return finalizerBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, CDLPackage.CHOREOGRAPHY__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choreography> getEnclosingChoreographies() {
		if (enclosingChoreographies == null) {
			enclosingChoreographies = new EObjectResolvingEList<Choreography>(Choreography.class, this, CDLPackage.CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES);
		}
		return enclosingChoreographies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES:
				return ((InternalEList<?>)getEnclosedChoreographies()).basicRemove(otherEnd, msgs);
			case CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO:
				return ((InternalEList<?>)getRoleTypeMatrixPlayingRoleInChoreo()).basicRemove(otherEnd, msgs);
			case CDLPackage.CHOREOGRAPHY__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK:
				return basicSetExceptionBlock(null, msgs);
			case CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS:
				return ((InternalEList<?>)getFinalizerBlocks()).basicRemove(otherEnd, msgs);
			case CDLPackage.CHOREOGRAPHY__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.CHOREOGRAPHY__COMPLETE:
				return getComplete();
			case CDLPackage.CHOREOGRAPHY__ISOLATION:
				return getIsolation();
			case CDLPackage.CHOREOGRAPHY__ROOT:
				return getRoot();
			case CDLPackage.CHOREOGRAPHY__COORDINATION:
				return getCoordination();
			case CDLPackage.CHOREOGRAPHY__RELATIONSHIPS:
				return getRelationships();
			case CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES:
				return getEnclosedChoreographies();
			case CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO:
				return getRoleTypeMatrixPlayingRoleInChoreo();
			case CDLPackage.CHOREOGRAPHY__VARIABLES:
				return getVariables();
			case CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK:
				return getExceptionBlock();
			case CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS:
				return getFinalizerBlocks();
			case CDLPackage.CHOREOGRAPHY__ACTIVITIES:
				return getActivities();
			case CDLPackage.CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES:
				return getEnclosingChoreographies();
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
			case CDLPackage.CHOREOGRAPHY__COMPLETE:
				setComplete((String)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ISOLATION:
				setIsolation((Boolean)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ROOT:
				setRoot((Boolean)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__COORDINATION:
				setCoordination((Boolean)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends RelationshipType>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES:
				getEnclosedChoreographies().clear();
				getEnclosedChoreographies().addAll((Collection<? extends Choreography>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO:
				getRoleTypeMatrixPlayingRoleInChoreo().clear();
				getRoleTypeMatrixPlayingRoleInChoreo().addAll((Collection<? extends RoleTypeMatrix>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK:
				setExceptionBlock((ExceptionBlock)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS:
				getFinalizerBlocks().clear();
				getFinalizerBlocks().addAll((Collection<? extends FinalizerBlock>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CDLPackage.CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES:
				getEnclosingChoreographies().clear();
				getEnclosingChoreographies().addAll((Collection<? extends Choreography>)newValue);
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
			case CDLPackage.CHOREOGRAPHY__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case CDLPackage.CHOREOGRAPHY__ISOLATION:
				setIsolation(ISOLATION_EDEFAULT);
				return;
			case CDLPackage.CHOREOGRAPHY__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case CDLPackage.CHOREOGRAPHY__COORDINATION:
				setCoordination(COORDINATION_EDEFAULT);
				return;
			case CDLPackage.CHOREOGRAPHY__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES:
				getEnclosedChoreographies().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO:
				getRoleTypeMatrixPlayingRoleInChoreo().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__VARIABLES:
				getVariables().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK:
				setExceptionBlock((ExceptionBlock)null);
				return;
			case CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS:
				getFinalizerBlocks().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__ACTIVITIES:
				getActivities().clear();
				return;
			case CDLPackage.CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES:
				getEnclosingChoreographies().clear();
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
			case CDLPackage.CHOREOGRAPHY__COMPLETE:
				return COMPLETE_EDEFAULT == null ? complete != null : !COMPLETE_EDEFAULT.equals(complete);
			case CDLPackage.CHOREOGRAPHY__ISOLATION:
				return ISOLATION_EDEFAULT == null ? isolation != null : !ISOLATION_EDEFAULT.equals(isolation);
			case CDLPackage.CHOREOGRAPHY__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
			case CDLPackage.CHOREOGRAPHY__COORDINATION:
				return COORDINATION_EDEFAULT == null ? coordination != null : !COORDINATION_EDEFAULT.equals(coordination);
			case CDLPackage.CHOREOGRAPHY__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case CDLPackage.CHOREOGRAPHY__ENCLOSED_CHOREOGRAPHIES:
				return enclosedChoreographies != null && !enclosedChoreographies.isEmpty();
			case CDLPackage.CHOREOGRAPHY__ROLE_TYPE_MATRIX_PLAYING_ROLE_IN_CHOREO:
				return roleTypeMatrixPlayingRoleInChoreo != null && !roleTypeMatrixPlayingRoleInChoreo.isEmpty();
			case CDLPackage.CHOREOGRAPHY__VARIABLES:
				return variables != null && !variables.isEmpty();
			case CDLPackage.CHOREOGRAPHY__EXCEPTION_BLOCK:
				return exceptionBlock != null;
			case CDLPackage.CHOREOGRAPHY__FINALIZER_BLOCKS:
				return finalizerBlocks != null && !finalizerBlocks.isEmpty();
			case CDLPackage.CHOREOGRAPHY__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case CDLPackage.CHOREOGRAPHY__ENCLOSING_CHOREOGRAPHIES:
				return enclosingChoreographies != null && !enclosingChoreographies.isEmpty();
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
		result.append(" (complete: ");
		result.append(complete);
		result.append(", isolation: ");
		result.append(isolation);
		result.append(", root: ");
		result.append(root);
		result.append(", coordination: ");
		result.append(coordination);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if (elem.getName().equals(CDLElemNameConstants.CHOREOGRAPHY_ELEM_NAME)) {
			setName(elem.attributeValue("name"));
			String rootValue = elem.attributeValue("root");
			String isolationValue = elem.attributeValue("isolation");
			String coordinationValue = elem.attributeValue("coordination");
			if (rootValue != null && rootValue.equals("true")) {
				setRoot(true);
			} else {
				setRoot(false);
			}
			if (isolationValue != null && isolationValue.equals("true")) {
				setIsolation(true);
			} else {
				setIsolation(false);
			}
			if (coordinationValue != null && coordinationValue.equals("true")) {
				setCoordination(true);
			} else {
				setCoordination(false);
			}
			setComplete(elem.attributeValue("complete"));
		}
		List<Element> childrenElements = elem.elements();
		Package thePackage = getBelongedPackage();
		for (Iterator it = childrenElements.iterator(); it.hasNext();) {
			Element nestedByChoreoTypeElem = (Element) it.next();
			String nestedByChoreoTypeElem_name = nestedByChoreoTypeElem
					.getName();
			if (nestedByChoreoTypeElem_name.equals("relationship")) {
				String relationshipType = nestedByChoreoTypeElem
						.attributeValue("type");
				RelationshipType theRelationshipType = CDLPackageUtil
						.getRelationship(thePackage, relationshipType);
				getRelationships().add(theRelationshipType);
			} else if (nestedByChoreoTypeElem_name
					.equals("variableDefinitions")) {
				List<Element> childrenElementsByVariableDefinitions = nestedByChoreoTypeElem
						.elements();
				for (Element variableElement : childrenElementsByVariableDefinitions) {
					super.resolveTheCDLElementByElement(variableElement);
				}
			} else {
				super.resolveTheCDLElementByElement(nestedByChoreoTypeElem);
			}
		}
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		if (elem.getName().equals("variable")) {
			cdlElement = CDLFactory.eINSTANCE.createVariable();
			getVariables().add((Variable) cdlElement);
		} else if (elem.getName().equals("exceptionBlock")) {
			cdlElement = CDLFactory.eINSTANCE.createExceptionBlock();
			setExceptionBlock((ExceptionBlock) cdlElement);
		} else if (elem.getName().equals("finalizerBlock")) {
			cdlElement = CDLFactory.eINSTANCE.createFinalizerBlock();
			getFinalizerBlocks().add((FinalizerBlock) cdlElement);
		} else if (elem.getName().equals("finalize")) {
			cdlElement = CDLFactory.eINSTANCE.createFinalize();
			getActivities().add((Activity) cdlElement);
		} else if(elem.getName().equals("choreography")) {
			cdlElement = CDLFactory.eINSTANCE.createChoreography();
			getEnclosedChoreographies().add((Choreography)cdlElement);
		} else {
			cdlElement = newActivityOfSpecialCDLElementByActivityType(elem);
			getActivities().add((Activity) cdlElement);
		}
		return cdlElement;
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement, the sub CDLElement instance of Activity
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newActivityOfSpecialCDLElementByActivityType(Element elem) {
		CDLElement cdlElement = null;
		String elemName = elem.getName();
		System.out.println(elemName);
		if (elemName.equals("sequence")) {
			cdlElement = CDLFactory.eINSTANCE.createSequence();
		} else if (elemName.equals("choice")) {
			cdlElement = CDLFactory.eINSTANCE.createChoice();
		} else if (elemName.equals("parrallel")) {
			cdlElement = CDLFactory.eINSTANCE.createParallel();
		}else if (elemName.equals("perform")) {
			cdlElement = CDLFactory.eINSTANCE.createPerform(); 
        }else if (elemName.equals("workunit")) {
			String repeatValue = elem.attributeValue("repeat");
			String guardValue = elem.attributeValue("guard");
			String blockValue = elem.attributeValue("block");
			if (blockValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createWhenWithBlockOfWorkUnit();
			} else if (repeatValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createWhileWithRepeateOfWorkUnit();
			} else if (guardValue != null) {
				cdlElement = CDLFactory.eINSTANCE
						.createCaseConditionalOfSwitch();
			} else {
				cdlElement = CDLFactory.eINSTANCE
						.createScopeWithNoAttrOfWorkUnit();
			}
		} else if (elemName.equals("assign")) {
			cdlElement = CDLFactory.eINSTANCE.createAssign();
		} else if (elemName.equals("interaction")) {
			cdlElement = CDLFactory.eINSTANCE.createInteraction();
		} else if (elemName.equals("noAction")) {
			cdlElement = CDLFactory.eINSTANCE.createNoAction();
		} else if (elemName.equals("silentAction")) {
			cdlElement = CDLFactory.eINSTANCE.createSilentAction();
		} 
		if(cdlElement!= null && this instanceof OrderingStructuralActivity) {
			((OrderingStructuralActivity)this).getActivities().add((Activity)(cdlElement));
		}
		return cdlElement;
	}

	/**
	 * Return the FinalizerBlock of Choreography by name.
	 * 
	 * @param name the name of the finalizerBlock  
	 * @return the finalizerBlock of Choreography by name
	 */
	public FinalizerBlock getFinalizerBlock(String name) {
	   	return((FinalizerBlock)getCDLElementByTheNameAttribute(name,
	   				this.getFinalizerBlocks()));
	}
	
	/**
	 * Return the EnclosedChoreography of Choreography by name
	 * 
	 * @param name the name of the enclosedChoreography
	 * @return the enclosed choreography of Choreography by name
	 */
	public Choreography getEnclosedChoreography(String name) {
    	return((Choreography)getCDLElementByTheNameAttribute(name,
    			getEnclosedChoreographies()));
    }
	
	/**
	 * Return the variable of Choreography by name
	 * 
	 * @param name the name of the variable
	 * @return the variable of Choreography by name
	 */
	public Variable getVariable(String name) {
		return((Variable)getCDLElementByTheNameAttribute(name,
    			getVariables()));
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret = false;

		if (isRelevantOrNotFlag == false) {
			isRelevantOrNotFlag = true;

			ret = super.isRelevantWithTheRoleType(roleType);

			isRelevantOrNotFlag = false;
		}

		return (ret);
	}
	
	public RoleType[] getRoleTypesMatrixFromTheContext() {
		RoleType[] roleTypes=null;
		java.util.Vector roles=new java.util.Vector();
		
		java.util.Iterator iter=null;
		
		if (getRelationships().size() > 0) {
			iter = getRelationships().iterator();
		} else if (getBelongedPackage() != null) {
			iter = getBelongedPackage().getRelationshipTypes().iterator();
		}
		
		while (iter != null && iter.hasNext()) {
			RelationshipType rel=(RelationshipType)iter.next();
			
			if (rel.getRoleTypeOfFirst() != null &&
					roles.contains(rel.getRoleTypeOfFirst()) == false) {
				roles.add(rel.getRoleTypeOfFirst());
			}
			
			if (rel.getRoleTypeOfSecond() != null &&
					roles.contains(rel.getRoleTypeOfSecond()) == false) {
				roles.add(rel.getRoleTypeOfSecond());
			}
		}
		
		// Convert list of role types into a list of names
		roleTypes = new RoleType[roles.size()];
		for (int i=0; i < roles.size(); i++) {
			roleTypes[i] = (RoleType)roles.get(i);
		}
		
		return(roleTypes);
	}
	
	public boolean isGroupingConstruct() {
		return(true);
	}
	
	public boolean isSequentialGroupingConstruct() {
		return(true);
	}
	
	private boolean isRelevantOrNotFlag = false;
} //ChoreographyImpl
