

package edu.xjtu.cdl2bpel.designer.flow.policies;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import edu.xjtu.cdl2bpel.designer.flow.commands.AddCommand;
import edu.xjtu.cdl2bpel.designer.flow.commands.MoveCommand;
import edu.xjtu.cdl2bpel.designer.flow.commands.SetConstraintCommand;
import edu.xjtu.cdl2bpel.designer.flow.parts.AlternateSequentialGroupEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.BaseTypeEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.SequentialGroupEditPart;
import edu.xjtu.cdl2bpel.designer.model.FlowContainer;
import edu.xjtu.cdl2bpel.designer.util.ModelSupport;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class FlowContainerXYLayoutEditPolicy extends XYLayoutEditPolicy {

	

	protected Command createAddCommand(EditPart child, Object constraint) {
		
		AddCommand ret=null;
		BaseTypeEditPart comppart=null;
		if (child instanceof BaseTypeEditPart) {
			comppart = (BaseTypeEditPart)child;
		}
		if (comppart != null && getHost() instanceof BaseTypeEditPart
				&& ModelSupport.isValidTarget(comppart.getModel(),
						((BaseTypeEditPart)getHost()).getModel())) {
			Object oldParent=ModelSupport.getParent(comppart.getModel());
			
			if (ModelSupport.isAlternateSequenceConstruct(oldParent)) {
				java.util.List list=
					ViewSupport.getFlowAlternateChildren(oldParent);
				if (list.contains(comppart.getModel())) {
					oldParent = new FlowContainer(oldParent);
				}
			}
			
			ret = new AddCommand();
			
			ret.setNewParent(((BaseTypeEditPart)getHost()).getModel());
			ret.setOldParent(oldParent);
			ret.setChild(comppart.getModel());
		}
		
		return(ret);
	}
	
	protected Command getAddCommand(Request request) {
		Command ret=null;
		
		ChangeBoundsRequest req=(ChangeBoundsRequest)request;
		
		BaseTypeEditPart comppart=null;
		if (req.getEditParts().size() == 1 &&
				req.getEditParts().get(0) instanceof BaseTypeEditPart) {
			comppart = (BaseTypeEditPart)req.getEditParts().get(0);
		}
		
		ret = createAddCommand(comppart, null);
		
		if (ret instanceof AddCommand 
				&&
				ModelSupport.isGroupingConstruct(((BaseTypeEditPart)
						getHost()).getModel())
						) {
			int index=0;
			
			FigureCanvas canvas=(FigureCanvas)
					getHost().getViewer().getControl();

			Viewport port = canvas.getViewport();

			if (ModelSupport.isAlternateSequenceConstruct(
					((BaseTypeEditPart)getHost()).getModel())) {
				
				
				int y=port.getClientArea().y + req.getLocation().y -
							ViewSupport.INITIAL_YPADDING
								- ViewSupport.YPADDING;
				
				y -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().y;
		
				int x=port.getClientArea().x + req.getLocation().x -
							ViewSupport.INITIAL_XPADDING;
				x -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().x;

				int width=ViewSupport.getNormalSequenceCalculatedWidth(
							((BaseTypeEditPart)getHost()).getModel());

				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				
				
				
				if (x > width) {				
					list = ViewSupport.getFlowAlternateChildren(((BaseTypeEditPart)getHost()).getModel());
					((AddCommand)ret).setNewParent(new FlowContainer(((AddCommand)ret).getNewParent()));	
				}

				for (int i=0; y > 0 && i < list.size(); i++) {
					index++;
					
					y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
					y -= ViewSupport.YPADDING;
				}

			} else if (ModelSupport.isSequentialGroupingConstruct(
					((BaseTypeEditPart)getHost()).getModel())) {
				
				
				int y=port.getClientArea().y + req.getLocation().y -
							ViewSupport.INITIAL_YPADDING
								- ViewSupport.YPADDING;
				
				y -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().y;
		
				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				for (int i=0; y > 0 && i < list.size(); i++) {
					index++;
					
					y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
					y -= ViewSupport.YPADDING;
				}
			} else {
				
				int x=port.getClientArea().x + req.getLocation().x -
							ViewSupport.INITIAL_XPADDING
								- ViewSupport.XPADDING;
				x -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().x;
		
				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				for (int i=0; x > 0 && i < list.size(); i++) {
					index++;
					
					x -= ViewSupport.getFlowCalculatedWidth(list.get(i));
					x -= ViewSupport.XPADDING;
				}
			}
			
			((AddCommand)ret).setIndex(index);
		}
		
		return(ret);
	}

	

	protected Command createChangeConstraintCommand( EditPart child,
													 Object constraint) {
		SetConstraintCommand locationCommand = new SetConstraintCommand();
		locationCommand.setPart(child.getModel());
		locationCommand.setLocation((Rectangle)constraint);
		return locationCommand;
	}

	

	protected Command getCreateCommand(CreateRequest request) {
		Command	createCommand = null;
		
		return createCommand;
	}

	

	protected Command getDeleteDependantCommand(Request request) {
		return null;
	}

	

	protected EditPolicy createChildEditPolicy(EditPart child) {
		
		

			return super.createChildEditPolicy( child );
		
	}
	
	

	protected Dimension getMinimumSizeFor(GraphicalEditPart child) {
		return child.getContentPane().getMinimumSize();
	}
	
	protected Command getMoveChildrenCommand(Request request) {
		Command ret=null;
	
		ChangeBoundsRequest req=(ChangeBoundsRequest)request;
		
		BaseTypeEditPart comppart=null;
		if (req.getEditParts().size() == 1 &&
				req.getEditParts().get(0) instanceof BaseTypeEditPart) {
			comppart = (BaseTypeEditPart)req.getEditParts().get(0);
		}
		
		
		if (getHost() instanceof BaseTypeEditPart &&
				ModelSupport.isGroupingConstruct(((BaseTypeEditPart)
						getHost()).getModel())) {

			ret = new MoveCommand();
			
			((MoveCommand)ret).setComponent(comppart.getModel());
			((MoveCommand)ret).setContainer(((BaseTypeEditPart)getHost()).getModel());	
		
			if (getHost() instanceof SequentialGroupEditPart) { 
				
				FigureCanvas canvas=(FigureCanvas)
						getHost().getViewer().getControl();
	
				Viewport port = canvas.getViewport();
	
				
				int y=port.getClientArea().y + req.getLocation().y -
							ViewSupport.INITIAL_YPADDING
								- ViewSupport.YPADDING;
				y -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().y;
		
				int index=0;
				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				for (int i=0; y > 0 && i < list.size(); i++) {
					index++;
					
					y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
					y -= ViewSupport.YPADDING;
				}
				
				((MoveCommand)ret).setIndex(index);
				
			} else
			if (getHost() instanceof AlternateSequentialGroupEditPart) { 
					
				FigureCanvas canvas=(FigureCanvas)
						getHost().getViewer().getControl();
	
				Viewport port = canvas.getViewport();
	
				
				int y=port.getClientArea().y + req.getLocation().y -
							ViewSupport.INITIAL_YPADDING
								- ViewSupport.YPADDING;
				y -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().y;
		
				int x=port.getClientArea().x + req.getLocation().x -
							ViewSupport.INITIAL_XPADDING;
				x -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().x;
		
				int width=ViewSupport.getNormalSequenceCalculatedWidth(
						((BaseTypeEditPart)getHost()).getModel());
		
				int index=0;
				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				
				
				
				boolean alternate=false;
				if (x > width) {				
					list = ViewSupport.getFlowAlternateChildren(((BaseTypeEditPart)getHost()).getModel());
					((MoveCommand)ret).setContainer(new FlowContainer(((BaseTypeEditPart)getHost()).getModel()));
					alternate = true;
				}
				
				
				boolean sameList=list.contains(comppart.getModel());

				for (int i=0; y > 0 && i < list.size(); i++) {
					index++;
					
					y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
					y -= ViewSupport.YPADDING;
				}

				if (sameList) {
					((MoveCommand)ret).setIndex(index);
				} else {
					
					AddCommand add=new AddCommand();
					add.setChild(((MoveCommand)ret).getComponent());
					add.setIndex(index);
					
					if (alternate) {
						add.setOldParent(((BaseTypeEditPart)getHost()).getModel());
						add.setNewParent(new FlowContainer(
								((BaseTypeEditPart)getHost()).getModel()));
					} else {
						add.setOldParent(new FlowContainer(
								((BaseTypeEditPart)getHost()).getModel()));
						add.setNewParent(((BaseTypeEditPart)getHost()).getModel());
					}
					
					ret = add;
				}
					
			} else {
				
				FigureCanvas canvas=(FigureCanvas)
						getHost().getViewer().getControl();
	
				Viewport port = canvas.getViewport();
			
				
				int x=port.getClientArea().x + req.getLocation().x -
							ViewSupport.INITIAL_XPADDING
								- ViewSupport.XPADDING;
				x -= ((BaseTypeEditPart)getHost()).getFigure().getBounds().x;
			
				int index=0;
				java.util.List list=ViewSupport.getFlowChildren(((BaseTypeEditPart)getHost()).getModel());
				
				for (int i=0; x > 0 && i < list.size(); i++) {
					index++;
					
					x -= ViewSupport.getFlowCalculatedWidth(list.get(i));
					x -= ViewSupport.XPADDING;
				}
				
				((MoveCommand)ret).setIndex(index);
			}
		}
		
		return(ret);
	}
}

