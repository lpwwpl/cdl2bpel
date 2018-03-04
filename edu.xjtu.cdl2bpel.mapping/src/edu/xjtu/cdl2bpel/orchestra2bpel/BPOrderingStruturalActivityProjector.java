package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/*
 * ������ConditionalProjector�����ȵĸ���
 */
public class BPOrderingStruturalActivityProjector extends
		Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {

		Element returnElement = null;
		// bpelElement��conditional
		if (bpelElement.getParent() instanceof Choice
				&& ChoiceContextReasoner.isResponseHandler((Choice) bpelElement
						.getParent())) {// �ж��Ƿ�choice�����з�֧�и�choiceǰ���sendƥ���receive�
			ReceiveEnd recv = ChoiceContextReasoner.getReceiveExchange(// �õ����Ǹ�����fault��receive
					(BPOrderingStruturalActivity) bpelElement);

			if (recv == null) {
				System.out
						.println("������choice���Ҳ�����Ӧ��response���͵�receiveEnd��BPOrderingStruturalActivityProjector�౨��");

			} else if (CheckNOthersUtil.isSet(recv.getFaultName())) {// ���faultName���ڣ�˵��recv�Ǵ�������
				Element elem = context.getCurrentElement();

				Element faultHandler = getFaultHandler(elem);// �ҵ�faultHandlers

				if (faultHandler != null) {

					Element catchElem = context.createElement("catch");// ����catch��ǩ
					String faultName = context.getType(recv
							.getFullyQualifiedFaultName());

					if (recv.getVariable() != null) {
						catchElem.setAttribute("faultName", faultName);
						catchElem.setAttribute("faultVariable",
								ChoreographyUtil.getVariableName(recv
										.getVariable()));
					}

					faultHandler.appendChild(catchElem);
					returnElement = catchElem;
				}
			}
		}

		return returnElement;
	}

	// �õ��÷�Χ�ڵ�faultHandlers������÷�Χ��û�У��ʹ��丸�ڵ㷶Χ���ң�
	// ������ڵ㷶Χ����Ȼû�У�����scope��Χ�ڴ���һ���µ�
	private Element getFaultHandler(Element scope) {
		Element ret = null;
		while (scope != null && scope.getParentNode() instanceof Element
				&& scope.getNodeName().equals("scope") == false) {
			scope = (Element) scope.getParentNode();
		}
		if (scope == null) {
			System.out.println("���󣡣��Ҳ���faultHandler��scope");
		} else {
			ret = (Element) XMLUtils.getChild(scope, "faultHandlers");
			if (ret == null) {
				ret = scope.getOwnerDocument().createElement("faultHandlers");

				if (scope.getFirstChild() == null) {
					scope.appendChild(ret);
				} else {
					scope.insertBefore(ret, scope.getFirstChild());
				}
			}
		}

		return (ret);
	}
}
