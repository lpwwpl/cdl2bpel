package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.Choice;

public class BPActivityContextReasoner {


	public static BPActivity getPrecedingActivity(BPActivity act) {//得到前一个活动
		BPActivity ret=null;
		
		if (act != null) {
			// Get parent
			BPElement parent=(BPElement)act.eContainer();
			
			if (parent instanceof BPOrderingStruturalActivity 
//					&&((OrderingStructuralActivity)parent).isSequentialGroupingConstruct()
					) {
				// Find current position
				int index=parent.eContents().indexOf(act);
				
				while (ret == null && index > 0) {
					index--;
					Object obj=parent.eContents().get(index);
					
					if (obj instanceof BPActivity) {
						ret = (BPActivity)obj;
					}
				}
			}
			
			if (ret == null && parent instanceof BPActivity) {
				ret = (BPActivity)parent;
			}
		}
		
		return(ret);
	}


	public static java.util.List getSubsequentActivities(BPActivity act) {//得到下一个以后的活动列表
		java.util.List ret=new java.util.Vector();
		
		if (act != null) {
			
			if (act instanceof BPOrderingStruturalActivity) {
				
				java.util.Iterator iter=act.eContents().iterator();
				boolean f_end=false;
				
				while (f_end == false && iter.hasNext()) {
					Object obj=iter.next();
					
					if (obj instanceof BPActivity) {
						ret.add(obj);
						
						// If sequential, then only add first
						// element
						if (((BPOrderingStruturalActivity)act).isSequentialGroupingConstruct()) {
							f_end = true;
						}
					}
				}
				
				if (((BPOrderingStruturalActivity)act).isConditionalGroupingConstruct()) {
					// Add the activity following the conditional
					// activity
					BPActivity next=getNextActivityInParent(act);
					
					if (next != null && ret.contains(next) == false) {
						ret.add(next);
					}
				}
			} else {
				BPActivity next=getNextActivityInParent(act);
				
				if (next != null) {
					ret.add(next);
				}
			}
		}
		
		return(ret);
	}
	

	public static java.util.List getSubsequentActivitiesInTheSameParent(BPActivity act) {//得到下一个以后的活动列表
		java.util.List ret=new java.util.Vector();
		
		if (act != null) {
			
			if (act instanceof BPOrderingStruturalActivity) {
				BPOrderingStruturalActivity parent = (BPOrderingStruturalActivity)act.eContainer();
				int index = parent.eContents().indexOf(act);
				index++;
				
				for (;index < parent.eContents().size();
							index++) {
					
					Object obj=parent.eContents().get(index);
				
					if (obj instanceof BPActivity) {
						ret.add((BPActivity)obj);
					}
				}
			
			} else {
				BPActivity next=getNextActivityInParent(act);
				
				if (next != null) {
					ret.add(next);
				}
			}
		}
		
		return(ret);
	}
	
	public static java.util.List getSubsequentActivitiesOfCurrent(BPActivity act) {//得到下一个以后的活动列表
		java.util.List ret=new java.util.Vector();
		
		if (act != null) {
			
			if (act instanceof BPOrderingStruturalActivity) {
				BPOrderingStruturalActivity parent = (BPOrderingStruturalActivity)act.eContainer();
				int index = parent.eContents().indexOf(act);
				index++;
				
				for (;index < parent.eContents().size();
							index++) {
					
					Object obj=parent.eContents().get(index);
				
					if (obj instanceof BPActivity) {
						ret.add((BPActivity)obj);
					}
				}
			
			} else {
				BPActivity next=getNextActivityInParent(act);
				
				if (next != null) {
					ret.add(next);
				}
			}
		}
		
		return(ret);
	}
	
	public static BPActivity getNextActivityInParent(BPElement act) {//找到下一个活动类元素
		BPActivity ret=null;
		
		if (act != null) {
			
			// Get parent
			BPElement parent=(BPElement)act.eContainer();
			
			if (parent != null) {
				
				if ((parent instanceof BPOrderingStruturalActivity) == false 
						||
						((BPOrderingStruturalActivity)parent).
							isSequentialGroupingConstruct() == false
							) {
				
					ret = getNextActivityInParent(parent);
				} else {
			
					// Find current position
					int index=parent.eContents().indexOf(act);
					index++;
					
					for (; ret == null &&
							index < parent.eContents().size();
								index++) {
						
						Object obj=parent.eContents().get(index);
						
						if (obj instanceof BPActivity) {
							ret = (BPActivity)obj;
						}
					}
					
					if (ret == null && parent instanceof BPActivity) {
						ret = getNextActivityInParent(parent);
					}
				}
			}
		}
		
		return(ret);
	}
	
	protected static boolean checkForMultipleParallelPaths(Activity act,
			RoleType[] roleTypes) {
		boolean ret = false;

		// If parallel, then check if atleast
		// one other path is relevant to the participant
		if (act instanceof Parallel) {
			int relevant = 0;

			java.util.Iterator iter = ((Parallel) act).getActivities()
					.iterator();

			while (iter.hasNext()) {
				Object obj = iter.next();

				if (obj instanceof Activity) {
					boolean f_found = false;

					for (int i = 0; f_found == false && i < roleTypes.length; i++) {
						RoleType rtype = (RoleType) roleTypes[i];

						if (((Activity) obj).isRelevantWithTheRoleType(rtype)) {
							f_found = true;
							relevant++;
						}
					}
				}
			}

			if (relevant > 1) {

				ret = true;
			}
		}

		return (ret);
	}
	
}
