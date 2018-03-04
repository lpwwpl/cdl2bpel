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
import java.beans.PropertyVetoException;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import edu.xjtu.cdl2bpel.ui.ConversionUI;
import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.Message;
import edu.xjtu.cdl2bpel.ui.UISettings;
import edu.xjtu.cdl2bpel.ui.Utils;

/**
 * <p>
 * Title: ConvertAction.java
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
public class ConvertAction extends CatchOutOfMemoryAction {

	public static Icon getIcon() {
		String customIconPath = UISettings.getInstance()
				.getPreferredIconTheme()
				+ "/toolbar_convert.png";
		if ((new File(customIconPath).exists())) {
			return new ImageIcon(customIconPath);
		} else {
			return Utils.getStandardIcon("general/Refresh24");
		}
	}

	public ConvertAction(MDIDesktopPane desktop) {
		super("More conversions...", ConvertAction.getIcon(), desktop);
		putValue(SHORT_DESCRIPTION, "Open conversion frame");
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));
	}

	public void execute(ActionEvent e) {
		ConversionUI frame = new ConversionUI(desktop);

		frame.setVisible(true);
		desktop.add(frame);
		try {
			frame.setSelected(true);
		} catch (PropertyVetoException ex) {
		}
	}

	public void handleOutOfMem() {
		Message.add("Out of memory while converting");
	}
}
