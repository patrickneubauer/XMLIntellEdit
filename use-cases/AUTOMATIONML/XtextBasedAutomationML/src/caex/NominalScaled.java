/**
 */
package caex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.NominalScaled#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getNominalScaled()
 * @model
 * @generated
 */
public interface NominalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. It may be defined multiple times in order to define a discrete value range of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute.
	 * @see #setRequiredValue(String)
	 * @see caex.CaexPackage#getNominalScaled_RequiredValue()
	 * @model
	 * @generated
	 */
	String getRequiredValue();

	/**
	 * Sets the value of the '{@link caex.NominalScaled#getRequiredValue <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' attribute.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(String value);

} // NominalScaled
