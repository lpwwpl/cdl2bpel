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
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * <p>
 * Title: TypeToggleButton.java
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
public class TypeToggleButton extends JButton {

	protected Color colorPassive = new Color(90, 90, 90, 200);
	protected Color colorTextPassive = new Color(180, 180, 180, 200);
	protected Color colorTextActive = new Color(10, 10, 10, 200);
	protected FontMetrics metrics;
	protected int size = 20;

	protected boolean mouseOver = false;
	protected boolean buttonIsEnabled = true;

	protected String type;
	protected String letter;
	protected Color active;

	public TypeToggleButton(String type, String letter, Color active) {
		this.setOpaque(false);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setToolTipText("Click to disable " + type);
		this.type = type;
		this.letter = letter;
		this.active = active;
		this.setFont(this.getFont().deriveFont(12f));
		this.metrics = this.getFontMetrics(this.getFont());
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setButtonEnabled(!buttonIsEnabled);
			}
		});
		this.addMouseListener(new MouseListener() {
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
		Dimension dim = new Dimension(size + 4, size + 4);
		this.setMinimumSize(dim);
		this.setMaximumSize(dim);
		this.setPreferredSize(dim);
	}

	public boolean isEnabled() {
		return buttonIsEnabled;
	}

	public void setButtonEnabled(boolean enabled) {
		buttonIsEnabled = enabled;
		if (buttonIsEnabled == true) {
			this.setToolTipText("Click to disable " + type);
		} else {
			this.setToolTipText("Click to enable " + type);
		}
		repaint();
	}

	protected void paintComponent(Graphics g) {
		int width = this.getWidth();
		int height = this.getHeight();
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		if (mouseOver == false) {
			g2d.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, 0.8f));
		}
		if (buttonIsEnabled == true) {
			g2d.setColor(active);
		} else {
			g2d.setColor(colorPassive);
		}
		g2d.fillRoundRect(((width - size) / 2), ((height - size) / 2),
				size - 1, size - 1, 8, 8);
		if (buttonIsEnabled == true) {
			g2d.setColor(colorTextActive);
		} else {
			g2d.setColor(colorTextPassive);
		}
		Rectangle2D stringBounds = metrics.getStringBounds(letter, g2d);
		int fontX = (width - (int) stringBounds.getWidth()) / 2;
		int fontY = ((height - (int) stringBounds.getHeight()) / 2)
				+ metrics.getAscent();
		g2d.drawString(letter, fontX, fontY);
		g2d.dispose();
	}

}
