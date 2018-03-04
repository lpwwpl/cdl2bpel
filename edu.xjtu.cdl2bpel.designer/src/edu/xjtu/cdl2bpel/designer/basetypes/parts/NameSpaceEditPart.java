
package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.designer.basetypes.policies.TypeComponentEditPolicy;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;


public class NameSpaceEditPart extends AbstractTreeEditPart
					implements Adapter {


    protected NameSpaceEditPart(Namespace namespace) {
    	super(namespace);
    }

    protected void createEditPolicies() {
    	super.createEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new TypeComponentEditPolicy());
    }
    
    public Namespace getNameSpace() {
    	return((Namespace)getModel());
    }
    
	public void notifyChanged(Notification notification) {
		int 	type = notification.getEventType();
		
		switch( type ) {
			case Notification.ADD:
			case Notification.ADD_MANY:
			case Notification.REMOVE:
			case Notification.REMOVE_MANY:
				refreshChildren();
				break;
				
			case Notification.SET:
				refreshVisuals();
				break;
		}
	}


    protected List getModelChildren() {
    	List ret=super.getModelChildren();
    	
    	return(ret);
    }
    
    public String getText() {
    	String ret=getNameSpace().getPrefix();
    	if (ret == null) {
    		ret = "{Namespace}";
    	}
    	return(ret);
    }

    protected Image getImage() {
    	return(ViewSupport.getImage(getModel()));
    }


    public void activate() {
        if (isActive())
            return;


        hookIntoComponent(getNameSpace());

        super.activate();
    }


    public void deactivate() {
        if (!isActive())
            return;

        unhookFromComponent(getNameSpace());

        super.deactivate();
    }
    

    public Notifier getTarget() {
        return target;
    }


    public boolean isAdapterForType(Object type) {
        return type.equals(getModel().getClass());
    }


    public void setTarget(Notifier newTarget) {
        target = newTarget;
    }


    public Object getAdapter(Class key)
    {

        if (IPropertySource.class == key)
        {
            return getPropertySource();
        }
        return super.getAdapter(key);
    }

    protected IPropertySource getPropertySource() {
        if (propertySource == null) {
        	propertySource = ModelSupport.getPropertySource(getNameSpace());
        }
        
        return propertySource;
    }


    protected void hookIntoComponent(Namespace element) {
        if (element != null) {
            element.eAdapters().add(this);
        }
    }


    protected void unhookFromComponent(Namespace element) {
        if (element != null) {
            element.eAdapters().remove(this);
        }
    }
    	
    private IPropertySource propertySource = null;
    private Notifier target;
}

