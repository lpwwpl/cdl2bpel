

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;



public class ParticipantTypeInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the participant type ";
	public static final String DEFAULT_NAME = "ParticipantType";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof ParticipantType);
	}
	
	

	protected String getName(Object obj) {
		ParticipantType ptype=(ParticipantType)obj;
		return(ptype.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		return(cdlType.getBelongedPackage().getChannelType(name) != null);
	}
	
	

	protected void setName(Object obj, String name) {
		ParticipantType ptype=(ParticipantType)obj;
		ptype.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

