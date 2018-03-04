package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Interaction;

public class InteractionCallee {

	private RoleItem roleItem;
	private List<Interaction> interactionsInvokeByRoleItem = null;

	public InteractionCallee(RoleItem roleItem) {
		this.roleItem = roleItem;
		interactionsInvokeByRoleItem = new ArrayList<Interaction>();
	}
	
	public RoleItem getRoleItem() {
		return roleItem;
	}

	public void setRoleItem(RoleItem roleItem) {
		this.roleItem = roleItem;
	}

	public List<Interaction> getInteractionsInvokeByRoleItem() {
		return interactionsInvokeByRoleItem;
	}

	public void setInteractionsInvokeByRoleItem(
			List<Interaction> interactionsInvokeByRoleItem) {
		this.interactionsInvokeByRoleItem = interactionsInvokeByRoleItem;
	}
	
	
}
