

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import edu.xjtu.cdl2bpel.designer.util.ViewSupport;


//choice workUnit
public class MultiFlowGroupFigure extends GroupFigure {

	static final MarginBorder MARGIN_BORDER = new MarginBorder(0, 8, 0, 0);

	static final PointList ARROW = new PointList(3); {
		ARROW.addPoint(0,0);
		ARROW.addPoint(10,0);
		ARROW.addPoint(5,5);
	}

	

	public MultiFlowGroupFigure(Image image) {
		super(new StartTagFigure("", image),
						new EndTagFigure("", image));
		setBorder(MARGIN_BORDER);
		setOpaque(true);
	}
	
	public void setParentComponent(Object component) {
		m_parent = component;
	}
	
	public void setChildren(java.util.List children) {
		m_children = children;
	}

	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setBackgroundColor(ColorConstants.buttonDarker);
		Rectangle r = getBounds();

		
		
		//graphics.fillRectangle(r.x + 20, r.y, 2, r.height);//choice的生命线
		
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
		
		for (int i=0; i < m_children.size(); i++) {
			Object child=m_children.get(i);
			/*int xpos=r.x+ViewSupport.getFlowChildXPosition(m_parent,
					child)+ViewSupport.INITIAL_XPADDING-29+4;*/
			int childWidth=ViewSupport.getFlowCalculatedWidth(child);
			int xpos=r.x+ViewSupport.getFlowChildXPosition(m_parent,child)+childWidth/2;
			
			graphics.fillRectangle(xpos, r.y + ViewSupport.INITIAL_YPADDING, 8, r.height - ViewSupport.INITIAL_YPADDING*2);//workUnit的两端
			
			graphics.drawLine(r.getCenter().x, r.y+ViewSupport.COMPONENT_HEIGHT,
					xpos, r.y+ViewSupport.INITIAL_YPADDING);
			graphics.drawLine(r.getCenter().x, r.y+r.height-ViewSupport.COMPONENT_HEIGHT,
					xpos, r.y+r.height-ViewSupport.INITIAL_YPADDING);
		}
	}
	
	private Object m_parent=null;
	private java.util.List m_children=null;
}

