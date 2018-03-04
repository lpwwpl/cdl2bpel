package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class FaultHandlerProjector extends Orchestra2BPELProjectorImpl {

	/*生成一个如下的东西
	 <catch或catchAll faultName="名字">
		<sequence>
			……
		</sequence>
	</catch或catchAll>
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
/*		FaultHandler faultHandler=(FaultHandler)bpelElement;
		
		
		
		Element catchElement=null;
		if(faultHandler.getAdditional()==null){//如果后面没有了，则要用catchAll，否则要catch
			catchElement=context.createElement("catchAll");
		}else{
			catchElement=context.createElement("catch");
			//System.out.println("faultName是"+context.getType(faultHandler.getName()));
			String faultName=context.getType(faultHandler.getName());//faultName的名字空间采用了ns1、ns2……这样的，以后可以改
			if (XMLUtils.getPrefix(faultName) == null) {//如果前缀为null，则默认加为tns：
				faultName = "tns:"+faultName;
			}
			catchElement.setAttribute("faultName",faultName);
		}
		//看当前标签下有没有faultHandlers
		Element faultHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"faultHandlers");	
		if (faultHandlers == null &&										 //如果没有（需要人为添加）
			context.getCurrentElement().getParentNode() instanceof Element) {//并且当前的父节点是element的(就是保证当前不是process,因为process是最外层的
			//那么faultHandlers就是当前节点父节点的faultHandlers
			faultHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"faultHandlers");
		}
		
		if (faultHandlers == null) {//要是还找不到faultHandlers，就报错，写到日志中
			System.out.println("错误！在当前元素及其父元素中找不到faultHandlers元素");
		} else {
			faultHandlers.appendChild(catchElement);//给faultHandlers加上catch或catchAll
		}
		//下面给 catch或catchAll 标签添加一个sequence子标签
		Element sequenceElement=context.createElement("sequence");
		catchElement.appendChild(sequenceElement);
		
		return sequenceElement;*/
		return context.getCurrentElement();
	}
}
