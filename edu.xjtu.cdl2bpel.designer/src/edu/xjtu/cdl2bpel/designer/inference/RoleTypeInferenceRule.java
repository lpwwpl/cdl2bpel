

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;



public class RoleTypeInferenceRule extends NameDescriptionInferenceRule
						implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the role type ";
	private static final String DEFAULT_PARTICIPANT_SUFFIX = "Participant";
	private static final String DEFAULT_CHANNEL_TYPE_SUFFIX = "ChannelType";
	private static final String DEFAULT_NAME = "Role";
	private static final String DEFAULT_BEHAVIOR_SUFFIX = "Behavior";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof RoleType);
	}
	
	

	protected String getName(Object obj) {
		RoleType roleType=(RoleType)obj;
		return(roleType.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		return(cdlType.getBelongedPackage().getRoleType(name) != null);
	}
	
	

	protected void setName(Object obj, String name) {
		RoleType roleType=(RoleType)obj;
		roleType.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}

	

	public void addition(Object obj) {
		RoleType roleType=(RoleType)obj;
		
		if (roleType.getName() == null) {
			
			super.addition(obj);
			
			
			BehaviorOfRoleType behavior=CDLFactory.eINSTANCE.createBehaviorOfRoleType();
			
			behavior.setName(roleType.getName()+DEFAULT_BEHAVIOR_SUFFIX);
			behavior.setDescription(BehaviorInferenceRule.BEHAVIOR_DESCRIPTION_PREFIX+behavior.getName());
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.addChild(roleType,
					behavior, 0);
			
			
			
			ParticipantType ptype=CDLFactory.eINSTANCE.createParticipantType();
			
			ptype.setName(roleType.getName()+DEFAULT_PARTICIPANT_SUFFIX);
			ptype.setDescription(ParticipantTypeInferenceRule.DESCRIPTION_PREFIX+ptype.getName());
			ptype.getRoleTypes().add(roleType);
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.addChild(roleType.getBelongedPackage(),
					ptype, 0);
		}
	}
	
	

	public void deletion(Object obj) {
		RoleType roleType=(RoleType)obj;
		
		super.deletion(obj);
		
		
		
		
		
		
		
		ParticipantType ptype=roleType.getBelongedPackage().getParticipantType(
				roleType.getName()+DEFAULT_PARTICIPANT_SUFFIX);
		
		if (ptype != null && ptype.getRoleTypes().size() == 1 &&
				ptype.getRoleTypes().contains(roleType)) {
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.removeChild(roleType.getBelongedPackage(),
								ptype);
		}
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		RoleType roleType=(RoleType)obj;
		
		super.propertyChange(obj, prop, value);
		
		if (prop.equals("name") && value instanceof String) {
			
			
			BehaviorOfRoleType behavior=roleType.getBehavior(
					roleType.getName()+DEFAULT_BEHAVIOR_SUFFIX);
			
			if (behavior != null) {
				String val=((String)value)+DEFAULT_BEHAVIOR_SUFFIX;
				
				InferenceManager.propertyChange(behavior, "name", val);

				behavior.setName(val);				
			}

			
			ChannelType ctype=roleType.getBelongedPackage().getChannelType(
					roleType.getName()+DEFAULT_CHANNEL_TYPE_SUFFIX);
			
			if (ctype != null) {
				String val=((String)value)+DEFAULT_CHANNEL_TYPE_SUFFIX;
				
				InferenceManager.propertyChange(ctype, "name", val);

				ctype.setName(val);
			}
			
			
			ParticipantType ptype=roleType.getBelongedPackage().getParticipantType(
					roleType.getName()+DEFAULT_PARTICIPANT_SUFFIX);

			if (ptype != null) {
				String val=((String)value)+DEFAULT_PARTICIPANT_SUFFIX;
				
				InferenceManager.propertyChange(ptype, "name", val);
				
				ptype.setName(val);				
			}
			
			
			
		}
	}
}

