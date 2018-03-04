

package edu.xjtu.cdl2bpel.common;



public interface ResourceProperties {

	

	public String getProperty(String module, String property);
	
	

	public String getProperty(String module, String property,
						String defaultValue);
	
	public static final String ANY_MODULE=null;
	
	public static final String RESOURCE_LOCATION_PROPERTY="resourceLocation";
}

