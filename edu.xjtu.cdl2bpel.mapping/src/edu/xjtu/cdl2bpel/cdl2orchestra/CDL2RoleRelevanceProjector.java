package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class CDL2RoleRelevanceProjector {
	
	private GlobalArchitecture globalArchitecture = null;
	private CDL2OrchestraRoleRelevanceContext context = null;
	
	public CDL2RoleRelevanceProjector(
			RoleType[] roleTypes) {
		globalArchitecture = OrchestraFactory.eINSTANCE.createGlobalArchitecture();
		context = new CDL2OrchestraRoleRelevanceContextImpl(roleTypes,globalArchitecture);
	}
	
	public GlobalArchitecture getGlobalArchitecture() {
		return globalArchitecture;
	}
	public void setGlobalArchitecture(GlobalArchitecture globalArchitecture) {
		this.globalArchitecture = globalArchitecture;
	}
	public RoleType[] getRoleTypes() {
		return context.getRoleTypes();
	}
	public void execute(Package cdlPackage) {
		PackageRoleRelevanceProjector projector = new PackageRoleRelevanceProjector(cdlPackage,context);
//		context.pushCdlElementStack(cdlPackage);
		cdlPackage.accept(projector);
	}
}
