/**
 * CDL2BPEL_XJTU
 *
 * $Id: ActivityStateEnumByActivity.java,v 1.1 2011/02/21 06:24:03 administrator Exp $
 */
package edu.xjtu.cdl2bpel.cdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity State Enum By Activity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.xjtu.cdl2bpel.cdl.CDLPackage#getActivityStateEnumByActivity()
 * @model
 * @generated
 */
public enum ActivityStateEnumByActivity implements Enumerator {
	/**
	 * The '<em><b>Actived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVED(1, "Actived", "Actived"),

	/**
	 * The '<em><b>Exceptioned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTIONED(2, "Exceptioned", "Exceptioned"),

	/**
	 * The '<em><b>Successed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSED(3, "Successed", "Successed");

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
	public static final int ACTIVED_VALUE = 1;

	/**
	 * The '<em><b>Exceptioned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exceptioned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTIONED
	 * @model name="Exceptioned"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTIONED_VALUE = 2;

	/**
	 * The '<em><b>Successed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Successed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESSED
	 * @model name="Successed"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Activity State Enum By Activity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityStateEnumByActivity[] VALUES_ARRAY =
		new ActivityStateEnumByActivity[] {
			ACTIVED,
			EXCEPTIONED,
			SUCCESSED,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity State Enum By Activity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityStateEnumByActivity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity State Enum By Activity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityStateEnumByActivity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityStateEnumByActivity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity State Enum By Activity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityStateEnumByActivity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityStateEnumByActivity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity State Enum By Activity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityStateEnumByActivity get(int value) {
		switch (value) {
			case ACTIVED_VALUE: return ACTIVED;
			case EXCEPTIONED_VALUE: return EXCEPTIONED;
			case SUCCESSED_VALUE: return SUCCESSED;
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
	private ActivityStateEnumByActivity(int value, String name, String literal) {
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
	
} //ActivityStateEnumByActivity
