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

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>
 * Title: ModelGraphCluster
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
public class ModelGraphCluster {
	private String label;
	private HashMap<String, String> attributes;
	private ArrayList<ModelGraphVertex> cluster;

	public ModelGraphCluster(String label) {
		this.label = new String(label);
		clearCluster();
	}

	public void clearCluster() {
		attributes = new HashMap<String, String>();
		attributes.put("style", "filled");
		attributes.put("fontName", "Arial");
		attributes.put("fillcolor", "lightskyblue1");
		attributes.put("label", "");
		cluster = new ArrayList<ModelGraphVertex>();
	}

	public void clearDotAttribute(String attribute) {
		attributes.remove(attribute);
	}

	public void setDotAttribute(String attribute, String value) {
		attributes.put(attribute, value);
	}

	public HashMap<String, String> getAttributes() {
		return attributes;
	}

	public ArrayList<ModelGraphVertex> getVertices() {
		return cluster;
	}

	public String getLabel() {
		return label;
	}

	public boolean addVertex(ModelGraphVertex vertex) {
		if (cluster.contains(vertex)) {
			return false;
		}
		cluster.add(vertex);
		return true;
	}
}
