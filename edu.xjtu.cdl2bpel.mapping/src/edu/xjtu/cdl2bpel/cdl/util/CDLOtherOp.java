package edu.xjtu.cdl2bpel.cdl.util;

import org.eclipse.emf.common.util.URI;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.common.schema.SchemaManager;
import edu.xjtu.cdl2bpel.common.schema.SchemaManagerFactory;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class CDLOtherOp {
	public static SchemaManager getSchemaManager(CDLElement cdlType) {
		SchemaManager ret=SchemaManagerFactory.createSchemaManager();
		
		if (cdlType != null) {
			org.eclipse.emf.ecore.resource.Resource resource=cdlType.eResource();
			String path=null;
			
			if (resource != null && resource.getURI() != null) {
				path = resource.getURI().toFileString();
				
				int index=path.lastIndexOf(java.io.File.separatorChar);
				if (index != -1) {
					path = path.substring(0, index);
				}
			}
			
			Package cdlpack=cdlType.getBelongedPackage();
			
			java.util.Iterator iter=cdlpack.
						getNamespaces().iterator();
			while (iter.hasNext()) {
				Namespace ns=(Namespace)iter.next();
				
				if (CheckNOthersUtil.isSet(ns.getSchemaLocation())) {
					try {
						String schemaLocation=ns.getSchemaLocation();
						
						// If relative path, then prepend resource's folder
						java.io.File f=new java.io.File(schemaLocation);
						
						if (f.isAbsolute() == false) {
							schemaLocation = path+java.io.File.separatorChar+schemaLocation;
							
							// Create URI
							schemaLocation = URI.createFileURI(schemaLocation).toString();
						}
						
						ret.registerSchema(schemaLocation);
					} catch(Exception e) {
					}
				}
			}
		}
		
		return(ret);
	}
}
