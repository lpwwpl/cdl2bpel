

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;



public class RelationshipTypeInferenceRule extends NameDescriptionInferenceRule
						implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the relationship type ";
	public static final String DEFAULT_NAME = "RelationshipType";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof RelationshipType);
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

	

	public void addition(Object obj) {
		RelationshipType relType=(RelationshipType)obj;
		
		
		
		
		
		if (relType.getRoleTypeOfSecond() != null) {
			ChannelType ctype=CDLFactory.eINSTANCE.createChannelType();
			
			ctype.setName(relType.getRoleTypeOfSecond().getName()+
					ChannelTypeInferenceRule.DEFAULT_CHANNEL_TYPE_SUFFIX);
			ctype.setDescription(ChannelTypeInferenceRule.DESCRIPTION_PREFIX+ctype.getName());
			ctype.setRoleType(relType.getRoleTypeOfSecond());
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.addChild(
					relType.getBelongedPackage(), ctype, 0);
		}
						
		update(relType);
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		RelationshipType relType=(RelationshipType)obj;
	
		update(relType);
		
		
	}
	
	protected void update(RelationshipType relType) {
		if (relType.getName() == null &&
				relType.getRoleTypeOfFirst() != null &&
				relType.getRoleTypeOfSecond() != null) {
			
			relType.setName(relType.getRoleTypeOfFirst().getName()+
					"To"+relType.getRoleTypeOfSecond().getName()+
					"Rel");
			
			if (relType.getDescription() == null) {
				relType.setDescription("Relationship between "+
						relType.getRoleTypeOfFirst().getName()+
						" and "+relType.getRoleTypeOfSecond().getName());
			}
		}
	}

}

