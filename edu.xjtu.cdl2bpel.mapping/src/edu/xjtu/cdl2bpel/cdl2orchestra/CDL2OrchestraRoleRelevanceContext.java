package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.Stack;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;

public interface CDL2OrchestraRoleRelevanceContext {	
	
	public GlobalArchitecture getGlobalArchitecture() ;

	public void setGlobalArchitecture(GlobalArchitecture globalArchitecture);

	public RoleType[] getRoleTypes();

	public void setRoleTypes(RoleType[] roleTypes);
	
	////////////////////////////////
	public void setBPOrchestraStack(Stack<BPOrchestra> orchestraStack);
	
	public Stack<BPOrchestra> getBPOrchestraStack();
	
	public void popBPOrchestraStack();
	
	public void pushBPOrchestraStack(BPOrchestra elem);
	
	public BPOrchestra getCurrentBPOrchestra();
	/////////////////////////////////
	
	//###############################
	public void pushBPElementStack(BPElement elem);
	
	public void popBPElementStack();
	
	public Stack<BPElement> getCurrentBPElementStack();
	
	public BPElement getCurrentBPElement();
	//###############################
	
	//*******************************	
//	public  CDLElement getCurrentCDLElement();
//	
//	public  Stack<CDLElement> getCdlElemntStack();
//
//	public  void setCdlElemntStack(Stack<CDLElement> cdlElemntStack);
//	
//	public  void pushCdlElementStack(CDLElement cdlElement);
//	
//	public  void popCdlElementStack();
	//*******************************	
	
	public BPOrchestra getBPOrchestra(Choreography choreography,			
			BPOrchestra parent);
}
