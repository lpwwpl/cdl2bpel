package edu.xjtu.cdl2bpel.deploy;

public class BPELAndWSDLDeploymentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123L;

	/**
	 * This is the constructor for the deployment exception.
	 * 
	 * @param mesg The message
	 * @param t The associated exception
	 */
	public BPELAndWSDLDeploymentException(String mesg, Throwable t) {
		super(mesg, t);
	}
	
	/**
	 * This is the constructor for the deployment exception.
	 * 
	 * @param mesg The message
	 */
	public BPELAndWSDLDeploymentException(String mesg) {
		super(mesg);
	}
}
