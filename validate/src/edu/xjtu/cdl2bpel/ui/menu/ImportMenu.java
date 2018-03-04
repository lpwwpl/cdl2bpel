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
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import edu.xjtu.cdl2bpel.action.CatchOutOfMemoryAction;
import edu.xjtu.cdl2bpel.action.ImportAnyFileAction;
import edu.xjtu.cdl2bpel.action.ImportFileAction;
import edu.xjtu.cdl2bpel.plugin.ImportPlugin;
import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: ImportMenu.java
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
public class ImportMenu extends JMenu {

	private MDIDesktopPane desktop;
	private ExitAction exitAction;
	protected ImportAnyFileAction anyFileAction;

	public ImportMenu(MDIDesktopPane desktop) {
		super("File");
		exitAction = new ExitAction(desktop);

		anyFileAction = new ImportAnyFileAction(desktop, !RuntimeUtils
				.isRunningMacOsX());
		this.desktop = desktop;
		this.desktop = desktop;
		addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}

			public void menuDeselected(MenuEvent e) {
				removeAll();
			}

			public void menuSelected(MenuEvent e) {
				buildChildMenus();
			}
		});
	}

	private void buildChildMenus() {
		ImportPluginCollection collection = ImportPluginCollection
				.getInstance();
		ProvidedObject[] objs = MainUI.getInstance().getProvidedObjects();
		for (int j = 0; j < objs.length; j++) {
			for (int k = 0; k < objs[j].getObjects().length; k++) {
				Object o = objs[j].getObjects()[k];

			}
		}

		removeAll();
		add(anyFileAction);
		addSeparator();

		for (int i = 0; i < collection.size(); i++) {
			ImportPlugin algorithm = (ImportPlugin) collection.get(i);
			JMenu subMenu = new JMenu("Open " + algorithm.getName());
			subMenu.add(new ImportFileAction(algorithm, desktop));

			add(subMenu);
		}
		addSeparator();
		addSeparator();

		add(exitAction);

		setEnabled(true);

	}
}

class ExitAction extends CatchOutOfMemoryAction {
	public ExitAction(MDIDesktopPane desktop) {
		super("Exit", desktop);
		putValue(SHORT_DESCRIPTION, "Exit the program");
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_X));
	}

	public void execute(ActionEvent e) {
		MainUI.getInstance().quit();
	}

	public void handleOutOfMem() {

	}
}
