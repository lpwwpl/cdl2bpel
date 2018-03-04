package edu.xjtu.cdl2bpel.mapping.view;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleItem;

public class ParticipantAndRoleTypesTreeLabelProvider implements ILabelProvider{

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public String getText(Object element) {
		if(element instanceof ParticipantType) {
			return ((ParticipantType) element).getName();
		} else if(element instanceof RoleItem) {
			return ((RoleItem) element).getRoleType().getName();
		}
		return "";
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		
		
	}

	@Override
	public void dispose() {
		
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		
		
	}
}

