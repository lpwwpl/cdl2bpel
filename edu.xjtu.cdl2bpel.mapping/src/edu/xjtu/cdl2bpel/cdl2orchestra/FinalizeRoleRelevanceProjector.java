package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo;
import edu.xjtu.cdl2bpel.cdl.impl.FinalizeImpl;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.CompensateHandler;
import edu.xjtu.cdl2bpel.orchestra.Compensation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class FinalizeRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	private static final boolean CONDITION_PROJECT_SINGLETON = true;
	
	public FinalizeRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == FinalizeImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		Finalize finalize = (Finalize)cdlElement;
		boolean flag=false;
		
		if (finalize.getRoleTypeMatrixBindInfo().size() == 0) {
			
			flag = true;
		} else {
			java.util.Iterator iter=
				finalize.getRoleTypeMatrixBindInfo().iterator();
			
			while (flag == false && iter.hasNext()) {
				RoleTypeMatrixBindInfo bind=
					(RoleTypeMatrixBindInfo)
					iter.next();
				
			}
		}
		
		if (flag) {
			Compensation orcheCompensation=
				OrchestraFactory.eINSTANCE.createCompensation();
			
			// Obtain performed behavior
			BPOrchestra bd=
				context.getBPOrchestra(finalize.getChoreography(),
									 context.getCurrentBPOrchestra());
						
			if (bd != null) {
				String finalizerName=null;
				
				if (finalize.getFinalizerBlock() != null) {
					finalizerName = finalize.getFinalizerBlock().getName();
					
				} else if (finalize.getChoreography().getFinalizerBlocks().size() == 1) {
					FinalizerBlock fh=
						(FinalizerBlock)
						finalize.getChoreography().getFinalizerBlocks().get(0);
					
					finalizerName = fh.getName();
				}
				
				if (finalizerName != null) {
					// Find the completion handler. If not found
					// then create.
					CompensateHandler ch=bd.getCompensateHandler(finalizerName);
					
					if (ch == null) {
						ch = OrchestraFactory.eINSTANCE.createCompensateHandler();
						ch.setName(finalizerName);
						
						bd.getCompensateHandlers().add(ch);
					}
					
					orcheCompensation.setCompletionHandler(ch);
				}
				
				if (finalize.getChoreographyInstanceId()!=null) {
					orcheCompensation.setInstanceId(convertExpression(finalize,
							finalize.getChoreographyInstanceId(), CONDITION_PROJECT_SINGLETON));
				}
				
				addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheCompensation);

			} else {
				
			}
		}
	}
}
