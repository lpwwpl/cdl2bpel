package edu.xjtu.cdl2bpel.designer.util;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import edu.xjtu.cdl2bpel.cdl.Assign;
import edu.xjtu.cdl2bpel.cdl.BehaviorOfRoleType;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLFactory;
import edu.xjtu.cdl2bpel.cdl.CaseConditionalOfSwitch;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choice;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExceptionBlock;
import edu.xjtu.cdl2bpel.cdl.ExceptionWorkUnit;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.OrderingStructuralActivity;
import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.Parallel;
import edu.xjtu.cdl2bpel.cdl.ParticipantType;
import edu.xjtu.cdl2bpel.cdl.Perform;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.RoleType;
import edu.xjtu.cdl2bpel.cdl.Sequence;
import edu.xjtu.cdl2bpel.cdl.Variable;
import edu.xjtu.cdl2bpel.cdl.WhenWithBlockOfWorkUnit;
import edu.xjtu.cdl2bpel.cdl.WhileWithRepeateOfWorkUnit;
import edu.xjtu.cdl2bpel.designer.inference.InferenceManager;
import edu.xjtu.cdl2bpel.designer.model.Container;
import edu.xjtu.cdl2bpel.designer.model.VariableContainer;

public class ModelSupport {

	public static boolean isSet(String text) {
		boolean ret = false;

		if (text != null && text.trim().length() > 0) {
			ret = true;
		}

		return (ret);
	}
	public static boolean isVariableClass(Class cls) {
		boolean ret=false;
		
		if (Variable.class.isAssignableFrom(cls) ||
				Variable.class.isAssignableFrom(cls)) {
			ret = true;
		}
		
		return(ret);
	}

	public static Choreography getRootChoreography(Package cdlpack) {
		Choreography ret = null;

		if (cdlpack != null) {
			for (int i = 0; ret == null
					&& i < cdlpack.getChoreographies().size(); i++) {

				ret = (Choreography) cdlpack.getChoreographies().get(i);

				if (ret.getRoot() != Boolean.TRUE) {
					ret = null;
				}
			}
		}

		return (ret);
	}

	public static boolean isRoleRelationshipComponent(CDLElement cdlType) {
		boolean ret = false;

		if (cdlType instanceof RoleType || cdlType instanceof RelationshipType
				|| cdlType instanceof BehaviorOfRoleType) {
			ret = true;
		}

		return (ret);
	}

	public static java.util.List getActivities(Object component,
			boolean alternate) {

		List ret = null;

		if (alternate == false) {
			if (component instanceof Choreography) {
				ret = ((Choreography) component).getActivities();
			} else if (component instanceof Choice) {
				ret = ((Choice) component).getActivities();
			} else if (component instanceof CaseConditionalOfSwitch) {
				ret = ((CaseConditionalOfSwitch) component).getActivities();
			} else if (component instanceof Parallel) {
				ret = ((Parallel) component).getActivities();
			} else if (component instanceof Sequence) {
				ret = ((Sequence) component).getActivities();
			} else if (component instanceof WhenWithBlockOfWorkUnit) {
				ret = ((WhenWithBlockOfWorkUnit) component).getActivities();
			} else if (component instanceof WhileWithRepeateOfWorkUnit) {
				ret = ((WhileWithRepeateOfWorkUnit) component).getActivities();
			} else if (component instanceof OrderingStructuralActivity) {
				ret = ((OrderingStructuralActivity) component).getActivities();
			}
		} else {
		}

		if (ret == null) {
			ret = new java.util.Vector();
		}

		return (ret);
	}

	public static Object getParent(Object child) {
		Object ret = null;

		if (child instanceof Variable) {
			ret = new VariableContainer(((CDLElement)child).getBelongedChoreography());

		} else if (child instanceof CDLElement) {
			ret = ((CDLElement) child).getParent();

			if (isInvisibleContainer(ret)) {
				ret = ((CDLElement) ret).getParent();
			}
		}

		return (ret);
	}

