package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import org.w3c.dom.Text;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.When;
import edu.xjtu.cdl2bpel.orchestra.util.WhenUtil;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathBehaviorTransformer;
import edu.xjtu.cdl2bpel.orchestra.xpath.XMLPrefixResolver;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class WhenProjector extends Orchestra2BPELProjectorImpl {
	private static XMLPrefixResolver m_prefixResolver = new XPathBehaviorTransformer();

	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		Element returnElement = null;
		When when = (When) bpelElement;
		SingleFunctionExprEvaluator eval = getXPathFunctionEvaluator(when);
		if (eval.getXPathFunction() != null) {
			String param = null;

			if (eval.getXPathFunctionParameters().length > 0
					&& eval.getXPathFunctionParameters()[0] != null) {
				param = eval.getXPathFunctionParameters()[0].toString();// 初始化参数
			}

			Element elem = context.createElement("wait");// 创建wait标签
			context.getCurrentElement().appendChild(elem);

			if (eval.getXPathFunction().getFunctionName().equals(
					WhenUtil.getHasDeadlinePassedFunction().getFunctionName())) {

				Element until = context.createElement("for");
				elem.appendChild(until);

				Text text = context.getDocument().createTextNode(param);
				until.appendChild(text);

			} else if (eval.getXPathFunction().getFunctionName().equals(
					WhenUtil.getHasDurationPassedFunction().getFunctionName())) {

				Element forelem = context.createElement("until");
				elem.appendChild(forelem);

				Text text = context.getDocument().createTextNode(param);
				forelem.appendChild(text);
			}

			if (CheckNOthersUtil.isSet(when.getName())) {
				elem.setAttribute("name", XMLUtils.encodeQName(when.getName()));
			}

			Element sequence = context.createElement("sequence");
			elem.appendChild(sequence);
			returnElement = sequence;

		}
		return returnElement;
	}

	protected SingleFunctionExprEvaluator getXPathFunctionEvaluator(When when) {
		SingleFunctionExprEvaluator eval = new SingleFunctionExprEvaluator();

		eval.registerFunctionResolver(XPathBehaviorTransformer.BEHAVIOR_NAMESPACE,
				WhenUtil.getWhenFunctionResolver());
		try {
			eval.evaluate(when.getMatchedExpression(), m_prefixResolver);

		} catch (Exception e) {
			System.out
					.println("错误！！！WhenProjector中调用getXPathFunctionEvaluator()出现例外");
		}

		return (eval);
	}
}
