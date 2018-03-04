package edu.xjtu.cdl2bpel.common;

import java.io.File;
import java.util.logging.Logger;

public class FileSystemArtifactManager implements MyArtifactManager {

	public FileSystemArtifactManager(String rootFolder) {
		m_rootFolder = rootFolder;
	}

	public MyArtifact[] getArtifacts(String component, String category,
			String artifactType) throws MyArtifactException {
		MyArtifact[] ret = null;
		String extension = "." + artifactType;
		java.util.Vector list = new java.util.Vector();

		String path = getComponentFolder(component, category);

		File f = new File(path);

		if (f.exists() && f.isDirectory()) {

			File[] filelist = f.listFiles();

			for (int i = 0; ret == null && filelist != null
					&& i < filelist.length; i++) {

				if (filelist[i].getName().endsWith(extension)) {

					try {
						java.io.InputStream is = new java.io.FileInputStream(
								filelist[i]);

						MyArtifact art = new DefaultArtifact(filelist[i]
								.getPath(), is);

						list.add(art);
					} catch (Exception e) {
						logger
								.severe("Failed to create input stream for file '"
										+ filelist[i].getName() + "'");
					}
				}
			}
		}

		ret = new MyArtifact[list.size()];
		list.copyInto(ret);

		return (ret);
	}

	protected String getComponentFolder(String component, String category) {
		String ret = null;

		ret = m_rootFolder + java.io.File.separator + component + "_"
				+ category;

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.resource");

	private String m_rootFolder = null;
}
