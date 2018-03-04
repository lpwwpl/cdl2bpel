package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import edu.xjtu.cdl2bpel.cdl.ActionTypeEnumByExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.cdl.util.InteractionUtil;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLPrefixNamespaceWithDefaultTNSDeriver;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

/**
 * Extract all roleTypeMatrix WSDLInfo entities from the CDL Package entity,then
 * we will tranform all the WSDLInfo entities to the WSDL XML Documents.
 * 
 * @author Administrator
 * 
 */
public class ExtractCDLInfo2WSDLInfoImpl implements ExtractCDLInfo2WSDLInfo {

	private Map roleTypeInfos = null;
	private Package cdlpack = null;
	private List<RoleTypeInfo> roleTypeInfoMatrix = null;
	private Hashtable nsPrefix = new Hashtable();
	private Hashtable outputNSPrefix = new Hashtable();

	private Vector reservedPrefixes = new Vector();
	private List<MessageOfOperation> messages = new ArrayList();

	public List<MessageOfOperation> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageOfOperation> messages) {
		this.messages = messages;
	}

	public Vector getReservedPrefixes() {
		return reservedPrefixes;
	}

	public void setReservedPrefixes(Vector reservedPrefixes) {
		this.reservedPrefixes = reservedPrefixes;
	}

	public List<RoleTypeInfo> getRoleTypeInfoMatrix() {
		return roleTypeInfoMatrix;
	}

	public void setRoleTypeInfoMatrix(List<RoleTypeInfo> roleTypeInfoMatrix) {
		this.roleTypeInfoMatrix = roleTypeInfoMatrix;
	}

	public Map getRoleTypeInfos() {
		return roleTypeInfos;
	}

	public void setRoleTypeInfos(Map roleTypeInfos) {
		this.roleTypeInfos = roleTypeInfos;
	}

	public ExtractCDLInfo2WSDLInfoImpl(Package cdlpack) {
		roleTypeInfos = new HashMap();
		roleTypeInfoMatrix = new ArrayList();
		this.cdlpack = cdlpack;

	}

	/**
	 * Extract all roleTypeMatrix WSDLInfo entities from the CDL Package entity,then
	 * we will tranform all the WSDLInfo entities to the WSDL XML Documents.
	 */
	public void extractCDLInfo2WSDLInfo() {
		extractCDLElement(cdlpack);
	}

	/**
	 * Extract WSDLInfos form Package entity and Interaction Entity.
	 * 
	 * @param cdlElement
	 */
	public void extractCDLElement(CDLElement cdlElement) {
		if (cdlElement instanceof Package) {
			extractCDLPackage(cdlpack);

		}
		if (cdlElement instanceof Interaction) {
			extractCDLInteraction((Interaction) cdlElement);
		} else {
			Iterator it = cdlElement.eContents().iterator();
			for (; it.hasNext();) {
				CDLElement subCDLElemnt = (CDLElement) it.next();
				extractCDLElement(subCDLElemnt);
			}
		}
	}

	/**
	 * Extract WSDLInfos form Package entity.At Package level Extract and store roleTypes info 
	 * from Package entity.
	 */
	public void extractCDLPackage(Package pack) {
		if (cdlpack != null) {
			java.util.List roleTypes = cdlpack.getRoleTypes();

			// Create prefix resolver
			XMLPrefixNamespaceWithDefaultTNSDeriver prefixes = CDLElementUtil
					.getPrefixResolver(cdlpack);
			java.util.Iterator iter = roleTypes.iterator();
			while (iter.hasNext()) {
				RoleType roleType = (RoleType) iter.next();
				extractRoleTypeInfo(prefixes, roleType);
			}

			java.util.Iterator it = cdlpack.getNamespaces().iterator();
			while (it.hasNext()) {
				Namespace ns = (Namespace) it.next();
				reserveNamespacePrefix(ns.getUri(), ns.getPrefix());
			}
		}
	}

	/**
	 * 
	 * @param prefixes
	 * @param roleType
	 */
	public void extractRoleTypeInfo(
			XMLPrefixNamespaceWithDefaultTNSDeriver prefixes, RoleType roleType) {

		RoleTypeInfo roleTypeInfo = new RoleTypeInfoImpl(prefixes
				.getDefaultCDLTargetNamespace(), roleType);
		roleTypeInfoMatrix.add(roleTypeInfo);
		roleTypeInfos.put(roleType, roleTypeInfo);

		java.util.Iterator iter = roleType.getBehaviors().iterator();
		while (iter.hasNext()) {
			BehaviorOfRoleType behavior = (BehaviorOfRoleType) iter.next();
			PortTypeBehaviorOfRoleTypeInfo portTypeOfCDL2WSDL = null;
			portTypeOfCDL2WSDL = new PortTypeBehaviorOfRoleTypeInfoImpl(
					behavior.getName(), XMLUtils.getLocalname(behavior
							.getInterface()), XMLUtils.getNamespace(behavior
							.getInterface(), prefixes));

			roleTypeInfo.getPortTypes().add(portTypeOfCDL2WSDL);
		}
	}

	/**
	 * 
	 */
	public void extractCDLInteraction(Interaction interaction) {
		if (interaction.getTheToRoleOfInteraction() == null) {

		}

		PortTypeBehaviorOfRoleTypeInfo idef = getPortTypeOfTheRoleTypeInfoByTheInteraction(interaction);

		// Create prefix resolver
		Package cdlpack = interaction.getBelongedPackage();

		XMLPrefixNamespaceWithDefaultTNSDeriver prefixes = CDLElementUtil
				.getPrefixResolver(cdlpack);

		// Process the exchange elements for this operation
		java.util.Iterator iter = interaction.getExchangeInfos().iterator();

		while (iter.hasNext()) {
			processExchangeInfo((ExchangeInfo) iter.next(), idef, prefixes);
		}
	}

	/**
	 * 
	 * @param exchange
	 * @param idef
	 * @param prefixes
	 */
	protected void processExchangeInfo(ExchangeInfo exchange,
			PortTypeBehaviorOfRoleTypeInfo idef,
			XMLPrefixNamespaceWithDefaultTNSDeriver prefixes) {

		java.util.List reqExchanges = null;
		String reqType = null;
		String reqNamespace = null;
		ExchangeInfo reqInfo = null;
		String notType = null;
		String notNamespace = null;

		// If not a notification, then obtain the associated
		// request exchange (which for a request would be itself)
		if (exchange.getAction() == ActionTypeEnumByExchangeInfo.REQUEST
				|| exchange.getAction() == ActionTypeEnumByExchangeInfo.RESPOND) {
			reqExchanges = InteractionUtil.getRequestExchangeDetails(exchange);

			// Check that response exchanges have atleast one
			// associated request
			if (exchange.getAction() == ActionTypeEnumByExchangeInfo.RESPOND
					&& (reqExchanges == null || reqExchanges.size() == 0)) {
				String name = "";

				if (CheckNOthersUtil.isSet(exchange.getName())) {
					name = "'" + exchange.getName() + "' ";
				}
			}
		}
		// else {
		//
		// // Get request type and namespace
		// String type = CDLElementUtil.getRealInformationType(exchange
		// .getType());
		//
		// if (NamesUtil.isSet(type) == false) {
		// type = CDLElementUtil.getRealInformationElement(exchange
		// .getType());
		// }
		//
		// notNamespace = CDLElementUtil.getNamespace(type, exchange);
		//
		// notType = XMLUtils.getLocalname(type);
		// }

		if (reqExchanges != null && reqExchanges.size() >= 1) {
			reqInfo = (ExchangeInfo) reqExchanges.get(0);

			// Get request type and namespace
			String type = CDLElementUtil.getRealInformationType(reqInfo
					.getType());

			if (type == null) {
				type = CDLElementUtil.getRealInformationElement(reqInfo
						.getType());
			}

			reqNamespace = CDLElementUtil.getNamespace(type, exchange);
			reqType = XMLUtils.getLocalname(type);
		}

		OperationOfPortTypeBehavior opdef = null;

		java.util.List ops = null;

		if (exchange.getAction() == ActionTypeEnumByExchangeInfo.NOTIFY) {
			// ops = idef.getNotifications(exchange.getBelongedInteraction()
			// .getOperation(), notNamespace, notType);
		} else {
			ops = idef.getOperations(exchange.getBelongedInteraction()
					.getOperation(), reqNamespace, reqType, null, null);
		}

		if (ops.size() > 0) {
			opdef = (OperationOfPortTypeBehaviorImpl) ops.get(0);

			if (ops.size() > 1) {
				// ERROR!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
		}

		if (opdef == null) {

			// Add operation definition
			opdef = new OperationOfPortTypeBehaviorImpl(idef, exchange
					.getBelongedInteraction().getOperation());
			idef.getOperationOfCDL2WSDL().add(opdef);

			// Create the request message definition,
			// as done in the service projection - as the
			// response maybe occuring first in visiting order

			// ####################################################
			// if (reqInfo != null) {
			// addMessageOfOperation(reqInfo, true, idef,
			// opdef, prefixes);
			// }
		}

		addMessageOfOperation(exchange, reqInfo != null, idef, opdef, prefixes);
	}

	public boolean isExistInMessage(MessageOfOperation theMessage) {
		boolean flag = false;
		for (MessageOfOperation message : messages) {
			if (message.externEquals(theMessage)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	protected void addMessageOfOperation(ExchangeInfo exchange,
			boolean reqFound, PortTypeBehaviorOfRoleTypeInfo idef,
			OperationOfPortTypeBehavior opdef,
			XMLPrefixNamespaceWithDefaultTNSDeriver prefixes) {
		int mesgType = -1;

		if (exchange.getAction() == ActionTypeEnumByExchangeInfo.REQUEST) {
			// Check if exchange is a fault
			if (exchange.getFaultName() != null) {
				mesgType = MessageOfOperationImpl.INFAULT;
			} else {
				mesgType = MessageOfOperationImpl.INPUT;
			}

		} else if (exchange.getAction() == ActionTypeEnumByExchangeInfo.RESPOND
				|| exchange.getAction() == ActionTypeEnumByExchangeInfo.NOTIFY) {
			// Check if exchange is a fault
			if (exchange.getFaultName() != null) {
				mesgType = MessageOfOperationImpl.OUTFAULT;
			} else {
				mesgType = MessageOfOperationImpl.OUTPUT;
			}
		}

		if (mesgType == -1) {

		}

		// If specified, obtain the localname and optional namespace
		// associated with the fault name
		String faultLocalname = null;
		String faultNamespace = null;

		if (CheckNOthersUtil.isSet(exchange.getFaultName())) {
			faultLocalname = XMLUtils.getLocalname(exchange.getFaultName());
			String prefix = XMLUtils.getPrefix(exchange.getFaultName());

			// If no prefix is defined, then make the namespace null
			if (prefix != null) {
				faultNamespace = XMLUtils.getNamespace(exchange.getFaultName(),
						prefixes);
			} else {
				faultNamespace = prefixes.getDefaultCDLTargetNamespace();
			}
		}

		// Check for existing message definition
		MessageOfOperation mesgdef = opdef.getMessage(faultNamespace,
				faultLocalname, mesgType);
		String typeLocalname = null;
		String typeNamespace = null;
		String elemLocalname = null;
		String elemNamespace = null;

		if (exchange.getType() != null) {
			String realType = CDLElementUtil.getRealInformationType(exchange
					.getType());
			String realElement = CDLElementUtil
					.getRealInformationElement(exchange.getType());

			if (realType != null) {
				// Obtain namespace and localname for the real underlying type
				typeLocalname = XMLUtils.getLocalname(realType);
				typeNamespace = XMLUtils.getNamespace(realType, prefixes, null);
			}

			if (realElement != null) {
				// Obtain namespace and localname for the real underlying
				// element
				elemLocalname = XMLUtils.getLocalname(realElement);
				elemNamespace = XMLUtils.getNamespace(realElement, prefixes,
						null);
			}
		}

		if (mesgdef == null) {

			// Add message definition
			mesgdef = new MessageOfOperationImpl(exchange.getName(),
					faultNamespace, faultLocalname, typeNamespace,
					typeLocalname, elemNamespace, elemLocalname, null, mesgType);
			opdef.getMessages().add(mesgdef);
			if (!isExistInMessage(mesgdef))
				messages.add(mesgdef);

		} else if (elemLocalname != null) {

			if (mesgdef.getElementStringValue() == null) {

				if (mesgdef instanceof MessageOfOperation
						&& elemLocalname != null) {
					((MessageOfOperation) mesgdef)
							.setElementStringValue(elemLocalname);
					((MessageOfOperation) mesgdef)
							.setElementNamespace(elemNamespace);
				}

				// Check types are compatible
			} else if (elemLocalname.equals(mesgdef.getElementStringValue()) == false
					|| compare(elemNamespace, mesgdef.getElementNamespace()) == false) {

				if (reqFound == false) {
					// As no request details, can assume this is
					// a response message definition in a notify
					// capacity, so need to create a new opdef
					// and message definition

					// Add operation definition
					opdef = new OperationOfPortTypeBehaviorImpl(idef, exchange
							.getBelongedInteraction().getOperation());
					idef.getOperationOfCDL2WSDL().add(opdef);

					mesgdef = new MessageOfOperationImpl(exchange.getName(),
							faultNamespace, faultLocalname, typeNamespace,
							typeLocalname, elemNamespace, elemLocalname, null,
							mesgType);
					opdef.getMessages().add(mesgdef);

					if (!isExistInMessage(mesgdef))
						messages.add(mesgdef);
				} else {

				}
			}

		} else if (typeLocalname != null) {

			if (mesgdef.getTypeStringValue() == null) {

				if (mesgdef instanceof MessageOfOperationImpl
						&& typeLocalname != null) {
					((MessageOfOperationImpl) mesgdef)
							.setTypeStringValue(typeLocalname);
					((MessageOfOperationImpl) mesgdef)
							.setTypeNamespace(typeNamespace);
				}

				// Check elements are compatible
			} else if (typeLocalname.equals(mesgdef.getTypeStringValue()) == false
					|| compare(typeNamespace, mesgdef.getTypeNamespace()) == false) {

				if (reqFound == false) {
					// As no request details, can assume this is
					// a response message definition in a notify
					// capacity, so need to create a new opdef
					// and message definition

					// Add operation definition
					opdef = new OperationOfPortTypeBehaviorImpl(idef, exchange
							.getBelongedInteraction().getOperation());
					idef.getOperationOfCDL2WSDL().add(opdef);

					mesgdef = new MessageOfOperationImpl(exchange.getName(),
							faultNamespace, faultLocalname, typeNamespace,
							typeLocalname, elemNamespace, elemLocalname, null,
							mesgType);
					opdef.getMessages().add(mesgdef);

					if (!isExistInMessage(mesgdef))
						messages.add(mesgdef);
				} else {
				}
			}
		}
	}

	protected PortTypeBehaviorOfRoleTypeInfo getPortTypeOfTheRoleTypeInfoByTheInteraction(
			Interaction interaction) {
		PortTypeBehaviorOfRoleTypeInfo portType = null;

		RoleTypeInfo rtdef = (RoleTypeInfo) roleTypeInfos.get(interaction
				.getTheToRoleOfInteraction());

		if (rtdef == null) {
		}

		ChannelType ctype = (ChannelType) interaction.getChannelVariable()
				.getType();
		BehaviorOfRoleType behavior = ctype.getTheBehaviorOfTheRoleType();

		// If behavior is not explicitly associated with the
		// channel type, then use the first behavior
		if (behavior == null
				&& interaction.getTheToRoleOfInteraction().getBehaviors()
						.size() > 0) {
			behavior = (BehaviorOfRoleType) interaction
					.getTheToRoleOfInteraction().getBehaviors().get(0);
		}

		if (behavior == null) {
		}

		// Get interface definition
		portType = rtdef.getPortTypeOfCDL2WSDLByBehavior(behavior.getName());

		if (portType == null) {
		}

		return (portType);
	}

	protected boolean compare(String s1, String s2) {
		boolean ret = false;

		if (s1 == null && s2 == null) {
			ret = true;
		} else if (s1 != null && s2 != null && s1.equals(s2)) {
			ret = true;
		}

		return (ret);
	}

	public void reserveNamespacePrefix(String namespace, String prefix) {
		nsPrefix.put(namespace, prefix);
		if (prefix.equals("") || prefix.equals("xsd") || prefix.equals("tns")
				|| prefix.equals("cdl")) {

		} else {
			outputNSPrefix.put(namespace, prefix);
		}

		// prefixNS.put(namespace, prefix);
		reservedPrefixes.add(prefix);
	}

	public Hashtable getOutputNSPrefix() {
		return outputNSPrefix;
	}
}
