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

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import edu.xjtu.cdl2bpel.action.ConvertAction;
import edu.xjtu.cdl2bpel.action.ConvertInternalAction;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.TransformingPlugin;
import edu.xjtu.cdl2bpel.ui.TransformingPluginCollection;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: ConversionMenu.java
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
public class ConversionMenu extends JMenu {

	private static final long serialVersionUID = -3949536262533489010L;

	private boolean onlyContext;
	private MDIDesktopPane desktop;
	private JMenuItem none = new JMenuItem(
			RuntimeUtils
					.stripHtmlForOsx("<html><font color=\"#999999\">No converters available<br>for selected frame</font></html>"));
	private JMenuItem noneshort = new JMenuItem(
			RuntimeUtils
					.stripHtmlForOsx("<html><font color=\"#999999\">No converter available</font></html>"));

	public ConversionMenu(MDIDesktopPane desktop) {
		this(desktop, true);
	}

	public ConversionMenu(final ProvidedObject[] pos) {
		this.onlyContext = true;

		setText("Transform");
		addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}

			public void menuDeselected(MenuEvent e) {
				removeAll();
			}

			public void menuSelected(MenuEvent e) {
				buildChildMenus(pos, noneshort);
			}
		});
		noneshort.setEnabled(false);
		none.setEnabled(false);
	}

	public ConversionMenu(MDIDesktopPane desktop, boolean all) {
		this.onlyContext = !all;
		this.desktop = desktop;
		setText("Transform");
		addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}

			public void menuDeselected(MenuEvent e) {
				removeAll();
			}

			public void menuSelected(MenuEvent e) {
				buildChildMenus(MainUI.getInstance().getProvidedObjects(), none);
			}
		});
		none.setEnabled(false);
	}

	private void buildChildMenus(ProvidedObject[] objects, JMenuItem noneItem) {
		TransformingPluginCollection collection = TransformingPluginCollection
				.getInstance();
		boolean addToSelf = onlyContext && objects.length == 1;

		for (int j = 0; j < objects.length; j++) {
			if (objects[j] != null) {
				JMenu poMenu = addToSelf ? this : new JMenu(objects[j]
						.getName());

				buildSubMenus(poMenu, collection, objects[j]);

				if (!addToSelf && poMenu.getItemCount() > 0) {
					add(poMenu);
				}
			}
		}
		if (getItemCount() == 0) {
			add(noneItem);
		}
		if (!onlyContext) {
			addSeparator();
			add(new ConvertAction(desktop));
		}
	}

	private void buildSubMenus(JMenu superMenu,
			TransformingPluginCollection collection, ProvidedObject po) {
		for (int i = 0; i < collection.size(); i++) {
			TransformingPlugin algorithm = (TransformingPlugin) collection
					.get(i);

			if (algorithm.accepts(po)) {
				superMenu.add(new JMenuItem(new ConvertInternalAction(
						algorithm, po)));
			}
		}
	}
}
