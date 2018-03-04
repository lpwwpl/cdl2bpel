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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.EventListenerList;

/**
 * <p>
 * Title: Message
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
public class Message {

	public final static int NORMAL = 0, WARNING = 1, ERROR = 2, DEBUG = 3,
			TEST = 4;
	public final static int NUM_TYPES = TEST + 1;
	public final static int CLEAR_MESSAGES = -1;

	public final static String TYPE_NAMES[] = { "Normal", "Warning", "Error",
			"Debug", "Test" };

	private static EventListenerList listeners = new EventListenerList();

	private Message() {
	}

	public static synchronized void addActionListener(ActionListener l) {
		synchronized (listeners) {
			listeners.add(ActionListener.class, l);
		}
	}

	public static synchronized void removeActionListener(ActionListener l) {
		synchronized (listeners) {
			listeners.remove(ActionListener.class, l);
		}
	}

	public static void clearMessages() {
		synchronized (listeners) {
			ActionListener[] list = (ActionListener[]) listeners
					.getListeners(ActionListener.class);
			ActionEvent action = new ActionEvent("", 0, "", 0, CLEAR_MESSAGES);

			for (int i = 0; i < list.length; i++) {
				list[i].actionPerformed(action);
			}
		}
	}

	public static void add(String message) {
		add(message, NORMAL);
	}

	public static void add(String message, int status) {
		synchronized (listeners) {
			ActionListener[] list = (ActionListener[]) listeners
					.getListeners(ActionListener.class);
			ActionEvent action = new ActionEvent("", 0, message, 0, status);

			for (int i = 0; i < list.length; i++) {
				list[i].actionPerformed(action);
			}
		}
	}
}
