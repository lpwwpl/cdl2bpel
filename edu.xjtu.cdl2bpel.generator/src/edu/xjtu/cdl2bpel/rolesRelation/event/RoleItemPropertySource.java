package edu.xjtu.cdl2bpel.rolesRelation.event;

import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class RoleItemPropertySource implements IPropertySource {
	protected RoleItem roleItem;

	protected static final String PROPERTY_Part = "edu.xjtu.cdl2bpel.properties.participant";
	protected static final String PROPERTY_Role = "edu.xjtu.cdl2bpel.properties.roletype";
	protected static final String PROPERTY_Acti = "edu.xjtu.cdl2bpel.properties.activity";

	private String participant;
	private String roletype;
	private String acti;

	private TextPropertyDescriptor partPropertyDescriptor;
	private TextPropertyDescriptor rolePropertyDescriptor;
	private TextPropertyDescriptor actiPropertyDescriptor;

	public RoleItemPropertySource(RoleItem item) {
		super();
		this.roleItem = item;
		initProperties();
	}

	private void initProperties() {
		participant = roleItem.getParticipant().getName();
		roletype = roleItem.getRoleType().getName();
		acti = Float.toString(roleItem.getActivity());
	}

	public Object getEditableValue() {

		return roleItem;
	}

	public IPropertyDescriptor[] getPropertyDescriptors() {

		partPropertyDescriptor = new TextPropertyDescriptor(PROPERTY_Part,
				"参与者");
		partPropertyDescriptor.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return (String) element;
			}
		});
		partPropertyDescriptor.setCategory("元素信息");

		rolePropertyDescriptor = new TextPropertyDescriptor(PROPERTY_Role, "角色");
		rolePropertyDescriptor.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return (String) element;
			}
		});
		rolePropertyDescriptor.setCategory("元素信息");

		actiPropertyDescriptor = new TextPropertyDescriptor(PROPERTY_Acti,
				"角色活跃度");
		actiPropertyDescriptor.setLabelProvider(new LabelProvider() {
			public String getText(Object element) {
				return (String) element;
			}
		});
		actiPropertyDescriptor.setCategory("元素信息");
		return new IPropertyDescriptor[] { partPropertyDescriptor,
				rolePropertyDescriptor, actiPropertyDescriptor };
	}

	public Object getPropertyValue(Object id) {
		
		if (id.equals(PROPERTY_Part))
			return participant;
		if (id.equals(PROPERTY_Role))
			return roletype;
		if (id.equals(PROPERTY_Acti))
			return acti;
		return null;
	}

	public boolean isPropertySet(Object id) {
		return false;
	}

	public void resetPropertyValue(Object id) {
		
	}

	public void setPropertyValue(Object id, Object value) {
		hookPropertyChanged(id, value);
	}

	public void hookPropertyChanged(Object id, Object newValue) {
		if (id.equals(PROPERTY_Acti)) {
			roleItem.setActivity(Float.parseFloat((String) newValue));
			RoleArrayManager.getManager(RoleArrayManager.filePath).propertyChange(
					new PropertyChangeEvent(this.roleItem, "activity", acti,
							newValue));
		}
	}
}

