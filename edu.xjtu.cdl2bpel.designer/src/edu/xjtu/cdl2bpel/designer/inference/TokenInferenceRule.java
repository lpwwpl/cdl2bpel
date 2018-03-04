

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Token;



public class TokenInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the token ";
	public static final String DEFAULT_NAME = "Token";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof Token);
	}
	
	

	protected String getName(Object obj) {
		Token token=(Token)obj;
		return(token.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		return(cdlType.getBelongedPackage().getToken(name) != null);
	}
	
	

	protected void setName(Object obj, String name) {
		Token token=(Token)obj;
		token.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

