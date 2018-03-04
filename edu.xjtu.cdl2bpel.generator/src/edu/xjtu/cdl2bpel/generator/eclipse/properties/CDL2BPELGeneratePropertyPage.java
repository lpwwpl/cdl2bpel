package edu.xjtu.cdl2bpel.generator.eclipse.properties;

import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

import edu.xjtu.cdl2bpel.cdl.util.CDLDefinitions;

public class CDL2BPELGeneratePropertyPage extends PropertyPage {

	public static final String ActiveBPEL="ActiveBPEL";
	public static final String OraBPEL="OraBPEL";
	public static final String PLUGIN = "edu.xjtu.cdl2bpel.lpw";
	public static final String THRESHOLD_KEY = "thredsholdValue";
	public static final String TARGET_KEY = "targetValue";
	
	public static final String[] DEPLOY_TARGET=new String[] {
		ActiveBPEL, OraBPEL
	};
	
	public CDL2BPELGeneratePropertyPage() {
		super();
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		
		Label pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setText(PATH_TITLE);

		
		Text pathValueText = new Text(composite, SWT.WRAP | SWT.READ_ONLY);
		pathValueText.setText(((IResource) getElement()).getFullPath().toString());
	}

	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}

	private void addSecondSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);
		
		Label thresholdLabel = new Label(composite, SWT.NONE);
		thresholdLabel.setText(getThresholdLabel());

		threshold = new Text(composite, SWT.DROP_DOWN);
		
		if (getElement() instanceof IFile) {
			
		}
		
		try {
			String thresholdValue =
				((IResource) getElement()).getPersistentProperty(
					new QualifiedName(PLUGIN,
							THRESHOLD_KEY));
			
			if (thresholdValue == null) {
				threshold.setText(DEFAULT_THRESHOLD);
				
			} else {
				threshold.setText(thresholdValue);
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		Label deployTargetLabel = new Label(composite, SWT.NONE);
		deployTargetLabel.setText(getDeployTargetLabel());

		deployTarget = new Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);

		for (int i=0; i < DEPLOY_TARGET.length; i++) {
			deployTarget.add(DEPLOY_TARGET[i]);
		}
		
		try {
			String target =
				((IResource) getElement()).getPersistentProperty(
					new QualifiedName(PLUGIN,
							TARGET_KEY));
			
			if (target == null) {
				deployTarget.select(DEFAULT_INDEX);
				
			} else if (target.equalsIgnoreCase(ActiveBPEL)) {
				deployTarget.select(deployTarget.getItemCount()-2);
			} else {
				deployTarget.select(deployTarget.getItemCount()-1);
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private void addThirdSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		if (getElement() instanceof IProject) {
			
			Label warningLabel = new Label(composite, SWT.NONE);
			warningLabel.setText(WARNING_TEXT);
		}
		
	}

	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		addSeparator(composite);
		addSecondSection(composite);
		addThirdSection(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void performDefaults() {
		threshold.setText(DEFAULT_THRESHOLD);
		deployTarget.select(DEFAULT_INDEX);
	}
	
	public boolean performOk() {
		try {
			String val=threshold.getText();
			
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName(PLUGIN,
						THRESHOLD_KEY), val);
			
			
			val = deployTarget.getItem(
					deployTarget.getSelectionIndex());
			
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName(PLUGIN,
						TARGET_KEY), val);
			
			
			updateResource();

		} catch (CoreException e) {
			return false;
		}
		return true;
	}
	
	protected void updateResource() throws CoreException {
		
		if (getElement() instanceof IProject) {
			IProject proj=(IProject)getElement();
			
			proj.accept(new IResourceVisitor() {
				public boolean visit(IResource res) {
					
					if (res instanceof IFile &&
							((IFile)res).getFileExtension().equals(
									CDLDefinitions.CDL_FILE_EXTENSION)) {
						try {
							res.touch(null);
						} catch(CoreException ex) {
							logger.severe("Failed to 'touch' CDL " +
									"file to force re-validation: "+ex);
						}
					}
					
					return(true);
				}
			});
			
		} else {
			
			((IResource)getElement()).touch(null);
		}
	}
	
	protected String getThresholdLabel() {
		return(THRESHOLD_TITLE);
	}

	protected String getDeployTargetLabel() {
		return(DEPLOY_TARGET_TITLE);
	}

    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.generator.eclipse.properties");

    private static final String PATH_TITLE = "Path:";
	private static final String THRESHOLD_TITLE = "&Threshold Value:";
	private static final String DEPLOY_TARGET_TITLE = "&Deploy WSBPEL & WSDL:";
	private static final int DEFAULT_INDEX=0;
	private static final String DEFAULT_THRESHOLD = "1.0";
	
	private static final String WARNING_TEXT=
		"WARNING: Changing property values will cause all CDL files in this project to be re-validated";

	private Text threshold = null;
	private Combo deployTarget=null;
}
