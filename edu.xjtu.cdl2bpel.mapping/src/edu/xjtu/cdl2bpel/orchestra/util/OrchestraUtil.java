package edu.xjtu.cdl2bpel.orchestra.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InformationType;
import edu.xjtu.cdl2bpel.orchestra.Variable;

public class OrchestraUtil {

	List<InformationType> informationTypes = new ArrayList();

	public static InformationType getVariableInformationType(
			GlobalArchitecture globalArchitecture, String variableTypeName) {
		InformationType ret = null;
		for (Iterator it = globalArchitecture.getInformationTypes().iterator(); it
				.hasNext();) {
			InformationType informationType = (InformationType) it.next();
			if (informationType.getType().contains(variableTypeName)) {
				ret = informationType;
			}
		}

		return ret;
	}

	public static Variable getVariable(BPOrchestra orche, String variableName) {
		Variable ret = null;
		for (Iterator it = orche.getVariables().iterator(); it.hasNext();) {
			Variable variable = (Variable) it.next();
			if (variable.getName().contains(variableName)) {
				ret = variable;
			}
		}

		return ret;
	}

	public static InformationType getInformationType(
			GlobalArchitecture globalArchitecture, String informationTypeName) {
		InformationType ret = null;
		for (Iterator it = globalArchitecture.getInformationTypes().iterator(); it
				.hasNext();) {
			InformationType informationType = (InformationType) it.next();
			if (informationType.getType().contains(informationTypeName)) {
				ret = informationType;
			}
		}
		return ret;
	}

	// public static String getNamespace(String qname, BPElement bpElement) {
	// String ret = null;
	//
	// if (qname != null && bpElement != null
	// && bpElement. != null) {
	//
	// // No target namespace - could use the namespace
	// // of the service description?
	// ret = XMLUtils.getNamespace(qname, getPrefixResolver(behaviorType
	// .getServiceDescription()), null);
	// }
	//
	// return (ret);
	// }
}
