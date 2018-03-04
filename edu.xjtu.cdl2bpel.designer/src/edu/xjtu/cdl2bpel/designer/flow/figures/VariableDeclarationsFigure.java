

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class VariableDeclarationsFigure extends Figure {

	static final MarginBorder MARGIN_BORDER = new MarginBorder(0, 8, 0, 0);

	static final PointList ARROW = new PointList(3); {
		ARROW.addPoint(0,0);
		ARROW.addPoint(10,0);
		ARROW.addPoint(5,5);
	}

	

	public VariableDeclarationsFigure() {
		header = new Label("State");
		header.setForegroundColor(ColorConstants.gray);
		contents = new Figure();
		contents.setLayoutManager(new XYLayout());
		add(contents);
		add(header);

		setBorder(MARGIN_BORDER);
		setOpaque(true);
	}

	protected void paintFigure(Graphics graphics) {
		super.paintFigure(graphics);
		graphics.setBackgroundColor(ColorConstants.buttonDarker);
		Rectangle r = getBounds().getCopy();
		
		r.y += ViewSupport.TYPES_INITIAL_YPADDING;
		r.height -= (1 + ViewSupport.TYPES_INITIAL_YPADDING);
		r.width -= 1;

		graphics.setForegroundColor(ColorConstants.gray);
		graphics.drawRoundRectangle(r, 5, 5);
	}

	public IFigure getContents() {
		return contents;
	}

	public IFigure getHeader() {
		return header;
	}

	

	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension dim = new Dimension();
		
		dim.width += getInsets().getWidth();
		dim.height = 50;
		return dim;
	}

	public void setBounds(Rectangle rect) {
		super.setBounds(rect);
		rect = Rectangle.SINGLETON;
		getClientArea(rect);
		contents.setBounds(rect);
		
		
		
		
		Dimension size = header.getPreferredSize();
		header.setSize(size);
		header.setLocation(rect.getLocation());
	}

	public void setSelected(boolean value) {
	}

	IFigure contents;
	IFigure header;
}

