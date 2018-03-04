package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.impl.NoActionImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class NoActionRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	public NoActionRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == NoActionImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}

	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		NoAction noAction = (NoAction)cdlElement;
		edu.xjtu.cdl2bpel.orchestra.NoAction orcheNoAction = OrchestraFactory.eINSTANCE
				.createNoAction();

		String name = CheckNOthersUtil.getNameFromDescription(noAction
				.getDescription());
		orcheNoAction.setName(name);
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheNoAction);
	}
}
