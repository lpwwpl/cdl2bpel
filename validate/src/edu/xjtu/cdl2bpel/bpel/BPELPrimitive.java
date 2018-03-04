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

/**
 * <p>
 * Title: BPELPrimitive
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
public abstract class BPELPrimitive extends BPELActivity implements
		IComplexityOfActivity, INumberOfEdges, INumberOfNodes {

	public BPELPrimitive(Element element) {
		super(element);
		// TODO Auto-generated constructor stub
	}

	public BPELPrimitive(String tagName, String name) {
		super(tagName, name);
		// TODO Auto-generated constructor stub
	}

	public double ComplexityOfActivity() {
		// TODO Auto-generated method stub
		return 1;
	}

	public int NumberOfEdges() {
		return 0;
	}

	public int NumberOfNodes() {
		return 1;
	}

	public void SetActivityAttributes() {
		super.SetActivityAttributes();
		vertex.setDotAttribute("label", element.getTagName() + ": "
				+ getName(false) + ", Partnerlink: " + getPartnerLink());
	}

}
