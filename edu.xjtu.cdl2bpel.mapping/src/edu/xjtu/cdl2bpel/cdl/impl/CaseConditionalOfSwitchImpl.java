/**
 * CDL2BPEL_XJTU
 *
 * $Id: CaseConditionalOfSwitchImpl.java,v 1.1 2011/02/21 06:24:08 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl.impl;

import org.dom4j.Element;
import org.eclipse.emf.ecore.EClass;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Conditional Of Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CaseConditionalOfSwitchImpl extends WorkUnitImpl implements CaseConditionalOfSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseConditionalOfSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDLPackage.Literals.CASE_CONDITIONAL_OF_SWITCH;
	}

	public void resolveTheCDLElementByElement(Element elem) {
		if (elem.getName().equals("workunit")) {
			String repeatValue = elem.attributeValue("repeat");
			String blockValue = elem.attributeValue("block");
			String guardValue = elem.attributeValue("guard");
			if (repeatValue == null && blockValue == null && guardValue != null) {
				setGuardExpression(guardValue);
			}
			
			
			setName(elem.attributeValue("name"));
		}
		super.resolveTheCDLElementByElement(elem);
	}
//	public boolean isConditionalGroupingConstruct() {
//		return(true);
//	}
} //CaseConditionalOfSwitchImpl
