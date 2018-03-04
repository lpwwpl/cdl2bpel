package edu.xjtu.cdl2bpel.cdl2orchestra;

import java.io.OutputStream;

import java.util.Iterator;
import java.util.List;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.orchestra.GlobalArchitecture;
import edu.xjtu.cdl2bpel.orchestra.OrchestraFactory;
import edu.xjtu.cdl2bpel.xml.util.XMLUtils;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.impl.ChoreographyImpl;

public class BaseUnitsDefRoleRelevanceProjector extends AbstractCDL2OrchestraProjector {

	public BaseUnitsDefRoleRelevanceProjector(CDLElement cdlElement,CDL2OrchestraRoleRelevanceContext context) {
		super(cdlElement, context);
	}

	@Override
	public AbstractCDL2OrchestraProjector newTheCDL2OrchestraProjector(CDLElement cdlElement) {
		return null;
	}

	public boolean isRelevant(CDL2OrchestraRoleRelevanceContext context,
			Class intf) {

		boolean ret = true;

		return ret;
	}
	
	@Override
	public void transformCDLElement2Orchestra(CDL2OrchestraRoleRelevanceContext context) {
		// TODO Auto-generated method stub
		Package cdlpack = (Package)cdlElement;
		List<InformationType> informationTypes = cdlpack.getInformationTypes();
		for(Iterator it = informationTypes.iterator();it.hasNext();) {
			InformationType informationType = (InformationType)it.next();
			edu.xjtu.cdl2bpel.orchestra.InformationType orcheInformationType = OrchestraFactory.eINSTANCE.createInformationType();
			orcheInformationType.setName(informationType.getName());
			orcheInformationType.setElement(informationType.getElementName());
			orcheInformationType.setType(informationType.getTypeName());
			context.getGlobalArchitecture().getInformationTypes().add(orcheInformationType);
		}
		List<Token> tokens = cdlpack.getTokens();
		for(Iterator it = tokens.iterator();it.hasNext();) {
			Token token = (Token)it.next();
		}
		List<TokenLocator> tokenLocators = cdlpack.getTokenLocators();
		for(Iterator it = tokenLocators.iterator();it.hasNext();) {
			TokenLocator tokenLocator = (TokenLocator)it.next();
		}
		
//		InterfacesOfGroupRoleRelevanceProjector interfacesOfGroupRoleRelevanceProjector = new InterfacesOfGroupRoleRelevanceProjector(cdlElement, roleTypes,globalArchitecture);
//		interfacesOfGroupRoleRelevanceProjector.setInterfacesOfGroup(cdlElement.getBelongedPackage());
//		interfaceOfGroups = interfacesOfGroupRoleRelevanceProjector.getInterfaceOfGroups();
//		globalArchitecture.getInterfaces().addAll(interfaceOfGroups);
		
//		Document doc = XMLUtils.createDocument();
//		Element rootElem = doc.createElementNS("", "definitions");
//		doc.appendChild(rootElem);
//		for(InterfaceOfGroup interfaceOfGroup:interfaceOfGroups) {
//			Element elem = doc.createElementNS("", "plnk:partnerLinkType");
//			elem.setAttribute("name", interfaceOfGroup.getBelongedRoleTypeName()+"PTLT");
//			List<Operation> operations = interfaceOfGroup.getOperations();
//			for(Operation operation:operations) {
//				Element plnkRoleElem = doc.createElementNS("", "plnk:role");
//				plnkRoleElem.setAttribute("name", interfaceOfGroup.getBelongedRoleTypeName()+"_"+operation.getName()+"_Role");
//				Element plnkPortTypeElem = doc.createElementNS("", "plnk:portType");
//				plnkPortTypeElem.setAttribute("name", operation.getName()+"PT");
//				plnkRoleElem.appendChild(plnkPortTypeElem);
//				elem.appendChild(plnkRoleElem);
//			}
//			
//			rootElem.appendChild(elem);
//		}
//		try{
//			saveDocument("E:/lpw.wsdl", doc);
//		} catch(Exception ex){
//			ex.printStackTrace();
//		}
	}
	
	protected void saveDocument(String path, org.w3c.dom.Document doc)
			throws Exception {

		// Transform the DOM represent to text
		String text = XMLUtils.getText(doc, true);

		// Only write to file after successful transformation
		OutputStream fos = new java.io.FileOutputStream(path);
		fos.write(text.getBytes());

		fos.flush();

		fos.close();
	}
}
