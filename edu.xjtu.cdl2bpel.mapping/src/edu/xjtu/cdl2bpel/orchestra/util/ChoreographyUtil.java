package edu.xjtu.cdl2bpel.orchestra.util;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.Variable;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathBehaviorTransformer;

public class ChoreographyUtil {
	
	public static String getVariableName(Variable var) {
		String ret=null;
		
		if (var != null) {
			ret = var.getName();
			
			if (var.getBelongedBPOrchestra() != null) {
				String choreoName=
					var.getBelongedBPOrchestra().getName();
				
				ret = choreoName+"_"+var.getName(); 
			}
		}
		
		return(ret);
	}
	
	public static String transformExpression(BPOrchestra bpOrchestra,
			String expr) {
		String ret = expr;
		ret = ret.replaceAll(XPathBehaviorTransformer.BEHAVIOR_PREFIX+":","bpws:");
		ret = ret.replaceAll("getVariable", "getVariableData");
		ret = ret.replaceAll(",''", "");
		Iterator iter = bpOrchestra.getVariables().iterator();
		while (iter.hasNext()) {
			Variable var = (Variable) iter.next();
			String src = "'" + var.getName() + "'";
			String target = "'" + getVariableName(var) + "'";
			ret = ret.replaceAll(src, target);
		}

		return (ret);
	}

}
