
package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.InformationType;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Token;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.designer.model.Category;

public class PackageTypesEditPart extends ContainerEditPart {

    protected PackageTypesEditPart(Package cdlpack) {
        super(cdlpack);
    }


    protected void createEditPolicies() {
    	super.createEditPolicies();
    	
		installEditPolicy(EditPolicy.NODE_ROLE, null);
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, null);
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, null);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new RootComponentEditPolicy());    	
    }


    public Package getPackage() {
        return((Package)getModel());
    }

    public void refreshModel() {

		java.util.Iterator iter=getChildren().iterator();
		
		while (iter.hasNext()) {
			Object subobj=iter.next();
			
			if (subobj instanceof CategoryEditPart) {
				((CategoryEditPart)subobj).update();
			}
		}
    }
    

    protected java.util.List getModelChildren() {
    	java.util.List ret=new java.util.Vector();
    	
    	if (getPackage() != null) {
    		ret.add(new Category(NAME_SPACES_CATEGORY,
    					getPackage().getNamespaces(),
						Namespace.class));
    		ret.add(new Category(PARTICIPANT_TYPES_CATEGORY, getPackage().getParticipantTypes(),
					ParticipantType.class));
       		ret.add(new Category(ROLE_TYPES_CATEGORY, getPackage().getRoleTypes(),
					RoleType.class));
    		ret.add(new Category(RELATIONSHIP_TYPES_CATEGORY, getPackage().getRelationshipTypes(),
					RelationshipType.class));
    		ret.add(new Category(CHANNEL_TYPES_CATEGORY, getPackage().getChannelTypes(),
					ChannelType.class));
    		ret.add(new Category(INFORMATION_TYPES_CATEGORY, getPackage().getInformationTypes(),
					InformationType.class));
    		ret.add(new Category(TOKENS_CATEGORY, getPackage().getTokens(),
					Token.class));
    		ret.add(new Category(TOKEN_LOCATORS_CATEGORY, getPackage().getTokenLocators(),
					TokenLocator.class));
    	}
    	
    	return(ret);
    }


    protected void hookIntoComponent(Object element) {
    	super.hookIntoComponent(element);
    	
        if (getPackage() != null) {
        	getPackage().eAdapters().add(this);
        }
    }


    protected void unhookFromComponent(Object element) {
    	super.unhookFromComponent(element);
    	
        if (getPackage() != null) {
        	getPackage().eAdapters().remove(this);
        }
    }
    
	public void notifyChanged(Notification notification) {
		int type = notification.getEventType();
		Object obj=null;
		CategoryEditPart cat=null;
		
		switch( type ) {
			case Notification.ADD:
			case Notification.ADD_MANY:
				

				obj = notification.getNewValue();

				cat = findCategory(obj);

				if (cat != null) {
					cat.update();
				}
				break;
				
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:

				obj = notification.getOldValue();

				cat = findCategory(obj);

				if (cat != null) {
					cat.update();
				}
				break;
				
			case Notification.SET:
				refreshVisuals();
				break;
		}
	}


	protected CategoryEditPart findCategory(Object obj) {
		CategoryEditPart ret=null;
		
		java.util.Iterator iter=getChildren().iterator();
		
		while (ret == null && iter.hasNext()) {
			Object subobj=iter.next();
			
			if (subobj instanceof CategoryEditPart) {
				Category cat=((CategoryEditPart)subobj).getCategory();
				
				if (cat.isCategoryFor(obj)) {
					ret = (CategoryEditPart)subobj;
				}
			}
		}
		
		return(ret);
	}
	
    private static final String TOKEN_LOCATORS_CATEGORY = "Token Locators";
	private static final String TOKENS_CATEGORY = "Tokens";
	private static final String INFORMATION_TYPES_CATEGORY = "Information Types";
	private static final String CHANNEL_TYPES_CATEGORY = "Channel Types";
	private static final String RELATIONSHIP_TYPES_CATEGORY = "Relationship Types";
	private static final String ROLE_TYPES_CATEGORY = "Role Types";
	private static final String PARTICIPANT_TYPES_CATEGORY = "Participant Types";
	private static final String NAME_SPACES_CATEGORY = "Name Spaces";
}

