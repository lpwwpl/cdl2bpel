package edu.xjtu.cdl2bpel.cdl2wsdl.util;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.common.ResourceProperties;
import edu.xjtu.cdl2bpel.commons.util.Pair;

/**
 * CDL2WSDLGenerator factory,used to generate Specific CDL2WSDLGenerator implementation
 * @author Administrator
 *
 */
public class CDL2WSDLGeneratorFactory {
	
	public static CDL2WSDLGenerator createGenerator(Package cdlpack,
			ResourceProperties props, List<Pair<RoleType[], String>> pairs) {
		CDL2WSDLGenerator ret = new CDL2WSDLGeneratorImpl(cdlpack, props, pairs);
		return (ret);
	}

	public static CDL2WSDLGenerator createGenerator(Package cdlpack,
			String destination, List<Pair<RoleType[], String>> pairs) {
		CDL2WSDLGenerator ret = new CDL2WSDLGeneratorImpl(cdlpack, destination,
				pairs);
		return (ret);
	}
}
