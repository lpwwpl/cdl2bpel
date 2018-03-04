package edu.xjtu.cdl2bpel.cdl.util;

import java.util.List;

import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.Variable;

public class CDLPackageUtil {

	public static Package getPackage(CDLElement cdlElement) {
		return null;
	}
	
	public static InformationType getInformationType(Package thePackage,String informationTypeName) {
		InformationType informationType = null;
		List<InformationType> informationTypes = thePackage.getInformationTypes();
		for(InformationType theInformationType:informationTypes) {
			if(theInformationType.getName()!=null&&informationTypeName.contains(theInformationType.getName())) {
				informationType = theInformationType;
			}
		}
		return informationType;
	}
	
	public static RoleType getRoleType(Package thePackage,String roleTypeName) {
		RoleType roleType = null;
		List<RoleType> roleTypes = thePackage.getRoleTypes();
		for(RoleType theRoleType:roleTypes) {
			if(theRoleType.getName()!=null&&roleTypeName.endsWith(theRoleType.getName())) {
				roleType = theRoleType;
			}
		}
		return roleType;
	}
	
	public static Token getToken(Package thePackage,String tokenName) {
		Token token = null;
		List<Token> tokens = thePackage.getTokens();
		for(Token theToken:tokens) {
			if(theToken.getName()!=null&&tokenName.contains(theToken.getName())) {
				token = theToken;
			}
		}
		return token;
	}
	
	public static RelationshipType getRelationship(Package thePackage,String relationshipType) {
		RelationshipType ret = null;
		List<RelationshipType> relationshipTypes = thePackage.getRelationshipTypes();
		for(RelationshipType theRelationshipType:relationshipTypes) {
			//need to be modify
			if(theRelationshipType.getName()!=null&&relationshipType.contains(theRelationshipType.getName())) {
				ret = theRelationshipType;
			}
		}
		return ret;
	}
	
	public static ChannelType getChannelType(Package thePackage,String channelType) {
		ChannelType ret = null;
		List<ChannelType> channelTypes = thePackage.getChannelTypes();
		for(ChannelType theChannelType:channelTypes) {
			//need to be modify
			if(theChannelType.getName()!=null&&channelType.contains(theChannelType.getName())) {
				ret = theChannelType;
			}
		}
		return ret;
	}
	
	public static Variable getVariable(CDLElement theElement,String variableName) {
		Choreography belongedChoreography = theElement.getBelongedChoreography();
		List<Variable> variables = belongedChoreography.getVariables();
		Variable variable = null;
		for(Variable theVariable:variables) {
			if(theVariable.getName()!=null&&variableName.contains(theVariable.getName())) {
				variable = theVariable;
			}
		}
		return variable;
	}
	
}
