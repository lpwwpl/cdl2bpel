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
 * 该类是ConditionalProjector、、等的父类
 */
public class BPOrderingStruturalActivityProjector extends
		Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {

		Element returnElement = null;
		// bpelElement是conditional
		if (bpelElement.getParent() instanceof Choice
				&& ChoiceContextReasoner.isResponseHandler((Choice) bpelElement
						.getParent())) {// 判断是否choice的所有分支有跟choice前面的send匹配的receive活动
			ReceiveEnd recv = ChoiceContextReasoner.getReceiveExchange(// 得到了那个处理fault的receive
					(BPOrderingStruturalActivity) bpelElement);

			if (recv == null) {
				System.out
						.println("错误！在choice中找不到相应的response类型的receiveEnd！BPOrderingStruturalActivityProjector类报错。");

			} else if (CheckNOthersUtil.isSet(recv.getFaultName())) {// 如果faultName存在，说明recv是处理错误的
				Element elem = context.getCurrentElement();

				Element faultHandler = getFaultHandler(elem);// 找到faultHandlers

				if (faultHandler != null) {

					Element catchElem = context.createElement("catch");// 创建catch标签
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

	// 得到该范围内的faultHandlers，如果该范围内没有，就从其父节点范围内找，
	// 如果父节点范围内仍然没有，就在scope范围内创建一个新的
	private Element getFaultHandler(Element scope) {
		Element ret = null;
		while (scope != null && scope.getParentNode() instanceof Element
				&& scope.getNodeName().equals("scope") == false) {
			scope = (Element) scope.getParentNode();
		}
		if (scope == null) {
			System.out.println("错误！！找不到faultHandler的scope");
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
