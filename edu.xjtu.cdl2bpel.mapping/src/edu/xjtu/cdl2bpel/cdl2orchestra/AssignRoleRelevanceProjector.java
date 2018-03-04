package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.impl.AssignImpl;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.CaseException;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class AssignRoleRelevanceProjector extends AbstractCDL2OrchestraProjector {

	public AssignRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == AssignImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(CDL2OrchestraRoleRelevanceContext context) {
		
		Assign assign = (Assign)cdlElement;
		Vector exceptions = new Vector();
		BPOrchestra bpOrchestra = null;

		if (context.getCurrentBPElement() instanceof BPActivity) {
			bpOrchestra = ((BPActivity) context.getCurrentBPElement())
					.getBelongedBPOrchestra();
		}

		// AtomicUnit atomic=null;
		//			
		// if (assign.getCopyInfo().size() > 1) {
		// atomic = OrchestraFactory.eINSTANCE.createAtomicUnit();
		// }
		
		edu.xjtu.cdl2bpel.orchestra.Assign orcheAssign = OrchestraFactory.eINSTANCE
				.createAssign();

		for (int i = 0; i < assign.getCopyOfAssign().size(); i++) {
			CopyOfAssign copy = (CopyOfAssign) assign.getCopyOfAssign().get(i);
			edu.xjtu.cdl2bpel.orchestra.Copy theCopy = OrchestraFactory.eINSTANCE
					.createCopy();

			if (copy.getSourceExpression() != null) {
				theCopy.setSourceExpression(copy.getSourceExpression());
			} else if (copy.getSourceVariable() != null) {
				edu.xjtu.cdl2bpel.orchestra.Variable sourceVar = bpOrchestra
						.getVariable(copy.getSourceVariable().getName());
				theCopy.setSourceVariable(sourceVar);
				theCopy.setSourcePart(copy.getSourceVariablePart());
			} else {

			}
			edu.xjtu.cdl2bpel.orchestra.Variable targetVar = bpOrchestra
					.getVariable(copy.getTargetVariable().getName());
			theCopy.setTargetVariable(targetVar);

			if (copy.getTargetVariablePart() != null) {
				theCopy.setTargetPart(copy.getTargetVariablePart());
			}

			orcheAssign.getCopies().add(theCopy);
			addActivity2StructIfCurrentElementBeOrderingStructuralActivity(orcheAssign);
			// Optimization to avoid creating atomic
			// unit scope if only one copy element
			// if (atomic != null) {
			// atomic.getActivityTypes().add(elem);
			// } else {
			// addToScope(elem);
			// }

			if (copy.getCauseException() != null) {

				CaseException raise = OrchestraFactory.eINSTANCE
						.createCaseException();

				raise.setExceptionValue(convertQName(copy, copy
						.getCauseException()));
				exceptions.add(raise);
			}
		}
		
		// if (atomic != null) {
		// addToScope(atomic);
		// }

		for (int i = 0; i < exceptions.size(); i++) {
			CaseException raise = (CaseException) exceptions.get(i);
			addActivity2StructIfCurrentElementBeOrderingStructuralActivity(raise);
		}
	}
	
	protected String convertQName(CDLElement cdlType, String qname) {
		String ret = qname;

		if (XMLUtils.getPrefix(qname) == null) {
			ret = GLOBAL_NS_PREFIX + ":" + qname;
		}

		/*
		 * ret = NameSpaceUtil.getFullyQualifiedName(namespace, localpart);
		 */

		return (ret);
	}
}
