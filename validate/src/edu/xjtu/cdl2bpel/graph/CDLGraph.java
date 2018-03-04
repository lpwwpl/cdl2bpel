package edu.xjtu.cdl2bpel.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;
import edu.xjtu.cdl2bpel.cdl.util.InteractionUtil;
import edu.xjtu.cdl2bpel.cdl.util.PackageUtil;
import edu.xjtu.cdl2bpel.orchestra.util.CDLActivityContextReasoner;

public class CDLGraph {
	//保存每一个CDLEdge边对应的出边集合
	private Map<String, Set<CDLEdge>> outgoing_meg;
	//保存CDLNode节点集合
	private Map<String, CDLNode> cdlNodes;
	//记录CDL中不可到达节点的集合
	private List<CDLNode> unReachabilityNodes;
	//拥有CDL Package实体类
	private Package cdlPackage;
	//CDLExchange封装包含CDL中ExchangeInfo信息、是否被访问标志等，exchanges是保存
	//所有被封装后的CDLExchange集合
	private Queue<CDLExchange> exchanges;
	//记录CDL中所有的交互
	private Map<String, Interaction> interactions;
	//记录CDL中存在活锁的错误记录
	private Map<CDLNode, Set<CDLNode>> liveLockError; 
	
	public static void main(String args[]) {
//		CDLGraph cdlGraph = new CDLGraph("cdl/VerifCorrect.cdl");	
		CDLGraph cdlGraph = new CDLGraph("cdl/VerifLiveLock.cdl");	
//		CDLGraph cdlGraph = new CDLGraph("cdl/VerifRechability.cdl");	
		cdlGraph.verifInitialOp(cdlGraph.cdlPackage);
		cdlGraph.verifUnReachability();
		cdlGraph.verifLiveLock();	
		cdlGraph.printInfo();
	}
	
	public void printInfo() {
		System.out.println("----------------------------");
		System.out.println("         The CDLGraph:");
		for(String key: getOutgoing_meg().keySet()) {
			Set<CDLEdge> cdlEdgesOfKey = getOutgoing_meg().get(key);
			System.out.println(key+":");
			for(CDLEdge cdlEdge:cdlEdgesOfKey) {
				System.out.println("(->"+cdlEdge.getToParticipant().getName()+"),");
			}
		}
		System.out.println("----------------------------");
	}
	
	public CDLGraph(String file_name) {
		cdlNodes = new HashMap<String,CDLNode>();
		outgoing_meg = new HashMap<String,Set<CDLEdge>>();
		unReachabilityNodes = new ArrayList<CDLNode>();
		interactions = new HashMap<String,Interaction>();
		exchanges = new LinkedList<CDLExchange>();
		liveLockError = new HashMap<CDLNode, Set<CDLNode>>();
		load_CDLGraph(file_name);
	}
	
	public void verifLiveLock() {
		for(CDLNode nodeValue: cdlNodes.values()) {
			verifLiveLock(nodeValue);
			reset();
		}
		
		System.out.println("----------------------------");
		System.out.println("The LiveLock May be Happened in:");
		for(CDLNode iter:liveLockError.keySet()) {
			System.out.println(iter.getParticipantType().getName()+":");
			if(liveLockError.get(iter).size() == 0) {
				System.out.println("No LiveLock has been founed");
			} else {
				for (CDLNode error : liveLockError.get(iter)) {
					System.out.print("The LiveLock Node @"
							+ error.getParticipantType().getName() + ";");
				}
				System.out.println();
			}
		}
		System.out.println("----------------------------");
	}
	
	public void verifLiveLock(CDLNode startNode) {
		Queue<CDLNode> not_yet_explored = new LinkedList<CDLNode>();
		not_yet_explored.add(startNode);
		startNode.setVisited(true);
		
		while(!not_yet_explored.isEmpty()) {
			CDLNode node_to_explored = not_yet_explored.poll();
			Set<CDLEdge> adjEdges = getAdjEdges(node_to_explored);
			if(adjEdges!=null) {
				not_yet_explored.addAll(getCDLNodesByCDLEdges(startNode,adjEdges));
				while(!not_yet_explored.isEmpty()){
					CDLNode child=not_yet_explored.poll();
					child.setVisited(true);
					verifLiveLock(startNode,child,not_yet_explored);
				}
			}
		}
	}
	
