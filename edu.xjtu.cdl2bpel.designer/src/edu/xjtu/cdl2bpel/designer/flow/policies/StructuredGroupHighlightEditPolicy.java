

package edu.xjtu.cdl2bpel.designer.flow.policies;

import org.eclipse.swt.graphics.Color;

import org.eclipse.draw2d.IFigure;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;



public class StructuredGroupHighlightEditPolicy
				extends GraphicalEditPolicy {

	

	public void eraseTargetFeedback(Request request) {
		if (revertColor != null) {
			setContainerBackground(revertColor);
			revertColor = null;
		}
	}

	private Color getContainerBackground() {
		return getContainerFigure().getBackgroundColor();
	}

	private IFigure getContainerFigure() {
		return ((GraphicalEditPart)getHost()).getFigure();
	}

	

	public EditPart getTargetEditPart(Request request) {
		return request.getType().equals(RequestConstants.REQ_SELECTION_HOVER)
			? getHost() : null;
	}

	private void setContainerBackground(Color c) {
		getContainerFigure().setBackgroundColor(c);
	}

	

	protected void showHighlight() {
		if (revertColor == null) {
			revertColor = getContainerBackground();
			setContainerBackground(highLightColor);
		}
	}

	

	public void showTargetFeedback(Request request) {
		if (request.getType().equals(RequestConstants.REQ_CREATE)
			|| request.getType().equals(RequestConstants.REQ_ADD))
			showHighlight();
	}

	private Color revertColor;
	private static Color highLightColor = new Color(null, 200, 200, 240);
}

