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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class OutputStreamWithFilename extends FileOutputStream {

	private String filename;

	public OutputStreamWithFilename(String name) throws FileNotFoundException {
		super(name);
		this.filename = name;
	}

	public String getFilename() {
		return filename;
	}
}
