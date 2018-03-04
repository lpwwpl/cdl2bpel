package edu.xjtu.cdl2bpel.editors.xml;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;

import edu.xjtu.cdl2bpel.application.util.MyEditorInput;

public class XMLFormEditor extends FormEditor{
	public XMLFormEditor() {
		xmlEditor = new XMLEditor();
	}
	XMLEditor xmlEditor ;
	@Override
	protected void addPages() {
		// TODO Auto-generated method stub
		try {
			addPage(xmlEditor, ((MyEditorInput) getEditorInput()).getInputFile());
			// Ajouter le texte de la page 0
			setPageText(0, ((MyEditorInput) getEditorInput()).getInputFile()
					.getName());

		} catch (PartInitException e) {
			//
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		xmlEditor.doSave(monitor);
	}

	private boolean m_editorSaving = false;
	
	private synchronized void save(File file, IProgressMonitor progressMonitor)
			throws CoreException {

		if (null == progressMonitor) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Saving " + file, 2);

		m_editorSaving = true;

		try {
			if (file.exists()) {
				FileInputStream fin = new FileInputStream(file);
				String str = file.getAbsolutePath();
				file.delete();
				File theFile = new File(str);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(theFile));
				BufferedInputStream bais = new BufferedInputStream(fin);
				byte[] tmp = new byte[1];
				while (bais.read(tmp) != -1)
					bos.write(tmp);
				bais.close();
				bos.flush();
				bos.close();
				bais.close();
			}

			progressMonitor.worked(1);
			// file.refreshLocal(IResource.DEPTH_ZERO, new SubProgressMonitor(
			// progressMonitor, 1));
			progressMonitor.done();
		} catch (java.io.FileNotFoundException e) {
		} catch (java.io.IOException e) {
		} finally {
			m_editorSaving = false;
		}

	}
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		// TODO Auto-generated method stub
		super.init(site, input);
		setPartName(input.getName());
	}
}
