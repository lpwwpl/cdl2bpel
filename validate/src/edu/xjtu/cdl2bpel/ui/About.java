/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                http://www.selab.edu.vn                  *
 *                                                         *
 **********************************************************/

package edu.xjtu.cdl2bpel.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import edu.xjtu.cdl2bpel.plugin.ImportPluginCollection;
import edu.xjtu.cdl2bpel.utils.CenterOnScreen;

/**
 * <p>
 * Title: About
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
 * @version 2.1
 */
public class About extends JDialog {
	public final static String NAME = "CDL2BPELValidate FRAMEWORK";
	public final static String NAME_FULL = "<html><center>The <B>S</B>O<B>A </B>Framework<br>"
			+ "A Framework for Varify CDL.</center></html>";
	public final static String VERSION = "0.1";
	public final static String VERSION_DATE = "May 28, 2011";
	public final static String AUTHOR_INFOR = "Lin Peiwen";

	public final static String INFO = "<html><center>Version:&nbsp;&nbsp;"
			+ About.VERSION + "<br>Released:&nbsp;&nbsp;" + VERSION_DATE
			+ "</center></html>";
	public final static String MACHINE = System.getProperty("os.name", "")
			+ " on " + System.getProperty("os.arch", "") + ".";

	/**
	 * HELPLOCATION stores the location of the help files, i.e. "user.dir" +
	 * File.separator + "lib" + file.separator + "documentation" +
	 * file.separator
	 */
	public static String HELPLOCATION() {
		return System.getProperty("user.dir") + File.separator + "lib"
				+ File.separator + "documentation" + File.separator;
	}

	/**
	 * EXTLIBLOCATION stores the location of the external library files, i.e.
	 * "user.dir" + File.separator + "lib" + file.separator + "external" +
	 * file.separator
	 */
	public static String EXTLIBLOCATION() {
		return System.getProperty("user.dir") + File.separator + "lib"
				+ File.separator + "external" + File.separator;
	}

	/**
	 * PLUGINLOCATION stores the location of the plugin files, i.e. "user.dir" +
	 * File.separator + "lib" + file.separator + "plugins" + file.separator
	 */
	public static String PLUGINLOCATION() {
		return System.getProperty("user.dir") + File.separator + "lib"
				+ File.separator + "plugins" + File.separator;
	}

	/**
	 * MODELLOCATION stores the location of the model files, i.e. "user.dir" +
	 * File.separator + "lib" + file.separator + "models" + file.separator
	 */
	public static String MODELLOCATION() {
		return System.getProperty("user.dir") + File.separator + "lib"
				+ File.separator + "models" + File.separator;
	}

	/**
	 * IMAGELOCATION stores the location of the image files, i.e. "user.dir" +
	 * File.separator + "lib" + file.separator + "images" + file.separator
	 */
	public static String IMAGELOCATION() {
		return System.getProperty("user.dir") + File.separator + "images"
				+ File.separator;
	}

	/**
	 * CORPORATEIMAGELOCATION stores the location of the corporate image files,
	 * i.e. "user.dir" + File.separator + "lib" + file.separator + "images" +
	 * file.separator + "corporate" + file.separator
	 */
	public static String CORPORATEIMAGELOCATION() {
		return System.getProperty("user.dir") + File.separator + "images"
				+ File.separator + "corporate" + File.separator;
	}

	/**
	 * WATERMARKIMAGELOCATION stores the location of the corporate image files,
	 * i.e. "user.dir" + File.separator + "lib" + file.separator + "images" +
	 * file.separator + "watermark" + file.separator
	 */
	public static String WATERMARKIMAGELOCATION() {
		return System.getProperty("user.dir") + File.separator + "images"
				+ File.separator + "watermark" + File.separator;
	}

	private final static String PARAMETERS = "<html>"
			+ "<table valign=top>"
			+ "<tr><td colspan=3>The BKSOA Framework framework accepts the following input parameters:<br></td></tr>"
			+

			"<tr><td>--?  </td><td colspan=2>Shows this help message<br></td></tr>"
			+

			"<tr><td>--V  </td><td colspan=2>Shows the current version number<br></td></tr>"
			+

			"<tr><td>--L  </td><td colspan=2>Filename of the LogFile to start with in one of two forms:</td></tr>"
			+ "<tr><td></td><td>1)</td><td>The full path to an XML log file.</td></tr>"
			+ "<tr><td></td><td>2)</td><td>The full path to a ZIP file containing an XML log. In this case, the argument<br>"
			+ "should start with \"zip://\"followed by a zip file, followed by \"#\", <br>"
			+ "followed by the filename in the archive.<br></td></tr>"
			+

