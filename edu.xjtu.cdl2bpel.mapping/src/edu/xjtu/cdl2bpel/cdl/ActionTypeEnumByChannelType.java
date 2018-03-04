/**
 * CDL2BPEL_XJTU
 *
 * $Id: ActionTypeEnumByChannelType.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Type Enum By Channel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActionTypeEnumByChannelType()
 * @model
 * @generated
 */
public enum ActionTypeEnumByChannelType implements Enumerator {
	/**
	 * The '<em><b>Request respond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_RESPOND_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_RESPOND(1, "Request_respond", "Request_respond"),

	/**
	 * The '<em><b>Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(2, "Request", "Request"),

	/**
	 * The '<em><b>Respond</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPOND_VALUE
	 * @generated
	 * @ordered
	 */
	RESPOND(3, "Respond", "Respond");

	/**
	 * The '<em><b>Request respond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request respond</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_RESPOND
	 * @model name="Request_respond"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_RESPOND_VALUE = 1;

	/**
	 * The '<em><b>Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model name="Request"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 2;

	/**
	 * The '<em><b>Respond</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Respond</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPOND
	 * @model name="Respond"
	 * @generated
	 * @ordered
	 */
	public static final int RESPOND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Action Type Enum By Channel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionTypeEnumByChannelType[] VALUES_ARRAY =
		new ActionTypeEnumByChannelType[] {
			REQUEST_RESPOND,
			REQUEST,
			RESPOND,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Type Enum By Channel Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionTypeEnumByChannelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Type Enum By Channel Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionTypeEnumByChannelType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionTypeEnumByChannelType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type Enum By Channel Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionTypeEnumByChannelType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionTypeEnumByChannelType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Type Enum By Channel Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionTypeEnumByChannelType get(int value) {
		switch (value) {
			case REQUEST_RESPOND_VALUE: return REQUEST_RESPOND;
			case REQUEST_VALUE: return REQUEST;
			case RESPOND_VALUE: return RESPOND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionTypeEnumByChannelType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActionTypeEnumByChannelType
