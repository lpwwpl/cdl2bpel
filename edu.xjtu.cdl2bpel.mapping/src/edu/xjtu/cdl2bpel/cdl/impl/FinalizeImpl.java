/**
 * CDL2BPEL_XJTU
 *
 * $Id: FinalizeImpl.java,v 1.1 2011/02/21 06:24:09 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finalize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl#getChoreographyInstanceId <em>Choreography Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl#getFinalizerBlock <em>Finalizer Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl#getRoleTypeMatrixBindInfo <em>Role Type Matrix Bind Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinalizeImpl extends ActivityImpl implements Finalize {
	/**
	 * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreography()
	 * @generated
	 * @ordered
	 */
	protected Choreography choreography;

	/**
	 * The default value of the '{@link #getChoreographyInstanceId() <em>Choreography Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyInstanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOREOGRAPHY_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoreographyInstanceId() <em>Choreography Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyInstanceId()
	 * @generated
	 * @ordered
	 */
	protected String choreographyInstanceId = CHOREOGRAPHY_INSTANCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinalizerBlock() <em>Finalizer Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalizerBlock()
	 * @generated
	 * @ordered
	 */
	protected FinalizerBlock finalizerBlock;

	/**
	 * The cached value of the '{@link #getRoleTypeMatrixBindInfo() <em>Role Type Matrix Bind Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeMatrixBindInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleTypeMatrixBindInfo> roleTypeMatrixBindInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.FINALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography getChoreography() {
		if (choreography != null && choreography.eIsProxy()) {
			InternalEObject oldChoreography = (InternalEObject)choreography;
			choreography = (Choreography)eResolveProxy(oldChoreography);
			if (choreography != oldChoreography) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.FINALIZE__CHOREOGRAPHY, oldChoreography, choreography));
			}
		}
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography basicGetChoreography() {
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreography(Choreography newChoreography) {
		Choreography oldChoreography = choreography;
		choreography = newChoreography;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.FINALIZE__CHOREOGRAPHY, oldChoreography, choreography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoreographyInstanceId() {
		return choreographyInstanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyInstanceId(String newChoreographyInstanceId) {
		String oldChoreographyInstanceId = choreographyInstanceId;
		choreographyInstanceId = newChoreographyInstanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.FINALIZE__CHOREOGRAPHY_INSTANCE_ID, oldChoreographyInstanceId, choreographyInstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalizerBlock getFinalizerBlock() {
		if (finalizerBlock != null && finalizerBlock.eIsProxy()) {
			InternalEObject oldFinalizerBlock = (InternalEObject)finalizerBlock;
			finalizerBlock = (FinalizerBlock)eResolveProxy(oldFinalizerBlock);
			if (finalizerBlock != oldFinalizerBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.FINALIZE__FINALIZER_BLOCK, oldFinalizerBlock, finalizerBlock));
			}
		}
		return finalizerBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalizerBlock basicGetFinalizerBlock() {
		return finalizerBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalizerBlock(FinalizerBlock newFinalizerBlock) {
		FinalizerBlock oldFinalizerBlock = finalizerBlock;
		finalizerBlock = newFinalizerBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.FINALIZE__FINALIZER_BLOCK, oldFinalizerBlock, finalizerBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleTypeMatrixBindInfo> getRoleTypeMatrixBindInfo() {
		if (roleTypeMatrixBindInfo == null) {
			roleTypeMatrixBindInfo = new EObjectContainmentEList<RoleTypeMatrixBindInfo>(RoleTypeMatrixBindInfo.class, this, CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO);
		}
		return roleTypeMatrixBindInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO:
				return ((InternalEList<?>)getRoleTypeMatrixBindInfo()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.FINALIZE__CHOREOGRAPHY:
				if (resolve) return getChoreography();
				return basicGetChoreography();
			case CDLPackage.FINALIZE__CHOREOGRAPHY_INSTANCE_ID:
				return getChoreographyInstanceId();
			case CDLPackage.FINALIZE__FINALIZER_BLOCK:
				if (resolve) return getFinalizerBlock();
				return basicGetFinalizerBlock();
			case CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO:
				return getRoleTypeMatrixBindInfo();
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
			case CDLPackage.FINALIZE__CHOREOGRAPHY:
				setChoreography((Choreography)newValue);
				return;
			case CDLPackage.FINALIZE__CHOREOGRAPHY_INSTANCE_ID:
				setChoreographyInstanceId((String)newValue);
				return;
			case CDLPackage.FINALIZE__FINALIZER_BLOCK:
				setFinalizerBlock((FinalizerBlock)newValue);
				return;
			case CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO:
				getRoleTypeMatrixBindInfo().clear();
				getRoleTypeMatrixBindInfo().addAll((Collection<? extends RoleTypeMatrixBindInfo>)newValue);
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
			case CDLPackage.FINALIZE__CHOREOGRAPHY:
				setChoreography((Choreography)null);
				return;
			case CDLPackage.FINALIZE__CHOREOGRAPHY_INSTANCE_ID:
				setChoreographyInstanceId(CHOREOGRAPHY_INSTANCE_ID_EDEFAULT);
				return;
			case CDLPackage.FINALIZE__FINALIZER_BLOCK:
				setFinalizerBlock((FinalizerBlock)null);
				return;
			case CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO:
				getRoleTypeMatrixBindInfo().clear();
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
			case CDLPackage.FINALIZE__CHOREOGRAPHY:
				return choreography != null;
			case CDLPackage.FINALIZE__CHOREOGRAPHY_INSTANCE_ID:
				return CHOREOGRAPHY_INSTANCE_ID_EDEFAULT == null ? choreographyInstanceId != null : !CHOREOGRAPHY_INSTANCE_ID_EDEFAULT.equals(choreographyInstanceId);
			case CDLPackage.FINALIZE__FINALIZER_BLOCK:
				return finalizerBlock != null;
			case CDLPackage.FINALIZE__ROLE_TYPE_MATRIX_BIND_INFO:
				return roleTypeMatrixBindInfo != null && !roleTypeMatrixBindInfo.isEmpty();
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
		result.append(" (choreographyInstanceId: ");
		result.append(choreographyInstanceId);
		result.append(')');
		return result.toString();
	}

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem
	 *            the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem) {

		if(elem.getName().equals("finalize")) {
			setName(elem.attributeValue("name"));
//			setFinalizerBlock(this.getBelongedChoreography().getFinalizerBlock(elem.attributeValue("finalizerName")));
//			setChoreography(getBelongedPackage().getChoreography(elem.attributeValue("choreographyName")));
			importedChoreographyName=elem.attributeValue("choreographyName");
			importedFinalizerName=elem.attributeValue("finalizerName");
			setChoreographyInstanceId(elem.attributeValue("choreographyInstanceId"));
		}
	}
	
	/**
	 * Used for initializing attribute values of CDLElement when parsing CDL
	 * document If a cdlElement attribute reference another cdlElement which is
	 * defined in the following XML segment,we must set attribute of the
	 * referenced cdlElement,then after the referenced cdlElement be parsing and
	 * recognized,we set the referenced cdlElement value in real of the
	 * cdlElement.
	 */
	public void doSomething() {
		
		if (importedChoreographyName != null) {

			Choreography choreo = null;

			Choreography thisChoreo = getBelongedChoreography();
			if (thisChoreo != null) {
				choreo = thisChoreo
						.getEnclosedChoreography(importedChoreographyName);
			}

			if (choreo == null) {
				Package cdlpack = this.getBelongedPackage();

				if (cdlpack != null) {
					choreo = cdlpack
							.getChoreography(importedChoreographyName);
				}
			}

			if (choreo == null) {
			} else {
				setChoreography(choreo);

				if (importedFinalizerName != null) {

					FinalizerBlock fin = choreo
							.getFinalizerBlock(importedFinalizerName);

					if (fin == null) {
					} else {
						setFinalizerBlock(fin);
					}
				}
			}
		}
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret = false;

		if (!isRelevantRoleTypesGuard
				&& getChoreography() instanceof ChoreographyImpl) {
			try {
				isRelevantRoleTypesGuard = true;

				ret = ((ChoreographyImpl) getChoreography())
						.isRelevantWithTheRoleType(roleType);
			} catch (Throwable t) {
			} finally {
				isRelevantRoleTypesGuard = false;
			}
		}

		return (ret);
	}

	private boolean isRelevantRoleTypesGuard = false;
    private String importedChoreographyName=null;
    private String importedFinalizerName=null;
} //FinalizeImpl
