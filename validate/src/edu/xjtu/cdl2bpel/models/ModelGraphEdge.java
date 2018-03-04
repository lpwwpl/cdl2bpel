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

package edu.xjtu.cdl2bpel.models;

import att.grappa.Edge;
import java.util.HashMap;

/**
 * <p>
 * Title: ModelGraphEdge
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
public class ModelGraphEdge extends Edge {

	public Object object2;
	public Edge visualObject;

	protected double value;

	protected String style;

	private HashMap<String, String> attributes;

	public ModelGraphEdge(ModelGraphVertex source,
			ModelGraphVertex destination, String style, float value) {
		super(source.getSubgraph(), source, destination);
		this.value = value;
		this.style = style;
		object = null;
		clearDotAttributes();
	}

	public ModelGraphEdge(ModelGraphVertex source, ModelGraphVertex destination) {
		this(source, destination, "", 0);
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
			result = "label=\"\"";
		}
		return result;
	}

	public void setValue(double v) {
		value = v;
	}

	public double getValue() {
		return value;
	}

	public String getStyle() {
		return style;
	}

	public ModelGraphVertex getSource() {
		return (ModelGraphVertex) getTail();
	}

	public ModelGraphVertex getDest() {
		return (ModelGraphVertex) getHead();
	}
}
