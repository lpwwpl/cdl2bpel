package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;

public class ExtractCDLInteractionCalleeImpl implements
		ExtractCDLInteractionCallee {

	private Package cdlpack = null;
	private List<InteractionCallee> interactionsOfBeginEnd = null;
	private RoleItem[] roleItems;
	private List<Interaction> interactions = null;

	public ExtractCDLInteractionCalleeImpl(Package cdlpack, RoleItem[] roleItems) {
		this.cdlpack = cdlpack;
		this.roleItems = roleItems;
		interactions = new ArrayList<Interaction>();
		interactionsOfBeginEnd = new ArrayList<InteractionCallee>();
		extractCDLElement(cdlpack);
	}

	public void extractCDLElement(CDLElement cdlElement) {
		if (cdlElement instanceof Interaction) {
			extractCDLInteraction((Interaction) cdlElement);
		} else {
			Iterator it = cdlElement.eContents().iterator();
			for (; it.hasNext();) {
				CDLElement subCDLElemnt = (CDLElement) it.next();
				extractCDLElement(subCDLElemnt);
			}
		}
	}

	public void extractCDLInteraction(Interaction interaction) {
		if (interaction.getTheToRoleOfInteraction() == null) {

		}
		// Create prefix resolver
		Package cdlpack = interaction.getBelongedPackage();
		java.util.Iterator iter = interaction.getExchangeInfos().iterator();
		interactions.add(interaction);
	}

	public void extractInteractionCallee(List<Interaction> interactions) {
		for (RoleItem roleItem : roleItems) {
			if(roleItem.getParticipant().getRoleTypes().size() == 1){
				boolean flag = true;
				List<Interaction> temp = new ArrayList();
				for (Interaction interaction : interactions) {
					if (isCallerByOthers(roleItem, interaction)) {
						flag = false;
					} else {
						
					}
				}
				
				if (flag == true) {
					InteractionCallee interactionCallee = new InteractionCallee(
							roleItem);
//					interactionCallee.setInteractionsInvokeByRoleItem(temp);
					System.out.println("##########");
					interactionsOfBeginEnd.add(interactionCallee);
				}
			}
		}
	}

	public boolean isExitsInInteractionCalleeList(RoleItem roleItem) {
		boolean ret = false;
		for (InteractionCallee callee : interactionsOfBeginEnd) {
			if (callee.getRoleItem().getRoleType().getName().equals(
					roleItem.getRoleType().getName())) {
				ret = true;
				break;
			}
		}
		return ret;
	}

	public boolean isCallerByOthers(RoleItem roleItem, Interaction interaction) {
		boolean ret = false;
		RoleType calleeRoleType = interaction.getTheFromRoleOfInteraction();
		System.out.println(roleItem.getRoleType().getName());
		if (calleeRoleType.getName().equals(roleItem.getRoleType().getName())) {
			ret = true;
		}
		return ret;
	}

	public Package getCdlpack() {
		return cdlpack;
	}

	public List<InteractionCallee> getInteractionsOfBeginEnd() {
		return interactionsOfBeginEnd;
	}

	public RoleItem[] getRoleItems() {
		return roleItems;
	}

	public List<Interaction> getInteractions() {
		return interactions;
	}
}
