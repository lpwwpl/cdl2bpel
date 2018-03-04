package edu.xjtu.cdl2bpel.cdl.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.CopyOfAssign;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.FinalizerBlock;
import edu.xjtu.cdl2bpel.cdl.Identity;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.NoAction;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.PassingInfoOfTheChannelType;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.ReceiveByExchange;
import edu.xjtu.cdl2bpel.cdl.RecordElementInfo;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.SendByExchange;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.SilentAction;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.cdl.UsageTypeEnumByChannelType;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WorkUnit;
import edu.xjtu.cdl2bpel.cdl.impl.CDLElementImpl;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;

public class CDLResolver {

	public static void main(String args[]) {
		CDLResolver.getPackageFromCDLFile("cdl/loanapproval.cdl");
	}
	
	public static Package getPackageFromCDLFile(String fileName) {
		Package cdlPackage = CDLFactory.eINSTANCE.createPackage();
		org.dom4j.Document doc = null;
		SAXReader saxReader = new SAXReader();
		try {
			File cdlFile = new File(fileName);
			doc = saxReader.read(cdlFile);
			cdlPackage.resolveTheCDLElementByElement(doc.getRootElement());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return cdlPackage;
	}
	
	public static org.w3c.dom.Document save(Package pack,
			java.io.OutputStream os) {
		org.w3c.dom.Document doc = transformCDLPackage2CDL(pack);
		TransformerFactory tFactory = TransformerFactory.newInstance();
		try {
			Transformer transformer = tFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(os);
			transformer.transform(source, result);
		} catch (TransformerConfigurationException ex) {
			ex.printStackTrace();
		} catch (TransformerException ex) {
			ex.printStackTrace();
		} 
		return doc;
	}
	
	public static org.w3c.dom.Document transformCDLPackage2CDL(
			Package cdlpack) {
		org.w3c.dom.Document ret = null;
		try {
			DocumentBuilderFactory builderFactory=
					DocumentBuilderFactory.newInstance();
			builderFactory.setNamespaceAware(true);
			
			DocumentBuilder builder=
					builderFactory.newDocumentBuilder();
			
			ret = builder.newDocument();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (ret != null) {	    
			transformCDLPackage2Doc(cdlpack,ret);		    
		}
			
		return (ret);
	}
	
	protected static void transformCDLPackage2Doc(Package cdlpack,Node docNode) {
		
		Element elem  = newDomElementOfCDLElement(docNode,"package",CDLDefinitions.CDL_NS);
		
		if (cdlpack.getName() != null) {
		    elem.setAttribute("name", cdlpack.getName());
		}
		
		if (cdlpack.getAuthor() != null) {
		    elem.setAttribute("author", cdlpack.getAuthor());
		}
		
		if (cdlpack.getTargetNamespace() != null) {
		    elem.setAttribute("targetNamespace", cdlpack.getTargetNamespace());
		    
		    elem.setAttribute("xmlns"+":tns",
		    		cdlpack.getTargetNamespace());
		}
		
		elem.setAttribute("xmlns", CDLDefinitions.CDL_NS);

		elem.setAttribute("xmlns"+":"+CDLDefinitions.CDL_PREFIX,
						CDLDefinitions.CDL_NS);

		java.util.Iterator iter = cdlpack.getNamespaces().iterator();
		while (iter.hasNext()) {
			Namespace ns = (Namespace) iter.next();
			System.out.println(ns.getPrefix());
			if (ns.getPrefix() == null||ns.getPrefix().equals("")){
			}else {
				elem.setAttribute("xmlns:" + ns.getPrefix(), ns.getUri());
			}
		}

		transformListOfCDLElement2DocElements(cdlpack.getInformationTypes(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getTokens(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getTokenLocators(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getRoleTypes(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getRelationshipTypes(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getParticipantTypes(), elem);

		transformListOfCDLElement2DocElements(cdlpack.getChannelTypes(), elem);
		
		transformListOfCDLElement2DocElements(cdlpack.getChoreographies(), elem);
		
		docNode.appendChild(elem);
	}
	
	protected static Element tranformCDLElement2DomElement(CDLElement cdlElement,Node parent) {

		// Create new element
		Element ret = null;

		ret = newDomElementOfCDLElement(parent, getTagName(cdlElement), CDLDefinitions.CDL_NS);

		if(cdlElement instanceof InformationType) {
			
			if (((InformationType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((InformationType)cdlElement).getName());
			}
			
			if (((InformationType)cdlElement).getTypeName() !=null) {
				ret.setAttribute("type", ((InformationType)cdlElement).getTypeName());
				
			} else if (((InformationType)cdlElement).getElementName() != null) {
				ret.setAttribute("element", ((InformationType)cdlElement).getElementName());
			}
		} else if(cdlElement instanceof Token) {
			if (((Token)cdlElement).getName() != null) {
				ret.setAttribute("name", ((Token)cdlElement).getName());
			}
			
			if (((Token)cdlElement).getInformationType() != null) {	
				ret.setAttribute("informationType",
						addTNS(((Token)cdlElement).getInformationType().getName()));
			}
		} else if(cdlElement instanceof TokenLocator) {
			if (CheckNOthersUtil.isSet(((TokenLocator)cdlElement).getName())) {
				ret.setAttribute("name", ((TokenLocator)cdlElement).getName());
			}
			
			if (((TokenLocator)cdlElement).getToken() != null) {
				ret.setAttribute("tokenName",
						addTNS(((TokenLocator)cdlElement).getToken().getName()));
			}
			
			if (((TokenLocator)cdlElement).getInformationType() != null) {			
				ret.setAttribute("informationType",
			    		addTNS(((TokenLocator)cdlElement).getInformationType().getName()));
			}
			
			if (CheckNOthersUtil.isSet(((TokenLocator)cdlElement).getPart())) {
				ret.setAttribute("part", ((TokenLocator)cdlElement).getPart());
			}
			
			if (CheckNOthersUtil.isSet(((TokenLocator)cdlElement).getQuery())) {
				ret.setAttribute("query", ((TokenLocator)cdlElement).getQuery());
			}
		} else if (cdlElement instanceof RoleType) {
			if (((RoleType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((RoleType)cdlElement).getName());
			}
			
			// Export behaviors
			transformListOfCDLElement2DocElements(((RoleType)cdlElement).getBehaviors(), ret);
		} else if (cdlElement instanceof RelationshipType) {
			if (((RelationshipType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((RelationshipType)cdlElement).getName());
			}
			
			// Export first role
			Element first=newDomElementOfCDLElement(ret, "roleType",CDLDefinitions.CDL_NS);
			
			if (((RelationshipType)cdlElement).getRoleTypeOfFirst() != null) {
				
				first.setAttribute("typeRef",
				        addTNS(((RelationshipType)cdlElement).getRoleTypeOfFirst().getName()));
				
				// Export interfaces
				String behaviors="";
				
				java.util.Iterator iter=
					((RelationshipType)cdlElement).getBehaviorsOfRoleTypeFirst().iterator();
				
				while (iter.hasNext()) {
					BehaviorOfRoleType behavior=(BehaviorOfRoleType)iter.next();
					
					if (behaviors.length() > 0) {
						behaviors += " ";
					}
					behaviors += behavior.getName();
				}
				
				if (behaviors.length() > 0) {
					first.setAttribute("behavior", behaviors);
				}
			}
				
			ret.appendChild(first);	
			
			// Export second role
			Element second=newDomElementOfCDLElement(ret, "roleType",CDLDefinitions.CDL_NS);
		
			if (((RelationshipType)cdlElement).getRoleTypeOfSecond() != null) {
				second.setAttribute("typeRef", 
						addTNS(((RelationshipType)cdlElement).getRoleTypeOfSecond().getName()));
				
				// Export interfaces
				String behaviors="";
				
				java.util.Iterator iter=((RelationshipType)cdlElement).getBehaviorsOfRoleTypeSecond().iterator();
				
				while (iter.hasNext()) {
					BehaviorOfRoleType behavior=(BehaviorOfRoleType)iter.next();
					
					if (behaviors.length() > 0) {
						behaviors += " ";
					}
					behaviors += behavior.getName();
				}
				
				if (behaviors.length() > 0) {
					second.setAttribute("behavior", behaviors);
				}
			}
				
			ret.appendChild(second);
		} else if (cdlElement instanceof ParticipantType) {
			if (((ParticipantType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((ParticipantType)cdlElement).getName());
			}

			// Export role types for participant
			java.util.Iterator iter=((ParticipantType)cdlElement).getRoleTypes().iterator();
			
			while (iter.hasNext()) {
				RoleType roleType=(RoleType)iter.next();
				
				Element role=newDomElementOfCDLElement(ret, "roleType");
				
				if (roleType.getName() != null) {
				    role.setAttribute("typeRef", addTNS(roleType.getName()));
				}
					
				ret.appendChild(role);
			}		
		} else if (cdlElement instanceof ChannelType) {
			if (((ChannelType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((ChannelType)cdlElement).getName());			
			}
			
			// Unlimited is the default
			if (((ChannelType)cdlElement).getUsage() != null &&
					((ChannelType)cdlElement).getUsage() != UsageTypeEnumByChannelType.DISTINCT) {
			    ret.setAttribute("usage", getCorrectValue(((ChannelType)cdlElement).getUsage().getName()));
			}
			
			if (((ChannelType)cdlElement).getAction() != null &&
					((ChannelType)cdlElement).getAction() != ActionTypeEnumByChannelType.REQUEST_RESPOND) {
			    ret.setAttribute("action", getCorrectValue(((ChannelType)cdlElement).getAction().getName()));
			}
			
			// Passing Channels
			transformListOfCDLElement2DocElements(((ChannelType)cdlElement).getPassingInfoByChannel(),
									ret);
			
			// Export Role element
			Element role=ret.getOwnerDocument().
							createElement("roleType");
			
			if (((ChannelType)cdlElement).getRoleType() != null) {
				role.setAttribute("typeRef", addTNS(((ChannelType)cdlElement).getRoleType().getName()));
			}
			
			if (((ChannelType)cdlElement).getTheBehaviorOfTheRoleType() != null) {
				role.setAttribute("behavior", ((ChannelType)cdlElement).getTheBehaviorOfTheRoleType().getName());
			}
			
			ret.appendChild(role);

			// Reference token
			Element reference=ret.getOwnerDocument().
								createElement("reference");
			
			if (((ChannelType)cdlElement).getReferencedToken() != null) {
				
				Element reftoken=ret.
						getOwnerDocument().createElement("token");
					
				reftoken.setAttribute("name", addTNS(((ChannelType)cdlElement).getReferencedToken().getName()));
					
				reference.appendChild(reftoken);
			}
			
			ret.appendChild(reference);
			
			if (((ChannelType)cdlElement).getIdentities() != null &&
					((ChannelType)cdlElement).getIdentities().size() > 0) {
				
				for (int i=0; i < ((ChannelType)cdlElement).getIdentities().size(); i++) {
					Element identity=ret.
						getOwnerDocument().createElement("identity");
					Identity id=(Identity)((ChannelType)cdlElement).getIdentities().get(i);
					
				    identity.setAttribute("type",
				    		getCorrectValue(id.getType().getName()));
					
					java.util.Iterator iter=
					    	id.getTokens().iterator();
					
					while (iter.hasNext()) {
						Token idtoken=(Token)iter.next();
						
						Element idelem=ret.
							getOwnerDocument().createElement("token");
						
						idelem.setAttribute("name", addTNS(idtoken.getName()));
						
						identity.appendChild(idelem);
					}
					
					ret.appendChild(identity);
				}
			}

		} else if(cdlElement instanceof BehaviorOfRoleType) {
			if (((BehaviorOfRoleType)cdlElement).getName() != null) {
				ret.setAttribute("name", ((BehaviorOfRoleType)cdlElement).getName());
			}
			
			if (CheckNOthersUtil.isSet(((BehaviorOfRoleType)cdlElement).getInterface())) {
				ret.setAttribute("interface", ((BehaviorOfRoleType)cdlElement).getInterface());			
			}
		} else if(cdlElement instanceof PassingInfoOfTheChannelType) {
			if (((PassingInfoOfTheChannelType)cdlElement).getChannel() != null &&
					((PassingInfoOfTheChannelType)cdlElement).getChannel().getName() != null) {
			    ret.setAttribute("channel", addTNS(((PassingInfoOfTheChannelType)cdlElement).getChannel().getName()));
			}
		
			if (((PassingInfoOfTheChannelType)cdlElement).getAction() != null &&
					((PassingInfoOfTheChannelType)cdlElement).getAction() != ActionTypeEnumByChannelType.REQUEST_RESPOND) {
			    ret.setAttribute("action",
			            getCorrectValue(((PassingInfoOfTheChannelType)cdlElement).getAction().getName()));
			}
		
			if (CheckNOthersUtil.isSet(((PassingInfoOfTheChannelType)cdlElement).getNew(), false)) {
			    ret.setAttribute("new", ((PassingInfoOfTheChannelType)cdlElement).getNew().toString());
			}
		} else if(cdlElement instanceof Assign) {
			if (((Assign)cdlElement).getRoleType() != null) {
			    ret.setAttribute("roleType",
			    		addTNS(((Assign)cdlElement).getRoleType().getName()));
			}
			
			transformListOfCDLElement2DocElements(((Assign)cdlElement).getCopyOfAssign(), ret);
		} else if(cdlElement instanceof BindInfo) {
			if (((BindInfo)cdlElement).getName() != null) {
				ret.setAttribute("name", ((BindInfo)cdlElement).getName());
			}
			
			// Export 'this' node
			Element thisnode=newDomElementOfCDLElement(ret, "this");
			
			if (((BindInfo)cdlElement).getThisVariable() != null) {
				thisnode.setAttribute("variable", "cdl:getVariable('"+
						((BindInfo)cdlElement).getThisVariable().getName()+"','','')");
			}

			if (((BindInfo)cdlElement).getThisRole() != null) {
				thisnode.setAttribute("roleType", addTNS(((BindInfo)cdlElement).getThisRole().getName()));
			}
			
			ret.appendChild(thisnode);

			Element freenode=newDomElementOfCDLElement(ret, "free");
			
			if (((BindInfo)cdlElement).getFreeVariable() != null) {
				freenode.setAttribute("variable", "cdl:getVariable('"+
						((BindInfo)cdlElement).getFreeVariable().getName()+"','','')");
			}

			if (((BindInfo)cdlElement).getFreeRole() != null) {
				freenode.setAttribute("roleType", addTNS(((BindInfo)cdlElement).getFreeRole().getName()));
			}
			
			ret.appendChild(freenode);
		} else if(cdlElement instanceof Choice) {
			transformListOfCDLElement2DocElements(((Choice)cdlElement).getActivities(), ret);
		} else if(cdlElement instanceof Choreography) {
			if (((Choreography)cdlElement).getName() != null) {
			    ret.setAttribute("name", ((Choreography)cdlElement).getName());
			}
			
			if (CheckNOthersUtil.isSet(((Choreography)cdlElement).getRoot(), false) != false) {
			    ret.setAttribute("root", ((Choreography)cdlElement).getRoot().toString());
			}
			
			if (CheckNOthersUtil.isSet(((Choreography)cdlElement).getIsolation(), false) != false) {
			    ret.setAttribute("isolation",
			    		((Choreography)cdlElement).getIsolation().toString());
			}
			
			if (CheckNOthersUtil.isSet(((Choreography)cdlElement).getComplete())) {
			    ret.setAttribute("complete",
			    		((Choreography)cdlElement).getComplete());
			}
			
			if (CheckNOthersUtil.isSet(((Choreography)cdlElement).getCoordination(), false) != false) {
			    ret.setAttribute("coordination",
			    		((Choreography)cdlElement).getCoordination().toString());
			}
			
			// Export relationships
			java.util.Iterator iter=null;
			
			if (((Choreography)cdlElement).getRelationships().size() > 0) {
				iter = ((Choreography)cdlElement).getRelationships().iterator();
			} else {
				// If relationship list is empty, then this implies
				// all relationship types defined for CDL package			
				iter = ((Choreography)cdlElement).getBelongedPackage().
								getRelationshipTypes().iterator();
			}
			
			while (iter.hasNext()) {
				RelationshipType relationship=(RelationshipType)iter.next();
				
				Element relnode=
				    ret.getOwnerDocument().createElementNS(
				            CDLDefinitions.CDL_NS,
							"relationship");
				
				relnode.setAttribute("type", addTNS(relationship.getName()));

				ret.appendChild(relnode);
			}
			
			// Export variable definitions
			if (((Choreography)cdlElement).getVariables() != null &&
					((Choreography)cdlElement).getVariables().size() > 0) {
				
				Element vardefns=
				    ret.getOwnerDocument().createElementNS(
				            CDLDefinitions.CDL_NS,
				            "variableDefinitions");

				transformListOfCDLElement2DocElements(((Choreography)cdlElement).getVariables(),
								vardefns);

				ret.appendChild(vardefns);
			}
			
			// Export enclosed choreographies
			transformListOfCDLElement2DocElements(((Choreography)cdlElement).getEnclosedChoreographies(),
					ret);
			
			// Export child activities
			Element base=ret;
			
			if (((Choreography)cdlElement).getActivities().size() > 1) {
				
				base = newDomElementOfCDLElement(parent,
						"sequence");
				
				ret.appendChild(base);
			}
			transformListOfCDLElement2DocElements(((Choreography)cdlElement).getActivities(), base);
			
			// Export exception handlers
			if (((Choreography)cdlElement).getExceptionBlock() != null) {	
				tranformCDLElement2DomElement(((Choreography)cdlElement).getExceptionBlock(), ret);
			}
			
			// Export finalizer
			transformListOfCDLElement2DocElements(((Choreography)cdlElement).getFinalizerBlocks(),
					ret);
		} else if(cdlElement instanceof CopyOfAssign) {
			if (((CopyOfAssign)cdlElement).getName() != null) {
				ret.setAttribute("name", ((CopyOfAssign)cdlElement).getName());
			}

			if (CheckNOthersUtil.isSet(((CopyOfAssign)cdlElement).getCauseException())) {
				ret.setAttribute("causeException", ((CopyOfAssign)cdlElement).getCauseException());
			}

			// Export source
			Element src=newDomElementOfCDLElement(ret, "source");
			
			if (((CopyOfAssign)cdlElement).getSourceVariable() != null) {
				String func="cdl:getVariable('"+
				((CopyOfAssign)cdlElement).getSourceVariable().getName();
				
				if (CheckNOthersUtil.isSet(((CopyOfAssign)cdlElement).getSourceVariablePart())) {
					func += "','"+((CopyOfAssign)cdlElement).getSourceVariablePart()+"','')";
				} else {
					func += "','','')";
				}
			
				src.setAttribute("variable", func);
			
			} else if (CheckNOthersUtil.isSet(((CopyOfAssign)cdlElement).getSourceExpression())) {
				
				src.setAttribute("expression", ((CopyOfAssign)cdlElement).getSourceExpression());
			}

			ret.appendChild(src);

			// Export target
			Element target=newDomElementOfCDLElement(ret, "target");

			if (((CopyOfAssign)cdlElement).getTargetVariable() != null) {
				String func="cdl:getVariable('"+
				((CopyOfAssign)cdlElement).getTargetVariable().getName();

				if (CheckNOthersUtil.isSet(((CopyOfAssign)cdlElement).getTargetVariablePart())) {
					func += "','"+((CopyOfAssign)cdlElement).getTargetVariablePart()+"','')";
				} else {
					func += "','','')";
				}
				
				target.setAttribute("variable", func);
			}
			
			ret.appendChild(target);
			
		} else if(cdlElement instanceof ExchangeInfo) {
			if (((ExchangeInfo)cdlElement).getName() != null) {
			    ret.setAttribute("name", ((ExchangeInfo)cdlElement).getName());
			}

		    String tag=(getInfoOrChannelTag((ExchangeInfo)cdlElement));
			if (tag != null) {	    
				ret.setAttribute(tag,
						addTNS(((ExchangeInfo)cdlElement).getType().getName()));
			}

			if (((ExchangeInfo)cdlElement).getAction() != null) {
				String action=((ExchangeInfo)cdlElement).getAction().getName();

				ret.setAttribute("action", getCorrectValue(action));
			}
			
			if (CheckNOthersUtil.isSet(((ExchangeInfo)cdlElement).getFaultName())) {
				ret.setAttribute("faultName", ((ExchangeInfo)cdlElement).getFaultName());
			}
			
			// Export send element
			Element sendelem=newDomElementOfCDLElement(ret, "send");
			
			if (((ExchangeInfo)cdlElement).getSendVariable() != null) {
				String func="cdl:getVariable('"+
				((ExchangeInfo)cdlElement).getSendVariable().getName();

				if (CheckNOthersUtil.isSet(((ExchangeInfo)cdlElement).getSendVariablePart())) {
					func += "','"+((ExchangeInfo)cdlElement).getSendVariablePart()+"','')";
				} else {
					func += "','','')";
				}

			    sendelem.setAttribute("variable", func);
			}
			
			if (CheckNOthersUtil.isSet(((ExchangeInfo)cdlElement).getCauseExceptionOfSend())) {
				sendelem.setAttribute("causeException",
						((ExchangeInfo)cdlElement).getCauseExceptionOfSend());
			}

			// Export referenced record details
			String refs="";
			java.util.Iterator iter=((ExchangeInfo)cdlElement).getSendRecordReference().iterator();
			while (iter.hasNext()) {
				RecordElementInfo rec=(RecordElementInfo)iter.next();
				if (refs != null && refs.trim().length() > 0) {
					refs += " ";
				}
				refs += rec.getName();
			}
			
			if (refs != null && refs.trim().length() > 0) {
				sendelem.setAttribute("recordReference", refs);
			}

			ret.appendChild(sendelem);
			
			// Export receive element
			Element recvelem=
			    ret.getOwnerDocument().createElementNS(
			            CDLDefinitions.CDL_NS,
						"receive");
			
			if (((ExchangeInfo)cdlElement).getReceiveVariable() != null) {	
				String func="cdl:getVariable('"+
				((ExchangeInfo)cdlElement).getReceiveVariable().getName();

				if (CheckNOthersUtil.isSet(((ExchangeInfo)cdlElement).getReceiveVariablePart())) {
					func += "','"+((ExchangeInfo)cdlElement).getReceiveVariablePart()+"','')";
				} else {
					func += "','','')";
				}

			    recvelem.setAttribute("variable", func);
			}
			
			if (CheckNOthersUtil.isSet(((ExchangeInfo)cdlElement).getCauseExceptionOfReceive())) {
				recvelem.setAttribute("causeException",
						((ExchangeInfo)cdlElement).getCauseExceptionOfReceive());
			}

			// Export record references
			refs="";
			
			iter=((ExchangeInfo)cdlElement).getReceiveRecordReference().iterator();
			while (iter.hasNext()) {
				RecordElementInfo rec=(RecordElementInfo)iter.next();
				if (refs != null && refs.trim().length() > 0) {
				    refs += " ";
				} 
				refs += rec.getName();
			}
			
			if (refs != null && refs.trim().length() > 0) {
			    recvelem.setAttribute("recordReference", refs);
			}

			ret.appendChild(recvelem);
		} else if(cdlElement instanceof Finalize) {
			if (CheckNOthersUtil.isSet(((Finalize)cdlElement).getName())) {
			    ret.setAttribute("name",((Finalize)cdlElement).getName());
			}
			
			if (((Finalize)cdlElement).getBelongedChoreography() != null) {
				ret.setAttribute("choreographyName",
						((Finalize)cdlElement).getChoreography().getName());
			}
			
			if (CheckNOthersUtil.isSet(((Finalize)cdlElement).getChoreographyInstanceId())) {
				ret.setAttribute("choreographyInstanceId",
						((Finalize)cdlElement).getChoreographyInstanceId());
			}
			
			if (((Finalize)cdlElement).getFinalizerBlock() != null) {
				ret.setAttribute("finalizerName",
						((Finalize)cdlElement).getFinalizerBlock().getName());
			}
				
		} else if(cdlElement instanceof FinalizerBlock) {
			if (((FinalizerBlock)cdlElement).getName() != null) {
			    ret.setAttribute("name", ((FinalizerBlock)cdlElement).getName());
			}
			
			// Export the activities
			Element base = ret;
			
			// If there is more than one activity, then we need
			// to contain them within a new sequence activity which
			// will become the sole activity associated with the
			// CDL finalizer
			if (((FinalizerBlock)cdlElement).getActivities().size() > 1) {
				
				base = newDomElementOfCDLElement(parent,
						"sequence");
				
				ret.appendChild(base);
			}
			
			transformListOfCDLElement2DocElements(((FinalizerBlock)cdlElement).getActivities(),ret);
		} else if(cdlElement instanceof Interaction) {
			if (((Interaction)cdlElement).getName() != null) {
				ret.setAttribute("name", ((Interaction)cdlElement).getName());
			}
			
			if (((Interaction)cdlElement).getOperation() != null) {
				ret.setAttribute("operation", ((Interaction)cdlElement).getOperation());
			}

			if (((Interaction)cdlElement).getChannelVariable() != null) {
				ret.setAttribute("channelVariable",
						addTNS(((Interaction)cdlElement).getChannelVariable().getName()));
			}
			
			if (CheckNOthersUtil.isSet(((Interaction)cdlElement).getAlign(), false) == true) {
				ret.setAttribute("align", ((Interaction)cdlElement).getAlign().toString());
			}

			// Deprecated as of March 2007 CR
			//if (isSet(getInitiate(), false) == true) {
			//	elem.setAttribute(INITIATE, getInitiate().toString());
			//}

			// Export participate
			Element participate=
			    ret.getOwnerDocument().createElementNS(
			            CDLDefinitions.CDL_NS,
							"participate");
			
			if (((Interaction)cdlElement).getRelationship() != null &&
			        CheckNOthersUtil.isSet(((Interaction)cdlElement).getRelationship().getName())) {
				participate.setAttribute("relationshipType",
				        addTNS(((Interaction)cdlElement).getRelationship().getName()));
			}
			
			if (((Interaction)cdlElement).getTheFromRoleOfInteraction() != null &&
					CheckNOthersUtil.isSet(((Interaction)cdlElement).getTheFromRoleOfInteraction().getName())) {
				participate.setAttribute("fromRoleTypeRef",
						addTNS(((Interaction)cdlElement).getTheFromRoleOfInteraction().getName()));
			}
			
			if (((Interaction)cdlElement).getTheToRoleOfInteraction() != null &&
					CheckNOthersUtil.isSet(((Interaction)cdlElement).getTheToRoleOfInteraction().getName())) {
				participate.setAttribute("toRoleTypeRef",
						addTNS(((Interaction)cdlElement).getTheToRoleOfInteraction().getName()));
			}
			
			ret.appendChild(participate);

			// Export timeout node
			if (CheckNOthersUtil.isSet(((Interaction)cdlElement).getTimeoutOfTimeToComplete())) {
				
				Element timeout=
				    ret.getOwnerDocument().createElementNS(
				            CDLDefinitions.CDL_NS,
								"timeout");

				timeout.setAttribute("timeout", ((Interaction)cdlElement).getTimeoutOfTimeToComplete());
				
				String refs="";
				java.util.Iterator iter=((Interaction)cdlElement).getTimeoutFromRoleTypeRecordInfo().iterator();
				while (iter.hasNext()) {
					RecordElementInfo rec=(RecordElementInfo)iter.next();
					if (refs != null && refs.trim().length() > 0) {
					    refs += " ";
					}
					refs += rec.getName();
				}
				
				if (refs != null && refs.trim().length() > 0) {
					timeout.setAttribute("fromRoleTypeRef", refs);
				}

				refs = "";
				iter=((Interaction)cdlElement).getTimeoutToRoleTypeRecordInfo().iterator();
				while (iter.hasNext()) {
					RecordElementInfo rec=(RecordElementInfo)iter.next();
					if (refs != null && refs.trim().length() > 0) {
					    refs += " ";
					}
					refs += rec.getName();
				}
				
				if (refs != null && refs.trim().length() > 0) {
					timeout.setAttribute("toRoleTypeRef", refs);
				}

				ret.appendChild(timeout);
			}

			// Export exchanges
			transformListOfCDLElement2DocElements(((Interaction)cdlElement).getExchangeInfos(), ret);
			
			// Export records
			transformListOfCDLElement2DocElements(((Interaction)cdlElement).getRecordInfos(), ret);
		} else if(cdlElement instanceof NoAction) {
			if (((NoAction)cdlElement).getRoleType() != null) {
			    ret.setAttribute("roleType", addTNS(((NoAction)cdlElement).getRoleType().getName()));
			}
		} else if(cdlElement instanceof Parallel) {
			transformListOfCDLElement2DocElements(((Parallel)cdlElement).getActivities(), ret);
		}else if(cdlElement instanceof Perform) {
			if (((Perform)cdlElement).getChoreography() != null) {
				ret.setAttribute("choreographyName",
				        addTNS(((Perform)cdlElement).getChoreography().getName()));
			}
			
			if (CheckNOthersUtil.isSet(((Perform)cdlElement).getChoreographyInstanceId())) {
				ret.setAttribute("choreographyInstanceId",
						((Perform)cdlElement).getChoreographyInstanceId());
			}
			
			if (CheckNOthersUtil.isSet(((Perform)cdlElement).getWaitForCompletion(), true) == false) {
				ret.setAttribute("block", Boolean.FALSE.toString());
			}

			// Export bindings
			if (((Perform)cdlElement).getBindsOfPerform() != null &&
					((Perform)cdlElement).getBindsOfPerform().size() > 0) {
				
				transformListOfCDLElement2DocElements(((Perform)cdlElement).getBindsOfPerform(),
						ret
						);
			}

		} else if(cdlElement instanceof RecordElementInfo){
			if (((RecordElementInfo)cdlElement).getName() != null) {
				ret.setAttribute("name", ((RecordElementInfo)cdlElement).getName());
			}

			if (((RecordElementInfo)cdlElement).getWhen() != null) {
			    ret.setAttribute("when", getCorrectValue(((RecordElementInfo)cdlElement).getWhen().getName()));
			}
			
			if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getCauseException())) {
				ret.setAttribute("causeException", ((RecordElementInfo)cdlElement).getCauseException());
			}

			// Export source
			Element src=newDomElementOfCDLElement(ret, "source");
			
			if (((RecordElementInfo)cdlElement).getSourceVariable() != null) {
				String func="cdl:getVariable("+
				((RecordElementInfo)cdlElement).getSourceVariable().getName();

				if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getSourceVariablePart())) {
					func += "','"+((RecordElementInfo)cdlElement).getSourceVariablePart()+"','')";
				} else {
					func += "','','')";
				}

				src.setAttribute("variable", func);
				
			} else if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getSourceExpression())) {
				src.setAttribute("expression", ((RecordElementInfo)cdlElement).getSourceExpression());
			}

			ret.appendChild(src);

			// Export target
			Element target=newDomElementOfCDLElement(ret, "target");
			
			if (((RecordElementInfo)cdlElement).getTargetVariable() != null) {
				String func="cdl:getVariable("+
				((RecordElementInfo)cdlElement).getTargetVariable().getName();

				if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getTargetVariablePart())) {
					func += "','"+((RecordElementInfo)cdlElement).getTargetVariablePart()+"','')";
				} else {
					func += "','','')";
				}
				
				target.setAttribute("variable", func);
			}
			
			ret.appendChild(target);
		} else if(cdlElement instanceof Variable) {
			if (((Variable)cdlElement).getName() != null) {
				ret.setAttribute("name", ((Variable)cdlElement).getName());
			}
			
		    String tag=(getInfoOrChannelTag((Variable)cdlElement));
			if (tag != null) {	    
				ret.setAttribute(tag,
						addTNS(((Variable)cdlElement).getType().getName()));
			}
			
			if (((Variable)cdlElement).getRoleTypes().size() > 0) {
				String types="";
				for (int i=0; i < ((Variable)cdlElement).getRoleTypes().size(); i++) {
					RoleType rt=(RoleType)((Variable)cdlElement).getRoleTypes().get(i);
					if (CheckNOthersUtil.isSet(rt.getName())) {
						if (types.length() > 0) {
							types += " ";
						}
						types += addTNS(rt.getName());
					}
				}
				
				if (types.length() > 0) {
					ret.setAttribute("roleTypes", types);
				}
			}
			
			if (CheckNOthersUtil.isSet(((Variable)cdlElement).getMutable(), true) == false) {
				ret.setAttribute("mutable",
						((Variable)cdlElement).getMutable().toString());
			}

			if (CheckNOthersUtil.isSet(((Variable)cdlElement).getFree(), false) == true) {
				ret.setAttribute("free",
						((Variable)cdlElement).getFree().toString());
			}
		
			if (CheckNOthersUtil.isSet(((Variable)cdlElement).getSilent(), false) == true) {
				ret.setAttribute("silent",
						((Variable)cdlElement).getSilent().toString());
			}
			
		} else if(cdlElement instanceof ExceptionBlock) {
			if (((ExceptionBlock)cdlElement).getName() != null) {
			    ret.setAttribute("name", ((ExceptionBlock)cdlElement).getName());
			}
			
			// Export the workunits
			transformListOfCDLElement2DocElements(((ExceptionBlock)cdlElement).getExceptionWorkUnits(), ret);
		} else if(cdlElement instanceof WorkUnit) {
			if (((WorkUnit) cdlElement).getName() != null) {
				ret.setAttribute("name", ((WorkUnit) cdlElement).getName());
			}
			if (cdlElement instanceof ExceptionWorkUnit) {
				if (((ExceptionWorkUnit) cdlElement).getName() != null) {
					ret.setAttribute("name", ((ExceptionWorkUnit) cdlElement)
							.getName());
				}

				if (((ExceptionWorkUnit) cdlElement).getExceptionType() != null) {
					ret.setAttribute("guard", "cdl:hasExceptionOccurred('"
							+ ((ExceptionWorkUnit) cdlElement)
									.getExceptionType() + "')");
				}

				// Export child activities
				Element base = ret;

				if (((WorkUnit) cdlElement).getActivities().size() > 1) {

					base = newDomElementOfCDLElement(parent, "sequence");

					ret.appendChild(base);
				}
				transformListOfCDLElement2DocElements(((ExceptionWorkUnit) cdlElement)
						.getActivities(), base);
			} else if(cdlElement instanceof WhenWithBlockOfWorkUnit) {
				String blockValue = ((WorkUnit) cdlElement).getBlock();
				String guardValue = ((WorkUnit) cdlElement).getGuardExpression();
				ret.setAttribute("block", blockValue);
				ret.setAttribute("guard", guardValue);
				
				Element base = ret;

				// If there is more than one activity, then we need
				// to contain them within a new sequence activity which
				// will become the sole activity associated with the
				// CDL exception workunit
				if (((WorkUnit) cdlElement).getActivities().size() > 1) {

					base = newDomElementOfCDLElement(parent, "sequence");

					ret.appendChild(base);
				}
				transformListOfCDLElement2DocElements(((WorkUnit)cdlElement).getActivities(), base);
//				String repeatValue = ((WorkUnit) cdlElement).getRepeatExpression();
//				ret.setAttribute("repeat", repeatValue);
//				ret.setMatchedExpression(guardValue);
			} else if(cdlElement instanceof WhileWithRepeateOfWorkUnit) {
//				String blockValue = ((WorkUnit) cdlElement).getBlock();
				String guardValue = ((WorkUnit) cdlElement).getGuardExpression();
				String repeatValue = ((WorkUnit) cdlElement).getRepeatExpression();
//				ret.setAttribute("block", blockValue);
				ret.setAttribute("guard", guardValue);
				ret.setAttribute("repeat", repeatValue);
				
				Element base = ret;

				// If there is more than one activity, then we need
				// to contain them within a new sequence activity which
				// will become the sole activity associated with the
				// CDL exception workunit
				if (((WorkUnit) cdlElement).getActivities().size() > 1) {

					base = newDomElementOfCDLElement(parent, "sequence");

					ret.appendChild(base);
				}
				transformListOfCDLElement2DocElements(((WorkUnit)cdlElement).getActivities(), base);
			} else if(cdlElement instanceof CaseConditionalOfSwitch) {
//				String blockValue = ((WorkUnit) cdlElement).getBlock();
				String guardValue = ((WorkUnit) cdlElement).getGuardExpression();
//				String repeatValue = ((WorkUnit) cdlElement).getRepeatExpression();
//				ret.setAttribute("block", blockValue);
				ret.setAttribute("guard", guardValue);
//				ret.setAttribute("repeat", repeatValue);
				
				Element base = ret;

				// If there is more than one activity, then we need
				// to contain them within a new sequence activity which
				// will become the sole activity associated with the
				// CDL exception workunit
				if (((WorkUnit) cdlElement).getActivities().size() > 1) {

					base = newDomElementOfCDLElement(parent, "sequence");

					ret.appendChild(base);
				}
				transformListOfCDLElement2DocElements(((WorkUnit)cdlElement).getActivities(), base);
			} else {

//				if (CheckNOthersUtil.isSet(((WorkUnit) cdlElement)
//						.getGuardExpression())) {
//					ret.setAttribute("guard", ((WorkUnit) cdlElement)
//							.getGuardExpression());
//				}
//
//				if (CheckNOthersUtil.isSet(((WorkUnit) cdlElement)
//						.getRepeatExpression())) {
//					System.out.println(((WorkUnit) cdlElement)
//							.getRepeatExpression()+"##############");
//					ret.setAttribute("repeat", ((WorkUnit) cdlElement)
//							.getRepeatExpression());
//				}
//				
//				if (((WorkUnit) cdlElement).getBlock() != null) {
//					ret.setAttribute("block", Boolean.TRUE.toString());
//				}

				// Export child activities
				Element base = ret;

				// If there is more than one activity, then we need
				// to contain them within a new sequence activity which
				// will become the sole activity associated with the
				// CDL exception workunit
				if (((WorkUnit) cdlElement).getActivities().size() > 1) {

					base = newDomElementOfCDLElement(parent, "sequence");

					ret.appendChild(base);
				}
				transformListOfCDLElement2DocElements(((WorkUnit)cdlElement).getActivities(), base);
			}
		} else if(cdlElement instanceof SilentAction) {
			if (((SilentAction)cdlElement).getRoleType() != null) {
			    ret.setAttribute("roleType", addTNS(((SilentAction)cdlElement).getRoleType().getName()));
			}
			
			String name = ((SilentAction)cdlElement).getName();
			
			if (CheckNOthersUtil.isSet(name) == false) {
				name = "";
			}
			
			ret.setAttribute("name", name);
		} else if(cdlElement instanceof Sequence) {
			transformListOfCDLElement2DocElements(((Sequence)cdlElement).getActivities(), ret);
		} else if(cdlElement instanceof RecordElementInfo) {
			if (((RecordElementInfo)cdlElement).getName() != null) {
				ret.setAttribute("name", ((RecordElementInfo)cdlElement).getName());
			}

			if (((RecordElementInfo)cdlElement).getWhen() != null) {
			    ret.setAttribute("when", getCorrectValue(((RecordElementInfo)cdlElement).getWhen().getName()));
			}
			
			if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getCauseException())) {
				ret.setAttribute("causeException", ((RecordElementInfo)cdlElement).getCauseException());
			}

			// Export source
			Element src=newDomElementOfCDLElement(ret, "source");
			
			if (((RecordElementInfo)cdlElement).getSourceVariable() != null) {
				String func="cdl:getVariable("+
				((RecordElementInfo)cdlElement).getSourceVariable().getName();

				if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getSourceVariablePart())) {
					func += "','"+((RecordElementInfo)cdlElement).getSourceVariablePart()+"','')";
				} else {
					func +=  "','','')";
				}

				src.setAttribute("variable", func);
				
			} else if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getSourceExpression())) {
				src.setAttribute("expression", ((RecordElementInfo)cdlElement).getSourceExpression());
			}

