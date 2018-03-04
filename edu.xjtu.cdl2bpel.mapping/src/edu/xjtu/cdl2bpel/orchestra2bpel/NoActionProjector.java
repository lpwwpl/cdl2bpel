package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.NoAction;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class NoActionProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		NoAction noAction = (NoAction) bpelElement;
		if (noAction.getParent() instanceof Choice
				&& context.getCurrentElement().getNodeName().equals("switch")) {
			Element caseElement = context.createElement("case");
			// ����case��name����
			if (CheckNOthersUtil.isSet(noAction.getName())) {
				caseElement.setAttribute("name", XMLUtils.encodeQName(noAction
						.getName()));// sequence getName��ɶ����
			}
			String conditionString = "XPath to be defined";
			caseElement.setAttribute("condition", conditionString);// ��condition������Ϊ��XPath
																	// to be
																	// defined��
			context.getCurrentElement().appendChild(caseElement);
			context.push(caseElement);
		} 
		Element returnElement=context.getCurrentElement();
		Element emptyElement=context.createElement("empty");//�����ձ�ǩ
		context.getCurrentElement().appendChild(emptyElement);
		returnElement=emptyElement;
		context.pop();
		return returnElement;
	}
}
