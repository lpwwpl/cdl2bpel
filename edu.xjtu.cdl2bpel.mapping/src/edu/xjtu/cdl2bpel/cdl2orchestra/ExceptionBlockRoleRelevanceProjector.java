package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.impl.ExceptionBlockImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class ExceptionBlockRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public ExceptionBlockRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ExceptionBlockImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		ExceptionBlock exceptionBlock = (ExceptionBlock)cdlElement;
		
		edu.xjtu.cdl2bpel.orchestra.FaultHandler orcheFaultHandler=
			OrchestraFactory.eINSTANCE.createFaultHandler();
		orcheFaultHandler.setName(CheckNOthersUtil.getNameFromDescription(
				exceptionBlock.getDescription()));
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheFaultHandler);
		context.pushBPElementStack(orcheFaultHandler);
		
		//################################
		context.getCurrentBPOrchestra().getExceptionHandlers().add(orcheFaultHandler);
		
		Iterator iter = retriveActivities(exceptionBlock.getExceptionWorkUnits()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
