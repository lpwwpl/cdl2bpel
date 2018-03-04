package edu.xjtu.cdl2bpel.mining;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.bpel.BPELXML;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;
import edu.xjtu.cdl2bpel.ui.MiningResult;
import edu.xjtu.cdl2bpel.utils.DOM2JDOM;
import edu.xjtu.cdl2bpel.utils.JDOMToTreeModelAdapter;

public class BPELResultXML implements MiningResult, Provider {

	private BPELXML model;

	public BPELResultXML(BPELXML model) {
		// TODO Auto-generated constructor stub
		this.model = model;

	}

	public JComponent getVisualization() {
		if (model == null)
			return new JLabel("Irreducible net!");
		Document document = model.getDocument();

		JPanel Panel = new JPanel();
		JTree tree;
		final int leftWidth = 380;
		final int rightWidth = 600;
		final int windowWidth = leftWidth + rightWidth;
		final int windowHeight = 600;

		JSplitPane splitPane;
		JScrollPane treeScrollPane = null;
		JScrollPane textScrollPane = null;
		JEditorPane textPane = new JEditorPane();
		textPane.setEditable(false);
		textPane.setContentType("text/plain");

		textPane.setCaretPosition(0);
		textScrollPane = new JScrollPane(textPane);
		textScrollPane
				.setPreferredSize(new Dimension(rightWidth, windowHeight));

		try {
			DOM2JDOM convert = new DOM2JDOM(document);
			JDOMToTreeModelAdapter modelTree = new JDOMToTreeModelAdapter(
					convert.convert());
			tree = new JTree(modelTree);

			treeScrollPane = new JScrollPane(tree);
			treeScrollPane.setPreferredSize(new Dimension(leftWidth,
					windowHeight));
			splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					treeScrollPane, textScrollPane);

			splitPane.setContinuousLayout(true);
			splitPane.setDividerLocation(leftWidth);
			splitPane.setPreferredSize(new Dimension(windowWidth + 10,
					windowHeight + 10));

			// Add GUI components

			Panel.add(treeScrollPane);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

		return treeScrollPane;

	}

	@Override
	public ProvidedObject[] getProvidedObjects() {
		// TODO Auto-generated method stub
		return new ProvidedObject[] { new ProvidedObject("BPEL model",
				new Object[] { model }) };
	}

}
