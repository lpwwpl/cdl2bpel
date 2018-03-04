package edu.xjtu.cdl2bpel.common.eclipse;

import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

public class ClasspathContainerInitializer extends
		org.eclipse.jdt.core.ClasspathContainerInitializer {

	public void initialize(IPath containerPath, IJavaProject project)
			throws CoreException {

		Bundle bundle = org.eclipse.core.runtime.Platform
				.getBundle(Constants.CDL2BPELMAPPING_MODULE);
		URL baseurl = bundle.getEntry("/");
		try {
			baseurl = org.eclipse.core.runtime.Platform.resolve(baseurl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String base = baseurl.getFile();
		java.io.File f = new java.io.File(base);
		base = f.getPath().replace('\\', '/');

		String jarbase = base;

		f = new java.io.File(jarbase);

		String p = f.toString();
		p += "/runtime/" + Constants.CDL2BPELMAPPING_MODULE + ".jar";

		Path path = new Path(p);

		IClasspathEntry lib = JavaCore.newLibraryEntry(path, null, null, false);

		final IClasspathEntry[] libs = new IClasspathEntry[] { lib };

		JavaCore
				.setClasspathContainer(
						new Path(Constants.CDL2BPELMapping_VARIABLE),
						new IJavaProject[] { project },
						new org.eclipse.jdt.core.IClasspathContainer[] { new org.eclipse.jdt.core.IClasspathContainer() {
							public IClasspathEntry[] getClasspathEntries() {
								return libs;
							}

							public String getDescription() {
								return Constants.CDL2BPELMapping_VARIABLE;
							}

							public int getKind() {
								return org.eclipse.jdt.core.IClasspathContainer.K_SYSTEM;
							}

							public IPath getPath() {
								return new Path(
										Constants.CDL2BPELMapping_VARIABLE);
							}
						} }, null);
	}
}
