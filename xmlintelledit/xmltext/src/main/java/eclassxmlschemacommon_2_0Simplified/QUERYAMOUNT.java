/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QUERYAMOUNT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT#getAlternativeUnit <em>Alternative Unit</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getQUERYAMOUNT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternAlternativeUnit patternBaseUnit'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternAlternativeUnit='(self.alternativeUnit=null) or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.alternativeUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternBaseUnit='self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.baseUnit.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface QUERYAMOUNT extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternative Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Unit</em>' attribute.
	 * @see #setAlternativeUnit(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getQUERYAMOUNT_AlternativeUnit()
	 * @model
	 * @generated
	 */
	String getAlternativeUnit();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT#getAlternativeUnit <em>Alternative Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Unit</em>' attribute.
	 * @see #getAlternativeUnit()
	 * @generated
	 */
	void setAlternativeUnit(String value);

	/**
	 * Returns the value of the '<em><b>Base Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Unit</em>' attribute.
	 * @see #setBaseUnit(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getQUERYAMOUNT_BaseUnit()
	 * @model required="true"
	 * @generated
	 */
	String getBaseUnit();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT#getBaseUnit <em>Base Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Unit</em>' attribute.
	 * @see #getBaseUnit()
	 * @generated
	 */
	void setBaseUnit(String value);

} // QUERYAMOUNT
