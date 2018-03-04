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

import edu.xjtu.cdl2bpel.plugin.Plugin;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;

/**
 * The interface implemented by all converting algorithms.
 * <p>
 * This interface is the minimum that should be implemented by a converting
 * algorithm that is used in the process mining framework. See the documentation
 * on how to implement converting algorithms for more information.
 * 
 * @author Dang Trung Anh
 * @version 1.0
 */
public interface TransformingPlugin extends Plugin {

	/**
	 * Execute this conversion algorithm on the given log file.
	 * 
	 * @param original
	 *            The original mining result
	 * @return the result of the transform, in a <code>MiningResult</code>
	 *         object
	 */
	public MiningResult convert(ProvidedObject original);

	/**
	 * This function tells the interface which results are accepted by this
	 * Plugin
	 * 
	 * @param original
	 *            The original mining result
	 * @return Whether or not this result is accepted
	 */
	public boolean accepts(ProvidedObject original);
}
