/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMCode <em>UOM Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMRef <em>UOM Ref</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternUOMRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternUOMRef='(self.uOMRef=null) or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface MeasureValue extends EObject {
	/**
	 * Returns the value of the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UOM Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UOM Code</em>' attribute.
	 * @see #setUOMCode(String)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureValue_UOMCode()
	 * @model
	 * @generated
	 */
	String getUOMCode();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMCode <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UOM Code</em>' attribute.
	 * @see #getUOMCode()
	 * @generated
	 */
	void setUOMCode(String value);

	/**
	 * Returns the value of the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UOM Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UOM Ref</em>' attribute.
	 * @see #setUOMRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureValue_UOMRef()
	 * @model
	 * @generated
	 */
	String getUOMRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMRef <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UOM Ref</em>' attribute.
	 * @see #getUOMRef()
	 * @generated
	 */
	void setUOMRef(String value);

} // MeasureValue
