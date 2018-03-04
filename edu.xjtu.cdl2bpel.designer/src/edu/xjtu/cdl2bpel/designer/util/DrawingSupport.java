package edu.xjtu.cdl2bpel.designer.util;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.cdl.Activity;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.TokenLocator;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.commons.util.CheckNOthersUtil;
import edu.xjtu.cdl2bpel.designer.DesignerImages;
import edu.xjtu.cdl2bpel.designer.model.Container;

public class DrawingSupport {

	public static String getName(Object component) {
		String ret = null;

		if (component instanceof CDLElement) {
			CDLElement cdlType = (CDLElement) component;

			ret = cdlType.getName();

			if (CheckNOthersUtil.isSet(ret) == false) {

				ret = cdlType.getDescription();

				if (CheckNOthersUtil.isSet(ret) == false) {

					if (cdlType instanceof TokenLocator) {
						TokenLocator tl = (TokenLocator) cdlType;

						if (tl.getToken() != null) {
							ret = tl.getToken().getName();
						}

						if (tl.getQuery() != null) {
							if (ret == null) {
								ret = "";
							}
							ret += "{" + tl.getQuery() + "}";
						}
					}

					if (ret == null) {
						ret = "{" + cdlType.eClass().getName() + "}";
					}
				}

			} else if (cdlType instanceof Variable) {
				if (((Variable) cdlType).getType() != null) {
					ret += " [" + getName(((Variable) cdlType).getType()) + "]";
				}
			}
		} else if (component != null) {
			ret = component.toString();
		}

		return (ret);
	}

	public static String getNameText(String name) {
		String ret = name;

		if (ModelSupport.isSet(ret) == false) {
			ret = "<unnamed>";
		}

		return (ret);
	}

	public static String getFullDescription(Object component) {
		String ret = null;

		if (component instanceof CDLElement) {
			CDLElement cdlType = (CDLElement) component;

			if (CheckNOthersUtil.isSet(cdlType.getDescription())) {
				ret = cdlType.getDescription();
			}
		}

		return (ret);
	}

	public static Image getImage(Object component) {
		Image ret = DesignerImages.getImage("BaseType.gif");

		if (component instanceof EObject) {
			String imageName = ((EObject) component).eClass().getName();

			try {
				if (component instanceof ExchangeInfo) {
					ExchangeInfo details = (ExchangeInfo) component;
					String text = null;

					if (details.getFaultName() != null) {
						text = "Fault";
					} else {
						text = details.getAction().getName();
					}

					imageName += "_" + text;

				} else if (component instanceof Perform) {
					Perform perform = (Perform) component;

					if (perform.getWaitForCompletion() != Boolean.TRUE) {
						imageName += "_concurrent";
					}

				} else if ((component instanceof Activity) == false) {

					imageName += "_component";
				}

				ret = DesignerImages.getImage(imageName + ".gif");

				if (ret == null) {
					ret = DesignerImages.getImage("BaseType.gif");
				}
			} catch (Exception e) {
				logger.severe("Image for '" + imageName
						+ "' could not be found");
			}
		}

		return (ret);
	}

	public static java.util.List getFlowChildren(Object component) {
		List ret = null;

		if (component instanceof Choreography) {
			ret = ((Choreography) component).getActivities();

		} else if (component instanceof Container) {
			ret = ((Container) component).getChildren();

		} else if (component instanceof CDLElement) {
			ret = ((CDLElement) component).eContents();

		}

		if (ret != null) {
			ret = new java.util.Vector(ret);

			for (int i = ret.size() - 1; i >= 0; i--) {
				if (isViewable(ret.get(i)) == false) {
					ret.remove(i);
				}
			}
		}

		return (ret);
	}

	public static boolean isViewable(Object component) {
		boolean ret = false;

		if (component instanceof CDLElement) {
			ret = true;
		}

		return (ret);
	}

	public static java.util.List getFlowAlternateChildren(Object component) {
		List ret = null;

		if (ret != null) {
			ret = new java.util.Vector(ret);

			for (int i = ret.size() - 1; i >= 0; i--) {
				if (isViewable(ret.get(i)) == false) {
					ret.remove(i);
				}
			}
		}

		return (ret);
	}

	public static java.util.List getTypesChildren(Object cdlType) {
		List ret = null;

		if (cdlType instanceof Package) {
			ret = new java.util.Vector();

			if (((Package) cdlType) != null) {

				ret = ((Package) cdlType).getRoleTypes();

			}

		} else if (cdlType instanceof ParticipantType) {
			ret = ((ParticipantType) cdlType).getRoleTypes();

		} else if (cdlType instanceof RoleType) {
			ret = ((RoleType) cdlType).getBehaviors();
		}

		return (ret);
	}

	public static void setX(Object component, int x) {

	}

	public static void setY(Object component, int y) {

	}

	public static void setWidth(Object component, int width) {

	}

	public static void setHeight(Object component, int height) {

	}

