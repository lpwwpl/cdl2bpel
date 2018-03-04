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

import java.io.IOException;
import java.io.InputStream;

import javax.swing.filechooser.FileFilter;

import edu.xjtu.cdl2bpel.ui.MiningResult;

/**
 * <p>
 * Title: ImportPlugin
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
public interface ImportPlugin extends Plugin {
	public FileFilter getFileFilter();

	/**
	 * Interface for plugins that import from file.
	 * 
	 * @param input
	 *            The framework will always provide a ProMInputStream as the
	 *            <code>input</code> parameter. To retrieve the filename use:
	 *            <code>((ProMInputStream) input).getFilename();</code>
	 * @return MiningResult A JComponent that is visualized in a frame. If
	 *         <code>null</code> is returned then the framework thinks the call
	 *         to this method was aborted.
	 * @throws IOException
	 *             If an IO exception occurs.
	 */
	public MiningResult importFile(InputStream input) throws IOException;
}