			ret.appendChild(src);

			Element target=newDomElementOfCDLElement(ret, "target");
			
			if (((RecordElementInfo)cdlElement).getTargetVariable() != null) {
				String func="cdl:getVariable("+
				((RecordElementInfo)cdlElement).getTargetVariable().getName();

				if (CheckNOthersUtil.isSet(((RecordElementInfo)cdlElement).getTargetVariablePart())) {
					func += "','"+((RecordElementInfo)cdlElement).getTargetVariablePart()+"','')";
				} else {
					func +=  "','','')";
				}
				
				target.setAttribute("variable", func);
			}
			
			ret.appendChild(target);
		}
		
		parent.appendChild(ret);
		return ret;
	}
	
	protected static String addTNS(String localname) {
		return("tns"+":"+localname);
	}
	
	protected static String getTagName(CDLElement cdlElement) {
		String ret = null;
		if(cdlElement instanceof InformationType) {
			ret = "informationType";
		} else if(cdlElement instanceof Token) {
			ret = "token";
		} else if(cdlElement instanceof TokenLocator) {
			ret = "tokenLocator";
		} else if(cdlElement instanceof RoleType) {
			ret = "roleType";
		} else if(cdlElement instanceof RelationshipType) {
			ret = "relationshipType";
		} else if(cdlElement instanceof ParticipantType) {
			ret = "participantType";
		} else if(cdlElement instanceof ChannelType) {
			ret = "channelType";
		} else if(cdlElement instanceof Assign) {
			ret = "assign";
		} else if(cdlElement instanceof BehaviorOfRoleType) {
			ret = "behavior";
		} else if(cdlElement instanceof BindInfo) {
			ret = "bind";
		} else if(cdlElement instanceof Choice) {
			ret = "choice";
		} else if(cdlElement instanceof Choreography) {
			ret = "choreography";
		} else if(cdlElement instanceof CopyOfAssign) {
			ret = "copy";
		} else if(cdlElement instanceof ExceptionBlock) {
			ret = "exceptionBlock";
		} else if(cdlElement instanceof ExceptionWorkUnit) {
			ret = "workunit";
		} else if(cdlElement instanceof ExchangeInfo) {
			ret = "exchange";
		} else if(cdlElement instanceof Finalize) {
			ret = "finalize";
		} else if(cdlElement instanceof FinalizerBlock) {
			ret = "finalizerBlock";
		} else if(cdlElement instanceof NoAction) {
			ret = "noAction";
		}else if(cdlElement instanceof Interaction) {
			ret = "interaction";
		}else if(cdlElement instanceof Parallel) {
			ret = "parallel";
		}else if(cdlElement instanceof Perform) {
			ret = "perform";
		}else if(cdlElement instanceof WorkUnit) {
			ret = "workunit";
		}else if(cdlElement instanceof SendByExchange) {
			ret = "send";
		}else if(cdlElement instanceof ReceiveByExchange) {
			ret = "receive";
		}else if(cdlElement instanceof SilentAction) {
			ret = "silentAction";
		}else if(cdlElement instanceof Variable) {
			ret = "variable";
		}else if(cdlElement instanceof Sequence) {
			ret = "sequence";
		}else if(cdlElement instanceof RecordElementInfo) {
			ret = "record";
		}
		return ret;
	}
	
	protected static Element newDomElementOfCDLElement(Node docNode, String name,
			String namespace) {
		Element ret = null;

		if (docNode instanceof Document) {
			ret = ((Document) docNode).createElementNS(namespace,
					name);
		} else {
			ret = docNode.getOwnerDocument().createElementNS(namespace, name);
		}

		return (ret);
	}
	
	protected static Element newDomElementOfCDLElement(Node docNode, String name) {
		Element ret = null;

		if (docNode instanceof Document) {
			ret = ((Document) docNode).createElementNS(CDLDefinitions.CDL_NS,
					name);
		} else {
			ret = docNode.getOwnerDocument().createElementNS(CDLDefinitions.CDL_NS, name);
		}

		return (ret);
	}
	
	protected static void transformListOfCDLElement2DocElements(java.util.List list,
			Node parent) {

		if (list != null) {

			java.util.Iterator iter = list.iterator();

			while (iter.hasNext()) {
				CDLElementImpl cdlElement = (CDLElementImpl) iter.next();
				tranformCDLElement2DomElement(cdlElement,parent);
			}
		}
	}
	
	protected static String getCorrectValue(String value) {
		String ret=null;
		
		if (value != null) {
		    ret = value.toLowerCase().replace('_', '-');
		}
		
		return(ret);
	}
	
	protected static String getInfoOrChannelTag(CDLElement cdlElement) {
    	String ret=null;
    	if(cdlElement instanceof Variable) {
			if (((Variable)cdlElement).getType() != null) {
				if (((Variable)cdlElement).getType() instanceof ChannelType) {
					ret = "channelType";
				} else {
					ret = "informationType";
				}
			}
    	} else if(cdlElement instanceof ExchangeInfo) {
    		if (((ExchangeInfo)cdlElement).getType() != null) {
				if (((ExchangeInfo)cdlElement).getType() instanceof ChannelType) {
					ret = "channelType";
				} else {
					ret = "informationType";
				}
			}
    	}
    	return(ret);
    }
}
