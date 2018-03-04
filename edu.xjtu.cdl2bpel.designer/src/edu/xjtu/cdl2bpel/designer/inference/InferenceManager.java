

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.designer.DesignerDefinitions;



public class InferenceManager {

	

	public static void addition(Object obj) {
		
		if (DesignerDefinitions.isPreference(
					DesignerDefinitions.INFERENCE_ENABLED)) {
			
			for (int i=0; i < m_rules.length; i++) {
				if (m_rules[i].isSupported(obj)) {
					m_rules[i].addition(obj);
				}
			}
		}
	}
	
	

	public static void deletion(Object obj) {
		
		if (DesignerDefinitions.isPreference(
					DesignerDefinitions.INFERENCE_ENABLED)) {
			
			for (int i=0; i < m_rules.length; i++) {
				if (m_rules[i].isSupported(obj)) {
					m_rules[i].deletion(obj);
				}
			}
		}
	}
	
	

	public static void propertyChange(Object obj, String prop,
					Object value) {
		
		if (DesignerDefinitions.isPreference(
					DesignerDefinitions.INFERENCE_ENABLED)) {
			
			for (int i=0; i < m_rules.length; i++) {
				if (m_rules[i].isSupported(obj)) {
					m_rules[i].propertyChange(obj, prop,
								value);
				}
			}
		}
	}
	
	private static InferenceRule[] m_rules={
		new PackageInferenceRule(),
		new RelationshipTypeInferenceRule(),
		new RoleTypeInferenceRule(),
		new BehaviorInferenceRule(),
		new ChannelTypeInferenceRule(),
		new InformationTypeInferenceRule(),
		new ParticipantTypeInferenceRule(),
		new InteractionInferenceRule(),
		new ExchangeDetailsInferenceRule(),
		new TokenInferenceRule(),
		new TokenLocatorInferenceRule(),
		new VariableInferenceRule(),
		new AssignInferenceRule(),
		new RecordDetailsInferenceRule()
	};
}

