package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.impl.GroupImpl;

public class RoleRelationAlgorithm {

	private float threshold = 1.0f;
	private String filepath;
	private Map<Integer, List<RoleItem>> groupinfo;
	private Map<RoleItem, Integer> tempMap;
	private List<Group> groups;
	private RoleArrayManager rolemanager;

	public List<Group> getGroups() {
		return groups;
	}

	public RoleRelationAlgorithm(String filepath) {
		groupinfo = new HashMap<Integer, List<RoleItem>>();
		groups = new ArrayList<Group>();
		this.filepath = filepath;
		rolemanager = RoleArrayManager.getManager(filepath);
	}

	public Map<Integer, List<RoleItem>> getGroupInfo() {
		return groupinfo;
	}

	public static void main(String args[]) {
		String filePath = "E:\\eclipse\\runtime-New_configuration\\lpw\\loanapproval.cdl";
		RoleRelationAlgorithm rra = new RoleRelationAlgorithm(filePath);
		rra.caculate(rra.filepath);
		System.out.println(rra.groupinfo);
	}

	public void caculate(String filepath) {
		tempMap = new HashMap<RoleItem, Integer>();
		groupinfo.clear();
		RoleItem[] roleItems = RoleArrayManager.getManager(filepath)
				.getRoleItems();
		CorrelationRatioGenerator cora = new CorrelationRatioGenerator(
				rolemanager);

		ExtractCDLInteractionCallee interactionCalleeExtractor = new ExtractCDLInteractionCalleeImpl(
				rolemanager.getCDLPackage(), roleItems);
		interactionCalleeExtractor
				.extractInteractionCallee(interactionCalleeExtractor
						.getInteractions());

		System.out.println(interactionCalleeExtractor.getInteractionsOfBeginEnd());
		int index = 0;
		for (int i = 0; i < roleItems.length; i++) {
			for (int j = i + 1; j < roleItems.length; j++) {
				if (cora.getRatio(roleItems[i], roleItems[j]) == 1) {
					setGroupindex(roleItems[i], index);
					setGroupindex(roleItems[j], index);
					index++;
				}
			}
		}

		for (int i = 0; i < roleItems.length; i++) {
			for (int j = i + 1; j < roleItems.length; j++) {
				if (getGroupindex(roleItems[i]) == -1
						&& getGroupindex(roleItems[j]) == -1) {
					if (cora.getRatio(roleItems[i], roleItems[j]) > threshold
							&& (interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[i]) || interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[j]))) {
						setGroupindex(roleItems[i], index);
						setGroupindex(roleItems[j], index);
						index++;
					} else {
						setGroupindex(roleItems[i], index++);
						setGroupindex(roleItems[j], index++);
					}
				} else if (getGroupindex(roleItems[i]) == -1
						&& getGroupindex(roleItems[j]) != -1) {
					if (cora.getRatio(roleItems[i], roleItems[j]) > threshold
							&& (interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[i]) || interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[j]))) {
						setGroupindex(roleItems[i], getGroupindex(roleItems[j]));
					} else {
						setGroupindex(roleItems[i], index++);
					}
				} else if (getGroupindex(roleItems[j]) == -1
						&& getGroupindex(roleItems[i]) != -1) {
					if (cora.getRatio(roleItems[i], roleItems[j]) > threshold
							&& (interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[i]) || interactionCalleeExtractor
									.isExitsInInteractionCalleeList(roleItems[j]))) {
						setGroupindex(roleItems[j], getGroupindex(roleItems[i]));
					} else {
						setGroupindex(roleItems[j], index++);
					}
				} else {

				}
			}
		}

		for (int p = 0, q = 1; p < roleItems.length; p++) {
			if (tempMap.containsValue(p)) {
				List<RoleItem> roleItemsOfGroup = getRoleItemGroup(p);
				groupinfo.put(q, roleItemsOfGroup);
				Group group = new GroupImpl(roleItemsOfGroup, filepath);
				groups.add(group);
				q++;
			}
		}
	}

	public void setThreshold(float num) {
		threshold = num;
	}

	public float getThreshlod() {
		return threshold;
	}

	protected void setGroupindex(RoleItem roleItem, int i) {
		tempMap.put(roleItem, i);
	}

	protected int getGroupindex(RoleItem roleItem) {
		if (tempMap.containsKey(roleItem)) {
			return tempMap.get(roleItem);
		}
		return -1;
	}

	protected List<RoleItem> getRoleItemGroup(int p) {
		List<RoleItem> ret = new ArrayList<RoleItem>();
		Iterator iter = tempMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			RoleItem ri = (RoleItem) entry.getKey();
			if (tempMap.get(ri) == p) {
				ret.add(ri);
			}
		}
		return ret;
	}

	public String getFilepath() {
		return filepath;
	}
}
