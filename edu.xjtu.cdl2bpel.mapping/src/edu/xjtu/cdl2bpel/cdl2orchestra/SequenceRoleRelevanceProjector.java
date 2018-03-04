package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.impl.SequenceImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class SequenceRoleRelevanceProjector extends OrderingStructuralActivityRoleRelevanceProjector{

	public SequenceRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == SequenceImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(CDL2OrchestraRoleRelevanceContext context) {
		
		Sequence sequence = (Sequence)cdlElement;
		
		edu.xjtu.cdl2bpel.orchestra.Sequence orcheSequce = OrchestraFactory.eINSTANCE
				.createSequence();
//
//		orcheSequce.setName(CheckNOthersUtil.getNameFromDescription(sequence
//				.getDescription()));
//
		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheSequce);
//		
		context.pushBPElementStack(orcheSequce);
		Iterator iter = retriveActivities(sequence.getActivities()).iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
		
	}
	
}
