
package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.designer.util.ViewSupport;


public class AlternateSequentialGroupFigure extends GroupFigure {

	static final MarginBorder MARGIN_BORDER = new MarginBorder(0, 8, 0, 0);

	static final PointList ARROW = new PointList(3); {
		ARROW.addPoint(0,0);
		ARROW.addPoint(10,0);
		ARROW.addPoint(5,5);
	}


	public AlternateSequentialGroupFigure(Image image) {
		super(new StartTagFigure("", image),
						new EndTagFigure("", image));
		setBorder(MARGIN_BORDER);
		setOpaque(true);
	}

	public void setParentComponent(Object component) {
		m_parent = component;
	}
	
	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setBackgroundColor(ColorConstants.buttonDarker);
		Rectangle r = getBounds();


		graphics.fillRectangle(r.x + 20, r.y, 2, r.height);
		
		graphics.setBackgroundColor(ColorConstants.blue);
	graphics.fillRectangle(r.x + 75, r.y + ViewSupport.INITIAL_YPADDING, 8, r.height - ViewSupport.INITIAL_YPADDING*2);
		
		graphics.drawLine(r.x+27, r.y+ViewSupport.COMPONENT_HEIGHT,
				r.x+75, r.y+ViewSupport.INITIAL_YPADDING);
		graphics.drawLine(r.x+27, r.y+r.height-ViewSupport.COMPONENT_HEIGHT,
				r.x+75, r.y+r.height-ViewSupport.INITIAL_YPADDING);
		
		int width=ViewSupport.getNormalSequenceCalculatedWidth(m_parent);
		
		graphics.setBackgroundColor(ColorConstants.red);
		graphics.setForegroundColor(ColorConstants.gray);
		graphics.fillRectangle(r.x+75+width, r.y + ViewSupport.INITIAL_YPADDING, 8, r.height - ViewSupport.INITIAL_YPADDING*2);
		
		graphics.drawLine(r.x+27, r.y+ViewSupport.COMPONENT_HEIGHT,
				r.x+75+width, r.y+ViewSupport.INITIAL_YPADDING);
		graphics.drawLine(r.x+27, r.y+r.height-ViewSupport.COMPONENT_HEIGHT,
				r.x+75+width, r.y+r.height-ViewSupport.INITIAL_YPADDING);
	}

	private Object m_parent=null;
}

