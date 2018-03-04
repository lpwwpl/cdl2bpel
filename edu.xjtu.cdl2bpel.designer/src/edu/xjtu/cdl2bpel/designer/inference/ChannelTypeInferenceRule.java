

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ChannelType;



public class ChannelTypeInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the channel type ";
	public static final String DEFAULT_CHANNEL_TYPE_SUFFIX = "ChannelType";
	public static final String DEFAULT_NAME = "ChannelType";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof ChannelType);
	}
	
	

	protected String getName(Object obj) {
		ChannelType ctype=(ChannelType)obj;
		return(ctype.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		return(cdlType.getBelongedPackage().getChannelType(name) != null);
	}
	
	

	protected void setName(Object obj, String name) {
		ChannelType ctype=(ChannelType)obj;
		ctype.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

