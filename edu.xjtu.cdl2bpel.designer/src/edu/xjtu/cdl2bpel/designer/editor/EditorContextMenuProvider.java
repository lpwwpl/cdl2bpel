package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

public class EditorContextMenuProvider extends ContextMenuProvider {

	public EditorContextMenuProvider(EditPartViewer viewer,
			ActionRegistry actionRegistry) {
		super(viewer);
		m_actionRegistry = actionRegistry;
	}

	public void buildContextMenu(IMenuManager menuManager) {
		GEFActionConstants.addStandardActionGroups(menuManager);

		appendActionToUndoGroup(menuManager,
				org.eclipse.ui.actions.ActionFactory.UNDO.getId());
		appendActionToUndoGroup(menuManager,
				org.eclipse.ui.actions.ActionFactory.REDO.getId());

		appendActionToEditGroup(menuManager,
				org.eclipse.ui.actions.ActionFactory.COPY.getId());
		appendActionToEditGroup(menuManager,
				org.eclipse.ui.actions.ActionFactory.PASTE.getId());
		appendActionToEditGroup(menuManager,
				org.eclipse.ui.actions.ActionFactory.DELETE.getId());
		appendActionToEditGroup(menuManager, GEFActionConstants.DIRECT_EDIT);

		appendChoreographySubmenu(menuManager);

		appendActionToMenu(menuManager,
				org.eclipse.ui.actions.ActionFactory.SAVE.getId(),
				GEFActionConstants.GROUP_SAVE);
	}

	private void appendChoreographySubmenu(IMenuManager menuManager) {

		MenuManager submenu = new MenuManager("Choreography");

		if (!submenu.isEmpty())
			menuManager.appendToGroup(GEFActionConstants.GROUP_REST, submenu);
	}

	protected ActionRegistry getActionRegistry() {
		return m_actionRegistry;
	}

	private void appendActionToMenu(IMenuManager menu, String actionId,
			String menuGroup) {
		IAction action = getActionRegistry().getAction(actionId);
		if (null != action && action.isEnabled()) {
			menu.appendToGroup(menuGroup, action);
		}
	}

	private void appendActionToUndoGroup(IMenuManager menu, String actionId) {
		IAction action = getActionRegistry().getAction(actionId);
		if (null != action && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		}
	}

	private void appendActionToEditGroup(IMenuManager menu, String actionId) {
		IAction action = getActionRegistry().getAction(actionId);
		if (null != action && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		}
	}

	private ActionRegistry m_actionRegistry = null;
}
