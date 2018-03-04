package edu.xjtu.cdl2bpel.cdl2orchestra;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XPathProjection;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.util.BPElementUtil;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathBehaviorTransformer;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public abstract class AbstractCDL2OrchestraProjector implements
		CDL2OrchestraProjector {

	protected CDL2OrchestraRoleRelevanceContext context = null;
	protected CDLElement cdlElement = null;
	protected static final String GLOBAL_NS_PREFIX = "sens";
	protected ServiceExtractor resolver = new DefaultServiceExtractor();

	/**
	 * Return the CDL2OrchestraRoleRelevanceContext instance which is the member
	 * of AbstractCDL2OrchestraProjector
	 * 
	 * @return the CDL2OrchestraRoleRelevanceContext instance
	 */
	public CDL2OrchestraRoleRelevanceContext getContext() {
		return context;
	}

	/**
	 * Set the CDL2OrchestraRoleRelevanceContext instance which is the member of
	 * AbstractCDL2OrchestraProjector
	 * 
	 * @param context
	 *            the CDL2OrchestraRoleRelevanceContext instance
	 */
	public void setContext(CDL2OrchestraRoleRelevanceContext context) {
		this.context = context;
	}

	public AbstractCDL2OrchestraProjector(CDLElement cdlElement,
			CDL2OrchestraRoleRelevanceContext context) {
		this.context = context;
		this.cdlElement = cdlElement;
	}

	public AbstractCDL2OrchestraProjector() {
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
		return true;
	}

	/**
	 * Transform Current CDLElement to according Orchestra Element by the
	 * according AbstractCDL2OrchestraProjector and deep traversal transform
	 * children cdlElemnt to according Orchestra Element.
	 */
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {

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

		if (cdlElement instanceof CDLElement) {
			cdlElementProjector = getProxy(cdlElement);
		}

		return cdlElementProjector;
	}

	/**
	 * Return the according AbstractCDL2OrchestraProjector by cdlElementInf.
	 * Because the CDLElement be projected by the according
	 * AbstractCDL2OrchestraProjector
	 * 
	 * @param cdlElementInf
	 *            the CDLElement wanted to be projected
	 * @return the according AbstractCDL2OrchestraProjector by cdlElementInf.
	 *         Because the CDLElement be projected by the according
	 *         AbstractCDL2OrchestraProjector
	 */
	public AbstractCDL2OrchestraProjector getProxy(CDLElement cdlElementInf) {
		return (CDL2OrchestraProjectorProxy.getCDL2OrchestraProjector(context,
				cdlElementInf));
	}

	/**
	 * Check whether is RoleRelevance with the roleType matrix of context and
	 * whether the cdlElement is Current CDLElement to be Projected. If the
	 * result is true then get according AbstractCDL2OrchestraProjector by
	 * cdlElement which is the member of AbstractCDL2OrchestraProjector and
	 * transform CDLElement to Orchestra.
	 */
	public void transformCDLElement2OrchestraByRoleRelevance(
			CDL2OrchestraRoleRelevanceContext contex) {
		if (this.isRelevant(context, cdlElement.getClass())) {
			getProxy(cdlElement).transformCDLElement2Orchestra(context);
		}
	}

	/**
	 * If the currentBPElement instance of BPOrderingStruturalActivity and the
	 * parameter 'bpElement' instance of BPActivity then add the 'bpElement'
	 * into the BPActivity list of the currentBPElement
	 */
	public void addActivity2StructIfCurrentElementBeOrderingStructuralActivity(
			BPElement bpElement) {
		if (context.getCurrentBPElement() instanceof BPOrderingStruturalActivity
				&& bpElement instanceof BPActivity) {
			BPOrderingStruturalActivity struct = (BPOrderingStruturalActivity) context
					.getCurrentBPElement();

			struct.getActivityTypes().add((BPActivity) bpElement);
		}
	}

	/**
	 * Return the interfaceOfGroup by the serviceInfoName, if interfaceOfGroup
	 * not exits in InterfaceOfGroup list of GlobalArchitecture we must new one
	 * and put it into InterfaceOfGroup list of GlobalArchitecture
	 * 
	 * @param serviceInfoName
	 *            the infterfaceOfGroup name
	 * @return the interfaceOfGroup by the serviceInfoName
	 */
	public InterfaceOfGroup getInterfaceOfGroup(Interaction interaction,RoleType roleType,String serviceInfoName) {
		InterfaceOfGroup interfaceOfGroup = null;
		if (serviceInfoName != null) {
			interfaceOfGroup = context.getGlobalArchitecture()
					.getInterfaceOfGroup(serviceInfoName);
			
			if (interfaceOfGroup == null) {
				interfaceOfGroup = OrchestraFactory.eINSTANCE
						.createInterfaceOfGroup();

				String namespace = CommonNamespaceUtil.getNamespace(serviceInfoName);
				String localpart = CommonNamespaceUtil.getLocalPart(serviceInfoName);

				String prefix = BPElementUtil.getPrefixResolver(
						context.getGlobalArchitecture()).getPrefix(namespace);

				interfaceOfGroup.setName(prefix + ":" + localpart);
				interfaceOfGroup.setAddition(roleType.getName());
				
				context.getGlobalArchitecture().getInterfaces().add(
						interfaceOfGroup);
			}
			interfaceOfGroup.setDescription(interaction.getTheFromRoleOfInteraction().getName());
//			System.out.println(interfaceOfGroup.getDescription());
		}
		return interfaceOfGroup;
	}
	public InterfaceOfGroup getInterfaceOfGroup(RoleType roleType,String serviceInfoName) {
		InterfaceOfGroup interfaceOfGroup = null;
		if (serviceInfoName != null) {
			interfaceOfGroup = context.getGlobalArchitecture()
					.getInterfaceOfGroup(serviceInfoName);

			if (interfaceOfGroup == null) {
				interfaceOfGroup = OrchestraFactory.eINSTANCE
						.createInterfaceOfGroup();

				String namespace = CommonNamespaceUtil.getNamespace(serviceInfoName);
				String localpart = CommonNamespaceUtil.getLocalPart(serviceInfoName);

				String prefix = BPElementUtil.getPrefixResolver(
						context.getGlobalArchitecture()).getPrefix(namespace);

				interfaceOfGroup.setName(prefix + ":" + localpart);
				interfaceOfGroup.setAddition(roleType.getName());
				
				context.getGlobalArchitecture().getInterfaces().add(
						interfaceOfGroup);
			}
		}
		return interfaceOfGroup;
	}
	/**
	 * Extract ServiceInfo from Variable instance.
	 * 
	 * @param var
	 *            the Variable instance of CDL Package.
	 * @return ServiceInfo from Variable instance.
	 */
	protected String extractServiceInfo(Variable var) {
		String ret = null;

		if (resolver != null) {
			ret = resolver.extractServiceInfo(var);
		}

		return (ret);
	}

	protected String convertExpression(CDLElement cdlElement,
			String cdlExpression, boolean allowSingletonParticipant) {
		String ret = null;

		ret = XPathProjection.projectExpression(cdlElement, cdlExpression,
				context.getRoleTypes(), null);
		// ###############################
		if (CheckNOthersUtil.isSet(ret)) {
			ret = ret
					.replaceAll("cdl:", XPathBehaviorTransformer.BEHAVIOR_PREFIX + ":");
		}
		// }

		return (ret);
	}

	/**
	 * Return the boolean value whether the parameter 'value' is set.
	 * 
	 * @param value
	 *            a string 'value'.
	 * @return the boolean value whether the parameter 'value' is set.
	 */
	protected boolean isNotNull(String value) {
		boolean ret = false;

		if (value != null && !value.equals("")) {
			ret = true;
		}

		return (ret);
	}

	/**
	 * 
	 * @param cdlType
	 * @param qname
	 * @return
	 */
	protected String convertQName(CDLElement cdlType, String qname) {
		String ret = qname;

		if (XMLUtils.getPrefix(qname) == null) {
			ret = GLOBAL_NS_PREFIX + ":" + qname;
		}
		return (ret);
	}
	
	protected EList retriveActivitiesImpl(java.util.List cdltypes) {
		EList ret= new BasicEList();
		
		java.util.Iterator iter=cdltypes.iterator();
		while (iter.hasNext()) {
			CDLElement cdlElement=(CDLElement)iter.next();
		
			if (cdlElement.isRelevantWithTheRoleGroup(context.getRoleTypes())) {
				ret.add(getProxy(cdlElement).cdlElement);
			}
		}
		
		return(ret);
	}	

	public EList retriveActivities(EList cdltypes) {
		EList ret=retriveActivitiesImpl(cdltypes);
		
		if (ret.size() == 0) {
			// Insert a 'noAction' activity
//			Sequence seq = CDLFactory.eINSTANCE.createSequence();
			NoAction noAction =CDLFactory.eINSTANCE.createNoAction();
			noAction.setRoleType(context.getRoleTypes()[0]);
//			seq.getActivities().add(noAction);
			ret.add(noAction);
		}
		
		return(ret);
	}
}
