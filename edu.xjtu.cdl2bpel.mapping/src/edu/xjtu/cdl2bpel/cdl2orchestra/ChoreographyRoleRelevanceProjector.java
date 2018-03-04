package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Identity;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.IdentityTypeEnum;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.UsageEnumByChannel;
import edu.xjtu.cdl2bpel.orchestra.util.OrchestraUtil;

public class ChoreographyRoleRelevanceProjector extends AbstractCDL2OrchestraProjector  {

	protected BPOrchestra parentOrche = null;
	
	public ChoreographyRoleRelevanceProjector(CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context,BPOrchestra parentBPOrchestra) {
		super(cdlElement,context);
		this.parentOrche = parentBPOrchestra;
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == ChoreographyImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	/**
	 * Get according ChoreographyRoleRelevanceProjector which is the member of AbstractCDL2OrchestraProjector and
	 * transform CDLElement to Orchestra.
	 */
	public void transformCDLElement2Orchestra(CDL2OrchestraRoleRelevanceContext context) {
		
		Choreography choreo = (Choreography) cdlElement;
		BPOrchestra bpOrchestra = context.getBPOrchestra(choreo, parentOrche);
		if (choreo.getComplete() != null) {
			bpOrchestra.setCompletionExpression("");
			bpOrchestra.setHasCompletionExpression(Boolean.TRUE);
		}
		
		//tranform cdl variables to orchestra variables,simply reserve the information of
		//variables
		List<Variable> variables = choreo.getVariables();
		for (Iterator it = variables.iterator(); it.hasNext();) {
			Variable variable = (Variable) it.next();
			edu.xjtu.cdl2bpel.orchestra.Variable orcheVariable = null;
			
			if (variable.getType() instanceof ChannelType) {
				orcheVariable = OrchestraFactory.eINSTANCE.createChannelType();
			} else {
				orcheVariable = OrchestraFactory.eINSTANCE.createVariable();
			}
			
			orcheVariable.setName(variable.getName());
			orcheVariable.setFree(variable.getFree());
			orcheVariable.setMutable(variable.getMutable());
			orcheVariable.setSilent(variable.getSilent());
			
			if (variable.getType() instanceof InformationType) {
				orcheVariable.setInformationType(OrchestraUtil
						.getVariableInformationType(context
								.getGlobalArchitecture(),
								((InformationType) variable.getType())
										.getTypeName()));
				bpOrchestra.getVariables().add(orcheVariable);
			} if (variable.getType() instanceof ChannelType) {
				String channelType=variable.getType().getName();
				((edu.xjtu.cdl2bpel.orchestra.ChannelType)orcheVariable).setChannelType(channelType);
				
				String serviceInfoName = extractServiceInfo(variable);
				
				InterfaceOfGroup interfaceOfGroup = null;
				interfaceOfGroup = getInterfaceOfGroup(((ChannelType)variable.getType()).getRoleType(),serviceInfoName);
				((edu.xjtu.cdl2bpel.orchestra.ChannelType)orcheVariable).setInterfaceType(interfaceOfGroup);
				
				((edu.xjtu.cdl2bpel.orchestra.ChannelType)orcheVariable).setUsage(resolveUsageTypeOfChannelType(
						((ChannelType)variable.getType()).
									getUsage()));
				
				// Project the identity details
				java.util.Iterator ids=
					((ChannelType)variable.getType()).
								getIdentities().iterator();
				
				while (ids.hasNext()) {
					Identity cdlId=
						(Identity)ids.next();
					
					edu.xjtu.cdl2bpel.orchestra.Identity id=
						OrchestraFactory.eINSTANCE.createIdentity();
					
					id.setName(cdlId.getName());
					
					id.setType(IdentityTypeEnum.get(cdlId.getType().getValue()));
					
//					for (int i=0; i < cdlId.getTokens().size(); i++) {
//						edu.xjtu.cdl2bpel.cdl.Token token=
//									cdlId.getTokens().get(i);
//						
//						id.getTokens();
//					}
					
//					((ChannelType)decl).getIdentities().add(id);
				}
//				decl.setInformationType((ChannelType)var.getType());
				
				if (variable.getType() != null
						&& ((ChannelType) variable.getType())
								.getReferencedToken() != null
						&& ((ChannelType) variable.getType())
								.getReferencedToken().getInformationType() != null) {
					edu.xjtu.cdl2bpel.orchestra.InformationType infoType = context
							.getGlobalArchitecture().getInformationType(
									((ChannelType) variable.getType())
											.getReferencedToken()
											.getInformationType().getName());

					orcheVariable.setInformationType(infoType);
				}
			}
			
			bpOrchestra.getVariables().add(orcheVariable);
		}

		if (choreo.getEnclosingChoreographies() != null) {

		}
		
		//if bpOrchestra is the child of GlobalArchitecture then add it to the GlobalArchitecture
		//else the bpOrchestra is the child of a parent bpOrchestra
		if(bpOrchestra.getParent() instanceof edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture) {
			context.getGlobalArchitecture().getBpOrchestras().add(bpOrchestra);
		} else {
			if (parentOrche != null) {
				parentOrche.getEnclosedBPOrchestra().add(bpOrchestra);
			}
		}
		
		// setOrche(bpOrchestra);
//		addActivity2StructIfCurrentElementBeOrderingStructuralActivity(bpOrchestra);
		
		context.pushBPElementStack(bpOrchestra);
		context.pushBPOrchestraStack(bpOrchestra);
		
		//Traverse the children element of Choreography and invoke the corresponding projector
		//to tranfor CDL Element to Orchestra Element
		Iterator iter = choreo.eContents().iterator();
		while (iter.hasNext()) {
			CDLElement subCdlElement = (CDLElement) iter.next();
			AbstractCDL2OrchestraProjector subCDLElementVisitor = newTheCDL2OrchestraProjector(subCdlElement);
			subCdlElement.accept(subCDLElementVisitor);
		}
		context.popBPOrchestraStack();
		context.popBPElementStack();
	}

	@Override
	public AbstractCDL2OrchestraProjector newTheCDL2OrchestraProjector(CDLElement cdlElement) {
		AbstractCDL2OrchestraProjector cdlElementProjector = null;
		
		if (cdlElement instanceof Choreography) {

			cdlElementProjector = new ChoreographyRoleRelevanceProjector(
					cdlElement, context, context.getCurrentBPOrchestra());

		} else if (cdlElement instanceof CDLElement) {
			cdlElementProjector = super
					.newTheCDL2OrchestraProjector(cdlElement);
		}
		
		return cdlElementProjector;
	}
	
	/**
	 * Retrive the Enum Type of UsageEnumByChannel value by the
	 * UsageTypeEnumByChannelType value
	 * 
	 * @param type
	 *            the UsageTypeEnumByChannelType value
	 * @return the Enum Type of UsageEnumByChannel value
	 */
	protected UsageEnumByChannel resolveUsageTypeOfChannelType(edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType type) {
		UsageEnumByChannel ret=null;
		
		if (type == UsageTypeEnumByChannelType.DISTINCT) {
			ret = UsageEnumByChannel.DISTINCT;
		} else if (type == UsageTypeEnumByChannelType.ONCE) {
			ret = UsageEnumByChannel.ONCE;
		} else if (type == UsageTypeEnumByChannelType.SHARED) {
			ret = UsageEnumByChannel.SHARED;
		}
		
		return(ret);
	}
}
