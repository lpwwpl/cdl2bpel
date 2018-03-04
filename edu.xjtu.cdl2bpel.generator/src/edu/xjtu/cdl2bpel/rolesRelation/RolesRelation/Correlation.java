

package edu.xjtu.cdl2bpel.rolesRelation.RolesRelation;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleItem;

public interface Correlation {

	float getRadio();

	void setRadio(float value);

	List<RoleType> getRoletypes();

	String getName();

	void setName(String value);

	public float caculateRadio(RoleItem roleItem, RoleItem roleItem2);

	public void setRoleTypes(RoleItem roleItem, RoleItem roleItem2);
} 

