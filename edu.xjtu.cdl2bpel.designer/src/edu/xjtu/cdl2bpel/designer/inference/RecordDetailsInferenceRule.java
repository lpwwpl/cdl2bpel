

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;



public class RecordDetailsInferenceRule implements InferenceRule {

	

	public boolean isSupported(Object obj) {
		return(obj instanceof RecordElementInfo);
	}
	
	

	public void addition(Object obj) {
		RecordElementInfo details=(RecordElementInfo)obj;

		
		
		Interaction interaction=details.getBelongedInteraction();
		
		if (interaction != null && details.getName() == null) {
			String name="Record";
			int ind=1;
			
			while (interaction.getRecordElementInfo(name+ind) != null) {
				ind++;
			}
			
			details.setName(name+ind);
		}
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
	}
}

