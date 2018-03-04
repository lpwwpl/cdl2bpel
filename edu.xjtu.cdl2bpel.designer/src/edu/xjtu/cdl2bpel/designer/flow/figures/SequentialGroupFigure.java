

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.designer.util.ViewSupport;


//除了choice之外的生命线
public class SequentialGroupFigure extends GroupFigure {

	static final MarginBorder MARGIN_BORDER = new MarginBorder(0, 8, 0, 0);

	static final PointList ARROW = new PointList(3); {
		ARROW.addPoint(0,0);
		ARROW.addPoint(10,0);
		ARROW.addPoint(5,5);
	}

	

	public SequentialGroupFigure(Image image) {
		super(new StartTagFigure("", image),
						new EndTagFigure("", image));
		setBorder(MARGIN_BORDER);
		setOpaque(true);
	}

	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setBackgroundColor(ColorConstants.green);
		Rectangle r = getBounds();
/*
		int padding=5;
		//graphics.drawRectangle(r);
		graphics.drawLine(r.x+padding, r.y+padding,r.x+padding,r.y+r.height-padding);//左竖线
		graphics.drawLine(r.x+r.width-padding, r.y+padding,r.x+r.width-padding,r.y+r.height-padding);//右竖线
		graphics.drawLine(r.x+padding,r.y+padding, r.x+r.width-padding,r.y+padding);//上横线
		graphics.drawLine(r.x+padding,r.y+r.height-padding, r.x+r.width-padding,r.y+r.height-padding);
		*/
		
		int radius=20;//圆巨型的圆角半径
		int padding=5;
		Rectangle inR=new Rectangle(r.x+padding,r.y+padding,r.width-2*padding,r.height-2*padding);
		graphics.drawRoundRectangle(inR, radius, radius);
		
		
		//----graphics.fillRectangle(r.x+padding,r.y+padding,r.x+r.width-padding,r.y+r.height-padding);
		/*graphics.fillRectangle(r.x + 20, r.y, 2, r.height);//画宽度为2 的生命线
		
		graphics.setBackgroundColor(ColorConstants.red);
		
		graphics.fillRectangle(r.x + 75, r.y + ViewSupport.INITIAL_YPADDING, 8, r.height - ViewSupport.INITIAL_YPADDING*2);
		
		
		
		graphics.drawLine(r.x+27, r.y+ViewSupport.COMPONENT_HEIGHT,
				r.x+75, r.y+ViewSupport.INITIAL_YPADDING);
		graphics.drawLine(r.x+27, r.y+r.height-ViewSupport.COMPONENT_HEIGHT,
				r.x+75, r.y+r.height-ViewSupport.INITIAL_YPADDING);*/
		
		graphics.fillRectangle(r.x +r.width/2, r.y + ViewSupport.INITIAL_YPADDING, 8, r.height - ViewSupport.INITIAL_YPADDING*2);
	}
}

