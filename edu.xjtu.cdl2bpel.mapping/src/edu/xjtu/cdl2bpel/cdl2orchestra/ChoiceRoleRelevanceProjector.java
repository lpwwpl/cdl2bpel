package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.impl.ChoiceImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.util.CDLActivityContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;

public class ChoiceRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector {

	public ChoiceRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ChoiceImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		Choice choice = (Choice)cdlElement;
		
		edu.xjtu.cdl2bpel.orchestra.Choice orcheChoice=
			OrchestraFactory.eINSTANCE.createChoice();
		orcheChoice.setName(CheckNOthersUtil.getNameFromDescription(
						choice.getDescription()));
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheChoice);
		context.pushBPElementStack(orcheChoice);
		Iterator iter = retriveActivities(choice.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
	}
	
	public EList retriveActivities(EList cdltypes) {
		EList ret=retriveActivitiesImpl(cdltypes);
		
		if (((Choice)cdlElement).getActivities().size() > ret.size()
				&& ret.size() > 0&&CDLActivityContextReasoner.isActivityInScope((Choice)cdlElement,context.getRoleTypes())) {
			String name = ChoiceContextReasoner.getOptionalPathName(((Choice)cdlElement));
			Sequence seq = CDLFactory.eINSTANCE.createSequence();
			NoAction noAction =CDLFactory.eINSTANCE.createNoAction();
			noAction.setName(name);
			seq.getActivities().add(noAction);
			ret.add(seq);
		}

		return (ret);
		
	}
}
