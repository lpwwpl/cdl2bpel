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

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * <p>
 * Title: ExpandButton.java
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
public class ExpandButton extends JButton {

	private static final long serialVersionUID = -8427659617273150458L;

	protected Color colorTriangle = new Color(220, 220, 220, 220);

	protected boolean isExpanded = false;
	protected boolean mouseOver = false;

	public ExpandButton() {
		this.setOpaque(false);
		this.setBorder(BorderFactory.createEmptyBorder());
		Dimension size = new Dimension(21, 21);
		this.setMinimumSize(size);
		this.setMaximumSize(size);
		this.setPreferredSize(size);
		addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) { /* ignore */
			}

			public void mouseEntered(MouseEvent arg0) {
				mouseOver = true;
				repaint();
			}

			public void mouseExited(MouseEvent arg0) {
				mouseOver = false;
				repaint();
			}

			public void mousePressed(MouseEvent arg0) { /* ignore */
			}

			public void mouseReleased(MouseEvent arg0) { /* ignore */
			}
		});
	}

	public boolean isExpanded() {
		return isExpanded;
	}

	public void setExpanded(boolean expanded) {
		isExpanded = expanded;
		repaint();
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		int y[] = new int[] { 5, 15, 5 };
		int x[] = new int[] { 5, 10, 15 };
		g2d.setColor(colorTriangle);
		if (mouseOver == false) {
			g2d.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, 0.7f));
		}
		if (isExpanded == true) {
			g2d.fillPolygon(x, y, 3);
		} else {
			g2d.fillPolygon(y, x, 3);
		}
		g2d.dispose();
	}

}
