

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;



public class StartTagFigure extends Label {


	static final Border BORDER = new MarginBorder(2,0,2,9);

	

	public StartTagFigure(String name, Image image) {
		setIconTextGap(4);
		setText(name);
		setIcon(image);
		setBorder(new MarginBorder(2,0,2,9));
	}

	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		Rectangle r = getTextBounds();

		r.resize(-1, -1);
		r.expand(1, 1);
		r.width -= 1;
		r.x -= 2;
		g.drawLine(r.x, r.y, r.right(), r.y); 
		g.drawLine(r.x, r.bottom(), r.right(), r.bottom()); 
		g.drawLine(r.x, r.bottom(), r.x, r.y); 

		g.drawLine(r.right() + 7, r.y + r.height / 2, r.right(), r.y);
		g.drawLine(r.right()+7, r.y + r.height / 2, r.right(), r.bottom());
	}
}

