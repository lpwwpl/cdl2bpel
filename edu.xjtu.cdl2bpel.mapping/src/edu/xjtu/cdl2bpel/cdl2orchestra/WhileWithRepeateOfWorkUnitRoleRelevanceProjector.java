package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.WhileWithRepeateOfWorkUnitImpl;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class WhileWithRepeateOfWorkUnitRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	private static final boolean CONDITION_PROJECT_SINGLETON = true;
	
	public WhileWithRepeateOfWorkUnitRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == WhileWithRepeateOfWorkUnitImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {


		WhileWithRepeateOfWorkUnit whileWithRepeateOfWorkUnit = (WhileWithRepeateOfWorkUnit) cdlElement;
		edu.xjtu.cdl2bpel.orchestra.While orcheWhile = OrchestraFactory.eINSTANCE
				.createWhile();

		orcheWhile.setName(whileWithRepeateOfWorkUnit.getName());

		if (whileWithRepeateOfWorkUnit.getRepeatExpression() != null) {
			// elem.setExpression(convertExpression(when,
			// when.getGuardExpression(), CONDITION_PROJECT_SINGLETON));
		}

		if (whileWithRepeateOfWorkUnit.getBreakOutExpression() != null) {
			orcheWhile.setBreakOutExpression(convertExpression(
					whileWithRepeateOfWorkUnit, whileWithRepeateOfWorkUnit
							.getBreakOutExpression(),
					CONDITION_PROJECT_SINGLETON));
		}

		if (whileWithRepeateOfWorkUnit.getRepeatExpression() != null) {
			orcheWhile.setAdditional(convertExpression(whileWithRepeateOfWorkUnit, whileWithRepeateOfWorkUnit
					.getRepeatExpression(), CONDITION_PROJECT_SINGLETON));
		}

		// elem.setReEvaluate(when.getReEvaluate());
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheWhile);
		context.pushBPElementStack(orcheWhile);
		Iterator iter = orcheWhile.eContents().iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
}
