

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;



public class InteractionInferenceRule implements InferenceRule {

	

	public boolean isSupported(Object obj) {
		return(obj instanceof Interaction);
	}
	
	

	public void addition(Object obj) {
		Interaction interaction=(Interaction)obj;

		
		
		
		
		if (interaction.getExchangeInfos().size() == 0) {
			
			
			ExchangeInfo exchange=CDLFactory.eINSTANCE.createExchangeInfo();
			exchange.setName(ExchangeDetailsInferenceRule.getExchangeName(
					interaction.getName(), exchange.getAction()));
			exchange.setDescription(ExchangeDetailsInferenceRule.getExchangeDescription(
					interaction.getName(), exchange.getAction()));
			
			edu.xjtu.cdl2bpel.designer.util.ModelSupport.addChild(interaction,
					exchange, 0);
		}
	}
	
	

	public void deletion(Object obj) {
		
		
		
		
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		Interaction interaction=(Interaction)obj;
		
		if (prop.equals("name") && value instanceof String) {
			
			for (int i=0; i < interaction.getExchangeInfos().size(); i++) {
				ExchangeInfo details=(ExchangeInfo)
							interaction.getExchangeInfos().get(i);
				
				if (details.getName() == null ||
						details.getName().equals(
							ExchangeDetailsInferenceRule.getExchangeName(
								interaction.getName(), details.getAction()))) {
					details.setName(ExchangeDetailsInferenceRule.getExchangeName(
							(String)value, details.getAction()));
				}
				
				if (details.getDescription() == null ||
						details.getDescription().equals(
							ExchangeDetailsInferenceRule.getExchangeDescription(
								interaction.getName(), details.getAction()))) {
					details.setDescription(ExchangeDetailsInferenceRule.getExchangeDescription(
							(String)value, details.getAction()));
				}
			}
		}
	}
}

