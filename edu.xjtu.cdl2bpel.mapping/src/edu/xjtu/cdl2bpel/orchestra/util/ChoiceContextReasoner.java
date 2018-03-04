package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.NoAction;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra.Sequence;

public class ChoiceContextReasoner {
	
	public static final int CHOICE_TYPE_EVENT=0;//说明choice里的所有活动都与interaction有关，即每一个活动都有个receive
	public static final int CHOICE_TYPE_CONDITION=1;//说明choice里的所有活动在cdl中都是具有guard的workUnit
	public static final int CHOICE_TYPE_MIXED=2;//choice里的所有活动是以上两种情况的混合

	//说明choice里的所有活动都有个receiveEnd
	public static int getChoiceType(Choice choice) {
		int ret=0;
		int numEvent=0;
		int numCondition=0;
		java.util.List acts=choice.getActivityTypes();
		
		for (int i=0; i < acts.size(); i++) {
			BPActivity act=(BPActivity)acts.get(i);
			
			if (isConditionalExpressionSet(act)) {
				numCondition++;
			} else if (isEventBasedActivity(act)) {
				numEvent++;
			}
		}
		
		if (numEvent == acts.size()) {
			ret = CHOICE_TYPE_EVENT;
		} else if (numCondition == acts.size()) {
			ret = CHOICE_TYPE_CONDITION;
		} else {
			ret = CHOICE_TYPE_MIXED;
		}
		
		return(ret);
	}
	
	/*public static int getChoiceType(edu.xjtu.cdl2bpel.cdl.Choice choice) {
		int ret=0;
		int numEvent=0;
		int numCondition=0;
		java.util.List acts=choice.getActivities();
		
		for (int i=0; i < acts.size(); i++) {
			edu.xjtu.cdl2bpel.cdl.Activity act=
				(edu.xjtu.cdl2bpel.cdl.Activity)acts.get(i);
			
			if (isConditionalExpressionSet(act)) {
				numCondition++;
			} else if (isEventBasedActivity(act)) {//跟interaction相关，且以receive开头
				numEvent++;
			}
		}
		
		if (numEvent == acts.size()) {
			ret = CHOICE_TYPE_EVENT;
		} else if (numCondition == acts.size()) {
			ret = CHOICE_TYPE_CONDITION;
		} else {
			ret = CHOICE_TYPE_MIXED;
		}
		
		return(ret);
	}*/
	
	public static boolean isConditional(BPActivity activity) {
		boolean ret=false;
		
		if (activity instanceof BPOrderingStruturalActivity &&
				((BPOrderingStruturalActivity)activity).isConditionalGroupingConstruct()) {
			ret = true;
		}
		
		return(ret);
	}

	public static boolean isConditionalExpressionSet(BPActivity activity) {//activity是工作单元变的，而且工作单元里的guard表达式不为空
		boolean ret=false;
		
		if (activity instanceof NoAction||activity instanceof BPOrderingStruturalActivity &&
				((BPOrderingStruturalActivity)activity).isConditionalGroupingConstruct() 
				&&((BPOrderingStruturalActivity)activity).isConditionObservable()//还要满足guard表达式非空合法
				) {
			ret = true;
		}
		
		return(ret);
	}

