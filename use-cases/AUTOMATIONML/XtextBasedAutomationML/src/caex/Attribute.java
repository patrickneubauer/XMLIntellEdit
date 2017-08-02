/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for attribute definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.Attribute#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link caex.Attribute#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link caex.Attribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.Attribute#getAttributeDataType <em>Attribute Data Type</em>}</li>
 *   <li>{@link caex.Attribute#getUnit <em>Unit</em>}</li>
 *   <li>{@link caex.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link caex.Attribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link caex.RefSemantic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a definition of a defined attribute, e. g. to an attribute in a standardized library, this allows the semantic definition of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Semantic</em>' containment reference list.
	 * @see caex.CaexPackage#getAttribute_RefSemantic()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSemantic> getRefSemantic();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link caex.AttributeValueRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to restrict the range of validity of a defined attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see caex.CaexPackage#getAttribute_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValueRequirement> getConstraint();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows the description of nested attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.CaexPackage#getAttribute_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the data type of the attribute using XML notation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #setAttributeDataType(String)
	 * @see caex.CaexPackage#getAttribute_AttributeDataType()
	 * @model dataType="caex.AttributeDataType"
	 * @generated
	 */
	String getAttributeDataType();

	/**
	 * Sets the value of the '{@link caex.Attribute#getAttributeDataType <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #getAttributeDataType()
	 * @generated
	 */
	void setAttributeDataType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the unit of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see caex.CaexPackage#getAttribute_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link caex.Attribute#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element describing the value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see caex.CaexPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link caex.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A predefined default value for an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see caex.CaexPackage#getAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link caex.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // Attribute
