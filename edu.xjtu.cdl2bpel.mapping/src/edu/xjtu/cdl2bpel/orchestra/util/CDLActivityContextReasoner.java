package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;

public class CDLActivityContextReasoner {
	public static Activity getPrecedingActivity(Activity act) {
		Activity ret=null;
		
		if (act != null) {
			// Get parent
			CDLElement parent=act.getParent();
			
			if (parent != null && parent.isSequentialGroupingConstruct()) {
				// Find current position
				int index=parent.eContents().indexOf(act);
				
				while (ret == null && index > 0) {
					index--;
					Object obj=parent.eContents().get(index);
					
					if (obj instanceof Activity) {
						ret = (Activity)obj;
					}
				}
			}
			
			if (ret == null && parent instanceof Activity) {
				ret = (Activity)parent;
			}
		}
		
		return(ret);
	}
	
	public static ExchangeInfo getPrecedingRequestExchange(Interaction act) {
		ExchangeInfo ret=null;
		Activity iterator = null;
		RoleType fromRole = act.getParticipateByInteraction().getFromRoleTypeRef();
		RoleType toRole = act.getParticipateByInteraction().getToRoleTypeRef();
		String op = act.getOperation();
		if(act.getExchangeInfos().size() > 1) {
			for(ExchangeInfo exchange:act.getExchangeInfos()) {
				if(exchange.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
					return exchange;
				}
			}
		} else {
			CDLElement parent=act.getParent();
				
			if (parent != null && parent.isSequentialGroupingConstruct()) {
					// Find current position
				int index=parent.eContents().indexOf(act);
					
				while (ret==null&&index > 0) {	
					index--;
					Object obj=parent.eContents().get(index);
						
					if (obj instanceof Activity) {
						iterator = (Activity)obj;
					}
					if (iterator instanceof Interaction) {
						Interaction itr = (Interaction) iterator;
						if (checkIsInTheSameInteraction(act, itr)
								&& itr.getExchangeInfos().size() == 1
								&& itr.getExchangeInfos().get(0).getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
							ret = itr.getExchangeInfos().get(0);
						}
					}

				}
			}
			if (iterator == null && parent instanceof Activity) {
				iterator = (Activity)parent;
				ret = null;
			}
		}		
	
		return(ret);
	}
	
	public static boolean checkIsInTheSameInteraction(Interaction act1,Interaction act2) {
		if (act1.getParticipateByInteraction().getFromRoleTypeRef() == act2
				.getParticipateByInteraction().getFromRoleTypeRef()
				&& act1.getParticipateByInteraction().getToRoleTypeRef() == act2
						.getParticipateByInteraction().getToRoleTypeRef()
				&& act1.getOperation().equals(act2.getOperation())) {
			
			return true;
		}
		
		return false;
	}
	
	public static Activity getPrecedingConditionalGroupingActivity(Activity act) {
		Activity ret = null;

		if (act != null) {
			// Get parent
			CDLElement parent = act.getParent();
			if (parent != null && parent.isConditionalGroupingConstruct() && parent instanceof CaseConditionalOfSwitch) {
				ret = (Activity) parent;
			} else if(!(parent instanceof Activity)) {
//				ret = (Activity) parent;
			} else {
			Activity sequence = (Activity) act.eContainer();
				if (ret == null && parent instanceof Activity
						&& sequence instanceof Sequence) {
					ret = CDLActivityContextReasoner
							.getPrecedingConditionalGroupingActivity(sequence);
					// getPrecedingActivityInParent(act);
				}
			}
		}

		return (ret);
	}
	
	/**
	 * This method returns the subsequent activities, following
	 * the one that is supplied. This method does not span
	 * a choreography boundary (i.e. it will not identify the
	 * next activity as the first activity within a performed
	 * choreography, or as an activity within a performing
	 * choreography, following the end of the performed
	 * choreography).
	 * 
	 * @param act The activity
	 * @return The list of activities that follow the supplied
	 * 					activity
	 */
	public static java.util.List getSubsequentActivities(Activity act) {
		java.util.List ret=new java.util.Vector();
		
		if (act != null) {
			
			if (act.isGroupingConstruct()) {
				
				java.util.Iterator iter=act.eContents().iterator();
				boolean f_end=false;
				
				while (f_end == false && iter.hasNext()) {
					Object obj=iter.next();
					
					if (obj instanceof Activity) {
						ret.add(obj);
						
						// If sequential, then only add first
						// element
						if (act.isSequentialGroupingConstruct()) {
							f_end = true;
						}
					}
				}
				
				if (act.isConditionalGroupingConstruct()) {
					// Add the activity following the conditional
					// activity
					Activity next=getNextActivityInParent(act);
					
					if (next != null && ret.contains(next) == false) {
						ret.add(next);
					}
				}
			} else {
				Activity next=getNextActivityInParent(act);
				
				if (next != null) {
					ret.add(next);
				}
			}
		}
		
		return(ret);
	}
	
	
	public static Activity getSubsequentActivitie(Activity act) {
		Activity ret=null;
		
		if (act != null) {
			
			if (act.isConditionalGroupingConstruct()) {
				
				ret = (Activity)act.eContents().get(0);
			} else if(act.isSequentialGroupingConstruct()) {
				ret = (Activity)act.eContents().get(0);
			} else{
				Activity next=getNextActivityInParent(act);

				ret = next;
			}
		}
		
		return(ret);
	}
	
