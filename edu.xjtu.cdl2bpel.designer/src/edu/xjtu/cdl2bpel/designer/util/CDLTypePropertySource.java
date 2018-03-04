package edu.xjtu.cdl2bpel.designer.util;

import org.eclipse.emf.ecore.EAttribute;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import edu.xjtu.cdl2bpel.cdl.BindInfo;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.cdl.ChannelType;
import edu.xjtu.cdl2bpel.cdl.Choreography;
import edu.xjtu.cdl2bpel.cdl.ExchangeInfo;
import edu.xjtu.cdl2bpel.cdl.Finalize;
import edu.xjtu.cdl2bpel.cdl.Interaction;
import edu.xjtu.cdl2bpel.cdl.RelationshipType;
import edu.xjtu.cdl2bpel.cdl.util.CDLElementUtil;
import edu.xjtu.cdl2bpel.cdl.util.CDLOtherOp;
import edu.xjtu.cdl2bpel.cdl.xpathResolver.XMLPrefixResolver;
import edu.xjtu.cdl2bpel.common.schema.NameSpaceUtil;
import edu.xjtu.cdl2bpel.common.schema.SchemaManager;
import edu.xjtu.cdl2bpel.xml.util.XMLPrefixNamespaceWithDefaultTNSDeriver;

public class CDLTypePropertySource extends PropertySource {

	public CDLTypePropertySource(CDLElement cdlType) {
		super(cdlType);
	}

	public java.util.List getValues(EReference ref) {
		java.util.List ret = null;
		EClass type = ref.getEReferenceType();

		if (type.equals(CDLPackage.eINSTANCE.getChoreography())) {
			ret = ModelSupport
					.getRelevantChoreographies((CDLElement) getElement());

		} else if (type.equals(CDLPackage.eINSTANCE.getInfoOrChannel())) {
			ret = ModelSupport.getDataTypes((CDLElement) getElement());

		} else if (type.equals(CDLPackage.eINSTANCE.getChannelType())) {
			if (((CDLElement) getElement()).getBelongedPackage() != null) {
				ret = ((CDLElement) getElement()).getBelongedPackage()
						.getChannelTypes();
			}

		} else if (type.equals(CDLPackage.eINSTANCE.getInformationType())) {
			if (((CDLElement) getElement()).getBelongedPackage() != null) {
				ret = ((CDLElement) getElement()).getBelongedPackage()
						.getInformationTypes();
			}

		} else if (type.equals(CDLPackage.eINSTANCE.getToken())) {
			if (((CDLElement) getElement()).getBelongedPackage() != null) {
				ret = ((CDLElement) getElement()).getBelongedPackage()
						.getTokens();
			}

		} else if (type.equals(CDLPackage.eINSTANCE.getRoleType())) {
			if (((CDLElement) getElement()).getBelongedPackage() != null) {
				ret = ((CDLElement) getElement()).getBelongedPackage()
						.getRoleTypes();

			} else if (type
					.equals(CDLPackage.eINSTANCE.getBehaviorOfRoleType())) {
				if (getElement() instanceof ChannelType
						&& ((ChannelType) getElement()).getRoleType() != null) {
					ret = ((ChannelType) getElement()).getRoleType()
							.getBehaviors();
				} else if (getElement() instanceof RelationshipType) {

					if (ref.equals(CDLPackage.eINSTANCE
							.getRelationshipType_BehaviorsOfRoleTypeFirst())
							&& ((RelationshipType) getElement())
									.getRoleTypeOfFirst() != null) {
						ret = ((RelationshipType) getElement())
								.getRoleTypeOfFirst().getBehaviors();
					} else if (((RelationshipType) getElement())
							.getRoleTypeOfSecond() != null) {

						ret = ((RelationshipType) getElement())
								.getRoleTypeOfSecond().getBehaviors();
					}
				}

			} else if (type.equals(CDLPackage.eINSTANCE.getRelationshipType())) {

				if (((CDLElement) getElement()).getBelongedPackage() != null) {
					ret = ((CDLElement) getElement()).getBelongedPackage()
							.getRelationshipTypes();
				}
			} else if (type.equals(CDLPackage.eINSTANCE.getVariable())) {

				if (getElement() instanceof BindInfo) {

					Choreography choreo = (Choreography) ((CDLElement) getElement())
							.getParent().eGet(
									CDLPackage.eINSTANCE
											.getPerform_Choreography());

					if (choreo != null) {
						ret = choreo.getVariables();
					}
				} else if (ref.equals(CDLPackage.eINSTANCE
						.getInteraction_ChannelVariable())) {
					ret = ModelSupport.getVariables((CDLElement) getElement(),
							true);
				} else {
					ret = ((CDLElement) getElement()).getBelongedChoreography()
							.getVariables();
				}

			}
		} else if (type.equals(CDLPackage.eINSTANCE.getFinalizerBlock())) {

			if (getElement() instanceof Finalize) {
				ret = ModelSupport
						.getRelevantFinalizeHandlers((Finalize) getElement());
			}
		} else if (type.equals(CDLPackage.eINSTANCE.getRecordElementInfo())) {
			Interaction interaction = null;

			if (getElement() instanceof Interaction) {
				interaction = (Interaction) getElement();
			} else if (getElement() instanceof ExchangeInfo) {
				interaction = ((ExchangeInfo) getElement())
						.getBelongedInteraction();
			}

			if (interaction != null) {
				ret = interaction.getRecordInfos();
			}
		}

		if (ret == null) {
			ret = new java.util.Vector();
		}

		return (ret);
	}

