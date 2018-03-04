package edu.xjtu.cdl2bpel.mapping.view;

import java.util.List;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;

public class GroupsByRolerelationAlgorithmTabelLabelProvider implements ITableLabelProvider{

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		Group group = (Group)element;
		String column0 = group.getName();
		String column1 = getRoleTypesString(group.getRoleType());
		if(columnIndex == 0) {
			return column0;
		} 
		if(columnIndex == 1) {
			return column1;
		}
		return null;
	}

	public String getRoleTypesString(List<RoleType> roleTypes) {
		String ret = "";
		for(RoleType roleType:roleTypes) {
			ret+=roleType.getName()+";";
		}
		ret = ret.substring(0,ret.length()-1);
		return ret;
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

