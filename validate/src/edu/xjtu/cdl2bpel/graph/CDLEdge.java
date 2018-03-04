package edu.xjtu.cdl2bpel.graph;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;

public class CDLEdge {

	//保存边指向的下一个ParticipantType节点
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
