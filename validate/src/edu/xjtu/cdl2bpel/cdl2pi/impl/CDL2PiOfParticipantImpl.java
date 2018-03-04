package edu.xjtu.cdl2bpel.cdl2pi.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl2orchestra.CDL2RoleRelevanceProjector;
import edu.xjtu.cdl2bpel.cdl2pi.CDL2PiOfParticipant;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity;
import edu.xjtu.cdl2bpel.orchestra.Choice;
import edu.xjtu.cdl2bpel.orchestra.Conditional;
import edu.xjtu.cdl2bpel.orchestra.FaultHandler;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.orchestra.Sequence;
import edu.xjtu.cdl2bpel.orchestra.util.BPActivityContextReasoner;
import edu.xjtu.cdl2bpel.orchestra.util.ChoiceContextReasoner;
import edu.xjtu.cdl2bpel.pi.PiAgent;
import edu.xjtu.cdl2bpel.pi.PiChannel;
import edu.xjtu.cdl2bpel.pi.PiChoice;
import edu.xjtu.cdl2bpel.pi.PiConditional;
import edu.xjtu.cdl2bpel.pi.PiElement;
import edu.xjtu.cdl2bpel.pi.PiMeg;
import edu.xjtu.cdl2bpel.pi.PiParallel;
import edu.xjtu.cdl2bpel.pi.PiReceive;
import edu.xjtu.cdl2bpel.pi.PiSend;
import edu.xjtu.cdl2bpel.pi.PiSequence;

public class CDL2PiOfParticipantImpl implements CDL2PiOfParticipant {

	private PiAgent agent;
	private Map<RelationshipType, PiChannel> relatedChannels;
	private Orchestra2PiContext context;
	private ParticipantType participantType;
	private Package cdlpack;
	private Set<PiMeg> relatedMegs;
	private PiElement seq; 
	
	public CDL2PiOfParticipantImpl(Package cdlpack,ParticipantType participantType) {
		this.cdlpack = cdlpack;
		this.participantType = participantType;
		String engineName = participantType.getName(); // 设置一个初始的进程agent
		agent = new PiAgent(engineName);
		context = new Orchestra2PiContext(participantType,agent);
		relatedChannels = new HashMap<RelationshipType, PiChannel>();
		relatedMegs = new HashSet<PiMeg>();
		seq = context.createElement("sequence");
	}

	public void initialChannelsOfPiCalculus(Package cdlpack) {
		String channels[] = {"x","y","z","w","a","b","c","d","e","f","g","h","i","j","k","l","n","n","o","p","q","r","s","t","u","v"};
		List relations = cdlpack.getRelationshipTypes();
		int i = 0;
		for (Iterator it = relations.iterator(); it.hasNext();) {
			edu.xjtu.cdl2bpel.cdl.RelationshipType relationshipType = (edu.xjtu.cdl2bpel.cdl.RelationshipType) it.next();
			
			PiChannel piChannel = new PiChannel(channels[i++]);
			relatedChannels.put(relationshipType, piChannel);
		}
	}

//	public void initialInteractionMegOfPiCalculus(GlobalArchitecture globalArchitecture) {
//		List<InterfaceOfGroup> interfaces = globalArchitecture.getInterfaces();
//		for (Iterator it = interfaces.iterator(); it.hasNext();) {
//			InterfaceOfGroup interafaceOfGroup = (InterfaceOfGroup)it.next();
//			Set<PiMeg> piMegs = new HashSet<PiMeg>();
//			if(isRelatedToAgent(interafaceOfGroup,this.participantType)){
//				for (Operation op : interafaceOfGroup.getOperations()) {
//					for (Message meg : op.getMessages()) {
//						PiMeg piMeg = new PiMeg(XMLUtils.getLocalname(meg.getInformationType().getType()));
//						System.out.println(piMeg.getName());
//						piMegs.add(piMeg);
//					}
//					megs.put(op, piMegs);
//				}
//			}
//		}
//	}
	
	public PiChannel getChannel(ChannelType channelType) {
		return relatedChannels.get(channelType);
	}
	