	public static int getX(Object component) {
		int ret = 0;

		return (ret);
	}

	public static int getY(Object component) {
		int ret = 0;

		return (ret);
	}

	public static int getWidth(Object component) {
		int ret = 0;

		return (ret);
	}

	public static int getHeight(Object component) {
		int ret = 0;

		return (ret);
	}

	public static int getFlowChildYPosition(Object parent, Object child) {
		return (getFlowChildYPosition(parent, child, YPADDING));
	}

	public static int getFlowChildYPosition(Object parent, Object child,
			int padding) {
		java.util.List children = getFlowChildren(parent);
		int index = children.indexOf(child);
		int ret = padding + INITIAL_YPADDING;

		if (ModelSupport.isAlternateSequenceConstruct(parent) && index == -1) {
			children = getFlowAlternateChildren(parent);
			index = children.indexOf(child);
		}

		if (index > 0) {

			for (int i = 0; i < index; i++) {
				ret += getFlowCalculatedHeight(children.get(i));
				ret += padding;
			}

		}

		return (ret);
	}

	public static int getTypesChildYPosition(Object parent, Object child) {
		java.util.List children = getTypesChildren(parent);
		int index = children.indexOf(child);
		int ret = TYPES_YPADDING + TYPES_INITIAL_YPADDING;

		for (int i = 0; i < index; i++) {
			ret += getTypesCalculatedHeight(children.get(i));
			ret += TYPES_YPADDING;
		}

		return (ret);
	}

	public static int getTypesComponentYPosition(Object parent, Object component) {
		java.util.List children = getTypesChildren(parent);
		int index = children.indexOf(component);
		int ret = TYPES_INITIAL_YPADDING + (COMPONENT_HEIGHT * index) + 4;

		return (ret);
	}

	public static int getFlowComponentYPosition(Object parent, Object component) {
		java.util.List children = getFlowChildren(parent);
		int index = children.indexOf(component);
		int ret = COMPONENT_HEIGHT * (index + 1);

		return (ret);
	}

	public static int getFlowChildXPosition(Object parent, Object child) {
		int ret = INITIAL_XPADDING;
		java.util.List children = getFlowChildren(parent);

		if (ModelSupport.isAlternateSequenceConstruct(parent) == false) {
			int index = children.indexOf(child);

			if (index > 0) {

				for (int i = 0; i < index; i++) {
					ret += getFlowCalculatedWidth(children.get(i));
					ret += XPADDING;
				}

			}
		} else if (children.contains(child) == false) {
			ret += DrawingSupport.getNormalSequenceCalculatedWidth(parent);
		}

		return (ret);
	}

	public static int getTypesChildXPosition(Object parent, Object child) {
		java.util.List children = getTypesChildren(parent);
		int index = children.indexOf(child);
		int ret = TYPES_XPADDING;

		for (int i = 0; i < index; i++) {
			ret += getTypesCalculatedWidth(children.get(i));
			ret += TYPES_XPADDING;
		}

		return (ret);
	}

	public static int getTypesCalculatedWidth(Object component) {
		int ret = 0;
		java.util.List children = getTypesChildren(component);

		if (children == null || children.size() == 0) {
			ret = BASE_TYPES_WIDTH;

		} else if (component instanceof RoleType) {

			for (int i = 0; i < children.size(); i++) {
				int width = getTypesCalculatedWidth(children.get(i));

				if (width > ret) {
					ret = width;
				}
			}
		} else {
			ret = (TYPES_XPADDING * 2);

			for (int i = 0; i < children.size(); i++) {
				ret += getTypesCalculatedWidth(children.get(i));

				ret += TYPES_XPADDING;
			}
		}

		return (ret);
	}

	public static int getAlternateSequenceCalculatedWidth(Object component) {
		int ret = 0;
		java.util.List children = getFlowAlternateChildren(component);

		for (int i = 0; i < children.size(); i++) {
			int width = getFlowCalculatedWidth(children.get(i));

			if (width > ret) {
				ret = width;
			}
		}

		ret += INITIAL_XPADDING * 2;

		return (ret);
	}

	public static int getNormalSequenceCalculatedWidth(Object component) {
		int ret = 0;
		java.util.List children = getFlowChildren(component);

		for (int i = 0; i < children.size(); i++) {
			int width = getFlowCalculatedWidth(children.get(i));

			if (width > ret) {
				ret = width;
			}
		}

		ret += INITIAL_XPADDING * 2;

		return (ret);
	}

