package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.ExceptionWorkUnitImpl;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.DefaultXPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.ValidationResult;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathValidator;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.When;
import edu.xjtu.cdl2bpel.orchestra.While;

public class ExceptionWorkUnitRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public ExceptionWorkUnitRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ExceptionWorkUnitImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		ExceptionWorkUnit exceptionWorkUnit = (ExceptionWorkUnit) cdlElement;
		
		String repeatValue = exceptionWorkUnit.getRepeatExpression();
		String guardValue = exceptionWorkUnit.getGuardExpression();
		String blockValue = exceptionWorkUnit.getBlock();
		
		BPElement bpElement = null;
		
		if(guardValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createConditional();
			((Conditional)bpElement).setExpression(guardValue);
			String excTypeName = "";
		
			((Conditional)bpElement).setAdditional(convertQName(exceptionWorkUnit,
					exceptionWorkUnit.getExceptionType()));	
		} else if(repeatValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createWhile();
			((While)bpElement).setBreakOutExpression(repeatValue);
		} else if(blockValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createWhen();
			((When)bpElement).setMatchedExpression(blockValue);
		}

		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(bpElement);
		
		context.pushBPElementStack(bpElement);
		Iterator iter = retriveActivities(exceptionWorkUnit.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
