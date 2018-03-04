package edu.xjtu.cdl2bpel.designer.editor;

import org.eclipse.draw2d.ScalableFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.ZoomListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.util.ListenerList;

public class DelegatingZoomManager extends ZoomManager implements ZoomListener {

	public DelegatingZoomManager() {
		super((ScalableFigure) null, (Viewport) null);
	}

	public void zoomChanged(double zoom) {
		Object[] listeners = m_zoomListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((ZoomListener) listeners[i]).zoomChanged(zoom);
		}
	}

	public void addZoomListener(ZoomListener listener) {
		m_zoomListeners.add(listener);
	}

	public void removeZoomListener(ZoomListener listener) {
		m_zoomListeners.remove(listener);
	}

	public void setCurrentZoomManager(ZoomManager zoomManager) {
		if (null != m_currentZoomManager)
			m_currentZoomManager.removeZoomListener(this);

		m_currentZoomManager = zoomManager;
		if (null != m_currentZoomManager) {
			m_currentZoomManager.addZoomListener(this);
			zoomChanged(m_currentZoomManager.getZoom());
		}
	}

	public boolean canZoomIn() {
		if (null == m_currentZoomManager)
			return false;

		return m_currentZoomManager.canZoomIn();
	}

	public boolean canZoomOut() {
		if (null == m_currentZoomManager)
			return false;

		return m_currentZoomManager.canZoomOut();
	}

	public double getMaxZoom() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getMaxZoom();
	}

	public double getMinZoom() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getMinZoom();
	}

	public double getNextZoomLevel() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getNextZoomLevel();
	}

	public double getPreviousZoomLevel() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getPreviousZoomLevel();
	}

	public ScalableFigure getScalableFigure() {
		if (null == m_currentZoomManager)
			return null;

		return m_currentZoomManager.getScalableFigure();
	}

	public double getUIMultiplier() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getUIMultiplier();
	}

	public Viewport getViewport() {
		if (null == m_currentZoomManager)
			return null;

		return m_currentZoomManager.getViewport();
	}

	public double getZoom() {
		if (null == m_currentZoomManager)
			return 1;

		return m_currentZoomManager.getZoom();
	}

	public String getZoomAsText() {
		if (null == m_currentZoomManager)
			return " 100%";

		return m_currentZoomManager.getZoomAsText();
	}

	public double[] getZoomLevels() {
		if (null == m_currentZoomManager)
			return new double[] { 1 };

		return m_currentZoomManager.getZoomLevels();
	}

	public String[] getZoomLevelsAsText() {
		if (null == m_currentZoomManager)
			return new String[] { " 100%" };

		return m_currentZoomManager.getZoomLevelsAsText();
	}

	public void setUIMultiplier(double multiplier) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setUIMultiplier(multiplier);
	}

	public void setViewLocation(Point p) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setViewLocation(p);
	}

	public void setZoom(double zoom) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setZoom(zoom);
	}

	public void setZoomAnimationStyle(int style) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setZoomAnimationStyle(style);
	}

	public void setZoomAsText(String zoomString) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setZoomAsText(zoomString);
	}

	public void setZoomLevels(double[] zoomLevels) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.setZoomLevels(zoomLevels);
	}

	public void zoomIn() {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.zoomIn();
	}

	public void zoomOut() {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.zoomOut();
	}

	public void zoomTo(Rectangle rect) {
		if (null == m_currentZoomManager)
			return;

		m_currentZoomManager.zoomTo(rect);
	}

	private ZoomManager m_currentZoomManager;
	private ListenerList m_zoomListeners = new ListenerList(3);
}
