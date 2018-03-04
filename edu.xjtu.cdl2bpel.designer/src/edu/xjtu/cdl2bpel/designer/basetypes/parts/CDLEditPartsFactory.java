
package edu.xjtu.cdl2bpel.designer.basetypes.parts;

import org.eclipse.gef.EditPart;

import org.eclipse.gef.EditPartFactory;

import edu.xjtu.cdl2bpel.cdl.Package;
import edu.xjtu.cdl2bpel.cdl.CDLElement;
import edu.xjtu.cdl2bpel.cdl.Namespace;
import edu.xjtu.cdl2bpel.designer.model.Category;


public class CDLEditPartsFactory implements EditPartFactory {


	public EditPart createEditPart(EditPart context, Object model) {
		EditPart ret=null;		
		
		if(model instanceof Package) {
			ret = new PackageTypesEditPart((Package)model);
		} else if (model instanceof Category) {
			ret = new CategoryEditPart((Category)model);
			

		} else if (model instanceof Namespace) {
			ret = new NameSpaceEditPart((Namespace)model);
			
		} else if (model instanceof CDLElement) {
			ret = new ContainerEditPart((CDLElement)model);
		}
		
		return(ret);
	}
}
