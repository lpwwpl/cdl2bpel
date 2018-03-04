package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.impl.PackageImpl;
import edu.xjtu.cdl2bpel.common.schema.NameSpaceUtil;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;

public class PackageRoleRelevanceProjector extends
		AbstractCDL2OrchestraProjector {

	public PackageRoleRelevanceProjector() {
	}

	public PackageRoleRelevanceProjector(CDLElement cdlElement,
			CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement, context);
	}

	/**
	 * Return the boolean value whether the cdlElement is relevant with the
	 * roleType matrix of context and whether the cdlElement is Current
	 * CDLElement to be Projected.
	 * 
	 * @return the boolean value whether the cdlElement is relevant with the
	 *         roleType matrix of context and whether the cdlElement is Current
	 *         CDLElement to be Projected
	 */
	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(context.getRoleTypes());

		if (ret == true && intf == PackageImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}

	/**
	 * Transform Current CDLElement to according Orchestra Element by the
	 * according AbstractCDL2OrchestraProjector and deep traversal transform
	 * children cdlElemnt to according Orchestra Element.
	 */
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {

		Package cdlPackage = (Package) cdlElement;
		if (context.getRoleTypes() != null) {
			String serviceName = "";
			context.getGlobalArchitecture().setName(serviceName);

			if (CheckNOthersUtil.isSet(cdlPackage.getTargetNamespace())) {
				edu.xjtu.cdl2bpel.orchestra.Namespace tns = OrchestraFactory.eINSTANCE
						.createNamespace();
				tns.setPrefix(GLOBAL_NS_PREFIX);
				tns.setUri(cdlPackage.getTargetNamespace());
				context.getGlobalArchitecture().getNamespaces().add(tns);
			}

			java.util.Iterator iter = cdlPackage.getNamespaces().iterator();

			while (iter.hasNext()) {
				edu.xjtu.cdl2bpel.cdl.Namespace cdlns = (edu.xjtu.cdl2bpel.cdl.Namespace) iter
						.next();
				edu.xjtu.cdl2bpel.orchestra.Namespace ns = OrchestraFactory.eINSTANCE
						.createNamespace();
				ns.setPrefix(cdlns.getPrefix());
				ns.setUri(cdlns.getUri());
				if(cdlns.getPrefix().equals("tns")||cdlns.getPrefix().equals("targetNamespace")) {
					context.getGlobalArchitecture().setTargetNamespace(cdlns.toString());
//					context.getGlobalArchitecture().getFullyQualifiedName()
				}
				context.getGlobalArchitecture().getNamespaces().add(ns);
			}

		}

		AbstractCDL2OrchestraProjector cdlElementProjector = new BaseUnitsDefRoleRelevanceProjector(
				cdlElement, context);
		cdlElementProjector.transformCDLElement2Orchestra(context);// 处理信息类型和tocken

		context.pushBPElementStack(context.getGlobalArchitecture());
		Iterator it = cdlPackage.eContents().iterator();
		while (it.hasNext()) {
			CDLElement subCdlElement = (CDLElement) it.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPElementStack();
		
		endJob(cdlPackage,context);
	}

	//My Defined Compensation when had Projected the Package,for example at the end we should delete
	//the InterfaceOfGroup which had not been used.
	public void endJob(Package pack,CDL2OrchestraRoleRelevanceContext context) {
		
		GlobalArchitecture globalArchitecture = context.getGlobalArchitecture();
		// Remove any service type interfaces that have no operations
		java.util.List list=globalArchitecture.getInterfaces();
		
		for (int i=list.size()-1; i >= 0; i--) {
			InterfaceOfGroup interfaceOfGroup=(InterfaceOfGroup)list.get(i);
			
			if (interfaceOfGroup.getOperations().size() == 0) {
				list.remove(i);
			}
		}
		
		// Complete the remaining service type interfaces
		completeInterfaceDefinitions(pack,context);
		
		// Remove any top level behavior descriptions that
		// have no message activities and are not performed
		if (globalArchitecture.getBpOrchestras().size() > 1) {
			list = globalArchitecture.getBpOrchestras();
			
			for (int i=list.size()-1; i >= 0; i--) {
//				BPOrchestra bd=(BOrchestra)list.get(i);
//				
//				if (bd.getPerformingActivities().size() == 0) {
//					MessageActivity[] mas=bd.getInitialMessageActivities();
//	
//					if (mas == null || mas.length == 0) {
//						list.remove(i);
//					}
//				}
			}
		}
	}

	protected void completeInterfaceDefinitions(Package pack,CDL2OrchestraRoleRelevanceContext context) {
		
		GlobalArchitecture globalArchitecture = context.getGlobalArchitecture();
		// Obtain folder path
//		if ( globalArchitecture != null) {
//			java.util.Iterator iter=
//				globalArchitecture.getInterfaces().iterator();
//			
//			while (iter.hasNext()) {
//				InterfaceOfGroup st=(InterfaceOfGroup)iter.next();
//				String intfNamespace=NameSpaceUtil.getNamespace(st.getName());
//				String intfName=NameSpaceUtil.getLocalPart(st.getName());
//				
//				InterfaceDefinition id=InterfaceFactory.getInterfaceDefinition(pack,
//						m_artifacts, intfNamespace, intfName);
//				
//				if (id != null) {
//					completeServiceType(st, id);
//				} else {
//				}
//			}
//		}
	}
	
	/**
	 * New and Return the sub AbstractCDL2OrchestraProjector by the CDLElement
	 * of Current AbstractCDL2OrchestraProjector
	 * 
	 * @param elem
	 *            the CDLElement of Current AbstractCDL2OrchestraProjector
	 */
	public AbstractCDL2OrchestraProjector newTheCDL2OrchestraProjector(
			CDLElement cdlElement) {
		AbstractCDL2OrchestraProjector cdlElementProjector = null;
		if (cdlElement instanceof Choreography) {
			if (((Choreography) cdlElement).eContainer() instanceof Package) {
				cdlElementProjector = new ChoreographyRoleRelevanceProjector(
						cdlElement, context, null);
			}
			// else {
			// cdlElementProjector = new ChoreographyRoleRelevanceProjector(
			// cdlElement,context, context.getCurrentBPOrchestra());
			// }
		} else {

		}
		return cdlElementProjector;
	}
}
