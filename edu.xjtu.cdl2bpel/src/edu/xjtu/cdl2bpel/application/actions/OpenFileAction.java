package edu.xjtu.cdl2bpel.application.actions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.application.util.MyEditorInput;
import edu.xjtu.cdl2bpel.application.util.MyFileEditorInput;

public class OpenFileAction extends Action implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow fWindow;

	public OpenFileAction(IWorkbenchWindow fWindow) {
		setId("Open CDL");
		setText("Open CDL");
		this.fWindow = fWindow;
	}

	public void dispose() {
		fWindow = null;

	}

	public void init(IWorkbenchWindow window) {
		fWindow = window;

	}

	public void run(IAction action) {
		run();

	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	public void copyFile(File sourceFile, File targetFile) throws IOException {
		// 新建文件输入流并对它进行缓冲
		FileInputStream input = new FileInputStream(sourceFile);
		BufferedInputStream inBuff = new BufferedInputStream(input);

		// 新建文件输出流并对它进行缓冲
		FileOutputStream output = new FileOutputStream(targetFile);
		BufferedOutputStream outBuff = new BufferedOutputStream(output);

		// 缓冲数组
		byte[] b = new byte[1024 * 5];
		int len;
		while ((len = inBuff.read(b)) != -1) {
			outBuff.write(b, 0, len);
		}
		// 刷新此缓冲的输出流
		outBuff.flush();

		// 关闭流
		inBuff.close();
		outBuff.close();
		output.close();
		input.close();
	}

	public File getFolderOfSelectedMyTreeNode(File file) {
		if (file.isDirectory()) {
			return file;
		} else {
			return getFolderOfSelectedMyTreeNode(file.getParentFile());
		}
	}

	public MyTreeNode getParentMyTreeNode(MyTreeNode node) {
		if (((File) node.getValue()).isDirectory()) {
			return node;
		} else {
			return getParentMyTreeNode(node.getParent());
		}
	}

	public void run() {
		// Job
		final File file = queryFile();
		if (file != null) {
			try {
				File myFile = new File(getFolderOfSelectedMyTreeNode(
						((File) FileExplorer.getSelectMyTreeNode().getValue()))
						.getAbsolutePath()
						+ "\\" + file.getName());
				copyFile(file, myFile);
				MyTreeNode childNode = new MyTreeNode(myFile);

				if (!FileExplorer.getSelectMyTreeNode().getObjectEqual(
						childNode)) {
					FileExplorer.getSelectMyTreeNode().getChildren().add(
							childNode);
					childNode.setParent(FileExplorer.getSelectMyTreeNode());
					FileExplorer.getViewer().add(childNode.getParent(),
							childNode);
				}
				IEditorInput input = createEditorInput(myFile);//				
				IWorkbenchPage page = fWindow.getActivePage();
				MyEditorInput inputForm = new MyEditorInput(input);
				if (((MyFileEditorInput) inputForm.getInputFile()).getPath()
						.toString().endsWith(".cdl")) {

					page.openEditor(inputForm,
							"edu.xjtu.cdl2bpel.designer.CDLViewer");
				} else if (((MyFileEditorInput) inputForm.getInputFile())
						.getPath().toString().endsWith(".bpel")
						|| ((MyFileEditorInput) inputForm.getInputFile())
								.getPath().toString().endsWith(".wsdl")) {
					page.openEditor(inputForm, "edu.xjtu.cdl2bpel.editors.xml");
				} else if (((MyFileEditorInput) inputForm.getInputFile())
						.getPath().toFile().isFile()) {
					page.openEditor(inputForm,
							"edu.xjtu.cdl2bpel.editors.simpleEditor");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (file != null) {
			String msg = MessageFormat.format(
					"File is null: {0}", new String[] { file.getName() }); //$NON-NLS-1$
			MessageDialog.openWarning(fWindow.getShell(), "Problem", msg); //$NON-NLS-1$
		}
	}

	private IEditorInput createEditorInput(File file) {
		// TODO Auto-generated method stub
		IPath location = new Path(file.getAbsolutePath());
		MyFileEditorInput input = new MyFileEditorInput(file);
		return input;
	}

	private File queryFile() {
		FileDialog dialog = new FileDialog(fWindow.getShell(), SWT.OPEN);
		dialog.setText("Open CDL File");
		String path = dialog.open();
		if (path != null && path.length() > 0)
			return new File(path);
		return null;
	}
}
