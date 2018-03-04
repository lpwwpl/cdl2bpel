package edu.xjtu.cdl2bpel.rolesRelation.event;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IMemento;

import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.RolesRelationMetaDataDeriver;
import edu.xjtu.cdl2bpel.rolesRelation.RolesRelation.RolesRelationMetaDataDeriverImpl;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.util.CDLResolver;

public class RoleArrayManager implements IPropertyChangeListener {

	private Collection<RoleItem> roleItems;
	private List<edu.xjtu.cdl2bpel.cdl.ParticipantType> participants;
	private List<edu.xjtu.cdl2bpel.cdl.RoleType> roles;
	private List<RoleArrayManagerListener> listeners = new ArrayList<RoleArrayManagerListener>();
	public static String filePath;
	private static RoleArrayManager manager;

	public static RoleArrayManager getManager(String theFilePath) {
		//if (manager == null) {
			filePath = theFilePath;
			manager = new RoleArrayManager();
		//}
		return manager;
	}

	public static Package getCDLPackage() {
		return CDLResolver.getPackageFromCDLFile(filePath);
	}

	public boolean isExist(RoleItem item) {
		return roleItems.contains(item);
	}

	public RoleItem[] getRoleItems() {
		//if (roleItems == null)
			loadRoleItems(filePath);
		return (RoleItem[]) roleItems.toArray(new RoleItem[roleItems.size()]);
	}

	public List getParticipants() {
		if (participants == null)
			loadRoleItems(filePath);
		return participants;
	}

	public void addRoleItems(RoleItem[] items) {
		if (roleItems == null)
			loadRoleItems(filePath);
		if (roleItems.addAll(Arrays.asList(items))) {
			fireRoleItemsChanged(items, RoleItem.NONE, RoleItem.NONE);
		}
	}

	public void removeRoleItems(RoleItem[] items) {
		if (roleItems == null)
			loadRoleItems(filePath);
		if (roleItems.removeAll(Arrays.asList(items))) {
			fireRoleItemsChanged(RoleItem.NONE, items, RoleItem.NONE);
		}
	}

	private void loadRoleItems(String filePath) {

		roleItems = new ArrayList<RoleItem>();

		RolesRelationMetaDataDeriver rrmdd = RolesRelationMetaDataDeriverImpl
				.getRolesRelationMetaDataDeriverImpl(filePath);
		participants = ((RolesRelationMetaDataDeriverImpl) rrmdd)
				.getParticipantsList();
		roles = ((RolesRelationMetaDataDeriverImpl) rrmdd).getRolesList();

		for (Iterator rolesList_iter = roles.iterator(); rolesList_iter
				.hasNext();) {

			RoleType theRoleType = (RoleType) rolesList_iter.next();
			ParticipantType ret = (ParticipantType) participants.get(0);
			for (Iterator part_iter = participants.iterator(); part_iter
					.hasNext();) {

				ParticipantType tempParticipant = (ParticipantType) part_iter
						.next();
				List<RoleType> PRList = tempParticipant.getRoleTypes();
				for (Iterator iter = PRList.iterator(); iter.hasNext();) {
					if (theRoleType.getName() == ((RoleType) iter.next())
							.getName()) {
						ret = tempParticipant;
						break;
					}
				}
			}

			RoleItem item = new RoleItem(theRoleType, 0.0f);
			roleItems.add(item);
		}
	}

	public void saveRoleItems() {
		if (roleItems == null)
			return;
	}

	public void saveRoleItem(IMemento memento) {
	}

	public void addRoleManagerListener(RoleArrayManagerListener listener) {
		listeners.add(listener);
	}

	public void removeRoleManagerListener(RoleArrayManagerListener listener) {
		listeners.remove(listener);
	}

	private void fireRoleItemsChanged(RoleItem[] itemsAdded,
			RoleItem[] itemsRemoved, RoleItem[] itemsModified) {
		RoleArrayManagerEvent event = new RoleArrayManagerEvent(
				RoleArrayManager.getManager(filePath), itemsAdded,
				itemsRemoved, itemsModified);
		for (Iterator<RoleArrayManagerListener> iter = listeners.iterator(); iter
				.hasNext();) {
			((RoleArrayManagerListener) iter.next()).RoleChanged(event);
		}
	}

	public void propertyChange(PropertyChangeEvent event) {
		fireRoleItemsChanged(RoleItem.NONE, RoleItem.NONE,
				new RoleItem[] { (RoleItem) event.getSource() });
	}
}
