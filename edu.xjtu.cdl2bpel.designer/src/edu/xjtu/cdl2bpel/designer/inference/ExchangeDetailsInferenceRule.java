

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Variable;



public class ExchangeDetailsInferenceRule implements InferenceRule {

	

	public boolean isSupported(Object obj) {
		return(obj instanceof ExchangeInfo);
	}
	
	

	public void addition(Object obj) {
		ExchangeInfo details=(ExchangeInfo)obj;

		
		
		Interaction interaction=details.getBelongedInteraction();
		
		if (interaction != null) {
			if (interaction.getRequestExchanges().length > 0 &&
					interaction.getRequestExchanges()[0] != details) {
				details.setAction(ActionTypeEnumByExchangeInfo.RESPOND);
			}

			if (details.getName() == null) {
				details.setName(ExchangeDetailsInferenceRule.getExchangeName(
					details.getBelongedInteraction().getName(), details.getAction()));
			}
			
			if (details.getDescription() == null) {
				details.setDescription(ExchangeDetailsInferenceRule.getExchangeDescription(
					details.getBelongedInteraction().getName(), details.getAction()));
			}
		}
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		ExchangeInfo details=(ExchangeInfo)obj;
		
		if (prop.equals("action") && value instanceof String) {
			ActionTypeEnumByExchangeInfo newAction=
					ActionTypeEnumByExchangeInfo.get((String)value);
			
			if (details.getName() == null ||
					details.getName().equals(
						ExchangeDetailsInferenceRule.getExchangeName(
							details.getBelongedInteraction().getName(),
							details.getAction()))) {
				details.setName(ExchangeDetailsInferenceRule.getExchangeName(
						details.getBelongedInteraction().getName(), newAction));
			}
			
			if (details.getDescription() == null ||
					details.getDescription().equals(
						ExchangeDetailsInferenceRule.getExchangeDescription(
								details.getBelongedInteraction().getName(),
								details.getAction()))) {
				details.setDescription(ExchangeDetailsInferenceRule.getExchangeDescription(
						details.getBelongedInteraction().getName(), newAction));
			}
		} else if (value instanceof Variable) {
			Variable var=(Variable)value;
			
			if (var.getType() == null && details.getType() != null) {
				var.setType(details.getType());
			} else if (var.getType() != null && details.getType() == null) {
				details.setType(var.getType());
			}
		}
	}

	

	protected static String getExchangeName(String interactionName,
						ActionTypeEnumByExchangeInfo action) {
		String ret=null;
		
		if (interactionName == null) {
			interactionName = "";
		}
		
		ret = interactionName+action.getLiteral()+
							"Exchange";
		
		return(ret);
	}
	
	

	protected static String getExchangeDescription(String interactionName,
							ActionTypeEnumByExchangeInfo action) {
		String ret=null;
			
		if (interactionName == null) {
			interactionName = "<unnamed>";
		}

		ret = "This is the exchange details for the "+
				action.getLiteral().toLowerCase()+
					" exchange associated with interaction "+
					interactionName;
		
		return(ret);
	}
}

