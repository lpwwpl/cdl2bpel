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
	 * sendEndҪô����ΪreplyҪô����Ϊinvoke ����response����ʱ��˵�����ڻظ�������Ҫ����Ϊreply
	 * ����request����ʱ��˵�����ڵ��ñ�ķ�������Ҫ����Ϊinvoke
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
				receiveEnd.getAdditional())) == false) {// ������ý�ɫ���飬ֻ��ȥ����һ��if
			// �������ȣ�sendEnd�Ͳ��÷��루��ɫ����涨�ģ���ֻ�����ʱ�Ŷ�sendEnd���з���
			if (sendEnd.getClassification() == MessageTypeEnumByInteraction.RESPONSE) {// ���sendEnd��response���͵ģ����䷭��Ϊreply

				Element replyElement = context.createElement("reply");
				setAttributes(context, sendEnd, replyElement);// ����partnerLink��operation��portType
				if (sendEnd.getVariable() != null) {
					replyElement.setAttribute("variable",
							getVariableName(sendEnd.getVariable()));// ����variable����
				}
				context.getCurrentElement().appendChild(replyElement);
				returnElement = replyElement;

			} else {// ��������ʱ��Ҫ����Ϊinvoke
				List activitiesAfterSend = BPActivityContextReasoner
						.getSubsequentActivities(sendEnd);
				/*
				 * ����Ǻ�����Ǹ�choice��choice�е�ÿһ���ӻ���и�sendEnd��Ӧ�ĵ�receiveEnd
				 * ��ʱ��Ӧ������������scope��sequence
				 * �������sendEnd���choiceʱ��choiceӦ��������Ϊswitch����case
				 */
				// System.out.println("������"+ChoiceUtil.isResponseHandler((Choice)activitiesAfterSend.get(0)));
				Element outerElementOfInvoke = context.getCurrentElement();// invoke������ǩ
				if (activitiesAfterSend.size() == 1
						&& activitiesAfterSend.get(0) instanceof Choice && // ��������£���choice������Ӧ���ѽ�����ѹջ��sequence������
						ChoiceContextReasoner
								.isResponseHandler((Choice) activitiesAfterSend
										.get(0))) {
					Element scopeElement = context.createElement("scope");
					Element sequenceElement = context.createElement("sequence");
					scopeElement.appendChild(sequenceElement);
					context.getCurrentElement().appendChild(scopeElement);
					// context.push(sequenceElement);//ѹջ��ע��ɶʱ���ջ���Ժ�ı�ǩҪ����sequence����
					outerElementOfInvoke = sequenceElement;
				}
				/*
				 * ���´��봴��invoke
				 */
				Element invokeElement = context.createElement("invoke");
				// context.getCurrentElement().appendChild(invokeElement);
				outerElementOfInvoke.appendChild(invokeElement);
				setAttributes(context, sendEnd, invokeElement);// ����partnerLink��operation��portType
				if (sendEnd.getVariable() != null) {
					invokeElement.setAttribute("inputVariable",
							getVariableName(sendEnd.getVariable()));// ����inputVariable����
				}
				ReceiveEnd recv = InteractionUtil
						.getSubsequentResponseReceive(sendEnd);// �õ���̵�send����receive

				if (recv != null && recv.getVariable() != null) {
					invokeElement.setAttribute("outputVariable",
							getVariableName(recv.getVariable()));// ����outputVariable����

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
	 * ����partnerLink��operation��portType��variable����
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
		// element.setAttribute("portType",NamespaceUtil.getLocalPart(portType));//��Ҫ��
		String whosePortType = getPrefixOfPortType(context, ((SendEnd) sendEnd)
				.getChannelType().getAddition());
		String localpart = NameSpaceUtil.getLocalPart(portType);
		element.setAttribute("portType", whosePortType + ":" + localpart);
		element.setAttribute("operation", operation);
	}

	private String getVariableName(Variable var) {// �õ�����������_�������֡�
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