	public void verifLiveLock(CDLNode startNode,CDLNode child,Queue<CDLNode> not_yet_explored) {

		Set<CDLEdge> adjEdges = getAdjEdges(child);
		if (adjEdges != null) {
			not_yet_explored.addAll(getCDLNodesByCDLEdges(startNode,adjEdges));
			while (!not_yet_explored.isEmpty()) {
				CDLNode theChild = not_yet_explored.poll();
				verifLiveLock(startNode, theChild, not_yet_explored);
			}
		}
	}
	
	public Set<CDLNode> getCDLNodesByCDLEdges(CDLNode startNode,Set<CDLEdge> adjEdges) {
		Set<CDLNode> needed_to_explored = new HashSet<CDLNode>();
		for (String key : cdlNodes.keySet()) {
			for (CDLEdge cdlEdge : adjEdges) {
				if (cdlEdge.getToParticipant().getName().equals(key)) {
					if(cdlNodes.get(key).isVisited()==false) {
						needed_to_explored.add(cdlNodes.get(key));
						cdlNodes.get(key).setVisited(true);
					} else {
						liveLockError.get(startNode).add(cdlNodes.get(key));
					}
				}
			}
		}
		return needed_to_explored;
	}
	
	public Set<CDLEdge> getAdjEdges(CDLNode node_to_explored) {
		for(String key:outgoing_meg.keySet()) {
			if(key.equals(node_to_explored.getParticipantType().getName())) {
				return outgoing_meg.get(key);
			}
		}
		return null;
	}
	
	public void verifUnReachability() {
		System.out.println(exchanges.size());
		verifUnReachabilityThroughCDLGraph();
		System.out.println("----------------------------");
		System.out.println("     Analyse Reachability:");
		for(CDLNode nodeValue: cdlNodes.values()) {
			if(nodeValue.isRechable() == false) {
				System.out.println(nodeValue.getParticipantType().getName()+":"+"May UnReachable!");
			}
		}
		System.out.println("----------------------------");
//		System.out.println("----------------------------");
//		System.out.println("     Analyse Reachability:");
//		for(CDLNode nodeValue: cdlNodes.values()) {
//			System.out.println(nodeValue.getParticipantType().getName()+" "+nodeValue.getIn()+":"+nodeValue.getOut());
//		}
//		System.out.println("----------------------------");
	}
	
	public void verifInitialOp(CDLElement cdlElement) {
		if (cdlElement instanceof Package) {

		}
		
		if (cdlElement instanceof Interaction) {
			Interaction theInteraction = ((Interaction) cdlElement);
			for(ExchangeInfo exchange:theInteraction.getExchangeInfos()) {
				CDLExchange cdlExchange = new CDLExchange(exchange);
				cdlExchange.setBelongedInteraction(theInteraction);
				exchanges.add(cdlExchange);
			}
//			if (!interactions.keySet().contains(theInteraction.getName())) {
//				interactions.put(((Interaction) cdlElement).getName(),
//						theInteraction);
//			}			
		} else {
			Iterator<?> it = cdlElement.eContents().iterator();
			for (; it.hasNext();) {
				CDLElement subCDLElemnt = (CDLElement) it.next();
				verifInitialOp(subCDLElemnt);
			}
		}
	}
	
