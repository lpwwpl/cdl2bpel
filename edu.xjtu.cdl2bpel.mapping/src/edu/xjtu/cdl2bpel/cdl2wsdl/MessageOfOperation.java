package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

public interface MessageOfOperation {
	public String getName();

	public String getTypeStringValue();

	public String getElementStringValue();

	public void setTypeStringValue(String typeValue);

	public void setElementStringValue(String elementValue);

	public String getFaultNamespace();

	public void setFaultNamespace(String faultNamespace);

	public String getFaultName();

	public void setFaultName(String faultName);

	public String getTypeNamespace();

	public void setTypeNamespace(String typeNamespace);

	public String getElementNamespace();

	public void setElementNamespace(String elementNamespace);

	public List<PartOfMessage> getPartsOfMessage();

	public void setPartsOfMessage(List<PartOfMessage> partsOfMessage);

	public int getClassification();

	public void setClassification(int classification);

	public boolean externEquals(Object obj);

	public static final int INPUT = 0;
	public static final int OUTPUT = 1;
	public static final int INFAULT = 2;
	public static final int OUTFAULT = 3;
}
