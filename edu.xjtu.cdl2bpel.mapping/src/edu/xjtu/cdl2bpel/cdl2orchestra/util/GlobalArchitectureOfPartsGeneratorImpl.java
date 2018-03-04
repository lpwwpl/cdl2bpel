package edu.xjtu.cdl2bpel.cdl2orchestra.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class GlobalArchitectureOfPartsGeneratorImpl implements
		GlobalArchitectureOfPartsGenerator {

	private List<RoleType> roleTypes = null;
	private GlobalArchitecture mergedGlobalArchitecture = null;
	private List<GlobalArchitecture> globalArchitectures = null;
	private Package cdlpack = null;
	private GlobalArchitecture resultGlobalArchitecture = null;

	public static void main(String[] args) {
		Package cdlpack = CDLResolver.getPackageFromCDLFile(
				"cdl/packman_new.cdl");

		RoleType[] roleTypes = new RoleType[] {
				CDLPackageUtil.getRoleType(cdlpack, "Assessor"),
				CDLPackageUtil.getRoleType(cdlpack, "LoanApproval"),
				CDLPackageUtil.getRoleType(cdlpack, "ApprovalCoordinator") 
				};
		GlobalArchitectureOfPartsGenerator lpw = new GlobalArchitectureOfPartsGeneratorImpl(
				cdlpack, roleTypes);
		try {
			GlobalArchitecture ret = lpw.merge();
			ByteArrayOutputStream baos1 = new java.io.ByteArrayOutputStream();
			save(ret, baos1, "UTF-8");
			System.out.println(baos1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public GlobalArchitectureOfPartsGeneratorImpl(Package cdlpack,
			RoleType[] roleTypes) {
		this.cdlpack = cdlpack;
		this.roleTypes = new ArrayList<RoleType>();
		globalArchitectures = new ArrayList<GlobalArchitecture>();
		for (RoleType roleType : roleTypes) {
			this.roleTypes.add(roleType);
		}
	}

	public void generateGloblArchitectures() {
		List<ParticipantType> participants = cdlpack.getParticipantTypes();
		List<RoleType[]> tempRoleTypes = new ArrayList<RoleType[]>();

		for (ParticipantType participant : participants) {
			if (roleTypes.containsAll(participant.getRoleTypes())) {
				tempRoleTypes.add((RoleType[]) participant.getRoleTypes()
						.toArray());
			}
		}

		for (RoleType[] roleTypeMatrix : tempRoleTypes) {
			CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
					roleTypeMatrix);
			temp.execute(cdlpack);
			GlobalArchitecture globalArchitecture = temp
					.getGlobalArchitecture();
			globalArchitectures.add(globalArchitecture);
		}
	}

	public BPOrchestra getRootBPOrchestra(GlobalArchitecture globalArchitecture) {
		BPOrchestra orche = null;
		for (BPOrchestra bpOrchestra : globalArchitecture.getBpOrchestras()) {
			if (bpOrchestra.getRoot() == true) {
				orche = bpOrchestra;
				break;
			}
		}
		return orche;
	}

	public List<BPOrchestra> getNorRootBPOrchestra(GlobalArchitecture globalArchitecture) {
		List<BPOrchestra> norRootOrches = new ArrayList<BPOrchestra>();
		for (BPOrchestra bpOrchestra : globalArchitecture.getBpOrchestras()) {
			if (bpOrchestra.getRoot() == true) {
	
			} else {
				norRootOrches.add(bpOrchestra);
			}
		}
		return norRootOrches;
	}
	
	public GlobalArchitecture merge() {
		generateGloblArchitectures();
		resultGlobalArchitecture = getMergedGlobalArchitecture();
		BPOrchestra resultRootBPOrchestra = getRootBPOrchestra(resultGlobalArchitecture);
//		List<BPOrchestra> resultNorRootBPOrchestra  = getNorRootBPOrchestra(resultGlobalArchitecture);
		
		edu.xjtu.cdl2bpel.orchestra.Choice choice = OrchestraFactory.eINSTANCE
				.createChoice();
		
		for (GlobalArchitecture globalArchitecture : globalArchitectures) {
			edu.xjtu.cdl2bpel.orchestra.Conditional  conditional = OrchestraFactory.eINSTANCE
					.createConditional();

			String firstActivity = getRootBPOrchestra(globalArchitecture)
					.getActivityTypes().get(0).getAdditional();
			if(firstActivity!=null && firstActivity.equals(resultRootBPOrchestra.getActivityTypes().get(0).getAdditional())) {
				
			} else {
				conditional.setActivityTypes(getRootBPOrchestra(globalArchitecture)
						.getActivityTypes());
			}
			choice.getActivityTypes().add(conditional);
			
//			List<BPOrchestra> norRootBPOrchestraOfGlobalArchitecture = getNorRootBPOrchestra(globalArchitecture);
//			for(BPOrchestra bpOrchestra:norRootBPOrchestraOfGlobalArchitecture) {
//				if(resultNorRootBPOrchestra.contains(bpOrchestra)) {
//					
//				} else {
//					resultNorRootBPOrchestra.add(bpOrchestra);
//				}
//			}
		}
		
		resultRootBPOrchestra.getActivityTypes().add(choice);
		resultGlobalArchitecture.getBpOrchestras().remove(
				getRootBPOrchestra(resultGlobalArchitecture));
		resultGlobalArchitecture.getBpOrchestras().add(resultRootBPOrchestra);
		
		return resultGlobalArchitecture;
	}

	public List<RoleType> getRoleTypes() {
		return roleTypes;
	}

	public void setRoleTypes(List<RoleType> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public GlobalArchitecture getMergedGlobalArchitecture() {
		if (mergedGlobalArchitecture == null) {
			RoleType[] theRoleTypes = new RoleType[roleTypes.size()];
			CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
					roleTypes.toArray(theRoleTypes));
			temp.execute(cdlpack);
			mergedGlobalArchitecture = temp.getGlobalArchitecture();
		}
		return mergedGlobalArchitecture;
	}

	public void setMergedGlobalArchitecture(
			GlobalArchitecture mergedGlobalArchitecture) {
		this.mergedGlobalArchitecture = mergedGlobalArchitecture;
	}

	public List<GlobalArchitecture> getGlobalArchitectures() {
		return globalArchitectures;
	}

	public void setGlobalArchitectures(
			List<GlobalArchitecture> globalArchitectures) {
		this.globalArchitectures = globalArchitectures;
	}

	public static void save(GlobalArchitecture desc, java.io.OutputStream os,
			String encoding) throws Exception {

		desc = (GlobalArchitecture) org.eclipse.emf.ecore.util.EcoreUtil
				.copy(desc);

		final org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl xmi = new org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl();
		xmi.getContents().add(desc);

		if (encoding != null) {
			xmi.setEncoding(encoding);
		}

		try {
			xmi.doSave(os, xmi.getDefaultSaveOptions());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