	public static Object getEnclosingDescription(Object child) {
		Object ret = null;

		if (child instanceof CDLElement) {
			ret = ((CDLElement) child).getBelongedChoreography();
		}

		return (ret);
	}

	public static boolean isValidTarget(Object child, Object parent) {
		boolean ret = false;

		if (getChildList(parent, child.getClass()) != null) {
			ret = true;

		} else {

			Object subord = createInvisibleContainer(parent, child);

			if (subord != null
					&& getChildList(subord, child.getClass()) != null) {
				ret = true;
			}
		}

		return (ret);
	}

	public static void moveChild(Object fromParent, Object toParent,
			Object child) {

		if (child instanceof RoleType) {

			if (fromParent instanceof ParticipantType) {
				((ParticipantType) fromParent).getRoleTypes().remove(child);
			}

			if (toParent instanceof ParticipantType) {
				((ParticipantType) toParent).getRoleTypes().add(
						(RoleType) child);
			}
		} else if (child instanceof BehaviorOfRoleType) {

			if (fromParent instanceof RoleType && toParent instanceof RoleType) {
				((RoleType) fromParent).getBehaviors().remove(child);
				((RoleType) toParent).getBehaviors().add(
						(BehaviorOfRoleType) child);
			}
		}
	}

	public static java.util.List getContents(Object component) {
		java.util.List ret = null;

		if (component instanceof EObject) {
			java.util.List contents = ((EObject) component).eContents();

			ret = new java.util.Vector();

			for (int i = 0; i < contents.size(); i++) {
				Object child = contents.get(i);

				if (child instanceof CDLElement) {
					ret.add(child);
				}
			}
		}

		return (ret);
	}

	public static java.util.List getChildList(Object parent, Class childClass) {
		java.util.List ret = null;

		if (parent instanceof EObject) {
			EObject eparent = (EObject) parent;
			java.util.List general = null;

			java.util.Iterator iter = eparent.eClass()
					.getEAllStructuralFeatures().iterator();

			while (ret == null && iter.hasNext()) {
				EStructuralFeature sf = (EStructuralFeature) iter.next();

				if (sf.isMany()
						&& sf.isChangeable()
						&& sf.getEType().getInstanceClass().isAssignableFrom(
								childClass)) {

					if (isExactTypeMatch(sf.getEType().getInstanceClass(),
							childClass)) {
						ret = (java.util.List) eparent.eGet(sf);
					} else if (general == null) {
						general = (java.util.List) eparent.eGet(sf);
					}
				}
			}

			if (ret == null) {
				ret = general;
			}
		} else if (parent instanceof Container) {
			ret = ((Container) parent).getChildList(childClass);
		}

		return (ret);
	}

	protected static boolean isExactTypeMatch(Class listType, Class childType) {
		boolean ret = false;

		if (listType == childType) {
			ret = true;
		} else if (listType != null && childType != null
				&& listType.isInterface() && childType.isInterface() == false
				&& childType.getInterfaces() != null) {
			for (int i = 0; ret == false
					&& i < childType.getInterfaces().length; i++) {
				if (childType.getInterfaces()[i] == listType) {
					ret = true;
				}
			}
		}

		return (ret);
	}

	public static boolean isContained(Object parent, Class childClass) {
		boolean ret = true;

		if (parent instanceof ParticipantType
				&& RoleType.class.isAssignableFrom(childClass)) {
			ret = false;
		}

		return (ret);
	}

	public static java.util.List getContainmentList(Object parent,
			Class childClass) {
		java.util.List ret = null;

		if (parent instanceof ParticipantType
				&& RoleType.class.isAssignableFrom(childClass)) {
			if (((ParticipantType) parent).getBelongedPackage() != null
			// &&
			// ((ParticipantType)parent).getBelongedPackage().
			// getBaseUnitsDef() != null
			) {
				ret = ((ParticipantType) parent).getBelongedPackage()
						.getRoleTypes();
			}
		}

		return (ret);
	}