	public boolean isRelatedToAgent(InterfaceOfGroup interfaceOfGroup,ParticipantType participantType) {
		boolean ret = false;
		List<RoleType> roleTypes = participantType.getRoleTypes();
		for(RoleType roleType:roleTypes) {
			if(interfaceOfGroup.getDescription().equals(roleType.getName())||
					interfaceOfGroup.getDescription().equals(roleType.getName())) {
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	public boolean isRelatedToAgent(RelationshipType relationship,ParticipantType participantType) {
		boolean ret = false;
		List<RoleType> roleTypes = participantType.getRoleTypes();
		for(RoleType roleType:roleTypes) {
			if(relationship.getRoleTypeOfFirst().getName().equals(roleType.getName())||
			   relationship.getRoleTypeOfSecond().getName().equals(roleType.getName())) {
				ret = true;
				break;
			}
		}
		return ret;
	}
	
	public Set<String> getFreeName(ParticipantType participantType) {
		Set<String> ret = new HashSet<String>();
		for(PiMeg meg:relatedMegs) {
			ret.add(meg.toString());
		}
		for(RelationshipType relationship:relatedChannels.keySet()) {
			if(isRelatedToAgent(relationship,participantType)) {
				ret.add(relatedChannels.get(relationship).toString());
			}
		}
		return ret;
	}
	
	public String generateCDL2PiCalculusByParticipant() {
		CDL2RoleRelevanceProjector temp = new CDL2RoleRelevanceProjector(
				(RoleType[]) (participantType.getRoleTypes().toArray()));
		temp.execute(cdlpack);
		initialChannelsOfPiCalculus(cdlpack);
		GlobalArchitecture globalArchitecture = temp.getGlobalArchitecture();
//		initialInteractionMegOfPiCalculus(globalArchitecture);
		initialChannelsOfPiCalculus(cdlpack);

		Orchestra2PiContext context = new Orchestra2PiContext(participantType,agent);

		String ret = "";

		agent = parseGlobalArch(globalArchitecture, agent, context);
		
		Set<String> freeName=getFreeName(participantType);
		agent.setFreeName(freeName);
		agent.setAction(seq.toString());
		
		ret = agent.toString();

		return ret;
	}

	public PiAgent parseGlobalArch(GlobalArchitecture globalArchitecture,
			PiAgent agent, Orchestra2PiContext context) {
		
		List<BPOrchestra> bpOrchestras = globalArchitecture.getBpOrchestras();
		context.push(seq);
		for (BPOrchestra bpOrchestra : bpOrchestras) {
			parseBPOrchestra(bpOrchestra, agent, context);
		}
		context.pop();
		return agent;
	}

	public void parseBPElementOfActivityType(BPElement bpElement, PiAgent agent,
			Orchestra2PiContext context) {
		PiElement piElement = null;
		if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.Sequence) {
			piElement = parseSequence((edu.xjtu.cdl2bpel.orchestra.Sequence) bpElement,
					agent, context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.Parallel) {
			piElement = parseParallel((edu.xjtu.cdl2bpel.orchestra.Parallel) bpElement,
					agent, context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.Choice) {
			piElement = parseChoice((edu.xjtu.cdl2bpel.orchestra.Choice) bpElement, agent,
					context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.Conditional) {
			piElement = parseConditional(
					(edu.xjtu.cdl2bpel.orchestra.Conditional) bpElement, agent,
					context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.NoAction) {
			piElement = parseNoAction((edu.xjtu.cdl2bpel.orchestra.NoAction) bpElement,
					agent, context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.SendEnd) {
			piElement = parseSendEnd((edu.xjtu.cdl2bpel.orchestra.SendEnd) bpElement,
					agent, context);
		} else if (bpElement instanceof edu.xjtu.cdl2bpel.orchestra.ReceiveEnd) {
			piElement = parseReceiveEnd((edu.xjtu.cdl2bpel.orchestra.ReceiveEnd) bpElement,
					agent, context);
		} 
		context.push(piElement);
		if(bpElement instanceof BPOrderingStruturalActivity) {
			List<BPActivity> activities = ((BPOrderingStruturalActivity)bpElement).getActivityTypes();
			for (BPActivity activitie : activities) {
				parseBPElementOfActivityType(activitie, agent, context);
			}			
		}
		
		context.pop();
	}

	public void parseBPOrchestra(BPOrchestra bpOrchestra, PiAgent agent,
			Orchestra2PiContext context) {
		if (bpOrchestra.getRoot() == Boolean.FALSE) {

		}
		if (!(bpOrchestra.getActivityTypes().size() == 1 && (bpOrchestra
				.getActivityTypes().get(0) instanceof Sequence))) {
//			context.push(seq);
		}
		List<BPActivity> activities = bpOrchestra.getActivityTypes();
		for (BPActivity activitie : activities) {
			parseBPElementOfActivityType(activitie, agent, context);
		}
//		context.pop();
	}

	public PiElement parseSequence(edu.xjtu.cdl2bpel.orchestra.Sequence sequence,
			PiAgent agent, Orchestra2PiContext context) {
		PiElement returnElement = null;
		// 如果上层是choice且当前标签为switch，那么sequence就要翻译为case
		if (sequence.getParent() instanceof Choice
				&& context.getCurrentElement().getName().equals("switch")) {
			PiElement caseElement = (PiConditional)context.createElement("case");
			context.getCurrentElement().getChildren().add(caseElement);
			returnElement = caseElement;
		} else if (sequence.getActivityTypes().size() > 0) {// 如果sequence里面有活动的话，就要翻译为sequence
			if (context.getCurrentElement().getName().equals("sequence")) {// 如果当前标签也是sequence，这样就不用创建一个sequence了（避免sequence的嵌套），把cdlSequence中的活动直接添加到父sequence中去即可
				returnElement = context.getCurrentElement();
			} else {
				PiElement sequenceElement = (PiSequence)context.createElement("sequence");
				context.getCurrentElement().getChildren().add(sequenceElement);
				returnElement = sequenceElement;
			}
		}
		
		return returnElement;
	}

	public PiElement parseParallel(edu.xjtu.cdl2bpel.orchestra.Parallel parallel,
			PiAgent agent, Orchestra2PiContext context) {
		PiElement flowElement= (PiParallel)context.createElement("paralle");
		context.getCurrentElement().getChildren().add(flowElement);
		return flowElement;
	}

	public PiElement parseChoice(edu.xjtu.cdl2bpel.orchestra.Choice choice,
			PiAgent agent, Orchestra2PiContext context) {
		PiElement returnElement = null;
		returnElement = context.createElement("choice");
		
		context.getCurrentElement().getChildren().add(returnElement);
		List<BPActivity> children = choice.getActivityTypes();
		List<BPActivity> subActivities = BPActivityContextReasoner.getSubsequentActivitiesInTheSameParent(choice);
		for(BPActivity child:children) {
			
			if(child instanceof BPOrderingStruturalActivity) {
				for (BPActivity bpActivity : subActivities) {
					((BPOrderingStruturalActivity)child).getActivityTypes().add(
							bpActivity);
				}
			} 
		}
		return returnElement;
	}

	public PiElement parseNoAction(edu.xjtu.cdl2bpel.orchestra.NoAction noAction,
			PiAgent agent, Orchestra2PiContext context) {
		PiElement returnElement = null;
		returnElement = context.createElement("noAction");
	
		if(context.getCurrentElement()!=null)
		context.getCurrentElement().getChildren().add(returnElement);
		return returnElement;
	}

	public PiElement parseSendEnd(edu.xjtu.cdl2bpel.orchestra.SendEnd sendEnd,
			PiAgent agent, Orchestra2PiContext context) {
		PiElement returnElement = null;
		ReceiveEnd receiveEnd = null;
		if (BPActivityContextReasoner.getNextActivityInParent(sendEnd) != null
				&& BPActivityContextReasoner.getNextActivityInParent(sendEnd) instanceof ReceiveEnd) {
			receiveEnd = (ReceiveEnd) BPActivityContextReasoner
					.getNextActivityInParent(sendEnd);
		}

		if ((receiveEnd != null && !sendEnd.getAdditional().equals(
			receiveEnd.getAdditional())) == false) {
			returnElement = context.createElement("send");
			String theReceiveInformation = sendEnd.getAddition();
			StringTokenizer st = new StringTokenizer(theReceiveInformation," ");
			PiMeg meg = getMeg(st.nextToken());
			PiChannel channel = getChannel(st.nextToken());
			((PiSend)returnElement).setChannel(channel);
			((PiSend)returnElement).setMeg(meg);
			context.getCurrentElement().getChildren().add(returnElement);
		}
		return returnElement;
	}

	public PiChannel getChannel(String relationshipName) {
		PiChannel piChannel = null;
		for(RelationshipType relationshipType:relatedChannels.keySet()) {
			if(relationshipType.getName().equals(relationshipName)) {
				piChannel = relatedChannels.get(relationshipType);
				break;
			}
		}
		return piChannel;
	}
	
	public PiMeg getMeg(String megName) {
		PiMeg piMeg = null;
		for(PiMeg thePiMeg:relatedMegs) {
			if(thePiMeg.getName().equals(megName)) {
				piMeg = thePiMeg;
				break;
			}
		}
		if(piMeg == null) {
			piMeg = new PiMeg(megName);
			relatedMegs.add(piMeg);
		}
		return piMeg;
	}
	
	public PiElement parseReceiveEnd(
			edu.xjtu.cdl2bpel.orchestra.ReceiveEnd receiveEnd, PiAgent agent,
			Orchestra2PiContext context) {
		PiElement returnElement = null;
		SendEnd sendEnd = null;
		if (BPActivityContextReasoner.getPrecedingActivity(receiveEnd) != null
				&& BPActivityContextReasoner.getPrecedingActivity(receiveEnd) instanceof SendEnd) {
			sendEnd = (SendEnd) BPActivityContextReasoner
					.getPrecedingActivity(receiveEnd);
		}
		if ((sendEnd != null && !sendEnd.getAdditional().equals(
				receiveEnd.getAdditional())) == false) {// 角色分组要求这层判断

			PiElement conditionalElement = context.getCurrentElement();// 暂时假设当前是pick，其实当前标签还可能是sequence，在后续有处理
			boolean isBranch = false;// 判定是否需要生成onMessage标签
			PiElement receive_OnMessage = this.performReceiveConversion(
					context, receiveEnd, isBranch);
			String theReceiveInformation = receiveEnd.getAddition();
			StringTokenizer st = new StringTokenizer(theReceiveInformation," ");
			PiMeg meg = getMeg(st.nextToken());
			PiChannel channel = getChannel(st.nextToken());
			((PiReceive)receive_OnMessage).setChannel(channel);
			((PiReceive)receive_OnMessage).setMeg(meg);
			
			conditionalElement.getChildren().add(receive_OnMessage);
			returnElement = receive_OnMessage;		
		}
		
		return returnElement;
	}

	public PiElement performReceiveConversion(Orchestra2PiContext context,
			ReceiveEnd recv, boolean isBranch) {
		PiElement ret = null;
		ret = context.createElement("receive");
		return (ret);
	}
	
	public PiElement parseConditional(
			edu.xjtu.cdl2bpel.orchestra.Conditional conditional, PiAgent agent,
			Orchestra2PiContext context) {
		PiElement returnElement = null;
		PiElement catchElement = null;
		if (conditional.getParent() instanceof FaultHandler) {// 这说明conditional是exceptionHandlers下面的，故conditional要翻译为catch或是catchAll

		}
		else if (ChoiceContextReasoner.ignoreConditional(conditional) == false) {// 如果条件语句不能忽略，就是说workunit具备guard
			PiElement switchElement = null;
			PiElement sequenceElement = null;
			BPOrderingStruturalActivity parentActivity = null;

//			if (conditional.getParent() instanceof BPOrderingStruturalActivity) {
//				parentActivity = (BPOrderingStruturalActivity) conditional
//						.getParent();
//
//				List<BPActivity> subActivities = BPActivityContextReasoner
//						.getSubsequentActivitiesInTheSameParent(parentActivity);
//				for (BPActivity child : parentActivity.getActivityTypes()) {
//					if (child instanceof BPOrderingStruturalActivity) {
//						for (BPActivity bpActivity : subActivities) {
//							((BPOrderingStruturalActivity) child).getActivityTypes().add(
//									bpActivity);
//						}
//					}
//				}
//			}
			
//			List<Conditional> otherConditionals = getOtherConditional(conditional);
//		
//			if(parentActivity != null) {
//				List<BPActivity> subActivities = BPActivityContextReasoner
//						.getSubsequentActivitiesInTheSameParent(parentActivity);
//				for (BPActivity bpActivity : subActivities) {
//					conditional.getActivityTypes().add(bpActivity);
//				}
//			}
			
			if(context.getCurrentElement() instanceof PiChoice)	{
				switchElement = context.createElement("case");
				String information = conditional.getAddition();
				StringTokenizer st = new StringTokenizer(information," ");
				PiMeg meg = getMeg(st.nextToken());
				((PiConditional)switchElement).setMeg(meg);
				PiMeg megValue = getMeg(st.nextToken());
				((PiConditional)switchElement).setMegValue(megValue.getName());
				((PiChoice)context.getCurrentElement()).getChildren().add(switchElement);
				sequenceElement = context.createElement("sequence");
				switchElement.getChildren().add(sequenceElement);
			} else {
				
			}

			returnElement = sequenceElement;
		}

		return returnElement;
	}

	public List<Conditional> getOtherConditional(Conditional conditional) {
		List<Conditional> otherConditionals = new ArrayList();
		BPOrderingStruturalActivity parentActivity = null;
		if(conditional.getParent() instanceof BPOrderingStruturalActivity) {
			parentActivity = (BPOrderingStruturalActivity)conditional.getParent();
		}
		for(BPActivity activity:parentActivity.getActivityTypes()) {
			if(activity.equals(conditional)) {
				
			} else {
				
				otherConditionals.add((Conditional)activity);
			}
		}
		return otherConditionals;
		
	}
	
	public PiAgent getAgent() {
		return agent;
	}

	public void setAgent(PiAgent agent) {
		this.agent = agent;
	}

	public Map<RelationshipType, PiChannel> getRelatedChannels() {
		return relatedChannels;
	}

	public void setRelatedChannels(Map<RelationshipType, PiChannel> relatedChannels) {
		this.relatedChannels = relatedChannels;
	}
	
	public Orchestra2PiContext getContext() {
		return context;
	}

	public void setContext(Orchestra2PiContext context) {
		this.context = context;
	}
	
	public ParticipantType getParticipantType() {
		return participantType;
	}

	public void setParticipantType(ParticipantType participantType) {
		this.participantType = participantType;
	}
}