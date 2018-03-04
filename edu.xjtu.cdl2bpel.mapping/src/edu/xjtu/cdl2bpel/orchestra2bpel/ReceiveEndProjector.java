package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra.util.BPActivityContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;
import edu.xjtu.cdl2bpel.orchestra.util.InteractionUtil;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;

public class ReceiveEndProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		ReceiveEnd receiveEnd = (ReceiveEnd) bpelElement;
		Element returnElement = null;
		SendEnd sendEnd = null;
		if (BPActivityContextReasoner.getPrecedingActivity(receiveEnd) != null
				&& BPActivityContextReasoner.getPrecedingActivity(receiveEnd) instanceof SendEnd) {
			sendEnd = (SendEnd) BPActivityContextReasoner.getPrecedingActivity(receiveEnd);
		}
		if ((sendEnd != null && !sendEnd.getAdditional().equals(
				receiveEnd.getAdditional())) == false) {// ��ɫ����Ҫ������ж�

			Element pickElement = context.getCurrentElement();// ��ʱ���赱ǰ��pick����ʵ��ǰ��ǩ��������sequence���ں����д���
			/*
			 * 1.��response���͵�interaction�У�receive���������յ��ý���ģ�������send�˸����󣬵���������֮�󣬰ѽ�����ظ�sender
			 * ����ʱ��Ҫreceive��������
			 * ������ʱ��receiveӦ����invoke��һ���֣���invoke��sendEndProjector���Ѿ�������
			 * �����Դ˴���receiveEndProjector�У�ֻ��Ҫ����request���͵�interaction
			 * 2.����request���͵�interaction��
			 * ��receive���������ձ��˷���ĵ��õģ���ʱreceive��ʾbpel���̵Ŀ�ʼ
			 */
			if (receiveEnd.getClassification() == MessageTypeEnumByInteraction.REQUEST) {
				boolean onMessage = false;// �ж��Ƿ���Ҫ����onMessage��ǩ
				Element currentElement = context.getCurrentElement();
				if (currentElement != null
						&& currentElement.getNodeName().equals("pick")) {// �����ǰΪpick��ǩ������Ҫ����onMessage
					onMessage = true;
					pickElement = context.getCurrentElement();
				} else if (currentElement.getParentNode().getNodeName().equals(
						"pick")
						&& // ��ǰ�ڵ�ĸ��ڵ���pick
						currentElement.getNodeName().equals("sequence") // ���ҵ�ǰ�ڵ���sequence����ʱҪȥ��sequence����onMessageֱ����ӵ�pick��ǩ����
				) {
					onMessage = true;
					// context.pop();//��sequence��ջ����ǰ�ڵ��Ϊpick
					pickElement = (Element) currentElement.getParentNode();// currentElement��sequence
					// !!!!!!!!!!!!����ȥ��Ҫ���ƣ����ܼ�remove
					pickElement.removeChild(currentElement);// ��pick��ɾ��sequence����context��ջû�䣬context�ĵ�ǰԪ����Ȼ��sequence��sequence��BPElementImpl��pop()ʱ����
					// context.getCurrentElement().removeChild(currentElement);//currentElement��sequence����context�ĵ�ǰelement��pick������pick�а�sequenceɾ��
				}
				// Element pickElement=context.getCurrentElement();
				Element receive_OnMessage = this.performReceiveConversion(
						context, receiveEnd, onMessage);
				pickElement.appendChild(receive_OnMessage);
				returnElement = receive_OnMessage;
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

	// ����receive����onMessage��ǩ����Ϊ�ñ�ǩ���ú���Ӧ������
	public Element performReceiveConversion(Orchestra2BPELContext context,
			ReceiveEnd recv, boolean onMessage) {
		Element ret = null;
		// pick�����Ҫ�����onMessage������ͷ����receive
		if (onMessage) {
			ret = context.createElement("onMessage");
			Element sequenceElement = context.createElement("sequence");
			ret.appendChild(sequenceElement);
			context.push(sequenceElement);// ��ʱ����������һ����ջ��������Ҫ��conditionalImpl�е�transform�����и���context��isAdditionalPopNeed�������жϣ������true������Ҫ��conditionalImpl�ж���popһ��
			context.setAdditionalPopNeed(true);
		} else {
			ret = context.createElement("receive");
		}

		setAttributes(context, recv, ret);// ��������

		if (recv.getVariable() != null) {// ����variable����
			ret.setAttribute("variable", ChoreographyUtil.getVariableName(recv
					.getVariable()));
		}

		if (onMessage == false && isFirstReceive(recv)) {
			ret.setAttribute("createInstance", "yes");
		}
		return (ret);
	}

	/*
	 * ����partnerLink��operation��portType��variable����
	 */
	private void setAttributes(Orchestra2BPELContext context,
			ReceiveEnd receiveEnd, Element element) {

		String portType = ((ReceiveEnd) receiveEnd).getChannelType()
				.getInterfaceType().getFullyQualifiedName();
		String operation = ((ReceiveEnd) receiveEnd).getOperationName();
		String partnerLink = ((ReceiveEnd) receiveEnd).getChannelType()
				.getInterfaceType().getFullyQualifiedName();
		element.setAttribute("partnerLink", CommonNamespaceUtil
				.getLocalPart(partnerLink));

		String whosePortType = getPrefixOfPortType(context,
				((ReceiveEnd) receiveEnd).getChannelType().getAddition());

		String localpart = NameSpaceUtil.getLocalPart(portType);
		element.setAttribute("portType", whosePortType + ":" + localpart);

		element.setAttribute("operation", operation);
	}

	private boolean isFirstReceive(ReceiveEnd recv) {
		boolean ret = true;

		if (InteractionUtil.hasPrecedingInteraction(recv)) {
			ret = false;
		}

		return (ret);
	}
}
