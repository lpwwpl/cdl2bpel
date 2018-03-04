

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;



public class SimpleActivityFigure extends Label {

	private Rectangle getSelectionRectangle() {
		Rectangle bounds = getTextBounds();
		bounds.expand(new Insets(2,2,0,0));
		translateToParent(bounds);
		bounds.intersect(getBounds());
		return bounds;
	}

	protected boolean useLocalCoordinates() {
		return(true);
	}
	
	

	protected void paintFigure(Graphics graphics) {
		if (selected) {
			graphics.pushState();
			graphics.setBackgroundColor(ColorConstants.menuBackgroundSelected);
			graphics.fillRectangle(getSelectionRectangle());
			graphics.popState();
			graphics.setForegroundColor(ColorConstants.green);
		}
		if (hasFocus) {
			graphics.pushState();
			graphics.setXORMode(true);
			graphics.setForegroundColor(ColorConstants.menuBackgroundSelected);
			graphics.setBackgroundColor(ColorConstants.green);
			graphics.drawFocus(getSelectionRectangle().resize(-1, -1));
			graphics.popState();
		}
		super.paintFigure(graphics);
	}

	

	public void setSelected(boolean b) {
		selected = b;
		repaint();
	}

	

	public void setFocus(boolean b) {
		hasFocus = b;
		repaint();
	}

	private boolean selected;
	private boolean hasFocus;
}

