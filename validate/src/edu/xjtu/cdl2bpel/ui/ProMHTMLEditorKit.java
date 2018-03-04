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

import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;

/**
 * <p>
 * Title: ProMHTMLEditorKit
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>s
 * Copyright: Copyright (c) 2008 - 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public class ProMHTMLEditorKit extends HTMLEditorKit {

	private final String URLBase;

	public ProMHTMLEditorKit(String URLBase) {
		super();
		this.URLBase = URLBase;
	}

	public ViewFactory getViewFactory() {
		return new HTMLFactoryX(URLBase);
	}

	public static class HTMLFactoryX extends HTMLFactory implements ViewFactory {

		private final String URLBase;

		public HTMLFactoryX(String URLBase) {
			super();
			this.URLBase = URLBase;
		}

		public View create(Element elem) {
			Object o = elem.getAttributes().getAttribute(
					StyleConstants.NameAttribute);
			if (o instanceof HTML.Tag) {
				HTML.Tag kind = (HTML.Tag) o;
				if (kind == HTML.Tag.IMG) {
					return new ProMImageView(URLBase, elem);
				}
			}
			return super.create(elem);
		}
	}
}
