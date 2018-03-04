/**
 * CDL2BPEL_XJTU
 *
 * $Id: ParallelImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.Parallel;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParallelImpl extends OrderingStructuralActivityImpl implements Parallel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.PARALLEL;
	}

	public boolean isGroupingConstruct() {
		return(true);
	}
} //ParallelImpl
