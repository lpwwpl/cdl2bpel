/**
 * CDL2BPEL_XJTU
 *
 * $Id: CopyImpl.java,v 1.1 2011/02/21 06:24:07 administrator Exp $
 */
package edu.xjtu.cdl2bpel.orchestra.impl;

import edu.xjtu.cdl2bpel.orchestra.Copy;
import edu.xjtu.cdl2bpel.orchestra.OrchestraPackage;
import edu.xjtu.cdl2bpel.orchestra.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl#getSourceExpression <em>Source Expression</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.orchestra.impl.CopyImpl#getSourcePart <em>Source Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyImpl extends BPElementImpl implements Copy {
	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable targetVariable;

	/**
	 * The default value of the '{@link #getTargetPart() <em>Target Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPart()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPart() <em>Target Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPart()
	 * @generated
	 * @ordered
	 */
	protected String targetPart = TARGET_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceExpression() <em>Source Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceExpression()
	 * @generated
	 * @ordered
	 */
	protected String sourceExpression = SOURCE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceVariable() <em>Source Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable sourceVariable;

	/**
	 * The default value of the '{@link #getSourcePart() <em>Source Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePart()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePart() <em>Source Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePart()
	 * @generated
	 * @ordered
	 */
	protected String sourcePart = SOURCE_PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestraPackage.Literals.COPY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getTargetVariable() {
		if (targetVariable != null && targetVariable.eIsProxy()) {
			InternalEObject oldTargetVariable = (InternalEObject)targetVariable;
			targetVariable = (Variable)eResolveProxy(oldTargetVariable);
			if (targetVariable != oldTargetVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COPY__TARGET_VARIABLE, oldTargetVariable, targetVariable));
			}
		}
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariable(Variable newTargetVariable) {
		Variable oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COPY__TARGET_VARIABLE, oldTargetVariable, targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPart() {
		return targetPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPart(String newTargetPart) {
		String oldTargetPart = targetPart;
		targetPart = newTargetPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COPY__TARGET_PART, oldTargetPart, targetPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceExpression() {
		return sourceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceExpression(String newSourceExpression) {
		String oldSourceExpression = sourceExpression;
		sourceExpression = newSourceExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COPY__SOURCE_EXPRESSION, oldSourceExpression, sourceExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSourceVariable() {
		if (sourceVariable != null && sourceVariable.eIsProxy()) {
			InternalEObject oldSourceVariable = (InternalEObject)sourceVariable;
			sourceVariable = (Variable)eResolveProxy(oldSourceVariable);
			if (sourceVariable != oldSourceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestraPackage.COPY__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
			}
		}
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSourceVariable() {
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVariable(Variable newSourceVariable) {
		Variable oldSourceVariable = sourceVariable;
		sourceVariable = newSourceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COPY__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePart() {
		return sourcePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePart(String newSourcePart) {
		String oldSourcePart = sourcePart;
		sourcePart = newSourcePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestraPackage.COPY__SOURCE_PART, oldSourcePart, sourcePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrchestraPackage.COPY__TARGET_VARIABLE:
				if (resolve) return getTargetVariable();
				return basicGetTargetVariable();
			case OrchestraPackage.COPY__TARGET_PART:
				return getTargetPart();
			case OrchestraPackage.COPY__SOURCE_EXPRESSION:
				return getSourceExpression();
			case OrchestraPackage.COPY__SOURCE_VARIABLE:
				if (resolve) return getSourceVariable();
				return basicGetSourceVariable();
			case OrchestraPackage.COPY__SOURCE_PART:
				return getSourcePart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrchestraPackage.COPY__TARGET_VARIABLE:
				setTargetVariable((Variable)newValue);
				return;
			case OrchestraPackage.COPY__TARGET_PART:
				setTargetPart((String)newValue);
				return;
			case OrchestraPackage.COPY__SOURCE_EXPRESSION:
				setSourceExpression((String)newValue);
				return;
			case OrchestraPackage.COPY__SOURCE_VARIABLE:
				setSourceVariable((Variable)newValue);
				return;
			case OrchestraPackage.COPY__SOURCE_PART:
				setSourcePart((String)newValue);
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
			case OrchestraPackage.COPY__TARGET_VARIABLE:
				setTargetVariable((Variable)null);
				return;
			case OrchestraPackage.COPY__TARGET_PART:
				setTargetPart(TARGET_PART_EDEFAULT);
				return;
			case OrchestraPackage.COPY__SOURCE_EXPRESSION:
				setSourceExpression(SOURCE_EXPRESSION_EDEFAULT);
				return;
			case OrchestraPackage.COPY__SOURCE_VARIABLE:
				setSourceVariable((Variable)null);
				return;
			case OrchestraPackage.COPY__SOURCE_PART:
				setSourcePart(SOURCE_PART_EDEFAULT);
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
			case OrchestraPackage.COPY__TARGET_VARIABLE:
				return targetVariable != null;
			case OrchestraPackage.COPY__TARGET_PART:
				return TARGET_PART_EDEFAULT == null ? targetPart != null : !TARGET_PART_EDEFAULT.equals(targetPart);
			case OrchestraPackage.COPY__SOURCE_EXPRESSION:
				return SOURCE_EXPRESSION_EDEFAULT == null ? sourceExpression != null : !SOURCE_EXPRESSION_EDEFAULT.equals(sourceExpression);
			case OrchestraPackage.COPY__SOURCE_VARIABLE:
				return sourceVariable != null;
			case OrchestraPackage.COPY__SOURCE_PART:
				return SOURCE_PART_EDEFAULT == null ? sourcePart != null : !SOURCE_PART_EDEFAULT.equals(sourcePart);
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
		result.append(" (targetPart: ");
		result.append(targetPart);
		result.append(", sourceExpression: ");
		result.append(sourceExpression);
		result.append(", sourcePart: ");
		result.append(sourcePart);
		result.append(')');
		return result.toString();
	}

} //CopyImpl
