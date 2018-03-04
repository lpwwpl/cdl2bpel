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
				receiveEnd.getAdditional())) == false) {// 角色分组要求这层判断

			Element pickElement = context.getCurrentElement();// 暂时假设当前是pick，其实当前标签还可能是sequence，在后续有处理
			/*
			 * 1.在response类型的interaction中，receive是用来接收调用结果的，就是先send了个请求，当别人做完之后，把结果返回给sender
			 * ，这时，要receive这个结果，
			 * 所以这时，receive应当是invoke的一部分，而invoke在sendEndProjector中已经处理了
			 * ，所以此处在receiveEndProjector中，只需要处理request类型的interaction
			 * 2.而在request类型的interaction中
			 * ，receive是用来接收别人发起的调用的，这时receive表示bpel流程的开始
			 */
			if (receiveEnd.getClassification() == MessageTypeEnumByInteraction.REQUEST) {
				boolean onMessage = false;// 判定是否需要生成onMessage标签
				Element currentElement = context.getCurrentElement();
				if (currentElement != null
						&& currentElement.getNodeName().equals("pick")) {// 如果当前为pick标签，则需要生成onMessage
					onMessage = true;
					pickElement = context.getCurrentElement();
				} else if (currentElement.getParentNode().getNodeName().equals(
						"pick")
						&& // 当前节点的父节点是pick
						currentElement.getNodeName().equals("sequence") // 而且当前节点是sequence，这时要去掉sequence，把onMessage直接添加到pick标签后面
				) {
					onMessage = true;
					// context.pop();//将sequence出栈，当前节点变为pick
					pickElement = (Element) currentElement.getParentNode();// currentElement是sequence
					// !!!!!!!!!!!!这里去掉要复制，不能简单remove
					pickElement.removeChild(currentElement);// 从pick里删除sequence，但context的栈没变，context的当前元素仍然是sequence，sequence在BPElementImpl的pop()时处理
					// context.getCurrentElement().removeChild(currentElement);//currentElement是sequence，而context的当前element是pick，即从pick中把sequence删掉
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

	// 返回receive或是onMessage标签，并为该标签设置好相应的属性
	public Element performReceiveConversion(Orchestra2BPELContext context,
			ReceiveEnd recv, boolean onMessage) {
		Element ret = null;
		// pick里面的要翻译成onMessage，否则就翻译成receive
		if (onMessage) {
			ret = context.createElement("onMessage");
			Element sequenceElement = context.createElement("sequence");
			ret.appendChild(sequenceElement);
			context.push(sequenceElement);// 这时候额外进行了一次入栈操作，需要在conditionalImpl中的transform方法中根据context的isAdditionalPopNeed操作来判断，如果是true，则需要在conditionalImpl中额外pop一次
			context.setAdditionalPopNeed(true);
		} else {
			ret = context.createElement("receive");
		}

		setAttributes(context, recv, ret);// 设置属性

		if (recv.getVariable() != null) {// 设置variable属性
			ret.setAttribute("variable", ChoreographyUtil.getVariableName(recv
					.getVariable()));
		}

		if (onMessage == false && isFirstReceive(recv)) {
			ret.setAttribute("createInstance", "yes");
		}
		return (ret);
	}

	/*
	 * 设置partnerLink、operation、portType和variable属性
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
