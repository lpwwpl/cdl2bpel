package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.While;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class WhileProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		While whille=(While)bpelElement;
		Element whileElement=context.createElement("while");//����while��ǩ
		
		String conditionString="XPath expression to be defined";
		if (CheckNOthersUtil.isSet(whille.getBreakOutExpression())) {
			conditionString =ChoreographyUtil.transformExpression(whille.getBelongedBPOrchestra(),whille.getBreakOutExpression());
		} 
		whileElement.setAttribute("condition", conditionString);//����condition���ԣ���2.0�汾�У�Ӧ����condition��Ϊһ����Ԫ�أ�Ŀǰ������2.0�汾
		if (CheckNOthersUtil.isSet(whille.getName())) {
			whileElement.setAttribute("name",XMLUtils.encodeQName(whille.getName()));//����name����
		}
		Element sequenceElement=context.createElement("sequence");//��Ҫ��Ϊ�������һ��sequence��ǩ
		whileElement.appendChild(sequenceElement);//
		context.getCurrentElement().appendChild(whileElement);//��while��ǩ��ӵ���ǰԪ��
		return sequenceElement;//���ص��������ı�ǩ
	}
}
