package edu.xjtu.cdl2bpel.deploy;


public class BPELAndWSDLDeploymentFactory {

	public static BPELAndWSDLDeployment createBPELAndWSDLDeployment() {
		BPELAndWSDLDeployment bpelAndWSDLDeployment = new BPELAndWSDLDeploymentImpl();
		return bpelAndWSDLDeployment;
	}
}
