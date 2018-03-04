package edu.xjtu.cdl2bpel.cdl.util;

import java.util.Collection;
import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.ParticipateInfoByInteraction;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.orchestra.util.CDLActivityContextReasoner;

public class InteractionUtil {

	public static boolean isSameInteractionType(Interaction i1,
					Interaction i2) {
		boolean ret=false;
		
		if (i1 != null && i2 != null &&
				i1.getChannelVariable() == i2.getChannelVariable() &&
				i1.getOperation() != null &&
				i1.getOperation().equals(i2.getOperation())) {
			ret = true;
		}
		
		return(ret);
	}
	
	public static boolean isSendExchange(ExchangeInfo exchange) {
		boolean ret=false;
		
		if (exchange != null && exchange.getSendVariable() != null) {
			ret = true;
		}
		
		return(ret);
	}
	
	public static boolean isReceiveExchange(ExchangeInfo exchange) {
		boolean ret=false;
		
		if (exchange != null && exchange.getReceiveVariable() != null) {
			ret = true;
		}
		
		return(ret);
	}
	
	public static Collection getRelevantRecordDetails(Interaction interaction,
						Collection col) {
		Collection ret=new Vector();
		
		java.util.Iterator iter=col.iterator();
		while (iter.hasNext()) {
			RecordElementInfo details=(RecordElementInfo)iter.next();
			
			if (details == null ||
					interaction == details.eContainer()) {
				ret.add(details);
			}
		}
		
		return(ret);
	}
	
	public static String getInterface(Interaction interaction) {
		String ret=null;
			
		if (interaction != null &&
				interaction.getChannelVariable() != null &&
				interaction.getChannelVariable().getType() instanceof
						ChannelType) {
			ChannelType ctype=(ChannelType)
					interaction.getChannelVariable().getType();
			
			if (ctype.getTheBehaviorOfTheRoleType() != null) {
				ret = ctype.getTheBehaviorOfTheRoleType().getInterface();
			} else if (ctype.getRoleType() != null) {
				
				// Attempt to find default behavior
//				Behavior behavior=
//					ctype.getRoleType().getTheBehaviorOfTheRoleType(null);
//				
//				if (behavior != null) {
//					ret = behavior.getInterface();
//				}
			}
		}
		
		return(ret);
	}
	
	public static boolean hasPrecedingInteraction(Activity act) {
		boolean ret=false;
		
		// NOTE: It may be necessary to identify the mixed
		// situation, as it may be invalid to mark a particular
		// interaction as being the initial receive if it is
		// not when used in a different path - it may be
		// better to flag this as an error in BPEL validation
		
		// Check if preceding interaction within this choreography
		Choreography choreo=act.getBelongedChoreography();
		
		while (ret == false && act != null) {
			act = CDLActivityContextReasoner.getPrecedingActivity(act);
			
			if (act instanceof Interaction) {
				ret = true;
			}
		}
		
		// If not found, and the choreo is not the root choreo,
		// and it has some performing choreos, then check those
//		if (ret == false && choreo != null &&
//				choreo.getRoot() != Boolean.TRUE) {
//			java.util.List<Perform> performs=
//				choreo.getPerformingActivities();
//
//			if (performs.size() > 0) {
//			
//				// Check if has performing choreographies - stop
//				// if one of them indicates that there is no
//				// preceding interaction
//				ret = true;
//				
//				for (int i=0; ret && i < performs.size(); i++) {
//					
//					ret = hasPrecedingInteraction((Activity)
//							performs.get(i));
//				}
//			}
//		}
		
		return(ret);
	}	

