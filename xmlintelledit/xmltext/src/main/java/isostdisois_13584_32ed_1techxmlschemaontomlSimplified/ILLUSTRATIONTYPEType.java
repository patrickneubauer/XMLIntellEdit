/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ILLUSTRATIONTYPE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getILLUSTRATIONTYPEType()
 * @model
 * @generated
 */
public enum ILLUSTRATIONTYPEType implements Enumerator {
	/**
	 * The '<em><b>SCHEMATICDRAWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEMATICDRAWING_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEMATICDRAWING(0, "SCHEMATICDRAWING", "SCHEMATIC_DRAWING"),

	/**
	 * The '<em><b>REALISTICPICTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALISTICPICTURE_VALUE
	 * @generated
	 * @ordered
	 */
	REALISTICPICTURE(1, "REALISTICPICTURE", "REALISTIC_PICTURE"),

	/**
	 * The '<em><b>NOTSTATICPICTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTSTATICPICTURE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTSTATICPICTURE(2, "NOTSTATICPICTURE", "NOT_STATIC_PICTURE");

	/**
	 * The '<em><b>SCHEMATICDRAWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHEMATICDRAWING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEMATICDRAWING
	 * @model literal="SCHEMATIC_DRAWING"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEMATICDRAWING_VALUE = 0;

	/**
	 * The '<em><b>REALISTICPICTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REALISTICPICTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALISTICPICTURE
	 * @model literal="REALISTIC_PICTURE"
	 * @generated
	 * @ordered
	 */
	public static final int REALISTICPICTURE_VALUE = 1;

	/**
	 * The '<em><b>NOTSTATICPICTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTSTATICPICTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTSTATICPICTURE
	 * @model literal="NOT_STATIC_PICTURE"
	 * @generated
	 * @ordered
	 */
	public static final int NOTSTATICPICTURE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ILLUSTRATIONTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ILLUSTRATIONTYPEType[] VALUES_ARRAY =
		new ILLUSTRATIONTYPEType[] {
			SCHEMATICDRAWING,
			REALISTICPICTURE,
			NOTSTATICPICTURE,
		};

	/**
	 * A public read-only list of all the '<em><b>ILLUSTRATIONTYPE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ILLUSTRATIONTYPEType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ILLUSTRATIONTYPE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ILLUSTRATIONTYPEType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ILLUSTRATIONTYPEType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ILLUSTRATIONTYPE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ILLUSTRATIONTYPEType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ILLUSTRATIONTYPEType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ILLUSTRATIONTYPE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ILLUSTRATIONTYPEType get(int value) {
		switch (value) {
			case SCHEMATICDRAWING_VALUE: return SCHEMATICDRAWING;
			case REALISTICPICTURE_VALUE: return REALISTICPICTURE;
			case NOTSTATICPICTURE_VALUE: return NOTSTATICPICTURE;
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
	private ILLUSTRATIONTYPEType(int value, String name, String literal) {
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
	
} //ILLUSTRATIONTYPEType