	/**
	 * This method returns the next activity from the parent
	 * activity. This may involve traversing more than one
	 * level up the activity hierarchy to find an appropriate
	 * grouping structure that can offer the next relevant
	 * activity in sequence.
	 * 
	 * @param act The activity
	 * @return The next activity from its direct or indirect parent
	 */
	public static Activity getNextActivityInParent(CDLElement act) {
		Activity ret=null;
		
		if (act != null) {
			
			// Get parent
			CDLElement parent=act.getParent();
			
			if (parent != null) {
				
				if (parent.isSequentialGroupingConstruct() == false) {
				
					ret = getNextActivityInParent(parent);
				} else {
			
					// Find current position
					int index=parent.eContents().indexOf(act);
					index++;
					
					for (; ret == null &&
							index < parent.eContents().size();
								index++) {
						
						Object obj=parent.eContents().get(index);
						
						if (obj instanceof Activity) {
							ret = (Activity)obj;
						}
					}
					
					if (ret == null && parent instanceof Activity) {
						ret = getNextActivityInParent(parent);
					}
				}
			}
		}
		
		return(ret);
	}
	
	public static Activity getPrecedingActivityInParent(CDLElement act) {
		Activity ret=null;
		
		if (act != null) {
			
			// Get parent
			CDLElement parent=act.getParent();
			
			if (parent != null) {
				
				if (parent.isSequentialGroupingConstruct() == false) {
				
					ret = getPrecedingActivityInParent(parent);
				} else {
			
					// Find current position
					int index=parent.eContents().indexOf(act);
					index--;
					
					for (; ret == null &&
							index < parent.eContents().size();
								index++) {
						
						Object obj=parent.eContents().get(index);
						
						if (obj instanceof Activity) {
							ret = (Activity)obj;
						}
					}
					
					if (ret == null && parent instanceof Activity) {
						ret = getPrecedingActivityInParent(parent);
					}
				}
			}
		}
		
		return(ret);
	}

	/**
	 * This method checks whether the activity is a parallel
	 * construct with multiple paths associated with the
	 * supplied participant's role types.
	 * 
	 * @param act The activity
	 * @param roleTypes The role types
	 * @return Whether the activity is a parallel construct with
	 * 				multiple paths assocated with the participant
	 */
	protected static boolean checkForMultipleParallelPaths(Activity act,
				RoleType[] roleTypes) {
		boolean ret=false;
		
		// If parallel, then check if atleast
		// one other path is relevant to the participant
		if (act instanceof Parallel) {
			int relevant=0;
			
			java.util.Iterator iter=
				((Parallel)act).getActivities().iterator();
			
			while (iter.hasNext()) {
				Object obj=iter.next();
				
				if (obj instanceof Activity) {
					boolean f_found=false;
					
					for (int i=0; f_found == false &&
						i < roleTypes.length; i++) {
						RoleType rtype=(RoleType)
								roleTypes[i];
			
						if (((Activity)obj).
								isRelevantWithTheRoleType(
										rtype)) {
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
		
		return(ret);
	}	
	
	public static boolean isActivityInScope(Activity act,
			RoleType[] roleTypes) {
		boolean ret = false;

		// Check for special case - a parallel grouping
		// construct that has multiple paths relevant to the
		// participant
		if (act != null) {
			ret = checkForMultipleParallelPaths(act, roleTypes);
		}

		Choreography choreo = act.getBelongedChoreography();

		while (ret == false && act != null) {
			CDLElement parent = act.getParent();

			act = CDLActivityContextReasoner.getPrecedingActivity(act);

			if (act == parent) {

				ret = checkForMultipleParallelPaths(act, roleTypes);

			} else if (act != null) {
				for (int i = 0; ret == false && i < roleTypes.length; i++) {
					RoleType rtype = (RoleType) roleTypes[i];

					if (act.isRelevantWithTheRoleType(rtype)) {
						ret = true;
					}
				}
			}
		}

//		if (act == null && ret == false && choreo != null) {
//			for (int i = 0; ret == false
//					&& i < choreo.getPerformingActivities().size(); i++) {
//
//				ret = isActivityInScopeOfParticipant((Activity) choreo
//						.getPerformingActivities().get(i), roleTypes);
//			}
//		}

		return (ret);
	}
}
