

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;



public class AssignInferenceRule implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the role type ";
	private static final String DEFAULT_PARTICIPANT_SUFFIX = "Participant";
	private static final String DEFAULT_CHANNEL_TYPE_SUFFIX = "ChannelType";
	private static final String DEFAULT_NAME = "Role";
	private static final String DEFAULT_BEHAVIOR_SUFFIX = "Behavior";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof Assign);
	}
	
	

	public void addition(Object obj) {
		Assign assign=(Assign)obj;
		
		if (assign.getName() == null &&
				assign.getCopyOfAssign().size() == 0) {
			
			
			CopyOfAssign behavior=CDLFactory.eINSTANCE.createCopyOfAssign();
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.addChild(assign,
					behavior, 0);
		}
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
	}
}

