package edu.xjtu.cdl2bpel.generator.eclipse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLPackageUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGenerator;
import edu.xjtu.cdl2bpel.cdl2bpel.util.CDL2WSBPELGeneratorFactory;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGenerator;
import edu.xjtu.cdl2bpel.cdl2wsdl.util.CDL2WSDLGeneratorFactory;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.generator.eclipse.properties.CDL2BPELGeneratePropertyPage;
import edu.xjtu.cdl2bpel.mapping.util.DefaultTNS;
import edu.xjtu.cdl2bpel.mapping.util.EclipseResourceProperties;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleRelationAlgorithm;

public class CDL2BPELGenerateAction implements IObjectActionDelegate {

	public CDL2BPELGenerateAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		m_targetPart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		m_selection = selection;
	}

	public void run(IAction action) {

		if (m_selection instanceof StructuredSelection) {
			StructuredSelection sel = (StructuredSelection) m_selection;

			IResource res = (IResource) sel.getFirstElement();

			EclipseResourceProperties props = new EclipseResourceProperties(
					res, res.getProject());

			edu.xjtu.cdl2bpel.cdl.Package cdlpack = null;
			String path = res.getLocation().toOSString();

			List<Pair<RoleType[], String>> roles = new ArrayList();
			try {
				if (cdlpack != null) {
					try {
						cdlpack = CDLResolver.getPackageFromCDLFile(path);

					} catch (Exception ioe) {
						logger.severe("Failed to load CDL '" + path + "': "
								+ ioe);
					}

					String threshold = res
							.getPersistentProperty(new QualifiedName(
									CDL2BPELGeneratePropertyPage.PLUGIN,
									CDL2BPELGeneratePropertyPage.THRESHOLD_KEY));
					RoleRelationAlgorithm rra = new RoleRelationAlgorithm(path);
					rra.setThreshold(Float.valueOf(threshold));
					rra.caculate(rra.getFilepath());
					List<Group> groups = rra.getGroups();
					for (Group group : groups) {
						List roleTypesInGroup = group.getRoleType();
						RoleType[] roletypes = (new RoleType[roleTypesInGroup
								.size()]);
						int i = 0;
						for (Iterator it = roleTypesInGroup.iterator(); it
								.hasNext();) {
							RoleType roleType = CDLPackageUtil.getRoleType(
									cdlpack, ((RoleType) it.next()).getName());
							roletypes[i] = roleType;
							i++;
						}
						i = 0;
						roles.add(new Pair(roletypes, DefaultTNS.getTNS()));
					}
				}
				DefaultTNS.reset();
				CDL2WSDLGenerator generator = CDL2WSDLGeneratorFactory
						.createGenerator(cdlpack, props, roles);
				generator.generateWSDL2ResourceProperties();

				CDL2WSBPELGenerator gen = CDL2WSBPELGeneratorFactory
						.createGenerator(roles, props);
				gen.generateBPEL2ResourceProperties(cdlpack);
			} catch (Exception ex) {

			}

		} else {
			warn(GENERATION_NOT_ENABLED);
		}
	}

	public void warn(String mesg) {

		MessageBox mbox = new MessageBox(m_targetPart.getSite().getShell(),
				SWT.ICON_WARNING | SWT.OK);
		mbox.setMessage(mesg);
		mbox.open();
	}

	public void error(String mesg) {

		logger.severe("Error occurred: " + mesg);

		MessageBox mbox = new MessageBox(m_targetPart.getSite().getShell(),
				SWT.ICON_ERROR | SWT.OK);

		if (mesg == null) {
			mesg = "Exception has occurred - see error log";
		}

		mbox.setMessage(mesg);
		mbox.open();
	}

	private ISelection m_selection = null;
	private IWorkbenchPart m_targetPart = null;

	private static final String ERRORS_NO_GENERATE = "Choreography Description has errors, so cannot be generated";
	private static final String GENERATION_NOT_ENABLED = "Choreography Description has not be enabled for WS-BPEL "
			+ "Generation (see properties associated with CDL file)";

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.generator.eclipse");
}
