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
package edu.xjtu.cdl2bpel.framework;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import att.grappa.Grappa;
import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.ui.About;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.Message;
import edu.xjtu.cdl2bpel.ui.SwingWorker;
import edu.xjtu.cdl2bpel.ui.TransformingPluginCollection;

/*
 * Main class of the SOA Framework. All Plugins are loaded and the
 * <code>MainUI</code> is shown.
 * 
 * @author Dang Trung Anh(dangtrunganh@gmail.com)
 * 
 * @version 1.5
 * 
 * @since 1.0
 */

public class CDL2BPELValidateFramework {

	protected static CDL2BPELValidateFrameworkSplash splash;

	public final static String IMPORTS_FILE = "import.ini";
	public final static String EXPORTS_FILE = "export.ini";
	public final static String CONVERT_FILE = "transform.ini";
	public final static String CONTRIB_FILE = "recommendations.ini";
	public final static String SCALE_FILE = "scales.ini";
	public final static String LOGFILTER_FILE = "logfilters.ini";

	private static String logArgument = "";
	private static String miningPluginArgument = "";
	private static String processArgument = "";

	private static void printArgs() {
		System.out.println(About.getCommandLineArguments());
	}

	public static void main(String[] args) {

		String[] a = new String[args.length];
		for (int i = 0; i < args.length; i++) {
			a[i] = new String(args[i]);
		}

		final boolean argsGiven = args.length > 0;

		if ((args.length > 0)) {
			for (int i = 0; i < args.length; i++) {
				if (args[i].indexOf("-?") > -1) {
					printArgs();
					return;
				} else if (args[i].startsWith("--L")) {
					// LogFile given as input
					logArgument = args[i].substring(3).trim();
				} else if (args[i].startsWith("--V")) {
					// Version asked
					System.out.println(About.VERSION);
					return;
				} else if (args[i].startsWith("--M")) {
					// Mining Algorithm given as input
					miningPluginArgument = args[i].substring(3).trim();
				} else {
					// Unknown command line argument encountered
					printArgs();
					return;
				}
			}
		}

		if (!miningPluginArgument.equals("") && logArgument.equals("")) {
			// --M is given, but --L is not.
			printArgs();
			return;
		}

		if (logArgument.equals("") && !miningPluginArgument.equals("")) {
			// --L not given while --M or --P are OR
			printArgs();
			return;
		}

		// create and open splash screen
		splash = new ImageSplash();
		splash.changeText("Working directory: "
				+ System.getProperty("user.dir"), Message.DEBUG);
		// splash = new ClassicSplash();

		// exchange class loader
		/*
		 * ClassLoader currentCl =
		 * Thread.currentThread().getContextClassLoader(); ClassLoader
		 * extendedCl = URLClassLoader.newInstance(getClasspathExtensionUrls(),
		 * currentCl); Thread.currentThread().setContextClassLoader(extendedCl);
		 */
		for (URL url : getClasspathExtensionUrls()) {
			try {
				ClassPathHacker.addURL(url);
				splash.changeText("Added extension: " + url.toString(),
						Message.DEBUG);
				// System.out.println("Extending classpath with URL " +
				// url.toString());
			} catch (IOException e) {
				System.err
						.println("ERROR: Could not extend classpath with URL "
								+ url.toString());
				e.printStackTrace();
			}
		}

		// Set buffered log reader implementation as default choice

		/*
		 * final String logArgument = logArgument.trim(); final String
		 * algArgument = miningPluginArgument.trim(); final String proArgument =
		 * processArgument.trim();
		 */

		splash.setProgress(10);

		SwingWorker sw = new SwingWorker() {
			public Object construct() {

				splash.changeText("Import Plugins", Message.NORMAL);
				ImportPluginCollection.getInstance().loadFromIni(
						System.getProperty("user.dir", "")
								+ System.getProperty("file.separator")
								+ IMPORTS_FILE, splash);
				splash.setProgress(55);
				ImportPluginCollection.getInstance().loadFromIni(
						System.getProperty("user.home", "")
								+ System.getProperty("file.separator")
								+ IMPORTS_FILE, splash);
				splash.setProgress(60);
				

				splash.changeText("Conversion Plugins", Message.NORMAL);
				TransformingPluginCollection.getInstance().loadFromIni(
						System.getProperty("user.dir", "")
								+ System.getProperty("file.separator")
								+ CONVERT_FILE, splash);
				splash.setProgress(75);
				TransformingPluginCollection.getInstance().loadFromIni(
						System.getProperty("user.home", "")
								+ System.getProperty("file.separator")
								+ CONVERT_FILE, splash);
				splash.setProgress(80);

				splash
						.changeText("Recommendation Contributors",
								Message.NORMAL);

				splash.setProgress(100);

				splash.changeText("Starting CDL2BPEL Framework", Message.NORMAL);

				new MainUI();

				return null;
			}

			public void finished() {
				Grappa.edgeLabelsScaleCutoff = 0.0;
				Grappa.nodeLabelsScaleCutoff = 0.0;
				Grappa.subgLabelsScaleCutoff = 0.0;

				ArrayList log = splash.getLog();
				Iterator it = log.iterator();
				while (it.hasNext()) {
					Message.add((String) it.next(), ((Integer) it.next())
							.intValue());
				}
				MainUI.getInstance().setVisible(true);
				MainUI.getInstance().toFront();

				if (argsGiven) {
//					MainUI.getInstance().setParameters(miningPluginArgument,
//							analysisPluginArgument, logArgument);
				}
				Message.add("SOA Framework Initialized");
				splash.close();
				// add beta warning
				if (About.VERSION.matches("(.*)[Bb][Ee][Tt][Aa](.*)") == true) {
					File logoFile = new File(
							"./images/icons/default/applogo_small.png");
					ImageIcon logo = new ImageIcon(logoFile.getAbsolutePath());
					if (logoFile.exists() == false) {
						System.err.println("logo not found! ("
								+ logoFile.getAbsolutePath() + ")");
					}
					JOptionPane
							.showMessageDialog(
									MainUI.getInstance(),
									"\nYou are using a BETA pre-release version of ProM!\n\n"
											+ "Please be aware that there may be still critical bugs in this\n"
											+ "version, so it is not suitable for reliable production use!\n"
											+ "We appreciate your feedback about any bugs or shortcomings.\n\n"
											+ "Please check http://prom.sourceforge.net/ regularly and download\n"
											+ "the next release version, when available.\n\n"
											+ "Thank you for helping us test the next ProM release!\n",
									"You are using a ProM BETA version!",
									JOptionPane.INFORMATION_MESSAGE, logo);
				}
			}
		};
		sw.start();

	}

