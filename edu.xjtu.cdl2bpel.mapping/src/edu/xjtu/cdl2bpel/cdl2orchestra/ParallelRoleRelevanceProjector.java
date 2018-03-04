package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.impl.ParallelImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class ParallelRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public ParallelRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ParallelImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		Parallel parallel = (Parallel)cdlElement;
		edu.xjtu.cdl2bpel.orchestra.Parallel orcheParallel = OrchestraFactory.eINSTANCE
				.createParallel();
		orcheParallel.setName(CheckNOthersUtil
				.getNameFromDescription(parallel.getDescription()));

		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheParallel);
		context.pushBPElementStack(orcheParallel);
		Iterator iter = retriveActivities(parallel.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
