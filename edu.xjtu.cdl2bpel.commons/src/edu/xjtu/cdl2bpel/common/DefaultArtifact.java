package edu.xjtu.cdl2bpel.common;

public class DefaultArtifact implements MyArtifact {

	public DefaultArtifact(String path, java.io.InputStream is) {
		m_path = path;
		m_inputStream = is;

		int index = m_path.lastIndexOf('.');
		if (index != -1) {
			m_type = m_path.substring(index + 1);
		}

		index = m_path.lastIndexOf('/');
		if (index != -1) {
			m_name = m_path.substring(index + 1);
		} else {
			m_name = m_path;
		}
	}

	public String getName() {
		return (m_name);
	}

	public String getType() {
		return (m_type);
	}

	public String getPath() {
		return (m_path);
	}

	public java.io.InputStream getInputStream() {
		return (m_inputStream);
	}

	private String m_path = null;
	private String m_name = null;
	private String m_type = null;
	private java.io.InputStream m_inputStream = null;
}
