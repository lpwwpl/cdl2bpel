package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;

class MultiPageCommandStackListener implements CommandStackListener {

	public MultiPageCommandStackListener(Editor editor) {
		m_editor = editor;
	}

	public void addCommandStack(CommandStack commandStack) {
		commandStacks.add(commandStack);
		commandStack.addCommandStackListener(this);
	}

	public void commandStackChanged(java.util.EventObject event) {
		if (((CommandStack) event.getSource()).isDirty()) {

			m_editor.setDirty(true);
		} else {

			boolean oneIsDirty = false;
			for (java.util.Iterator stacks = commandStacks.iterator(); stacks
					.hasNext();) {
				CommandStack stack = (CommandStack) stacks.next();
				if (stack.isDirty()) {
					oneIsDirty = true;
					break;
				}
			}
			m_editor.setDirty(oneIsDirty);
		}
	}

	public void dispose() {
		for (java.util.Iterator stacks = commandStacks.iterator(); stacks
				.hasNext();) {
			((CommandStack) stacks.next()).removeCommandStackListener(this);
		}
		commandStacks.clear();
	}

	public void markSaveLocations() {
		for (java.util.Iterator stacks = commandStacks.iterator(); stacks
				.hasNext();) {
			CommandStack stack = (CommandStack) stacks.next();
			stack.markSaveLocation();
		}
	}

	private java.util.List commandStacks = new java.util.ArrayList();
	private Editor m_editor = null;
}
