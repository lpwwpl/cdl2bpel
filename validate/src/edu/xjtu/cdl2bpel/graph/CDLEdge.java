package edu.xjtu.cdl2bpel.graph;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;

public class CDLEdge {

	//�����ָ�����һ��ParticipantType�ڵ�
	private ParticipantType toParticipant;
	
	public CDLEdge(ParticipantType toParticipant) {		
		this.toParticipant = toParticipant;
	}	
	
	public ParticipantType getToParticipant() {
		return toParticipant;
	}
	public void setToParticipant(ParticipantType toParticipant) {
		this.toParticipant = toParticipant;
	}
}
