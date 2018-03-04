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

import javax.swing.JPanel;

/**
 * This interface ensures that the implementing class provides a method to
 * display itself.
 * 
 * @see GenericTableModelPanel
 * 
 * @author Dang Trung Anh
 */
public interface GuiDisplayable {

	/**
	 * Retrieves the GUI panel representing this object.
	 * 
	 * @return the GUI panel representing this object
	 */
	public JPanel getPanel();

	/**
	 * Implementing classes should specify the toString() value in a meaningful
	 * way as this will be used in Gui properties to display the name of this
	 * gui object.
	 * 
	 * @return the name of what this gui displayable represents
	 */
	public String toString();
}
