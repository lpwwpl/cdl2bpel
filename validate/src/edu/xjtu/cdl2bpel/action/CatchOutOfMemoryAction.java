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

package edu.xjtu.cdl2bpel.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;

/**
 * <p>
 * Title: CatchOutOfMemoryAction.java
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
public abstract class CatchOutOfMemoryAction extends AbstractAction {
	protected MDIDesktopPane desktop;

	public CatchOutOfMemoryAction(String s, MDIDesktopPane desktop) {
		super(s);
		this.desktop = desktop;
	}

	public CatchOutOfMemoryAction(String s, Icon i, MDIDesktopPane desktop) {
		super(s, i);
		this.desktop = desktop;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			execute(e);
		} catch (OutOfMemoryError err) {
			handleOutOfMem();
		}
	}

	protected abstract void execute(ActionEvent e);

	protected abstract void handleOutOfMem();

}