	/**
	 * Scans all standard extension directories (provided by
	 * <code>getExtensionLibraryDirectories()</code> for contained jar files.
	 * The locations of all found jar files are added to an URL array which is
	 * returned.
	 * 
	 * @return URLs of all found extension jar files
	 */
	private static final URL[] getClasspathExtensionUrls() {
		ArrayList urlList = new ArrayList(); // stores all discovered jar URLs
		// check each extension directory for contained jar files
		for (Iterator it = getExtensionLibraryDirectories().iterator(); it
				.hasNext();) {
			File[] fileList = (((File) it.next()).listFiles());
			// iterate over all files found in the current extension directory
			for (int i = 0; i < fileList.length; i++) {
				// check for file names ending with 'jar'
				if ((fileList[i].getAbsolutePath().substring(
						fileList[i].getAbsolutePath().length() - 3)
						.equalsIgnoreCase("jar"))
						&& (!fileList[i].getAbsolutePath().substring(
								fileList[i].getAbsolutePath().length() - 9)
								.equalsIgnoreCase(File.separator + "prom.jar"))) {
					try {
						urlList.add(fileList[i].toURL());
						splash.changeText("Loaded jar from file "
								+ fileList[i].getAbsolutePath(), Message.DEBUG);
					} catch (Exception e) {
						splash.changeText("failed to derive jar from file "
								+ fileList[i].getAbsolutePath(), Message.ERROR);
						e.printStackTrace();
					}
				}
			}
		}
		// copy all values to a result array
		URL result[] = new URL[urlList.size()];
		for (int i = 0; i < urlList.size(); i++) {
			result[i] = (URL) urlList.get(i);
		}
		return result;
	}

	/**
	 * Get the location of all directories in this installation containing
	 * extension jars, i.e. plugins, JDBC driver jars, etc.
	 * 
	 * @return an ArrayList containing the directories as File instances
	 */
	private static final ArrayList getExtensionLibraryDirectories() {
		ArrayList dirs = new ArrayList();
		// the plugin and framework folder can be determined and added
		// dynamically
		dirs.add(new File(getPluginFolderLocation()));
		dirs.add(new File(getExternalFolderLocation()));
		dirs.add(new File(getModelFolderLocation()));
		// and that's it
		return dirs;
	}

	/**
	 * Retrieves the location where dynamically loaded plugins are store and
	 * loaded from. "./lib/plugins"
	 * 
	 * @return path to plugins folder
	 */
	private static String getPluginFolderLocation() {
		new File(About.PLUGINLOCATION()).mkdirs();
		return About.PLUGINLOCATION();
	}

	/**
	 * Retrieves the location where dynamically loaded external resources are
	 * store and loaded from. "./lib/external"
	 * 
	 * @return path to plugins folder
	 */
	private static String getExternalFolderLocation() {
		new File(About.EXTLIBLOCATION()).mkdirs();
		return About.EXTLIBLOCATION();
	}

	/**
	 * Retrieves the location where dynamically loaded models are store and
	 * loaded from. "./lib/models"
	 * 
	 * @return path to plugins folder
	 */
	private static String getModelFolderLocation() {
		new File(About.MODELLOCATION()).mkdirs();
		return About.MODELLOCATION();
	}

}
