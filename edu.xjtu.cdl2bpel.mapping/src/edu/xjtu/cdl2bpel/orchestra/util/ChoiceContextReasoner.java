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
	
	public static final int CHOICE_TYPE_EVENT=0;//˵��choice������л����interaction�йأ���ÿһ������и�receive
	public static final int CHOICE_TYPE_CONDITION=1;//˵��choice������л��cdl�ж��Ǿ���guard��workUnit
	public static final int CHOICE_TYPE_MIXED=2;//choice������л��������������Ļ��

	//˵��choice������л���и�receiveEnd
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
			} else if (isEventBasedActivity(act)) {//��interaction��أ�����receive��ͷ
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

	public static boolean isConditionalExpressionSet(BPActivity activity) {//activity�ǹ�����Ԫ��ģ����ҹ�����Ԫ���guard���ʽ��Ϊ��
		boolean ret=false;
		
		if (activity instanceof NoAction||activity instanceof BPOrderingStruturalActivity &&
				((BPOrderingStruturalActivity)activity).isConditionalGroupingConstruct() 
				&&((BPOrderingStruturalActivity)activity).isConditionObservable()//��Ҫ����guard���ʽ�ǿպϷ�
				) {
			ret = true;
		}
		
		return(ret);
	}

	//�ǹ�����Ԫ���ҹ�����Ԫ���guard���ʽ��Ϊ��
	/*public static boolean isConditionalExpressionSet(CDLElement cdlType) {
		boolean ret=false;
		
		if (cdlType instanceof edu.xjtu.cdl2bpel.cdl.WorkUnit &&
				NamesUtil.isSet(
						((edu.xjtu.cdl2bpel.cdl.WorkUnit)cdlType).getGuardExpression())) {
			ret = true;
		}
		
		return(ret);
	}*/
//����û��receive  �ǲ���receive���һ��Ԫ�������������receive��choice
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
					((Sequence)activity).getActivityTypes().get(0) instanceof Choice) {//sequence�ĵ�һ��Ԫ����choice
				
				choice = (Choice)((Sequence)activity).getActivityTypes().get(0);
			} else if (activity instanceof BPOrderingStruturalActivity &&
					isConditionalExpressionSet(activity) == false &&
					((BPOrderingStruturalActivity)activity).getActivityTypes().size() > 0 &&
					((BPOrderingStruturalActivity)activity).getActivityTypes().get(0) instanceof Choice) {//�������ĵ�һ��Ԫ����choice
				choice = (Choice)((BPOrderingStruturalActivity)activity).getActivityTypes().get(0);
			}
			
			if (choice != null &&
					getChoiceType(choice) == CHOICE_TYPE_EVENT) {//����һ��choice�ǲ��Ǹ�iteraction�йصģ�����йأ���Ҫ��invoke�ķ�ʽ����
				ret = true;
			}
		}
		
		return(ret);
	}
	
	/*public static boolean isEventBasedActivity(CDLElement cdlType) {
		boolean ret=false;
		
		// Check if cdl type is a receive activity, or a
		// sequence with the first element being a receive activity
		if (getReceiveExchange(cdlType) != null) {//��һ��Ԫ����receive
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
	//���activity��receive���򷵻أ�   �����sequence����choice����õ����һ��������һ�����receive�򷵻أ����򷵻�null
	public static ReceiveEnd getReceiveExchange(BPActivity activity) {
		ReceiveEnd ret=null;

		
		if (activity instanceof ReceiveEnd) {//������receive
			ret = (ReceiveEnd)activity;
		} else {
			java.util.List acts=null;
			
			if (activity instanceof Sequence) {
				acts = ((Sequence)activity).getActivityTypes();//�����sequence����õ��������Ϊ
				
			// If workunit, then check if non-observable condition
			} else if (activity instanceof BPOrderingStruturalActivity &&
					((BPOrderingStruturalActivity)activity).isSequentialGroupingConstruct() //����sequence
					&&((BPOrderingStruturalActivity)activity).isConditionObservable() == false//�Ҳ��Ǵ�������guard
					) {
//					edu.xjtu.cdl2bpel.common.util.NamesUtil.isSet(((WorkUnit)cdlType).
//							getExpression()) == false) {
				acts = ((BPOrderingStruturalActivity)activity).getActivityTypes();//�õ��������Ϊ
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

	//conditional�ĸ�choice�ǻ����¼��ģ���û��guard
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
	
	public static boolean isResponseHandler(Choice choice) {//�ж�choice�����з�֧���и�choiceǰ���sendƥ���receive�
		boolean ret=false;
		
		if (choice != null &&
				getChoiceType(choice) == CHOICE_TYPE_EVENT) {//���choice���¼����͵�
			SendEnd req=null;
			BPActivity act=null;
			
			act = BPActivityContextReasoner.getPrecedingActivity(choice);
			if (act instanceof SendEnd &&
					((SendEnd)act).getClassification() ==
							MessageTypeEnumByInteraction.REQUEST) {//���ǰһ����send����request���͵�
				req = (SendEnd)act;
			}	
		
			
			if (req != null) {
				java.util.Iterator iter=choice.getActivityTypes().iterator();
				ret = true;
				
				while (ret == true && iter.hasNext()) {//choice��������л
					act = (BPActivity)iter.next();
					
					ReceiveEnd recv=getReceiveExchange(act);//�õ�action�ĵ�һ��receiveԪ��
					if (recv == null) {//����choice��ÿһ�������Բ���
						ret = false;
						
					} else if (recv.getMessage().getOperation() !=//���receive��send��ͬһ���͵ģ��ͷ���true�����Ǿͷ���false
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
