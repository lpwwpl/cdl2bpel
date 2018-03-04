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

import java.awt.Frame;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * A simple dialog with title and message, indicating to the user that he has to
 * wait for a certain action to finish before continuation.
 * <p>
 * Features an indeterminate progress bar, as we all like 'em :)
 * 
 * @author Dang Trung Anh
 * @version 1.6
 * @since 1.0
 * 
 */
public class WaitDialog extends JDialog {

	protected String title = null;
	protected String message = null;

	/**
	 * Creates a new wait dialog with the specified information
	 * 
	 * @param owner
	 *            Parent frame of the new dialog
	 * @param title
	 *            Title of the dialog
	 * @param message
	 *            Message to be displayed within the dialog.
	 */
	public WaitDialog(Frame owner, String title, String message) {
		super(owner, title, false);
		this.title = title;
		this.message = message;
		this.setSize(300, 150);
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		contentPanel.add(Box.createVerticalGlue());
		JLabel messageLabel = new JLabel(message);
		messageLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		contentPanel.add(messageLabel);
		contentPanel.add(Box.createVerticalStrut(10));
		JProgressBar waitBar = new JProgressBar();
		waitBar.setIndeterminate(true);
		waitBar.setAlignmentX(JProgressBar.CENTER_ALIGNMENT);
		JPanel waitBarPanel = new JPanel();
		waitBarPanel.setOpaque(false);
		waitBarPanel.setLayout(new BoxLayout(waitBarPanel, BoxLayout.X_AXIS));
		waitBarPanel.add(Box.createHorizontalGlue());
		waitBarPanel.add(waitBar);
		waitBarPanel.add(Box.createHorizontalGlue());
		contentPanel.add(waitBarPanel);
		contentPanel.add(Box.createVerticalGlue());
		this.add(contentPanel);
		this.setLocationRelativeTo(owner);
	}
}