	//是工作单元而且工作单元里的guard表达式不为空
	/*public static boolean isConditionalExpressionSet(CDLElement cdlType) {
		boolean ret=false;
		
		if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.WorkUnit &&
				NamesUtil.isSet(
						((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getGuardExpression())) {
			ret = true;
		}
		
		return(ret);
	}*/
//看有没有receive  是不是receive或第一个元素里包不包含带receive的choice
	public static boolean isEventBasedActivity(BPActivity activity) {
		boolean ret=false;
		

		if (getReceiveExchange(activity) != null) {
			ret = true;
		} else {

			Choice choice=null;
			
			if (activity instanceof Choice) {
				choice = (Choice)activity;
				
			} 
			else if (activity instanceof Sequence &&
					((Sequence)activity).getActivityTypes().size() > 0 &&
					((Sequence)activity).getActivityTypes().get(0) instanceof Choice) {//sequence的第一个元素是choice
				
				choice = (Choice)((Sequence)activity).getActivityTypes().get(0);
			} else if (activity instanceof BPOrderingStruturalActivity &&
					isConditionalExpressionSet(activity) == false &&
					((BPOrderingStruturalActivity)activity).getActivityTypes().size() > 0 &&
					((BPOrderingStruturalActivity)activity).getActivityTypes().get(0) instanceof Choice) {//其他序活动的第一个元素是choice
				choice = (Choice)((BPOrderingStruturalActivity)activity).getActivityTypes().get(0);
			}
			
			if (choice != null &&
					getChoiceType(choice) == CHOICE_TYPE_EVENT) {//看第一个choice是不是跟iteraction有关的，如果有关，则要以invoke的方式生成
				ret = true;
			}
		}
		
		return(ret);
	}
	
	/*public static boolean isEventBasedActivity(CDLElement cdlType) {
		boolean ret=false;
		
		// Check if cdl type is a receive activity, or a
		// sequence with the first element being a receive activity
		if (getReceiveExchange(cdlType) != null) {//第一个元素是receive
			ret = true;
		} else {
			// See if we can isolate an initial choice
			edu.xjtu.cdl2bpel.cdl.Choice choice=null;
			
			if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.Choice) {
				choice = (edu.xjtu.cdl2bpel.cdl.Choice)cdlType;
				
			} else if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.Sequence &&
					((edu.xjtu.cdl2bpel.cdl.Sequence)cdlType).getActivities().size() > 0 &&
					((edu.xjtu.cdl2bpel.cdl.Sequence)cdlType).getActivities().get(0) instanceof edu.xjtu.cdl2bpel.cdl.Choice) {
				
				choice = (edu.xjtu.cdl2bpel.cdl.Choice)
					((edu.xjtu.cdl2bpel.cdl.Sequence)cdlType).getActivities().get(0);
			} else if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.WorkUnit &&
					isConditionalExpressionSet(cdlType) == false &&
					((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getActivities().size() > 0 &&
					((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getActivities().get(0) instanceof edu.xjtu.cdl2bpel.cdl.Choice) {
				choice = (edu.xjtu.cdl2bpel.cdl.Choice)((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getActivities().get(0);
			}
			
			if (choice != null &&
					getChoiceType(choice) == CHOICE_TYPE_EVENT) {
				ret = true;
			}
		}
		
		return(ret);
	}*/
	//如果activity是receive，则返回，   如果是sequence或是choice，则得到其第一个活动，如果一个活动是receive则返回，否则返回null
	public static ReceiveEnd getReceiveExchange(BPActivity activity) {
		ReceiveEnd ret=null;

		
		if (activity instanceof ReceiveEnd) {//本身是receive
			ret = (ReceiveEnd)activity;
		} else {
			java.util.List acts=null;
			
			if (activity instanceof Sequence) {
				acts = ((Sequence)activity).getActivityTypes();//如果是sequence，则得到里面的行为
				
			// If workunit, then check if non-observable condition
			} else if (activity instanceof BPOrderingStruturalActivity &&
					((BPOrderingStruturalActivity)activity).isSequentialGroupingConstruct() //不是sequence
					&&((BPOrderingStruturalActivity)activity).isConditionObservable() == false//且不是带条件的guard
					) {
//					edu.xjtu.cdl2bpel.common.util.NamesUtil.isSet(((WorkUnit)cdlType).
//							getExpression()) == false) {
				acts = ((BPOrderingStruturalActivity)activity).getActivityTypes();//得到里面的行为
			}
			
			// Extract first interaction from grouped activities
			if (acts != null && acts.size() > 0 &&
					acts.get(0) instanceof ReceiveEnd) {
				ret = (ReceiveEnd)acts.get(0);
			}
		}
		
		return(ret);
	}

/*	public static edu.xjtu.cdl2bpel.cdl.ExchangeInfo getReceiveExchange(edu.xjtu.cdl2bpel.cdl.CDLElement cdlType) {
		edu.xjtu.cdl2bpel.cdl.ExchangeInfo ret=null;
		
		// NOTE: This is performing this check from the choice elements
		// perspective. InteractionUtil.ignoreReceive is performing
		// the same check but from the ExchangeInfo perspective.
		// We need to make sure these checks are consistent.
		
		// NOTE: Would be nice to refactor to avoid instanceof,
		// but at the moment this provides the means to identify
		// the relevant components
		
		// Check if cdl type is a receive activity, or a
		// sequence with the first element being a receive activity
		edu.xjtu.cdl2bpel.cdl.Interaction interaction=null;
		
		if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.Interaction) {
			interaction = (edu.xjtu.cdl2bpel.cdl.Interaction)cdlType;
		} else {
			java.util.List acts=null;
			
			if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.Sequence) {
				acts = ((edu.xjtu.cdl2bpel.cdl.Sequence)cdlType).getActivities();
				
			// If workunit, then check if non-observable condition
			} else if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.WorkUnit 
//					&&
//					NamesUtil.isSet(((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).
//							getExpression()) == false
							) {
				acts = ((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getActivities();
			}
			
			// Extract first interaction from grouped activities
			if (acts != null && acts.size() > 0 &&
					acts.get(0) instanceof edu.xjtu.cdl2bpel.cdl.Interaction) {
				interaction = (edu.xjtu.cdl2bpel.cdl.Interaction)acts.get(0);
			}
		}
		
		if (interaction != null &&
				interaction.getExchangeInfos().size() > 0) {
			
			// Check if it begins with a 'receive' exchange
			if (edu.xjtu.cdl2bpel.cdl.util.InteractionUtil.isReceiveExchange((edu.xjtu.cdl2bpel.cdl.ExchangeInfo)
					interaction.getExchangeInfos().get(0))) {
				ret = (edu.xjtu.cdl2bpel.cdl.ExchangeInfo)
					interaction.getExchangeInfos().get(0);
			}
		}
		
		return(ret);
	}*/

