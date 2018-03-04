package edu.xjtu.cdl2bpel.editors.simple;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;

import edu.xjtu.cdl2bpel.editors.xml.XMLDocumentProvider;

/**
 * A simple text editor.
 * 
 * @see org.eclipse.ui.examples.rcp.texteditor.editors.SimpleDocumentProvider
 * @since 3.0
 */
public class SimpleEditor extends TextEditor {

	public SimpleEditor() {
		super();
		setKeyBindingScopes(new String[] { "org.eclipse.ui.textEditorScope" }); //$NON-NLS-1$
		internal_init();
	}

	protected void internal_init() {
		configureInsertMode(SMART_INSERT, false);
		setDocumentProvider(new SimpleDocumentProvider());
	}

	protected void doSetInput(IEditorInput input) throws CoreException {
		System.out.println(input);
		setDocumentProvider(new XMLDocumentProvider());
		super.doSetInput(input);
	}
	
	public void doSave(IProgressMonitor monitor) {
		try{
			if (null == monitor) {
				monitor = new NullProgressMonitor();
			}
			super.doSave(new SubProgressMonitor(monitor, 1));
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
//
	private synchronized void save(File file, IProgressMonitor progressMonitor)
			throws CoreException {

		if (null == progressMonitor) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Saving " + file, 2);

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
		} 
	}
}
