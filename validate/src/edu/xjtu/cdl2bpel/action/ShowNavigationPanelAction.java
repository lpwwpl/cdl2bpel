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
import java.awt.event.KeyEvent;

import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.Utils;

/**
 * <p>
 * Title: ShowNavigationPanelAction.java
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
public class ShowNavigationPanelAction extends CatchOutOfMemoryAction {

	private static final long serialVersionUID = 8243503602805411509L;

	public ShowNavigationPanelAction(MDIDesktopPane desktop) {
		super("Toggle navigation panel...", Utils.getStandardIcon(
				"toolbar_navigation.png", "general/History24"), desktop);
		putValue(SHORT_DESCRIPTION,
				"Show or hide the navigation panel on the right side");
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_N));
	}

	@Override
	protected void execute(ActionEvent e) {
		MainUI.getInstance().toggleNavigationPanelVisible();
	}

	@Override
	protected void handleOutOfMem() {
	}
}
