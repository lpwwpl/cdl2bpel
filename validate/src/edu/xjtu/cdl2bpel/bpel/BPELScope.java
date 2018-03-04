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
 * Title: BPELScope
 * </p>
 * 
 * <p>
 * Description: Class for a BPEL scope activity.
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2008-2009
 * </p>
 * 
 * <p>
 * Company: HUT
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public class BPELScope extends BPELStructured {

	/*
	 * To do: event handlers, fault handlers, compensation handlers.
	 */

	public BPELScope(Element element) {
		super(element);
	}

	public BPELScope(String name) {
		super(BPELConstants.stringScope, name);
	}

	public BPELScope cloneActivity() {
		BPELScope clone = new BPELScope(element
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

	public BPELActivity getActivity() {
		ArrayList<BPELActivity> activities = this.getActivities();
		return activities.get(0);
	}

	public void buildModelGraph(BPEL model) {
		ModelGraphVertex pin = new ModelGraphVertex(model);
		model.addDummy(pin);
		pin.setDotAttribute("shape", "circle");
		pin.setDotAttribute("label", "Start");
		ModelGraphVertex pout = new ModelGraphVertex(model);
		model.addDummy(pout);
		pout.setDotAttribute("shape", "circle");
		pout.setDotAttribute("label", "Exit");

		BPELActivity activity = getActivity();

		activity.vertex = new ModelGraphVertex(model);
		model.addVertex(activity.vertex);
		activity.SetActivityAttributes();

		ModelGraphEdge edge = new ModelGraphEdge(pin, activity.vertex);
		model.addDummy(edge);
		edge = new ModelGraphEdge(activity.vertex, pout);
		model.addDummy(edge);

		addLinksToModelGraph(model, new HashSet<BPELActivity>(getActivities()));
	}

	@Override
	public double ComplexityOfActivity() {
		// TODO Auto-generated method stub
		double C = 0;
		BPELActivity activity = getActivity();
		if (activity instanceof BPELPrimitive)
			C = ((BPELPrimitive) activity).ComplexityOfActivity();
		else if (activity instanceof BPELStructured)
			C = ((BPELStructured) activity).ComplexityOfActivity();

		return C;
	}

	@Override
	public int NumberOfEdges() {
		// TODO Auto-generated method stub
		BPELActivity activity = getActivity();
		int number = 2;
		if (activity instanceof BPELPrimitive)
			number = number + ((BPELPrimitive) activity).NumberOfEdges();
		else if (activity instanceof BPELStructured)
			number = number + ((BPELStructured) activity).NumberOfEdges();
		return number;
	}

	@Override
	public int NumberOfNodes() {
		// TODO Auto-generated method stub
		return 0;
	}
}
