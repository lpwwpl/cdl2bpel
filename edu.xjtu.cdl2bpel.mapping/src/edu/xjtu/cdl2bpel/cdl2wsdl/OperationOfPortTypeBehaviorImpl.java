package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class OperationOfPortTypeBehaviorImpl extends WSDLElement implements
		OperationOfPortTypeBehavior {

	private PortTypeBehaviorOfRoleTypeInfo porType = null;
	private String operationName = null;
	private java.util.List messages = new java.util.Vector();

	@Override
	public PortTypeBehaviorOfRoleTypeInfo getBelongedPortTypeOfCDL2WSDL() {
		return porType;
	}

	@Override
	public List getMessages() {
		return messages;
	}

	@Override
	public String getName() {
		return operationName;
	}

	public OperationOfPortTypeBehaviorImpl(
			PortTypeBehaviorOfRoleTypeInfo portType, String operationName) {
		this.porType = portType;
		this.operationName = operationName;
	}

	public MessageOfOperation getMessage(String faultNamespace,
			String faultName, int mesgType) {
		MessageOfOperation ret = null;

		java.util.Iterator iter = getMessages().iterator();
		while (ret == null && iter.hasNext()) {
			MessageOfOperation md = (MessageOfOperation) iter.next();

			if (md.getClassification() == mesgType) {

				// Check if a fault type
				if (mesgType == MessageOfOperation.INFAULT
						|| mesgType == MessageOfOperation.OUTFAULT) {

					if (md.getFaultName().equals(faultName)
							&& ((CheckNOthersUtil.isSet(md.getFaultNamespace())
									&& CheckNOthersUtil.isSet(faultNamespace) && md
									.getFaultNamespace().equals(faultNamespace)) || (CheckNOthersUtil
									.isSet(md.getFaultNamespace()) == false && CheckNOthersUtil
									.isSet(faultNamespace) == false))) {
						ret = md;
					}
				} else {
					ret = md;
				}
			}

		}

		return (ret);
	}

}
