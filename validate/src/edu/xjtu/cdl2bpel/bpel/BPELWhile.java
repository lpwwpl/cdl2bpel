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

import java.util.ArrayList;
import java.util.HashSet;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.models.BPELVisitor;
import edu.xjtu.cdl2bpel.models.ModelGraphEdge;
import edu.xjtu.cdl2bpel.models.ModelGraphVertex;

/**
 * <p>
 * Title: BPELWhile
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
public class BPELWhile extends BPELStructured {

	public BPELWhile(Element element) {
		super(element);
	}

	public BPELWhile(String name) {
		super(BPELConstants.stringWhile, name);
	}

	public BPELWhile cloneActivity() {
		BPELWhile clone = new BPELWhile(element
				.getAttribute(BPELConstants.stringName));
		for (BPELActivity activity : getActivities()) {
			clone.appendChildActivity(activity.cloneActivity());
		}
		clone.cloneLinks(this);
		clone.appendChildActivity(getActivity().cloneActivity());
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}

	public BPELActivity getActivity() {
		ArrayList<BPELActivity> activities = this.getActivities();
		return activities.get(0);
	}

	public void buildModelGraph(BPEL model) {
		String condition = element.getAttribute("condition");
		if (condition == null) {
			condition = "";
		}

		ModelGraphVertex pin = new ModelGraphVertex(model);
		model.addDummy(pin);
		pin.setDotAttribute("shape", "circle");
		pin.setDotAttribute("label", "Start");
		ModelGraphVertex pout = new ModelGraphVertex(model);
		model.addDummy(pout);
		pout.setDotAttribute("shape", "circle");
		pout.setDotAttribute("label", "Exit");

		ModelGraphVertex u = new ModelGraphVertex(model);
		model.addDummy(u);
		u.setDotAttribute("shape", "box");
		u.setDotAttribute("label", "Condition: " + condition);

		BPELActivity activity = getActivity();
		activity.vertex = new ModelGraphVertex(model);
		model.addVertex(activity.vertex);
		activity.SetActivityAttributes();
		ModelGraphEdge edge = new ModelGraphEdge(pin, u);
		model.addDummy(edge);
		edge = new ModelGraphEdge(u, pout);
		model.addDummy(edge);
		edge.setDotAttribute("label", "no");
		edge = new ModelGraphEdge(u, activity.vertex);
		model.addDummy(edge);
		edge.setDotAttribute("label", "yes");
		edge = new ModelGraphEdge(activity.vertex, pin);
		model.addDummy(edge);

		addLinksToModelGraph(model, new HashSet<BPELActivity>(getActivities()));
	}

	@Override
	public double ComplexityOfActivity() {
		// TODO Auto-generated method stub

		double C = 0;
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive) {

				C = 3.7 * ((BPELPrimitive) activity).ComplexityOfActivity();
			}
			if (activity instanceof BPELStructured) {

				C = 3.7 * ((BPELStructured) activity).ComplexityOfActivity();
			}

		}
		return C;
	}

	@Override
	public int NumberOfEdges() {
		// TODO Auto-generated method stub
		int number = 4;
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive) {

				number = number + ((BPELPrimitive) activity).NumberOfEdges();
			}
			if (activity instanceof BPELStructured) {

				number = number + ((BPELStructured) activity).NumberOfEdges();
			}

		}
		return number;
	}

	@Override
	public int NumberOfNodes() {
		// TODO Auto-generated method stub
		int number = 1;
		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive) {

				number = number + ((BPELPrimitive) activity).NumberOfNodes();
			}
			if (activity instanceof BPELStructured) {

				number = number + ((BPELStructured) activity).NumberOfNodes();
			}

		}
		return number;
	}
}
