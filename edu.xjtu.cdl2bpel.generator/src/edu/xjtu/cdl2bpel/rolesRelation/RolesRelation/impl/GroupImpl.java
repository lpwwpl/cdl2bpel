package edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.impl;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleItem;

public class GroupImpl implements Group {

	private List<RoleType> roleTypesOfGroup;
	private String name;
	private Package pack;

	public GroupImpl(List<RoleItem> roleItems, String filepath) {
		pack = CDLResolver.getPackageFromCDLFile(filepath);
		roleTypesOfGroup = new ArrayList<RoleType>();
		name = getGroupName(roleItems);
		addRoleType(roleItems);
	}

	public void addRoleType(List<RoleItem> roleItems) {
		for(RoleItem roleItem:roleItems) {
			RoleType roleType = roleItem.getRoleType();
			roleTypesOfGroup.add(roleType);
		}
	}

	public String getGroupName(List<RoleItem> roleItems) {
		String ret = "";
		for(RoleItem roleItem:roleItems) {
			RoleType roleType = roleItem.getRoleType();
			ret+=roleType.getName()+"_";
		}
		ret = ret.substring(0,ret.length()-1);
		return ret;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<RoleType> getRoleType() {
		return roleTypesOfGroup;
	}

	@Override
	public void setName(String value) {
		name = value;
	}
}

