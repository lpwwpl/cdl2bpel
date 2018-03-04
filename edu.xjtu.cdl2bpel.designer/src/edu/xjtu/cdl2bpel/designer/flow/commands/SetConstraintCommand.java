

package edu.xjtu.cdl2bpel.designer.flow.commands;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import edu.xjtu.cdl2bpel.designer.util.ViewSupport;



public class SetConstraintCommand
			extends org.eclipse.gef.commands.Command {

	public void execute() {
		oldSize = new Dimension( ViewSupport.getWidth(part), ViewSupport.getHeight(part) );
		oldPos  = new Point( ViewSupport.getX(part), ViewSupport.getY(part) );
		ViewSupport.setX(part, newPos.x);
		ViewSupport.setY(part, newPos.y);
		ViewSupport.setHeight(part, newSize.height);
		ViewSupport.setWidth(part, newSize.width);
	}
	
	public String getLabel(){
		if (oldSize.equals(newSize))
			return Command_Label_Location;
		return Command_Label_Resize;
	}
	
	public void redo() {
		ViewSupport.setX(part, newPos.x);
		ViewSupport.setY(part, newPos.y);
		ViewSupport.setHeight(part, newSize.height);
		ViewSupport.setWidth(part, newSize.width);
	}
	
	public void setLocation(Rectangle r){
		setLocation(r.getLocation());
		setSize(r.getSize());
	}
	
	public void setLocation(Point p) {
		newPos = p;
	}
	
	public void setPart(Object part) {
		this.part = part;
	}
	
	public void setSize(Dimension p) {
		newSize = p;
	}
	
	public void undo() {
		ViewSupport.setX(part, oldPos.x);
		ViewSupport.setY(part, oldPos.y);
		ViewSupport.setHeight(part, oldSize.height);
		ViewSupport.setWidth(part, oldSize.width);
	}
	
	private static final String Command_Label_Location = "change location command";
	private static final String Command_Label_Resize = "resize command";
	private Point newPos;
	private Dimension newSize;
	private Point oldPos;
	private Dimension oldSize;
	private Object part;
}

