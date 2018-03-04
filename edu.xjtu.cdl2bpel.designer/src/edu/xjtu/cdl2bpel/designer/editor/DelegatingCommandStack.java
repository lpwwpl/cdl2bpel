package edu.xjtu.cdl2bpel.designer.editor;

import java.util.EventObject;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.commands.UnexecutableCommand;

public class DelegatingCommandStack extends CommandStack implements
		CommandStackListener {

	public CommandStack getCurrentCommandStack() {
		return currentCommandStack;
	}

	public void setCurrentCommandStack(CommandStack stack) {
		if (currentCommandStack == stack) {
			return;
		}

		if (null != currentCommandStack) {
			currentCommandStack.removeCommandStackListener(this);
		}

		currentCommandStack = stack;

		currentCommandStack.addCommandStackListener(this);

		notifyListeners();
	}

	public boolean canRedo() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.canRedo();
	}

	public boolean canUndo() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.canUndo();
	}

	public void dispose() {
		if (null != currentCommandStack) {
			currentCommandStack.dispose();
		}
	}

	public void execute(Command command) {
		if (null != currentCommandStack) {
			currentCommandStack.execute(command);
		}
	}

	public void flush() {
		if (null != currentCommandStack) {
			currentCommandStack.flush();
		}
	}

	public Object[] getCommands() {
		if (null == currentCommandStack) {
			return EMPTY_OBJECT_ARRAY;
		}

		return currentCommandStack.getCommands();
	}

	public Command getRedoCommand() {
		if (null == currentCommandStack) {
			return UnexecutableCommand.INSTANCE;
		}

		return currentCommandStack.getRedoCommand();
	}

	public Command getUndoCommand() {
		if (null == currentCommandStack) {
			return UnexecutableCommand.INSTANCE;
		}

		return currentCommandStack.getUndoCommand();
	}

	public int getUndoLimit() {
		if (null == currentCommandStack) {
			return -1;
		}

		return currentCommandStack.getUndoLimit();
	}

	public boolean isDirty() {
		if (null == currentCommandStack) {
			return false;
		}

		return currentCommandStack.isDirty();
	}

	public void markSaveLocation() {
		if (null != currentCommandStack) {
			currentCommandStack.markSaveLocation();
		}
	}

	public void redo() {
		if (null != currentCommandStack) {
			currentCommandStack.redo();
		}
	}

	public void setUndoLimit(int undoLimit) {
		if (null != currentCommandStack) {
			currentCommandStack.setUndoLimit(undoLimit);
		}
	}

	public void undo() {
		if (null != currentCommandStack) {
			currentCommandStack.undo();
		}
	}

	public String toString() {
		return "DelegatingCommandStack(" + currentCommandStack + ")";
	}

	public void commandStackChanged(EventObject event) {
		notifyListeners();
	}

	private static final Object[] EMPTY_OBJECT_ARRAY = new Object[] {};
	private CommandStack currentCommandStack;
}
