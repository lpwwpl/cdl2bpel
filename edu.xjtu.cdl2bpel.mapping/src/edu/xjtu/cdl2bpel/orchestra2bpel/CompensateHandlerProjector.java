package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CompensateHandlerProjector extends Orchestra2BPELProjectorImpl {

	/*
	 *compensateHandlers��ǩ��BPOrchestraProjector���Ѿ������ˣ������������û��Ҫ����
	 *CompensateHandlerProjector����ʡ�Ե�ԭ����CompensateHandler����Ԫ�ػ���Ҫ����
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Element returnElement=context.getCurrentElement();
		//����ǰ��ǩ����û��faultHandlers
		Element compensationHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"compensationHandlers");	
		if (compensationHandlers == null &&										 //���û�У��ʹӸ���ǩ���ң�
			context.getCurrentElement().getParentNode() instanceof Element) {//���ҵ�ǰ�ĸ��ڵ���element��(���Ǳ�֤��ǰ����process,��Ϊprocess��������
			//��ôcompensationHandlers���ǵ�ǰ�ڵ㸸�ڵ��compensationHandlers
			compensationHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"compensationHandlers");
		}
		
		if (compensationHandlers == null) {//Ҫ�ǻ��Ҳ���compensationHandlers���ͱ���д����־��
			System.out.println("�����ڵ�ǰԪ�ؼ��丸Ԫ�����Ҳ���compensationHandlersԪ��");
		} else {
			returnElement=compensationHandlers;
		}
		
		return returnElement;
	}
}
