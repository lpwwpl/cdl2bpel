package edu.xjtu.cdl2bpel.orchestra2bpel;

import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.orchestra.Assign;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.Copy;
import edu.xjtu.cdl2bpel.orchestra.util.ChoreographyUtil;

public class AssignProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,BPElement bpelElement) {
		Assign assign=(Assign)bpelElement;
		
		Element assignElement=context.createElement("assign");
		EList<Copy> copies=assign.getCopies();
		for(Copy copy:copies){
			Element copyElement = context.createElement("copy");
			//elem.appendChild(copyelem);

			Element fromElement = context.createElement("from");
			
			//以下处理from标签
			if(copy.getSourceExpression()!=null) {
				fromElement.setAttribute("expression",copy.getSourceExpression());
			} else if(copy.getSourceVariable()!=null){
				fromElement.setAttribute("variable",ChoreographyUtil.getVariableName(copy.getSourceVariable()));
				fromElement.setAttribute("part",copy.getSourcePart());	
			}
			copyElement.appendChild(fromElement);
			//以下处理to标签
			Element toElement=context.createElement("to");			
			if(copy.getTargetVariable() != null) {
				toElement.setAttribute("variable",ChoreographyUtil.getVariableName(
						copy.getTargetVariable()));
				toElement.setAttribute("part",copy.getTargetPart());
			}
			copyElement.appendChild(toElement);
			assignElement.appendChild(copyElement);			
		}		
		context.getCurrentElement().appendChild(assignElement);
		return assignElement;
	}
}
