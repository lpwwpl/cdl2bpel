package edu.xjtu.cdl2bpel.plugin;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.filechooser.FileFilter;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import edu.xjtu.cdl2bpel.bpel.BPELXML;
import edu.xjtu.cdl2bpel.mining.BPELResultXML;
import edu.xjtu.cdl2bpel.ui.GenericFileFilter;
import edu.xjtu.cdl2bpel.ui.MiningResult;

public class BPELImportXML implements ImportPlugin {

	public BPELImportXML() {
	}

	@Override
	public FileFilter getFileFilter() {
		// TODO Auto-generated method stub
		return new GenericFileFilter("bpel");
	}

//	@Override
	public MiningResult importFile(InputStream input) throws IOException {
		// TODO Auto-generated method stub
		try {

			// Read the BPEL file as an XML document
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(false);
			dbf.setIgnoringComments(true);
			dbf.setIgnoringElementContentWhitespace(true);
			Document doc = dbf.newDocumentBuilder().parse(input);
			if (doc == null || doc.getDocumentElement() == null) {
				return null;
			}

			// Hook the BPEL object to the XML document.
			BPELXML model = new BPELXML(doc);

			return new BPELResultXML(model);
		} catch (Throwable x) {
			throw new IOException(x.getMessage());
		}
	}

	@Override
	public String getHtmlDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BPEL 1.1 file";
	}

}
