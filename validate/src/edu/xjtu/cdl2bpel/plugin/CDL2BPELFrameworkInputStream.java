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

package edu.xjtu.cdl2bpel.plugin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * This importstream is used by the framework to load a file. The
 * <code>ImpotrPlugin.importFile(InputStream input)</code> is called with a
 * SOAFrameworkInputStream. To get the filename, a type-cast is necessary
 * <p>
 * Title: SOAFrameworkInputStream
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
public class CDL2BPELFrameworkInputStream extends FileInputStream {

	private String filename;

	/**
	 * Construcs a ProMInpuStream and remembers the filename for later
	 * retrieval.
	 * 
	 * @param name
	 *            String
	 * @throws FileNotFoundException
	 */
	public CDL2BPELFrameworkInputStream(String name) throws FileNotFoundException {
		super(name);
		this.filename = name;
	}

	/**
	 * return the Filename used to initiate this stream;
	 * 
	 * @return String
	 */
	public String getFileName() {
		return filename;
	}
}
