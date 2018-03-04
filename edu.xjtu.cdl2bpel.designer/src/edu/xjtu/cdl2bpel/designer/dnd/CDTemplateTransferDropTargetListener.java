
package edu.xjtu.cdl2bpel.designer.dnd;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreationFactory;

import edu.xjtu.cdl2bpel.designer.util.ModelCreationFactory;

public class CDTemplateTransferDropTargetListener
			extends TemplateTransferDropTargetListener {


    public CDTemplateTransferDropTargetListener(EditPartViewer viewer) {
        super(viewer);
    }


    protected CreationFactory getFactory(Object template) {
    	CreationFactory ret=null;
    	
        ret = new ModelCreationFactory(template);
    
        return(ret);
    }
}

