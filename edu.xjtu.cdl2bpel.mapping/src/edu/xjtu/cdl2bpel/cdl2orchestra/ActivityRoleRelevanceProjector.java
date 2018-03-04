//package edu.xjtu.cdl2bpel.cdl2orchestra;
//
//import java.util.Iterator;
//
//import edu.xjtu.cdl2bpel.cdl.Assign;
//import edu.xjtu.cdl2bpel.cdl.CDLElement;
//import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
//import edu.xjtu.cdl2bpel.cdl.Choice;
//import edu.xjtu.cdl2bpel.cdl.Interaction;
//import edu.xjtu.cdl2bpel.cdl.NoAction;
//import edu.xjtu.cdl2bpel.cdl.Parallel;
//import edu.xjtu.cdl2bpel.cdl.Perform;
//import edu.xjtu.cdl2bpel.cdl.RoleType;
//import edu.xjtu.cdl2bpel.cdl.Sequence;
//import edu.xjtu.cdl2bpel.cdl.SilentAction;
//import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
//import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
//import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
//
//public class ActivityRoleRelevanceProjector extends AbstractCDL2OrchestraProjector {
//
//	public ActivityRoleRelevanceProjector(CDLElement cdlElement,
//			RoleType[] roleTypes, GlobalArchitecture globalArchitecture) {
//		super(cdlElement, roleTypes, globalArchitecture);
//		// TODO Auto-generated constructor stub
//	}
//
//	public CDL2OrchestraRoleRelevanceVisitor newCDLElementVisitor(CDLElement cdlElement) {
//		CDL2OrchestraRoleRelevanceVisitor cdlElementVisitor = null;
//		
//		if(cdlElement instanceof Interaction) {
//			cdlElementVisitor= new InteractionRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof Choice) {
//			cdlElementVisitor = new ChoiceRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof Perform) {
//			cdlElementVisitor = new PerformRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof Sequence) {
//			cdlElementVisitor = new SequenceRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof Parallel) {
//			cdlElementVisitor = new ParallelRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof CaseConditionalOfSwitch) {
//			cdlElementVisitor = new CaseConditionalOfSwitchRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof Assign) {
//			cdlElementVisitor = new AssignRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof NoAction) {
//			cdlElementVisitor = new NoActionRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof WhenWithBlockOfWorkUnit) {
//			cdlElementVisitor = new WhenRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof WhileWithRepeateOfWorkUnit) {
//			cdlElementVisitor = new WhileRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof SilentAction) {
//			cdlElementVisitor = new SilentActionRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		} else if(cdlElement instanceof RecordInfo) {
//			cdlElementVisitor = new RecordInfosRoleRelevanceProjector(cdlElement,getRoleTypes(),getGlobalArchitecture());
//		}
//		
//		return cdlElementVisitor;
//	}
//
//	@Override
//	public void visit(CDLElement cdlElement) {
//		// TODO Auto-generated method stub
//		Iterator it = cdlElement.eContents().iterator();
//		while(it.hasNext()) {
//			CDLElement subCdlElement = (CDLElement)it.next();
//			CDL2OrchestraRoleRelevanceVisitor subCDLElementVisitor = newCDLElementVisitor(subCdlElement);
//			subCdlElement.accept(subCDLElementVisitor);
//		}
//	}
//}
