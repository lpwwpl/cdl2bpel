package edu.xjtu.cdl2bpel.common.eclipse;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

public class BundleUtil {

	public static String[] getClasspathEntries() {
		String[] ret = null;

		synchronized (m_pendingBundles) {
			long startTime = System.currentTimeMillis();
			boolean failed = false;
			boolean waited = false;

			while (failed == false
					&& (m_pendingBundles.size() > 0 || m_loadedBundles.size() == 0)) {
				waited = true;

				try {
					logger.fine("Waiting for  bundles to be initialized....");

					m_pendingBundles.wait(60000);

					if ((System.currentTimeMillis() - startTime) > 55000) {
						logger
								.severe("Bundle initialization has taken too "
										+ "long - may cause problems when launching apps");
						failed = true;
					}
				} catch (Exception e) {
					logger.severe("Failed to wait for pending bundles: " + e);
				}
			}

			if (waited) {
				logger.fine("Bundles initialized");
			}
		}

		ret = new String[m_classpathEntries.size()];
		m_classpathEntries.copyInto(ret);

		return (ret);
	}

	public static void registerClasspathEntries(final String bundleId,
			final boolean includeDependencies) {
		synchronized (m_pendingBundles) {
			m_pendingBundles.add(bundleId);
		}

		new Thread(new Runnable() {
			public void run() {
				buildClasspathEntries(bundleId, m_classpathEntries,
						includeDependencies);
			}
		}).start();
	}

	protected static void buildClasspathEntries(String bundleId,
			java.util.Vector entries, boolean recursive) {

		synchronized (m_loadedBundles) {

			if (m_loadedBundles.contains(bundleId) == false) {
				m_loadedBundles.add(bundleId);

				if (logger.isLoggable(Level.FINE)) {
					logger.fine("Build classpath entries for bundle '"
							+ bundleId + "'");
				}

				Bundle bundle = Platform.getBundle(bundleId);
				if (bundle != null) {
					java.net.URL installLocation = bundle.getEntry("/");
					java.net.URL local = null;
					try {
						local = Platform.asLocalURL(installLocation);
					} catch (java.io.IOException e) {
						e.printStackTrace();
					}

					String baseLocation = local.getFile();

					try {
						String requires = (String) bundle.getHeaders().get(
								Constants.BUNDLE_CLASSPATH);
						ManifestElement[] elements = ManifestElement
								.parseHeader(Constants.BUNDLE_CLASSPATH,
										requires);

						for (int i = 0; elements != null && i < elements.length; i++) {

							String path = baseLocation + elements[i].getValue();

							if (path.endsWith(".jar")) {

								if ((new File(path)).exists() == false) {
									if ((new File(baseLocation + "classes"))
											.exists()) {
										path = baseLocation + "classes";
									}
								}
							}

							if (entries.contains(path) == false) {
								if (logger.isLoggable(Level.FINE)) {
									logger.fine("Adding classpath entry '"
											+ path + "'");
								}
								entries.add(path);

								if (elements[i].getValue().equals(".")) {
									if ((new File(baseLocation + "classes"))
											.exists()) {
										path = baseLocation + "classes";

										entries.add(path);
									}
								}
							}
						}

						requires = (String) bundle.getHeaders().get(
								Constants.REQUIRE_BUNDLE);
						elements = ManifestElement.parseHeader(
								Constants.REQUIRE_BUNDLE, requires);

						for (int i = 0; recursive && elements != null
								&& i < elements.length; i++) {
							buildClasspathEntries(elements[i].getValue(),
									entries, false);
						}

					} catch (Exception e) {
						logger.severe("Failed to construct classpath: " + e);
						e.printStackTrace();
					}
				}
			}
		}

		synchronized (m_pendingBundles) {
			m_pendingBundles.remove(bundleId);

			try {
				m_pendingBundles.notifyAll();
			} catch (Exception e) {
				logger.severe("Failed to notify pending " + "bundle threads: "
						+ e);
			}
		}
	}

	public static java.util.List<String> getClasspathEntries(String bundleId) {
		java.util.List<String> entries = new java.util.Vector<String>();

		Bundle bundle = Platform.getBundle(bundleId);
		if (bundle != null) {
			java.net.URL installLocation = bundle.getEntry("/");
			java.net.URL local = null;
			try {
				local = Platform.asLocalURL(installLocation);
			} catch (java.io.IOException e) {
				e.printStackTrace();
			}

			String baseLocation = local.getFile();

			try {
				String requires = (String) bundle.getHeaders().get(
						Constants.BUNDLE_CLASSPATH);
				ManifestElement[] elements = ManifestElement.parseHeader(
						Constants.BUNDLE_CLASSPATH, requires);

				for (int i = 0; elements != null && i < elements.length; i++) {

					String path = baseLocation + elements[i].getValue();

					if (path.endsWith(".jar")) {

						if ((new File(path)).exists() == false) {
							if ((new File(baseLocation + "classes")).exists()) {
								path = baseLocation + "classes";
							}
						}
					}

					if (entries.contains(path) == false) {
						if (logger.isLoggable(Level.FINE)) {
							logger
									.fine("Adding classpath entry '" + path
											+ "'");
						}
						entries.add(path);

						if (elements[i].getValue().equals(".")) {
							if ((new File(baseLocation + "classes")).exists()) {
								path = baseLocation + "classes";

								entries.add(path);
							}
						}
					}
				}

			} catch (Exception e) {
				logger.severe("Failed to construct classpath: " + e);
				e.printStackTrace();
			}
		}

		return (entries);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.common.eclipse");

	private static java.util.Vector m_pendingBundles = new java.util.Vector();
	private static java.util.Vector m_loadedBundles = new java.util.Vector();
	private static java.util.Vector m_classpathEntries = new java.util.Vector();
}