	public void verifUnReachabilityThroughCDLGraph() {
		for(CDLExchange cdlExchange:exchanges) {
			if(cdlExchange.isVisited() == false) {
				cdlExchange.setVisited(true);
				ExchangeInfo belongedExchangeInfo = cdlExchange.getBelongedExchange();
				Interaction needed_to_judge = belongedExchangeInfo.getBelongedInteraction();
				RoleType fromRole = needed_to_judge.getParticipateByInteraction().getFromRoleTypeRef();
				RoleType toRole = needed_to_judge.getParticipateByInteraction().getToRoleTypeRef();
				ParticipantType fromParticipant = PackageUtil.getParticipantForRoleType(fromRole);
				ParticipantType toParticipant = PackageUtil.getParticipantForRoleType(toRole);
				if(belongedExchangeInfo.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
					cdlNodes.get(fromParticipant.getName()).addOut();
					cdlNodes.get(toParticipant.getName()).addIn();
				}
//				&&(belongedExchangeInfo.getFaultName()==null||belongedExchangeInfo.getFaultName().equals(""))
				if(belongedExchangeInfo.getAction() == ActionTypeEnumByExchangeInfo.RESPOND) {
					
					Activity precedingActivity = CDLActivityContextReasoner.getPrecedingConditionalGroupingActivity(belongedExchangeInfo.getBelongedInteraction());
					Activity choiceActivity = null;
					if(precedingActivity instanceof CaseConditionalOfSwitch) {
						choiceActivity = (Activity)precedingActivity.eContainer();
					} else if(precedingActivity instanceof Sequence) {
						
					}
					System.out.println(CDLActivityContextReasoner.getPrecedingConditionalGroupingActivity(belongedExchangeInfo.getBelongedInteraction()));
					if(choiceActivity == null) {
						ExchangeInfo requestExchange = CDLActivityContextReasoner.getPrecedingRequestExchange(needed_to_judge);
						if(requestExchange!=null) {
							cdlNodes.get(toParticipant.getName()).addOut();
							cdlNodes.get(fromParticipant.getName()).addIn();
						}
						interactions.put(needed_to_judge.toString(), needed_to_judge);
						buildOutGoing_meg(needed_to_judge);
					}
					if(choiceActivity instanceof Choice) {
						if(isMutliResponseCorrectWithRequest((Choice)choiceActivity,needed_to_judge)) {
							cdlNodes.get(toParticipant.getName()).addOut();
							cdlNodes.get(fromParticipant.getName()).addIn();
							interactions.put(needed_to_judge.toString(), needed_to_judge);
							buildOutGoing_meg(needed_to_judge);
						}
					}
				}
			}
		}
	}
	
	public void setExchangeVisited(ExchangeInfo exchange) {
		for(CDLExchange theExchange:exchanges) {
			if(theExchange.getBelongedExchange() == exchange) {
				theExchange.setVisited(true);
			}
		}
	}
	
	//currentActivity_not_to_explored
	public boolean isMutliResponseCorrectWithRequest(OrderingStructuralActivity ordering,Interaction act) {
		boolean ret = false;
		for(Activity branch:ordering.getActivities()) {
			if(branch instanceof CaseConditionalOfSwitch) {
				Activity subActOfCaseConditional = CDLActivityContextReasoner.getSubsequentActivitie(branch);
				while(subActOfCaseConditional instanceof Sequence) {
					subActOfCaseConditional = CDLActivityContextReasoner.getSubsequentActivitie(subActOfCaseConditional);
				}
				if(subActOfCaseConditional instanceof Interaction
				   &&CDLActivityContextReasoner.checkIsInTheSameInteraction(act,(Interaction)subActOfCaseConditional)
				   &&((Interaction)subActOfCaseConditional).getExchangeInfos().size()==1) {
					ret=true;
					setExchangeVisited(((Interaction)subActOfCaseConditional).getExchangeInfos().get(0));
					return ret;
				} else if(subActOfCaseConditional instanceof OrderingStructuralActivity){
					ret = isMutliResponseCorrectWithRequest((OrderingStructuralActivity)subActOfCaseConditional,act);
				} else if(subActOfCaseConditional instanceof Interaction
						&& !CDLActivityContextReasoner.checkIsInTheSameInteraction(
								act, (Interaction) subActOfCaseConditional)){
					ret = false;
				} else {
					ret = isFollowingResponseCorrectWithRequest(subActOfCaseConditional,act);
				}
			}
		}
		return ret;
	}
	
	public boolean isFollowingResponseCorrectWithRequest(Activity activitie,Interaction interation) {
		boolean ret = false;
		Activity subActivity = CDLActivityContextReasoner.getSubsequentActivitie(activitie);
		while (subActivity instanceof Sequence) {
			subActivity = CDLActivityContextReasoner.getSubsequentActivitie(activitie);
		}
		if (subActivity instanceof Interaction
				&& CDLActivityContextReasoner.checkIsInTheSameInteraction(
						interation, (Interaction) subActivity)
				&& ((Interaction) subActivity).getExchangeInfos().size() == 1) {
			ret = true;
			setExchangeVisited(((Interaction) subActivity).getExchangeInfos()
					.get(0));
			return ret;
		} else if (subActivity instanceof OrderingStructuralActivity) {
			ret = isMutliResponseCorrectWithRequest(
					(OrderingStructuralActivity) subActivity, interation);
		} else if(subActivity instanceof Interaction
				&& !CDLActivityContextReasoner.checkIsInTheSameInteraction(
						interation, (Interaction) subActivity)){
			ret = false;
		} else {
			ret = isFollowingResponseCorrectWithRequest(subActivity, interation);
		}
		return ret;
	}
	
