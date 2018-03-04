package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.EventObject;

public class RoleArrayManagerEvent extends EventObject {

	private static final long serialVersionUID = 3593257924686815924L;

	private final RoleItem[] added;
	private final RoleItem[] removed;
	private final RoleItem[] modified;

	public RoleArrayManagerEvent(RoleArrayManager source, RoleItem[] itemsAdded,
			RoleItem[] itemsRemoved, RoleItem[] itemsModified) {
		super(source);
		added = itemsAdded;
		removed = itemsRemoved;
		modified = itemsModified;
	}

	public RoleItem[] getItemsAdded() {
		return added;
	}

	public RoleItem[] getItemsRemoved() {
		return removed;
	}

	public RoleItem[] getItemsModified() {
		return modified;
	}
}

