package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;

public abstract class BaseTypeEditPart extends AbstractTreeEditPart
						implements Adapter {


    protected BaseTypeEditPart(Object element) {
        setModel(element);   
    }


    protected List getModelChildren() {
    	return(ModelSupport.getContents(getModel()));
    }


    public String getText() {
    	return(ViewSupport.getName(getModel()));
    }
    
    protected Image getImage() {
    	return(ViewSupport.getImage(getModel()));
    }


    public void activate() {
        if (isActive())
            return;

        hookIntoComponent(getModel());

        super.activate();
    }


    public void deactivate() {
        if (!isActive())
            return;

        unhookFromComponent(getModel());

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

    @SuppressWarnings("unchecked")
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
        	propertySource = ModelSupport.getPropertySource(getModel());
        }
        
        return propertySource;
    }


    protected void hookIntoComponent(Object element) {
        if (element instanceof EObject) {
            ((EObject)element).eAdapters().add(this);
        }
    }


    protected void unhookFromComponent(Object element) {
        if (element instanceof EObject) {
            ((EObject)element).eAdapters().remove(this);
        }
    }
    	
    private IPropertySource propertySource = null;
    private Notifier target;
}

