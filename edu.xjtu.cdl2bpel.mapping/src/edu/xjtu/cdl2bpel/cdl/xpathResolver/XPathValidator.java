package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;

public class XPathValidator {

	public static ValidationResult validateVariableForLpw(
			XPathContext context, String variable,
				RoleType[] roles, boolean allRolesRequired) {
		ValidationResult ret=null;
		
		XPathValidatingLpwVisitor visitor=
			new XPathValidatingLpwVisitor(context, roles, null, true, false);
		
		validate(variable, visitor, context, allRolesRequired);
		
		// Obtain the variable
		if (visitor.getVariableName() != null &&
						context.getChoreography() != null) {			
			ret = new ValidationResult(visitor.getRoleTypes(),
					null, visitor.getVariableName(),
					visitor.getVariablePart(),
					visitor.getVariableDocumentPath(),
					CDLPackageUtil.getVariable(context.getChoreography(), visitor.getVariableName()),
					visitor.isParticipantBased(),
					visitor.isSilent());			
		}
		
		return(ret);
	}
	
	public static ValidationResult validateVariable(
			XPathContext context, String variable,
				RoleType[] roles, boolean allRolesRequired) {
		ValidationResult ret=null;
		
		XPathValidatingVisitor visitor=
			new XPathValidatingVisitor(context, roles, null, true, false);
		
		validate(variable, visitor, context, allRolesRequired);
		
		// Obtain the variable
		if (visitor.getVariableName() != null &&
						context.getChoreography() != null) {			
			ret = new ValidationResult(visitor.getRoleTypes(),
					null, visitor.getVariableName(),
					visitor.getVariablePart(),
					visitor.getVariableDocumentPath(),
					CDLPackageUtil.getVariable(context.getChoreography(), visitor.getVariableName()),
					visitor.isParticipantBased(),
					visitor.isSilent());			
		}
		
		return(ret);
	}
	
	public static ValidationResult validateExceptionType(
			XPathContext context, edu.xjtu.cdl2bpel.cdl.Package pack,
			RoleType[] roles, String expression) {
		ValidationResult ret=null;
		
		XPathValidatingVisitor visitor=
			new XPathValidatingVisitor(context, roles,  null, false, true);
		
		validate(expression, visitor, context, false);
		
		// Obtain the variable
		if (visitor.getExceptionType() != null &&
						pack != null) {
			ret = new ValidationResult(visitor.getRoleTypes(),
					null, visitor.getExceptionType());
		}
		
		return(ret);
	}
	
	public static ValidationResult validateExpression(
			XPathContext context,
			String expression, RoleType[] roles,
				boolean allRolesRequired) {
		ValidationResult ret=null;
		
		XPathValidatingVisitor visitor=
			new XPathValidatingVisitor(context,
					roles,  null, false, false);
		
		org.apache.xpath.XPath xpath=
			validate(expression, visitor, context,
					allRolesRequired);
		
		ret = new ValidationResult(visitor.getRoleTypes(),
						xpath, visitor.getVariableName(),
						visitor.getVariablePart(),
						visitor.getVariableDocumentPath(), null,
						visitor.isParticipantBased(),
						visitor.isSilent());
		
		return(ret);
	}
	
	protected static org.apache.xpath.XPath validate(String expression,
			XPathValidatingVisitor visitor,
			XPathContext context, boolean allRolesRequired) {
		org.apache.xpath.XPath xpath=null;
		int numOfRoleTypes=visitor.getRoleTypes().length;
		CDLPrefixResolver prefixResolver=null;
		
		if (context.getSource() != null) {
			prefixResolver = new CDLPrefixResolver(context.getSource().getBelongedPackage());
		} else {
			prefixResolver = new CDLPrefixResolver();
		}
		
		try {
			xpath =	new org.apache.xpath.XPath(expression,
					null, prefixResolver, 0);
			
		} catch(Exception e) {
			
		}
		
		// Perform the visitor
		if (xpath != null) {
			try {
				xpath.callVisitors(null, visitor);			
			} catch(Exception e) {
				logger.log(Level.SEVERE,
						"Failed to process XPath expression", e);
			}
			
			visitor.validationFinished();
			
			if (allRolesRequired &&
					visitor.getRoleTypes().length !=
						numOfRoleTypes) {
				
			}
		}
		
		return(xpath);
	}
	
	protected static org.apache.xpath.XPath validate(String expression,
			XPathValidatingLpwVisitor visitor,
			XPathContext context, boolean allRolesRequired) {
		org.apache.xpath.XPath xpath=null;
		int numOfRoleTypes=visitor.getRoleTypes().length;
		CDLPrefixResolver prefixResolver=null;
		
		if (context.getSource() != null) {
			prefixResolver = new CDLPrefixResolver(context.getSource().getBelongedPackage());
		} else {
			prefixResolver = new CDLPrefixResolver();
		}
		
		try {
			xpath =	new org.apache.xpath.XPath(expression,
					null, prefixResolver, 0);
			
		} catch(Exception e) {
			
		}
		
		// Perform the visitor
		if (xpath != null) {
			try {
				xpath.callVisitors(null, visitor);			
			} catch(Exception e) {
				logger.log(Level.SEVERE,
						"Failed to process XPath expression", e);
			}
			
			visitor.validationFinished();
			
			if (allRolesRequired &&
					visitor.getRoleTypes().length !=
						numOfRoleTypes) {
				
			}
		}
		
		return(xpath);
	}
	
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.cdl.xpath");
}
