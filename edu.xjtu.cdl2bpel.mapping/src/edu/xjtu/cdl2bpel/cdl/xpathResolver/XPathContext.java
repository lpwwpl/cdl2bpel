package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;

public interface XPathContext {

	public CDLElement getSource();
	
	public Choreography getChoreography();
	
	public boolean isException();

//	public void setMessagePrefix(String mesg);
	
	public void setSource(CDLElement src);
}
