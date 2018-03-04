package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.SilentAction;
import edu.xjtu.cdl2bpel.cdl.impl.SilentActionImpl;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.UnobservableBySilenAction;

public class SilentActionRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	public SilentActionRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == SilentActionImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		SilentAction silentAction = (SilentAction)cdlElement;
		UnobservableBySilenAction orcheSilentAction = OrchestraFactory.eINSTANCE
				.createUnobservableBySilenAction();
		orcheSilentAction.setAdditional("true");

		orcheSilentAction.setName(silentAction.getName());

		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheSilentAction);
	}
}
