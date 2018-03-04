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

package edu.xjtu.cdl2bpel.ui;

import java.awt.Component;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 * <p>
 * Title: Utils
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
public class Utils {
	private Utils() {
	}

	public static Icon getStandardIcon(String filename,
			String defaultJavaIconName) {
		String customIconPath = UISettings.getInstance()
				.getPreferredIconTheme()
				+ "/" + filename;
		String defaultIconPath = UISettings.getInstance().getDefaultIconPath()
				+ "/" + filename;

		if ((new File(customIconPath).exists())) {
			return new ImageIcon(customIconPath);
		} else if ((new File(defaultIconPath).exists())) {
			return new ImageIcon(defaultIconPath);
		} else {
			return getStandardIcon(defaultJavaIconName);
		}
	}

	public static synchronized Icon getStandardIcon(String name) {
		String imgLocation = "toolbarButtonGraphics/" + name + ".gif";
		java.net.URL imageURL = Thread.currentThread().getContextClassLoader()
				.getResource(imgLocation);

		if (imageURL == null) {
			Message.add("Resource not found: " + imgLocation, Message.ERROR);
			return null;
		} else {
			return new ImageIcon(imageURL);
		}
	}

	public static synchronized String openImportFileDialog(Component parent,
			javax.swing.filechooser.FileFilter filter) {
		JFileChooser chooser = new JFileChooser(UISettings.getInstance()
				.getLastOpenedImportFile());

		chooser.setFileFilter(filter);
		if (chooser.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
			return filter instanceof GenericFileFilter ? ((GenericFileFilter) filter)
					.addExtension(chooser.getSelectedFile().getPath())
					: chooser.getSelectedFile().getPath();
		}
		return "";
	}

	public static synchronized String saveFileDialog(Component parent,
			javax.swing.filechooser.FileFilter filter) {
		JFileChooser chooser = new JFileChooser(UISettings.getInstance()
				.getLastExportLocation());

		chooser.setFileFilter(filter);
		if (chooser.showSaveDialog(parent) == JFileChooser.APPROVE_OPTION) {
			UISettings.getInstance().setLastExportLocation(
					chooser.getCurrentDirectory());
			return filter instanceof GenericFileFilter ? ((GenericFileFilter) filter)
					.addExtension(chooser.getSelectedFile().getPath())
					: chooser.getSelectedFile().getPath();
		}
		return "";
	}

	public static synchronized String getTempPath() {
		String path = System.getProperty("java.io.tmpdir", "");
		String sep = System.getProperty("file.separator", "\\");

		return path.endsWith(sep) ? path : path + sep;
	}
}
