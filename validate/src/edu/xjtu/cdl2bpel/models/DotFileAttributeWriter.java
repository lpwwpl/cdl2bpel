/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                http://www.selab.edu.vn                  *
 *                                                         *
 **********************************************************/
package edu.xjtu.cdl2bpel.models;

import java.io.IOException;
import java.io.Writer;

/**
 * <p>
 * Title: DotFileAttributeWriter
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
public interface DotFileAttributeWriter {
	public void writePreambleAttributes(Writer bw) throws IOException;

	public void writeVertexAttributes(Writer bw, ModelGraphVertex vertex)
			throws IOException;

	public void writeEdgeAttributes(Writer bw, ModelGraphEdge edge)
			throws IOException;

	public void writeClusterAttributes(Writer bw, ModelGraphCluster cluster)
			throws IOException;
}
