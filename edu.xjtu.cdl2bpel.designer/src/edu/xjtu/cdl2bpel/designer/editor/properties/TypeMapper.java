

package edu.xjtu.cdl2bpel.designer.editor.properties;

import org.eclipse.ui.views.properties.tabbed.*;
import org.eclipse.gef.*;



public class TypeMapper extends AbstractTypeMapper {

	

	public Class mapType(Object object) {
	    if (object instanceof EditPart) {
	        return ((EditPart) object).getModel().getClass();
	    }
	    
	    return super.mapType(object);
	}
}