	void load_CDLGraph(String file_name) {
		cdlPackage = CDLResolver.getPackageFromCDLFile(file_name);
		List<ParticipantType> participants = cdlPackage.getParticipantTypes();
		for (ParticipantType participantType : participants) {
			CDLNode cdlNode = new CDLNode(participantType);
			cdlNodes.put(participantType.getName(), cdlNode);
			
		}
		for(String str:cdlNodes.keySet()) {
			liveLockError.put(cdlNodes.get(str), new HashSet<CDLNode>());
		}
		for(String participantTypeName:cdlNodes.keySet()) {
			Set<CDLEdge> cdlEdgesOfTheParticipantType = new HashSet<CDLEdge>();
			outgoing_meg.put(participantTypeName, cdlEdgesOfTheParticipantType);
		}
	}

	protected boolean processExchangeInfo(ExchangeInfo exchange) {

		java.util.List reqExchanges = null;	
		ExchangeInfo reqInfo = null;

		if (exchange.getAction() == ActionTypeEnumByExchangeInfo.REQUEST
				|| exchange.getAction() == ActionTypeEnumByExchangeInfo.RESPOND) {
			reqExchanges = InteractionUtil.getRequestExchangeDetails(exchange);

		}

		if (reqExchanges != null && reqExchanges.size() >= 1) {
			reqInfo = (ExchangeInfo) reqExchanges.get(0);

			return true;
		}
		
		return false;

	}
	
	public void buildOutGoing_meg(Interaction interaction) {
		RoleType fromRoleType = interaction.getParticipateByInteraction().getFromRoleTypeRef();
		RoleType toRoleType = interaction.getParticipateByInteraction().getToRoleTypeRef();
		ParticipantType fromParticipantType = PackageUtil.getParticipantForRoleType(fromRoleType);
		ParticipantType toParticipantType = PackageUtil.getParticipantForRoleType(toRoleType);
		
		Set<CDLEdge> cdlEdges = outgoing_meg.get(fromParticipantType.getName());
		if(cdlEdges.size()==0) {
			CDLEdge cdlEdge = new CDLEdge(toParticipantType);
			outgoing_meg.get(fromParticipantType.getName()).add(cdlEdge);
		} else {
			for (CDLEdge theCdlEdge : cdlEdges) {
				if (!theCdlEdge.getToParticipant().getName().equals(toParticipantType.getName())) {
					outgoing_meg.get(fromParticipantType.getName()).add(
							new CDLEdge(toParticipantType));
				}
			}
		}
	}

	public void reset() {
		for (CDLNode cdlNodeValue : cdlNodes.values()) {
			cdlNodeValue.setVisited(false);
		}
	}
	
	public List<CDLNode> getUnReachabilityNodes() {
		return unReachabilityNodes;
	}

	public Map<String, Set<CDLEdge>> getOutgoing_meg() {
		return outgoing_meg;
	}

	public void setOutgoing_meg(Map<String, Set<CDLEdge>> outgoingMeg) {
		outgoing_meg = outgoingMeg;
	}

	public Map<String, CDLNode> getCdlNodes() {
		return cdlNodes;
	}

	public void setCdlNodes(Map<String, CDLNode> cdlNodes) {
		this.cdlNodes = cdlNodes;
	}

	public List<CDLNode> getLiveLockNodes() {
		return unReachabilityNodes;
	}

	public void setUnReachabilityNodes(List<CDLNode> unReachabilityNodes) {
		this.unReachabilityNodes = unReachabilityNodes;
	}
	
	public Map<CDLNode, Set<CDLNode>> getLiveLockError() {
		return liveLockError;
	}

	public void setLiveLockError(Map<CDLNode, Set<CDLNode>> liveLockError) {
		this.liveLockError = liveLockError;
	}
	
	public Queue<CDLExchange> getExchanges() {
		return exchanges;
	}

	public void setExchanges(Queue<CDLExchange> exchanges) {
		this.exchanges = exchanges;
	}
}
