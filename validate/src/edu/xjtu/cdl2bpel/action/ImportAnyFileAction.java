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

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import edu.xjtu.cdl2bpel.plugin.ImportPlugin;
import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.plugin.Plugin;
import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.MiningResult;
import edu.xjtu.cdl2bpel.ui.UISettings;
import edu.xjtu.cdl2bpel.ui.Utils;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: ImportAnyFileAction.java
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
public class ImportAnyFileAction extends CatchOutOfMemoryAction {

	protected boolean useJFileChooser = false;

	public static Icon getIcon() {
		String customIconPath = UISettings.getInstance()
				.getPreferredIconTheme()
				+ "/toolbar_open.png";
		if ((new File(customIconPath).exists())) {
			return new ImageIcon(customIconPath);
		} else {
			return Utils.getStandardIcon("general/Open24");
		}
	}

	public ImportAnyFileAction(MDIDesktopPane desktop, boolean useJFileChooser) {
		super("Open supported file...", ImportAnyFileAction.getIcon(), desktop);
		this.useJFileChooser = useJFileChooser;
		putValue(SHORT_DESCRIPTION,
				"Open any type of file supported by SOAFramework...  "
						+ getShortcut());
		putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_O));
	}

	public String getShortcut() {
		// get shortcut according to platform
		String shortCut = null;
		if (RuntimeUtils.isRunningMacOsX() == true) {
			shortCut = "Command-O";
		} else {
			shortCut = "Ctrl+O";
		}
		return shortCut;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.processmining.framework.ui.actions.CatchOutOfMemoryAction#execute
	 * (java.awt.event.ActionEvent)
	 */
	@Override
	protected void execute(ActionEvent e) {
		if (this.useJFileChooser == true) {
			executeWithJFileChooser();
		} else {
			executeWithAWTFileChooser();
		}
	}

	protected void executeWithAWTFileChooser() {
		FileDialog dialog = new FileDialog(MainUI.getInstance(),
				"Open file...", FileDialog.LOAD);
		dialog.setFilenameFilter(new ImportAnyFilenameFilter());
		dialog.setDirectory((new File(UISettings.getInstance()
				.getLastOpenedImportFile())).getParent());
		dialog.setFile((new File(UISettings.getInstance()
				.getLastOpenedImportFile())).getName());
		dialog.setVisible(true);
		if (dialog.getFile() != null) {
			File file = new File(dialog.getDirectory() + File.separator
					+ dialog.getFile());
			handleOpeningFile(file);
		}
	}

	protected void executeWithJFileChooser() {
		JFileChooser dialog = new JFileChooser(new File(UISettings
				.getInstance().getLastOpenedImportFile()));
		dialog.setFileFilter(new ImportAnyFilenameFilter());
		dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
		dialog.setMultiSelectionEnabled(true);
		int returnVal = dialog.showOpenDialog(MainUI.getInstance());
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			for (File file : dialog.getSelectedFiles()) {
				UISettings.getInstance().setLastOpenedImportFile(
						file.getAbsolutePath());
				List<ImportPlugin> plugins = getCompatiblePlugins(file);
				ImportPlugin plugin = plugins.get(0);
				if (plugins.size() > 1) {
					// multiple plugins can handle this file; let the user pick
					String[] pluginNames = new String[plugins.size()];
					for (int i = 0; i < pluginNames.length; i++) {
						pluginNames[i] = plugins.get(i).getName();
					}
					String picked = (String) JOptionPane.showInputDialog(MainUI
							.getInstance(), "The file " + file.getName()
							+ " can be \n"
							+ "loaded by a number of different import \n"
							+ "plugins.\n"
							+ "Please choose the appropriate import plugin:",
							"Please choose type of file...",
							JOptionPane.QUESTION_MESSAGE, null, pluginNames,
							pluginNames[0]);
					for (ImportPlugin plg : plugins) {
						if (plg.getName().equals(picked)) {
							plugin = plg;
							break;
						}
					}
				}

				UISettings.getInstance().addRecentFile(file.getAbsolutePath(),
						plugin.getName());
				MainUI.getInstance().importFromFile(plugin,
						file.getAbsolutePath());
			}
		}
	}

	protected void handleOpeningFile(File file) {
		UISettings.getInstance()
				.setLastOpenedImportFile(file.getAbsolutePath());
		List<ImportPlugin> plugins = getCompatiblePlugins(file);
		ImportPlugin plugin = plugins.get(0);
		if (plugins.size() > 1) {
			// multiple plugins can handle this file; let the user pick
			String[] pluginNames = new String[plugins.size()];
			for (int i = 0; i < pluginNames.length; i++) {
				pluginNames[i] = plugins.get(i).getName();
			}
			String picked = (String) JOptionPane.showInputDialog(MainUI
					.getInstance(),
					"The file you have chosen can be loaded by a\n"
							+ "number of different import plugins.\n"
							+ "Please choose the appropriate import plugin:",
					"Please choose type of file...",
					JOptionPane.QUESTION_MESSAGE, null, pluginNames,
					pluginNames[0]);
			for (ImportPlugin plg : plugins) {
				if (plg.getName().equals(picked)) {
					plugin = plg;
					break;
				}
			}
		}

		UISettings.getInstance().addRecentFile(file.getAbsolutePath(),
				plugin.getName());
		MainUI.getInstance().importFromFile(plugin, file.getAbsolutePath());

	}

	protected List<ImportPlugin> getCompatiblePlugins(File file) {
		ArrayList<ImportPlugin> plugins = new ArrayList<ImportPlugin>();

		ImportPluginCollection importPlugins = ImportPluginCollection
				.getInstance();
		for (Plugin plugin : importPlugins.getPlugins()) {
			ImportPlugin importPlugin = (ImportPlugin) plugin;
			if (importPlugin.getFileFilter().accept(file)) {
				plugins.add(importPlugin);
			}
		}
		return plugins;
	}

	@Override
	protected void handleOutOfMem() {
		// ignore this one for now
	}

	public MiningResult importFile(InputStream input) throws IOException {
		// ignore
		return null;
	}

	public String getHtmlDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
