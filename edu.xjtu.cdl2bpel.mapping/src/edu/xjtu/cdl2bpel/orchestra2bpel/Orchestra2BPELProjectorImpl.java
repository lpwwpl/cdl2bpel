package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;

public class Orchestra2BPELProjectorImpl implements Orchestra2BPELProjector {

	public Element transformOrchestra2BPEL(Orchestra2BPELContext bpelContext,
			BPElement bpelElement) {
		// ��ӽ�bpelElementת��Ϊbpel�ķ���
		// Orchestra2BPELProjector
		// orchestra2BPELProjector=Orchestra2BPELProxy.getProjectorByOrchestraName(bpelElement.getName());//�����м��ǩ�����ֵõ���Ӧ��projector
		return transform(bpelContext, bpelElement);
	}

	// �÷���ͨ����̬��ʵ��
	public Element transform(Orchestra2BPELContext bpelContext,
			BPElement bpelElement) {
		System.out.println("����Orchestra2BPELProjectorImpl");
		return bpelContext.createElement("");
	}

}
