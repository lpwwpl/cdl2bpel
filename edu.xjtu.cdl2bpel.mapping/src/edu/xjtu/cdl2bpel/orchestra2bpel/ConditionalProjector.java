package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.List;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class ConditionalProjector extends BPOrderingStruturalActivityProjector {

	//翻译为switch……case
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Element returnElement=context.getCurrentElement();
		Conditional conditional  = (Conditional)bpelElement;	
		
		Element catchElement=null;
		if(conditional.getParent()instanceof FaultHandler){//这说明conditional是exceptionHandlers下面的，故conditional要翻译为catch或是catchAll
			if(conditional.getAdditional()==null&&CheckNOthersUtil.isSet(conditional.getAdditional())==false){//此时应翻译为catchAll
				catchElement=context.createElement("catchAll");
			}else{//此时应翻译为catch
				catchElement=context.createElement("catch");
				String faultName=conditional.getAdditional();
				catchElement.setAttribute("faultName", faultName);
			}
			System.out.println(context.getCurrentElement().getParentNode().getNodeName());
			System.out.println(context.getCurrentElement().getParentNode().getParentNode().getNodeName());
			//看当前标签下有没有faultHandlers
/*			
			Element faultHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"faultHandlers");	
			if (faultHandlers == null &&										 //如果没有（就从父标签下找）
				context.getCurrentElement().getParentNode() instanceof Element) {//并且当前的父节点是element的(就是保证当前不是process,因为process是最外层的
				//那么faultHandlers就是当前节点父节点的faultHandlers
				faultHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"faultHandlers");
			}
*/			
			Element faultHandlers=context.getCurrentFaultHandler();
			if (faultHandlers == null) {//要是还找不到faultHandlers，就报错，写到日志中
				System.out.println("错误！在当前元素及其父元素中找不到faultHandlers元素！！！ConditionalProjector.java");
			} 
			else {
				faultHandlers.appendChild(catchElement);//给faultHandlers加上catch或catchAll
			}
			//下面给 catch或catchAll 标签添加一个sequence子标签
			Element sequenceElement=context.createElement("sequence");
			catchElement.appendChild(sequenceElement);

			returnElement=sequenceElement;//要把catch或catchAll返回回去，以便处理子元素
		}
	
		
		
		
		/*
		 * 如果条件语句不能忽略，就是说workunit具备guard
		 * 如果能忽略，就交给BPOrderingStruturalActivityImpl来处理
		 */
		else if (ChoiceContextReasoner.ignoreConditional(conditional) == false) {//如果条件语句不能忽略，就是说workunit具备guard
			Element switchElement=null;
			if ((conditional.getParent() instanceof Choice) == false) {//如果condition的父类不是choice，就要添加switch；如果其父类是choice，那么在解析choice的时候就把switch添加了
				
				switchElement = context.createElement("switch");				
				context.getCurrentElement().appendChild(switchElement);
				
			} else {//如果父类是choice，switch已经在choice的解析中添加了
				switchElement = context.getCurrentElement();
			}
			//这时，switchElement是switch，下面创建case
			Element caseElement=context.createElement("case");
//			caseElement.setAttribute("name", conditional.getName());
			String convertedExpression="XPath not defined";
			if (CheckNOthersUtil.isSet(conditional.getExpression())) {
				convertedExpression = ChoreographyUtil.transformExpression(
						conditional.getBelongedBPOrchestra(),
						conditional.getExpression());
			} 
			caseElement.setAttribute("condition", convertedExpression);
//			if (conditional.getName()!=null) {
//				caseElement.setAttribute("name", XMLUtils.encodeQName(conditional.getName()));
//			}
			Element sequenceElement=context.createElement("sequence");
			caseElement.appendChild(sequenceElement);
			switchElement.appendChild(caseElement);
			
			returnElement=sequenceElement;
		}
		
		/*
		 * 以下调用父类的transform方法
		 */
		context.push(returnElement);
		Element superReturnElement = super.transform(context, bpelElement);
		if(superReturnElement!=null){//不为null，说明父类返回了个catch标签
			returnElement=superReturnElement;
		}
		context.pop();
		
		
		return returnElement;
	}
}
