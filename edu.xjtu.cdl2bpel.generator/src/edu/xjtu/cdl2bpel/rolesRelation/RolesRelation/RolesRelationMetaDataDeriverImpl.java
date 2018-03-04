package edu.xjtu.cdl2bpel.rolesRelation.RolesRelation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;

public class RolesRelationMetaDataDeriverImpl implements
		RolesRelationMetaDataDeriver {

	private static RolesRelationMetaDataDeriver rolesRelationMetaDataDeriver;

	private static Map<String, Integer> relExchange;
	private static List<RelationshipType> relationshipType;
	private static Map<Element, String> interactions;

	private static List<ParticipantType> participantsList;
	private static List<RoleType> rolesList;
	
	public static RolesRelationMetaDataDeriver getRolesRelationMetaDataDeriverImpl(String filePath) {

		//if (rolesRelationMetaDataDeriver == null) {
			relExchange = new HashMap<String, Integer>();
			relationshipType = new ArrayList<RelationshipType>();
			interactions = new HashMap<Element, String>();
			participantsList = new ArrayList<ParticipantType>();
			rolesList = new ArrayList<RoleType>();
			rolesRelationMetaDataDeriver = new RolesRelationMetaDataDeriverImpl();
			rolesRelationMetaDataDeriver.deriveRolesRelationPackage(filePath);
		//}
		return rolesRelationMetaDataDeriver;
	}
	
	public Map<String, Integer> getRelExchange() {
		return relExchange;
	}

	public List<RelationshipType> getRelationshipType() {
		return relationshipType;
	}

	public Map<Element, String> getInteractions() {
		return interactions;
	}
	
	public static List<ParticipantType> getParticipantsList() {
		return participantsList;
	}

	public static List<RoleType> getRolesList() {
		return rolesList;
	}

	@Override
	public void deriveRolesRelationPackage(String filePath) {
		System.out.println(filePath);
		edu.xjtu.cdl2bpel.cdl.Package cdlpack = CDLResolver
				.getPackageFromCDLFile(filePath);
		relationshipType = cdlpack.getRelationshipTypes();
		participantsList = cdlpack.getParticipantTypes();
		rolesList = cdlpack.getRoleTypes();
		
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		try {
			doc = builder.build(new BufferedReader(new FileReader(filePath)));
//			doc = builder.build(filePath);
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Element root = doc.getRootElement();
		deriveRolesRelationInteractions(root);
	}

	public void deriveRolesRelationInteractions(Element element) {

		List<Element> elements = element.getChildren();
		int excount = 0;

		if (element.getName().equalsIgnoreCase("Interaction")) {
			String relationship = null;
			List<Element> children = element.getChildren();

			for (int i = 0; i < children.size(); i++) {
				if (children.get(i).getName().equalsIgnoreCase("participate")) {
					relationship = children.get(i).getAttributeValue(
							"relationshipType");
					interactions.put(element, relationship);
				} else if (children.get(i).getName().equalsIgnoreCase(
						"exchange")) {
					excount += 1;
				}
			}
			relExchange.put(relationship, excount);
		}

		for (Iterator it = elements.iterator(); it.hasNext();) {
			Element elem = (Element) it.next();
			deriveRolesRelationInteractions(elem);
		}
	}
}

