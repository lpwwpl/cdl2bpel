package edu.xjtu.cdl2bpel.application;


import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import edu.xjtu.cdl2bpel.application.actions.NewFileAction;
import edu.xjtu.cdl2bpel.application.actions.OpenFileAction;
import edu.xjtu.cdl2bpel.application.actions.SaveFileAction;
import edu.xjtu.cdl2bpel.application.actions.StatusLineContribution;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	 private IWorkbenchAction exitAction;
	 private IWorkbenchAction aboutAction;
	 private static IWorkbenchWindow window;
	 private StatusLineContribution statusContribution;
	 private IContributionItem views;
	 private IAction newAction;	
	 private IAction openAction;
	 private IAction saveAction;
	 
   public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
       super(configurer);
   }

   protected void makeActions(IWorkbenchWindow window) {
		
	    ApplicationActionBarAdvisor.window = window;
	    registerAsGlobal(ActionFactory.SAVE.create(window));
	   
	   	newAction = new NewFileAction(window);
		register(newAction);
		
		openAction = new OpenFileAction(window);
		register(openAction);
		
		saveAction = new SaveFileAction(window);
		register(saveAction);
		
		exitAction = ActionFactory.QUIT.create(window);
		exitAction.setText("&Quit");
		register(exitAction);
		
		aboutAction = ActionFactory.ABOUT.create(window);
		register(aboutAction);
	
		views = ContributionItemFactory.VIEWS_SHORTLIST.create(window);
	
		statusContribution = new StatusLineContribution("statusline", 20);
		 
		registerAsGlobal(ActionFactory.SAVE.create(window));
		registerAsGlobal(ActionFactory.SAVE_AS.create(window));
		registerAsGlobal(ActionFactory.QUIT.create(window));
		registerAsGlobal(ActionFactory.ABOUT.create(window));
		registerAsGlobal(ActionFactory.SAVE_ALL.create(window));
		registerAsGlobal(ActionFactory.UNDO.create(window));
		registerAsGlobal(ActionFactory.REDO.create(window));
		registerAsGlobal(ActionFactory.CUT.create(window));
		registerAsGlobal(ActionFactory.COPY.create(window));
		registerAsGlobal(ActionFactory.PASTE.create(window));
		registerAsGlobal(ActionFactory.SELECT_ALL.create(window));
		registerAsGlobal(ActionFactory.FIND.create(window));
		registerAsGlobal(ActionFactory.CLOSE.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL.create(window));
		registerAsGlobal(ActionFactory.CLOSE_ALL_SAVED.create(window));
		registerAsGlobal(ActionFactory.REVERT.create(window));
   }

   protected void fillMenuBar(IMenuManager menuBar) {
	   	menuBar.add(createFileMenu());  
	   	menuBar.add(createEditMenu());
	   	
		MenuManager viewsMenu = new MenuManager("&Window", "views");
		viewsMenu.add(views);		
		menuBar.add(viewsMenu);

		MenuManager aboutMenu = new MenuManager("&About");
		aboutMenu.add(aboutAction);
		menuBar.add(aboutMenu);
   }
   
   private void registerAsGlobal(IAction action) {
		getActionBarConfigurer().registerGlobalAction(action);
		register(action);
	}
   
   public static IWorkbenchWindow getWindow(){
		return window;
	}

	protected void fillCoolBar(ICoolBarManager coolBar) {
	}
	
	protected void fillStatusLine(IStatusLineManager statusLine) {
		statusLine.add(statusContribution);
	}	
	
	private MenuManager createEditMenu() {
		MenuManager menu = new MenuManager("&Edition");
		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));

		menu.add(getAction(ActionFactory.UNDO.getId()));
		menu.add(getAction(ActionFactory.REDO.getId()));
		menu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));

//		menu.add(getAction(ActionFactory.CUT.getId()));
//		menu.add(getAction(ActionFactory.COPY.getId()));
//		menu.add(getAction(ActionFactory.PASTE.getId()));
//		menu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));
//
//		menu.add(getAction(ActionFactory.SELECT_ALL.getId()));
//		menu.add(new Separator());
//
//		menu.add(getAction(ActionFactory.FIND.getId()));
//		menu.add(new GroupMarker(IWorkbenchActionConstants.FIND_EXT));
//
//		menu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));
//
//		menu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));
//		menu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		return menu;
	}
	
	private MenuManager createFileMenu() {
		MenuManager menu = new MenuManager("&File");
//		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));		
		menu.add(openAction);
		
//		menu.add(new GroupMarker(IWorkbenchActionConstants.NEW_EXT));
		menu.add(newAction);
		
		menu.add(saveAction);
		menu.add(getAction(ActionFactory.QUIT.getId()));
//		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));
		return menu;
	}
}