			"<tr><td>--M  </td><td colspan=2>Name of the mining plugin to instantiate (requires --L).<br>"
			+ "This argument can have two forms:</td></tr>"
			+ "<tr><td></td><td>1)</td><td>The name of the plugin as given by its getName()</td></tr>"
			+ "<tr><td></td><td>2)</td><td>The full classname of the plugin<br></td></tr>"
			+

			// "<tr><td>--P  </td><td colspan=2>name of the process to mine. (requires --L AND --M)<br>"
			// +
			// "Should contain the ID of the process to mine. If this argument is given,<br>"
			// +
			// "the framework starts mining immediately including all events of the given process.</td></tr>"
			// +

			"<tr><td>--A  </td><td colspan=2>Name of the analysis plugin to instantiate.<br>"
			+ "If this argument is given, the framework starts analysis immediately on the given log file,<br>"
			+ " assuming that such a log file is accepted by the analysis plugin.<br>"
			+ "If no log file is given, the plugin is started without parameters.<br>"
			+ "This argument can have two forms:</td></tr>"
			+ "<tr><td></td><td>1)</td><td>The name of the plugin as given by its getName()</td></tr>"
			+ "<tr><td></td><td>2)</td><td>The full classname of the plugin<br></td></tr>"
			+

			"<tr><td colspan=3>Note that --M and --A should not both be given.<br></td></tr>"
			+

			"</table>" + "</html>";

	/**
	 * Returns information about the optional command-line parameters of the SOA
	 * framework in a String, containing \n as the linebreak character.
	 * 
	 * @return String
	 */
	public static String getCommandLineArguments() {
		return unHTML(PARAMETERS.replaceAll("<br>", "\n     ").replaceAll(
				"<td></td>", "     "));
	}

	/**
	 * unHTML removes HTML tags from a string. It replaces the following
	 * substrings (in this order): <br>
	 * 1) "</tr>" is replaced by "\n" 2) "<&nbsp;>" is replaced by " " 3) "<br>
	 * " is replaced by "\n" 4) "<....>" is replaced by "" (any html tag)
	 * 
	 * @param htmlString
	 *            String
	 * @return String
	 */
	private static String unHTML(String htmlString) {
		return htmlString.replaceAll("</tr>", "\n").replaceAll("&nbsp;", " ")
				.replaceAll("<br>", "\n").replaceAll("<[^<>]*>", "");
	}

	/**
	 * Returns information about the optional command-line parameters of the
	 * BKSOA framework in an HTML formatted String.
	 * 
	 * @return String
	 */
	public static String getCommandLineArgumentsHTML() {
		return PARAMETERS;
	}

