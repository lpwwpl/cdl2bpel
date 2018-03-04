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

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import org.deckfour.slickerbox.components.ActionBar;
import org.deckfour.slickerbox.components.glasspane.DialogGlassPane;
import org.deckfour.slickerbox.components.glasspane.ExposePanel;

import edu.xjtu.cdl2bpel.action.CatchOutOfMemoryAction;
import edu.xjtu.cdl2bpel.action.ConvertAction;
import edu.xjtu.cdl2bpel.action.ImportAnyFileAction;
import edu.xjtu.cdl2bpel.action.ShowExposeAction;
import edu.xjtu.cdl2bpel.action.ShowMessagesAction;
import edu.xjtu.cdl2bpel.action.ShowNavigationPanelAction;
import edu.xjtu.cdl2bpel.plugin.CDL2BPELFrameworkInputStream;
import edu.xjtu.cdl2bpel.plugin.DoNotCreateNewInstance;
import edu.xjtu.cdl2bpel.plugin.ImportPlugin;
import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.plugin.Plugin;
import edu.xjtu.cdl2bpel.plugin.ProvidedObject;
import edu.xjtu.cdl2bpel.plugin.Provider;
import edu.xjtu.cdl2bpel.ui.menu.ConversionMenu;
import edu.xjtu.cdl2bpel.ui.menu.HelpMenu;
import edu.xjtu.cdl2bpel.ui.menu.ImportMenu;
import edu.xjtu.cdl2bpel.ui.menu.WindowMenu;
import edu.xjtu.cdl2bpel.utils.CenterOnScreen;
import edu.xjtu.cdl2bpel.utils.RuntimeUtils;

