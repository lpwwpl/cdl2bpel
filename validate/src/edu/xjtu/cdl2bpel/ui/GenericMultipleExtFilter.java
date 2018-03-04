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
 * Title: GenericMultipleExtFilter.java
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
public class GenericMultipleExtFilter extends
		javax.swing.filechooser.FileFilter {

	private String description;
	private String[] ext;

	public GenericMultipleExtFilter(String[] ext, String description) {
		this.ext = new String[ext.length];
		for (int i = 0; i < ext.length; i++) {
			if (ext[i].length() > 0 && ext[i].charAt(0) != '.') {
				ext[i] = "." + ext[i];
			}
			this.ext[i] = ext[i].toLowerCase();
		}
		this.description = description;
	}

	public boolean accept(File f) {
		if (f.isDirectory()) {
			return true;
		}
		String name = f.getName().toLowerCase();
		for (int i = 0; i < ext.length; i++) {
			if (name.endsWith(ext[i])) {
				return true;
			}
		}
		return false;
	}

	public String getDescription() {
		return description;
	}
}
