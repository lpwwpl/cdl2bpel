package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.orchestra.BPElement;

public interface CDL2OrchestraProjector {
	
	public boolean isRelevant(
			CDL2OrchestraRoleRelevanceContext context, Class intf);

	public void transformCDLElement2Orchestra(CDL2OrchestraRoleRelevanceContext context);
	
	public AbstractCDL2OrchestraProjector newTheCDL2OrchestraProjector(CDLElement cdlElement);
	
//	public CDL2OrchestraProjector getProxy(CDLElement cdlElementInf);
	
	public void transformCDLElement2OrchestraByRoleRelevance(CDL2OrchestraRoleRelevanceContext contex);
	
	public void addActivity2StructIfCurrentElementBeOrderingStructuralActivity(BPElement bpElement);
}
