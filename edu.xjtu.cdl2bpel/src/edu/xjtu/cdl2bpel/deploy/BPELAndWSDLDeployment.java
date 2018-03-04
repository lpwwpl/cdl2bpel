package edu.xjtu.cdl2bpel.deploy;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public interface BPELAndWSDLDeployment {

	public String getName();

	public void deploy2Destination( java.util.Map wsdlFiles, java.util.Map bpelFiles, String dest)
			throws BPELAndWSDLDeploymentException;

}
