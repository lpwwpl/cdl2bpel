/**
 * CDL2BPEL_XJTU
 *
 * $Id: PerformImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import java.util.Collection;
import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLDefs;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getBindsOfPerform <em>Binds Of Perform</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getChoreographyInstanceId <em>Choreography Instance Id</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getRoleTypeMatrixBindInfos <em>Role Type Matrix Bind Infos</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#isBlock <em>Block</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.impl.PerformImpl#getChoreographyName <em>Choreography Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformImpl extends ActivityImpl implements Perform {
	/**
	 * The cached value of the '{@link #getBindsOfPerform() <em>Binds Of Perform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsOfPerform()
	 * @generated
	 * @ordered
	 */
	protected EList<BindInfo> bindsOfPerform;

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
	 * The cached value of the '{@link #getChoreography() <em>Choreography</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreography()
	 * @generated
	 * @ordered
	 */
	protected Choreography choreography;

	/**
	 * The default value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WAIT_FOR_COMPLETION_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected Boolean waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleTypeMatrixBindInfos() <em>Role Type Matrix Bind Infos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeMatrixBindInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleTypeMatrixBindInfo> roleTypeMatrixBindInfos;

	/**
	 * The default value of the '{@link #isBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean block = BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getChoreographyName() <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOREOGRAPHY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoreographyName() <em>Choreography Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyName()
	 * @generated
	 * @ordered
	 */
	protected String choreographyName = CHOREOGRAPHY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PERFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindInfo> getBindsOfPerform() {
		if (bindsOfPerform == null) {
			bindsOfPerform = new EObjectContainmentEList<BindInfo>(BindInfo.class, this, CDLPackage.PERFORM__BINDS_OF_PERFORM);
		}
		return bindsOfPerform;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PERFORM__CHOREOGRAPHY_INSTANCE_ID, oldChoreographyInstanceId, choreographyInstanceId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CDLPackage.PERFORM__CHOREOGRAPHY, oldChoreography, choreography));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PERFORM__CHOREOGRAPHY, oldChoreography, choreography));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWaitForCompletion() {
		return waitForCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForCompletion(Boolean newWaitForCompletion) {
		Boolean oldWaitForCompletion = waitForCompletion;
		waitForCompletion = newWaitForCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PERFORM__WAIT_FOR_COMPLETION, oldWaitForCompletion, waitForCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleTypeMatrixBindInfo> getRoleTypeMatrixBindInfos() {
		if (roleTypeMatrixBindInfos == null) {
			roleTypeMatrixBindInfos = new EObjectContainmentEList<RoleTypeMatrixBindInfo>(RoleTypeMatrixBindInfo.class, this, CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS);
		}
		return roleTypeMatrixBindInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(boolean newBlock) {
		boolean oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PERFORM__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoreographyName() {
		return choreographyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyName(String newChoreographyName) {
		String oldChoreographyName = choreographyName;
		choreographyName = newChoreographyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDLPackage.PERFORM__CHOREOGRAPHY_NAME, oldChoreographyName, choreographyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDLPackage.PERFORM__BINDS_OF_PERFORM:
				return ((InternalEList<?>)getBindsOfPerform()).basicRemove(otherEnd, msgs);
			case CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS:
				return ((InternalEList<?>)getRoleTypeMatrixBindInfos()).basicRemove(otherEnd, msgs);
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
			case CDLPackage.PERFORM__BINDS_OF_PERFORM:
				return getBindsOfPerform();
			case CDLPackage.PERFORM__CHOREOGRAPHY_INSTANCE_ID:
				return getChoreographyInstanceId();
			case CDLPackage.PERFORM__CHOREOGRAPHY:
				if (resolve) return getChoreography();
				return basicGetChoreography();
			case CDLPackage.PERFORM__WAIT_FOR_COMPLETION:
				return getWaitForCompletion();
			case CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS:
				return getRoleTypeMatrixBindInfos();
			case CDLPackage.PERFORM__BLOCK:
				return isBlock();
			case CDLPackage.PERFORM__CHOREOGRAPHY_NAME:
				return getChoreographyName();
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
			case CDLPackage.PERFORM__BINDS_OF_PERFORM:
				getBindsOfPerform().clear();
				getBindsOfPerform().addAll((Collection<? extends BindInfo>)newValue);
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY_INSTANCE_ID:
				setChoreographyInstanceId((String)newValue);
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY:
				setChoreography((Choreography)newValue);
				return;
			case CDLPackage.PERFORM__WAIT_FOR_COMPLETION:
				setWaitForCompletion((Boolean)newValue);
				return;
			case CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS:
				getRoleTypeMatrixBindInfos().clear();
				getRoleTypeMatrixBindInfos().addAll((Collection<? extends RoleTypeMatrixBindInfo>)newValue);
				return;
			case CDLPackage.PERFORM__BLOCK:
				setBlock((Boolean)newValue);
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY_NAME:
				setChoreographyName((String)newValue);
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
			case CDLPackage.PERFORM__BINDS_OF_PERFORM:
				getBindsOfPerform().clear();
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY_INSTANCE_ID:
				setChoreographyInstanceId(CHOREOGRAPHY_INSTANCE_ID_EDEFAULT);
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY:
				setChoreography((Choreography)null);
				return;
			case CDLPackage.PERFORM__WAIT_FOR_COMPLETION:
				setWaitForCompletion(WAIT_FOR_COMPLETION_EDEFAULT);
				return;
			case CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS:
				getRoleTypeMatrixBindInfos().clear();
				return;
			case CDLPackage.PERFORM__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case CDLPackage.PERFORM__CHOREOGRAPHY_NAME:
				setChoreographyName(CHOREOGRAPHY_NAME_EDEFAULT);
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
			case CDLPackage.PERFORM__BINDS_OF_PERFORM:
				return bindsOfPerform != null && !bindsOfPerform.isEmpty();
			case CDLPackage.PERFORM__CHOREOGRAPHY_INSTANCE_ID:
				return CHOREOGRAPHY_INSTANCE_ID_EDEFAULT == null ? choreographyInstanceId != null : !CHOREOGRAPHY_INSTANCE_ID_EDEFAULT.equals(choreographyInstanceId);
			case CDLPackage.PERFORM__CHOREOGRAPHY:
				return choreography != null;
			case CDLPackage.PERFORM__WAIT_FOR_COMPLETION:
				return WAIT_FOR_COMPLETION_EDEFAULT == null ? waitForCompletion != null : !WAIT_FOR_COMPLETION_EDEFAULT.equals(waitForCompletion);
			case CDLPackage.PERFORM__ROLE_TYPE_MATRIX_BIND_INFOS:
				return roleTypeMatrixBindInfos != null && !roleTypeMatrixBindInfos.isEmpty();
			case CDLPackage.PERFORM__BLOCK:
				return block != BLOCK_EDEFAULT;
			case CDLPackage.PERFORM__CHOREOGRAPHY_NAME:
				return CHOREOGRAPHY_NAME_EDEFAULT == null ? choreographyName != null : !CHOREOGRAPHY_NAME_EDEFAULT.equals(choreographyName);
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
		result.append(", waitForCompletion: ");
		result.append(waitForCompletion);
		result.append(", block: ");
		result.append(block);
		result.append(", choreographyName: ");
		result.append(choreographyName);
		result.append(')');
		return result.toString();
	}

	public void resolveTheCDLElementByElement(Element elem) {
		if (elem.getName().equals("perform")) {
			importedChoreographyName = elem.attributeValue("choreographyName");
			if (elem.attributeValue("choreographyInstanceId") != null) {
				setChoreographyInstanceId(elem
						.attributeValue("choreographyInstanceId"));
			}

			if (elem.attributeValue("block") != null) {
				setWaitForCompletion(getBooleanValue(elem.attributeValue("block")));
			}

			if (importedChoreographyName != null
					&& !importedChoreographyName.equals("")) {
				Choreography choreo = null;

				Choreography thisChoreo = this.getBelongedChoreography();
				if (thisChoreo != null) {
					choreo = thisChoreo
							.getEnclosedChoreography(importedChoreographyName);
				}

				if (choreo == null) {
					edu.xjtu.cdl2bpel.cdl.Package cdlpack = this
							.getBelongedPackage();

					if (cdlpack != null) {
						choreo = cdlpack
								.getChoreography(importedChoreographyName);
					}
				}
				if (choreo == null) {
				} else {
					setChoreography(choreo);
				}
			}
		}
		List<Element> childrenElements = elem.elements();
		for (Element subElem : childrenElements) {
			super.resolveTheCDLElementByElement(subElem);
		}
	}
	
	public CDLElement newSubCDLElementObject(Element elem) {
	      CDLElement ret=null;
	      String name = elem.getName();
	        if (elem.getNamespaceURI() != null) {
	        	if (elem.getNamespaceURI().equals(CDLDefs.CDL_NS)) {
	        		
	                if (name.equals("bind")) {
	                    ret = CDLFactory.eINSTANCE.createBindInfo();
	                    this.getBindsOfPerform().add((BindInfo)ret);
	                    
	                } else if (name.equals("choreography")) {
	                    ret = CDLFactory.eINSTANCE.createChoreography();
	                	
	                    Choreography choreo =  this.getBelongedChoreography();
	                    if (choreo != null) {
	                    	choreo.getEnclosedChoreographies().add((Choreography)ret);
	                    }
	                }
	        	} 
	        }
	        
	        return(ret);
	}
	
	public boolean isRelevantWithTheRoleType(RoleType roleType) {
		boolean ret=false;
	
		// Flag is used to guard against recursion
		if (!isRelevantRoleTypesGuard &&
				getChoreography() instanceof ChoreographyImpl) {
			try {
				isRelevantRoleTypesGuard = true;
			
				ret = ((ChoreographyImpl)getChoreography()).isRelevantWithTheRoleType(roleType);
			} catch(Throwable t) {
			} finally {
				isRelevantRoleTypesGuard = false;
			}
		}

		return(ret);
	}
	
	/**
	 * 
	 */
	public Boolean getBooleanValue(String value) {
		Boolean ret = null;

		if (value != null && value.equalsIgnoreCase("true")) {
			ret = Boolean.TRUE;
		} else if (value != null && value.equalsIgnoreCase("false")) {
			ret = Boolean.FALSE;
		} else {
			ret = true;
		}

		return (ret);
	}
	
	public void doSomething() {
		if (importedChoreographyName != null) {
			Choreography choreo=null;
			
			Choreography thisChoreo=this.getBelongedChoreography();
			if (thisChoreo != null) {
				choreo = thisChoreo.getEnclosedChoreography(importedChoreographyName);
			}
			
			if (choreo == null) {
				Package cdlpack= this.getBelongedPackage();
				
				if (cdlpack != null) {
					choreo = cdlpack.getChoreography(importedChoreographyName);
				}
			}
			
			if (choreo == null) {
			} else {
				setChoreography(choreo);
			}
		}

	}
	
	private String importedChoreographyName=null;

	private boolean isRelevantRoleTypesGuard=false;
} //PerformImpl
