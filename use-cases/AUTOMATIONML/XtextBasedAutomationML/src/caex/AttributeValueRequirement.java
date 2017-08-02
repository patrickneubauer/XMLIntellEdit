/**
 */
package caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for definition of value requirements of an attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}</li>
 *   <li>{@link caex.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}</li>
 *   <li>{@link caex.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}</li>
 *   <li>{@link caex.AttributeValueRequirement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getAttributeValueRequirement()
 * @model
 * @generated
 */
public interface AttributeValueRequirement extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element of to define constraints of ordinal scaled attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #setOrdinalScaledType(OrdinalScaled)
	 * @see caex.CaexPackage#getAttributeValueRequirement_OrdinalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	OrdinalScaled getOrdinalScaledType();

	/**
	 * Sets the value of the '{@link caex.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal Scaled Type</em>' containment reference.
	 * @see #getOrdinalScaledType()
	 * @generated
	 */
	void setOrdinalScaledType(OrdinalScaled value);

	/**
	 * Returns the value of the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element of to define constraints of nominal scaled attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #setNominalScaledType(NominalScaled)
	 * @see caex.CaexPackage#getAttributeValueRequirement_NominalScaledType()
	 * @model containment="true"
	 * @generated
	 */
	NominalScaled getNominalScaledType();

	/**
	 * Sets the value of the '{@link caex.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Scaled Type</em>' containment reference.
	 * @see #getNominalScaledType()
	 * @generated
	 */
	void setNominalScaledType(NominalScaled value);

	/**
	 * Returns the value of the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define constraints for attribute values of an unknown scale type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unknown Type</em>' containment reference.
	 * @see #setUnknownType(UnknownType)
	 * @see caex.CaexPackage#getAttributeValueRequirement_UnknownType()
	 * @model containment="true"
	 * @generated
	 */
	UnknownType getUnknownType();

	/**
	 * Sets the value of the '{@link caex.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Type</em>' containment reference.
	 * @see #getUnknownType()
	 * @generated
	 */
	void setUnknownType(UnknownType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the name of the contraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see caex.CaexPackage#getAttributeValueRequirement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link caex.AttributeValueRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AttributeValueRequirement
