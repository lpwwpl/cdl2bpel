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

/**
 * <p>
 * Title: BPELEmpty
 * </p>
 * <p>
 * Description: Class for the BPEL empty activity.
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
public class BPELEmpty extends BPELPrimitive {

	public BPELEmpty(Element element) {
		super(element);
	}

	public BPELEmpty(String name) {
		super(BPELConstants.stringEmpty, name);
	}

	public BPELEmpty cloneActivity() {
		BPELEmpty clone = new BPELEmpty(element
				.getAttribute(BPELConstants.stringName));
		clone.cloneLinks(this);
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}
}
