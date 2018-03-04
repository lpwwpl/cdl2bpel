package edu.xjtu.cdl2bpel.cdl2wsdl;

import java.util.List;

public class MessageOfOperationImpl extends WSDLElement implements
		MessageOfOperation {

	@Override
	public String getName() {
		return messangeName;
	}

	public String getTypeStringValue() {
		return (type);
	}

	public String getElementStringValue() {
		return (element);
	}

	public void setTypeStringValue(String typeValue) {
		this.type = typeValue;
	}

	public void setElementStringValue(String elementValue) {
		this.element = elementValue;
	}

	public MessageOfOperationImpl(String name, String faultNamespace,
			String faultName, String typeNamespace, String type,
			String elemNamespace, String element, List<PartOfMessage> parts,
			int classification) {
		this.messangeName = name;
		this.faultNamespace = faultNamespace;
		this.faultName = faultName;
		this.typeNamespace = typeNamespace;
		this.type = type;
		this.elementNamespace = elemNamespace;
		this.element = element;
		this.partsOfMessage = parts;
		this.classification = classification;
	}

	public String getFaultNamespace() {
		return faultNamespace;
	}

	public void setFaultNamespace(String faultNamespace) {
		this.faultNamespace = faultNamespace;
	}

	public String getFaultName() {
		return faultName;
	}

	public void setFaultName(String faultName) {
		this.faultName = faultName;
	}

	private String messangeName = null;
	private String faultName = null;
	private String faultNamespace = null;
	private String typeNamespace = null;

	public String getTypeNamespace() {
		return typeNamespace;
	}

	public void setTypeNamespace(String typeNamespace) {
		this.typeNamespace = typeNamespace;
	}

	public String getElementNamespace() {
		return elementNamespace;
	}

	public void setElementNamespace(String elementNamespace) {
		this.elementNamespace = elementNamespace;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	private String type = null;
	private String elementNamespace = null;
	private String element = null;
	private List<PartOfMessage> partsOfMessage = null;
	private int classification = INPUT;

	@Override
	public List<PartOfMessage> getPartsOfMessage() {
		return partsOfMessage;
	}

	@Override
	public void setPartsOfMessage(List<PartOfMessage> partsOfMessage) {
		this.partsOfMessage = partsOfMessage;
	}

	public boolean externEquals(Object obj) {
		boolean ret = false;

		if (obj instanceof MessageOfOperation) {
			MessageOfOperation mdef = (MessageOfOperation) obj;

			if (
			// mdef.getName().equals(getName()) &&

			((mdef.getTypeStringValue() != null && mdef.getTypeStringValue()
					.equals(getTypeStringValue())) || ((mdef
					.getElementStringValue() != null && mdef
					.getElementStringValue().equals(getElementStringValue()))))
			// &&mdef.getClassification() == getClassification()
			) {
				ret = true;
			}
		}

		return (ret);
	}

	public boolean equals(Object obj) {
		boolean ret = false;

		if (obj instanceof MessageOfOperation) {
			MessageOfOperation mdef = (MessageOfOperation) obj;

			if (mdef.getName().equals(getName())
					&&

					((mdef.getTypeStringValue() != null && mdef
							.getTypeStringValue().equals(getTypeStringValue())) || ((mdef
							.getElementStringValue() != null && mdef
							.getElementStringValue().equals(
									getElementStringValue()))))
					&& mdef.getClassification() == getClassification()) {
				ret = true;
			}
		}

		return (ret);
	}
}
