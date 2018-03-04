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

package edu.xjtu.cdl2bpel.mining;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import javax.swing.JComponent;

import edu.xjtu.cdl2bpel.ui.Message;
import edu.xjtu.cdl2bpel.ui.MiningResult;

/**
 * <p>
 * Title: FileResult
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
public class FileResult extends Writer implements MiningResult {

	private StringBuffer buffer = new StringBuffer();
	private String extension;

	public FileResult(String extension) {
		this.extension = extension;
	}

	public JComponent getVisualization() {
		return null;
	}

	public String getExtension() {
		return extension;
	}

	public void saveResult(OutputStream out) {
		try {
			out.write(buffer.toString().getBytes());
		} catch (IOException ex) {
			Message.add(
					"Could not write results to output: " + ex.getMessage(),
					Message.ERROR);
		}
	}

	public void close() {
	}

	public void flush() {
	}

	public void write(char[] cbuf) {
		buffer.append(cbuf);
	}

	public void write(char[] cbuf, int off, int len) {
		buffer.append(cbuf, off, len);
	}

	public void write(int c) {
		buffer.append(c);
	}

	public void write(String str) {
		buffer.append(str);
	}

	public void write(String str, int off, int len) {
		buffer.append(str.substring(off, off + len));
	}

	public void writeln(String str) {
		buffer.append(str + "\n");
	}
}
