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
package edu.xjtu.cdl2bpel.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import edu.xjtu.cdl2bpel.plugin.DoNotCreateNewInstance;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.Message;
import edu.xjtu.cdl2bpel.ui.MiningResult;
import edu.xjtu.cdl2bpel.ui.SwingWorker;
import edu.xjtu.cdl2bpel.ui.TransformingPlugin;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;
import edu.xjtu.cdl2bpel.utils.StopWatch;

/**
 * <p>
 * Title: ConvertInternalAction.java
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
public class ConvertInternalAction extends AbstractAction {

	private static final long serialVersionUID = 106316877533872580L;

	private TransformingPlugin algorithm;
	private ProvidedObject object;

	public ConvertInternalAction(TransformingPlugin algorithm,
			ProvidedObject object) {
		super(RuntimeUtils.stripHtmlForOsx("<html>" /*
													 * + object.getName() +
													 * " using<br>&nbsp;&nbsp;&nbsp;"
													 */+ algorithm.getName()
				+ "</html>"));
		this.algorithm = algorithm;
		this.object = object;
	}

	public TransformingPlugin getPlugin() {
		return algorithm;
	}

	public String toString() {
		return this.algorithm.getName();
	}

	public void actionPerformed(ActionEvent e) {

		MainUI.getInstance().addAction(algorithm, new Object[] { object });

		SwingWorker worker = new SwingWorker() {
			MiningResult result;
			StopWatch timer = new StopWatch();

			public Object construct() {
				Message.add("Start conversion.");
				timer.start();
				try {
					if (algorithm instanceof DoNotCreateNewInstance) {
						result = algorithm.convert(object);
					} else {
						result = ((TransformingPlugin) algorithm.getClass()
								.newInstance()).convert(object);
					}
				} catch (IllegalAccessException ex) {
					Message.add("No new instantiation of "
							+ algorithm.getName() + " could be made, using"
							+ " old instance instead", Message.ERROR);
					result = algorithm.convert(object);
				} catch (InstantiationException ex) {
					Message.add("No new instantiation of "
							+ algorithm.getName() + " could be made, using"
							+ " old instance instead", Message.ERROR);
					result = algorithm.convert(object);
				}
				return result;
			}

			public void finished() {
				timer.stop();
				Message.add("Conversion duration: " + timer.formatDuration());
				MainUI.getInstance().addAction(
						algorithm,

						(result instanceof Provider) ? ((Provider) result)
								.getProvidedObjects() : null);

				MainUI.getInstance().createConversionResultFrame(algorithm,
						result);
			}
		};
		worker.start();
	}
}
