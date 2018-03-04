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

import javax.swing.JInternalFrame;

import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;

/**
 * <p>
 * Title: ConversionFrame
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
public class ConversionFrame extends JInternalFrame implements Provider {

	private MiningResult result;

	public ConversionFrame(TransformingPlugin algorithm, MiningResult result) {
		super("Conversion - " + algorithm.getName(), true, true, true, true);

		this.result = result;

		this.getContentPane().setLayout(new BorderLayout());
		if (result != null) {
			this.getContentPane().add(result.getVisualization(),
					BorderLayout.CENTER);
		}
		pack();
	}

	public ProvidedObject[] getProvidedObjects() {
		return result instanceof Provider ? ((Provider) result)
				.getProvidedObjects() : new ProvidedObject[0];
	}
}
