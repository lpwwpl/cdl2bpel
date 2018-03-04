package edu.xjtu.cdl2bpel.cdl2pi.impl;

import edu.xjtu.cdl2bpel.cdl2pi.CDL2Pi;

public class CDL2PiFactory {
	public static CDL2Pi createICDL2Pi() {
		CDL2Pi icdl2Pi = new CDL2PiImpl();
		return icdl2Pi;
	}
}
