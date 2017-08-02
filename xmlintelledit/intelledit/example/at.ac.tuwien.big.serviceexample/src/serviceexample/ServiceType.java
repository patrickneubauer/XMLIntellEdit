/**
 */
package serviceexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see serviceexample.ServiceexamplePackage#getServiceType()
 * @model
 * @generated
 */
public enum ServiceType implements Enumerator {
	/**
	 * The '<em><b>BESTEFFORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BESTEFFORT_VALUE
	 * @generated
	 * @ordered
	 */
	BESTEFFORT(0, "BESTEFFORT", "BESTEFFORT"),

	/**
	 * The '<em><b>WEAKCONTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAKCONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	WEAKCONTRACT(1, "WEAKCONTRACT", "WEAKCONTRACT"),

	/**
	 * The '<em><b>FAILSAFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILSAFE_VALUE
	 * @generated
	 * @ordered
	 */
	FAILSAFE(2, "FAILSAFE", "FAILSAFE"),

	/**
	 * The '<em><b>IMPORTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORTANT(3, "IMPORTANT", "IMPORTANT");

	/**
	 * The '<em><b>BESTEFFORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BESTEFFORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BESTEFFORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BESTEFFORT_VALUE = 0;

	/**
	 * The '<em><b>WEAKCONTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEAKCONTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAKCONTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEAKCONTRACT_VALUE = 1;

	/**
	 * The '<em><b>FAILSAFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILSAFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILSAFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILSAFE_VALUE = 2;

	/**
	 * The '<em><b>IMPORTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPORTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTANT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceType[] VALUES_ARRAY =
		new ServiceType[] {
			BESTEFFORT,
			WEAKCONTRACT,
			FAILSAFE,
			IMPORTANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceType get(int value) {
		switch (value) {
			case BESTEFFORT_VALUE: return BESTEFFORT;
			case WEAKCONTRACT_VALUE: return WEAKCONTRACT;
			case FAILSAFE_VALUE: return FAILSAFE;
			case IMPORTANT_VALUE: return IMPORTANT;
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
	private ServiceType(int value, String name, String literal) {
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
	
} //ServiceType
