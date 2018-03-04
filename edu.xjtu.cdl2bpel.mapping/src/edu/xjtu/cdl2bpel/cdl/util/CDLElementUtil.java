package edu.xjtu.cdl2bpel.cdl.util;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.InfoOrChannel;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl2wsdl.CDLPrefixNamespaceWithDefaultTNSDeriver;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.xml.util.XMLPrefixNamespaceWithDefaultTNSDeriver;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;

public class CDLElementUtil {
	
	public static String getNamespace(String qname, CDLElement cdlElement) {
		return (getNamespace(qname, cdlElement, false));
	}

	public static String getNamespace(String qname,
					CDLElement cdlElement, boolean defaultTns) {
		String ret=null;
		
		if (qname != null && cdlElement != null &&
				cdlElement.getBelongedPackage() != null) {
			
			if (defaultTns) {
				ret = XMLUtils.getNamespace(qname,
						getPrefixResolver(cdlElement.getBelongedPackage()));
			} else {
				ret = XMLUtils.getNamespace(qname,
						getPrefixResolver(cdlElement.getBelongedPackage()),null);
			}
			//def=targetNamespace="http://acme.com/loanprocessing"
			//targetNamespace
			
		}
		
		return(ret);
	}
	
	public static String getRealInformationType(InfoOrChannel type) {
		String ret=null;
		
		if (type instanceof InformationType) {
			InformationType infoType=
					(InformationType)type;
			
			if (CheckNOthersUtil.isSet(infoType.getTypeName())) {
				ret = infoType.getTypeName();
			}
		} else if (type instanceof ChannelType) {
			ChannelType chanType=
					(ChannelType)type;
			
			if (chanType.getReferencedToken() != null &&
					chanType.getReferencedToken().
							getInformationType() != null) {
				ret = getRealInformationType(chanType.getReferencedToken().getInformationType());
			}
		}
		
		return(ret);
	}
	
	public static String getRealInformationElement(InfoOrChannel type) {
		String ret=null;
		
		if (type instanceof InformationType) {
			InformationType infoType=
					(InformationType)type;
			
			if (CheckNOthersUtil.isSet(infoType.getElementName())) {
				ret = infoType.getElementName();
			}
		} else if (type instanceof ChannelType) {
			ChannelType chanType=
					(ChannelType)type;
			
			if (chanType.getReferencedToken() != null &&
					chanType.getReferencedToken().
							getInformationType() != null) {
				ret = getRealInformationElement(chanType.getReferencedToken().getInformationType());
			}
		}
		
		return(ret);
	}
	
	public static XMLPrefixNamespaceWithDefaultTNSDeriver getPrefixResolver(Package pack) {
		return (new CDLPrefixNamespaceWithDefaultTNSDeriver(pack));
	}
	
	public static InformationType getInformationType(InfoOrChannel type) {
		InformationType ret=null;
		
		if (type instanceof InformationType) {
			ret = (InformationType)type;
		} else if (type instanceof ChannelType) {
			ChannelType chanType=
					(ChannelType)type;
			
			if (chanType.getReferencedToken() != null &&
					chanType.getReferencedToken().
							getInformationType() != null) {
				ret = chanType.getReferencedToken().getInformationType();
			}
		}
		
		return(ret);
	}	
}
