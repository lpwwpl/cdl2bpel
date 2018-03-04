package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ScopeWithNoAttrOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.ScopeWithNoAttrOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.ScopeWithNoAttr;

public class ScopeWithNoAttrOfWorkUnitRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public ScopeWithNoAttrOfWorkUnitRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ScopeWithNoAttrOfWorkUnitImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		ScopeWithNoAttrOfWorkUnit scopeWithNoAttrOfWorkUnit = (ScopeWithNoAttrOfWorkUnit)cdlElement;
		ScopeWithNoAttr orcheScope = OrchestraFactory.eINSTANCE.createScopeWithNoAttr();
		
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheScope);
		context.pushBPElementStack(orcheScope);
		Iterator iter = scopeWithNoAttrOfWorkUnit.eContents().iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
//	String repeatValue = workUnit.getRepeatExpression();
//	String guardValue = workUnit.getGuardExpression();
//	String blockValue = workUnit.getBlock();
//	
//	BPElement bpElement = null;
//	
//	if(guardValue!=null) {
//		bpElement = OrchestraFactory.eINSTANCE.createConditional();
//		((Conditional)bpElement).setExpression(guardValue);
//	} else if(repeatValue!=null) {
//		bpElement = OrchestraFactory.eINSTANCE.createWhile();
//		((While)bpElement).setBreakOutExpression(repeatValue);
//	} else if(blockValue!=null) {
//		bpElement = OrchestraFactory.eINSTANCE.createWhen();
//		((When)bpElement).setMatchedExpression(blockValue);
//	} else {
//		bpElement = OrchestraFactory.eINSTANCE.createScopeWithNoAttr();
//	}
//
//	addActivity2StructIfCurrentElementBeOrderingStructuralActivity(bpElement);
//	
//	context.pushBPElementStack(bpElement);
//	Iterator iter = workUnit.eContents().iterator();
//	while (iter.hasNext()) {
//		CDLElement subCdlElement = (CDLElement) iter.next();
//		AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
//		subCdlElement.accept(subCDLElementVisitor);
//	}
//	context.popBPElementStack();
	}
}
