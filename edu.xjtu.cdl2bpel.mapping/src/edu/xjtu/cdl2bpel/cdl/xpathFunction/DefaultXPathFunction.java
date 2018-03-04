package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import java.util.Map;

import org.apache.xpath.functions.FuncExtFunction;
import org.apache.xpath.objects.XString;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;

public abstract class DefaultXPathFunction implements XPathFunction {

	public DefaultXPathFunction(String funcName, int numParams,
			int numMandatoryParams, boolean repeatingParams,
			int[] paramTypes, String[] paramNames, int returnType) {
		
		m_functionName = funcName;
		m_numberOfParameters = numParams;
		m_numberOfMandatoryParameters = numMandatoryParams;
		m_repeatingParameters = repeatingParams;
		m_parameterTypes = paramTypes;
		m_parameterNames = paramNames;
	}
	
	public String getFunctionName() {
		return(m_functionName);
	}
	
	public String getName() {
		return(m_functionName);
	}
	
	protected boolean validateParameters(FuncExtFunction excfunc,
			XPathContext context) {
		boolean ret=true;
		
		// Check that the number of parameters is valid
		if (isRepeatingParameters()) {
			
			if (excfunc.getArgCount() < getNumberOfParameters() ||
					(excfunc.getArgCount()%getNumberOfParameters()) != 0) {
				ret = false;
			}
			
		} else if (excfunc.getArgCount() <
				getNumberOfMandatoryParameters()) {
			ret = false;
			
		} 
		else if (excfunc.getArgCount() >
				getNumberOfParameters()) {
			ret = false;
		}
		
		// Check the parameter types
		if (ret) {
			for (int i=0; getNumberOfParameters() > 0 &&
						i < excfunc.getArgCount(); i++) {
				
				// Get type value, taking into account
				// repeating sequences of parameters
				// (e.g. globalizedTrigger())
				int type = getParameterTypes()[i%getNumberOfParameters()];
				String name = getParameterNames()[i%getNumberOfParameters()];
				Object val = excfunc.getArg(i);
					
				switch (type) {
				case STRING_TYPE:
				case QNAME_TYPE:
					if ((val instanceof XString) == false) {
						ret = false;
					}
					break;
					
				case DURATION_TYPE:
					// If a string, then validate that
					// the constant is of the correct format
					if (val instanceof XString) {
						try {
							TimeUtil.getDuration(val.toString());
						} catch(IllegalArgumentException iae) {
							ret = false;
						}
					}
					break;
					
				case DATETIME_TYPE:
					// If a string, then validate that
					// the constant is of the correct format
					if (val instanceof XString) {
						try {
							TimeUtil.getDeadline(val.toString());
						} catch(IllegalArgumentException iae) {
							ret = false;
						}
					}
					break;
					
				default:
					ret = false;
					break;
				}
			}
		}
		
		return(ret);
	}
	
	protected int getNumberOfParameters() {
		return(m_numberOfParameters);
	}
	
	protected int getNumberOfMandatoryParameters() {
		return(m_numberOfMandatoryParameters);
	}

	protected boolean isRepeatingParameters() {
		return(m_repeatingParameters);
	}

	protected int[] getParameterTypes() {
		return(m_parameterTypes);
	}
	
	protected String[] getParameterNames() {
		return(m_parameterNames);
	}
	
	public int getReturnType() {
		return(m_returnType);
	}
	
	protected java.util.Map buildReturnParameters(String roleName,
			Variable var, XPathContext context) {
		java.util.Map ret=new java.util.Hashtable();
		
		RoleType[] roleTypes=var.getRoleTypesMatrixFromTheContext();
		
		if (roleName != null) {
			RoleType[] singleRoleType=new RoleType[1];
			
			// Only associate the single named role
			// type with the return parameters from
			// this function
			for (int i=0; i < roleTypes.length &&
					singleRoleType[0] == null; i++) {
				
				if (roleTypes[i].getName().equals(roleName)) {
					singleRoleType[0] = roleTypes[i];
				}
			}
			
			// Only associate the parameter information
			// if a role type was found
			if (singleRoleType[0] != null) {
				ret.put(XPathFunction.PARAMETER_ROLES,
						singleRoleType);
			}
		} else {
			
			// Associate all of the relevant roles
			// for the variable with this function
			// return parameters
			ret.put(XPathFunction.PARAMETER_ROLES,
					roleTypes);
		}
		
		return(ret);
	}
	
	protected void validateVariableAtRoleOrParticipant(Variable var,
				String name, XPathContext context) {
		
		// Validate whether the variable must be
		// an exception variable type
		/** TODO: Not sure required
		 * 
		 *
		if (context.isException()) {
			boolean invalid=false;
		
			if (var.getType() instanceof InformationType) {
				InformationType infoType=
					(InformationType)var.getType();
			
				if (infoType.getExceptionType() == null ||
					infoType.getExceptionType().booleanValue()
							== false) {
					
					invalid = true;
				}
			} else {
				invalid = true;
			}
			
			if (invalid) {
				context.reportError(
						getMessage("_XPATH_NON_EXCEPTION_VAR",
								new Object[]{getName(),
									var.getName()}));
			}
		}
		*/
			
		// Check if the roleName has been specified,
		// and is valid, then check that the variable
		// is associated with it. The role would have
		// been validated elsewhere.
		if (name != null) {
			RoleType[] roleTypes=getRoleTypes(name, context);
			
			if (roleTypes != null) {
				boolean inContext=false;
				
				for (int i=0; inContext == false &&
							i < roleTypes.length; i++) {
					if (var.isInterrelatedWithRoleTypeMatrixFromTheContext(roleTypes[i].getName())) {
						inContext = true;
					}
				}
				
				if (inContext == false) {
				}
			}
		}
	}
	
	protected boolean validateRoleOrParticipant(String name,
					XPathContext context) {
		boolean ret = false;
		edu.xjtu.cdl2bpel.cdl.Package cdlpack = context.getSource()
				.getBelongedPackage();
		edu.xjtu.cdl2bpel.cdl.Choreography choreo = context.getSource()
				.getBelongedChoreography();

		if (cdlpack != null && name != null
				&& CDLPackageUtil.getRoleType(cdlpack, name) == null
				&& choreo != null) {

		} else {
			ret = true;
		}

		return (ret);
	}

	public RoleType[] getRoleTypes(String name, XPathContext context) {
		RoleType[] ret=null;
		
		RoleType singleRoleType = CDLPackageUtil.getRoleType(context.getSource().getBelongedPackage(),name);
		if (singleRoleType != null) {
			ret = new RoleType[1];
			ret[0] = singleRoleType;
		} else {
//			edu.xjtu.cdl2bpel.cdl.Participant part=
//					context.getSource().getEnclosingChoreography().
//							getParticipant(name);
//			
//			if (part != null && part.getRoleTypes().size() > 0) {
//				ret = new RoleType[part.getRoleTypes().size()];
//				
//				for (int i=0; i < part.getRoleTypes().size(); i++) {
//					ret[i] = (RoleType)part.getRoleTypes().get(i);
//				}
//			}
		}
		
		return(ret);
	}
	
	public boolean isParticipantBased() {
		return(false);
	}
	
	@Override
	public Map validate(FuncExtFunction excfunc,
			XPathContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String m_functionName=null;
	private int m_numberOfParameters=0;
	private int m_numberOfMandatoryParameters=0;
	private boolean m_repeatingParameters=false;
	private int[] m_parameterTypes=null;
	private String[] m_parameterNames=null;
	private int m_returnType=VOID_TYPE;
}
