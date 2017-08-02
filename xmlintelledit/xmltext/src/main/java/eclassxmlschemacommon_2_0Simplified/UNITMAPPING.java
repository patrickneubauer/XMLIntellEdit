/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UNITMAPPING</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.UNITMAPPING#getSourceUnit <em>Source Unit</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.UNITMAPPING#getTargetUnit <em>Target Unit</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getUNITMAPPING()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternSourceUnit patternTargetUnit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternSourceUnit='self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.sourceUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternTargetUnit='self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.targetUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface UNITMAPPING extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Unit</em>' attribute.
	 * @see #setSourceUnit(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getUNITMAPPING_SourceUnit()
	 * @model required="true"
	 * @generated
	 */
	String getSourceUnit();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.UNITMAPPING#getSourceUnit <em>Source Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Unit</em>' attribute.
	 * @see #getSourceUnit()
	 * @generated
	 */
	void setSourceUnit(String value);

	/**
	 * Returns the value of the '<em><b>Target Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Unit</em>' attribute.
	 * @see #setTargetUnit(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getUNITMAPPING_TargetUnit()
	 * @model required="true"
	 * @generated
	 */
	String getTargetUnit();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.UNITMAPPING#getTargetUnit <em>Target Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Unit</em>' attribute.
	 * @see #getTargetUnit()
	 * @generated
	 */
	void setTargetUnit(String value);

} // UNITMAPPING
