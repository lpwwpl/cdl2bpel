package edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Correlation;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.RolesRelationMetaDataDeriverImpl;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleArrayManager;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleItem;

public class CorrelationImpl implements Correlation {

	protected static final float RADIO_EDEFAULT = 0.0F;

	protected float radio = RADIO_EDEFAULT;

	protected List<RoleType> roletypes;

	protected static final String NAME_EDEFAULT = null;

	protected String name = NAME_EDEFAULT;

	private List<ParticipantType> participants = null;

	public CorrelationImpl(List<ParticipantType> participants) {
		this.participants = participants;
	}

	public float getRadio() {
		return radio;
	}

	public String getName() {
		return name;
	}

	@Override
	public float caculateRadio(RoleItem roleItem, RoleItem roleItem2) {

		if (isOfTheSameParticipantType(roleItem.getRoleType(), roleItem2
				.getRoleType())) {
			return 1;
		} else {
			for (RelationshipType relationshiptype : ((RolesRelationMetaDataDeriverImpl) RolesRelationMetaDataDeriverImpl
					.getRolesRelationMetaDataDeriverImpl(RoleArrayManager.filePath))
					.getRelationshipType()) {

				String role1 = relationshiptype.getRoleTypeOfFirst().getName();
				String role2 = relationshiptype.getRoleTypeOfSecond().getName();

				if (roleItem.getRoleType().getName().equalsIgnoreCase(role1)
						&& roleItem2.getRoleType().getName().equalsIgnoreCase(
								role2)
						|| roleItem.getRoleType().getName().equalsIgnoreCase(
								role2)
						&& roleItem2.getRoleType().getName().equalsIgnoreCase(
								role1)) {
					radio += caculateRelationRadio(roleItem, roleItem2,
							relationshiptype);
				} else {
					radio += 0;
				}
			}
		}

		return radio;
	}

	public boolean isOfTheSameParticipantType(RoleType roleType1,
			RoleType roleType2) {
		boolean flag = false;
		for (ParticipantType participant : participants) {
			List<RoleType> theRoleTypes = participant.getRoleTypes();
			for (RoleType roleType : theRoleTypes) {
				if (roleType.getName().contains(roleType1.getName())) {
					flag = true;
				}
			}
			if (flag) {
				for (RoleType roleType : theRoleTypes) {
					if (roleType.getName().contains(roleType2.getName())) {
						flag = true;
						break;
					}
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		return flag;
	}

	public float caculateRelationRadio(RoleItem roleItem, RoleItem roleItem2,
			RelationshipType relationshiptype) {
		float f = 0;
		int actcount = 0;
		String key = null;
		Map<String, Integer> map = ((RolesRelationMetaDataDeriverImpl) RolesRelationMetaDataDeriverImpl
				.getRolesRelationMetaDataDeriverImpl(RoleArrayManager.filePath))
				.getRelExchange();
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			key = (String) entry.getKey();
			if (key.equalsIgnoreCase("tns:" + relationshiptype.getName())) {
				actcount += (Integer) entry.getValue();
			}
		}

		f = ((float) actcount) / ((float) getAllExchangeSize());
		return f;
	}

	public int getAllExchangeSize() {

		int sizeall = 0;

		Map<String, Integer> map = ((RolesRelationMetaDataDeriverImpl) RolesRelationMetaDataDeriverImpl
				.getRolesRelationMetaDataDeriverImpl(RoleArrayManager.filePath))
				.getRelExchange();
		Iterator iter = map.entrySet().iterator();

		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			sizeall = sizeall + (Integer) entry.getValue();
		}

		return sizeall;
	}

	@Override
	public void setRoleTypes(RoleItem roleItem, RoleItem roleItem2) {
		if (roletypes == null) {
			roletypes = new ArrayList();
		}
		RoleType role1 = CDLFactory.eINSTANCE.createRoleType();
		role1.setName(roleItem.getRoleType().getName());

		RoleType role2 = CDLFactory.eINSTANCE.createRoleType();
		role2.setName(roleItem2.getRoleType().getName());

		roletypes.add(role1);
		roletypes.add(role2);
	}

	@Override
	public List<RoleType> getRoletypes() {
		return roletypes;
	}

	@Override
	public void setName(String value) {
		name = value;
	}

	@Override
	public void setRadio(float value) {
		radio = value;
	}
}
