package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.ChannelType;
import edu.xjtu.cdl2bpel.orchestra.Sequence;
import edu.xjtu.cdl2bpel.orchestra.Variable;

public class BPOrchestraProjector extends Orchestra2BPELProjectorImpl {

	// 如果是根编排，就翻译为<sequence>
	// 如果不是根编排，就翻译为<scope><sequence>
	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {
		BPOrchestra orchestra = (BPOrchestra) bpelElement;
		Element returnElem = null;
		// Element variablesElement=generateVariables(context,orchestra);//处理变量

		// 如果不是跟编排，就应当人为加上scope
		if (orchestra.getRoot() == Boolean.FALSE) {
			Element scopeElement = context.createElement("scope");
			scopeElement.setAttribute("name", orchestra.getName());
			returnElem = scopeElement;
			context.getScopeRegistry().registerScope(orchestra.getName(),
					scopeElement);
//			context.getCurrentElement().appendChild(scopeElement);
			context.push(scopeElement);// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		}

		generateVariables(context, orchestra);// 处理变量
		generateFaultHandlers(context, orchestra);
		generateCompensationHandler(context, orchestra);// 补偿处理

		// 人为添加sequence
		// 如果编排里只有一个活动，且这个活动不是sequence，那么就要人为加一个sequence
		if (!(orchestra.getActivityTypes().size() == 1 && (orchestra
				.getActivityTypes().get(0) instanceof Sequence))) {
			Element seq = context.createElement("sequence");
			returnElem = seq;
			context.getCurrentElement().appendChild(seq);
		}
		if (orchestra.getRoot() == Boolean.FALSE) {// 如果不是跟编排，就应当人为加上scope
			context.pop();// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		}
		return returnElem;
	}

	private void generateVariables(Orchestra2BPELContext context,
			BPOrchestra orchestra) {
		Element variablesElement = null;
		if (context.getVariablesElement() == null) {// 如果是null，则表明是根编排，这时候，要创建一个新的variablesElement标签，给process加上
			variablesElement = context.createElement("variables");// 创建variables标签
			context.getCurrentElement().appendChild(variablesElement);// 如果是根编排，则context.getCurrentElement()得到的是process标签
			context.setVariablesElement(variablesElement);
		} else {
			variablesElement = context.getVariablesElement();
		}
		// Element
		// variablesElement=context.createElement("variables");//创建variables标签
		Iterator variablesIterator = orchestra.getVariables().iterator();
		while (variablesIterator.hasNext()) {
			Object variable = variablesIterator.next();
			if ((variable instanceof Variable)
					&& ((variable instanceof ChannelType) == false)) {
				// 如果cdl中相应变量的type是channelType=“”，这个就不要了，如果是informationType="",则保留
				// ！！！！！！！！！！！！！！！以后该处还要判断一下该变量是否是要使用的，如果没用到就不要！！！！
				Element variableElement = context.createElement("variable");// 创建variable标签
				String name = dealVariableName((Variable) variable);
				// System.out.println("名字是"+name+(variable instanceof
				// ChannelType));
				variableElement.setAttribute("name", name);// 设置bpel中的变量名

				/*
				 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 * !!!!!!!!!!!!!!!!!
				 * 此处有messageType、element和type三种类型，现在只处理messageType类型的，其他的以后处理
				 * !!
				 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 * !!!!!!!!!!!!!!!!!!!!
				 */
				// System.out.println("messageType是"+((Variable)variable).getInformationType().getFullyQualifiedType());
				variableElement.setAttribute("messageType",
						((Variable) variable).getInformationType().getType());

				/*
				 * ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ 还没有处理子编排的变量
				 * ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
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

	private String dealVariableName(Variable variable) {// 返回orchestra名字加变量名
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
