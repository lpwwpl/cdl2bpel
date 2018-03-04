package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Comment;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.InteractionUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class ChoiceProjector extends Orchestra2BPELProjectorImpl {

	/*
	 * choice要么翻译为switch……case；要么翻译为pick……onMessage；要么就不处理，即不翻译choice了
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Choice choice  = (Choice)bpelElement;	
		Element elem=null;
		boolean isPick=false;//如果新添加的元素为pick（而不是switch）,则如果它的上面也是pick（就是currentElement也是pick），应当去掉外层的pick。
		boolean isSwitch=false;//同上
		int choiceType=ChoiceContextReasoner.getChoiceType(choice);
		//System.out.println("ChoiceType是"+choiceType);
		if (choiceType == ChoiceContextReasoner.CHOICE_TYPE_EVENT) {//如果choice里的所有活动都有个receiveEnd
			
			/*
			 * 如果choice里有一个活动不是跟前面的send配对的，那么就是pick
			 * 如果choice里有的所有活动都是跟前面的send配对的，那么choice就不翻译，elem就保持为null。这时候choice最终结束后，要把当时sendEndProjector额外压入栈的sequence弹出
			 */
			if (ChoiceContextReasoner.isResponseHandler(choice) == false) {//如果choice里有一个活动不是跟前面的send配对的，那么就是pick
				if(context.getCurrentElement().getNodeName().equals("pick")	){
					elem=context.getCurrentElement();
				}else{
					elem = context.createElement("pick");
					context.getCurrentElement().appendChild(elem);
					isPick=true;
					if (InteractionUtil.hasPrecedingInteraction(choice) == false) {
						elem.setAttribute("createInstance","yes");
					}
				}
				

				
			}else{
			//这种情况，跟sendEnd添加scope以及sequence的情况是对应的
			//这时候choice最终结束后，要把当时sendEndProjector额外压入栈的sequence弹出
			//这时候应当把sendEnd生成的sequence返回
				elem=context.getOldStackElement();
			}
		
		} else {
			elem = context.createElement("switch");
			context.getCurrentElement().appendChild(elem);
			isSwitch=true;
		}
		
		if (elem != null) {//不管是pick还是switch
			//
			//description暂不处理
			/*if (CheckNOthersUtil.isSet(choice.getDescription())) {
				Comment comment=context.createComment(
						XMLUtils.encodeXMLString(
								choice.getDescription()));
				
				context.getCurrentElement().insertBefore(comment, elem);
			}*/			
			if (CheckNOthersUtil.isSet(choice.getName())) {
				elem.setAttribute("name",XMLUtils.encodeQName(choice.getName()));//设置名字
			}
		}
		if(elem==null){
			elem=context.getCurrentElement();
		}
		/*//如果新添加的元素为pick（而不是switch）,则如果它的上面也是pick（就是currentElement也是pick），应当去掉外层的pick。
		if(isPick){
			if(context.getCurrentElement().getNodeName().equals("pick")){
				Element outerElement=context.getCurrentElement();
				context.pop();
				context.getCurrentElement().removeChild(outerElement);//删除外层节点
				
			}
		}
		//context.getCurrentElement().appendChild(elem);//添加入内层节点
		*/
		
		
		return elem;
	}
}
