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

package edu.xjtu.cdl2bpel.ui.menu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import edu.xjtu.cdl2bpel.plugin.Plugin;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: HelpMenu.java
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
public class HelpMenu extends JMenu {

	private JMenuItem noneshort = new JMenuItem(
			RuntimeUtils
					.stripHtmlForOsx("<html><font color=\"#999999\">No help available</font></html>"));

	public HelpMenu() {
		super("Plugin help");

		addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}

			public void menuDeselected(MenuEvent e) {
				removeAll();
			}

			public void menuSelected(MenuEvent e) {
				buildChildMenus(MainUI.getInstance().getDesktop()
						.getPluginSelectedFrame(), noneshort);
			}
		});
		noneshort.setEnabled(false);
	}

	private void buildChildMenus(Plugin plugin, JMenuItem noneFound) {
		if (plugin != null) {
			add(new JMenuItem(new HelpAction(plugin)));
		}
		// iterate the provided objects
		if (getItemCount() == 0) {
			add(noneFound);
		}
	}

	class HelpAction extends AbstractAction {

		private Plugin plugin;

		public HelpAction(Plugin plugin) {
			super(RuntimeUtils.stripHtmlForOsx("<html>" + plugin.getName()
					+ "</html>"));
			this.plugin = plugin;
		}

		public void actionPerformed(ActionEvent e) {
			MainUI.getInstance().showReference(plugin);
		}
	}

}
