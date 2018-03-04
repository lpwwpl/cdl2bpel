package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import java.util.Map;

import org.apache.xpath.functions.FuncExtFunction;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathContext;

public interface XPathFunction {
	
	public String getName();

	public Map validate(FuncExtFunction excfunc,
					XPathContext context);	
	
	public RoleType[] getRoleTypes(String name, XPathContext context);
	
	public boolean isParticipantBased();
	
	public static final String PARAMETER_ROLES="roles";
	
	public static final String PARAMETER_PARTICIPANT="participant";
	
	public static final int VOID_TYPE=0;
	public static final int ANY_TYPE=1;
	public static final int STRING_TYPE=2;
	public static final int BOOLEAN_TYPE=3;
	public static final int QNAME_TYPE=4;
	public static final int DURATION_TYPE=5;
	public static final int TIME_TYPE=6;
	public static final int DATE_TYPE=7;
	public static final int DATETIME_TYPE=8;
}
