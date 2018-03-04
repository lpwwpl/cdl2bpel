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

package edu.xjtu.cdl2bpel.action;

import java.awt.event.ActionEvent;

import edu.xjtu.cdl2bpel.plugin.ImportPlugin;
import edu.xjtu.cdl2bpel.ui.MDIDesktopPane;
import edu.xjtu.cdl2bpel.ui.MainUI;
import edu.xjtu.cdl2bpel.ui.Message;
import edu.xjtu.cdl2bpel.ui.UISettings;
import edu.xjtu.cdl2bpel.ui.Utils;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.0
 */

public class ImportFileAction extends CatchOutOfMemoryAction {

	private ImportPlugin algorithm;

	public ImportFileAction(ImportPlugin algorithm, MDIDesktopPane desktop) {
		this(algorithm, desktop, "Open " + algorithm.getName());
	}

	public ImportFileAction(ImportPlugin algorithm, MDIDesktopPane desktop,
			String label) {
		super(label, desktop);
		this.algorithm = algorithm;
	}

	public void execute(ActionEvent e) {
		String filename = Utils.openImportFileDialog(MainUI.getInstance(),
				algorithm.getFileFilter());
		if (filename.equals("")) {
			return;
		}

		UISettings.getInstance().addRecentFile(filename, algorithm.getName());
		UISettings.getInstance().setLastOpenedImportFile(filename);

		MainUI.getInstance().importFromFile(algorithm, filename);
	}

	public void handleOutOfMem() {
		Message.add("File to big for import: Out Of Memory");
	}
}