	public About(JFrame owner) {
		super(owner, "About", true);

		JButton okButton = new JButton("    Ok    ");

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		getContentPane().setLayout(new GridBagLayout());

		String promLogo = System.getProperty("user.dir", "")
				+ System.getProperty("file.separator") + "images"
				+ System.getProperty("file.separator") + "icon48.gif";

		// use custom application logo, if available
		String customIconPath = UISettings.getInstance()
				.getPreferredIconTheme()
				+ "/applogo_small.png";
		if ((new File(customIconPath)).exists()) {
			promLogo = customIconPath;
		}

		JEditorPane sponsorPane = new JEditorPane();
		sponsorPane.setEditorKit(new ProMHTMLEditorKit(IMAGELOCATION()));
		sponsorPane
				.setText("<html><table> <tr> <td><b>Huynh Quyet Thang, Phd</b></td>"
						+ "</tr> <tr> <td>Dean of Faculty Information Technology, Hanoi University of Technology</td>"
						+ "</tr> <tr> <td>Associate Professor, Department of Software Engineering (DSE)</td> </tr> </table>"
						+ "<table> <tr> <td><b>Pham Thi Quynh, Ms</b></td>"
						+ "</tr> <tr> <td>Faculty Information Technology, Hanoi National University of Education</td>"
						+ "</tr> </table></html>");

		sponsorPane.setEditable(false);
		sponsorPane.setBackground(this.getBackground());

		JLabel nameLabel = new JLabel(About.NAME);
		nameLabel.setFont(new Font(nameLabel.getFont().getName(), nameLabel
				.getFont().getStyle(), nameLabel.getFont().getSize() + 2));

		JLabel pluginCountLabel = new JLabel(
				"<html><table> <tr><td colspan=4>Number of Plugins loaded:<br></td></tr>"						
						+
						"<tr><td>Transform: </td><td align=right>"
						+ TransformingPluginCollection.getInstance().size()
						+ "</td>"

						+ "<tr><td colspan=3>Global objects (session):</td><td colspan=1 align=right>"
						+ (int) MainUI.getInstance().getGlobalProvidedObjects().length
						+ "</td></tr>"
						+ "<tr><td colspan=2 align=center><B><br>Total:</td><td colspan=2  align=center><B><br>"
						+ (+ TransformingPluginCollection.getInstance()
										.size()
								+ ImportPluginCollection.getInstance().size()
								+ MainUI
								.getInstance().getGlobalProvidedObjects().length)
						+ "</td></tr>" + "</table></html>");

		getContentPane().add(
				new JLabel(new ImageIcon(promLogo)),
				new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(5, 5, 5, 5), 0, 0));
		getContentPane().add(
				nameLabel,
				new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		getContentPane().add(
				new JLabel(About.NAME_FULL),
				new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		getContentPane().add(
				new JLabel(About.INFO),
				new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		getContentPane().add(
				new JLabel("Copyright ?2008-2009 by " + About.AUTHOR_INFOR),
				new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		getContentPane().add(
				new JLabel("Department of Software Engineering, FIT, HUT"),
				new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));

		JPanel sponsorPanel = new JPanel(new GridBagLayout());
		sponsorPanel.add(
				new JLabel("<html>This work is sponsored by: </html>"),
				new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		sponsorPanel.add(sponsorPane, new GridBagConstraints(0, 2, 1, 1, 0.0,
				0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(15, 5, 5, 5), 0, 0));

		JPanel pluginPanel = new JPanel(new GridBagLayout());
		pluginPanel.add(pluginCountLabel, new GridBagConstraints(0, 0, 1, 1,
				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE,
				new Insets(15, 5, 5, 5), 0, 0));

		JTabbedPane tabPane = new JTabbedPane();
		tabPane.addTab("Sponsors", sponsorPanel);
		tabPane.addTab("Plugins", pluginPanel);

		JLabel holubLabel = new JLabel(
				"<html>This program contains DOT utility.<br>"
						+ "(c) AT&T Labs Research. All Rights Reserved.<br>"
						+ "http://www.research.att.com/</html>");
		JPanel holubPanel = new JPanel(new BorderLayout());
		holubPanel.add(holubLabel);
		tabPane.addTab("Acknowledgements", holubPanel);

		JPanel systemInfoPanel = new JPanel(new GridBagLayout());
		systemInfoPanel.add(new JLabel(getSystemInfo()),
				new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		tabPane.addTab("System", systemInfoPanel);
		JPanel projectInfoPanel = new JPanel(new GridBagLayout());
		projectInfoPanel.add(new JLabel(getProjectInfo()),
				new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		tabPane.addTab("Project Info", projectInfoPanel);

		getContentPane().add(
				tabPane,
				new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));

		getContentPane().add(
				okButton,
				new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
						GridBagConstraints.CENTER, GridBagConstraints.NONE,
						new Insets(15, 5, 5, 5), 0, 0));
		pack();
		CenterOnScreen.center(this);
	}

	private String getProjectInfo() {

		return "<html><table> <tr> <td><b>Project Leader : Dang Trung Anh</b></td>"
				+ "</tr> <tr> <td>Developers : 2</td>"
				+ "</tr> <tr> <td>Project Type: Framework</td> </tr> </table>"
				+ "<table> <tr> <td><b>Registered : 2009-02-15 17:40</b></td>"
				+ "</tr> <tr> <td>Email: dangtrunganh@gmail.com</td>"
				+ "</tr> </table>"
				+ "<tr> <td>Web: https://sourceforge.net/projects/soaanalystframe/</td></tr></html>";

	}

	private String getSystemInfo() {
		return "<html><table>" + "<tr><td>Java version:</td><td>"
				+ nz(System.getProperty("java.version")) + " ("
				+ nz(System.getProperty("java.vendor")) + ")</td></tr>"
				+ "<tr><td>Virtual machine:</td><td>"
				+ nz(System.getProperty("java.vm.version")) + " ("
				+ nz(System.getProperty("java.vm.vendor")) + ")</td></tr>"
				+ "<tr><td>&nbsp;</td><td>"
				+ nz(System.getProperty("java.vm.name")) + " "
				+ nz(System.getProperty("java.vm.info")) + "</td></tr>"
				+ "<tr><td>Home directory:</td><td>"
				+ nz(System.getProperty("java.home")) + "</td></tr>"
				+ "<tr><td colspan=2>&nbsp;</td></tr>"
				+ "<tr><td>Operating system:</td><td>"
				+ nz(System.getProperty("os.name")) + " "
				+ System.getProperty("sun.os.patch.level") + "</td></tr>"
				+ "<tr><td>Version:</td><td>"
				+ nz(System.getProperty("os.version")) + "</td></tr>"
				+ "<tr><td>Architecture:</td><td>"
				+ nz(System.getProperty("os.arch")) + "</td></tr>"
				+ "</table></html>";
	}

	private String nz(String s) {
		return s == null ? "<unknown>" : s;
	}
}
