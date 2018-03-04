package edu.xjtu.cdl2bpel.designer;

import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.resource.ImageDescriptor;

public class DesignerImages {

	public static Image getImage(String name) {
		Image ret = null;

		getImageDescriptor(name);

		ret = m_registry.get(name);

		return (ret);
	}

	public static ImageDescriptor getImageDescriptor(String name) {
		ImageDescriptor ret = null;

		if ((ret = m_registry.getDescriptor(name)) == null) {
			ret = ImageDescriptor.createFromFile(DesignerImages.class,
					IMAGES_LOCATION + name);

			m_registry.put(name, ret);
		}

		return (ret);
	}

	private static final String IMAGES_LOCATION = "images/";

	private static org.eclipse.jface.resource.ImageRegistry m_registry = new org.eclipse.jface.resource.ImageRegistry();
}
