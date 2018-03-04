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
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;

/**
 * <p>
 * Title: VisualizationUI
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
public class VisualizationUI extends JInternalFrame implements Provider {

	private MiningResult result;
	protected JComponent resultVisualization;
	protected boolean setColor = true;

	public VisualizationUI(String title, MiningResult result,
			JComponent resultVisualization) {
		super(title, true, true, true, true);
		this.result = result;
		this.resultVisualization = resultVisualization;

		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(resultVisualization, BorderLayout.CENTER);
		pack();
	}

	public MiningResult getResult() {
		return result;
	}

	public ProvidedObject[] getProvidedObjects() {
		return result instanceof Provider ? ((Provider) result)
				.getProvidedObjects() : new ProvidedObject[0];
	}

	public void paint(Graphics g) {
		if (setColor == true) {
			setColor = false;
			Color bg = resultVisualization.getBackground();
			if (bg != null
					&& bg.equals((new JPanel()).getBackground()) == false) {
				setBackground(bg);
			}
		}
		super.paint(g);
	}
}
