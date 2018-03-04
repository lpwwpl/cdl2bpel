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
		Element whileElement=context.createElement("while");//创建while标签
		
		String conditionString="XPath expression to be defined";
		if (CheckNOthersUtil.isSet(whille.getBreakOutExpression())) {
			conditionString =ChoreographyUtil.transformExpression(whille.getBelongedBPOrchestra(),whille.getBreakOutExpression());
		} 
		whileElement.setAttribute("condition", conditionString);//设置condition属性，在2.0版本中，应当把condition作为一个子元素，目前不考虑2.0版本
		if (CheckNOthersUtil.isSet(whille.getName())) {
			whileElement.setAttribute("name",XMLUtils.encodeQName(whille.getName()));//设置name属性
		}
		Element sequenceElement=context.createElement("sequence");//需要人为额外添加一个sequence标签
		whileElement.appendChild(sequenceElement);//
		context.getCurrentElement().appendChild(whileElement);//把while标签添加到当前元素
		return sequenceElement;//返回的是最里层的标签
	}
}
