package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.impl.OrderingStructuralActivityImpl;

public class OrderingStructuralActivityRoleRelevanceProjector extends AbstractCDL2OrchestraProjector {

	public OrderingStructuralActivityRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

//	protected EList retriveActivitiesImpl(java.util.List cdltypes) {
//		EList ret= new BasicEList();
//		
//		java.util.Iterator iter=cdltypes.iterator();
//		while (iter.hasNext()) {
//			CDLElement cdlElement=(CDLElement)iter.next();
//		
//			if (cdlElement.isRelevantWithTheRoleGroup(context.getRoleTypes())) {
//				ret.add(getProxy(cdlElement).cdlElement);
//			}
//		}
//		
//		return(ret);
//	}	
//
//	public EList retriveActivities(EList cdltypes) {
//		EList ret=retriveActivitiesImpl(cdltypes);
//		
//		if (ret.size() == 0) {
//			// Insert a 'noAction' activity
//			NoAction noAction =CDLFactory.eINSTANCE.createNoAction();
//			noAction.setRoleType(context.getRoleTypes()[0]);
//			ret.add(noAction);
//		}
//		
//		return(ret);
//	}
	
	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == OrderingStructuralActivityImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
}
