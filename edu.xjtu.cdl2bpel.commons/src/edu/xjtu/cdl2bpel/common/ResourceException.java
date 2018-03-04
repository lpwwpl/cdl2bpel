package edu.xjtu.cdl2bpel.common;

public class ResourceException extends RuntimeException {

	private static final long serialVersionUID = 2L;

	public ResourceException(String mesg, Throwable e) {
		super(mesg, e);
	}

	public ResourceException(String mesg) {
		super(mesg);
	}
}