/**
 * <p>
 * Title: MainUI
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
public class MainUI extends JFrame implements Provider {

	private static final long serialVersionUID = -5251849261371249059L;

	public static final String STARTEDFROMCOMMANDLINE = "This analysisplugin was started from the command line.";
	static final String PROCESS = "BK_Process";
	public static final int RECOM_PORT = 4446;
	private boolean recomRunning = false;

	private static MainUI mainInstance;

	private ArrayList<ProvidedObject> globalProvidedObjects = new ArrayList<ProvidedObject>();

	private MDIDesktopPane desktop = new MDIDesktopPane();
	private BorderLayout borderLayout = new BorderLayout();
	protected ActionBar actionBar;
	protected ExposePanel exposePanel;
//	protected LaunchGlassPane launchPanel;
	protected DialogGlassPane dialogPanel;
	private JMenuBar menuBar = new JMenuBar();
	private JPanel contentPanel = new JPanel();
	protected SlickerMessageBar console = new SlickerMessageBar();
	private JCheckBoxMenuItem keepLog = new JCheckBoxMenuItem("Keep History");
	// private Service recomService = null;
	// private GetRecommendationAction getRecomAction;

	private JMenu helpMenu = new JMenu("Help");

	private PluginReference reference = new PluginReference();

	private JSplitPane desktopAndNavigation = null;
	private int lastDividerLocation;
	private NavigationPanel navigationPanel;

	private void buildNewExecutionLog(String fn) {
		// fn is filename without extensions
		try {
			FileOutputStream zipFile = new FileOutputStream(fn + ".zip");
			ZipOutputStream output = new ZipOutputStream(
					new BufferedOutputStream(zipFile));
			output.putNextEntry(new ZipEntry(fn + " content.xml"));

			// No logfile present, lets create it
			writeLn("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", output);
			writeLn(
					"<WorkflowLog xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
							+ " xsi:noNamespaceSchemaLocation=\"WorkflowLog.xsd\""
							+ " description=\"BKSOA Framework execution log\">",
					output);

			// Write the source section
			writeLn("<Source program=\"" + About.NAME + "\">", output);
			writeLn("</Source>", output);

			// Now, write the process section, for one process
			writeLn(
					"<Process id=\""
							+ PROCESS
							+ "\""
							+ " description=\"Process containing the BKSOA Framework execution Log\">",
					output);

			// writeLn("</Process>", output);

			// writeLn("</WorkflowLog>", output);
			output.closeEntry();
			output.close();

		} catch (FileNotFoundException ex) {
			Message.add("Could not open execution log", Message.ERROR);
		} catch (IOException ex) {
			Message.add("Could not open execution log", Message.ERROR);
		}

	}

	/**
	 * construct the MainUI. This method should only be called once. All further
	 * communication with the UI should be done through MainUI.getInstance()
	 */
	public MainUI() {

		/*
		 * TODO: implement 'unified toolbar' look on OS X
		 * if(RuntimeUtils.isRunningMacOsX()) {
		 * this.getRootPane().putClientProperty("apple.awt.brushMetalLook",
		 * Boolean.TRUE); }
		 */

		ActionListener showAbout = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About about = new About(MainUI.this);
				about.setVisible(true);
			}
		};

		actionBar = new ActionBar(new ImageIcon(About.IMAGELOCATION()
				+ "actionbarlogo.png"), showAbout);

		keepLog.setSelected(UISettings.getInstance().getKeepHistory());

		mainInstance = this;

		try {
			jbInit();
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			pack();
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			if (desktopAndNavigation != null) {
				desktopAndNavigation.setDividerLocation(desktopAndNavigation
						.getSize().width - 200);
				lastDividerLocation = desktopAndNavigation.getDividerLocation();
				// toggleNavigationPanelVisible();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeLn(String s, OutputStream out) {
		try {
			if (s.length() != 0) {
				out.write(s.getBytes());
			}
			out.write("\n".getBytes());
		} catch (IOException ex) {
		}
	}

	public static MainUI getInstance() {
		return mainInstance;
	}

	public void showReference(Plugin plugin) {
		reference.show(plugin);
	}

	public synchronized void quit() {
		// update the execution log. First, we find the </process> tag and we
		// add
		// a new instance in front of that tag
		mainInstance = null;

		System.exit(0);
	}

	private void jbInit() throws Exception {

		String name = About.IMAGELOCATION() + "icon.gif";

		setIconImage(Toolkit.getDefaultToolkit().getImage(name));

		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				quit();
			}
		});

		// helpMenu.add(new PluginReferenceAction());
		helpMenu.add(new AboutAction());
		// helpMenu.add(new ParametersAction());
		// helpMenu.addSeparator();
		helpMenu.add(new HelpMenu());
		// helpMenu.addSeparator();
		/*
		 * / REMOVED FOR RELEASE THE FUNCTIONALITY TO KEEP HISTORY
		 */
		/*
		 * helpMenu.add(keepLog); helpMenu.add(new
		 * ShowHistoryAction()).setEnabled(keepLog.isSelected());
		 * helpMenu.add(new StartNewHistoryPIAction()).setEnabled(
		 * keepLog.isSelected()); helpMenu.add(new
		 * MainUIExportHistoryAction(desktop)).setEnabled(
		 * keepLog.isSelected()); helpMenu.add(new
		 * ResetHistoryAction()).setEnabled(keepLog.isSelected());
		 * 
		 * helpMenu.addSeparator();
		 * 
		 * getRecomAction = new GetRecommendationAction();
		 * getRecomAction.setEnabled(false); helpMenu.add(new
		 * StartRecommendationAction()); helpMenu.add(getRecomAction);
		 * helpMenu.addSeparator();
		 * 
		 * 
		 * helpMenu.add(new LogReaderMenu());
		 * 
		 * helpMenu.add(new NikeFsDialogMenuItem());
		 */
		/*
		 * helpMenu.add(new IconThemeMenu()); helpMenu.add(new
		 * DesktopBackgroundMenu()); helpMenu.add(new SetDotExeMenuItem());
		 */
		/*
		 * JMenuItem appShotItem = new JMenuItem(
		 * "Capture application screenshot...");
		 * appShotItem.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * ScreenshotUtility.captureApplicationScreenshot(); } }); JMenuItem
		 * frameShotItem = new JMenuItem( "Capture active frame screenshot...");
		 * frameShotItem.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * ScreenshotUtility.captureActiveFrameScreenshot(); } });
		 * 
		 * helpMenu.addSeparator(); helpMenu.add(frameShotItem);
		 * helpMenu.add(appShotItem);
		 */

		final ActionListener resetGlassPaneListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetGlassPane();
			}
		};

		exposePanel = new ExposePanel(desktop, resetGlassPaneListener);
		this.setGlassPane(exposePanel);
		exposePanel.setVisible(false);

