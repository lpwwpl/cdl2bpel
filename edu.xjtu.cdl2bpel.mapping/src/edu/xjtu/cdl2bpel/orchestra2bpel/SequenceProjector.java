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
	 * sequence��������Ϊcase��sequence
	 */
	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		Sequence sequence = (Sequence) bpelElement;
		Element returnElement = null;
		// ����ϲ���choice�ҵ�ǰ��ǩΪswitch����ôsequence��Ҫ����Ϊcase
		if (sequence.getParent() instanceof Choice
				&& context.getCurrentElement().getNodeName().equals("switch")) {
			Element caseElement = context.createElement("case");
			// ����case��name����
			if (CheckNOthersUtil.isSet(sequence.getName())) {
				caseElement.setAttribute("name", XMLUtils.encodeQName(sequence
						.getName()));// sequence getName��ɶ����
			}
			String conditionString = "XPath to be defined";
			caseElement.setAttribute("condition", conditionString);// ��condition������Ϊ��XPath
																	// to be
																	// defined��
			context.getCurrentElement().appendChild(caseElement);
			returnElement = caseElement;
		} else if (sequence.getActivityTypes().size() > 0) {// ���sequence�����л�Ļ�����Ҫ����Ϊsequence
			if (context.getCurrentElement().getNodeName().equals("sequence")) {// �����ǰ��ǩҲ��sequence�������Ͳ��ô���һ��sequence�ˣ�����sequence��Ƕ�ף�����cdlSequence�еĻֱ����ӵ���sequence��ȥ����
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
