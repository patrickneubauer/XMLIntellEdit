/**
 */
package caex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link caex.OrdinalScaled#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link caex.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getOrdinalScaled()
 * @model
 * @generated
 */
public interface OrdinalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a maximum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Max Value</em>' attribute.
	 * @see #setRequiredMaxValue(String)
	 * @see caex.CaexPackage#getOrdinalScaled_RequiredMaxValue()
	 * @model
	 * @generated
	 */
	String getRequiredMaxValue();

	/**
	 * Sets the value of the '{@link caex.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Max Value</em>' attribute.
	 * @see #getRequiredMaxValue()
	 * @generated
	 */
	void setRequiredMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute.
	 * @see #setRequiredValue(String)
	 * @see caex.CaexPackage#getOrdinalScaled_RequiredValue()
	 * @model
	 * @generated
	 */
	String getRequiredValue();

	/**
	 * Sets the value of the '{@link caex.OrdinalScaled#getRequiredValue <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' attribute.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a minimum value of an attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Min Value</em>' attribute.
	 * @see #setRequiredMinValue(String)
	 * @see caex.CaexPackage#getOrdinalScaled_RequiredMinValue()
	 * @model
	 * @generated
	 */
	String getRequiredMinValue();

	/**
	 * Sets the value of the '{@link caex.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Min Value</em>' attribute.
	 * @see #getRequiredMinValue()
	 * @generated
	 */
	void setRequiredMinValue(String value);

} // OrdinalScaled
