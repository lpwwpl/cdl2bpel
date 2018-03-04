package edu.xjtu.cdl2bpel.common;

public class MyArtifactException extends Exception {

	private static final long serialVersionUID = -708748920358091424L;

	public MyArtifactException(String mesg) {
		super(mesg);
	}

	public MyArtifactException(String mesg, Throwable t) {
		super(mesg, t);
	}
}
