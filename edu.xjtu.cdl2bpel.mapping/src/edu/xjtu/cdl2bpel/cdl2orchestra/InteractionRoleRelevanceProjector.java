package edu.xjtu.cdl2bpel.cdl2orchestra;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenTypeEnumByRecordInfo;
import edu.xjtu.cdl2bpel.cdl.impl.InteractionImpl;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.cdl.util.InteractionUtil;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.commons.util.CommonNamespaceUtil;
import edu.xjtu.cdl2bpel.orchestra.BPActivity;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.BPOrchestra;
import edu.xjtu.cdl2bpel.orchestra.CaseException;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Message;
import edu.xjtu.cdl2bpel.orchestra.MessageTypeEnumByInteraction;
import edu.xjtu.cdl2bpel.orchestra.OnAlarm;
import edu.xjtu.cdl2bpel.orchestra.Operation;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.ReceiveEnd;
import edu.xjtu.cdl2bpel.orchestra.SendEnd;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class InteractionRoleRelevanceProjector extends AbstractCDL2OrchestraProjector{

	public InteractionRoleRelevanceProjector(
			CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement,context);
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = false;

		ret = cdlElement.isRelevantWithTheRoleGroup(
				context.getRoleTypes());

		if (ret == true && intf == InteractionImpl.class) {
			ret = true;
		} else {
			ret = false;
		}

		return ret;
	}
	
	public void transformCDLElement2Orchestra(
			CDL2OrchestraRoleRelevanceContext context) {
		
		Interaction interaction = (Interaction)cdlElement;
		boolean generateClient = false;
		boolean generateServer = false;
		if (isContainedByRoleTypes(interaction.getTheFromRoleOfInteraction())) {
			generateClient = true;
		}
		if (isContainedByRoleTypes(interaction.getTheToRoleOfInteraction())) {
			generateServer = true;
		}
		if (generateServer || generateClient) {
			edu.xjtu.cdl2bpel.orchestra.Sequence seq = OrchestraFactory.eINSTANCE
					.createSequence();
			seq.setName(interaction.getName());
			seq.setDescription(interaction.getDescription());
			ExchangeInfo[] reqs = interaction.getRequestExchanges();

			if (reqs != null && reqs.length > 0) {
				processExchange(seq, interaction, reqs[0], generateClient,
						generateServer);
			}

			ExchangeInfo[] responds = interaction.getResponseExchanges();
			// ExchangeInfo[]
			// notifications=interaction.getNotificationExchanges();
			ExchangeInfo[] faults = interaction.getFaultExchanges();

			if ((responds.length + faults.length) > 1) {
				edu.xjtu.cdl2bpel.orchestra.Choice choice = OrchestraFactory.eINSTANCE
						.createChoice();

				for (int i = 0; i < responds.length; i++) {
					edu.xjtu.cdl2bpel.orchestra.Sequence subseq = OrchestraFactory.eINSTANCE
							.createSequence();

					// Setup uri and label in case this inserted
					// sequence needs to be referenced
					subseq.setName(responds[i].getName());

					processExchange(subseq, interaction, responds[i],
							generateServer, generateClient);

					// Sequence required, even if only one element,
					// in case an extension is required
					choice.getActivityTypes().add(subseq);
				}

				// for (int i=0; i < notifications.length; i++) {
				// edu.xjtu.cdl2bpel.orchestra.Sequence subseq=
				// OrchestraFactory.eINSTANCE.createSequence();
				//				
				// // Setup uri and label in case this inserted
				// // sequence needs to be referenced
				// subseq.setName(notifications[i].getName());
				//				
				// processExchange(subseq, interaction, notifications[i],
				// generateServer, generateClient);
				//								
				// // Sequence required, even if only one element,
				// // in case an extension is required
				// choice.getBPActivitys().add(subseq);
				// }

				for (int i = 0; i < faults.length; i++) {
					edu.xjtu.cdl2bpel.orchestra.Sequence subseq = OrchestraFactory.eINSTANCE
							.createSequence();

					// Setup uri and label in case this inserted
					// sequence needs to be referenced
					subseq.setName(faults[i].getName());

					processExchange(subseq, interaction, faults[i],
							generateServer, generateClient);

					// Sequence required, even if only one element,
					// in case an extension is required
					choice.getActivityTypes().add(subseq);
				}

				seq.getActivityTypes().add(choice);

			} else if (responds.length == 1) {
				processExchange(seq, interaction, responds[0], generateServer,
						generateClient);

			} else if (faults.length == 1) {
				processExchange(seq, interaction, faults[0], generateServer,
						generateClient);
			}

			boolean timeout = processTimeout(interaction);

			if (seq.getActivityTypes().size() == 1) {
				addActivity2StructIfCurrentElementBeOrderingStructuralActivity((BPElement) seq.getActivityTypes().get(0));
			} else {
				if (context.getCurrentBPElement() instanceof edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity) {
					edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity scope = (edu.xjtu.cdl2bpel.orchestra.BPOrderingStruturalActivity) context.getCurrentBPElement();

					scope.getActivityTypes().addAll(seq.getActivityTypes());
				} else {
					addActivity2StructIfCurrentElementBeOrderingStructuralActivity(seq);
				}
			}

			if (timeout) {
				context.popBPElementStack();
			}
		}
	}
	
	public void processExchange(edu.xjtu.cdl2bpel.orchestra.Sequence seq,
			Interaction interaction, ExchangeInfo details,
			boolean generateSend, boolean generateReceive) {
		BPOrchestra bpOrchestra = null;
		String serviceTypeName= 
			extractServiceInfo(interaction.getChannelVariable());
		Message mdef = getMessage(interaction,
					details, serviceTypeName);
		if (context.getCurrentBPElement() instanceof BPActivity) {
			bpOrchestra = ((BPActivity)context.getCurrentBPElement()).getBelongedBPOrchestra();
		}
		
		if (bpOrchestra == null) {
			
		}

		if (generateSend) {			
	
			addRecordInfo(seq.getActivityTypes(), interaction,
					details.getSendRecordReference(),
					WhenTypeEnumByRecordInfo.BEFORE);
			SendEnd send = OrchestraFactory.eINSTANCE.createSendEnd();
			send.setName(details.getName());			
			send.setMessage(mdef);
			
			if(details.getAction()==ActionTypeEnumByExchangeInfo.REQUEST) {
				send.setAdditional(interaction.getTheFromRoleOfInteraction().getName());
			} else {
				send.setAdditional(interaction.getTheToRoleOfInteraction().getName());
			}
//			send.setAddition(interaction.getRelationship().getName());
			send.setAddition(details.getSendVariable().getName()+"$"+details.getSendVariablePart()+" "+interaction.getRelationship().getName());
			if (details.getSendVariable() != null &&
					details.getSendVariable().getName() != null) {
				
				edu.xjtu.cdl2bpel.orchestra.Variable var=
					bpOrchestra.getVariable(details.getSendVariable().getName());
						
				if (var == null) {
					
				}
				
				send.setVariable(var);
				
				if (details.getSendVariablePart()!=null) {	
					send.setVariablePart(details.getSendVariablePart());
				}
			}
			
			edu.xjtu.cdl2bpel.orchestra.Variable channel=
				bpOrchestra.getVariable(interaction.getChannelVariable().getName());

			if (channel == null) {
				
			} else if ((channel instanceof edu.xjtu.cdl2bpel.orchestra.ChannelType) == false) {
				
			} else {
				if(interaction.getChannelVariable().getType() instanceof edu.xjtu.cdl2bpel.cdl.ChannelType) {
					channel.setAddition(((edu.xjtu.cdl2bpel.cdl.ChannelType)interaction.getChannelVariable().getType()).getRoleType().getName());
				}
				send.setChannelType((edu.xjtu.cdl2bpel.orchestra.ChannelType)channel);
			}
			
			seq.getActivityTypes().add(send);
			
			if (details.getCauseExceptionOfSend()!=null) {
				
				CaseException raise=
					OrchestraFactory.eINSTANCE.createCaseException();
				raise.setExceptionValue(convertQName(details,
						details.getCauseExceptionOfSend()));
				seq.getActivityTypes().add(raise);
			}		
			
			addRecordInfo(seq.getActivityTypes(), interaction,
					details.getSendRecordReference(),
					WhenTypeEnumByRecordInfo.AFTER);
		}
		
		if (generateReceive) {
			
			addRecordInfo(seq.getActivityTypes(), interaction,
					details.getReceiveRecordReference(),
					WhenTypeEnumByRecordInfo.BEFORE);
			
			ReceiveEnd recv=OrchestraFactory.eINSTANCE.createReceiveEnd();
			recv.setName(details.getName());
			recv.setMessage(mdef);
			
			if(details.getAction()==ActionTypeEnumByExchangeInfo.RESPOND) {
				recv.setAdditional(interaction.getTheFromRoleOfInteraction().getName());
			} else {
				recv.setAdditional(interaction.getTheToRoleOfInteraction().getName());
			}
//			recv.setAddition(interaction.getRelationship().getName());
			recv.setAddition(details.getReceiveVariable().getName()+"$"+details.getReceiveVariablePart()+" "+interaction.getRelationship().getName());
			if (details.getReceiveVariable() != null &&
					details.getReceiveVariable().getName() != null) {
							
				edu.xjtu.cdl2bpel.orchestra.Variable var=
					bpOrchestra.getVariable(details.getReceiveVariable().getName());
							
				if (var == null) {
					
				}

				recv.setVariable(var);
				
				if (details.getReceiveVariablePart()!=null) {	
					recv.setVariablePart(details.getReceiveVariablePart());
				}
			}

			edu.xjtu.cdl2bpel.orchestra.Variable channel=
				bpOrchestra.getVariable(interaction.getChannelVariable().getName());
			
			if (channel == null) {
				
			} else if ((channel instanceof edu.xjtu.cdl2bpel.orchestra.ChannelType) == false) {
				
			} else {
				if(interaction.getChannelVariable().getType() instanceof edu.xjtu.cdl2bpel.cdl.ChannelType) {
					channel.setAddition(((edu.xjtu.cdl2bpel.cdl.ChannelType)interaction.getChannelVariable().getType()).getRoleType().getName());
				}
				recv.setChannelType((edu.xjtu.cdl2bpel.orchestra.ChannelType)channel);
			}						
			
			if (details.getAction().equals(ActionTypeEnumByExchangeInfo.REQUEST)) {
				
				// Need to configure service type in projected
				// endpoint as the service end
				InterfaceOfGroup serviceType=
					context.getGlobalArchitecture().getInterfaceOfGroup(serviceTypeName);
				
				if (serviceType != null) {
					serviceType.setServiceProvider(Boolean.TRUE);
				}
			}
			
			seq.getActivityTypes().add(recv);
			
			if (details.getCauseExceptionOfReceive()!=null) {
				
				CaseException raise=
					OrchestraFactory.eINSTANCE.createCaseException();
				raise.setExceptionValue(convertQName(details,
						details.getCauseExceptionOfReceive()));
				seq.getActivityTypes().add(raise);
			}
			addRecordInfo(seq.getActivityTypes(), interaction,
					details.getReceiveRecordReference(),
					WhenTypeEnumByRecordInfo.AFTER);
		}
	}

	protected void addRecordInfo(java.util.List<BPActivity> seq,
			Interaction interaction,
			java.util.List<RecordElementInfo> RecordInfo,
			WhenTypeEnumByRecordInfo when) {
		BPOrchestra bpOrchestra=null;
		
		if (context.getCurrentBPElement() instanceof BPActivity) {
			bpOrchestra = ((BPActivity)context.getCurrentBPElement()).getBelongedBPOrchestra();
		}
		
		if (bpOrchestra == null) {
		}
		
		for (int i=0; i < RecordInfo.size(); i++) {
			RecordElementInfo details=(RecordElementInfo)RecordInfo.get(i);
			if (details.getWhen() == when) {
				edu.xjtu.cdl2bpel.orchestra.Assign assign=
						OrchestraFactory.eINSTANCE.createAssign();
				edu.xjtu.cdl2bpel.orchestra.Copy copy=
					OrchestraFactory.eINSTANCE.createCopy();
				if (isNotNull(details.getSourceExpression())) {
					copy.setSourceExpression(convertExpression(details,
							details.getSourceExpression(), true));
				} else if (details.getSourceVariable() != null) {
					edu.xjtu.cdl2bpel.orchestra.Variable sourceVar=
						bpOrchestra.getVariable(details.getSourceVariable().getName());
					copy.setSourceVariable(sourceVar);
					copy.setSourcePart(details.getSourceVariablePart());
//					copy.setSourceExpression(convertGetVariable(
//							details.getSourceVariable(),
//							details.getSourceVariablePart()));
				}
				
				if (details.getTargetVariable() != null) {

					edu.xjtu.cdl2bpel.orchestra.Variable vard=
						bpOrchestra.getVariable(details.getTargetVariable().getName());
					copy.setTargetVariable(vard);
					
					if (isNotNull(details.getTargetVariablePart())) {
						copy.setTargetPart(details.getTargetVariablePart());
					}
				}
				
				assign.getCopies().add(copy);
				seq.add(assign);
				
				// Check if exception should be raised
				if (isNotNull(details.getCauseException())) {
				
					CaseException raise=
						OrchestraFactory.eINSTANCE.createCaseException();

					raise.setExceptionValue(convertQName(details,
							details.getCauseException()));
										
					seq.add(raise);
				}
			}
		}
	}
	
	protected Message getMessage(Interaction interaction,
			ExchangeInfo details, String serviceTypeName) {

		Message ret=null;
		InterfaceOfGroup serviceType=null;
		Operation operation=null;
		
		if (serviceTypeName != null) {
			ExchangeInfo reqDetails=null;
			String defType=null;
			java.util.List ops=null;
			
			serviceType = getInterfaceOfGroup(interaction,interaction.getTheToRoleOfInteraction(),serviceTypeName);
			
			java.util.List reqDetailList = InteractionUtil
					.getRequestExchangeDetails(details);
			if (reqDetailList.size() > 0) {
				reqDetails = (ExchangeInfo) reqDetailList.get(0);
			}
			if (reqDetails != null) {
				defType = CDLElementUtil.getRealInformationType(reqDetails
						.getType());
				if (defType == null) {
					defType = CDLElementUtil
							.getRealInformationElement(reqDetails.getType());
				}
				if (defType != null) {
					String namespace = CDLElementUtil.getNamespace(defType,
							details);
					String localpart = XMLUtils.getLocalname(defType);
					defType = CommonNamespaceUtil.getFullyQualifiedName(namespace,
							localpart);
				}
			}
			
			ops = serviceType.getOperations(
					interaction.getOperation(), defType, null);
			
			if (ops.size() == 1) {
				operation = (Operation)ops.get(0);
			} else if (ops.size() > 1) {
			}
			
			if (operation == null) {
				operation = OrchestraFactory.eINSTANCE.createOperation();
				operation.setName(interaction.getOperation());
				
				serviceType.getOperations().add(operation);

				if (reqDetails != null) {
					Message req=
						OrchestraFactory.eINSTANCE.createMessage();
					operation.getMessages().add(req);
					
					req.setClassification(MessageTypeEnumByInteraction.REQUEST);					
					
					if (reqDetails.getType() != null) {
						edu.xjtu.cdl2bpel.cdl.InformationType cdlInfoType=CDLElementUtil.getInformationType(reqDetails.getType());
	
						if (cdlInfoType != null) {
							edu.xjtu.cdl2bpel.orchestra.InformationType infoType=
								context.getGlobalArchitecture().getInformationType(cdlInfoType.getName());
							
							req.setInformationType(infoType);	
						}
					}
				}
			}
			
			if (details.getAction().equals(ActionTypeEnumByExchangeInfo.REQUEST)) {
				ret = operation.getRequest();
				
				if (ret == null) {
					ret = OrchestraFactory.eINSTANCE.createMessage();
					operation.getMessages().add(ret);
					
					// Initialize message
					ret.setClassification(MessageTypeEnumByInteraction.REQUEST);
					
					// Find information type
					if (details.getType() != null) {
						edu.xjtu.cdl2bpel.cdl.InformationType cdlInfoType=CDLElementUtil.getInformationType(details.getType());
						
						if (cdlInfoType != null) {
							edu.xjtu.cdl2bpel.orchestra.InformationType infoType=
								context.getGlobalArchitecture().getInformationType(cdlInfoType.getName());
						
							ret.setInformationType(infoType);
						}
					}
				}
				
			} else if (details.getAction().equals(ActionTypeEnumByExchangeInfo.RESPOND)) {

				if (details.getFaultName() != null &&
						details.getFaultName().trim().length() > 0) {
					String originalFaultName=details.getFaultName();
					String faultName=null;
					
					// Check if has prefix
					/* GPB(1/3/07) - faultName is a QName so needs
					 * a prefix. If one not defined, then it will be
					 * prefixed with the default namespace
					 */
//					if (XMLUtils.getPrefix(originalFaultName) == null) {
////						
////						// Apply prefix associated with the service type name
//						String namespace=NameSpaceUtil.getNamespace(serviceTypeName);
//						String prefix=null;
//	
//						if (namespace != null &&
//								interaction.getBelongedPackage() != null) {
//							XMLPrefixResolver resolver=
//								CDLElementUtil.getPrefixResolver(interaction.getBelongedPackage());
//							
//							if (resolver != null) {
//								prefix = resolver.getPrefix(namespace);
//							}
//						}
//						
//						if (prefix == null) {
//							faultName = originalFaultName;
//						} else {
//							faultName = prefix+":"+originalFaultName;
//						}
//						
//					} else {
						faultName = convertQName(details,
								originalFaultName);
//					}
					ret = operation.getFault(faultName);
					if (ret == null) {
						ret = OrchestraFactory.eINSTANCE.createMessage();
						ret.setFaultName(faultName);
						
						// Initialize message type
						ret.setClassification(MessageTypeEnumByInteraction.RESPONSE);
							
						// Find information type
						if (details.getType() != null) {
							edu.xjtu.cdl2bpel.cdl.InformationType cdlInfoType=CDLElementUtil.getInformationType(details.getType());
							
							if (cdlInfoType != null) {
								edu.xjtu.cdl2bpel.orchestra.InformationType infoType=
									context.getGlobalArchitecture().getInformationType(cdlInfoType.getName());
							
								ret.setInformationType(infoType);
							}
						}

						operation.getMessages().add(ret);
					}
				} else {
					ret = operation.getResponse();
					
					if (ret == null) {
						ret = OrchestraFactory.eINSTANCE.createMessage();					
						
						// Initialize message type
						ret.setClassification(MessageTypeEnumByInteraction.RESPONSE);
						
						// Find information type
						if (details.getType() != null) {
							edu.xjtu.cdl2bpel.cdl.InformationType cdlInfoType=CDLElementUtil.getInformationType(details.getType());
							
							if (cdlInfoType != null) {
								edu.xjtu.cdl2bpel.orchestra.InformationType infoType=
									context.getGlobalArchitecture().getInformationType(cdlInfoType.getName());
								ret.setInformationType(infoType);
							}
						}
						
						operation.getMessages().add(ret);
					}
				}
			} 
		}		
		
		return(ret);
	}
	
	public boolean isContainedByRoleTypes(RoleType theRoleType) {
		for(RoleType roleType:context.getRoleTypes()) {			
			if(roleType.getName().equals(theRoleType.getName())) {
				return true;
			}
		}
		
		return false;
	}
	
	protected String extractServiceInfo(Variable var) {
		String ret=null;
		
		if (resolver != null) {
			ret = resolver.extractServiceInfo(var);
		}
		
		return(ret);
	}
	
	protected String convertQName(CDLElement cdlType, String qname) {
		String ret = qname;

		if (XMLUtils.getPrefix(qname) == null) {
			ret = GLOBAL_NS_PREFIX + ":" + qname;
		}
		return (ret);
	}
	
	protected boolean processTimeout(Interaction interaction) {
		boolean ret=false;
		
		if (CheckNOthersUtil.isSet(interaction.getTimeoutOfTimeToComplete())) {
			
			OnAlarm tu=OrchestraFactory.eINSTANCE.createOnAlarm();
			
			String time=interaction.getTimeoutOfTimeToComplete();
			
			if (time.startsWith("'") == false &&
					time.startsWith("\"") == false) {
				time = "'"+time+"'";
			}
			
			String expr="sdl:hasTimerExpired("+time+")";
			tu.setTimeToComplete(expr);
			
			if (interaction.getTimeoutFromRoleTypeRecordInfo() != null) {
				addRecordInfo(tu.getTimeoutActivityTypes(),
						interaction,
						interaction.getTimeoutFromRoleTypeRecordInfo(),
						WhenTypeEnumByRecordInfo.TIMEOUT);
			}
			
			if (interaction.getTimeoutToRoleTypeRecordInfo() != null) {
				addRecordInfo(tu.getTimeoutActivityTypes(),
						interaction,
						interaction.getTimeoutToRoleTypeRecordInfo(),
						WhenTypeEnumByRecordInfo.TIMEOUT);
			}
			
			addActivity2StructIfCurrentElementBeOrderingStructuralActivity(tu);
			
			context.pushBPElementStack(tu);
			
			ret = true;
		}
		
		return(ret);
	}
}
