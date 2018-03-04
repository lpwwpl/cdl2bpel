package edu.xjtu.cdl2bpel.designer.model;

import java.util.List;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;

/**
 * This class represents the pseudo model component for containing
 * variable declarations associated with a choreography.
 */
public class VariableContainer implements Container {

	/**
	 * This is the constructor for the pseudo variable declarations
	 * model component.
	 * 
	 * @param choreo The choreography
	 */
	public VariableContainer(Object variableContainer) {
		this.variableContainer = variableContainer;
	}
	
	/**
	 * This method returns the list of variables.
	 * 
	 * @return The list of variables
	 */
	public java.util.List getVariables() {
		return(ModelSupport.getVariables(variableContainer, false));
	}
	
	/**
	 * This method returns the list of child components.
	 * 
	 * @return The list of children
	 */
	public List getChildren() {
		return(getVariables());
	}
	
	/**
	 * This method returns the specific list for the supplied
	 * child class. If this child class is not associated with
	 * the component, then null will be returned.
	 * 
	 * @param childClass The child's class
	 * @return
	 */
	public List getChildList(Class childClass) {
		List ret=null;
	
		if (childClass != null &&
				ModelSupport.isVariableClass(childClass)) {
			ret = getVariables();
		}
		
		return(ret);
	}
	
	/**
	 * This method returns the flow associated with the variable
	 * declarations.
	 * 
	 * @return The flow
	 */
	public Object getFlow() {
		return(variableContainer);
	}
	
	private Object variableContainer=null;
}
