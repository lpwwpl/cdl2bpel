

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;



public class TokenLocatorInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the token locator ";
	public static final String DEFAULT_NAME = "TokenLocator";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof TokenLocator);
	}
	
	

	protected String getName(Object obj) {
		TokenLocator locator=(TokenLocator)obj;
		return(locator.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		TokenLocator locator=null;
		java.util.List list=cdlType.getBelongedPackage().getTokenLocators();
		
		if (list != null) {
			java.util.Iterator iter=list.iterator();
			
			while (locator == null && iter.hasNext()) {
				locator = (TokenLocator)iter.next();
				
				if (locator.getName() == null ||
						locator.getName().equals(name) == false) {
					locator = null;
				}
			}
		}
		
		return(locator != null);
	}
	
	

	protected void setName(Object obj, String name) {
		TokenLocator locator=(TokenLocator)obj;
		locator.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

