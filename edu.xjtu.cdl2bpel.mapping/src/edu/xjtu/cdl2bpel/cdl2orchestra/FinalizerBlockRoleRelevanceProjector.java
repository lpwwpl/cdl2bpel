package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.WorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.FinalizerBlockImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.When;
import edu.xjtu.cdl2bpel.orchestra.While;

public class FinalizerBlockRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public FinalizerBlockRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == FinalizerBlockImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		FinalizerBlock finalizerBlock = (FinalizerBlock)cdlElement;
		
		edu.xjtu.cdl2bpel.orchestra.CompensateHandler orcheCompensateHandler=
			OrchestraFactory.eINSTANCE.createCompensateHandler();
		orcheCompensateHandler.setName(CheckNOthersUtil.getNameFromDescription(
				finalizerBlock.getName()));
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheCompensateHandler);
		context.pushBPElementStack(orcheCompensateHandler);
		
		//################################
		context.getCurrentBPOrchestra().getCompensateHandlers().add(orcheCompensateHandler);
		
		Iterator iter = retriveActivities(finalizerBlock.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
//			System.out.println(subCdlElement);
//			if(subCdlElement instanceof WorkUnit) {
//				doFinalizerBlockWorkUnit((WorkUnit)subCdlElement);
//			} else {
				AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
				subCdlElement.accept(subCDLElementVisitor);
//			}
		}
		context.popBPElementStack();
	}
	
	public void doFinalizerBlockWorkUnit(WorkUnit workUnit) {
		
		String repeatValue = workUnit.getRepeatExpression();
		String guardValue = workUnit.getGuardExpression();
		String blockValue = workUnit.getBlock();
		
		BPElement bpElement = null;
		
		if(guardValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createConditional();
			((Conditional)bpElement).setExpression(guardValue);
		} else if(repeatValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createWhile();
			((While)bpElement).setBreakOutExpression(repeatValue);
		} else if(blockValue!=null) {
			bpElement = OrchestraFactory.eINSTANCE.createWhen();
			((When)bpElement).setMatchedExpression(blockValue);
		} else {
			bpElement = OrchestraFactory.eINSTANCE.createScopeWithNoAttr();
		}

		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(bpElement);
		
		context.pushBPElementStack(bpElement);
		Iterator iter = retriveActivities(workUnit.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