//		launchPanel = new LaunchGlassPane();
//		launchPanel.setVisible(false);
//		launchPanel.setSize(this.getSize());

		dialogPanel = new DialogGlassPane(resetGlassPaneListener);
		dialogPanel.setVisible(false);
		dialogPanel.setSize(this.getSize());

		actionBar.add(new ImportAnyFileAction(desktop, !RuntimeUtils
				.isRunningMacOsX()));
		actionBar.add(new ConvertAction(desktop));
		actionBar.addSeperator(15);

		actionBar.add(new ShowMessagesAction(desktop));
		actionBar.add(new ShowNavigationPanelAction(desktop));
		actionBar.add(new ShowExposeAction(desktop));
//		actionBar.add(new ShowLauncherAction(desktop));

		menuBar.add(new ImportMenu(desktop));
		menuBar.add(new ConversionMenu(desktop));
		menuBar.add(new WindowMenu(desktop));
		menuBar.add(helpMenu);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(About.NAME + " [" + About.VERSION + "]");
		this.setJMenuBar(menuBar);

		contentPanel.setLayout(borderLayout);
		contentPanel.add(actionBar, BorderLayout.NORTH);
		contentPanel.add(desktop, BorderLayout.CENTER);
		contentPanel.add(console, BorderLayout.SOUTH);
		this.setContentPane(contentPanel);

		// create navigation panel, but set invisible (i.e. no updates) for now
		// (until made visible consciously)
		desktopAndNavigation = null;
		navigationPanel = new NavigationPanel(getDesktop());

		// register application-wide keyboard shortcuts
		registerKeyStrokes();
	}

	/**
	 * Registers global key strokes for BKSOA Framework:
	 * <ul>
	 * <li>Modifier + E: Expose feature</li>
	 * <li>Modifier + D: Action trigger</li>
	 * <li>Modifier + W: Open active window and select next in z-order, if
	 * available</li>
	 * <li>Modifier + R: Open last opened log file</li>
	 * <li>Modifier + T: Perform last triggered analysis</li>
	 * <li>Modifier + O: Open any type of file</li>
	 * </ul>
	 * <p>
	 * The modifier is the control key for Windows and Linux, and the command
	 * (or, 'Apple') key for Mac OS X.
	 */
	protected void registerKeyStrokes() {
		// register key strokes
		int modifierCode = KeyEvent.CTRL_DOWN_MASK;
		if (RuntimeUtils.isRunningMacOsX() == true) {
			// on os x, use the command (i.e., 'apple') modifier key
			modifierCode = KeyEvent.META_DOWN_MASK;
		}
		// action trigger stroke:
		JComponent cPane = (JComponent) this.getContentPane();
		KeyStroke launchStroke = KeyStroke.getKeyStroke('D', modifierCode);
		ActionListener launchListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (getGlassPane().isVisible() == false) {
					JInternalFrame activeFrame = getDesktop()
							.getSelectedFrame();
					if (activeFrame != null && activeFrame instanceof Provider) {
						Provider provider = (Provider) activeFrame;
						if (provider.getProvidedObjects().length > 0) {
//							MainUI.getInstance().showLauncher();
						} else {
							MainUI
									.getInstance()
									.showGlassDialog(
											"No action available!",
											"The currently selected frame does not have any"
													+ " provided objects which could be used by any available plugin. Please select another frame.");
						}
					} else {
						MainUI
								.getInstance()
								.showGlassDialog(
										"No action available!",
										"The currently selected frame does not have any"
												+ " provided objects which could be used by any available plugin. Please select another frame.");
					}
				}
			}
		};
		cPane.registerKeyboardAction(launchListener, launchStroke,
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		// expose stroke
		KeyStroke exposeStroke = KeyStroke.getKeyStroke('E', modifierCode);
		ActionListener exposeListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (getGlassPane().isVisible() == false) {
					if (getDesktop().getAllFrames().length > 1) {
						showExpose();
					} else {
						showGlassDialog(
								"Expos\u00E9 not applicable",
								"The Expos\u00E9 feature has the purpose of helping you switch between a number of "
										+ "internal windows rapidly. You need to have more than one internal window "
										+ "open to make use of this functionality.");
					}
				}
			}
		};
		cPane.registerKeyboardAction(exposeListener, exposeStroke,
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		// frame closing stroke
		KeyStroke frameCloseStroke = KeyStroke.getKeyStroke('W', modifierCode);
		ActionListener frameCloseListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame activeFrame = getDesktop().getSelectedFrame();
				if (activeFrame != null) {
					activeFrame.dispose();
					// try selecting the next frame in z-order
					JInternalFrame frames[] = getDesktop().getAllFrames();
					if (frames.length > 0) {
						desktop.moveToFront(frames[0]);
					}
				}
			}
		};
		cPane.registerKeyboardAction(frameCloseListener, frameCloseStroke,
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		// frame maximize toggle stroke
		KeyStroke frameMaximizeStroke = KeyStroke.getKeyStroke('M',
				modifierCode);
		ActionListener frameMaximizeListener = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame activeFrame = getDesktop().getSelectedFrame();
				if (activeFrame != null) {
					// toggle maximized property
					try {
						activeFrame.setMaximum(!activeFrame.isMaximum());
					} catch (PropertyVetoException e) {
						// yeah, whatever..
						e.printStackTrace();
					}
				}
			}
		};
		cPane.registerKeyboardAction(frameMaximizeListener,
				frameMaximizeStroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
		// file open stroke
		KeyStroke fileOpenStroke = KeyStroke.getKeyStroke('O', modifierCode);
		ActionListener fileOpenListener = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				(new ImportAnyFileAction(desktop, !RuntimeUtils
						.isRunningMacOsX())).actionPerformed(evt);
			}
		};
		cPane.registerKeyboardAction(fileOpenListener, fileOpenStroke,
				JComponent.WHEN_IN_FOCUSED_WINDOW);
	}

	public void toggleMessagesVisible() {
		console.toggleExpanded();
	}

	public void showExpose() {
		desktop.rescueAllFrames();
		this.setGlassPane(exposePanel);
		exposePanel.revalidate();
		exposePanel.showExpose();
	}

