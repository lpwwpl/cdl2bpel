package edu.xjtu.cdl2bpel.rolesRelation.event;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.PackageUtil;

public class ParticipantItem {
	private ParticipantType participant;
	private float activity = 0;
	
	public ParticipantType getParticipant() {
		return participant;
	}

	public void setParticipant(ParticipantType participant) {
		this.participant = participant;
	}

	public float getActivity() {
		return activity;
	}

	public void setActivity(float activity) {
		this.activity = activity;
	}

	public ParticipantItem(ParticipantType participant) {
		this.participant = participant;
	}

	public ParticipantItem(ParticipantType participant, float activity) {
		this.participant = participant;
		this.activity = activity;
	}
}
