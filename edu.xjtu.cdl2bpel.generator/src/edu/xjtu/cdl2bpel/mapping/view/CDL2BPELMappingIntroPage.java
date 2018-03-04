package edu.xjtu.cdl2bpel.mapping.view;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import edu.xjtu.cdl2bpel.generator.eclipse.CDL2BPELGeneratePlugin;

public class CDL2BPELMappingIntroPage extends FormPage {

	public CDL2BPELMappingIntroPage(FormEditor editor) {
		super(editor, "first", "Introduction");
	}

	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		form.setText("Choreography角色分析平台"); 
		form.setBackgroundImage(CDL2BPELGeneratePlugin.getDefault().getImage(
				CDL2BPELGeneratePlugin.IMG_FORM_BG));
		TableWrapLayout layout = new TableWrapLayout();
		layout.leftMargin = 10;
		layout.rightMargin = 10;
		form.getBody().setLayout(layout);
		TableWrapData td;
		td = new TableWrapData();
		td.align = TableWrapData.LEFT;
		createFormTextSection(form, toolkit);
	}

	private void createExpandable(final ScrolledForm form,
			final FormToolkit toolkit) {
		final ExpandableComposite exp = toolkit.createExpandableComposite(form
				.getBody(), ExpandableComposite.TREE_NODE
		
				);
		exp.setActiveToggleColor(toolkit.getHyperlinkGroup()
				.getActiveForeground());
		exp.setToggleColor(toolkit.getColors().getColor(FormColors.SEPARATOR));
		Composite client = toolkit.createComposite(exp);
		exp.setClient(client);
		TableWrapLayout elayout = new TableWrapLayout();
		client.setLayout(elayout);
		elayout.leftMargin = elayout.rightMargin = 0;
		final Button button = toolkit.createButton(client, "", SWT.PUSH);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		exp.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(true);
			}
		});
		exp.setText("");
		TableWrapData td = new TableWrapData();
		td.align = TableWrapData.LEFT;
		exp.setLayoutData(td);
	}

	private void createFormTextSection(final ScrolledForm form,
			FormToolkit toolkit) {
		Section section = toolkit.createSection(form.getBody(),
				Section.DESCRIPTION);
		section.setActiveToggleColor(toolkit.getHyperlinkGroup()
				.getActiveForeground());
		section.setToggleColor(toolkit.getColors().getColor(
				FormColors.SEPARATOR));
		toolkit.createCompositeSeparator(section);
		FormText rtext = toolkit.createFormText(section, false);
		section.setClient(rtext);
		loadFormText(rtext, toolkit);

		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(true);
			}
		});

		section.setText("简介"); 
		section.setDescription("这里给出平台简介以及使用方式 "); 
		TableWrapData td = new TableWrapData();
		td.align = TableWrapData.FILL;
		td.grabHorizontal = true;
		section.setLayoutData(td);
	}

	private void loadFormText(final FormText rtext, FormToolkit toolkit) {
		rtext.setHyperlinkSettings(toolkit.getHyperlinkGroup());
		rtext
				.setImage(
						"image1", CDL2BPELGeneratePlugin.getDefault().getImage(CDL2BPELGeneratePlugin.IMG_LARGE)); 
		InputStream is = CDL2BPELMappingIntroPage.class
				.getResourceAsStream("index.xml");
		if (is != null) {
			rtext.setContents(is, true);
			try {
				is.close();
			} catch (IOException e) {
			}
		}
	}
}
