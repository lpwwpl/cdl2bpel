package edu.xjtu.cdl2bpel.designer.flow.parts;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;

public abstract class BaseTypeEditPart extends AbstractGraphicalEditPart
		implements Adapter {

	protected BaseTypeEditPart(Object element) {
		setModel(element);
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

	protected void refreshVisuals() {
		Rectangle r = getEditPartBounds();

		if (getParent() != null) {
			((GraphicalEditPart) getParent()).setLayoutConstraint(this,
					getFigure(), r);
		}

	}

	public int getWidth() {
		return (-1);
	}

	public int getHeight() {
		return (-1);
	}

	public int getXOffset() {
		return (0);
	}

	public int getX() {
		int ret = 20;

		if (getParent() instanceof BaseTypeEditPart) {
			ret = ((BaseTypeEditPart) getParent()).getChildX(this);
		}

		ret += getXOffset();

		return (ret);
	}

	public int getY() {
		int ret = 20;

		if (getParent() instanceof BaseTypeEditPart) {
			ret = ((BaseTypeEditPart) getParent()).getChildY(this);
		}

		return (ret);
	}

	public int getChildX(BaseTypeEditPart child) {
		return (20);
	}

	public int getChildY(BaseTypeEditPart child) {
		return (20);
	}

	public Object getAdapter(Class key) {

		if (IPropertySource.class == key) {
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

	public void notifyChanged(Notification notification) {
		int type = notification.getEventType();

		switch (type) {
		case Notification.ADD:
		case Notification.ADD_MANY:
		case Notification.REMOVE:
		case Notification.REMOVE_MANY:

			try {
				refreshChildren();
			} catch (Exception e) {

			}

			refreshVisuals();

			int pos = notification.getPosition();

			if (pos != -1) {

				if (!ModelSupport.isGroupingConstruct(getModel())
						|| !ModelSupport.isGroupingConstruct(getModel())) {
					pos = 0;
				}
				for (int i = pos; i < getChildren().size(); i++) {

					BaseTypeEditPart ep = (BaseTypeEditPart) getChildren().get(
							i);
					ep.refreshVisuals();
				}
			}

			BaseTypeEditPart cur = this;
			BaseTypeEditPart prev = null;

			while (cur.getParent() instanceof BaseTypeEditPart) {
				prev = cur;
				cur = (BaseTypeEditPart) cur.getParent();
				cur.refreshVisuals();
				cur.refreshChildren();

				int index = cur.getChildren().indexOf(prev);
				if (index != -1) {
					if (ModelSupport.isGroupingConstruct(cur.getModel())
							&& !ModelSupport
									.isGroupingConstruct(cur.getModel())) {
						index = -1;
					}

					for (int i = index + 1; i < cur.getChildren().size(); i++) {

						BaseTypeEditPart ep = (BaseTypeEditPart) cur
								.getChildren().get(i);
						ep.refreshVisuals();
					}
				}
			}

			break;

		case Notification.SET:
			refreshVisuals();
			break;
		}
	}

	protected void hookIntoComponent(Object element) {
		if (element instanceof EObject) {
			((EObject) element).eAdapters().add(this);
		}
	}

	protected void unhookFromComponent(Object element) {
		if (element instanceof EObject) {
			((EObject) element).eAdapters().remove(this);
		}
	}

	public Rectangle getEditPartBounds() {
		Rectangle ret = new Rectangle(getX(), getY(), getWidth(), getHeight());

		return (ret);
	}

	public Rectangle getBounds() {
		return (getEditPartBounds());
	}

	private IPropertySource propertySource = null;
	private Notifier target;
}
