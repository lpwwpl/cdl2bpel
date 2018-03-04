package edu.xjtu.cdl2bpel.cdl.util;

import java.util.Collection;
import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;

public class PackageUtil {

	public static ParticipantType getParticipantForRoleType(RoleType roleType) {
		ParticipantType ret=null;
		
		Package pack=roleType.getBelongedPackage();
		
		if (pack != null) {
			java.util.Iterator iter=pack.
							getParticipantTypes().iterator();
			
			while (ret == null && iter.hasNext()) {
				ParticipantType ptype=(ParticipantType)iter.next();
				
				if (ptype.getRoleTypes().contains(roleType)) {
					ret = ptype;
				}
			}
		}
		
		return(ret);
	}

//	public static java.util.List getParticipantTypesForRoleType(RoleType roleType) {
//		java.util.List ret=new java.util.Vector();
//		
//		Package pack=roleType.getBelongedPackage();
//		
//		if (pack != null && pack.getBaseUnitsDef() != null) {
//			java.util.Iterator iter=pack.getBaseUnitsDef().
//							getParticipantTypes().iterator();
//			
//			while (iter.hasNext()) {
//				ParticipantType ptype=(ParticipantType)iter.next();
//				
//				if (ptype.getRoleTypes().contains(roleType)) {
//					ret.add(ptype);
//				}
//			}
//		}
//		
//		return(ret);
//	}

	public static java.util.List getParticipantsForRoleTypes(
			Package cdlpack, java.util.List roleTypes) {
		java.util.List ret=new java.util.Vector();
		
		if (cdlpack != null ) {
			java.util.Iterator iter=cdlpack.
							getParticipantTypes().iterator();
			
			while (iter.hasNext()) {
				ParticipantType ptype=(ParticipantType)iter.next();
				
				if (ptype.getRoleTypes().containsAll(roleTypes)) {
					ret.add(ptype);
				}
			}
		}
		
		return(ret);
	}

	public static Collection getRelevantBehaviors(RoleType roleType,
						Collection col) {
		Collection ret=new Vector();
		
		java.util.Iterator iter=col.iterator();
		while (iter.hasNext()) {
			BehaviorOfRoleType behavior=(BehaviorOfRoleType)iter.next();
			
			if (behavior == null ||
					roleType == behavior.eContainer()) {
				ret.add(behavior);
			}
		}
		
		return(ret);
	}
}
