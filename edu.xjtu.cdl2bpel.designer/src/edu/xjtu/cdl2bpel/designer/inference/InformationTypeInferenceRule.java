

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;



public class InformationTypeInferenceRule extends NameDescriptionInferenceRule
					implements InferenceRule {

	public static final String DESCRIPTION_PREFIX="This is the information type ";
	public static final String DEFAULT_NAME = "InfoType";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof InformationType);
	}
	
	

	protected String getName(Object obj) {
		InformationType ctype=(InformationType)obj;
		return(ctype.getName());
	}
	
	

	protected String getDefaultName() {
		return(DEFAULT_NAME);
	}
	
	

	protected boolean exists(CDLElement cdlType, String name) {
		return(CDLPackageUtil.getInformationType(cdlType.getBelongedPackage(),name) != null);
	}
	
	

	protected void setName(Object obj, String name) {
		InformationType ctype=(InformationType)obj;
		ctype.setName(name);
	}

	

	protected String getDefaultDescription(String name) {
		return(DESCRIPTION_PREFIX+name);
	}
}

