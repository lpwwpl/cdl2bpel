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

import java.io.File;
import java.io.FilenameFilter;

import javax.swing.filechooser.FileFilter;

import edu.xjtu.cdl2bpel.plugin.ImportPlugin;
import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.plugin.Plugin;

/**
 * <p>
 * Title: ImportAnyFilenameFilter.java
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
public class ImportAnyFilenameFilter extends FileFilter implements
		FilenameFilter {

	protected ImportPluginCollection importPlugins;

	public ImportAnyFilenameFilter() {
		importPlugins = ImportPluginCollection.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
	 */
	public boolean accept(File dir, String name) {
		File file = new File(dir, name);

		for (Plugin plugin : importPlugins.getPlugins()) {
			ImportPlugin importPlugin = (ImportPlugin) plugin;
			if (importPlugin.getFileFilter().accept(file)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
	 */
	@Override
	public boolean accept(File f) {
		return accept(f.getParentFile(), f.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.filechooser.FileFilter#getDescription()
	 */
	@Override
	public String getDescription() {
		return "Files supported by BKSOA Framework";
	}

}
