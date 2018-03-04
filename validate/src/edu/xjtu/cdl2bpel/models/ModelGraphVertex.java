/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                http://www.selab.edu.vn                  *
 *                                                         *
 **********************************************************/

package edu.xjtu.cdl2bpel.models;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

import att.grappa.Node;
import java.util.HashMap;

import org.jfree.chart.title.Title;

/**
 * <p>
 * Title: ModelGraphVertex
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
public class ModelGraphVertex extends Node {

	public Object object2;

	public Node visualObject;

	protected double value = 0.0;

	protected String identifier = "";

	private HashMap<String, String> attributes;

	public ModelGraphVertex(ModelGraph g) {
		super(g);
		clearDotAttributes();
	}

	public ModelGraphVertex(ModelGraphVertex v) {
		super(v.getSubgraph());
		value = v.value;
		object = v.object;
		identifier = v.identifier;
		clearDotAttributes();
	}

	public ModelGraphVertex(Object o, ModelGraph g) {
		super(g);
		object = o;
		clearDotAttributes();
	}

	public void clearDotAttributes() {
		attributes = new HashMap<String, String>();
	}

	public void clearDotAttribute(String attribute) {
		attributes.remove(attribute);
	}

	public void setDotAttribute(String attribute, String value) {
		attributes.put(attribute, value);
	}

	public String getDotAttribute(String attribute) {
		return attributes.get(attribute);
	}

	public String getDotAttributes() {
		String result = "";
		String prefix = "";

		for (String attribute : attributes.keySet()) {
			result += prefix + attribute + "=\""
					+ attributes.get(attribute).replaceAll("\"", "\\\\\"")
					+ "\"";
			prefix = ",";
		}
		if (result == "") {
			result = "label=\"" + getIdentifier() + "\"";
		}
		return result;
	}

	public Iterator getOutEdgesIterator() {
		return new EnumToIterator(outEdgeElements());
	}

	public Iterator getInEdgesIterator() {
		return new EnumToIterator(inEdgeElements());
	}

	public HashSet getSuccessors() {
		HashSet a = new HashSet();
		Enumeration e = outEdgeElements();
		while (e.hasMoreElements()) {
			a.add(((ModelGraphEdge) e.nextElement()).getDest());
		}
		return a;
	}

	public HashSet getPredecessors() {
		HashSet a = new HashSet();
		Enumeration e = inEdgeElements();
		while (e.hasMoreElements()) {
			a.add(((ModelGraphEdge) e.nextElement()).getSource());
		}
		return a;
	}

	public HashSet getNeighbors() {
		HashSet s = getPredecessors();
		s.addAll(getSuccessors());
		return s;
	}

	public ArrayList getIncidentEdges() {
		ArrayList a = new ArrayList();
		Enumeration e = edgeElements();
		while (e.hasMoreElements()) {
			a.add(e.nextElement());
		}
		return a;
	}

	public void setIdentifier(String s) {
		identifier = s;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String toString() {
		return getIdentifier();
	}

	public void setValue(double v) {
		value = v;
	}

	public double getValue() {
		return value;
	}

	public boolean equals(Object o) {
		ModelGraphVertex vertex;

		if (o == null || !(o instanceof ModelGraphVertex)) {
			return false;
		}
		vertex = (ModelGraphVertex) o;
		return this == vertex;
		/*
		 * return (identifier == null ? (vertex.identifier == null) && (this ==
		 * vertex) : identifier.equals(vertex.identifier)) && value ==
		 * vertex.value && (object == null ? vertex.object == null :
		 * object.equals(vertex.object)) && (identifier.equals("") ?
		 * (vertex.identifier.equals("")) && (this == vertex) :
		 * identifier.equals(vertex.identifier));
		 */
	}

	// rmans, added 31-05-2006

	/**
	 * Returns the successors of this vertex that are not also a predecessor of
	 * this vertex
	 * 
	 * @return HashSet
	 */
	public HashSet<ModelGraphVertex> getVerticesOnlySuccessor() {
		HashSet<ModelGraphVertex> a = new HashSet<ModelGraphVertex>();
		a.addAll(getSuccessors());
		a.removeAll(getVerticesPredecessorAndSuccessor());
		return a;
	}

	/**
	 * Returns the predecessors of this vertex that are not also a successor of
	 * this vertex
	 * 
	 * @return HashSet
	 */
	public HashSet<ModelGraphVertex> getVerticesOnlyPredecessor() {
		HashSet<ModelGraphVertex> a = new HashSet<ModelGraphVertex>();
		a.addAll(getPredecessors());
		a.removeAll(getVerticesPredecessorAndSuccessor());
		return a;
	}

	/**
	 * Returns the vertices of this vertex that are as well a predecessor AND a
	 * successor of this vertex.
	 * 
	 * @return HashSet
	 */
	public HashSet<ModelGraphVertex> getVerticesPredecessorAndSuccessor() {
		HashSet<ModelGraphVertex> a = new HashSet<ModelGraphVertex>();
		a.addAll(getSuccessors());
		a.retainAll(getPredecessors());
		return a;
	}

}
