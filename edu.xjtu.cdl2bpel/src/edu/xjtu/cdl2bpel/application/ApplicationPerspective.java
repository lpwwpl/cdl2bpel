package edu.xjtu.cdl2bpel.application;


import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ApplicationPerspective implements IPerspectiveFactory {

	public void defineActions(IPageLayout layout) {
	}
	
	public void createInitialLayout(IPageLayout layout) {

		defineActions(layout);
		
		String editorArea = layout.getEditorArea();
		org.eclipse.ui.IFolderLayout topLeft =
		    layout.createFolder("topLeft",
		            IPageLayout.LEFT, 0.20f,
					editorArea);
		topLeft.addView("edu.xjtu.cdl2bpel.ui.treeViewer");

		org.eclipse.ui.IFolderLayout bottomLeft =
		    layout.createFolder("bottomLeft",
		            IPageLayout.BOTTOM, 0.75f,
					"topLeft");

		bottomLeft.addView(IPageLayout.ID_OUTLINE);

		org.eclipse.ui.IFolderLayout right =
		    layout.createFolder("right",
		            IPageLayout.RIGHT, 0.80f,
					editorArea);
		right.addView("edu.xjtu.cdl2bpel.ui.treeViewer");
		
		org.eclipse.ui.IFolderLayout bottomRight =
		    layout.createFolder("bottomRight",
		            IPageLayout.BOTTOM, 0.75f, editorArea);

		bottomRight.addView(IPageLayout.ID_PROP_SHEET);
	}
}
