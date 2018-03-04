package edu.xjtu.cdl2bpel.cdl2pi.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl2pi.CDL2Pi;

public class CDL2PiImpl implements CDL2Pi {
	private List<String> piCalculusOfCDL;

	public CDL2PiImpl() {
		piCalculusOfCDL = new ArrayList<String>();
	}
	
	public void generateCDL2PiCalculus(Package cdlPackage) {
		List participantTypes = cdlPackage.getParticipantTypes();
		for (Iterator it = participantTypes.iterator(); it.hasNext();) {
			ParticipantType participantType = (ParticipantType) it.next();
			
			CDL2PiOfParticipantImpl cdl2PiOfParticipant = new CDL2PiOfParticipantImpl(cdlPackage,participantType);
			String str = cdl2PiOfParticipant.generateCDL2PiCalculusByParticipant();
			piCalculusOfCDL.add(str);
		}
	}
	

	public List<String> getPiCalculusOfCDL() {
		return piCalculusOfCDL;
	}

	public void setPiCalculusOfCDL(List<String> piCalculusOfCDL) {
		this.piCalculusOfCDL = piCalculusOfCDL;
	}
	
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		for(String str:getPiCalculusOfCDL()) {
			strBuffer.append(str);
			strBuffer.append("\n");
		}
		return strBuffer.toString();
	}
}
