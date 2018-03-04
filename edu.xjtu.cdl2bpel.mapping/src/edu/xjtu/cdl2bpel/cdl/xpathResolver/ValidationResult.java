package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;

public class ValidationResult {

	protected ValidationResult(RoleType[] roleTypes,
			org.apache.xpath.XPath xpath, String variableName,
			String part, String docPath,
			Variable variable,
			boolean participantDefined,
			boolean silent) {
		m_roleTypes = roleTypes;
		m_xpath = xpath;
		m_variableName = variableName;
		m_part = part;
		m_docPath = docPath;
		m_variable = variable;
		m_participantDefined = participantDefined;
		m_silent = silent;
	}
	
	protected ValidationResult(RoleType[] roleTypes,
			org.apache.xpath.XPath xpath, String exceptionType) {
		m_roleTypes = roleTypes;
		m_xpath = xpath;
		m_exceptionType = exceptionType;
	}
	
	public RoleType[] getRoleTypes() {
		return(m_roleTypes);
	}
	
	public org.apache.xpath.XPath getXPathExpression() {
		return(m_xpath);
	}
	
	public String getVariableName() {
		return(m_variableName);
	}

	public String getPartName() {
		return(m_part);
	}
	
	public String getDocumentPath() {
		return(m_docPath);
	}
	
	public Variable getVariable() {
		return(m_variable);
	}
	
//	public Participant getParticipant() {
//		return(m_participant);
//	}
	
	public boolean getParticipantDefined() {
		return(m_participantDefined);
	}
	
	public boolean isSilent() {
		return(m_silent);
	}
	
	public String getExceptionTypeName() {
		return(m_exceptionType);
	}
		
	private RoleType[] m_roleTypes=null;
	private org.apache.xpath.XPath m_xpath=null;
	private String m_variableName=null;
	private String m_part=null;
	private String m_docPath=null;
	private Variable m_variable=null;
//	private Participant m_participant=null;
	private boolean m_participantDefined=false;
	private boolean m_silent=false;
	private String m_exceptionType=null;
}
