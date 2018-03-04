package edu.xjtu.cdl2bpel.designer.editor;

import java.util.List;
import java.util.Vector;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

import edu.xjtu.cdl2bpel.cdl.CDLPackage;
import edu.xjtu.cdl2bpel.designer.DesignerImages;
import edu.xjtu.cdl2bpel.designer.util.ModelCreationFactory;

public class ChoreographyPaletteRoot extends PaletteRoot {

	public ChoreographyPaletteRoot() {

		super();

		PaletteGroup controls = new PaletteGroup("Controls");
		add(controls);

		ToolEntry tool = new SelectionToolEntry();
		controls.add(tool);

		setDefaultEntry(tool);

		createTypesPalette(controls);

		createBaseTypesPalette(controls);

		createFlowPalette(controls);
	}

	protected void createTypesPalette(PaletteGroup group) {

		CombinedTemplateCreationEntry entry;

		m_types = new PaletteDrawer("Types");

		entry = new CombinedTemplateCreationEntry("Role", "Creates a Role",
				CDLPackage.eINSTANCE.getRoleType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getRoleType()), DesignerImages
						.getImageDescriptor("RoleType.gif"), null);
		m_types.add(entry);

		entry = new CombinedTemplateCreationEntry("Behavior",
				"Creates a Behavior definition", CDLPackage.eINSTANCE
						.getBehaviorOfRoleType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getBehaviorOfRoleType()),
				DesignerImages.getImageDescriptor("Behavior.gif"), null);
		m_types.add(entry);

		m_types.add(new PaletteSeparator());

		m_types.add(new ConnectionCreationToolEntry("Relationship",
				"Creates a Relationship between two Roles",
				new ModelCreationFactory(CDLPackage.eINSTANCE
						.getRelationshipType()), DesignerImages
						.getImageDescriptor("RelationshipType.gif"), null));

		m_typesList.add(group);
		m_typesList.add(m_types);
	}

	protected void createBaseTypesPalette(PaletteGroup group) {

		m_basetypes = new PaletteDrawer("Base Types");

		CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry(
				"NameSpace", "Creates a NameSpace", CDLPackage.eINSTANCE
						.getNamespace(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getNamespace()), DesignerImages
						.getImageDescriptor("NameSpace.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Participant Type",
				"Creates a Participant Type", CDLPackage.eINSTANCE
						.getParticipantType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getParticipantType()),
				DesignerImages.getImageDescriptor("ParticipantType.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Role Type",
				"Creates a Role Type", CDLPackage.eINSTANCE.getRoleType(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getRoleType()),
				DesignerImages.getImageDescriptor("RoleType.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Relationship Type",
				"Creates a Relationship Type", CDLPackage.eINSTANCE
						.getRelationshipType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getRelationshipType()),
				DesignerImages.getImageDescriptor("RelationshipType.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Information Type",
				"Creates an Information Type", CDLPackage.eINSTANCE
						.getInformationType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getInformationType()),
				DesignerImages.getImageDescriptor("InformationType.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry(
				"Channel Type",
				"Creates a Channel Type",
				CDLPackage.eINSTANCE.getChannelType(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getChannelType()),
				DesignerImages.getImageDescriptor("ChannelType.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Token", "Creates a Token",
				CDLPackage.eINSTANCE.getToken(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getToken()), DesignerImages
						.getImageDescriptor("Token.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Token Locator",
				"Creates a Token Locator", CDLPackage.eINSTANCE
						.getTokenLocator(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getTokenLocator()), DesignerImages
						.getImageDescriptor("TokenLocator.gif"), null);
		m_basetypes.add(entry);

		m_basetypes.add(new PaletteSeparator());

		entry = new CombinedTemplateCreationEntry("Behavior",
				"Creates a Behavior definition", CDLPackage.eINSTANCE
						.getBehaviorOfRoleType(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getBehaviorOfRoleType()),
				DesignerImages.getImageDescriptor("Behavior.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Passing Channel Details",
				"Creates details regarding a Passed Channel",
				CDLPackage.eINSTANCE.getPassingInfoOfTheChannelType(),
				new ModelCreationFactory(CDLPackage.eINSTANCE
						.getPassingInfoOfTheChannelType()), DesignerImages
						.getImageDescriptor("PassingChannelDetails.gif"), null);
		m_basetypes.add(entry);

		entry = new CombinedTemplateCreationEntry("Identity",
				"Creates a channel type's Identity", CDLPackage.eINSTANCE
						.getIdentity(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getIdentity()), DesignerImages
						.getImageDescriptor("Identity.gif"), null);
		m_basetypes.add(entry);

		m_basetypesList.add(group);
		m_basetypesList.add(m_basetypes);
	}

	protected void createFlowPalette(PaletteGroup group) {

		m_grouping = new PaletteDrawer("Grouping Constructs");
		CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry(
				"Choice", "Creates a choice", CDLPackage.eINSTANCE.getChoice(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getChoice()),
				DesignerImages.getImageDescriptor("Choice.gif"), null);
		m_grouping.add(entry);

		entry = new CombinedTemplateCreationEntry("Conditional",
				"Creates a conditional", CDLPackage.eINSTANCE
						.getCaseConditionalOfSwitch(),
				new ModelCreationFactory(CDLPackage.eINSTANCE
						.getCaseConditionalOfSwitch()), DesignerImages
						.getImageDescriptor("Conditional.gif"), null);
		m_grouping.add(entry);

		entry = new CombinedTemplateCreationEntry("Parallel",
				"Creates a parallel", CDLPackage.eINSTANCE.getParallel(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getParallel()),
				DesignerImages.getImageDescriptor("Parallel.gif"), null);
		m_grouping.add(entry);

		entry = new CombinedTemplateCreationEntry("Sequence",
				"Creates a sequence", CDLPackage.eINSTANCE.getSequence(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getSequence()),
				DesignerImages.getImageDescriptor("Sequence.gif"), null);
		m_grouping.add(entry);

		entry = new CombinedTemplateCreationEntry("When", "Creates a when",
				CDLPackage.eINSTANCE.getWhenWithBlockOfWorkUnit(),
				new ModelCreationFactory(CDLPackage.eINSTANCE
						.getWhenWithBlockOfWorkUnit()), DesignerImages
						.getImageDescriptor("When.gif"), null);
		m_grouping.add(entry);

		entry = new CombinedTemplateCreationEntry("While", "Creates a while",
				CDLPackage.eINSTANCE.getWhileWithRepeateOfWorkUnit(),
				new ModelCreationFactory(CDLPackage.eINSTANCE
						.getWhileWithRepeateOfWorkUnit()), DesignerImages
						.getImageDescriptor("While.gif"), null);
		m_grouping.add(entry);

		m_activities = new PaletteDrawer("Activities");

		entry = new CombinedTemplateCreationEntry("Assign",
				"Creates an Assign activity", CDLPackage.eINSTANCE.getAssign(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getAssign()),
				DesignerImages.getImageDescriptor("Assign.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Finalize",
				"Creates a Finalize activity", CDLPackage.eINSTANCE
						.getFinalize(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getFinalize()), DesignerImages
						.getImageDescriptor("Finalize.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Interaction",
				"Creates an Interaction activity", CDLPackage.eINSTANCE
						.getInteraction(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getInteraction()), DesignerImages
						.getImageDescriptor("Interaction.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("No Action",
				"Creates a No Action activity", CDLPackage.eINSTANCE
						.getNoAction(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getNoAction()), DesignerImages
						.getImageDescriptor("NoAction.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Perform",
				"Creates a Perform activity",
				CDLPackage.eINSTANCE.getPerform(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getPerform()), DesignerImages
						.getImageDescriptor("Perform.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Silent Action",
				"Creates a Silent Action activity", CDLPackage.eINSTANCE
						.getSilentAction(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getSilentAction()), DesignerImages
						.getImageDescriptor("SilentAction.gif"), null);
		m_activities.add(entry);

		m_activities.add(new PaletteSeparator());

		entry = new CombinedTemplateCreationEntry("Bind Variable",
				"Creates a Perform Bind component", CDLPackage.eINSTANCE
						.getBindInfo(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getBindInfo()), DesignerImages
						.getImageDescriptor("BindDetails.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Copy",
				"Creates an Assignment Copy component", CDLPackage.eINSTANCE
						.getCopyOfAssign(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getParticipantType()),
				DesignerImages.getImageDescriptor("CopyDetails.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry(
				"Exchange",
				"Creates an Interaction Exchange component",
				CDLPackage.eINSTANCE.getExchangeInfo(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getExchangeInfo()),
				DesignerImages.getImageDescriptor("ExchangeDetails.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Record",
				"Creates an Interaction Record component", CDLPackage.eINSTANCE
						.getRecordElementInfo(), new ModelCreationFactory(
						CDLPackage.eINSTANCE.getRecordElementInfo()),
				DesignerImages.getImageDescriptor("RecordDetails.gif"), null);
		m_activities.add(entry);

		entry = new CombinedTemplateCreationEntry("Variable",
				"Creates a Variable", CDLPackage.eINSTANCE.getVariable(),
				new ModelCreationFactory(CDLPackage.eINSTANCE.getVariable()),
				DesignerImages.getImageDescriptor("Variable.gif"), null);
		m_activities.add(entry);

		m_flowList.add(group);
		m_flowList.add(m_grouping);
		m_flowList.add(m_activities);
	}

	public void setFlowPalette() {
		setChildren(m_flowList);
	}

	public void setTypesPalette() {
		setChildren(m_typesList);
	}

	public void setBaseTypesPalette() {
		setChildren(m_basetypesList);
	}

	private List m_typesList = new Vector();
	private List m_basetypesList = new Vector();
	private List m_flowList = new Vector();

	private PaletteDrawer m_types = null;
	private PaletteDrawer m_basetypes = null;
	private PaletteDrawer m_grouping = null;
	private PaletteDrawer m_activities = null;
}
