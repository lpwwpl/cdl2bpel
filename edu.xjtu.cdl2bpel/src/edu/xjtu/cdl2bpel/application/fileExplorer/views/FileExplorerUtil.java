package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;

public class FileExplorerUtil {

	public FileExplorerUtil() {
	}

	public static void removeMyTreeNodeFromRoot(MyTreeNode[] myTreeNode) {
		for (int i = 0; i < myTreeNode.length; i++) {
			removeMyTreeNodeFromRoot(myTreeNode[i]);
		}
	}

	public static void removeMyTreeNodeFromRoot(MyTreeNode myTreeNode) {
		FileExplorer.getRoot().delete(myTreeNode);
	}

	public static void removeFileFolder(MyTreeNode[] myTreeNode) {
		for (int i = 0; i < myTreeNode.length; i++) {
			File file = (File) myTreeNode[i].getValue();
			if (file.isFile()) {
				file.delete();
			} else {
				delFolder(file.getAbsolutePath());
			}
		}
	}

	public static void removeFileFolder(MyTreeNode myTreeNode) {

		File file = (File) myTreeNode.getValue();
		delAllFile(file.getAbsolutePath());
	}

	public static void delFolder(String folderPath) {
		try {
			delAllFile(folderPath); // 删除完里面所有内容
			String filePath = folderPath;
			filePath = filePath.toString();
			java.io.File myFilePath = new java.io.File(filePath);
			myFilePath.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean delAllFile(String path) {
		boolean flag = false;
		File file = new File(path);
		if (!file.exists()) {
			return flag;
		}
		if (!file.isDirectory()) {
			return flag;
		}
		String[] tempList = file.list();
		File temp = null;
		for (int i = 0; i < tempList.length; i++) {
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				temp = new File(path + File.separator + tempList[i]);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			if (temp.isDirectory()) {
				delAllFile(path + "/" + tempList[i]);
				delFolder(path + "/" + tempList[i]);
				flag = true;
			}
		}
		return flag;
	}

	public static IPath getPathForLocation(String path) {
		if (path == null)
			return null;
		else
			return new Path(path);
	}
}
