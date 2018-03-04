package edu.xjtu.cdl2bpel.cdl2bpel.util;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.common.ResourceProperties;
import edu.xjtu.cdl2bpel.commons.util.Pair;

public class CDL2WSBPELGeneratorFactory {
	public static CDL2WSBPELGenerator createGenerator(List<Pair<RoleType[],String>> pairs,ResourceProperties props) {
		CDL2WSBPELGenerator ret=new CDL2WSBPELGeneratorImpl(pairs,props);
		return(ret);
	}
	
	public static CDL2WSBPELGenerator createGenerator(List<Pair<RoleType[],String>> pairs,String destination) {
		CDL2WSBPELGenerator ret=new CDL2WSBPELGeneratorImpl(pairs,destination);
		return(ret);
	}
}
