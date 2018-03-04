package edu.xjtu.cdl2bpel.mapping.view;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class GroupsByRolerelationAlgorithmTabelContentProvider implements
		IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List<?>) inputElement).toArray();
		}

		return new Object[0];
	}

	@Override
	public void dispose() {
		

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		

	}

}

