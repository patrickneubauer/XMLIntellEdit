/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DICUNIT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getUnitRef <em>Unit Ref</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getStructuredRepresentation <em>Structured Representation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getStringRepresentation <em>String Representation</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICUNIT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternUnitRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternUnitRef='(self.unitRef=null) or self.unitRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.unitRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.unitRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface DICUNIT extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Ref</em>' attribute.
	 * @see #setUnitRef(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICUNIT_UnitRef()
	 * @model
	 * @generated
	 */
	String getUnitRef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getUnitRef <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Ref</em>' attribute.
	 * @see #getUnitRef()
	 * @generated
	 */
	void setUnitRef(String value);

	/**
	 * Returns the value of the '<em><b>Structured Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Representation</em>' containment reference.
	 * @see #setStructuredRepresentation(UNIT)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICUNIT_StructuredRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	UNIT getStructuredRepresentation();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getStructuredRepresentation <em>Structured Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Representation</em>' containment reference.
	 * @see #getStructuredRepresentation()
	 * @generated
	 */
	void setStructuredRepresentation(UNIT value);

	/**
	 * Returns the value of the '<em><b>String Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Representation</em>' containment reference.
	 * @see #setStringRepresentation(MATHEMATICALSTRING)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDICUNIT_StringRepresentation()
	 * @model containment="true"
	 * @generated
	 */
	MATHEMATICALSTRING getStringRepresentation();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT#getStringRepresentation <em>String Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Representation</em>' containment reference.
	 * @see #getStringRepresentation()
	 * @generated
	 */
	void setStringRepresentation(MATHEMATICALSTRING value);

} // DICUNIT
