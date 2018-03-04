package edu.xjtu.cdl2bpel.orchestra.xpath;

public interface XPathFunction {

	public String getFunctionName();

	public int getNumberOfParameters();

	public String[] getParameterNames();

	public int getNumberOfMandatoryParameters();

	public int[] getParameterTypes();

	public int getReturnType();

	public boolean isRepeatingParameters();

	public Object invoke(Object context, Object[] parameters,
			XMLPrefixResolver pres, XPathEvaluator evaluator)
			throws XPathException;

}
