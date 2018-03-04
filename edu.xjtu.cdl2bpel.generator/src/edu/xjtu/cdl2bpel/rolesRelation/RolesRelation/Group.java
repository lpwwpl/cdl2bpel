package edu.xjtu.cdl2bpel.rolesRelation.RolesRelation;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.RoleType;

public interface Group  {

	List<RoleType> getRoleType();

	String getName();

	void setName(String value);

} 

