package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;

class RoleOrParticipantNameFunction extends DefaultXPathFunction {

	public RoleOrParticipantNameFunction(String funcName, int numParams,
			int numMandatoryParams, boolean repeatingParams,
			int[] paramTypes, String[] paramNames,
			int returnType, int roleNamePos) {
		
		super(funcName, numParams, numMandatoryParams,
				repeatingParams, paramTypes,
				paramNames, returnType);
		
		m_roleOrParticipantNamePosition = roleNamePos;
	}
	
	public java.util.Map validate(FuncExtFunction excfunc,
					XPathContext context) {
		java.util.Map ret=new java.util.Hashtable();
		
		// Validate the parameters
		boolean valid = validateParameters(excfunc, context);
		
		if (valid && excfunc.getArgCount() > m_roleOrParticipantNamePosition) {
			String roleOrParticipantName=excfunc.
					getArg(m_roleOrParticipantNamePosition).toString();
		
			if (roleOrParticipantName != null &&
					validateRoleOrParticipant(roleOrParticipantName, context)) {
				
				RoleType[] roleTypes = getRoleTypes(roleOrParticipantName, context);

				// Only associate the parameter information
				// if role types were found
				if (roleTypes != null) {
					ret.put(XPathFunction.PARAMETER_ROLES,
							roleTypes);
				}
				
				// Check if participant
//				edu.xjtu.cdl2bpel.cdl.Participant part=
//					context.getSource().getEnclosingChoreography().
//							getParticipant(roleOrParticipantName);
//
//				if (part != null) {
//					ret.put(XPathFunction.PARAMETER_PARTICIPANT,
//							part);
//				}
			}
		}
		
		return(ret);
	}
	
	public boolean isParticipantBased() {
		return(true);
	}
	
	private int m_roleOrParticipantNamePosition=0;
}
