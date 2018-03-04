package edu.xjtu.cdl2bpel.mapping.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleArrayManager;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleArrayManagerEvent;
import edu.xjtu.cdl2bpel.rolesRelation.event.RoleArrayManagerListener;

public class ParticipantAndRoleTypesTreeContentProvider implements IStructuredContentProvider, ITreeContentProvider,RoleArrayManagerListener{

	private Map map;
	private TreeViewer viewer;
	
	public ParticipantAndRoleTypesTreeContentProvider(Map map) {
		super();
		this.map = map;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof Map) {
			return ((HashMap) inputElement).keySet().toArray();
		}
		
		if(inputElement instanceof ParticipantType) {
			return ((List)map.get(inputElement)).toArray();
		}
		
		return new Object[0];
	}

	@Override
	public void dispose() {
		
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer) viewer;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Map) {
			return ((HashMap) parentElement).keySet().toArray();
		}
		if(parentElement instanceof ParticipantType) {
			return ((List)map.get(parentElement)).toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof Map) {
			return !((Map)element).keySet().isEmpty();
		}
		if(element instanceof ParticipantType) {
			return !((List)map.get(element)).isEmpty();
		}
		return false;
	}

	@Override
	public void RoleChanged(RoleArrayManagerEvent event) {
		viewer.getTree().setRedraw(false);
		try{
			viewer.remove(event.getItemsRemoved());
			viewer.update(event.getItemsModified(),null);
		} finally{
			viewer.getTree().setRedraw(true);
		}
	}
}

