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

import java.io.File;

/**
 * <p>
 * Title: GenericFileFilter.java
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
public class GenericFileFilter extends javax.swing.filechooser.FileFilter {

	private String description;
	private String ext;

	public GenericFileFilter(String ext) {
		if (ext.length() > 0 && ext.charAt(0) != '.') {
			ext = "." + ext;
		}
		this.ext = ext.toLowerCase();
		description = ext.toUpperCase().substring(1) + " files (*."
				+ ext.substring(1) + ")";
	}

	public GenericFileFilter(String ext, String description) {
		if (ext.length() > 0 && ext.charAt(0) != '.') {
			ext = "." + ext;
		}
		this.ext = ext.toLowerCase();
		this.description = description;
	}

	public String addExtension(String name) {
		int i = name.lastIndexOf('.');

		return i >= 0 && name.substring(i).toLowerCase().equals(ext) ? name
				: name + ext;
	}

	public boolean accept(File f) {
		String name = f.getName();
		int i = name.lastIndexOf('.');

		return f.isDirectory()
				|| (i >= 0 && name.substring(i).toLowerCase().equals(ext));
	}

	public String getDescription() {
		return description;
	}
}
