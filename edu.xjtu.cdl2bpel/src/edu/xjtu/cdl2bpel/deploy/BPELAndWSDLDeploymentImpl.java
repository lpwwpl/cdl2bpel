package edu.xjtu.cdl2bpel.deploy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.application.fileExplorer.model.MyTreeNode;
import edu.xjtu.cdl2bpel.application.fileExplorer.views.FileExplorer;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2wsdl.WSDLDefinitions;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class BPELAndWSDLDeploymentImpl implements BPELAndWSDLDeployment {

	public BPELAndWSDLDeploymentImpl() {

	}

	public String getName() {
		return (DEPLOYER_NAME);
	}

	public void deploy2Destination(java.util.Map bpelFiles,
			java.util.Map wsdlFiles, String dest)
			throws BPELAndWSDLDeploymentException {
		Iterator iter = bpelFiles.keySet().iterator();

		while (iter.hasNext()) {
			String filename = (String) iter.next();
			String wsbpel = (String) bpelFiles.get(filename);

			// Remove extension
			int ind = filename.indexOf('.');

			if (ind != -1) {
				String name = filename.substring(0, ind);
				String ext = filename.substring(ind + 1);

				if (ext.equals(WSBPELDefinitions.FILE_EXTENSION)) {

					// Retrieve specific WSDL for the WS-BPEL file
					String wsdlname = name + FILE_EXTENSION_SEPARATOR
							+ WSDLDefinitions.FILE_EXTENSION;

					String wsdl = (String) wsdlFiles.get(wsdlname);

					createDeployZip(name, wsbpel, wsdl, wsdlFiles, dest);
				}
			}
		}
	}

	protected void createDeployZip(String zipname, String wsbpel,
			String bpwsdl, Map wsdlFiles, String dest)
			throws BPELAndWSDLDeploymentException {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			ZipOutputStream zip = new ZipOutputStream(baos);

			addWSBPELProcess(zip, zipname, wsbpel);

			if (bpwsdl != null) {
				String wsdlname = zipname + FILE_EXTENSION_SEPARATOR
						+ WSDLDefinitions.FILE_EXTENSION;

				addWSDL(zip, wsdlname, bpwsdl);
			}

			Iterator iter = wsdlFiles.keySet().iterator();

			while (iter.hasNext()) {
				String wsdlFile = (String) iter.next();
				String wsdl = (String) wsdlFiles.get(wsdlFile);
				if (wsdlFile.substring(0, wsdlFile.lastIndexOf(".")).equals(
						zipname)) {

				} else {
					addWSDL(zip, wsdlFile, wsdl);
				}
			}

			addOnceBPELDD(zip, zipname, wsdlFiles);

			zip.close();

			writeFile(zipname, dest, baos.toByteArray());

		} catch (Exception e) {
			throw new BPELAndWSDLDeploymentException(
					"Failed to create BPEL zip '" + zipname + "'", e);
		}
	}

	protected void addWSBPELProcess(ZipOutputStream zip, String bprname,
			String wsbpel) throws Exception {

		ZipEntry ze = new ZipEntry(bprname + BPEL_FILE_EXTENSION);

		zip.putNextEntry(ze);

		zip.write(wsbpel.getBytes());

		zip.closeEntry();
	}

	protected void addWSDL(ZipOutputStream zip, String filename, String wsdl)
			throws Exception {

		ZipEntry ze = new ZipEntry(filename);

		zip.putNextEntry(ze);

		zip.write(wsdl.getBytes());

		zip.closeEntry();
	}

	protected void addOnceBPELDD(ZipOutputStream zip, String zipname,
			java.util.Map wsdlFiles) throws Exception {

		org.w3c.dom.Document doc = XMLUtils.createDocument();

		Element oncebpel_dd = doc.createElement("oncebpel-dd");
		doc.appendChild(oncebpel_dd);

		oncebpel_dd.setAttribute(XMLNS, "http://otcaix.iscas.ac.cn/bpel");

		createOnceBPELProcess(oncebpel_dd, zipname, wsdlFiles);

		String onceBPEL_DD_XML = XMLUtils.getText(doc, true);

		ZipEntry ze = new ZipEntry("oncebpel-dd.xml");

		zip.putNextEntry(ze);

		zip.write(onceBPEL_DD_XML.getBytes());

		zip.closeEntry();
	}

	protected void createOnceBPELProcess(Element onceBPEL_DD, String zipname,
			java.util.Map wsdlFiles) throws Exception {
		Element onceBPELProcess = onceBPEL_DD.getOwnerDocument().createElement(
				"oncebpel-process");
		onceBPEL_DD.appendChild(onceBPELProcess);
		onceBPELProcess.setAttribute("name", zipname);

		Element bpelFile = onceBPELProcess.getOwnerDocument().createElement(
				"bpelFile");
		bpelFile.setTextContent(zipname + ".bpel");

		Element bpwsdlFile = onceBPELProcess.getOwnerDocument().createElement(
				"wsdlFile");
		bpwsdlFile.setTextContent(zipname + ".wsdl");

		onceBPELProcess.appendChild(bpelFile);
		onceBPELProcess.appendChild(bpwsdlFile);

		Element onceBPEL_PartnerWSDL = onceBPEL_DD.getOwnerDocument()
				.createElement("partnerWSDLFiles");
		onceBPELProcess.appendChild(onceBPEL_PartnerWSDL);

		createPartnerWSDL(onceBPEL_PartnerWSDL, zipname, wsdlFiles);
	}

	protected boolean isChannelToRole(Package cdlpack, RoleType roleType) {
		boolean ret = false;

		java.util.Iterator iter = cdlpack.getChannelTypes().iterator();
		
		while (ret == false && iter.hasNext()) {
			ChannelType ctype = (ChannelType) iter.next();
			if (ctype.getRoleType().equals(roleType)) {
				ret = true;
			}
		}

		return (ret);
	}

	protected void createPartnerWSDL(Element onceBPELProcess, String zipname,
			java.util.Map wsdlFiles) throws Exception {

		Iterator iter = wsdlFiles.keySet().iterator();

		while (iter.hasNext()) {
			String wsdlFile = (String) iter.next();
			if (wsdlFile.substring(0, wsdlFile.lastIndexOf("."))
					.equals(zipname)) {

			} else {
				Element ref = onceBPELProcess.getOwnerDocument().createElement(
						"entry");
				ref.setTextContent(wsdlFile);
				onceBPELProcess.appendChild(ref);
			}
		}
	}

	/**
	 * This method extracts the namespace from the WSDL document.
	 * 
	 * @param wsdl
	 *            The WSDL document
	 * @return The namespace, or null if not found
	 * @throws Exception
	 *             Failed to extract the namespace
	 */
	protected String getNamespace(String wsdl) throws Exception {
		String ret = null;

		org.w3c.dom.Node node = XMLUtils.getNode(wsdl);

		if (node instanceof org.w3c.dom.Element) {
			ret = ((org.w3c.dom.Element) node)
					.getAttribute(TARGETNAMESPACE_ATTR);
		}

		return (ret);
	}

	/**
	 * This method writes the contents of the BPEL file.
	 * 
	 * @param filename
	 * @param destination
	 * @param content
	 * @throws BPELAndWSDLDeploymentException
	 */
	protected void writeFile(String filename, String dest,
			byte[] content) throws BPELAndWSDLDeploymentException {

		try {
			String path = dest + java.io.File.separator + filename
					+ DISTRIBUTION_EXTENSION;

			java.io.FileOutputStream fos = new java.io.FileOutputStream(path);
			fos.write(content);

			fos.flush();

			fos.close();

			MyTreeNode parent = getTreeNode(FileExplorer.getRoot(),dest);
//			FileExplorer.getViewer().expandAll();
			MyTreeNode child = getTreeNode(FileExplorer.getRoot(),path);
			if(child == null) {
				child = new MyTreeNode(new File(path));
				child.setParent(parent);
				parent.add(child);
				FileExplorer.getViewer().add(child.getParent(), child);
			}
		} catch (Exception e) {
			throw new BPELAndWSDLDeploymentException("Failed to write "
					+ "BPEL deployment file", e);
		}
	}

	public MyTreeNode getTreeNode(MyTreeNode root,String dest) {
		Queue not_yet_explorer = new LinkedList();
		not_yet_explorer.add(root);
		
		while(!not_yet_explorer.isEmpty()) {
			MyTreeNode node = (MyTreeNode)not_yet_explorer.peek();
			not_yet_explorer.remove();
			if(((File)node.getValue()).getAbsolutePath().equals(dest)) {
				return node;
			}
			for(Iterator it = node.getChildren().iterator();it.hasNext();) {
				MyTreeNode child = (MyTreeNode)it.next();
				if(!((File)child.getValue()).getAbsolutePath().equals(dest)) {
					not_yet_explorer.add(child);
				} else {
					return child;
				}
			}
		}
		
		return null;
		
	}
	
	public static void zip(String zipFileName, String inputFile)
			throws Exception {
		File f = new File(inputFile);
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
				zipFileName));
		zip(out, f, null);
		out.close();
	}

	private static void zip(ZipOutputStream out, File f, String base)
			throws Exception {
		if (f.isDirectory()) {
			File[] fc = f.listFiles();
			if (base != null)
				out.putNextEntry(new ZipEntry(base + "/"));
			base = base == null ? "" : base + "/";
			for (int i = 0; i < fc.length; i++) {
				zip(out, fc[i], base + fc[i].getName());
			}
		} else {
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			int b;
			while ((b = in.read()) != -1)
				out.write(b);
			in.close();
		}
	}

	private static final String DEPLOYER_NAME = "OnceBPEL";
	private static final String DISTRIBUTION_EXTENSION = ".zip";
	private static final String FILE_EXTENSION_SEPARATOR = ".";
	private static final String TARGETNAMESPACE_ATTR = "targetNamespace";

	private static final String BPEL_FILE_EXTENSION = ".bpel";
	private static final String XMLNS = "xmlns";
}