//	public void showLauncher() {
//		if (getGlassPane().isVisible() == false) {
//			JInternalFrame activeFrame = getDesktop().getSelectedFrame();
//			if (activeFrame != null && activeFrame instanceof Provider) {
//				Provider provider = (Provider) activeFrame;
//
//				if (provider != null) {
//					ProvidedObject[] objects = provider.getProvidedObjects();
//
//					if (objects != null && objects.length > 0) {
//						this.setGlassPane(launchPanel);
//						launchPanel.revalidate();
//						launchPanel.fadeIn();
//						return;
//					}
//				}
//			}
//		}
//		// impossible to perform action
//		MainUI
//				.getInstance()
//				.showGlassDialog(
//						"No action available!",
//						"The currently selected frame does not have any"
//								+ " provided objects which could be used by any available plugin. Please select another frame.");
//	}
//
//	public void showLauncher(Provider provider, ProvidedObject object) {
//		if (getGlassPane().isVisible()) {
//			return;
//		}
//		if (provider != null && object != null
//				&& provider.getProvidedObjects().length > 0) {
//			setGlassPane(launchPanel);
//			launchPanel.revalidate();
//			launchPanel.fadeIn(object);
//		} else {
//			MainUI
//					.getInstance()
//					.showGlassDialog(
//							"No action available!",
//							"The currently selected frame does not have any"
//									+ " provided objects which could be used by any available plugin. Please select another frame.");
//		}
//	}

	public void showGlassDialog(String title, String message) {
		this.setGlassPane(dialogPanel);
		dialogPanel.revalidate();
		dialogPanel.showDialog(title, message);
	}

	public void resetGlassPane() {
		JPanel emptyGlass = new JPanel();
		emptyGlass.setOpaque(false);
		emptyGlass.setBorder(BorderFactory.createEmptyBorder());
		this.setGlassPane(emptyGlass);
	}

	/**
	 * Adds a frame to the desktop. This frame contains the JComponent result
	 * that was created by the analysisplugin algorithm on the given input.
	 * 
	 * @param algorithm
	 *            AnalysisPlugin
	 * @param input
	 *            AnalysisInputItem[]
	 * @param result
	 *            JComponent
	 */
