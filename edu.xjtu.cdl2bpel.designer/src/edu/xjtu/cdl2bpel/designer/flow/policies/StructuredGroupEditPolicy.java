package edu.xjtu.cdl2bpel.designer.flow.policies;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.Viewport;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import edu.xjtu.cdl2bpel.designer.flow.commands.CreateFlowComponentCommand;
import edu.xjtu.cdl2bpel.designer.flow.parts.AlternateSequentialGroupEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.MultiFlowGroupEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.SequentialGroupEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.SimpleGroupEditPart;
import edu.xjtu.cdl2bpel.designer.flow.parts.VariableDeclarationsEditPart;
import edu.xjtu.cdl2bpel.designer.model.FlowContainer;
import edu.xjtu.cdl2bpel.designer.util.ViewSupport;

public class StructuredGroupEditPolicy extends ContainerEditPolicy {

	protected Command getCreateCommand(CreateRequest request) {
		CreateFlowComponentCommand ret = null;
		if (getHost() instanceof SequentialGroupEditPart) {
			SequentialGroupEditPart part = (SequentialGroupEditPart) getHost();

			ret = new CreateFlowComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());

			FigureCanvas canvas = (FigureCanvas) getHost().getViewer()
					.getControl();

			Viewport port = canvas.getViewport();

			int y = port.getClientArea().y + request.getLocation().y
					- ViewSupport.INITIAL_YPADDING - ViewSupport.YPADDING;
			y -= part.getFigure().getBounds().y;

			int index = 0;
			java.util.List list = ViewSupport.getFlowChildren(part.getModel());

			for (int i = 0; y > 0 && i < list.size(); i++) {
				index++;

				y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
				y -= ViewSupport.YPADDING;
			}

			ret.setIndex(index);

		} else if (getHost() instanceof AlternateSequentialGroupEditPart) {
			AlternateSequentialGroupEditPart part = (AlternateSequentialGroupEditPart) getHost();

			ret = new CreateFlowComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());

			FigureCanvas canvas = (FigureCanvas) getHost().getViewer()
					.getControl();

			Viewport port = canvas.getViewport();

			int y = port.getClientArea().y + request.getLocation().y
					- ViewSupport.INITIAL_YPADDING - ViewSupport.YPADDING;
			y -= part.getFigure().getBounds().y;

			int x = port.getClientArea().x + request.getLocation().x
					- ViewSupport.INITIAL_XPADDING;
			x -= part.getFigure().getBounds().x;

			int width = ViewSupport.getNormalSequenceCalculatedWidth(part
					.getModel());

			java.util.List list = ViewSupport.getFlowChildren(part.getModel());

			if (x > width) {
				list = ViewSupport.getFlowAlternateChildren(part.getModel());
				ret.setParent(new FlowContainer(part.getModel()));
			}

			int index = 0;

			for (int i = 0; y > 0 && i < list.size(); i++) {
				index++;

				y -= ViewSupport.getFlowCalculatedHeight(list.get(i));
				y -= ViewSupport.YPADDING;
			}

			ret.setIndex(index);

		} else if (getHost() instanceof SimpleGroupEditPart) {
			SimpleGroupEditPart part = (SimpleGroupEditPart) getHost();

			ret = new CreateFlowComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());

			ret.setIndex(-1);

		} else if (getHost() instanceof VariableDeclarationsEditPart) {
			VariableDeclarationsEditPart part = (VariableDeclarationsEditPart) getHost();

			ret = new CreateFlowComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());

			ret.setIndex(-1);

		} else if (getHost() instanceof MultiFlowGroupEditPart) {

			MultiFlowGroupEditPart part = (MultiFlowGroupEditPart) getHost();

			ret = new CreateFlowComponentCommand();
			ret.setChild(request.getNewObject());
			ret.setParent(part.getModel());

			FigureCanvas canvas = (FigureCanvas) getHost().getViewer()
					.getControl();

			Viewport port = canvas.getViewport();

			// Calculate the index position
			int x = port.getClientArea().x + request.getLocation().x
					- ViewSupport.INITIAL_XPADDING - ViewSupport.XPADDING;
			x -= part.getFigure().getBounds().x;

			int index = 0;
			java.util.List list = ViewSupport.getFlowChildren(part.getModel());

			for (int i = 0; x > 0 && i < list.size(); i++) {
				index++;

				x -= ViewSupport.getFlowCalculatedWidth(list.get(i));
				x -= ViewSupport.XPADDING;
			}

			ret.setIndex(index);
		}

		return (ret);
	}
}
