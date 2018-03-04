/**
 * CDL2BPEL_XJTU
 *
 * $Id: FinalizerBlockImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finalizer Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinalizerBlockImpl extends CDLElementImpl implements FinalizerBlock {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalizerBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.FINALIZER_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, CDLPackage.FINALIZER_BLOCK__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.FINALIZER_BLOCK__ACTIVITIES:
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
			case CDLPackage.FINALIZER_BLOCK__ACTIVITIES:
				return getActivities();
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
			case CDLPackage.FINALIZER_BLOCK__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case CDLPackage.FINALIZER_BLOCK__ACTIVITIES:
				getActivities().clear();
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
			case CDLPackage.FINALIZER_BLOCK__ACTIVITIES:
				return activities != null && !activities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem
	 *            the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals("finalizerBlock")) {
			setName(elem.attributeValue("name"));
		}
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
//		super.getBelongedPackage().getBaseUnitsDef().getInformationTypes().add(this);
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement
	 * 
	 * @param elem
	 *            the XML segment of CDLElement
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		String elemName = elem.getName();
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
		} else if(this instanceof FinalizerBlock) {
			Sequence seq = CDLFactory.eINSTANCE.createSequence();
 			seq.getActivities().add((Activity)(cdlElement));
 			getActivities().add(seq);
		}
		return cdlElement;
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType){
		boolean ret = false;

		// Override the default behavior, to make the exception
		// handler relevant, if and only if the choreography
		// in which it has been defined is relevant.
		if (checkingIfRelevant == false) {
			checkingIfRelevant = true;

			if (getBelongedChoreography() != null) {
				ret = getBelongedChoreography().isRelevantWithTheRoleType(
						roleType);
			}

			checkingIfRelevant = false;
		}

		return (ret);
	}

	private boolean checkingIfRelevant = false;
} //FinalizerBlockImpl
