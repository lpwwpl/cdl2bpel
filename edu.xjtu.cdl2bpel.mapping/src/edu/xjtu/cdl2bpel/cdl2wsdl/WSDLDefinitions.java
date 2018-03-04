package edu.xjtu.cdl2bpel.cdl2wsdl;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;

public class WSDLDefinitions {
	
	public static String getWSDLComponent(Package cdlpack) {
		return(cdlpack.getName()+WSDL_FOLDER_SUFFIX);
	}
	
	public static String getWSDLServiceName(String behaviorName,
						String namespace, String interfaceName) {
		String ret=interfaceName;
		
		if (ret == null) {
			ret = behaviorName;
		}
		
		ret += SERVICE_NAME_SUFFIX;
		
		return(ret);
	}
	
	public static String getWSDLServiceName(RoleType roleType) {
		String ret=null;
		
		if (roleType != null && roleType.getBehaviors().size() == 1) {
			String behaviorName=((BehaviorOfRoleType)
					roleType.getBehaviors().get(0)).getName();
			
			// NOTE: Don't extract interface details unless service
			// name requires them
			
			ret = getWSDLServiceName(behaviorName, null, null);
		}
		
		return(ret);
	}

	public static String getWSDLPortName(String behaviorName,
						String namespace, String interfaceName) {
		String ret=interfaceName;
		
		if (ret == null) {
			ret = behaviorName;
		}
		
		ret += PORT_NAME_SUFFIX;
		
		return(ret);
	}
	
	public static String getWSDLPortName(RoleType roleType) {
		String ret=null;
		
		if (roleType != null && roleType.getBehaviors().size() == 1) {
			String behaviorName=((BehaviorOfRoleType)
					roleType.getBehaviors().get(0)).getName();
			
			// NOTE: Don't extract interface details unless port
			// name requires them
			
			ret = getWSDLPortName(behaviorName, null, null);
		}
		
		return(ret);
	}

	public static final String WSDL_MODULE="wsdl";
	public static final String PLUGIN_ID="edu.xjtu.cdl2bpel.lpw";
		
	private static final String WSDL_FOLDER_SUFFIX = "_wsdl";
	private static final String PORT_NAME_SUFFIX = "Port";
	private static final String SERVICE_NAME_SUFFIX = "Service";

	public static final String XSD_NAMESPACE="http://www.w3.org/2001/XMLSchema";
	public static final String TARGET_NAMESPACE_ATTR="targetNamespace";
	
	public static final String FILE_EXTENSION="wsdl";
	public static final String FILE_EXTENSION_SEPARATOR = ".";

	public static final String BINDING_PROPERTY="binding";
	public static final String VERSION_PROPERTY="version";
	
	public static final String VERSION1_1="1.1";
	public static final String VERSION2_0="2.0";
	
	public static final String VERSION_PROPERTY_DEFAULT=VERSION2_0;
	
	public static final String[] VERSIONS=new String[] {
			VERSION2_0, VERSION1_1
	};

	public static final String NO_BINDING="No Binding";
	public static final String SOAP_RPC_BINDING="SOAP RPC";
	
	public static final String[] BINDINGS=new String[] {
			SOAP_RPC_BINDING, NO_BINDING
	};
	
	public static final String USER_DEFINED_DEFINITIONS="cdl2bpel: User defined definitions";
}