	protected String getLabel(EStructuralFeature feature) {
		return (super.getLabel(feature));
	}

	protected String getEnumClassName(EEnum enumval) {
		return ("" + enumval.getName());
	}

	public boolean isTextRegion(EAttribute attr) {
		boolean ret = false;

		return (ret);
	}

	public boolean isEditableList(EAttribute attr) {
		boolean ret = (isTypeListAttribute(attr) || isElementListAttribute(attr));

		return (ret);
	}

	protected boolean isTypeListAttribute(EAttribute attr) {
		boolean ret = false;

		if (attr == CDLPackage.eINSTANCE.getInformationType_TypeName()) {
			ret = true;
		}

		return (ret);
	}

	protected boolean isElementListAttribute(EAttribute attr) {
		boolean ret = false;

		if (attr == CDLPackage.eINSTANCE.getInformationType_ElementName()) {
			ret = true;
		}

		return (ret);
	}

	public java.util.List getStringValues(EAttribute attr) {
		java.util.List ret = null;

		if (isTypeListAttribute(attr)) {
			ret = getSchemaManager().getTypeNameList();
		} else if (isElementListAttribute(attr)) {
			ret = getSchemaManager().getElementNameList();
		}

		if (ret == null) {
			ret = new java.util.Vector();
		} else {
			java.util.Vector prefixedList = new java.util.Vector();

			for (int i = 0; i < ret.size(); i++) {
				String fqname = (String) ret.get(i);
				String namespace = NameSpaceUtil.getNamespace(fqname);
				String localpart = NameSpaceUtil.getLocalPart(fqname);

				XMLPrefixNamespaceWithDefaultTNSDeriver resolver = CDLElementUtil
						.getPrefixResolver(((CDLElement) getElement())
								.getBelongedPackage());

				String prefix = resolver.getPrefix(namespace);

				prefixedList.add(prefix + ":" + localpart);
			}

			ret = prefixedList;
		}

		return (ret);
	}

	protected SchemaManager getSchemaManager() {
		SchemaManager ret = m_schemaManager;

		if (ret == null) {
			m_schemaManager = CDLOtherOp
					.getSchemaManager((CDLElement) getElement());
			ret = m_schemaManager;
		}

		return (ret);
	}

	private SchemaManager m_schemaManager = null;
}
