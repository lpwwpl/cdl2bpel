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
	 * choiceҪô����Ϊswitch����case��Ҫô����Ϊpick����onMessage��Ҫô�Ͳ�������������choice��
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Choice choice  = (Choice)bpelElement;	
		Element elem=null;
		boolean isPick=false;//�������ӵ�Ԫ��Ϊpick��������switch��,�������������Ҳ��pick������currentElementҲ��pick����Ӧ��ȥ������pick��
		boolean isSwitch=false;//ͬ��
		int choiceType=ChoiceContextReasoner.getChoiceType(choice);
		//System.out.println("ChoiceType��"+choiceType);
		if (choiceType == ChoiceContextReasoner.CHOICE_TYPE_EVENT) {//���choice������л���и�receiveEnd
			
			/*
			 * ���choice����һ������Ǹ�ǰ���send��Եģ���ô����pick
			 * ���choice���е����л���Ǹ�ǰ���send��Եģ���ôchoice�Ͳ����룬elem�ͱ���Ϊnull����ʱ��choice���ս�����Ҫ�ѵ�ʱsendEndProjector����ѹ��ջ��sequence����
			 */
			if (ChoiceContextReasoner.isResponseHandler(choice) == false) {//���choice����һ������Ǹ�ǰ���send��Եģ���ô����pick
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
			//�����������sendEnd���scope�Լ�sequence������Ƕ�Ӧ��
			//��ʱ��choice���ս�����Ҫ�ѵ�ʱsendEndProjector����ѹ��ջ��sequence����
			//��ʱ��Ӧ����sendEnd���ɵ�sequence����
				elem=context.getOldStackElement();
			}
		
		} else {
			elem = context.createElement("switch");
			context.getCurrentElement().appendChild(elem);
			isSwitch=true;
		}
		
		if (elem != null) {//������pick����switch
			//
			//description�ݲ�����
			/*if (CheckNOthersUtil.isSet(choice.getDescription())) {
				Comment comment=context.createComment(
						XMLUtils.encodeXMLString(
								choice.getDescription()));
				
				context.getCurrentElement().insertBefore(comment, elem);
			}*/			
			if (CheckNOthersUtil.isSet(choice.getName())) {
				elem.setAttribute("name",XMLUtils.encodeQName(choice.getName()));//��������
			}
		}
		if(elem==null){
			elem=context.getCurrentElement();
		}
		/*//�������ӵ�Ԫ��Ϊpick��������switch��,�������������Ҳ��pick������currentElementҲ��pick����Ӧ��ȥ������pick��
		if(isPick){
			if(context.getCurrentElement().getNodeName().equals("pick")){
				Element outerElement=context.getCurrentElement();
				context.pop();
				context.getCurrentElement().removeChild(outerElement);//ɾ�����ڵ�
				
			}
		}
		//context.getCurrentElement().appendChild(elem);//������ڲ�ڵ�
		*/
		
		
		return elem;
	}
}
