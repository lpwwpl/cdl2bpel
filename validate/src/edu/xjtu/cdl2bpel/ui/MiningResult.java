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

import javax.swing.JComponent;

/**
 * Captures the result of the execution of a mining algorithm.
 * 
 * <p>
 * Title: MiningResult
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
public interface MiningResult {

	/**
	 * Returns a component that contains the visualization of this mining
	 * result. This function should return <code>null</code> if this result
	 * cannot be visualized.
	 * 
	 * @return a component that contains the visualization of this mining result
	 *         or <code>null</code> if this result cannot be visualized
	 */
	public JComponent getVisualization();

}
