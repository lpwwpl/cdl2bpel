package edu.xjtu.cdl2bpel.cdl2wsdl.util;

import java.util.List;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;

/**
 * Used to coordinate Namespaces values with the BPEL process XML Namespace values
 * @author Administrator
 * 
 */
public class CDL2WSDLDocContext4EachPair {
	private GlobalArchitecture globalArchitecture = null;
	//Store All RoleTypeMatrix and corresponding namespace 
	private List<Pair<RoleType[], String>> pairs = null;
	//Store the Specify RoleTypeMatrix and corresponding namespace 
	private Pair<RoleType[], String> pair = null;

	public List<Pair<RoleType[], String>> getPairs() {
		return pairs;
	}

	public GlobalArchitecture getGlobalArchitecture() {
		return globalArchitecture;
	}

	public Pair<RoleType[], String> getPair() {
		return pair;
	}

	public CDL2WSDLDocContext4EachPair(Package cdlpack,
			List<Pair<RoleType[], String>> pairs, Pair<RoleType[], String> pair) {
		this.pairs = pairs;
		this.pair = pair;
		CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(pair
				.getFirst());
		temp.execute(cdlpack);
		globalArchitecture = temp.getGlobalArchitecture();
	}
}
