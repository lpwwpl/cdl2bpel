

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.*;



public abstract class NameDescriptionInferenceRule implements InferenceRule {
	
	

	protected abstract String getName(Object obj);
	
	

	protected abstract String getDefaultName();
	
	

	protected abstract boolean exists(CDLElement cdlType, String name);
	
	

	protected abstract void setName(Object obj, String name);

	

	protected abstract String getDefaultDescription(String name);
	
	

	public void addition(Object obj) {

		if (obj instanceof CDLElement &&
						getName(obj) == null) {
			String name=getDefaultName();
			int num=1;
			
			while (exists((CDLElement)obj, name+num)) {
				num++;
			}
			
			setName(obj, name+num);
			
			if (obj instanceof CDLElement) {
				((CDLElement)obj).setDescription(
						getDefaultDescription(name+num));
			}
		}
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		
		if (prop.equals("name") && value instanceof String &&
				obj instanceof CDLElement) {
			CDLElement cdlType=(CDLElement)obj;
			
			if (cdlType.getDescription() == null ||
					cdlType.getDescription().equals(
					getDefaultDescription(getName(obj)))) {
				cdlType.setDescription(getDefaultDescription(((String)value)));
			}
		}
	}

}

