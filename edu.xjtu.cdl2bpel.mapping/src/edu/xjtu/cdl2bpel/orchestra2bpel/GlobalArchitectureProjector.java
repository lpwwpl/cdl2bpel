package edu.xjtu.cdl2bpel.orchestra2bpel;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Element;

import edu.xjtu.cdl2bpel.cdl.RoleType;
//import edu.xjtu.cdl2bpel.commons.util.NamespaceUtil;
import edu.xjtu.cdl2bpel.commons.util.Pair;
import edu.xjtu.cdl2bpel.orchestra.BPElement;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.InterfaceOfGroup;
import edu.xjtu.cdl2bpel.orchestra.Namespace;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.orchestra.util.NameSpaceUtil;

public class GlobalArchitectureProjector extends Orchestra2BPELProjectorImpl {

	public Element transform(Orchestra2BPELContext context,
			BPElement bpelElement) {

		GlobalArchitecture globalArchitecture = (GlobalArchitecture) bpelElement;
		Element processElem = context.createElement("process");// 创建process标签
		String temp = context.getPair().getSecond();
		String processName = temp.substring(temp.lastIndexOf("/")+1);
		processElem.setAttribute("name", processName);// 为process标签设置name属性
		/*
		 * StringtargetNamespace=NamespaceUtil.getNamespace(globalArchitecture.
		 * getFullyQualifiedName()); processElem.setAttribute("targetNamespace",
		 * targetNamespace);//设置targetNamespace
		 */
		
		EList<Namespace> namespaces = globalArchitecture.getNamespaces();
		
		Namespace bpws = OrchestraFactory.eINSTANCE.createNamespace();
		bpws.setPrefix("bpws");
		bpws.setUri("http://schemas.xmlsoap.org/ws/2003/03/business-process/");		
		namespaces.add(bpws);
		
		int j = 1;
		for (Iterator it = context.getPairs().iterator(); it.hasNext();) {
			Pair<RoleType[], String> pair = (Pair<RoleType[], String>) it
					.next();
			Namespace eachPartnerNamespace = OrchestraFactory.eINSTANCE
					.createNamespace();
			eachPartnerNamespace.setPrefix("ns" + j);
			j++;
			eachPartnerNamespace.setUri(pair.getSecond());
			namespaces.add(eachPartnerNamespace);
		}
		
		Namespace targetNamespace = OrchestraFactory.eINSTANCE.createNamespace();
		targetNamespace.setPrefix("tns");
		targetNamespace.setUri(context.getPair().getSecond());
		namespaces.add(targetNamespace);
		
		for (int i = 0; i < namespaces.size(); i++) {
			Namespace namespace = namespaces.get(i);
			String prifix = namespace.getPrefix();
			String namespaceUri = namespace.getUri();
			context.getNamespaces().put(namespaceUri, prifix);// 为context设置命名空间map，根据命名空间的uri来找前缀
		}
		
		processElem.setAttribute("targetNamespace", targetNamespace.getUri());// 设置targetNamespace
		processElem.setAttribute("xmlns", "http://schemas.xmlsoap.org/ws/2003/03/business-process/");
		// 以下循环设置带前缀的namespace
		
		for (int i = 0; i < namespaces.size(); i++) {
			String prefix = namespaces.get(i).getPrefix();
			if (prefix != null && prefix.length() > 0) {
				processElem.setAttribute("xmlns:"
						+ namespaces.get(i).getPrefix(), namespaces.get(i)
						.getUri());
				context.getNamespaces().put(namespaces.get(i)
						.getUri(), namespaces.get(i).getPrefix());
			}
		}
		
		Element partenerLinks = generatePartnerLinks(context,
				globalArchitecture);// 生成伙伴链接们
		processElem.appendChild(partenerLinks);// 将伙伴链接加到process中
		context.getDocument().appendChild(processElem);// 将process标签添加到context中

		/*
		 * 因为命名空间和伙伴链接没有专门的projector，所以不能用递归，而是要在这里单独处理。
		 * 当对子元素命名空间和伙伴链进行处理时，因为proxy返回的projector为null，故在递归中并没有对这两类子元素进行处理
		 */
		return processElem;
	}

