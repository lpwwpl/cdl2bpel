

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;



public class EndTagFigure extends Label {

	static final Border BORDER = new MarginBorder(2,0,2,2);

	

	public EndTagFigure(String name, Image image) {
		setIconTextGap(8);
		setText(name);
		setIcon(image);
		setBorder(BORDER);
	}

	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		Rectangle r = getTextBounds();

		r.resize(0, -1).expand(1, 1);
		g.drawLine(r.x, r.y, r.right(), r.y); 
		g.drawLine(r.x, r.bottom(), r.right(), r.bottom()); 
		g.drawLine(r.right(), r.bottom(), r.right(), r.y); 

		g.drawLine(r.x-7, r.y + r.height / 2, r.x, r.y);
		g.drawLine(r.x-7, r.y + r.height / 2, r.x, r.bottom());
	}
}

