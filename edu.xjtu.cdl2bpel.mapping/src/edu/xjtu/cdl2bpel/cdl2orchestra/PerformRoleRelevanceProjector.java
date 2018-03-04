package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.ArrayList;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix;
import edu.xjtu.cdl2bpel.cdl.impl.PerformImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.VariableBinding;

public class PerformRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	private RoleTypeMatrix m_roleTypeMatrix = null;
	private static final boolean CONDITION_PROJECT_SINGLETON = true;
	
	public PerformRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == PerformImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		boolean flag=false;
		Perform perform = (Perform)cdlElement;
		edu.xjtu.cdl2bpel.cdl.RoleTypeMatrix target=null;
		// Check whether to generate the perform
		if (perform.getRoleTypeMatrixBindInfos().size() == 0) {
				flag = true;
		} else {
			java.util.Iterator iter=
				perform.getRoleTypeMatrixBindInfos().iterator();
			
			while (flag == false && iter.hasNext()) {
				edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo roleTypeMatrixBindInfo=
					(edu.xjtu.cdl2bpel.cdl.RoleTypeMatrixBindInfo)
					iter.next();
				
				if (roleTypeMatrixBindInfo.getThisRoleTypeMatrix() == m_roleTypeMatrix) {
					target = roleTypeMatrixBindInfo.getFreeRoleTypeMatrix();
					
					if (target != null 
//							&& m_participantType != null
							) {
//						if (m_participantType.getRoleTypes().containsAll(
//									target.getRoleTypes())) {
						List<RoleType> roles = new ArrayList<RoleType>();
						for(RoleType roleType:context.getRoleTypes()) {
							roles.add(roleType);
						}
						if (roles.containsAll(
									target.getRoleTypes())) {
							flag = true;
						}
					} else {
						flag = true;
					}
				}
			}
		}
		
		if (flag) {
			edu.xjtu.cdl2bpel.orchestra.Perform elem=
				OrchestraFactory.eINSTANCE.createPerform();
			elem.setWaitForCompletion(perform.getWaitForCompletion());
			
			elem.setDescription(perform.getDescription());

			// Obtain performed behavior
			BPOrchestra nestedBPOrchestra=
				getBPOrchestra(perform.getChoreography(),
									context.getCurrentBPOrchestra());
			if (nestedBPOrchestra != null) {
				addActivity2StructIfCurrentElementBeOrderingStructuralActivity(elem);
				setPerform(elem, nestedBPOrchestra, perform);
			} else {
			}
		}
	}
	
	protected void setPerform(edu.xjtu.cdl2bpel.orchestra.Perform elem,
			BPOrchestra bd, Perform perform) {
		Choreography choreo=perform.getChoreography();
		elem.setBpOrchestra(bd);
		
		elem.setIsolated(choreo.getIsolation());
		
		if (perform.getChoreographyInstanceId() != null) {
			elem.setInstanceId(convertExpression(perform,
					perform.getChoreographyInstanceId(), CONDITION_PROJECT_SINGLETON));
		}
		
		java.util.List rtypes=null;
		
		if (m_roleTypeMatrix != null) {
			rtypes = m_roleTypeMatrix.getRoleTypes();
		} 
		
		for (int i=0; i < perform.getBindsOfPerform().size(); i++) {
			BindInfo details=(BindInfo)
						perform.getBindsOfPerform().get(i);
			
			if (rtypes == null ||
					rtypes.contains(details.getThisRole())) {
				
				VariableBinding binding=
					OrchestraFactory.eINSTANCE.createVariableBinding();
				
				edu.xjtu.cdl2bpel.orchestra.Variable parentvar=
						elem.getBelongedBPOrchestra().getVariable(
								details.getThisVariable().getName());
				edu.xjtu.cdl2bpel.orchestra.Variable boundvar=bd.getVariable(
							details.getFreeVariable().getName());
				
				binding.setParentVariable(parentvar);
				binding.setBoundVariable(boundvar);
				
				if (CheckNOthersUtil.isSet(details.getFreeVariable().getName())) {
				}
				
				elem.getVariableBindings().add(binding);
			}
		}
	}
	
	protected BPOrchestra getBPOrchestra(Choreography choreography,			
			BPOrchestra parent) {
		
		BPOrchestra ret=null;
		String orcheName=choreography.getName();
		
		if ((choreography.getParent() instanceof Choreography) == false) {
			
			ret = context.getGlobalArchitecture().getBPOrchestra(orcheName);
			
			if (ret == null) {
				ret = OrchestraFactory.eINSTANCE.createBPOrchestra();
				ret.setName(orcheName);
				
				if (choreography.getRoot() == Boolean.TRUE) {
					ret.setRoot(Boolean.TRUE);
				}
				
				context.getGlobalArchitecture().getBpOrchestras().add(ret);
			}
		} else {
			ret = parent.getEnclosedBPOrchestraByName(orcheName);
			
			if (ret == null) {
				ret = OrchestraFactory.eINSTANCE.createBPOrchestra();
				ret.setName(orcheName);
				
				parent.getEnclosedBPOrchestra().add(ret);
			}
		}
		
		return(ret);
	}
}