	private Element generatePartnerLinks(Orchestra2BPELContext context,
			GlobalArchitecture globalArchitecture) {// 得到伙伴链接
		Element partenerLinks = context.createElement("partnerLinks");
		EList<InterfaceOfGroup> m_partenerLinks = globalArchitecture
				.getInterfaces();
		Iterator iterator = m_partenerLinks.iterator();
		while (iterator.hasNext()) {
			Element partenerLink = context.createElement("partnerLink");
			InterfaceOfGroup m_partenerLink = (InterfaceOfGroup) iterator
					.next();
			String name = NameSpaceUtil.getLocalPart(m_partenerLink
					.getFullyQualifiedName());
			// String name=m_partenerLink.getName();
			partenerLink.setAttribute("name", name);// 设置name属性
			if (m_partenerLink.isServiceProvider()) {// 设计角色名
				partenerLink.setAttribute("myRole", name + "Role");
			} else {
				partenerLink.setAttribute("partnerRole", name + "Role");
			}
			partenerLink.setAttribute("partnerLinkType", m_partenerLink
					.getName()
					+ "LT");// 设置partnerLinkType属性的值
			String namespaceLocalPart = NameSpaceUtil
					.getLocalPart(m_partenerLink.getFullyQualifiedName());
			partenerLink.setAttribute("partnerLinkType", getPrefixOfPartnerLinkType(context.getPairs(),context.getNamespaces(),m_partenerLink.getAddition())+":"
					+ namespaceLocalPart + "LT");
			partenerLinks.appendChild(partenerLink);
		}
		return partenerLinks;
	}

	public String getPrefixOfPartnerLinkType(List<Pair<RoleType[],String>> pairs,Map namespaces,String roleTypeName) {
		String ret = null;
		String namespace = null;
		
		for(Iterator it = pairs.iterator();it.hasNext();) {
			Pair<RoleType[],String> pair = (Pair<RoleType[],String>)it.next();
			RoleType[] roleTypes = pair.getFirst();
			for(int i = 0;i<roleTypes.length;i++) {
				if(roleTypes[i].getName().equals(roleTypeName)) {
					namespace = pair.getSecond();
					break;
				}
			}
		}
		
		if(namespace != null) {
			
			ret = (String)namespaces.get(namespace);
			if(ret.equals("targetNamespace")) {
				ret = "tns";
			}
		} else {
		
		}
		
		return ret;
	}
	
	protected org.w3c.dom.Element initializeCorrelationSets(
			Orchestra2BPELContext context, GlobalArchitecture globalArchitecture) {
		Element ret = context.createElement("correlationSets");

		/**
		 * TODO: Initialize based on alternative info
		 * 
		 */
//		Iterator iter = cdlpack.getChannelTypes().iterator();
//		java.util.Vector identities = new java.util.Vector();
//		while (iter.hasNext()) {
//			ChannelType channelType = (ChannelType) iter.next();
//
//			// Extract correlation set information
//			Iterator subiter = channelType.getIdentities().iterator();
//			while (subiter.hasNext()) {
//				Identity id = (Identity) subiter.next();
//
//				if (identities.contains(id.getName()) == false) {
//
//					Element corset = context
//							.createElement(WSBPELKeywords.CORRELATIONSET);
//					ret.appendChild(corset);
//
//					corset.setAttribute(WSBPELKeywords.NAME_ATTR, id.getName());
//
//					String props = null;
//					Iterator tokeniter = id.getTokens().iterator();
//					while (tokeniter.hasNext()) {
//						Token token = (Token) tokeniter.next();
//
//						if (props == null) {
//							props = token.getName();
//						} else {
//							props += " " + token.getName();
//						}
//					}
//
//					if (props != null) {
//						corset.setAttribute(WSBPELKeywords.PROPERTIES_ATTR,
//								props);
//					}
//
//					// Add to the list, to avoid duplicates
//					identities.add(id.getName());
//				}
//			}
//		}
//
//		// If empty, then clear the returned value
//		if (ret.getChildNodes().getLength() == 0) {
//			ret = null;
//		}

		return (ret);
	}
}
