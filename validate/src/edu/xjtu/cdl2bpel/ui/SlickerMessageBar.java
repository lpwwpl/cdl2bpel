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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import org.deckfour.slickerbox.components.GradientPanel;
import org.deckfour.slickerbox.components.RoundedPanel;
import org.deckfour.slickerbox.ui.SlickerScrollBarUI;

/**
 * <p>
 * Title: SlickerMessageBar.java
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
public class SlickerMessageBar extends GradientPanel {

	protected static Color colorTop = new Color(90, 90, 90);
	protected static Color colorBottom = new Color(40, 40, 40);
	protected static Color colorBorder = new Color(60, 60, 60);

	protected SlickerConsole console;
	protected RoundedPanel largeConsolePanel;
	protected JPanel expandPanel;
	protected ExpandButton expand;
	protected JScrollPane largeConsoleScrollPane;
	protected JPanel filterPanel;

	/**
	 * @param colorTop
	 * @param colorBottom
	 */
	public SlickerMessageBar() {
		super(colorTop, colorBottom);
		// this.setBorder(BorderFactory.createLineBorder(colorBorder));
		console = new SlickerConsole(300);
		largeConsolePanel = new RoundedPanel(10, 6, 0);
		largeConsolePanel.setBackground(new Color(20, 20, 20, 160));
		largeConsolePanel.setLayout(new BorderLayout());
		largeConsoleScrollPane = new JScrollPane();
		largeConsoleScrollPane.setOpaque(false);
		largeConsoleScrollPane.getViewport().setOpaque(false);
		largeConsoleScrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		largeConsoleScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JScrollBar vBar = largeConsoleScrollPane.getVerticalScrollBar();
		vBar.setUI(new SlickerScrollBarUI(vBar, new Color(0, 0, 0, 0),
				new Color(140, 140, 140), new Color(110, 110, 110), 4, 12));
		largeConsoleScrollPane.setBorder(BorderFactory.createEmptyBorder());
		largeConsolePanel.add(largeConsoleScrollPane, BorderLayout.CENTER);
		expandPanel = new JPanel();
		expandPanel.setLayout(new BoxLayout(expandPanel, BoxLayout.Y_AXIS));
		expandPanel.setMinimumSize(new Dimension(30, 23));
		expandPanel.setMaximumSize(new Dimension(30, 1000));
		expandPanel.setPreferredSize(new Dimension(30, 500));
		expandPanel.setOpaque(false);
		expand = new ExpandButton();
		expand.setExpanded(false);
		expand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				toggleExpanded();
			}
		});
		expandPanel.add(expand);
		expandPanel.add(Box.createVerticalGlue());
		this.setLayout(new BorderLayout());
		this.add(expandPanel, BorderLayout.WEST);
		this.add(console, BorderLayout.CENTER);
		this.setMinimumSize(new Dimension(600, 23));
		this.setMaximumSize(new Dimension(3000, 23));
		this.setPreferredSize(new Dimension(2000, 23));
		filterPanel = new JPanel();
		filterPanel.setOpaque(false);
		filterPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		filterPanel.setLayout(new BoxLayout(filterPanel, BoxLayout.Y_AXIS));
		final TypeToggleButton messageButton = new TypeToggleButton("messages",
				"M", SlickerConsole.colorNormal);
		messageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setShowMessages(!console.isShowMessages());
			}
		});
		final TypeToggleButton warningButton = new TypeToggleButton("warnings",
				"W", SlickerConsole.colorWarning);
		warningButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setShowWarnings(!console.isShowWarnings());
			}
		});
		final TypeToggleButton errorButton = new TypeToggleButton("errors",
				"E", SlickerConsole.colorError);
		errorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setShowErrors(!console.isShowErrors());
			}
		});
		final TypeToggleButton debugButton = new TypeToggleButton(
				"debug messages", "D", SlickerConsole.colorDebug);
		debugButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setShowDebug(!console.isShowDebug());
			}
		});
		final TypeToggleButton testButton = new TypeToggleButton(
				"test messages", "T", SlickerConsole.colorTest);
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				console.setShowTest(!console.isShowTest());
			}
		});
		filterPanel.add(messageButton);
		filterPanel.add(warningButton);
		filterPanel.add(errorButton);
		filterPanel.add(debugButton);
		filterPanel.add(testButton);
		filterPanel.add(Box.createVerticalGlue());
	}

	public void toggleExpanded() {
		expand.setExpanded(!expand.isExpanded());
		toggleDimension();
	}

	protected void toggleDimension() {
		this.removeAll();
		this.add(expandPanel, BorderLayout.WEST);
		if (expand.isExpanded() == true) {
			this.setMinimumSize(new Dimension(600, 200));
			this.setMaximumSize(new Dimension(3000, 200));
			this.setPreferredSize(new Dimension(1000, 200));
			console.setExpanded(true);
			largeConsolePanel = new RoundedPanel(10, 6, 0);
			largeConsolePanel.setBackground(new Color(20, 20, 20, 160));
			largeConsolePanel.setLayout(new BorderLayout());
			largeConsoleScrollPane = new JScrollPane();
			largeConsoleScrollPane.setOpaque(false);
			largeConsoleScrollPane.getViewport().setOpaque(false);
			largeConsoleScrollPane
					.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			largeConsoleScrollPane
					.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			JScrollBar vBar = largeConsoleScrollPane.getVerticalScrollBar();
			vBar.setUI(new SlickerScrollBarUI(vBar, new Color(0, 0, 0, 0),
					new Color(140, 140, 140), new Color(110, 110, 110), 4, 12));
			vBar.setOpaque(false);
			largeConsoleScrollPane.setBorder(BorderFactory.createEmptyBorder());
			largeConsolePanel.add(largeConsoleScrollPane, BorderLayout.CENTER);
			expandPanel.removeAll();
			expandPanel.add(expand);
			expandPanel.add(filterPanel);
			expandPanel.add(Box.createVerticalGlue());
			this.add(largeConsolePanel, BorderLayout.CENTER);
			revalidate();
			largeConsoleScrollPane.getViewport().setView(console);
			revalidate();
			console.scrollToBottom();
			repaint();
		} else {
			this.setMinimumSize(new Dimension(600, 23));
			this.setMaximumSize(new Dimension(3000, 23));
			this.setPreferredSize(new Dimension(2000, 23));
			console.setExpanded(false);
			this.add(console, BorderLayout.CENTER);
			expandPanel.removeAll();
			expandPanel.add(expand);
			expandPanel.add(Box.createVerticalGlue());
			revalidate();
			repaint();
		}
		revalidate();
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = this.getWidth();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(new Color(0, 0, 0, 180));
		g2d.drawLine(0, 0, width - 1, 0);
		g2d.setColor(new Color(0, 0, 0, 90));
		g2d.drawLine(0, 1, width - 1, 1);
	}

}
