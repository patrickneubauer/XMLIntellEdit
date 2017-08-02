/**
 */
package tosca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Upper Bound Type Member11</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage#getUpperBoundTypeMember11()
 * @model extendedMetaData="name='upperBound_._1_._type_._member_._1'"
 * @generated
 */
public enum UpperBoundTypeMember11 implements Enumerator {
	/**
	 * The '<em><b>Unbounded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBOUNDED_VALUE
	 * @generated
	 * @ordered
	 */
	UNBOUNDED(0, "unbounded", "unbounded");

	/**
	 * The '<em><b>Unbounded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unbounded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNBOUNDED
	 * @model name="unbounded"
	 * @generated
	 * @ordered
	 */
	public static final int UNBOUNDED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Upper Bound Type Member11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UpperBoundTypeMember11[] VALUES_ARRAY =
		new UpperBoundTypeMember11[] {
			UNBOUNDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Upper Bound Type Member11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UpperBoundTypeMember11> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Upper Bound Type Member11</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpperBoundTypeMember11 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpperBoundTypeMember11 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Upper Bound Type Member11</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpperBoundTypeMember11 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpperBoundTypeMember11 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Upper Bound Type Member11</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UpperBoundTypeMember11 get(int value) {
		switch (value) {
			case UNBOUNDED_VALUE: return UNBOUNDED;
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
	private UpperBoundTypeMember11(int value, String name, String literal) {
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
	
} //UpperBoundTypeMember11
