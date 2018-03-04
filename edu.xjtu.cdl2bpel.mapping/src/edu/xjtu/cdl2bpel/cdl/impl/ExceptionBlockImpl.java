/**
 * CDL2BPEL_XJTU
 *
 * $Id: ExceptionBlockImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
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

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl#getExceptionWorkUnits <em>Exception Work Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionBlockImpl extends CDLElementImpl implements ExceptionBlock {
	/**
	 * The cached value of the '{@link #getExceptionWorkUnits() <em>Exception Work Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionWorkUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionWorkUnit> exceptionWorkUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.EXCEPTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionWorkUnit> getExceptionWorkUnits() {
		if (exceptionWorkUnits == null) {
			exceptionWorkUnits = new EObjectContainmentEList<ExceptionWorkUnit>(ExceptionWorkUnit.class, this, CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS);
		}
		return exceptionWorkUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS:
				return ((InternalEList<?>)getExceptionWorkUnits()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS:
				return getExceptionWorkUnits();
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
			case CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS:
				getExceptionWorkUnits().clear();
				getExceptionWorkUnits().addAll((Collection<? extends ExceptionWorkUnit>)newValue);
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
			case CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS:
				getExceptionWorkUnits().clear();
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
			case CDLPackage.EXCEPTION_BLOCK__EXCEPTION_WORK_UNITS:
				return exceptionWorkUnits != null && !exceptionWorkUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals("exceptionBlock")) {
			setName(elem.attributeValue("name"));
		}
		List<Element> childrenElements = elem.elements();
		for(Element subElem:childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem) {
		CDLElement cdlElement = null;
		String elemName = elem.getName();
 		if (elemName.equals("workunit")) {			
			cdlElement = CDLFactory.eINSTANCE.createExceptionWorkUnit();
			getExceptionWorkUnits().add((ExceptionWorkUnit)cdlElement);
		} 
		return cdlElement;
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType){
		boolean ret = false;

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
} //ExceptionBlockImpl
