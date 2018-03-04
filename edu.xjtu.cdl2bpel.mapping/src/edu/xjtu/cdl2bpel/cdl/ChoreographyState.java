/**
 * CDL2BPEL_XJTU
 *
 * $Id: ChoreographyState.java,v 1.1 2011/02/21 06:24:04 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Choreography State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getChoreographyState()
 * @model
 * @generated
 */
public enum ChoreographyState implements Enumerator {
	/**
	 * The '<em><b>Unsuccessfully Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUCCESSFULLY_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUCCESSFULLY_COMPLETED(2, "UnsuccessfullyCompleted", "UnsuccessfullyCompleted"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(6, "Closed", "Closed"),

	/**
	 * The '<em><b>Successfully Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULLY_COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSFULLY_COMPLETED(1, "SuccessfullyCompleted", "SuccessfullyCompleted"),

	/**
	 * The '<em><b>Enabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLED(3, "Enabled", "Enabled"),

	/**
	 * The '<em><b>Actived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVED(5, "Actived", "Actived"),

	/**
	 * The '<em><b>Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(4, "Disabled", "Disabled");

	/**
	 * The '<em><b>Unsuccessfully Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsuccessfully Completed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUCCESSFULLY_COMPLETED
	 * @model name="UnsuccessfullyCompleted"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUCCESSFULLY_COMPLETED_VALUE = 2;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Closed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="Closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 6;

	/**
	 * The '<em><b>Successfully Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Successfully Completed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULLY_COMPLETED
	 * @model name="SuccessfullyCompleted"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSFULLY_COMPLETED_VALUE = 1;

	/**
	 * The '<em><b>Enabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLED
	 * @model name="Enabled"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLED_VALUE = 3;

	/**
	 * The '<em><b>Actived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Actived</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVED
	 * @model name="Actived"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVED_VALUE = 5;

	/**
	 * The '<em><b>Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model name="Disabled"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Choreography State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChoreographyState[] VALUES_ARRAY =
		new ChoreographyState[] {
			UNSUCCESSFULLY_COMPLETED,
			CLOSED,
			SUCCESSFULLY_COMPLETED,
			ENABLED,
			ACTIVED,
			DISABLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Choreography State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChoreographyState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Choreography State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChoreographyState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChoreographyState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Choreography State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChoreographyState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChoreographyState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Choreography State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChoreographyState get(int value) {
		switch (value) {
			case UNSUCCESSFULLY_COMPLETED_VALUE: return UNSUCCESSFULLY_COMPLETED;
			case CLOSED_VALUE: return CLOSED;
			case SUCCESSFULLY_COMPLETED_VALUE: return SUCCESSFULLY_COMPLETED;
			case ENABLED_VALUE: return ENABLED;
			case ACTIVED_VALUE: return ACTIVED;
			case DISABLED_VALUE: return DISABLED;
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
	private ChoreographyState(int value, String name, String literal) {
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
	
} //ChoreographyState
