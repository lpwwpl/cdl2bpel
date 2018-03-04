/**
 * CDL2BPEL_XJTU
 *
 * $Id: CDLElement.java,v 1.1 2011/02/21 06:24:03 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import java.util.List;

import org.dom4j.Element;
import org.eclipse.emf.ecore.EObject;

import edu.xjtu.cdl2bpel.cdl2orchestra.AbstractCDL2OrchestraProjector;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getDescription <em>Description
 * </em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getName <em>Name</em>}</li>
 * <li>{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getAddition <em>Addition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCDLElement()
 * @model abstract="true"
 * @generated
 */
public interface CDLElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCDLElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '
	 * {@link edu.xjtu.cdl2bpel.cdl.CDLElement#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCDLElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.CDLElement#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Addition</em>' attribute.
	 * @see #setAddition(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getCDLElement_Addition()
	 * @model
	 * @generated
	 */
	String getAddition();

	/**
	 * Sets the value of the '
	 * {@link edu.xjtu.cdl2bpel.cdl.CDLElement#getAddition <em>Addition</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Addition</em>' attribute.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(String value);

	/**
	 * Parsing The XML Segment of CDLElement by deep traversal
	 * 
	 * @param elem the XML value of Current CDLElement
	 */
	public void resolveTheCDLElementByElement(Element elem);

	/**
	 * New and Return the sub CDLElement of the current CDLElement 
	 * 
	 * @param elem the XML segment of CDLElement   
	 */
	public CDLElement newSubCDLElementObject(Element elem);

	/**
	 * Get the belonged CDL Package
	 * 
	 * @return the belonged CDL Package
	 */
	public Package getBelongedPackage();

	/**
	 * Get the cdlElement from the list of the the cdlElement identified by the
	 * name value.
	 * 
	 * @param name
	 *            the name value of CDLElement
	 * @param list
	 *            the cdlElement list
	 * @return the cdlElement which the name value equals to the parameter
	 *         'name'
	 */
	public CDLElement getCDLElementByTheNameAttribute(String name, List list);

	/**
	 * Get the belonged Choreography of the current cdlElement
	 * 
	 * @return the belonged CDL Choreography
	 */
	public Choreography getBelongedChoreography();

	/**
	 * 
	 * @param visitor
	 */
	public void accept(AbstractCDL2OrchestraProjector visitor);

	/**
	 * Return the boolean value of whether CDLElement is relevant with the
	 * roleType
	 * 
	 * @param roleType
	 * @return the value of whether CDLElement is relevant with the roleType
	 */
	public boolean isRelevantWithTheRoleType(RoleType roleType);

	/**
	 * Used for checking whether the CDLElement is relevant with the RoleGroup
	 * Matrix
	 * 
	 * @param roleGroup
	 *            the roleType matrix
	 * @return the boolean value whether CDLElement is relevant with the
	 *         roleGroup
	 */
	public boolean isRelevantWithTheRoleGroup(RoleType[] roleGroup);

	/**
	 * Used for initializing attribute values of CDLElement when parsing CDL
	 * document If a cdlElement attribute reference another cdlElement which is
	 * defined in the following XML segment,we must set attribute of the
	 * referenced cdlElement,then after the referenced cdlElement be parsing and
	 * recognized,we set the referenced cdlElement value in real of the
	 * cdlElement.
	 */
	public void doSomething();

	/**
	 * Used for get the sub cdlElement which is the child of CDLElement when
	 * parsing CDL XML document
	 * 
	 * @return the sub CDLElement
	 */
	public CDLElement getTheSubCDLElement();

	/**
	 * 
	 * @return
	 */
	public RoleType[] getRoleTypesMatrixFromTheContext();

	/**
	 * 
	 * @param roleTypeName
	 * @return
	 */
	public boolean isInterrelatedWithRoleTypeMatrixFromTheContext(
			String roleTypeName);

	/**
	 * 
	 * @param roleType
	 * @return
	 */
	public boolean isInterrelatedWithRoleType(RoleType roleType);

	/**
	 * Get the parent CDLElement of current CDLElement
	 * 
	 * @return the parent CDLElement of the current cdlElement
	 */
	public CDLElement getParent();
	
	public boolean isGroupingConstruct();
	
	public boolean isConditionalGroupingConstruct();
	
	public boolean isSequentialGroupingConstruct();

	// public void tranform2wsdl(ExtractCDLInfo2WSDLInfo visitor);
} // CDLElement