	public static boolean hasPrecedingInteraction(Activity act,
						ParticipantType ptype) {
		boolean ret=false;
		
		// NOTE: It may be necessary to identify the mixed
		// situation, as it may be invalid to mark a particular
		// interaction as being the initial receive if it is
		// not when used in a different path - it may be
		// better to flag this as an error in BPEL validation
		
		// Check if preceding interaction within this choreography
		Choreography choreo=act.getBelongedChoreography();
		
		while (ret == false && act != null) {
			act = CDLActivityContextReasoner.getPrecedingActivity(act);
			
			if (act instanceof Interaction) {
				for (int i=0; ret == false &&
							i < ptype.getRoleTypes().size(); i++) {
					RoleType rtype=(RoleType)ptype.getRoleTypes().get(i);
					
					if (act.isRelevantWithTheRoleType(rtype)) {
						ret = true;
					}
				}
			}
		}
		
		// If not found, and the choreo is not the root choreo,
		// and it has some performing choreos, then check those
//		if (ret == false && choreo != null &&
//				choreo.getRoot() != Boolean.TRUE) {
//			java.util.List<Perform> performs=
//					choreo.getPerformingActivities();
//
//			if (performs.size() > 0) {
//			
//				// Check if has performing choreographies - stop
//				// if one of them indicates that there is no
//				// preceding interaction
//				ret = true;
//				
//				for (int i=0; ret &&
//					i < performs.size(); i++) {
//					
//					ret = hasPrecedingInteraction((Activity)
//							performs.get(i));
//				}
//			}
//		}
		
		return(ret);
	}
	
	public static java.util.List<ExchangeInfo> getRequestExchangeDetails(ExchangeInfo details) {
		java.util.List<ExchangeInfo> ret=new java.util.Vector<ExchangeInfo>();
		
		// Firstly check whether the supplied exchange is a request
		if (details.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
			ret.add(details);
		} else {
			
			// Check if request exchange is defined within the
			// containing interaction
			Interaction interaction=details.getBelongedInteraction();
			java.util.Iterator<ExchangeInfo> iter=interaction.getExchangeInfos().iterator();
			
			while (ret.size() == 0 && iter.hasNext()) {
				ExchangeInfo ed = (ExchangeInfo)iter.next();
				
				if (ed.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
					ret.add(ed);
				}
			}
		}
		
		if (ret.size() == 0) {
			
			// Check if preceding interaction activity contains a
			// request exchange matching the supplied details			
			findRequestExchangeDetails(details.getBelongedInteraction(),
					details,
					details.getBelongedInteraction().getChannelVariable(),
					details.getBelongedInteraction().getParticipateByInteraction(),
					details.getBelongedInteraction().getParticipateByInteraction(),
					ret);
		}
		
		return(ret);
	}
	
	protected static void findRequestExchangeDetails(Activity act,
			ExchangeInfo details, Variable channelVariable,
			ParticipateInfoByInteraction fromParticipant,
			ParticipateInfoByInteraction toParticipant, java.util.List results) {
		int initialSize = results.size();
		Activity original = act;

		do {
			act = CDLActivityContextReasoner.getPrecedingActivity(act);

			// NOTE: Currently allows intermediate interactions
			// (i.e. interactions that are not associated with
			// the supplied exchange).
			if (act instanceof Interaction) {
				Interaction interaction = (Interaction) act;

				// Check if interaction is related to supplied
				// exchange - the channelVariable and participant
				// instances are supplied separately as they may
				// be modified when propagating back through
				// performing choreographies
				if (interaction.getOperation().equals(
						details.getBelongedInteraction().getOperation())
						&& interaction.getChannelVariable() == channelVariable
						&& interaction.getTheToRoleOfInteraction() == details
								.getBelongedInteraction().getTheToRoleOfInteraction()
						&& interaction.getTheFromRoleOfInteraction() == details
								.getBelongedInteraction().getTheFromRoleOfInteraction()
//						&& (toParticipant == null || (interaction
//								.getToParticipant() == toParticipant))
//						&& (fromParticipant == null || (interaction
//								.getFromParticipant() == fromParticipant))
								) {

					java.util.Iterator iter = interaction.getExchangeInfos()
							.iterator();

					while (results.size() == initialSize && iter.hasNext()) {
						ExchangeInfo ed = (ExchangeInfo) iter.next();

						if (ed.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
							results.add(ed);
						}
					}

					// If request has not been found in an interaction
					// associated with the correct operation,
					// channel, etc, then if no request has been
					// found, then we cannot proceed, as it means
					// that other responses have been included
					// prior to our original response, which makes
					// our response more likely to be a notification
					act = null;
				}
			}
		} while (results.size() == initialSize && act != null);
	}
}
