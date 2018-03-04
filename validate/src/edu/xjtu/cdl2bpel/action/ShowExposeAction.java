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
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.UISettings;
import edu.xjtu.cdl2bpel.ui.Utils;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: ShowExposeAction.java
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
public class ShowExposeAction extends CatchOutOfMemoryAction {

	public static Icon getIcon() {
		String customIconPath = UISettings.getInstance()
				.getPreferredIconTheme()
				+ "/toolbar_expose.png";
		if ((new File(customIconPath).exists())) {
			return new ImageIcon(customIconPath);
		} else {
			return Utils.getStandardIcon("general/Open24");
		}
	}

	public ShowExposeAction(MDIDesktopPane desktop, String label) {
		super(label, desktop);
		putValue(SHORT_DESCRIPTION, "Expos\u00E9 (fast window switching)  "
				+ getShortcut());
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_E));
	}

	public ShowExposeAction(MDIDesktopPane desktop) {
		super("Expos\u00E9", ShowExposeAction.getIcon(), desktop);
		putValue(SHORT_DESCRIPTION, "Expos\u00E9 (fast window switching)  "
				+ getShortcut());
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_E));
	}

	public String getShortcut() {
		// get shortcut according to platform
		String shortCut = null;
		if (RuntimeUtils.isRunningMacOsX() == true) {
			shortCut = "Command-E";
		} else {
			shortCut = "Ctrl+E";
		}
		return shortCut;
	}

	@Override
	protected void execute(ActionEvent e) {
		if (MainUI.getInstance().getDesktop().getAllFrames().length > 1) {
			MainUI.getInstance().showExpose();
		} else {
			MainUI
					.getInstance()
					.showGlassDialog(
							"Expos\u00E9 not applicable",
							"The Expos\u00E9 feature has the purpose of helping you switch between a number of "
									+ "internal windows rapidly. You need to have more than one internal window "
									+ "open to make use of this functionality.");
		}
	}

	@Override
	protected void handleOutOfMem() {
		// TODO Auto-generated method stub

	}

}
