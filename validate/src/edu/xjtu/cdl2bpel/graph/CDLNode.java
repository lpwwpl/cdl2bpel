package edu.xjtu.cdl2bpel.graph;

import java.util.HashSet;
import java.util.Set;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;

public class CDLNode {

	//CDLNode节点是否被访问过
	private boolean visited;
	//CDLNode是封装某一ParticipantType类型的包装类
	ParticipantType participantType;
	//CDLNode的前继节点集合
	Set<ParticipantType> foreheads;
	//CDLNode的入度
	private int in;
	//CDLNode的出度
	private int out;
	
	public CDLNode() {
		visited = false;
	}
	
	public CDLNode(ParticipantType participantType) {
		this.participantType = participantType;
		foreheads = new HashSet<ParticipantType>();
		visited = false;
		in = out = 0;
	}
	
	public CDLNode(ParticipantType participantType,Set<ParticipantType> foreheads) {
		this.participantType = participantType;
		this.foreheads = foreheads;
		visited = false;
		in = out = 0;
	}
	
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public ParticipantType getParticipantType() {
		return participantType;
	}
	public void setParticipantType(ParticipantType participantType) {
		this.participantType = participantType;
	}
	public Set<ParticipantType> getForehead() {
		return foreheads;
	}
	public void setForeheads(Set<ParticipantType> foreheads) {
		this.foreheads = foreheads;
	}
	
	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}
	
	public boolean isRechable() {
		if (in == out) {
			return true;
		}
		return false;
	}
	
	public void addIn() {
		in++;
	}

	public void addOut() {
		out++;
	}
}
