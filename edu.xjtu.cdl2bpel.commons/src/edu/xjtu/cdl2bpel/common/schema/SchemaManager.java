package edu.xjtu.cdl2bpel.common.schema;

public interface SchemaManager {

	public String registerSchema(String url) throws SchemaException;

	public boolean isValidType(String namespace, String localpart);

	public boolean isValidElement(String namespace, String localpart);

	public java.util.List getTypeNameList();

	public java.util.List getElementNameList();

}