	public static int getFlowCalculatedWidth(Object component) {
		int ret = 0;
		java.util.List children = getFlowChildren(component);

		if (component != null && ModelSupport.isGroupingConstruct(component)) {

			if (children.size() == 0) {

				ret += EMPTY_GROUPING_CONSTRUCT_WIDTH;

				ret += INITIAL_XPADDING * 2;
				ret += INITIAL_XPADDING * 2;
			} else if (ModelSupport.isSequentialGroupingConstruct(component)) {

				ret = getNormalSequenceCalculatedWidth(component);

				if (ModelSupport.isAlternateSequenceConstruct(component)) {
					ret += getAlternateSequenceCalculatedWidth(component);
				}

			} else {

				ret += XPADDING;

				for (int i = 0; i < children.size(); i++) {
					ret += getFlowCalculatedWidth(children.get(i));

					ret += XPADDING;
				}

				ret += INITIAL_XPADDING * 2;
			}

		} else if (component != null && (component instanceof Activity)) {
			ret += BASE_ACTIVITY_WIDTH;

		} else if (component != null && (component instanceof Package)) {
			ret = -1;

		} else {

			if (children.size() == 0) {
				ret = 100;
			} else {
				ret = XPADDING;

				for (int i = 0; i < children.size(); i++) {
					ret += getFlowCalculatedWidth(children.get(i));

					ret += XPADDING;
				}
			}
		}

		return (ret);
	}

	public static int getTypesCalculatedHeight(Object component) {
		int ret = 0;
		java.util.List children = getTypesChildren(component);

		if (children == null || children.size() == 0) {

			if (ModelSupport.isCompositeComponent(component)) {
				ret = TYPES_INITIAL_YPADDING + BASE_TYPES_HEIGHT;
			} else {
				ret = BASE_TYPES_HEIGHT;
			}
		} else if (component instanceof RoleType) {

			ret = TYPES_INITIAL_YPADDING;

			for (int i = 0; i < children.size(); i++) {
				ret += getTypesCalculatedHeight(children.get(i));
			}

		} else {
			boolean composite = false;

			for (int i = 0; i < children.size(); i++) {
				int height = getTypesCalculatedHeight(children.get(i));

				if (height > ret) {
					ret = height;
				}

				if (ModelSupport.isCompositeComponent(children.get(i))) {
					composite = true;
				}
			}

			if (composite) {
				ret += (TYPES_YPADDING * 2);
			} else {
				ret += TYPES_INITIAL_YPADDING;
			}
		}

		return (ret);
	}

	public static int getFlowCalculatedHeight(Object component) {
		return (getFlowCalculatedHeight(component, YPADDING));
	}

	public static int getFlowCalculatedHeight(Object component, int padding) {
		int ret = 0;
		java.util.List children = getFlowChildren(component);

		if (component != null && ModelSupport.isGroupingConstruct(component)) {

			if (children.size() == 0) {

				ret += EMPTY_GROUPING_CONSTRUCT_HEIGHT;

				ret += INITIAL_YPADDING * 2;
			} else if (ModelSupport.isSequentialGroupingConstruct(component)) {
				ret += padding;

				for (int i = 0; i < children.size(); i++) {
					ret += getFlowCalculatedHeight(children.get(i));

					ret += padding;
				}

				if (ModelSupport.isAlternateSequenceConstruct(component)) {
					java.util.List alternates = getFlowAlternateChildren(component);
					int altheight = padding;

					for (int i = 0; i < alternates.size(); i++) {
						altheight += getFlowCalculatedHeight(alternates.get(i));

						altheight += padding;
					}

					if (altheight > ret) {
						ret = altheight;
					}
				}
			} else {

				for (int i = 0; i < children.size(); i++) {
					int height = getFlowCalculatedHeight(children.get(i));

					if (height > ret) {
						ret = height;
					}
				}

				ret += padding;
			}

			ret += INITIAL_YPADDING * 2;

		} else if (component != null
				&& ModelSupport.isCompositeComponent(component)) {
			ret = children.size() * COMPONENT_HEIGHT + (COMPONENT_HEIGHT * 2);

		} else if (component != null && (component instanceof Activity

		|| component instanceof Variable)) {
			ret += BASE_ACTIVITY_HEIGHT;

		} else if (component != null && (component instanceof Package)) {
			ret = -1;

		} else {

			if (children.size() == 0) {
				ret = 100;
			} else {
				ret = INITIAL_YPADDING;

				for (int i = 0; i < children.size(); i++) {
					ret += getFlowCalculatedHeight(children.get(i));

					ret += padding;
				}
			}
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.designer.util");

	public static int COMPONENT_HEIGHT = 24;
	public static int YPADDING = 30;
	public static int TYPES_YPADDING = 30;
	public static int INITIAL_YPADDING = 34;
	public static int TYPES_INITIAL_YPADDING = 26;
	public static int XPADDING = 50;
	public static int TYPES_XPADDING = 10;
	public static int INITIAL_XPADDING = 50;
	public static int BASE_ACTIVITY_HEIGHT = 24;
	public static int BASE_TYPES_HEIGHT = 30;
	public static int EMPTY_GROUPING_CONSTRUCT_HEIGHT = 40;
	public static int BASE_ACTIVITY_WIDTH = 150;
	public static int BASE_TYPES_WIDTH = 140;
	public static int EMPTY_GROUPING_CONSTRUCT_WIDTH = 100;
}
