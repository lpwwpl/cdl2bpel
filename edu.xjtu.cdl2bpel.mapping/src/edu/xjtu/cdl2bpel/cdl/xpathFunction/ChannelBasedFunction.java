package edu.xjtu.cdl2bpel.cdl.xpathFunction;

class ChannelBasedFunction extends DefaultXPathFunction {

	public ChannelBasedFunction(String funcName, int numParams,
			int numMandatoryParams, boolean repeatingParams,
			int[] paramTypes, String[] paramNames,
			int returnType) {
		
		super(funcName, numParams, numMandatoryParams,
				repeatingParams, paramTypes,
				paramNames, returnType);
	}
}
