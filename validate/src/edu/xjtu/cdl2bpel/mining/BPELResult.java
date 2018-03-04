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
package edu.xjtu.cdl2bpel.mining;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import att.grappa.Element;
import att.grappa.GrappaAdapter;
import att.grappa.GrappaPanel;
import att.grappa.GrappaPoint;
import att.grappa.Subgraph;
import edu.xjtu.cdl2bpel.bpel.BPEL;
import edu.xjtu.cdl2bpel.bpel.BPELActivity;
import edu.xjtu.cdl2bpel.bpel.BPELProcess;
import edu.xjtu.cdl2bpel.bpel.BPELStructured;
import edu.xjtu.cdl2bpel.models.ModelGraph;
import edu.xjtu.cdl2bpel.models.ModelGraphPanel;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;
import edu.xjtu.cdl2bpel.ui.MiningResult;

/**
 * <p>
 * Title: BPELResult
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
public class BPELResult implements MiningResult, Provider {
	protected BPEL model;
	private BPELHierarchy hierarchy = new BPELHierarchy() {
		protected void selectionChanged(final Object newSelection) {
			Object selection = newSelection;
			ModelGraph graph = null;
			if (selection instanceof BPEL) {
				selection = (Object) ((BPEL) selection).getProcess();
			}
			if (selection instanceof BPELProcess) {
				final BPELProcess process = (BPELProcess) selection;
				graph = new ModelGraph("bla") {
					public void writeToDot(Writer bw) throws IOException {
						BPELActivity activity = process.getActivity();
						if (activity instanceof BPELStructured) {
							model.initModelGraph();
							((BPELStructured) activity).buildModelGraph(model);
							model.writeToDot(bw);
						}
					}
				};
			}
			if (selection instanceof BPELStructured) {
				final BPELStructured structuredActivity = (BPELStructured) selection;
				graph = new ModelGraph("bla") {
					public void writeToDot(Writer bw) throws IOException {
						model.initModelGraph();
						structuredActivity.buildModelGraph(model);
						model.writeToDot(bw);
					}
				};
			}

			if (graph != null) {
				ModelGraphPanel gp = graph.getGrappaVisualization();
				gp.addGrappaListener(new BPELGrappaAdapter(BPELResult.this));
				netContainer.setViewportView(gp);
				netContainer.invalidate();
				netContainer.repaint();
			}
		}
	};

	private JPanel mainPanel = new JPanel(new BorderLayout());
	private JScrollPane netContainer = new JScrollPane();

	public BPELResult(BPEL model) {
		this.model = model;
		if (model != null) {
			BPELHierarchyVisitor.Build(this.model, hierarchy);
		}
	}

	public ProvidedObject[] getProvidedObjects() {
		return new ProvidedObject[] { new ProvidedObject("BPEL model",
				new Object[] { model }) };
	}

	public JComponent getVisualization() {
		if (model == null)
			return new JLabel("Irreducible net!");

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				true, hierarchy.getTreeVisualization(), netContainer);
		splitPane.setOneTouchExpandable(true);
		mainPanel.add(splitPane, BorderLayout.CENTER);

		return mainPanel;
	}

	void selectStructured(BPELStructured structuredActivity) {
		hierarchy.setSelectedNode(structuredActivity);
	}

	void selectProcess(BPELProcess process) {
		hierarchy.setSelectedNode(process);
	}
}

class BPELGrappaAdapter extends GrappaAdapter {

	private BPELResult result;

	public BPELGrappaAdapter(BPELResult result) {
		this.result = result;
	}

	public void grappaClicked(Subgraph subg, Element elem, GrappaPoint pt,
			int modifiers, int clickCount, GrappaPanel panel) {
		super.grappaClicked(subg, elem, pt, modifiers, clickCount, panel);
		int i = InputEvent.BUTTON1_MASK;
		int j = InputEvent.SHIFT_MASK;
		if ((modifiers & i) == i && (modifiers & j) == j && clickCount == 1
				&& elem != null && elem.object != null) {
			if (elem.object instanceof BPELStructured) {
				BPELStructured structuredActivity = (BPELStructured) elem.object;
				result.selectStructured(structuredActivity);
			} else if (elem.object instanceof BPELProcess) {
				BPELProcess process = (BPELProcess) elem.object;
				result.selectProcess(process);
			}
		}

	}
}
