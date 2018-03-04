/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                                                         *
 **********************************************************/

package edu.xjtu.cdl2bpel.bpel;

import java.util.HashSet;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.models.BPELVisitor;
import edu.xjtu.cdl2bpel.models.ModelGraphEdge;
import edu.xjtu.cdl2bpel.models.ModelGraphVertex;

/**
 * <p>
 * Title: BPELFlow
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008 - 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public class BPELFlow extends BPELStructured {

	/*
	 * For the time being, we do not register the links in a flow explicitly.
	 * However, we might need to do so in th efuture.
	 */

	public BPELFlow(Element element) {
		super(element);
	}

	public BPELFlow(String name) {
		super(BPELConstants.stringFlow, name);
	}

	public BPELFlow cloneActivity() {
		BPELFlow clone = new BPELFlow(element
				.getAttribute(BPELConstants.stringName));
		clone.cloneLinks(this);
		for (BPELActivity activity : getActivities()) {
			clone.appendChildActivity(activity.cloneActivity());
		}
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}

	public void buildModelGraph(BPEL model) {
		ModelGraphVertex pin = new ModelGraphVertex(model);
		model.addDummy(pin);
		pin.setDotAttribute("shape", "circle");
		pin.setDotAttribute("label", "start");
		/*
		 * ModelGraphVertex tin = new ModelGraphVertex(model);
		 * model.addDummy(tin);
		 * 
		 * tin.setDotAttribute("shape", "box"); tin.setDotAttribute("label",
		 * ""); ModelGraphEdge edge = new ModelGraphEdge(pin, tin);
		 * model.addDummy(edge);
		 */
		ModelGraphVertex pout = new ModelGraphVertex(model);
		model.addDummy(pout);
		pout.setDotAttribute("shape", "circle");
		pout.setDotAttribute("label", "exit");
		/*
		 * ModelGraphVertex tout = new ModelGraphVertex(model);
		 * model.addDummy(tout); tout.setDotAttribute("shape", "box");
		 * tout.setDotAttribute("label", ""); ModelGraphEdge edge = new
		 * ModelGraphEdge(tout, pout); model.addDummy(edge);
		 */
		for (BPELActivity activity : getActivities()) {
			activity.vertex = new ModelGraphVertex(model);
			model.addVertex(activity.vertex);
			activity.SetActivityAttributes();
			/*
			 * ModelGraphVertex pintmp = new ModelGraphVertex(model);
			 * model.addDummy(pintmp); pintmp.setDotAttribute("shape",
			 * "circle"); pintmp.setDotAttribute("label", "");
			 * 
			 * ModelGraphVertex pouttmp = new ModelGraphVertex(model);
			 * model.addDummy(pouttmp); pouttmp.setDotAttribute("shape",
			 * "circle"); pouttmp.setDotAttribute("label", "");
			 */
			/*
			 * ModelGraphEdge edge = new ModelGraphEdge(pin, pintmp);
			 * model.addDummy(edge); edge = new ModelGraphEdge(pintmp,
			 * activity.vertex); model.addDummy(edge); edge = new
			 * ModelGraphEdge(activity.vertex, pouttmp); model.addDummy(edge);
			 * edge = new ModelGraphEdge(pouttmp, pout); model.addDummy(edge);
			 */
			// ModelGraphEdge edge = new ModelGraphEdge(pin, pintmp);
			// model.addDummy(edge);
			ModelGraphEdge edge = new ModelGraphEdge(pin, activity.vertex);
			model.addDummy(edge);
			edge = new ModelGraphEdge(activity.vertex, pout);
			model.addDummy(edge);
			// edge = new ModelGraphEdge(pouttmp, pout);
			// model.addDummy(edge);
		}
		addLinksToModelGraph(model, new HashSet<BPELActivity>(getActivities()));
	}

	@Override
	public double ComplexityOfActivity() {
		// TODO Auto-generated method stub
		double C = 0;
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive) {
				if (C < ((BPELPrimitive) activity).ComplexityOfActivity())
					C = ((BPELPrimitive) activity).ComplexityOfActivity();
			}
			if (activity instanceof BPELStructured) {
				if (C < ((BPELStructured) activity).ComplexityOfActivity())
					C = ((BPELStructured) activity).ComplexityOfActivity();
			}

		}
		return C;
	}

	@Override
	public int NumberOfEdges() {
		// TODO Auto-generated method stub
		int number = 2 * getActivities().size();
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive)
				number = number + ((BPELPrimitive) activity).NumberOfEdges();
			if (activity instanceof BPELStructured)
				number = number + ((BPELStructured) activity).NumberOfEdges();
		}
		return number;
	}

	@Override
	public int NumberOfNodes() {
		// TODO Auto-generated method stub
		int number = 2;
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive)
				number = number + ((BPELPrimitive) activity).NumberOfNodes();
			if (activity instanceof BPELStructured)
				number = number + ((BPELStructured) activity).NumberOfNodes();
		}
		return number;
	}

}
