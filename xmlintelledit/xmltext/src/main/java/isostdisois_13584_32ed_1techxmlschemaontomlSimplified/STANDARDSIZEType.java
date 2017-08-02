/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>STANDARDSIZE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSTANDARDSIZEType()
 * @model
 * @generated
 */
public enum STANDARDSIZEType implements Enumerator {
	/**
	 * The '<em><b>A6 Illustration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A6_ILLUSTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	A6_ILLUSTRATION(0, "a6Illustration", "a6_illustration"),

	/**
	 * The '<em><b>A9 Illustration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A9_ILLUSTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	A9_ILLUSTRATION(1, "a9Illustration", "a9_illustration");

	/**
	 * The '<em><b>A6 Illustration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A6 Illustration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A6_ILLUSTRATION
	 * @model name="a6Illustration" literal="a6_illustration"
	 * @generated
	 * @ordered
	 */
	public static final int A6_ILLUSTRATION_VALUE = 0;

	/**
	 * The '<em><b>A9 Illustration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A9 Illustration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A9_ILLUSTRATION
	 * @model name="a9Illustration" literal="a9_illustration"
	 * @generated
	 * @ordered
	 */
	public static final int A9_ILLUSTRATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>STANDARDSIZE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final STANDARDSIZEType[] VALUES_ARRAY =
		new STANDARDSIZEType[] {
			A6_ILLUSTRATION,
			A9_ILLUSTRATION,
		};

	/**
	 * A public read-only list of all the '<em><b>STANDARDSIZE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<STANDARDSIZEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>STANDARDSIZE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STANDARDSIZEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STANDARDSIZEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STANDARDSIZE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STANDARDSIZEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STANDARDSIZEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STANDARDSIZE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STANDARDSIZEType get(int value) {
		switch (value) {
			case A6_ILLUSTRATION_VALUE: return A6_ILLUSTRATION;
			case A9_ILLUSTRATION_VALUE: return A9_ILLUSTRATION;
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
	private STANDARDSIZEType(int value, String name, String literal) {
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
	
} //STANDARDSIZEType
