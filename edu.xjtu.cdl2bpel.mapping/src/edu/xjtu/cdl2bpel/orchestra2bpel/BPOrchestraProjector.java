package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.ChannelType;
import edu.xjtu.cdl2bpel.orchestra.Sequence;
import edu.xjtu.cdl2bpel.orchestra.Variable;

public class BPOrchestraProjector extends Orchestra2BPELProjectorImpl {

	// ����Ǹ����ţ��ͷ���Ϊ<sequence>
	// ������Ǹ����ţ��ͷ���Ϊ<scope><sequence>
	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		BPOrchestra orchestra = (BPOrchestra) bpelElement;
		Element returnElem = null;
		// Element variablesElement=generateVariables(context,orchestra);//�������

		// ������Ǹ����ţ���Ӧ����Ϊ����scope
		if (orchestra.getRoot() == Boolean.FALSE) {
			Element scopeElement = context.createElement("scope");
			scopeElement.setAttribute("name", orchestra.getName());
			returnElem = scopeElement;
			context.getScopeRegistry().registerScope(orchestra.getName(),
					scopeElement);
//			context.getCurrentElement().appendChild(scopeElement);
			context.push(scopeElement);// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		}

		generateVariables(context, orchestra);// �������
		generateFaultHandlers(context, orchestra);
		generateCompensationHandler(context, orchestra);// ��������

		// ��Ϊ���sequence
		// ���������ֻ��һ���������������sequence����ô��Ҫ��Ϊ��һ��sequence
		if (!(orchestra.getActivityTypes().size() == 1 && (orchestra
				.getActivityTypes().get(0) instanceof Sequence))) {
			Element seq = context.createElement("sequence");
			returnElem = seq;
			context.getCurrentElement().appendChild(seq);
		}
		if (orchestra.getRoot() == Boolean.FALSE) {// ������Ǹ����ţ���Ӧ����Ϊ����scope
			context.pop();// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		}
		return returnElem;
	}

	private void generateVariables(Orchestra2BPELContext context,
			BPOrchestra orchestra) {
		Element variablesElement = null;
		if (context.getVariablesElement() == null) {// �����null��������Ǹ����ţ���ʱ��Ҫ����һ���µ�variablesElement��ǩ����process����
			variablesElement = context.createElement("variables");// ����variables��ǩ
			context.getCurrentElement().appendChild(variablesElement);// ����Ǹ����ţ���context.getCurrentElement()�õ�����process��ǩ
			context.setVariablesElement(variablesElement);
		} else {
			variablesElement = context.getVariablesElement();
		}
		// Element
		// variablesElement=context.createElement("variables");//����variables��ǩ
		Iterator variablesIterator = orchestra.getVariables().iterator();
		while (variablesIterator.hasNext()) {
			Object variable = variablesIterator.next();
			if ((variable instanceof Variable)
					&& ((variable instanceof ChannelType) == false)) {
				// ���cdl����Ӧ������type��channelType=����������Ͳ�Ҫ�ˣ������informationType="",����
				// �������������������������������Ժ�ô���Ҫ�ж�һ�¸ñ����Ƿ���Ҫʹ�õģ����û�õ��Ͳ�Ҫ��������
				Element variableElement = context.createElement("variable");// ����variable��ǩ
				String name = dealVariableName((Variable) variable);
				// System.out.println("������"+name+(variable instanceof
				// ChannelType));
				variableElement.setAttribute("name", name);// ����bpel�еı�����

				/*
				 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 * !!!!!!!!!!!!!!!!!
				 * �˴���messageType��element��type�������ͣ�����ֻ����messageType���͵ģ��������Ժ���
				 * !!
				 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 * !!!!!!!!!!!!!!!!!!!!
				 */
				// System.out.println("messageType��"+((Variable)variable).getInformationType().getFullyQualifiedType());
				variableElement.setAttribute("messageType",
						((Variable) variable).getInformationType().getType());

				/*
				 * �������������������������������������������������������������������������������������������� ��û�д����ӱ��ŵı���
				 * ��������������������������������������������������������������������������������������������
				 */
				variablesElement.appendChild(variableElement);
			}

		}

		// return variablesElement;
	}

	private void generateFaultHandlers(Orchestra2BPELContext context,
			BPOrchestra orchestra) {
		if (orchestra.getExceptionHandlers().size() > 0) {
			Element faultHandlers = context.createElement("faultHandlers");
			context.getCurrentElement().appendChild(faultHandlers);
			context.pushFaultHandlers(faultHandlers);
		}
	}

	private String dealVariableName(Variable variable) {// ����orchestra���ּӱ�����
		String variableName = variable.getName();
		String orchestraName = variable.getBelongedBPOrchestra().getName();
		return orchestraName + "_" + variableName;
	}

	private void generateCompensationHandler(Orchestra2BPELContext context,
			BPOrchestra orchestra) {
		if (orchestra.getCompensateHandlers().size() > 0) {
			Element compensationHandlers = context
					.createElement("compensationHandlers");
			context.getCurrentElement().appendChild(compensationHandlers);
		}
	}
}
