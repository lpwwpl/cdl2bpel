

package edu.xjtu.cdl2bpel.designer.inference;

import edu.xjtu.cdl2bpel.designer.DesignerDefinitions;



public class PackageInferenceRule implements InferenceRule {

	private static final String TARGET_NAMESPACE_DESCRIPTION_PREFIX = "Target Namespace for ";
	private static final String DESCRIPTION_PREFIX = "The choreography description for ";

	

	public boolean isSupported(Object obj) {
		return(obj instanceof edu.xjtu.cdl2bpel.cdl.Package);
	}
	
	

	public void addition(Object obj) {
	}
	
	

	public void deletion(Object obj) {
	}
	
	

	public void propertyChange(Object obj, String prop, Object value) {
		edu.xjtu.cdl2bpel.cdl.Package cdlpack=(edu.xjtu.cdl2bpel.cdl.Package)obj;
		
		if (prop.equals("name") && value instanceof String) {
	        String namespacePrefix=
    			DesignerDefinitions.getPreference(DesignerDefinitions.NAMESPACE_PREFIX);
			
			if (cdlpack.getDescription() == null ||
					cdlpack.getDescription().equals(
							DESCRIPTION_PREFIX+cdlpack.getName())) {
				cdlpack.setDescription(DESCRIPTION_PREFIX+((String)value));
			}
			
			if (cdlpack.getTargetNamespace() == null ||
					cdlpack.getTargetNamespace().equals(
							namespacePrefix+cdlpack.getName())) {
				cdlpack.setTargetNamespace(namespacePrefix+((String)value));
			}
			
			
			
			edu.xjtu.cdl2bpel.cdl.Namespace ns=null;
			
			java.util.Iterator iter=cdlpack.getNamespaces().iterator();
			while (ns == null && iter.hasNext()) {
				ns = (edu.xjtu.cdl2bpel.cdl.Namespace)iter.next();
				
				if (ns.getPrefix().equals("tns") == false) {
					ns = null;
				}
			}
			
			if (ns != null && (ns.getUri() == null ||
					ns.getUri().equals(
							namespacePrefix+cdlpack.getName()))) {
				ns.setUri(namespacePrefix+((String)value));
			}
			
			if (ns != null && (ns.getDescription() == null ||
					ns.getDescription().equals(
							TARGET_NAMESPACE_DESCRIPTION_PREFIX+cdlpack.getName()))) {
				ns.setDescription(TARGET_NAMESPACE_DESCRIPTION_PREFIX+((String)value));
			}
		}
	}

}