	public static Object getInvisibleContainer(Object parent) {
		Object ret = null;

		// if (parent instanceof Package) {
		// ret = ((Package) parent);
		// } else
		if (parent instanceof Choreography) {
			ret = ((Choreography) parent).getExceptionBlock();
		}

		return (ret);
	}

	protected static Object createInvisibleContainer(Object parent, Object child) {
		Object ret = getInvisibleContainer(parent);

		if (ret == null) {

			if (parent instanceof Choreography
					&& child instanceof ExceptionWorkUnit) {

				logger.fine("Creating exception handler for " + "choreo '"
						+ parent + "'");

				ret = CDLFactory.eINSTANCE.createExceptionBlock();
				((Choreography) parent).setExceptionBlock((ExceptionBlock) ret);
			}
		}

		return (ret);
	}

	protected static void removeInvisibleContainerIfEmpty(Object component) {

		if (component instanceof Choreography) {
			Choreography choreo = (Choreography) component;

			if (choreo.getExceptionBlock() != null
					&& choreo.getExceptionBlock().getExceptionWorkUnits()
							.size() == 0) {

				logger.fine("Removing exception handler from " + "choreo '"
						+ choreo + "'");

				choreo.setExceptionBlock(null);
			}
		}
	}

	protected static boolean isInvisibleContainer(Object component) {
		boolean ret = false;

		if (component instanceof ExceptionBlock) {
			ret = true;
		}

		return (ret);
	}

	public static void addChild(Object parent, Object child, int index) {

		if (parent != null && child != null) {
			java.util.List list = getChildList(parent, child.getClass());

			if (list == null) {

				Object subordinate = createInvisibleContainer(parent, child);

				if (subordinate != null) {
					list = getChildList(subordinate, child.getClass());
				}
			}

			if (list != null) {

				if (index == -1 || index > list.size()) {
					list.add(child);
				} else {
					list.add(index, child);
				}

				if (isContained(parent, child.getClass()) == false) {
					list = getContainmentList(parent, child.getClass());

					if (list != null) {
						list.add(child);
					}
				}

				InferenceManager.addition(child);

			} else {
				logger.severe("DON'T KNOW HOW TO ADD: child class=" + child
						+ " to parent=" + parent);
			}
		}
	}

	public static void removeChild(Object parent, Object child) {

		if (parent != null && child != null) {
			java.util.List list = getChildList(parent, child.getClass());
			boolean f_invisibleContainer = false;

			if (list == null) {

				Object subordinate = getInvisibleContainer(parent);

				if (subordinate != null) {
					f_invisibleContainer = true;

					list = getChildList(subordinate, child.getClass());
				}
			}

			if (list != null) {

				InferenceManager.deletion(child);

				list.remove(child);

				if (list.size() == 0 && f_invisibleContainer) {

					removeInvisibleContainerIfEmpty(parent);
				}

				if (isContained(parent, child.getClass()) == false) {
					list = getContainmentList(parent, child.getClass());

					if (list != null) {
						list.remove(child);
					}
				}
			} else {
				logger.severe("DON'T KNOW HOW TO REMOVE: child class=" + child
						+ " to parent=" + parent);
			}
		}
	}

	public static boolean isCompositeComponent(Object component) {
		boolean ret = false;

		if (component instanceof Interaction || component instanceof Assign
				|| component instanceof Perform
				|| component instanceof Finalize
				|| component instanceof RoleType
				|| component instanceof ParticipantType) {
			ret = true;
		}

		return (ret);
	}

	public static java.util.List getRelevantChoreographies(CDLElement cdlType) {
		java.util.List ret = new java.util.Vector();

		Choreography choreo = cdlType.getBelongedChoreography();

		ret.addAll(choreo.getEnclosedChoreographies());

		ret.addAll(choreo.getBelongedPackage().getChoreographies());

		return (ret);
	}

