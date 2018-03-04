/**
 * CDL2BPEL_XJTU
 *
 * $Id: BPOrchestraImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.CompensateHandler;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Variable;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELProjector;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELProxy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Orchestra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getCompletionExpression <em>Completion Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getEnclosedBPOrchestra <em>Enclosed BP Orchestra</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getExceptionHandlers <em>Exception Handlers</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getCompensateHandlers <em>Compensate Handlers</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getHasCompletionExpression <em>Has Completion Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getEnclosingBPOrchestras <em>Enclosing BP Orchestras</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getCoordinated <em>Coordinated</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.BPOrchestraImpl#getIsolate <em>Isolate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPOrchestraImpl extends SequenceImpl implements BPOrchestra {
	/**
	 * The default value of the '{@link #getCompletionExpression() <em>Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionExpression() <em>Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionExpression()
	 * @generated
	 * @ordered
	 */
	protected String completionExpression = COMPLETION_EXPRESSION_EDEFAULT;

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
	 * The cached value of the '{@link #getEnclosedBPOrchestra() <em>Enclosed BP Orchestra</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedBPOrchestra()
	 * @generated
	 * @ordered
	 */
	protected EList<BPOrchestra> enclosedBPOrchestra;

	/**
	 * The cached value of the '{@link #getExceptionHandlers() <em>Exception Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<FaultHandler> exceptionHandlers;

	/**
	 * The cached value of the '{@link #getCompensateHandlers() <em>Compensate Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensateHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<CompensateHandler> compensateHandlers;

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
	 * The default value of the '{@link #getHasCompletionExpression() <em>Has Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCompletionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_COMPLETION_EXPRESSION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHasCompletionExpression() <em>Has Completion Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCompletionExpression()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasCompletionExpression = HAS_COMPLETION_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<String> participants;

	/**
	 * The cached value of the '{@link #getEnclosingBPOrchestras() <em>Enclosing BP Orchestras</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosingBPOrchestras()
	 * @generated
	 * @ordered
	 */
	protected EList<BPOrchestra> enclosingBPOrchestras;

	/**
	 * The default value of the '{@link #getCoordinated() <em>Coordinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COORDINATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinated() <em>Coordinated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinated()
	 * @generated
	 * @ordered
	 */
	protected Boolean coordinated = COORDINATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolate() <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISOLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolate() <em>Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolate()
	 * @generated
	 * @ordered
	 */
	protected Boolean isolate = ISOLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPOrchestraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.BP_ORCHESTRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletionExpression() {
		return completionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionExpression(String newCompletionExpression) {
		String oldCompletionExpression = completionExpression;
		completionExpression = newCompletionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ORCHESTRA__COMPLETION_EXPRESSION, oldCompletionExpression, completionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, OrchestraPackage.BP_ORCHESTRA__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPOrchestra> getEnclosedBPOrchestra() {
		if (enclosedBPOrchestra == null) {
			enclosedBPOrchestra = new EObjectContainmentEList<BPOrchestra>(BPOrchestra.class, this, OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA);
		}
		return enclosedBPOrchestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FaultHandler> getExceptionHandlers() {
		if (exceptionHandlers == null) {
			exceptionHandlers = new EObjectContainmentEList<FaultHandler>(FaultHandler.class, this, OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS);
		}
		return exceptionHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompensateHandler> getCompensateHandlers() {
		if (compensateHandlers == null) {
			compensateHandlers = new EObjectContainmentEList<CompensateHandler>(CompensateHandler.class, this, OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS);
		}
		return compensateHandlers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ORCHESTRA__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHasCompletionExpression() {
		return hasCompletionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCompletionExpression(Boolean newHasCompletionExpression) {
		Boolean oldHasCompletionExpression = hasCompletionExpression;
		hasCompletionExpression = newHasCompletionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION, oldHasCompletionExpression, hasCompletionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParticipants() {
		if (participants == null) {
			participants = new EDataTypeUniqueEList<String>(String.class, this, OrchestraPackage.BP_ORCHESTRA__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPOrchestra> getEnclosingBPOrchestras() {
		if (enclosingBPOrchestras == null) {
			enclosingBPOrchestras = new EObjectResolvingEList<BPOrchestra>(BPOrchestra.class, this, OrchestraPackage.BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS);
		}
		return enclosingBPOrchestras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCoordinated() {
		return coordinated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinated(Boolean newCoordinated) {
		Boolean oldCoordinated = coordinated;
		coordinated = newCoordinated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ORCHESTRA__COORDINATED, oldCoordinated, coordinated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsolate() {
		return isolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolate(Boolean newIsolate) {
		Boolean oldIsolate = isolate;
		isolate = newIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.BP_ORCHESTRA__ISOLATE, oldIsolate, isolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrchestraPackage.BP_ORCHESTRA__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA:
				return ((InternalEList<?>)getEnclosedBPOrchestra()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS:
				return ((InternalEList<?>)getExceptionHandlers()).basicRemove(otherEnd, msgs);
			case OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS:
				return ((InternalEList<?>)getCompensateHandlers()).basicRemove(otherEnd, msgs);
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
			case OrchestraPackage.BP_ORCHESTRA__COMPLETION_EXPRESSION:
				return getCompletionExpression();
			case OrchestraPackage.BP_ORCHESTRA__VARIABLES:
				return getVariables();
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA:
				return getEnclosedBPOrchestra();
			case OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS:
				return getExceptionHandlers();
			case OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS:
				return getCompensateHandlers();
			case OrchestraPackage.BP_ORCHESTRA__ROOT:
				return getRoot();
			case OrchestraPackage.BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION:
				return getHasCompletionExpression();
			case OrchestraPackage.BP_ORCHESTRA__PARTICIPANTS:
				return getParticipants();
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS:
				return getEnclosingBPOrchestras();
			case OrchestraPackage.BP_ORCHESTRA__COORDINATED:
				return getCoordinated();
			case OrchestraPackage.BP_ORCHESTRA__ISOLATE:
				return getIsolate();
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
			case OrchestraPackage.BP_ORCHESTRA__COMPLETION_EXPRESSION:
				setCompletionExpression((String)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA:
				getEnclosedBPOrchestra().clear();
				getEnclosedBPOrchestra().addAll((Collection<? extends BPOrchestra>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				getExceptionHandlers().addAll((Collection<? extends FaultHandler>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS:
				getCompensateHandlers().clear();
				getCompensateHandlers().addAll((Collection<? extends CompensateHandler>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__ROOT:
				setRoot((Boolean)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION:
				setHasCompletionExpression((Boolean)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends String>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS:
				getEnclosingBPOrchestras().clear();
				getEnclosingBPOrchestras().addAll((Collection<? extends BPOrchestra>)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__COORDINATED:
				setCoordinated((Boolean)newValue);
				return;
			case OrchestraPackage.BP_ORCHESTRA__ISOLATE:
				setIsolate((Boolean)newValue);
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
			case OrchestraPackage.BP_ORCHESTRA__COMPLETION_EXPRESSION:
				setCompletionExpression(COMPLETION_EXPRESSION_EDEFAULT);
				return;
			case OrchestraPackage.BP_ORCHESTRA__VARIABLES:
				getVariables().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA:
				getEnclosedBPOrchestra().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS:
				getCompensateHandlers().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case OrchestraPackage.BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION:
				setHasCompletionExpression(HAS_COMPLETION_EXPRESSION_EDEFAULT);
				return;
			case OrchestraPackage.BP_ORCHESTRA__PARTICIPANTS:
				getParticipants().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS:
				getEnclosingBPOrchestras().clear();
				return;
			case OrchestraPackage.BP_ORCHESTRA__COORDINATED:
				setCoordinated(COORDINATED_EDEFAULT);
				return;
			case OrchestraPackage.BP_ORCHESTRA__ISOLATE:
				setIsolate(ISOLATE_EDEFAULT);
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
			case OrchestraPackage.BP_ORCHESTRA__COMPLETION_EXPRESSION:
				return COMPLETION_EXPRESSION_EDEFAULT == null ? completionExpression != null : !COMPLETION_EXPRESSION_EDEFAULT.equals(completionExpression);
			case OrchestraPackage.BP_ORCHESTRA__VARIABLES:
				return variables != null && !variables.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSED_BP_ORCHESTRA:
				return enclosedBPOrchestra != null && !enclosedBPOrchestra.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__EXCEPTION_HANDLERS:
				return exceptionHandlers != null && !exceptionHandlers.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__COMPENSATE_HANDLERS:
				return compensateHandlers != null && !compensateHandlers.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
			case OrchestraPackage.BP_ORCHESTRA__HAS_COMPLETION_EXPRESSION:
				return HAS_COMPLETION_EXPRESSION_EDEFAULT == null ? hasCompletionExpression != null : !HAS_COMPLETION_EXPRESSION_EDEFAULT.equals(hasCompletionExpression);
			case OrchestraPackage.BP_ORCHESTRA__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__ENCLOSING_BP_ORCHESTRAS:
				return enclosingBPOrchestras != null && !enclosingBPOrchestras.isEmpty();
			case OrchestraPackage.BP_ORCHESTRA__COORDINATED:
				return COORDINATED_EDEFAULT == null ? coordinated != null : !COORDINATED_EDEFAULT.equals(coordinated);
			case OrchestraPackage.BP_ORCHESTRA__ISOLATE:
				return ISOLATE_EDEFAULT == null ? isolate != null : !ISOLATE_EDEFAULT.equals(isolate);
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
		result.append(" (completionExpression: ");
		result.append(completionExpression);
		result.append(", root: ");
		result.append(root);
		result.append(", hasCompletionExpression: ");
		result.append(hasCompletionExpression);
		result.append(", participants: ");
		result.append(participants);
		result.append(", coordinated: ");
		result.append(coordinated);
		result.append(", isolate: ");
		result.append(isolate);
		result.append(')');
		return result.toString();
	}
	public BPOrchestra getEnclosedBPOrchestraByName(String str) {
		for(Iterator it = getEnclosedBPOrchestra().iterator();it.hasNext();) {
			BPOrchestra orche = (BPOrchestra)it.next();
			if(orche.getName().equals(str)) {
				return orche;
			}
		}
		return null;
	}
	
	public Variable getVariable(String name) {
		Variable ret=null;
    	
    	java.util.Iterator iter=getVariables().iterator();
    	while (ret == null && iter.hasNext()) {
    		ret = (Variable)iter.next();
    		
    		if (ret.getName().equals(name) == false) {
    			ret = null;
    		}
    	}
    	
    	return(ret);
    }
	
	public CompensateHandler getCompensateHandler(String name) {
		CompensateHandler ret=null;
    	
    	java.util.Iterator iter=this.getCompensateHandlers().iterator();
    	while (ret == null && iter.hasNext()) {
    		ret = (CompensateHandler)iter.next();
    		
    		if (ret.getName().equals(name) == false) {
    			ret = null;
    		}
    	}
    	
    	return(ret);
	}
	public void transtorm(Orchestra2BPELContext context) {
		// 因为FautlHandlerImpl需要加空操作，所以只有FautlHandlerImpl重写了该方法
		Orchestra2BPELProjector projector = Orchestra2BPELProxy
				.getProjectorByOrchestraName(this.getClass().getName());
		// 根据中间标签的名字得到相应的projector
		if (projector != null) {
			// 命名空间和伙伴链接没有注册，所以它们的projector为null，所以要在GlobalArchitectureImpl中进行处理
			Element elem = projector.transformOrchestra2BPEL(context, this);
			context.push(elem);

			//System.out.println(Orchestra2BPEL.docToString(context.getDocument()));
			// 遍历子节点
			Iterator childrenIterator = this.eContents().iterator();// 得到子节点
			while (childrenIterator.hasNext()) {
				Object child = childrenIterator.next();
				if (child instanceof BPElement) {
					/*
					 * Orchestra2BPELProjector
					 * childProjector=Orchestra2BPELProxy
					 * .getProjectorByOrchestraName(child.getClass().getName());
					 * if(childProjector!=null){
					 * childProjector.transformOrchestra2BPEL(context,
					 * (BPElement)child); }
					 */
					((BPElement) child).transtorm(context);
				}
			}
			context.pop();
			if(this.getExceptionHandlers().size()>0){
				context.popFaultHandler();//对应的push操作在BPOrchestraProjector类的generateFaultHandlers（）方法中
			}
		}
	}

} //BPOrchestraImpl
