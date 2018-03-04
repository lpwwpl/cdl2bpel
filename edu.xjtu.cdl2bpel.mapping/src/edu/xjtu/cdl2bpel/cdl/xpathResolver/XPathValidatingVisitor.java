package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import org.apache.xpath.ExpressionOwner;
import org.apache.xpath.functions.FuncExtFunction;
import org.apache.xpath.functions.Function;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.GetVariableFunction;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.HasExceptionOccurredFunction;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.IsVariableAvailableFunction;
import edu.xjtu.cdl2bpel.cdl.xpathFunction.XPathFunction;

/**
 * This class implements the XPath visitor interface, and
 * is used to validate the functions within a CDL XPath
 * expression.
 */
public class XPathValidatingVisitor
			extends org.apache.xpath.XPathVisitor {

	private XPathContext context=null;
	private boolean variableOnly=false;
	private RoleType[] roles=null;
	
	private String variableName=null;
	private String variablePart=null;
	private String variableDocPath=null;
	
	private boolean exceptionTypeOnly=false;
	private String exceptionType=null;
	private boolean participantBased=false;
	private boolean silent=false;
	private ParticipantType participant=null;
	private ParticipantType contextParticipant=null;
	
	public XPathValidatingVisitor(XPathContext context,
			RoleType[] roles,
			ParticipantType participant,
			boolean variableOnly, boolean exceptionTypeOnly) {
		
		this.context = context;
		this.variableOnly = variableOnly;
		this.roles = roles;
		this.exceptionTypeOnly = exceptionTypeOnly;
		
		contextParticipant = participant;
	}
	
	public boolean visitFunction(ExpressionOwner owner,
				Function function) {
		
		// TODO: Manage the set of roles that are valid
		// for this function - and restrict based on the
		// functions that are processed (if relevant)
		// ALSO - check for inconsistencies between
		// different functions in the same expression
		
		
		// Determine if this is an extension function
		if (function instanceof FuncExtFunction) {
			FuncExtFunction extfunc=(FuncExtFunction)function;
			
			// Validate the namespace
//			if (extfunc.getNamespace() == null ||
//					extfunc.getNamespace().
//						equals(CDL_NS) == false) {
//				
//			}
			
			// Check if the function is known
			XPathFunction cdlfunc=
				XPathFunctionRegistry.
					getFunction(extfunc.getFunctionName());
			
			if (cdlfunc == null) {
				
			} else {
				
				// Validate the function
				java.util.Map parameters=
					cdlfunc.validate(extfunc, context);
//				System.out.println(parameters+"##############");
				// Check if referenced variable is silent
				if (extfunc.getFunctionName().
							equals(GetVariableFunction.FUNCTION_NAME)) {
					String varName=(String)
						parameters.get(GetVariableFunction.PARAMETER_VARIABLE_NAME);
					
					Variable var=
						context.getChoreography().getVariable(varName);
					
					if (var != null && var.getSilent() == Boolean.TRUE) {
						silent = true;
					}
				} else if (extfunc.getFunctionName().
						equals(IsVariableAvailableFunction.FUNCTION_NAME)) {
					String varName=(String)
						parameters.get(IsVariableAvailableFunction.PARAMETER_VARIABLE_NAME);
					
					Variable var=
						context.getChoreography().getVariable(varName);
					
					if (var != null && var.getSilent() == Boolean.TRUE) {
						silent = true;
					}
				}
				
				// Check if the visitor should only validate
				// a single function (getVariable)
				if (variableOnly) {
					
					// Check if function has already been
					// found, or the function is not the
					// appropriate one
					if (variableName != null ||
							extfunc.getFunctionName().
							equals(GetVariableFunction.FUNCTION_NAME) == false) {
						
					} else {

						// Extract the relevant parameters
						variableName = (String)
							parameters.get(GetVariableFunction.PARAMETER_VARIABLE_NAME);
						variablePart = (String)
							parameters.get(GetVariableFunction.PARAMETER_PART);
						variableDocPath = (String)
							parameters.get(GetVariableFunction.PARAMETER_DOCUMENT_PATH);
					}
				} else if (exceptionTypeOnly) {
					
					// Check if function has already been
					// found, or the function is not the
					// appropriate one
					if (exceptionType != null ||
							extfunc.getFunctionName().
							equals(HasExceptionOccurredFunction.FUNCTION_NAME) == false) {
						
					} else {

						// Extract the relevant parameters
						exceptionType = (String)
							parameters.get(HasExceptionOccurredFunction.EXCEPTION_TYPE_PARAMETER);
					}
				}
					
				// Check if the returned parameters define
				// the validate role types
				if (parameters.containsKey(XPathFunction.PARAMETER_ROLES)) {
					validateRoleTypes(extfunc,
							(RoleType[])parameters.get(
							XPathFunction.PARAMETER_ROLES));
				}
				
				// Check if function is a participant based one
				// and whether the same participant has been
				// specified
				if (cdlfunc.isParticipantBased()) {
					
					ParticipantType part=
						(ParticipantType)
						parameters.get(XPathFunction.PARAMETER_PARTICIPANT);
					
					// Check if the current cdl function
					// as the same participant as previous
					if (participantBased && part != participant) {
							
					}
					
					participant = part;
					
					participantBased = true;
				}
			}
		}
		
		return(true);
	}
	
	protected void validateRoleTypes(FuncExtFunction extfunc,
					RoleType[] roleTypes) {
		
		java.util.Vector commonRoleTypes=new java.util.Vector();
		
		for (int i=0; roleTypes != null &&
					i < roleTypes.length; i++) {
			
			// Compare role type against expression list
			for (int j=0; roles != null &&
					j < roles.length; j++) {
				
				if (roleTypes[i] == roles[j]) {
					commonRoleTypes.add(roles[j]);
				}
			}
		}
		
		// Check if there was any overlap
		if (commonRoleTypes.size() == 0) {
			String roles="";
			for (int i=0; i < roleTypes.length; i++) {
				if (i != 0) {
					roles += ",";
				}
				roles += roleTypes[i].getName();
			}
			
		} else {
			
			roles = new RoleType[commonRoleTypes.size()];
			commonRoleTypes.copyInto(roles);
		}
	}
	
	/**
	 * This method returns the name of the variable associated
	 * with the 'variable only' validation.
	 *
	 * @return The variable name
	 */
	public String getVariableName() {
		return(variableName);
	}
	
	/**
	 * This method returns the part of the variable associated
	 * with the 'variable only' validation.
	 *
	 * @return The variable part
	 */
	public String getVariablePart() {
		return(variablePart);
	}
	
	/**
	 * This method returns the document path of the
	 * variable associated with the 'variable only'
	 * validation.
	 *
	 * @return The variable document path
	 */
	public String getVariableDocumentPath() {
		return(variableDocPath);
	}
	
	/**
	 * This mehod returns the exception type that has
	 * been extracted from an XPath expression using
	 * the 'hasExceptionOccurred' function.
	 * 
	 * @return The exception type
	 */
	public String getExceptionType() {
		return(exceptionType);
	}
	
	/**
	 * This method returns the list of role types that are
	 * appropriate for this XPath expression. This list will
	 * be refined as the expression is processed using this
	 * visitor. Once the validation has completed, then
	 * this list of role types will represent the suitable
	 * roles at which this expression can be applied.
	 * 
	 * @return The list of role types
	 */
	public RoleType[] getRoleTypes() {
		return(roles);
	}
	
	/**
	 * This method returns the participant instance associated
	 * with the expression.
	 * 
	 * @return The participant instance
	 */
	public ParticipantType getParticipant() {
		return(participant);
	}
	
	/**
	 * This method returns whether the expression is participant
	 * instance based.
	 * 
	 * @return Whether expression is participant instance based
	 */
	public boolean isParticipantBased() {
		return(participantBased);
	}
	
	/**
	 * This method returns whether the expression contains a
	 * silent variable.
	 * 
	 * @return Whether the expression is silent
	 */
	public boolean isSilent() {
		return(silent);
	}
	
	/**
	 * This method is invoked when the XPath validation
	 * is finished.
	 */
	public void validationFinished() {
		
		// Check if the 'variable only' validation has
		// been performed, and that a variable was
		// extracted
		if (variableOnly &&
				getVariableName() == null) {
		
		}
		
		// Check if a participant has been defined in the
		// expression, and if so, is it compatible with the
		// optionally specified context participant
		if (participantBased && participant != null &&
				contextParticipant != null) {
			
			if (participant != contextParticipant) {
				
			}
		}
	}
}
