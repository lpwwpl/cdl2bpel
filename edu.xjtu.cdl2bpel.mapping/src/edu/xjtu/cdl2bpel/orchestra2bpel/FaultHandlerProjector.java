package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class FaultHandlerProjector extends Orchestra2BPELProjectorImpl {

	/*����һ�����µĶ���
	 <catch��catchAll faultName="����">
		<sequence>
			����
		</sequence>
	</catch��catchAll>
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
/*		FaultHandler faultHandler=(FaultHandler)bpelElement;
		
		
		
		Element catchElement=null;
		if(faultHandler.getAdditional()==null){//�������û���ˣ���Ҫ��catchAll������Ҫcatch
			catchElement=context.createElement("catchAll");
		}else{
			catchElement=context.createElement("catch");
			//System.out.println("faultName��"+context.getType(faultHandler.getName()));
			String faultName=context.getType(faultHandler.getName());//faultName�����ֿռ������ns1��ns2���������ģ��Ժ���Ը�
			if (XMLUtils.getPrefix(faultName) == null) {//���ǰ׺Ϊnull����Ĭ�ϼ�Ϊtns��
				faultName = "tns:"+faultName;
			}
			catchElement.setAttribute("faultName",faultName);
		}
		//����ǰ��ǩ����û��faultHandlers
		Element faultHandlers=(Element)XMLUtils.getChild(context.getCurrentElement(),"faultHandlers");	
		if (faultHandlers == null &&										 //���û�У���Ҫ��Ϊ��ӣ�
			context.getCurrentElement().getParentNode() instanceof Element) {//���ҵ�ǰ�ĸ��ڵ���element��(���Ǳ�֤��ǰ����process,��Ϊprocess��������
			//��ôfaultHandlers���ǵ�ǰ�ڵ㸸�ڵ��faultHandlers
			faultHandlers = (Element)XMLUtils.getChild((Element)context.getCurrentElement().getParentNode(),"faultHandlers");
		}
		
		if (faultHandlers == null) {//Ҫ�ǻ��Ҳ���faultHandlers���ͱ���д����־��
			System.out.println("�����ڵ�ǰԪ�ؼ��丸Ԫ�����Ҳ���faultHandlersԪ��");
		} else {
			faultHandlers.appendChild(catchElement);//��faultHandlers����catch��catchAll
		}
		//����� catch��catchAll ��ǩ���һ��sequence�ӱ�ǩ
		Element sequenceElement=context.createElement("sequence");
		catchElement.appendChild(sequenceElement);
		
		return sequenceElement;*/
		return context.getCurrentElement();
	}
}
