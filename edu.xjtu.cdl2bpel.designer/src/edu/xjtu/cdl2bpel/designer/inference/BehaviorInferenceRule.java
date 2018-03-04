

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;



public class BehaviorInferenceRule implements InferenceRule {

	public static final String BEHAVIOR_DESCRIPTION_PREFIX="This is the behavior ";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof BehaviorOfRoleType);
	}
	
	

	public void addition(Object obj) {
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		BehaviorOfRoleType behavior=(BehaviorOfRoleType)obj;
		
		if (prop.equals("name") && value instanceof String) {
			
			if (behavior.getDescription() == null ||
					behavior.getDescription().equals(
						BEHAVIOR_DESCRIPTION_PREFIX+behavior.getName())) {
				behavior.setDescription(BEHAVIOR_DESCRIPTION_PREFIX+((String)value));
			}
		}
	}

}

