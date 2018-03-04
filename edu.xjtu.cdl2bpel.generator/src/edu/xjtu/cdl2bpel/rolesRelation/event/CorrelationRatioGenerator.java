package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Correlation;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.impl.CorrelationImpl;

public class CorrelationRatioGenerator {

	private List<RoleType> roleItems;
	private List<Correlation> correlations;

	RoleArrayManager rolemanager;

	public CorrelationRatioGenerator(RoleArrayManager rolemanager) {
		this.rolemanager = rolemanager;
		correlations = new ArrayList<Correlation>();
		RoleItem[] roleItemsz = rolemanager.getRoleItems();
		for (int i = 0; i < roleItemsz.length; i++) {
			for (int j = i + 1; j < roleItemsz.length; j++) {

				Correlation correlation = new CorrelationImpl(rolemanager
						.getParticipants());
				correlation.setRoleTypes(roleItemsz[i], roleItemsz[j]);
				correlation.setName(roleItemsz[i].getRoleType().getName()
						+ roleItemsz[j].getRoleType().getName());
				float f = correlation.caculateRadio(roleItemsz[i],
						roleItemsz[j]);
				correlation.setRadio(f);
				correlations.add(correlation);
			}
		}
	}
	
	public float getRatio(RoleItem roleItem, RoleItem roleItem2) {

		float ratio = 0;
		for (int i = 0; i < correlations.size(); i++) {
			Correlation cor = correlations.get(i);
			roleItems = cor.getRoletypes();
			if (roleItems.get(0).getName().equalsIgnoreCase(
					roleItem.getRoleType().getName())
					&& roleItems.get(1).getName().equalsIgnoreCase(
							roleItem2.getRoleType().getName())
					|| roleItems.get(0).getName().equalsIgnoreCase(
							roleItem2.getRoleType().getName())
					&& roleItems.get(1).getName().equalsIgnoreCase(
							roleItem.getRoleType().getName())) {
				ratio = cor.getRadio();
			}
		}
		return ratio;
	}
}

