

package edu.xjtu.cdl2bpel.designer.flow.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;



public class GroupFigure extends Figure {

	public GroupFigure(IFigure header, IFigure footer) {
		contents = new Figure();
		
		contents.setLayoutManager(new XYLayout());
		add(contents);
		add(this.header = header);
		add(this.footer = footer);
	}

	public IFigure getContents() {
		return contents;
	}

	public IFigure getFooter() {
		return footer;
	}

	public IFigure getHeader() {
		return header;
	}

	

	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension dim = new Dimension();
		dim.width = getFooter().getPreferredSize().width;
		dim.width += getInsets().getWidth();
		dim.height = 50;
		return dim;
	}

	public void setBounds(Rectangle rect) {//设置bound的主要方法,设置上下两个图像的位置
		super.setBounds(rect);
		rect = Rectangle.SINGLETON;
		getClientArea(rect);
		contents.setBounds(rect);
		Dimension size = footer.getPreferredSize();
		Point center=rect.getCenter();
		int leftPadding=60;//上下图像从中间向左的偏移量
		Point footerPoint=new Point(center.x-leftPadding,rect.getBottomLeft().y).translate(0, -size.height);
		//footer.setLocation(rect.getBottomLeft().translate(0, -size.height));
		footer.setLocation(footerPoint);
		footer.setSize(size);
		
		size = header.getPreferredSize();
		header.setSize(size);
		Point headerPoint=new Point(center.x-leftPadding,rect.getLocation().y);
		header.setLocation(headerPoint);
		
		//header.setLocation(rect.getLocation());
	}

	public void setSelected(boolean value) {
	}

	IFigure contents;
	IFigure footer;
	IFigure header;
}

