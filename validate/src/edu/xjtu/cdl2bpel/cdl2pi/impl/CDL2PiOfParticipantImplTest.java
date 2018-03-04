package edu.xjtu.cdl2bpel.cdl2pi.impl;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2pi.CDL2Pi;
import edu.xjtu.cdl2bpel.cdl2pi.CDL2PiOfParticipant;

public class CDL2PiOfParticipantImplTest {

	public static String generateCDL2Pi4OneParticipant(Package cdlPackage,ParticipantType participantType) {
		String ret=null;
		CDL2PiOfParticipant testCase = new CDL2PiOfParticipantImpl(cdlPackage,participantType);
		ret = testCase.generateCDL2PiCalculusByParticipant();
		return ret;
	}
	
	public static String generateCDL2Pi4AllParticipant(Package cdlPackage) {
		String ret = null;
		CDL2Pi cdl2Pi = new CDL2PiImpl();
		cdl2Pi.generateCDL2PiCalculus(cdlPackage);
		ret = cdl2Pi.toString();
		return ret;
	}
	
	public static void main(String args[]) {
		Package cdlPackage = CDLResolver.getPackageFromCDLFile("cdl/VerifLiveLock.cdl");
//		Package cdlPackage = CDLResolver.getPackageFromCDLFile("cdl/VerifCorrect.cdl");
//		CDL2PiOfParticipant testCase = new CDL2PiOfParticipantImpl(cdlPackage,cdlPackage.getParticipantType("LoanApproval"));
//		CDL2PiOfParticipant testCase = new CDL2PiOfParticipantImpl(cdlPackage,cdlPackage.getParticipantType("Customer"));
//		CDL2PiOfParticipant testCase = new CDL2PiOfParticipantImpl(cdlPackage,cdlPackage.getParticipantType("Approver"));
//		CDL2PiOfParticipant testCase = new CDL2PiOfParticipantImpl(cdlPackage,cdlPackage.getParticipantType("Assessor"));
//		String ret = testCase.generateCDL2PiCalculusByParticipant();
		String ret = generateCDL2Pi4AllParticipant(cdlPackage);
		System.out.println(ret);
	}
}
