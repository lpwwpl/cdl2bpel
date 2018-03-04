package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Interaction;

public interface ExtractCDLInteractionCallee {
	public void extractInteractionCallee(List<Interaction> interactions);
	
	public List<Interaction> getInteractions();
	
	public boolean isExitsInInteractionCalleeList(RoleItem roleItem);
	public List<InteractionCallee> getInteractionsOfBeginEnd();
}
