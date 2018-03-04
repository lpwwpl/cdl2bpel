
package edu.xjtu.cdl2bpel.orchestra.util;

import org.w3c.dom.Element;


import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;


public class InteractionUtil {
		

	public static boolean hasPrecedingInteraction(BPActivity act) {
		boolean ret=false;
		


		BPOrchestra bd=act.getBelongedBPOrchestra();
		
		while (ret == false && act != null) {
			act = BPActivityContextReasoner.getPrecedingActivity(act);
			
			if (act instanceof ReceiveEnd || act instanceof SendEnd) {
				ret = true;
			}
		}
		
		
//		if (ret == false && bd.getRoot() != Boolean.TRUE &&
//				bd.getPerformingActivities().size() > 0) {
//			
//			// Check if has performing choreographies - stop
//			// if one of them indicates that there is no
//			// preceding interaction
//			ret = true;
//			
//			for (int i=0; ret &&
//				i < bd.getPerformingActivities().size(); i++) {
//				
//				ret = hasPrecedingInteraction((BPActivity)
//						bd.getPerformingActivities().get(i));
//			}
//		}
		
		return(ret);
	}
	

	public static boolean ignoreReceive(Orchestra2BPELContext context,
			ReceiveEnd receive) {
		boolean ret=false;
		

		Element elem=context.getCurrentElement();
		
		if (elem.getNodeName().equals("onMessage") &&
				elem.getParentNode() != null &&
				elem.getParentNode().getNodeName().
						equals("pick")) {
			ret = true;
			
		// Sequence must be empty at this point to indicate that the
		// receive is the first activity in the choice path
		} else if (elem.getNodeName().equals("sequence") 
				&& elem.getChildNodes().getLength() == 0 &&
				elem.getParentNode() != null &&
				elem.getParentNode().getNodeName().equals("onMessage") &&
				elem.getParentNode().getParentNode() != null &&
				elem.getParentNode().getParentNode().getNodeName().
						equals("pick")) {
			ret = true;
		}
		
		return(ret);
	}

	public static ReceiveEnd getSubsequentResponseReceive(SendEnd send) {
		ReceiveEnd ret=null;
		
		java.util.List acts=
			BPActivityContextReasoner.getSubsequentActivities(send);
		
		if (acts != null && acts.size() == 1) {
			
			if (acts.get(0) instanceof ReceiveEnd) {
				ReceiveEnd respint=(ReceiveEnd)acts.get(0);
				

//				if (respint.getMessageDefinition().getOperationDefinition()
//						== send.getMessageDefinition().getOperationDefinition()) {
					ret = respint;
//				}
			} else if (acts.get(0) instanceof Choice 
//					&&					ChoiceUtil.isResponseHandler((Choice)acts.get(0))
					) {
				
				// Find normal response exchange in the choice
				// NOTE: Validation that the choice contains responses
				// for this send should have been performed
				java.util.Iterator iter=
					((Choice)acts.get(0)).getActivityTypes().iterator();
				
				while (ret == null && iter.hasNext()) {
					BPActivity act=(BPActivity)iter.next();
					
					ret = ChoiceContextReasoner.getReceiveExchange(act);
					
//					if (ret != null && 
//							NamesUtil.isSet(ret.getFaultName())) {
//						ret = null;
//					}
				}
			}
		}
		
		return(ret);
	}
	

}
