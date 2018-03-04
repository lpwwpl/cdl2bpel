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
 * Title: BPELWait
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
public class BPELWait extends BPELPrimitive {

	public BPELWait(Element element) {
		super(element);
	}

	public BPELWait(String name) {
		super(BPELConstants.stringWait, name);
	}

	public BPELWait cloneActivity() {
		BPELWait clone = new BPELWait(element
				.getAttribute(BPELConstants.stringName));
		clone.cloneLinks(this);
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}
}
