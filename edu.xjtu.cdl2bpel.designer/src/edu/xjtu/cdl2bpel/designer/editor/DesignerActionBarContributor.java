package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;

public class DesignerActionBarContributor extends ActionBarContributor {

	protected void buildActions() {
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new RedoRetargetAction());
		addRetargetAction(new DeleteRetargetAction());

		IWorkbenchWindow iww = getPage().getWorkbenchWindow();
		addRetargetAction((org.eclipse.ui.actions.RetargetAction) org.eclipse.ui.actions.ActionFactory.COPY
				.create(iww));
		addRetargetAction((org.eclipse.ui.actions.RetargetAction) org.eclipse.ui.actions.ActionFactory.PASTE
				.create(iww));

		addRetargetAction(new ZoomInRetargetAction());
		addRetargetAction(new ZoomOutRetargetAction());

	}

	protected void declareGlobalActionKeys() {
		addGlobalActionKey(org.eclipse.ui.actions.ActionFactory.PRINT.getId());
		addGlobalActionKey(org.eclipse.ui.actions.ActionFactory.DELETE.getId());
	}

	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		MenuManager viewMenu = new MenuManager("View");
		viewMenu.add(getAction(GEFActionConstants.ZOOM_IN));
		viewMenu.add(getAction(GEFActionConstants.ZOOM_OUT));

		menuManager.insertAfter(IWorkbenchActionConstants.M_EDIT, viewMenu);
	}

	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);

		toolBarManager.add(getAction(org.eclipse.ui.actions.ActionFactory.UNDO
				.getId()));
		toolBarManager.add(getAction(org.eclipse.ui.actions.ActionFactory.REDO
				.getId()));

		toolBarManager.add(getAction(org.eclipse.ui.actions.ActionFactory.COPY
				.getId()));
		toolBarManager.add(getAction(org.eclipse.ui.actions.ActionFactory.PASTE
				.getId()));

		toolBarManager.add(new Separator());
		toolBarManager.add(new ZoomComboContributionItem(getPage()));
	}
}