//	public void createAnalysisResultFrame(AnalysisPlugin algorithm,
//			AnalysisInputItem[] input, JComponent result) {
//		AnalysisFrame frame;
//		if (result != null) {
//			frame = new AnalysisFrame(algorithm, input, result);
//			desktop.add(frame, algorithm);
//		}
//	}

	/**
	 * Returns the desktop of this user interface,
	 * 
	 * @return JDesktopPane
	 */
	public MDIDesktopPane getDesktop() {
		return desktop;
	}

	/**
	 * Adds a frame to the desktop. This frame contains the JComponent result
	 * that was created by the conversionPlugin algorithm.
	 * 
	 * @param algorithm
	 *            ConvertingPlugin
	 * @param result
	 *            MiningResult
	 */
	public void createConversionResultFrame(TransformingPlugin algorithm,
			MiningResult result) {
		ConversionFrame frame;
		frame = new ConversionFrame(algorithm, result);
		desktop.add(frame, algorithm);
	}

	/**
	 * Adds a frame to the desktop. This frame is split in two parts. The
	 * lefthand side contains the default options for a log file. The righthand
	 * side is defined in the getOptionsPanel() method of the NoMiningAction
	 * MiningPlugin. Note that in this method the whole log is read once to
	 * construct a summary required for the options panel.
	 * 
	 * @param file
	 *            LogFile
	 * @param algorithm
	 *            MiningPlugin
	 * @return OpenLogSettings A pointer to the frame that was creates (used in
	 *         setParameters)
	 */

	/**
	 * Called to import a given file by a given ImportPlugin. This method is
	 * called by the import menu.
	 * 
	 * @param algorithm
	 *            ImportPlugin
	 * @param filename
	 *            String
	 * @param log
	 *            LogReader to connect to (can be null if none selected). If not
	 *            null, the algorithm should be instance of
	 *            LogReaderConnectionImportPlugin.
	 */
	public void importFromFile(ImportPlugin algorithm, String filename) {
		InputStream in = null;
		MiningResult result = null;
		boolean connected = false;
		if (filename != null && !filename.equals("")) {
			try {
				in = new CDL2BPELFrameworkInputStream(filename);
				MainUI.getInstance().addAction(algorithm,
						new Object[] { filename });
				boolean shouldFuzzyMatch = true;
				try {
					ImportPlugin pl;

					if (algorithm instanceof DoNotCreateNewInstance) {
						pl = algorithm;
					} else {
						pl = (ImportPlugin) algorithm.getClass().newInstance();
					}

					result = pl.importFile(in);

				} catch (IllegalAccessException ex2) {
					Message.add("No new instantiation of "
							+ algorithm.getName() + " could be made, using"
							+ " old instance instead", Message.ERROR);
					Message.add(ex2.getMessage(), Message.ERROR);
					result = algorithm.importFile(in);
				} catch (InstantiationException ex2) {
					Message.add("No new instantiation of "
							+ algorithm.getName() + " could be made, using"
							+ " old instance instead", Message.ERROR);
					Message.add(ex2.getMessage(), Message.ERROR);
					result = algorithm.importFile(in);
				}
				connected = true;
				if (result != null) {
					MainUI.getInstance().addAction(algorithm,
							new Object[] { filename });
					createVisualizationFrame("Imported - "
							+ (new File(filename)).getName() + " - "
							+ algorithm.getName(), result, algorithm);
					Message.add("Import of " + filename + " successful");
				} else {
					Message.add("Import of " + filename + " aborted.");
				}
			} catch (Exception e) {
			}
		}
	}

	/**
	 * Connects a (discovered or imported) model with a log reader. Used in
	 * HNLogReaderConnectionPlugin, PetriNetLogReaderConnectionPlugin, and
	 * MainUI.importFromFile (when a model is connected to log during import).
	 * 
	 * @param conn
	 * @param newLog
	 * @param plugin
	 * @return
	 */

	/**
	 * Adds a frame to the desktop with the given title. The content of the
	 * frame is the given MiningResult.
	 * 
	 * @param title
	 *            String
	 * @param result
	 *            MiningResult
	 * @param plugin
	 *            Plugin representing the plugin that created this frame
	 */
	public void createVisualizationFrame(String title, MiningResult result,
			Plugin plugin) {
		if (result == null) {
			return;
		}
		JComponent comp = result.getVisualization();
		if (comp != null) {
			VisualizationUI frame = new VisualizationUI(title, result, comp);
			desktop.add(frame, plugin);
		}
	}

	public void createFrame(String title, JComponent comp) {
		ComponentFrame frame = new ComponentFrame(title, comp);
		frame.setVisible(true);
		desktop.add(frame);
		try {
			frame.setSelected(true);
		} catch (PropertyVetoException ex) {
		}
	}

	/**
	 * Adds an action to the history of this execution of the framework
	 * 
	 * @param plugin
	 *            The plugin called
	 * @param eventType
	 *            The eventType of the action. Preferably, this String should
	 *            refer to one of the public constants in
	 *            org.processmining.framework.log.LogStateMachine
	 */
	public void addAction(String actionName, Object[] parameters) {
		if (!keepLog.isSelected()) {
			return;
		}

	}

	public void addAction(Plugin plugin, Object[] parameters) {
		if (!keepLog.isSelected()) {
			return;
		}
		String actionName = "No plugin";
		if (plugin != null) {
			if (TransformingPluginCollection.getInstance()
					.isValidPlugin(plugin)) {
				actionName = "Convert: " + plugin.getName();
			} else if (ImportPluginCollection.getInstance().isValidPlugin(
					plugin)) {
				actionName = "Import : " + plugin.getName();
			}
		}
		addAction(actionName, parameters);
	}

	/**
	 * Adds a provided object to the list of global provided objects .
	 * 
	 * @param object
	 *            The ProvidedObject to add to the global provided objects.
	 */
	public void addGlobalProvidedObject(ProvidedObject object) {
		globalProvidedObjects.add(object);
	}

	/**
	 * This returns the global providedObjects known to the framework
	 * 
	 * @return ProvidedObject[]
	 */
	public ProvidedObject[] getGlobalProvidedObjects() {
		return (ProvidedObject[]) globalProvidedObjects
				.toArray(new ProvidedObject[0]);
	}

	/**
	 * This returns the providedObjects known to the framework as well as the
	 * provided objects of the selected frame.
	 * 
	 * @return ProvidedObject[]
	 */
	public ProvidedObject[] getProvidedObjects() {
		ProvidedObject[] po = new ProvidedObject[0];
		if (desktop.getSelectedFrame() instanceof Provider) {
			po = ((Provider) desktop.getSelectedFrame()).getProvidedObjects();
		} else {
			po = new ProvidedObject[0];
		}

		// Set the length to po.length + the number of global objects.
		int lpo = (po == null ? 0 : po.length);
		int lgo = globalProvidedObjects.size();
		ProvidedObject[] output = new ProvidedObject[lpo + lgo];
		if (po != null) {
			System.arraycopy(po, 0, output, 0, lpo);
		}
		System.arraycopy(globalProvidedObjects.toArray(), 0, output, lpo, lgo);
		// Now add providedObjects to output
		return output;
	}

	/**
	 * setParameters sets the input parameters used by the main() method of
	 * BKSOA Framework Note that it is assumed that logArgument is not empty;
	 * 
	 * @param miningPluginArgument
	 *            String to specify the algorithm to load. This can be the
	 *            getName() value, or the classname
	 * @param analysisPluginArgument
	 *            String to specify the algorithm to load. This can be the
	 *            getName() value, or the classname
	 * @param logArgument
	 *            String to specify the log file to read. Can start with
	 *            "zip://" etc for loading from zip.
	 * @param processArgument
	 *            String to specify the process to start mining immediately.
	 *            Note that if this argument is not empty, the framework will
	 *            include all events in the given process of the given log.
	 */
