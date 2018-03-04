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
 * Title: BPELInvoke
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
public class BPELInvoke extends BPELEvent {

	public BPELInvoke(Element element) {
		super(element);
	}

	public BPELInvoke(String name) {
		super(BPELConstants.stringInvoke, name);
	}

	public BPELInvoke cloneActivity() {
		BPELInvoke clone = new BPELInvoke(element
				.getAttribute(BPELConstants.stringName));
		clone.cloneLinks(this);
		return clone;
	}

	public void acceptVisitor(BPELVisitor visitor) {
		visitor.visit(this);
	}

}
