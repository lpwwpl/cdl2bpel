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

/**
 * Defines the interface of a plugin.
 * <p>
 * Implementing classes need to specify their name. A simple
 * <code>return "My name";</code> is sufficient.
 * <p>
 * Furthermore, documentation of a plugin can be returned by the
 * <code>getHtmlDescription</code> method. This documentation is displayed in
 * the help system.
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */

public interface Plugin {
	/**
	 * Gets the name of this plugin. Implementing classes should use this method
	 * to return their own name.
	 * 
	 * @return the name of this plugin
	 */
	public String getName();

	/**
	 * Gets a description of this plugin in HTML. The string returned by this
	 * method should only contain the contents of the body of the html page, so
	 * the <code>html</code>, <code>head</code> and <code>body</code> tags
	 * should <b>not</b> be used. This HTML page is displayed in the help system
	 * or as context sensitive help.
	 * 
	 * The HTML body can be stored in an external file in the
	 * /lib/documentation/ sub folder and in this case it can be obtained by
	 * calling <code>PluginDocumentationLoader.load(this)</code>
	 * 
	 * @return a description of this plugin in HTML
	 */
	public String getHtmlDescription();
}
