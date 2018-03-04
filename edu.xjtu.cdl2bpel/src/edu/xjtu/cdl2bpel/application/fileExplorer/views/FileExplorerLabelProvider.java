package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.io.File;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.plugin.PluginImages;

public class FileExplorerLabelProvider extends LabelProvider implements IBaseLabelProvider {
	//set the image 
	public Image getImage(Object element) {
		if(((File)((MyTreeNode)element).getValue()).isDirectory()) {
			return PluginImages.getImage("fldr_obj.gif");
		}
		if(getExtention(((File)((MyTreeNode)element).getValue()).getName()).equals("zip")) {
			return PluginImages.getImage("zip.gif");
		}
		return PluginImages.getImage("file_obj.gif");
	}

	public static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		String result = fileName.substring(pos+1);
		return result;
	}
	
	public String getText(Object element) {
		String str = ((File)((MyTreeNode)element).getValue()).getName();
		return element == null ? "" : str;
	}
}
