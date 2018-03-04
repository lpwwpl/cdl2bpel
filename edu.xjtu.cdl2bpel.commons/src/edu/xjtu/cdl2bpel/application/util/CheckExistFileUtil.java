package edu.xjtu.cdl2bpel.application.util;

public class CheckExistFileUtil {

	public static boolean isExistFileInPath(String path1,String path2) {
		if(path1.equals(path2)) {
			return true;
		}
		return false;
	}
}
