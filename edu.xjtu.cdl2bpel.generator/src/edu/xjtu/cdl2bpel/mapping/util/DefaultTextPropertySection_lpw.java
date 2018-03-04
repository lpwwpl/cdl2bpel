package edu.xjtu.cdl2bpel.mapping.util;

import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;


public class DefaultTextPropertySection_lpw extends AbstractPropertySection {

	public DefaultTextPropertySection_lpw(String property, String displayName) {
		this.property = property;
		this.displayName = displayName;
		this.label = displayName;
	}

	public DefaultTextPropertySection_lpw(String property, String displayName,
			String label) {
		this.property = property;
		this.displayName = displayName;
		this.label = label;
	}

	public boolean isCreateForm() {
		return (false);
	}
	
	private String property;
	private String displayName;
	private String label;
	
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}

