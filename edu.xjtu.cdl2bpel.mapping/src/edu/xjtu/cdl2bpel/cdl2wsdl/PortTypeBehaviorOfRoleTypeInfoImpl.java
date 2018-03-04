package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class PortTypeBehaviorOfRoleTypeInfoImpl extends WSDLElement implements PortTypeBehaviorOfRoleTypeInfo {

	private String behaviorName = null;
	private String namespace = null;
	private String portTypeName = null;
	private java.util.List operations = new ArrayList();
	
	public PortTypeBehaviorOfRoleTypeInfoImpl(String behaviorName,
			String portTypeName,String namespace) {
		this.behaviorName = behaviorName;
		this.namespace = namespace;
		this.portTypeName = portTypeName;
	}
	
	@Override
	public String getBehaviorName() {
		// TODO Auto-generated method stub
		return behaviorName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return portTypeName;
	}

	@Override
	public List getOperationOfCDL2WSDL() {
		// TODO Auto-generated method stub
		return operations;
	}
	
	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	
	/**
	 * Get the operations of the PortTypeBehaviorOfRoleTypeInfo
	 */
	public java.util.List getOperations(String name,
			String requestNamespace, String requestType,
			String responseNamespace, String responseType) {
		java.util.List ret=new java.util.Vector();
		
		java.util.Iterator iter=getOperationOfCDL2WSDL().iterator();
		while (iter.hasNext()) {
			OperationOfPortTypeBehavior op=
						(OperationOfPortTypeBehaviorImpl)iter.next();
			
			if (name == null || op.getName().equals(name)) {
				boolean reqFound=(requestType==null);
				boolean respFound=(responseType==null);
				java.util.Iterator miter=op.getMessages().iterator();
				
				while ((reqFound == false || respFound == false) &&
						miter.hasNext()) {
					MessageOfOperation mdef=(MessageOfOperation)
									miter.next();
					
					String theTypeOftype=mdef.getTypeStringValue();
					String namespace=mdef.getTypeNamespace();
					
					if (CheckNOthersUtil.isSet(theTypeOftype) == false) {
						theTypeOftype = mdef.getElementStringValue();
						namespace = mdef.getElementNamespace();
					}		
					
					if (reqFound == false && theTypeOftype != null &&
							mdef.getClassification() ==
								MessageOfOperation.INPUT &&
								theTypeOftype.equals(requestType) &&
							CheckNOthersUtil.compare(namespace, requestNamespace)) {
						reqFound = true;
					} else if (respFound == false && theTypeOftype != null &&
							(mdef.getClassification() ==
								MessageOfOperation.OUTPUT ||
							mdef.getClassification() ==
								MessageOfOperation.OUTFAULT) &&
								theTypeOftype.equals(responseType) &&
							CheckNOthersUtil.compare(namespace, responseNamespace)) {
						respFound = true;
					}
				}
					
				if (reqFound && respFound) {
					ret.add(op);
				}
			}
		}
		
		return(ret);
	}
}
