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
 * Title: BPELSequence
 * </p>
 * 
 * <p>
 * Description: CLass for a BPEL sequence activity.
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
 * @version 1.5
 */
public class BPELSequence extends BPELStructured {

	public BPELSequence(Element element) {
		super(element);
	}

	public BPELSequence(String name) {
		super(BPELConstants.stringSequence, name);
	}

	public BPELSequence cloneActivity() {
		BPELSequence clone = new BPELSequence(element
				.getAttribute(BPELConstants.stringName));
		for (BPELActivity activity : getActivities()) {
			clone.appendChildActivity(activity.cloneActivity());
		}
		clone.cloneLinks(this);
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}

	public void buildModelGraph(BPEL model) {
		/*
		 * ModelGraphVertex dummy = new ModelGraphVertex(model);
		 * model.addDummy(dummy); dummy.setDotAttribute("shape", "circle");
		 * dummy.setDotAttribute("label", "Start"); for (BPELActivity activity :
		 * getActivities()) { activity.vertex = new ModelGraphVertex(model);
		 * model.addVertex(activity.vertex); if (activity instanceof BPELInvoke)
		 * { activity.SetActivityAttributesInvoke(); } else
		 * activity.SetActivityAttributes();
		 * 
		 * ModelGraphEdge edge = new ModelGraphEdge(dummy, activity.vertex);
		 * model.addDummy(edge);
		 * 
		 * dummy = new ModelGraphVertex(model); model.addDummy(dummy);
		 * dummy.setDotAttribute("shape", "circle");
		 * dummy.setDotAttribute("label", "");
		 * 
		 * edge = new ModelGraphEdge(activity.vertex, dummy);
		 * model.addDummy(edge); } addLinksToModelGraph(model, new
		 * HashSet<BPELActivity>(getActivities()));
		 */
		ModelGraphVertex pin = new ModelGraphVertex(model);
		model.addDummy(pin);
		pin.setDotAttribute("shape", "circle");
		pin.setDotAttribute("label", "Start");
		ModelGraphVertex pout = new ModelGraphVertex(model);
		model.addDummy(pout);
		pout.setDotAttribute("shape", "circle");
		pout.setDotAttribute("label", "Exit");
		ArrayList<BPELActivity> activityList = getActivities();
		activityList.size();
		BPELActivity activity = activityList.get(0);
		activity.vertex = new ModelGraphVertex(model);
		activity.SetActivityAttributes();
		model.addVertex(activity.vertex);
		ModelGraphEdge edge = new ModelGraphEdge(pin, activity.vertex);
		model.addDummy(edge);
		for (int i = 1; i < activityList.size() - 1; i++) {
			activity = activityList.get(i);
			activity.vertex = new ModelGraphVertex(model);
			model.addVertex(activity.vertex);

			activity.SetActivityAttributes();

			edge = new ModelGraphEdge(activityList.get(i - 1).vertex,
					activity.vertex);
			model.addDummy(edge);
		}
		activity = activityList.get(activityList.size() - 1);
		activity.vertex = new ModelGraphVertex(model);
		activity.SetActivityAttributes();
		model.addVertex(activity.vertex);
		// edge = new
		// ModelGraphEdge(activityList.get(activityList.size()-2).vertex,
		// activityList.get(activityList.size()-1).vertex);
		// model.addDummy(edge);
		edge = new ModelGraphEdge(
				activityList.get(activityList.size() - 2).vertex,
				activity.vertex);
		model.addDummy(edge);
		edge = new ModelGraphEdge(activity.vertex, pout);
		model.addDummy(edge);
		addLinksToModelGraph(model, new HashSet<BPELActivity>(getActivities()));
	}

	@Override
	public double ComplexityOfActivity() {
		// TODO Auto-generated method stub

		double C = 0;

		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive)
				C = C + ((BPELPrimitive) activity).ComplexityOfActivity();
			else if (activity instanceof BPELStructured)
				C = C + ((BPELStructured) activity).ComplexityOfActivity();

		}
		return C;
	}

	@Override
	public int NumberOfEdges() {
		// TODO Auto-generated method stub
		int number = getActivities().size() + 1;

		for (BPELActivity activity : getActivities()) {
			if (activity instanceof BPELPrimitive)
				number = number + ((BPELPrimitive) activity).NumberOfEdges();
			else if (activity instanceof BPELStructured)
				number = number + ((BPELStructured) activity).NumberOfEdges();

		}
		return number;
	}

	@Override
	public int NumberOfNodes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
