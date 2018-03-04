package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra.Variable;
import edu.xjtu.cdl2bpel.orchestra.util.BPActivityContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.InteractionUtil;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;

public class SendEndProjector extends Orchestra2BPELProjectorImpl {

	/*
	 * sendEnd要么翻译为reply要么翻译为invoke 当是response类型时，说明是在回复，所以要翻译为reply
	 * 当是request类型时，说明是在调用别的方法，故要翻译为invoke
	 */
	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		SendEnd sendEnd = (SendEnd) bpelElement;
		Element returnElement = context.getCurrentElement();
		ReceiveEnd receiveEnd = null;
		if (BPActivityContextReasoner.getNextActivityInParent(sendEnd) != null
				&& BPActivityContextReasoner.getNextActivityInParent(sendEnd) instanceof ReceiveEnd) {
			receiveEnd = (ReceiveEnd) BPActivityContextReasoner
					.getNextActivityInParent(sendEnd);
		}

		if ((receiveEnd != null && !sendEnd.getAdditional().equals(
				receiveEnd.getAdditional())) == false) {// 如果不用角色分组，只需去掉这一层if
			// 如果不相等，sendEnd就不用翻译（角色分组规定的），只有相等时才对sendEnd进行翻译
			if (sendEnd.getClassification() == MessageTypeEnumByInteraction.RESPONSE) {// 如果sendEnd是response类型的，则将其翻译为reply

				Element replyElement = context.createElement("reply");
				setAttributes(context, sendEnd, replyElement);// 设置partnerLink、operation和portType
				if (sendEnd.getVariable() != null) {
					replyElement.setAttribute("variable",
							getVariableName(sendEnd.getVariable()));// 设置variable属性
				}
				context.getCurrentElement().appendChild(replyElement);
				returnElement = replyElement;

			} else {// 其他类型时，要翻译为invoke
				List activitiesAfterSend = BPActivityContextReasoner
						.getSubsequentActivities(sendEnd);
				/*
				 * 如果是后续活动是个choice且choice中的每一个子活动都有跟sendEnd对应的的receiveEnd
				 * 这时候应当额外地添加上scope和sequence
				 * 如果访问sendEnd后的choice时，choice应当被翻译为switch……case
				 */
				// System.out.println("哈哈哈"+ChoiceUtil.isResponseHandler((Choice)activitiesAfterSend.get(0)));
				Element outerElementOfInvoke = context.getCurrentElement();// invoke的外层标签
				if (activitiesAfterSend.size() == 1
						&& activitiesAfterSend.get(0) instanceof Choice && // 这种情况下，当choice结束后，应当把接下来压栈的sequence弹出来
						ChoiceContextReasoner
								.isResponseHandler((Choice) activitiesAfterSend
										.get(0))) {
					Element scopeElement = context.createElement("scope");
					Element sequenceElement = context.createElement("sequence");
					scopeElement.appendChild(sequenceElement);
					context.getCurrentElement().appendChild(scopeElement);
					// context.push(sequenceElement);//压栈，注意啥时候出栈，以后的标签要加在sequence下面
					outerElementOfInvoke = sequenceElement;
				}
				/*
				 * 以下代码创建invoke
				 */
				Element invokeElement = context.createElement("invoke");
				// context.getCurrentElement().appendChild(invokeElement);
				outerElementOfInvoke.appendChild(invokeElement);
				setAttributes(context, sendEnd, invokeElement);// 设置partnerLink、operation和portType
				if (sendEnd.getVariable() != null) {
					invokeElement.setAttribute("inputVariable",
							getVariableName(sendEnd.getVariable()));// 设置inputVariable属性
				}
				ReceiveEnd recv = InteractionUtil
						.getSubsequentResponseReceive(sendEnd);// 得到后继的send或是receive

				if (recv != null && recv.getVariable() != null) {
					invokeElement.setAttribute("outputVariable",
							getVariableName(recv.getVariable()));// 设置outputVariable属性

				}
				returnElement = invokeElement;
			}

		}

		return returnElement;
	}

	public boolean isExistInRoleTypeMatrix(String roleTypeName,
			RoleType[] roleTypes) {
		boolean ret = false;
		for (int i = 0; i < roleTypes.length; i++) {
			if (roleTypeName.equals(roleTypes[i].getName())) {
				ret = true;
			}
		}
		return ret;
	}

	public String getPrefixOfPortType(Orchestra2BPELContext context,
			String roleTypeName) {
		String ret = null;
		for (Iterator it = context.getPairs().iterator(); it.hasNext();) {
			Pair<RoleType[], String> pair = (Pair<RoleType[], String>) it
					.next();
			if (isExistInRoleTypeMatrix(roleTypeName, (RoleType[]) pair
					.getFirst())) {
				ret = (String) context.getNamespaces().get(pair.getSecond());
				break;
			}
		}
		return ret;
	}

	/*
	 * 设置partnerLink、operation、portType和variable属性
	 */
	private void setAttributes(Orchestra2BPELContext context, SendEnd sendEnd,
			Element element) {
		String faultName=((SendEnd) sendEnd).getFaultName();
		if(faultName!=null&&faultName.length()>0){
			element.setAttribute("faultName", faultName);
		}
		String portType = ((SendEnd) sendEnd).getChannelType()
				.getInterfaceType().getFullyQualifiedName();
		String operation = ((SendEnd) sendEnd).getOperationName();
		String partnerLink = ((SendEnd) sendEnd).getChannelType()
				.getInterfaceType().getFullyQualifiedName();
		element.setAttribute("partnerLink", CommonNamespaceUtil
				.getLocalPart(partnerLink));
		// element.setAttribute("portType",NamespaceUtil.getLocalPart(portType));//需要改
		String whosePortType = getPrefixOfPortType(context, ((SendEnd) sendEnd)
				.getChannelType().getAddition());
		String localpart = NameSpaceUtil.getLocalPart(portType);
		element.setAttribute("portType", whosePortType + ":" + localpart);
		element.setAttribute("operation", operation);
	}

	private String getVariableName(Variable var) {// 得到“编排名字_变量名字”
		String ret = null;

		if (var != null) {
			ret = var.getName();

			if (var.getBelongedBPOrchestra() != null) {
				String choreoName = var.getBelongedBPOrchestra().getName();

				ret = choreoName + "_" + var.getName();
			}
		}

		return (ret);
	}
}
