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

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;

import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;

/**
 * <p>
 * Title: ComponentFrame
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
public class ComponentFrame extends JInternalFrame implements Provider {

	protected JComponent comp;

	public ComponentFrame(String title, JComponent comp) {
		super(title, true, true, true, true);
		this.comp = comp;
		// this.setBorder(BorderFactory.createEmptyBorder());
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(comp, BorderLayout.CENTER);
		pack();
	}

	public ProvidedObject[] getProvidedObjects() {
		return comp instanceof Provider ? ((Provider) comp)
				.getProvidedObjects() : new ProvidedObject[0];
	}

}
