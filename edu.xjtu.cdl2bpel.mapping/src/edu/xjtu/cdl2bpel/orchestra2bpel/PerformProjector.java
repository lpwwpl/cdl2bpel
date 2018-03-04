package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Perform;
import edu.xjtu.cdl2bpel.orchestra.VariableBinding;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;

public class PerformProjector extends Orchestra2BPELProjectorImpl {
	private static String SCOPE_PLACEHOLDER="scopePlaceholder";
	
	/*将perform转化为一个如下的东西
	<scopePlaceholder>
		<sequence>
			<assign>
				<copy>
					<from variable="parent_variable"></from>
					<to variable="bound_variable"></to>
				</copy>
			</assign>
		</sequence>
		<scope>
		<sequence>
			<assign>
				<copy>
					<from variable="bound_variable"></from>
					<to variable="parent_variable"></to>
				</copy>
			</assign>
		</sequence>
	</scopePlaceholder>
	 */
	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Perform perform=(Perform)bpelElement;
		
		
		Element scopePlaceholderElement=context.createElement(SCOPE_PLACEHOLDER);//scopePlaceholder标签
		context.getCurrentElement().appendChild(scopePlaceholderElement);
		
		scopePlaceholderElement.setAttribute("name",perform.getBpOrchestra().getName());//scopePlaceholder的name
		
		if (perform.getVariableBindings().size() > 0) {
			
			Element startSequenceElement=context.createElement("sequence");
			Element endSequenceElement=context.createElement("sequence");
			scopePlaceholderElement.appendChild(startSequenceElement);
			scopePlaceholderElement.appendChild(endSequenceElement);
			
			Element startAssignElement=context.createElement("assign");
			startSequenceElement.appendChild(startAssignElement);

			Element endAssignElement=context.createElement("assign");
			endSequenceElement.appendChild(endAssignElement);

			java.util.Iterator binds=perform.getVariableBindings().iterator();
			while (binds.hasNext()) {
				VariableBinding bind=(VariableBinding)binds.next();
				
				Element startCopyElement=context.createElement("copy");
				startAssignElement.appendChild(startCopyElement);
				
				Element startFromElement=context.createElement("from");
				startCopyElement.appendChild(startFromElement);
				startFromElement.setAttribute("variable",ChoreographyUtil.getVariableName(bind.getParentVariable()));
				
				Element startToElement=context.createElement("to");
				startCopyElement.appendChild(startToElement);
				startToElement.setAttribute("variable",ChoreographyUtil.getVariableName(bind.getBoundVariable()));
				
				Element endCopyElement=context.createElement("copy");
				endAssignElement.appendChild(endCopyElement);
				
				Element endFromElement=context.createElement("from");
				endCopyElement.appendChild(endFromElement);
				endFromElement.setAttribute("variable",ChoreographyUtil.getVariableName(bind.getBoundVariable()));
				
				Element endToElement=context.createElement("to");
				endCopyElement.appendChild(endToElement);
				endToElement.setAttribute("variable",ChoreographyUtil.getVariableName(bind.getParentVariable()));
			}
		}		
		
		return scopePlaceholderElement;//因为perform是叶节点，所以随便return一个东西，不一定非是scopePlaceholderElement
	}
}
