/**
 * CDL2BPEL_XJTU
 *
 * $Id: Package.java,v 1.1 2011/02/21 06:24:05 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getAuthor <em>Author</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getInformationTypes <em>Information Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getTokens <em>Tokens</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getTokenLocators <em>Token Locators</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getRelationshipTypes <em>Relationship Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getParticipantTypes <em>Participant Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getChannelTypes <em>Channel Types</em>}</li>
 *   <li>{@link edu.xjtu.cdl2bpel.cdl.Package#getChoreographies <em>Choreographies</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends CDLElement {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Package#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_TargetNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link edu.xjtu.cdl2bpel.cdl.Package#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Namespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_Namespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Information Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.InformationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_InformationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InformationType> getInformationTypes();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Token Locators</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.TokenLocator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Locators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Locators</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_TokenLocators()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenLocator> getTokenLocators();

	/**
	 * Returns the value of the '<em><b>Role Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_RoleTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleType> getRoleTypes();

	/**
	 * Returns the value of the '<em><b>Relationship Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_RelationshipTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationshipType> getRelationshipTypes();

	/**
	 * Returns the value of the '<em><b>Participant Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.ParticipantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_ParticipantTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParticipantType> getParticipantTypes();

	/**
	 * Returns the value of the '<em><b>Channel Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.ChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Types</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_ChannelTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelType> getChannelTypes();

	/**
	 * Returns the value of the '<em><b>Choreographies</b></em>' containment reference list.
	 * The list contents are of type {@link edu.xjtu.cdl2bpel.cdl.Choreography}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreographies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreographies</em>' containment reference list.
	 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getPackage_Choreographies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choreography> getChoreographies();
	
	/**
	 * Get the Token identified by param 'name'
	 * 
	 * @param name the name value of Token
	 * @return the token identified by name
	 */
	public Token getToken(String name);
	
	/**
	 * Get The URI by the Prefix value.
	 * 
	 * @param prefix the prefix value
	 * @return URI Value
	 */
	public String getURIFromPrefix(String prefix);

	/**
	 * Get the Prefix by the URI value
	 * 
	 * @param uri the URI Value
	 * @return Prefix value
	 */
    public String getPrefixFromURI(String namespace);
    
    /**
     * Get Choreography identified by name value
     * 
     * @param name the choreography's name value
     * @return Choreography identified by name
     */
    public Choreography getChoreography(String name);
    
    /**
     * Get RoleType identified by name value
     * 
     * @param name the roleType's name value
     * @return RoleType identified by name
     */
    public RoleType getRoleType(String name);

    /**
     * Get RelationshipType by name value
     * 
     * @param name the relationshipType's name value
     * @return RelationshipType identified by name
     */
	public RelationshipType getRelationshipType(String name);

	/**
	 * Get ParticipantType by name value
	 * 
	 * @param name the participantType's name value
	 * @return ParticipantType identified by name
	 */
	public ParticipantType getParticipantType(String name);

	/**
	 * Get ChannelType by name value
	 * 
	 * @param name the channelType's name value
	 * @return ChannelType identified by name
	 */
	public ChannelType getChannelType(String name);
	
	/**
	 * Get TokenLocator by name value
	 * 
	 * @param token the tokenLocator's token value
	 * @param infoType the tokenLocator's infomationType value
	 * @return TokenLocator identified by token,infoType values.
	 */
	public TokenLocator getTokenLocator(String token, InformationType infoType);

} // Package
