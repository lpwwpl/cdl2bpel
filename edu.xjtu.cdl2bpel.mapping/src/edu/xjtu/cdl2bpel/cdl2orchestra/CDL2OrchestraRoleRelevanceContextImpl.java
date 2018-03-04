package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.Stack;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class CDL2OrchestraRoleRelevanceContextImpl implements CDL2OrchestraRoleRelevanceContext{

	protected RoleType[] roleTypes;
	protected GlobalArchitecture globalArchitecture;
	protected List<InterfaceOfGroup> interfaceOfGroups = new ArrayList<InterfaceOfGroup>();
	protected BPElement currentBPElement = null;
	Stack<BPOrchestra> orchestraStack;
	Stack<BPElement> bpElementStack;
	
	public void setCurrentBPElement(BPElement bpElement) {
		this.currentBPElement = bpElement;
	}
	
//	private Stack<ChoreographyRoleRelevanceProjector> choreoProjectorStack = new Stack<ChoreographyRoleRelevanceProjector>();
//	
//	public Stack<ChoreographyRoleRelevanceProjector> getChoreoProjectorStack() {
//		return choreoProjectorStack;
//	}
//	public void setChoreoProjectorStack(
//			Stack<ChoreographyRoleRelevanceProjector> choreoProjectorStack) {
//		this.choreoProjectorStack = choreoProjectorStack;
//	}
	
//	Stack<CDLElement> cdlElemntStack;
	
//	public  Stack<CDLElement> getCdlElemntStack() {
//		return cdlElemntStack;
//	}
//
//	public  void setCdlElemntStack(Stack<CDLElement> cdlElemntStack) {
//		this.cdlElemntStack = cdlElemntStack;
//	}
//
//	public  CDLElement getCurrentCDLElement() {
//		return cdlElemntStack.peek();
//	}
//	
//	public  void pushCdlElementStack(CDLElement cdlElement) {
//		cdlElemntStack.push(cdlElement);
//	}
	
//	public  void popCdlElementStack() {
//		cdlElemntStack.pop();
//	}
//	
//	public CDL2OrchestraRoleRelevanceContextImpl() {
//		orchestraStack = new Stack<BPOrchestra>();
//		bpElementStack = new Stack<BPElement>();
//		cdlElemntStack = new Stack<CDLElement>();
//	}
	
	public BPOrchestra getCurrentBPOrchestra() {
		if(orchestraStack.isEmpty())return null;
		return orchestraStack.peek();
	}
	
	public void setBPOrchestraStack(Stack<BPOrchestra> orchestraStack) {
		this.orchestraStack = orchestraStack;
	}
	
	public Stack<BPOrchestra> getBPOrchestraStack() {
		return orchestraStack;
	}
	
	public void popBPOrchestraStack() {
		orchestraStack.pop();
	}
	
	public void pushBPOrchestraStack(BPOrchestra elem) {
		orchestraStack.push(elem);
	}
	
	public void pushBPElementStack(BPElement elem) {
		bpElementStack.push(elem);
	}
	
	public void popBPElementStack() {
		bpElementStack.pop();
	}
	
	public BPElement getCurrentBPElement() {
		if(bpElementStack.isEmpty())return null;
		currentBPElement = bpElementStack.peek();
		return currentBPElement;
	}
	
	
	public GlobalArchitecture getGlobalArchitecture() {
		return globalArchitecture;
	}

	public void setGlobalArchitecture(GlobalArchitecture globalArchitecture) {
		this.globalArchitecture = globalArchitecture;
	}

	public RoleType[] getRoleTypes() {
		return roleTypes;
	}

	public void setRoleTypes(RoleType[] roleTypes) {
		this.roleTypes = roleTypes;
	}
	
	public CDL2OrchestraRoleRelevanceContextImpl(RoleType[] roleTypes,GlobalArchitecture globalArchitecture) {
		this.roleTypes = new RoleType[roleTypes.length];
		for(int i=0;i<roleTypes.length;i++) {
			this.roleTypes[i] = roleTypes[i];
		}
//		this.roleTypes = (RoleType[]) roleTypes.(new RoleType[roleTypes.length]);
//		System.out.println(roleTypes);
		this.globalArchitecture = globalArchitecture;
		orchestraStack = new Stack<BPOrchestra>();
		bpElementStack = new Stack<BPElement>();
//		cdlElemntStack = new Stack<CDLElement>();
	}

	public BPOrchestra getBPOrchestra(Choreography choreography,			
			BPOrchestra parent) {
		BPOrchestra ret = null;
		String orcheName = choreography.getName();
		
		if ((choreography.eContainer() instanceof Choreography) == false) {
			
			ret = globalArchitecture.getBPOrchestra(orcheName);
			
			if (ret == null) {
				ret = OrchestraFactory.eINSTANCE.createBPOrchestra();
				ret.setName(orcheName);
				
				if (choreography.getRoot() == Boolean.TRUE) {
					ret.setRoot(Boolean.TRUE);
				}
				
				globalArchitecture.getBpOrchestras().add(ret);
			}
		} else {
			ret = parent.getEnclosedBPOrchestraByName(orcheName);
			
			if (ret == null) {
				ret = OrchestraFactory.eINSTANCE.createBPOrchestra();
				ret.setName(orcheName);
				parent.getEnclosedBPOrchestra().add(ret);
			}
		}
		
		return(ret);
	}
	
	@Override
	public Stack<BPElement> getCurrentBPElementStack() {
		// TODO Auto-generated method stub
		return bpElementStack;
	}	
}
