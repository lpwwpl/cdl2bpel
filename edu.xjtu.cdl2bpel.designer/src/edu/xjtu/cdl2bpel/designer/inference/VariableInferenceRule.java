

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Variable;



public class VariableInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the variable ";
	public static final String DEFAULT_NAME = "Variable";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof Variable);
	}
	
	

	protected String getName(Object obj) {
		Variable variable=(Variable)obj;
		return(variable.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		boolean ret=false;
		
		if (cdlType instanceof Variable) {
			Choreography choreo=((Variable)cdlType).getBelongedChoreography();
			
			ret = (choreo.getVariable(name) != null);
		}
		
		return(ret);
	}
	
	

	protected void setName(Object obj, String name) {
		Variable variable=(Variable)obj;
		variable.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