	public static java.util.List getDataTypes(CDLElement cdlType) {
		java.util.List ret = new java.util.Vector();

		if (cdlType != null && cdlType.getBelongedPackage() != null) {
			ret.addAll(cdlType.getBelongedPackage().getChannelTypes());
			ret.addAll(cdlType.getBelongedPackage().getInformationTypes());
		}

		return (ret);
	}

	public static java.util.List getVariables(Object flow,
			boolean channelTypesOnly) {
		java.util.List ret = new java.util.Vector();

		if (flow instanceof CDLElement) {
			CDLElement cdlType = (CDLElement) flow;
			if (cdlType.getBelongedChoreography() != null) {
				if (channelTypesOnly) {
					java.util.Iterator iter = cdlType.getBelongedChoreography()
							.getVariables().iterator();
					while (iter.hasNext()) {
						Variable var = (Variable) iter.next();

						if (var.getType() instanceof ChannelType) {
							ret.add(var);
						}
					}
				} else {
					ret = cdlType.getBelongedChoreography().getVariables();
				}
			}
		}

		return (ret);
	}

	public static java.util.List getRelevantFinalizeHandlers(Finalize fin) {
		java.util.List ret = new java.util.Vector();

		if (fin != null && fin.getChoreography() != null) {
			ret.addAll(fin.getChoreography().getFinalizerBlocks());
		}

		return (ret);
	}

	public static java.util.List getSourceConnections(CDLElement cdlType) {
		java.util.List ret = new java.util.Vector();

		if (cdlType instanceof RoleType && cdlType.getBelongedPackage() != null) {
			java.util.List relTypes = cdlType.getBelongedPackage()
					.getRelationshipTypes();

			for (int i = 0; i < relTypes.size(); i++) {
				RelationshipType rel = (RelationshipType) relTypes.get(i);

				if (rel.getRoleTypeOfFirst() != null
						&& rel.getRoleTypeOfSecond() != null
						&& rel.getRoleTypeOfSecond().eContainer() != null
						&& rel.getRoleTypeOfFirst().eContainer() != null
						&& rel.getRoleTypeOfFirst().equals(cdlType)) {
					ret.add(rel);
				}
			}
		}

		return (ret);
	}

	public static java.util.List getTargetConnections(CDLElement cdlType) {
		java.util.List ret = new java.util.Vector();

		if (cdlType instanceof RoleType && cdlType.getBelongedPackage() != null) {
			java.util.List relTypes = cdlType.getBelongedPackage()
					.getRelationshipTypes();

			for (int i = 0; i < relTypes.size(); i++) {
				RelationshipType rel = (RelationshipType) relTypes.get(i);

				if (rel.getRoleTypeOfSecond() != null
						&& rel.getRoleTypeOfFirst() != null
						&& rel.getRoleTypeOfSecond().eContainer() != null
						&& rel.getRoleTypeOfFirst().eContainer() != null
						&& rel.getRoleTypeOfSecond().equals(cdlType)) {
					ret.add(rel);
				}
			}
		}

		return (ret);
	}

	public static boolean isGroupingConstruct(Object component) {
		boolean ret = false;

		if (component instanceof CDLElement) {
			ret = ((CDLElement) component).isGroupingConstruct();
		} else if (component instanceof OrderingStructuralActivity) {
			ret = true;
		}

		return (ret);
	}

	public static boolean isSequentialGroupingConstruct(Object component) {
		boolean ret = false;

		if (component instanceof CDLElement) {
			ret = ((CDLElement) component).isSequentialGroupingConstruct();
		} else if (component instanceof OrderingStructuralActivity) {
			ret = ((OrderingStructuralActivity) component)
					.isSequentialGroupingConstruct();
		}

		return (ret);
	}

	public static boolean isAlternateSequenceConstruct(Object component) {
		boolean ret = false;

		return (ret);
	}

	public static PropertySource getPropertySource(Object component) {
		PropertySource ret = null;

		if (component instanceof CDLElement) {
			ret = new CDLTypePropertySource((CDLElement) component);
		}

		return (ret);
	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.designer.util");
}
