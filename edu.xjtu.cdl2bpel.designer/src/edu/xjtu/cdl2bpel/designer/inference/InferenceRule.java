

package edu.xjtu.cdl2bpel.designer.inference;



public interface InferenceRule {

	

	public boolean isSupported(Object obj);
	
	

	public void addition(Object obj);
	
	

	public void deletion(Object obj);
	
	

	public void propertyChange(Object obj, String prop, Object value);
	
}

