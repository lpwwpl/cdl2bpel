package edu.xjtu.cdl2bpel.deploy;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;

public class WSBPELDefinitions {

	/**
	 * This method returns the name of the WS-BPEL process, based
	 * on the supplied CDL choreography description and participant
	 * name.
	 * 
	 * @param sd The service description
	 * @return The WS-BPEL process name
	 */
	public static String getWSBPELProcessName(GlobalArchitecture sd) {
		String ret=null;
		
		//ret = sd.getName()+PROCESS_NAME_SEPARATOR+participantName;
		ret = NameSpaceUtil.getLocalPart(sd.getFullyQualifiedName());
		
		return(ret);
	}
	
	public static String getBPELComponent(Package cdlpack) {
		return (cdlpack.getName() + "_bpel");
	}
	
	public static final String WSBPEL_MODULE="wsbpel";
	public static final String FILE_EXTENSION="bpel";
	public static final String WSBPEL11_NS="http://schemas.xmlsoap.org/ws/2003/03/business-process/";
}
