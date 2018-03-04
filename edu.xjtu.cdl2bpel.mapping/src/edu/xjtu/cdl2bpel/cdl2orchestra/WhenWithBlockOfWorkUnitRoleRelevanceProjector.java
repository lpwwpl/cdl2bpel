package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.WhenWithBlockOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class WhenWithBlockOfWorkUnitRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	private static final boolean CONDITION_PROJECT_SINGLETON = true;
	
	public WhenWithBlockOfWorkUnitRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == WhenWithBlockOfWorkUnitImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		WhenWithBlockOfWorkUnit whenWithBlockOfWorkUnit = (WhenWithBlockOfWorkUnit)cdlElement;
		edu.xjtu.cdl2bpel.orchestra.When orcheWhen = OrchestraFactory.eINSTANCE
				.createWhen();

		orcheWhen.setName(whenWithBlockOfWorkUnit.getName());

		if (whenWithBlockOfWorkUnit.getRepeatExpression() != null) {
			// elem.setExpression(convertExpression(when,
			// when.getGuardExpression(), CONDITION_PROJECT_SINGLETON));
		}

		if (isNotNull(whenWithBlockOfWorkUnit.getGuardExpression())) {
			orcheWhen.setMatchedExpression(convertExpression(whenWithBlockOfWorkUnit, whenWithBlockOfWorkUnit
					.getGuardExpression(), CONDITION_PROJECT_SINGLETON));
		}

		// elem.setReEvaluate(when.getReEvaluate());
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheWhen);
		context.pushBPElementStack(orcheWhen);
		Iterator iter = orcheWhen.eContents().iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
