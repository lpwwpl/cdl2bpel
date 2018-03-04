package edu.xjtu.cdl2bpel.cdl2wsdl.util;

public interface CDL2WSDLGenerator {
	public void generateWSDL2DestinationFile()
			throws CDL2WSDLGeneratorException;

	public void generateWSDL2ResourceProperties()
			throws CDL2WSDLGeneratorException;
	public String getDirOfCDLGenerateResult(String destination,
			edu.xjtu.cdl2bpel.cdl.Package cdlpack);
}
