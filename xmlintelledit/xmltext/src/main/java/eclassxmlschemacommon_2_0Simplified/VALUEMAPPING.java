/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VALUEMAPPING</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getSourceValue <em>Source Value</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getTargetValues <em>Target Values</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getVALUEMAPPING()
 * @model
 * @generated
 */
public interface VALUEMAPPING extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Value</em>' containment reference.
	 * @see #setSourceValue(VALUEREF)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getVALUEMAPPING_SourceValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VALUEREF getSourceValue();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getSourceValue <em>Source Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Value</em>' containment reference.
	 * @see #getSourceValue()
	 * @generated
	 */
	void setSourceValue(VALUEREF value);

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
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getVALUEMAPPING_TargetValue()
	 * @model containment="true"
	 * @generated
	 */
	VALUEREF getTargetValue();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getTargetValue <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' containment reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(VALUEREF value);

	/**
	 * Returns the value of the '<em><b>Target Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Values</em>' containment reference.
	 * @see #setTargetValues(TargetValues)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getVALUEMAPPING_TargetValues()
	 * @model containment="true"
	 * @generated
	 */
	TargetValues getTargetValues();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.VALUEMAPPING#getTargetValues <em>Target Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Values</em>' containment reference.
	 * @see #getTargetValues()
	 * @generated
	 */
	void setTargetValues(TargetValues value);

} // VALUEMAPPING
