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

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.models.BPELVisitor;
import edu.xjtu.cdl2bpel.models.ModelGraph;
import edu.xjtu.cdl2bpel.models.ModelGraphVertex;

/**
 * <p>
 * Title: BPELEvent
 * </p>
 * <p>
 * Description:Superclass for the BPEL event activities (invoke, receive,
 * reply).
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
public abstract class BPELEvent extends BPELPrimitive {

	/*
	 * These activites could be linked to a log event.
	 */

	private ModelGraphVertex vertex;

	public BPELEvent(Element element) {
		super(element);
	}

	public BPELEvent(String tagName, String name) {
		super(tagName, name);
	}

	public ModelGraphVertex getVertex() {
		return vertex;
	}

	public void setVertex(ModelGraphVertex vertex) {
		this.vertex = vertex;
	}

	public void newVertex(ModelGraph graph) {
		vertex = new ModelGraphVertex(graph);
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}
}
