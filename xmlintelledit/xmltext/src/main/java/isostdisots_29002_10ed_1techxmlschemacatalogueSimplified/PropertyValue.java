/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getPropertyValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternPropertyRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternPropertyRef='self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface PropertyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Proprietary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Proprietary</em>' attribute.
	 * @see #setIsProprietary(boolean)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getPropertyValue_IsProprietary()
	 * @model
	 * @generated
	 */
	boolean isIsProprietary();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#isIsProprietary <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Proprietary</em>' attribute.
	 * @see #isIsProprietary()
	 * @generated
	 */
	void setIsProprietary(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getPropertyValue_PropertyRef()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

} // PropertyValue
