package edu.xjtu.cdl2bpel.mapping.view;

import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.Group;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleRelationAlgorithm;



public class CDL2BPELViewContent {

	private RoleRelationAlgorithm rra;
	
	public RoleRelationAlgorithm getRra() {
		return rra;
	}
	public CDL2BPELViewContent(){
		super();
	}
	public CDL2BPELViewContent(String filePath){
		super();
		rra=new RoleRelationAlgorithm(filePath);
	}
	
	public TableViewer createTableViewer(Composite composite,String filePath){
		rra=new RoleRelationAlgorithm(filePath);
		TableViewer tableViewer=new TableViewer(composite, SWT.MULTI| SWT.BORDER | SWT.FULL_SELECTION);
		Table table=tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		FormData formData = new FormData();
		TableLayout layout = new TableLayout();
		table.setLayout(layout);
		TableColumn groupNameColumn = new TableColumn(table, SWT.NONE);
		groupNameColumn.setWidth(80);
		groupNameColumn.setText("分组名");
		TableColumn roleTypesColumn = new TableColumn(table, SWT.NONE);
		roleTypesColumn.setWidth(200);
		roleTypesColumn.setText("分组所包含的角色");
		tableViewer.setContentProvider(new GroupsByRolerelationAlgorithmTabelContentProvider());
		tableViewer.setLabelProvider(new GroupsByRolerelationAlgorithmTabelLabelProvider());
		rra.caculate(filePath);
		java.util.List<Group> l=rra.getGroups();
		tableViewer.setInput(rra.getGroups());
		return tableViewer;
	}
}
