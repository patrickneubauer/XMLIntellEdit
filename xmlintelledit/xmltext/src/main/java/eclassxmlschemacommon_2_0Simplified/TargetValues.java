/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.TargetValues#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getTargetValues()
 * @model
 * @generated
 */
public interface TargetValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' containment reference.
	 * @see #setTargetValue(VALUEREF)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getTargetValues_TargetValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VALUEREF getTargetValue();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.TargetValues#getTargetValue <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' containment reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(VALUEREF value);

} // TargetValues
