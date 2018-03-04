

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;



public class SimpleGroupFigure extends GroupFigure {

	static final MarginBorder MARGIN_BORDER = new MarginBorder(0, 8, 0, 0);

	static final PointList ARROW = new PointList(3); {
		ARROW.addPoint(0,0);
		ARROW.addPoint(10,0);
		ARROW.addPoint(5,5);
	}

	

	public SimpleGroupFigure(Image image) {
		super(new StartTagFigure("", image),
					new EndTagFigure("", image));
		setBorder(MARGIN_BORDER);
		setOpaque(true);
	}

	protected void paintFigure(Graphics graphics) {//interaction��assign֮��
		super.paintFigure(graphics);
		graphics.setBackgroundColor(ColorConstants.lightBlue);//�����ߵ���ɫ
		Rectangle r = getBounds();
		Point fatherCenter=this.getParent().getBounds().getCenter();
		Point center=r.getCenter();
		r.translate(fatherCenter.x-center.x, 0);
/*
		int padding=5;
		//graphics.drawRectangle(r);
		graphics.drawLine(r.x+padding, r.y+padding,r.x+padding,r.y+r.height-padding);//������
		graphics.drawLine(r.x+r.width-padding, r.y+padding,r.x+r.width-padding,r.y+r.height-padding);//������
		graphics.drawLine(r.x+padding,r.y+padding, r.x+r.width-padding,r.y+padding);//�Ϻ���
		graphics.drawLine(r.x+padding,r.y+r.height-padding, r.x+r.width-padding,r.y+r.height-padding);
		*/
		int radius=20;//Բ���͵�Բ�ǰ뾶
		int padding=5;
		Rectangle inR=new Rectangle(r.x+padding,r.y+padding,r.width-2*padding,r.height-2*padding);
		graphics.drawRoundRectangle(inR, radius, radius);
		
		graphics.fillRectangle(r.x + 17, r.y, 8, r.height);//������
		this.setBounds(r);
	}
}

