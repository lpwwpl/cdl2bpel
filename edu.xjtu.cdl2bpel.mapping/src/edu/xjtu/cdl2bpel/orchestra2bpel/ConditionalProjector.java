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

	//����Ϊswitch����case
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Element returnElement=context.getCurrentElement();
		Conditional conditional  = (Conditional)bpelElement;	
		
		Element catchElement=null;
		if(conditional.getParent()instanceof FaultHandler){//��˵��conditional��exceptionHandlers����ģ���conditionalҪ����Ϊcatch����catchAll
			if(conditional.getAdditional()==null&&CheckNOthersUtil.isSet(conditional.getAdditional())==false){//��ʱӦ����ΪcatchAll
				catchElement=context.createElement("catchAll");
			}else{//��ʱӦ����Ϊcatch
				catchElement=context.createElement("catch");
				String faultName=conditional.getAdditional();
				catchElement.setAttribute("faultName", faultName);
			}
			System.out.println(context.getCurrentElement().getParentNode().getNodeName());
			System.out.println(context.getCurrentElement().getParentNode().getParentNode().getNodeName());
			//����ǰ��ǩ����û��faultHandlers
/*			
			Element faultHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"faultHandlers");	
			if (faultHandlers == null &&										 //���û�У��ʹӸ���ǩ���ң�
				context.getCurrentElement().getParentNode() instanceof Element) {//���ҵ�ǰ�ĸ��ڵ���element��(���Ǳ�֤��ǰ����process,��Ϊprocess��������
				//��ôfaultHandlers���ǵ�ǰ�ڵ㸸�ڵ��faultHandlers
				faultHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"faultHandlers");
			}
*/			
			Element faultHandlers=context.getCurrentFaultHandler();
			if (faultHandlers == null) {//Ҫ�ǻ��Ҳ���faultHandlers���ͱ���д����־��
				System.out.println("�����ڵ�ǰԪ�ؼ��丸Ԫ�����Ҳ���faultHandlersԪ�أ�����ConditionalProjector.java");
			} 
			else {
				faultHandlers.appendChild(catchElement);//��faultHandlers����catch��catchAll
			}
			//����� catch��catchAll ��ǩ���һ��sequence�ӱ�ǩ
			Element sequenceElement=context.createElement("sequence");
			catchElement.appendChild(sequenceElement);

			returnElement=sequenceElement;//Ҫ��catch��catchAll���ػ�ȥ���Ա㴦����Ԫ��
		}
	
		
		
		
		/*
		 * ���������䲻�ܺ��ԣ�����˵workunit�߱�guard
		 * ����ܺ��ԣ��ͽ���BPOrderingStruturalActivityImpl������
		 */
		else if (ChoiceContextReasoner.ignoreConditional(conditional) == false) {//���������䲻�ܺ��ԣ�����˵workunit�߱�guard
			Element switchElement=null;
			if ((conditional.getParent() instanceof Choice) == false) {//���condition�ĸ��಻��choice����Ҫ���switch������丸����choice����ô�ڽ���choice��ʱ��Ͱ�switch�����
				
				switchElement = context.createElement("switch");				
				context.getCurrentElement().appendChild(switchElement);
				
			} else {//���������choice��switch�Ѿ���choice�Ľ����������
				switchElement = context.getCurrentElement();
			}
			//��ʱ��switchElement��switch�����洴��case
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
		 * ���µ��ø����transform����
		 */
		context.push(returnElement);
		Element superReturnElement = super.transform(context, bpelElement);
		if(superReturnElement!=null){//��Ϊnull��˵�����෵���˸�catch��ǩ
			returnElement=superReturnElement;
		}
		context.pop();
		
		
		return returnElement;
	}
}