//	public void setParameters(final String miningPluginArgument,
//			final String analysisPluginArgument, final String logArgument) {
//		// Either analysisPluginArgument=="" or miningPluginArgument==""
//		SwingWorker worker = new SwingWorker() {
//
//			private Plugin plugin;
//
//			public Object construct() {
//				// Find the mining algorithm to instantiate
//				try {
//
//					plugin = AnalysisPluginCollection.getInstance().get(
//							analysisPluginArgument);
//
//					if (!(plugin instanceof DoNotCreateNewInstance)) {
//						plugin = (Plugin) plugin.getClass().newInstance();
//					}
//				} catch (InstantiationException ex) {
//					Message.add(
//							"Could not create a new instance of the selected algorithm: "
//									+ miningPluginArgument
//									+ analysisPluginArgument, Message.ERROR);
//				} catch (IllegalAccessException ex) {
//					Message.add(
//							"Could not create a new instance of the selected algorithm: "
//									+ miningPluginArgument
//									+ analysisPluginArgument, Message.ERROR);
//				} catch (NullPointerException ex) {
//					Class pluginClass = null;
//					try {
//						pluginClass = Class.forName(miningPluginArgument
//								+ analysisPluginArgument, true, Thread
//								.currentThread().getContextClassLoader());
//						plugin = (Plugin) pluginClass.newInstance();
//					} catch (ClassNotFoundException ex1) {
//						Message
//								.add(
//										"Could not create a new instance of the selected algorithm: "
//												+ miningPluginArgument
//												+ analysisPluginArgument,
//										Message.ERROR);
//					} catch (IllegalAccessException ex2) {
//						Message
//								.add(
//										"Could not create a new instance of the selected algorithm: "
//												+ miningPluginArgument
//												+ analysisPluginArgument,
//										Message.ERROR);
//					} catch (InstantiationException ex2) {
//						Message
//								.add(
//										"Could not create a new instance of the selected algorithm: "
//												+ miningPluginArgument
//												+ analysisPluginArgument,
//										Message.ERROR);
//					}
//				}
//
//				return null;
//			}
//
//			public void finished() {
//				if (plugin == null) {
//					// nothing found
//					return;
//				}
//				// No process given, so mining does not start yet
//				// final LogFile file = (LogFile) ((Object[]) get())[0];
//				// The first object equals LogFile file
//				// Two objects, which are {LogFile file, Plugin plugin}
//				Message.add("Selected log file succesfully loaded.");
//				// if (((Object[]) get()).length == 1) {
//				// // we are done
//				// return;
//				// }
//				// Now start looking for the process
//
//				// final Plugin plugin = (Plugin) ((Object[]) get())[1];
//				SwingWorker w = new SwingWorker() {
//					public Object construct() {
//						MainUI.getInstance().addAction(plugin, new Object[] {});
//
//						AnalysisInputItem item = new AnalysisInputItem(
//								"Provided Log file");
//
//						return ((AnalysisPlugin) plugin)
//								.analyse(new AnalysisInputItem[] { item });
//
//					}
//
//					public void finished() {
//						if (get() != null) {
//							MainUI.getInstance().addAction(
//									plugin,
//
//									new Object[] { ((Provider) get())
//											.getProvidedObjects() });
//
//							if (get() instanceof MiningResult) {
//								MainUI.getInstance().createVisualizationFrame(
//										"Results - " + logArgument + " using "
//												+ miningPluginArgument,
//										(MiningResult) get(), plugin);
//							} else if (get() instanceof JComponent) {
//								MainUI.getInstance().createFrame(
//										"Results - " + logArgument + " using "
//												+ analysisPluginArgument,
//										(JComponent) get());
//							}
//						}
//					}
//				};
//				w.start();
//
//			}
//		};
//		worker.start();
//	}

	class PluginReferenceAction extends CatchOutOfMemoryAction {
		private static final long serialVersionUID = -8188862992562622955L;

		public PluginReferenceAction() {
			super("Plugin reference...", MainUI.this.desktop);
			putValue(SHORT_DESCRIPTION, "Info about all available plugins");
			putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_P));
		}

		public void execute(ActionEvent e) {
			reference.show(PluginReference.INDEX);
		}

		public void handleOutOfMem() {

		}
	}

	class ParametersAction extends CatchOutOfMemoryAction {
		private static final long serialVersionUID = 7251235522376726283L;

		public ParametersAction() {
			super("CMD-Parameters", MainUI.this.desktop);
			putValue(SHORT_DESCRIPTION,
					"Info about the possible command line options.");
			putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_C));
		}

		public void execute(ActionEvent e) {
			final JDialog dialog = new JDialog(MainUI.this,
					"Command line parameters", true);

			String args = About.getCommandLineArgumentsHTML();
			JLabel argLabel = new JLabel(args);

			JButton okButton = new JButton("    Ok    ");

			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dialog.setVisible(false);
				}
			});

			dialog.getContentPane().setLayout(new GridBagLayout());

			dialog.getContentPane().add(
					argLabel,
					new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.NONE,
							new Insets(5, 5, 5, 5), 0, 0));
			dialog.getContentPane().add(
					okButton,
					new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
							GridBagConstraints.CENTER, GridBagConstraints.NONE,
							new Insets(15, 5, 5, 5), 0, 0));

			dialog.pack();
			CenterOnScreen.center(dialog);
			dialog.setVisible(true);
		}

		public void handleOutOfMem() {
		}
	}

	class AboutAction extends CatchOutOfMemoryAction {
		private static final long serialVersionUID = -5045915200909781363L;

		public AboutAction() {
			super("About...", MainUI.this.desktop);
			putValue(SHORT_DESCRIPTION, "Info about the " + About.NAME);
			putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_A));
		}

		public void execute(ActionEvent e) {
			About about = new About(MainUI.this);

			about.setVisible(true);
		}

		public void handleOutOfMem() {
		}
	}

	public void toggleNavigationPanelVisible() {
		if (desktopAndNavigation != null) {
			navigationPanel.setVisible(false);
			contentPanel.remove(desktopAndNavigation);
			desktopAndNavigation = null;
			contentPanel.add(desktop, BorderLayout.CENTER);
			contentPanel.revalidate();
		} else {
			navigationPanel.setVisible(true);
			desktopAndNavigation = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					desktop, navigationPanel);
			desktopAndNavigation.setOneTouchExpandable(true);
			desktopAndNavigation.setResizeWeight(1);
			desktopAndNavigation.setDividerSize(3);
			desktopAndNavigation.setBorder(null);
			contentPanel.remove(desktop);
			contentPanel.add(desktopAndNavigation, BorderLayout.CENTER);
			contentPanel.revalidate();
			desktopAndNavigation.setDividerLocation(this.getWidth() - 300);
		}
	}
}
