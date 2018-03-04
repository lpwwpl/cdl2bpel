package edu.xjtu.cdl2bpel.orchestra.xpath;

public class DefaultXPathVisitor implements XPathVisitor {

	public DefaultXPathVisitor() {
	}

	public void setValidationEnabled(boolean enable) {
		m_validationEnabled = enable;
	}

	public boolean getValidationEnabled() {
		return (m_validationEnabled);
	}

	public void function(String namespace, XPathFunction func,
			Object[] parameters) {

		if (getValidationEnabled()) {

			int params = func.getNumberOfParameters();
			int mandparams = func.getNumberOfMandatoryParameters();

			if ((parameters == null && params > 0)
					|| parameters.length < mandparams
					|| parameters.length > params) {
				throw new XPathException(
						"Wrong number of parameters in function '"
								+ func.getFunctionName() + "'");
			}

		}
	}

	private boolean m_validationEnabled = false;
}
