package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class DefaultServiceExtractor implements ServiceExtractor {

	public String extractServiceInfo(Variable channelVariable) {
		
		String ret = null;

		if (channelVariable != null
				&& channelVariable.getType() instanceof ChannelType) {
			ChannelType type = (ChannelType) channelVariable.getType();
			BehaviorOfRoleType behavior = type.getTheBehaviorOfTheRoleType();

			if (behavior == null) {

				if (type.getRoleType() != null
						&& type.getRoleType().getBehaviors().size() == 1) {
					behavior = (BehaviorOfRoleType) type.getRoleType()
							.getBehaviors().get(0);
				}
			}

			if (behavior != null) {
				String qname = behavior.getInterface();

				if (CheckNOthersUtil.isSet(qname) == false) {
					qname = type.getRoleType().getName();

					if (type.getRoleType().getBehaviors().size() > 1) {
						qname += (type.getRoleType().getBehaviors().indexOf(
								behavior) + 1);
					}
				}

				String namespace = CDLElementUtil.getNamespace(qname,
						channelVariable, true);
				String localpart = XMLUtils.getLocalname(qname);

				ret = CommonNamespaceUtil.getFullyQualifiedName(namespace, localpart);
			}

			if (ret == null) {
				ret = "unknown";
			}
		}

		return (ret);
	}
}
