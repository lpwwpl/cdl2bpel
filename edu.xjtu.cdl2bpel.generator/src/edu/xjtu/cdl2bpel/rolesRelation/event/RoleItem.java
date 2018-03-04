package edu.xjtu.cdl2bpel.rolesRelation.event;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.PackageUtil;

public class RoleItem implements IAdaptable{
	private ParticipantType participant ;
	private RoleType roleType;
	private float activity = 0;

	static RoleItem[] NONE = new RoleItem[] {};

	public RoleItem(RoleType roletype) {
		setRoleType(roletype);
		setParticipant(PackageUtil.getParticipantForRoleType(roleType));
	}

	public RoleItem(RoleType roleType, float activity) {
		setRoleType(roleType);
		setParticipant(PackageUtil.getParticipantForRoleType(roleType));
		setActivity(activity);
	}

	public float getActivity() {
		return this.activity;
	}

	public ParticipantType getParticipant() {
		return this.participant;
	}

	public RoleType getRoleType() {
		return this.roleType;
	}

	public void setParticipant(ParticipantType participant) {
		this.participant = participant;
	}

	public void setActivity(float activity) {
		this.activity = activity;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if(adapter == IPropertySource.class)
			return new RoleItemPropertySource(this);
		return null;
	}
}