	//conditional的父choice是基于事件的，且没有guard
	public static boolean ignoreConditional(Conditional conditional) {
		boolean ret=false;
		
		if (conditional.getParent() instanceof Choice) {
			
			
			Choice choice=(Choice)conditional.getParent();
			
			if (getChoiceType(choice) == CHOICE_TYPE_EVENT &&
					CheckNOthersUtil.isSet(conditional.getExpression()) == false) {
				ret = true;
			}
		}
		
		return(ret);
	}
	
	public static boolean isResponseHandler(Choice choice) {//判断choice的所有分支有有根choice前面的send匹配的receive活动
		boolean ret=false;
		
		if (choice != null &&
				getChoiceType(choice) == CHOICE_TYPE_EVENT) {//如果choice是事件类型的
			SendEnd req=null;
			BPActivity act=null;
			
			act = BPActivityContextReasoner.getPrecedingActivity(choice);
			if (act instanceof SendEnd &&
					((SendEnd)act).getClassification() ==
							MessageTypeEnumByInteraction.REQUEST) {//如果前一个是send且是request类型的
				req = (SendEnd)act;
			}	
		
			
			if (req != null) {
				java.util.Iterator iter=choice.getActivityTypes().iterator();
				ret = true;
				
				while (ret == true && iter.hasNext()) {//choice里面的所有活动
					act = (BPActivity)iter.next();
					
					ReceiveEnd recv=getReceiveExchange(act);//得到action的第一个receive元素
					if (recv == null) {//必须choice的每一个活动都配对才行
						ret = false;
						
					} else if (recv.getMessage().getOperation() !=//如果receive和send是同一类型的，就返回true，不是就返回false
							req.getMessage().getOperation()) {
						ret = false;						
					}
				}
			}
		}
		
		return(ret);
	}

	public static String getOptionalPathName(edu.xjtu.cdl2bpel.cdl.Choice choice) {
		return(choice.getName() +"_OptionalPath");
	}
}
