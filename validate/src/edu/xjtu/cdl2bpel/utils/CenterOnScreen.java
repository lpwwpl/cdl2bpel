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

package edu.xjtu.cdl2bpel.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import edu.xjtu.cdl2bpel.ui.MainUI;

/**
 * <p>
 * Title: CenterOnScreen.java
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
public class CenterOnScreen {

	public static int width() {
		return (int) (0.8 * Toolkit.getDefaultToolkit().getScreenSize().width);
	}

	public static int height() {
		return (int) (0.8 * Toolkit.getDefaultToolkit().getScreenSize().height);
	}

	public static void center(Window frame) {
		int w = frame.getPreferredSize().width;
		int h = frame.getPreferredSize().height;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		frame.setSize(Math.min(w, width()) + frame.getInsets().left
				+ frame.getInsets().right + 20, Math.min(h, height())
				+ frame.getInsets().top + frame.getInsets().bottom + 20);

		frame.setLocation(Math.max(0,
				(screenSize.width - frame.getSize().width) / 2), Math.max(0,
				(screenSize.height - frame.getSize().height) / 2));
		frame.validate();
	}

	public static void centerOnMainUI(Window frame) {
		int width = MainUI.getInstance().getWidth();
		int height = MainUI.getInstance().getHeight();
		frame.setLocation(Math.max(0, (width - frame.getSize().width) / 2),
				Math.max(0, (height - frame.getSize().height) / 2));
		frame.validate();
	}
}
