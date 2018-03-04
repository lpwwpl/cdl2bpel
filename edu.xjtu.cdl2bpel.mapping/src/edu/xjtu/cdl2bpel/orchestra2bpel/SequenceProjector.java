package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.CaseException;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.Sequence;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class SequenceProjector extends Orchestra2BPELProjectorImpl {

	/*
	 * sequence将被翻译为case或sequence
	 */
	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		Sequence sequence = (Sequence) bpelElement;
		Element returnElement = null;
		// 如果上层是choice且当前标签为switch，那么sequence就要翻译为case
		if (sequence.getParent() instanceof Choice
				&& context.getCurrentElement().getNodeName().equals("switch")) {
			Element caseElement = context.createElement("case");
			// 设置case的name属性
			if (CheckNOthersUtil.isSet(sequence.getName())) {
				caseElement.setAttribute("name", XMLUtils.encodeQName(sequence
						.getName()));// sequence getName是啥东东
			}
			String conditionString = "XPath to be defined";
			caseElement.setAttribute("condition", conditionString);// 将condition属性设为”XPath
																	// to be
																	// defined“
			context.getCurrentElement().appendChild(caseElement);
			returnElement = caseElement;
		} else if (sequence.getActivityTypes().size() > 0) {// 如果sequence里面有活动的话，就要翻译为sequence
			if (context.getCurrentElement().getNodeName().equals("sequence")) {// 如果当前标签也是sequence，这样就不用创建一个sequence了（避免sequence的嵌套），把cdlSequence中的活动直接添加到父sequence中去即可
				returnElement = context.getCurrentElement();
			} else {
				Element sequenceElement = context.createElement("sequence");
				context.getCurrentElement().appendChild(sequenceElement);
				returnElement = sequenceElement;
			}
		}

		return returnElement;
	}
}
