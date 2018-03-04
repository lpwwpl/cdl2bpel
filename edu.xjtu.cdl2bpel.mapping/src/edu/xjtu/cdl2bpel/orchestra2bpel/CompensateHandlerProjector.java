package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CompensateHandlerProjector extends Orchestra2BPELProjectorImpl {

	/*
	 *compensateHandlers标签在BPOrchestraProjector里已经生成了，所以这个方法没必要操作
	 *CompensateHandlerProjector不能省略的原因是CompensateHandler的子元素还需要遍历
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Element returnElement=context.getCurrentElement();
		//看当前标签下有没有faultHandlers
		Element compensationHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"compensationHandlers");	
		if (compensationHandlers == null &&										 //如果没有（就从父标签下找）
			context.getCurrentElement().getParentNode() instanceof Element) {//并且当前的父节点是element的(就是保证当前不是process,因为process是最外层的
			//那么compensationHandlers就是当前节点父节点的compensationHandlers
			compensationHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"compensationHandlers");
		}
		
		if (compensationHandlers == null) {//要是还找不到compensationHandlers，就报错，写到日志中
			System.out.println("错误！在当前元素及其父元素中找不到compensationHandlers元素");
		} else {
			returnElement=compensationHandlers;
		}
		
		return returnElement;
	}
}
